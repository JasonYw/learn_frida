package anet.channel.detect;

import android.text.TextUtils;
import android.util.Pair;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import org.android.netutil.NetUtils;
import org.android.netutil.PingEntry;
import org.android.netutil.PingResponse;
import org.android.netutil.PingTask;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;

/* loaded from: classes20.dex */
public class ExceptionDetector {

    /* renamed from: a */
    public long f20435a;

    /* renamed from: b */
    public String f20436b;

    /* renamed from: c */
    public String f20437c;

    /* renamed from: d */
    public String f20438d;

    /* renamed from: e */
    public LimitedQueue<Pair<String, Integer>> f20439e = new LimitedQueue<>(10);

    static {
        Covode.recordClassIndex(2169);
    }

    /* renamed from: a */
    public void m21041a() {
        NetworkStatusHelper.addStatusChangeListener(new C0478a(this));
    }

    /* renamed from: c */
    public boolean m21034c() {
        if (this.f20439e.size() != 10) {
            return false;
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.NO) {
            ALog.m20786e("anet.ExceptionDetector", "no network", null, new Object[0]);
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.f20435a) {
            return false;
        }
        Iterator it = this.f20439e.iterator();
        int i = 0;
        while (it.hasNext()) {
            int intValue = ((Integer) ((Pair) it.next()).second).intValue();
            if (intValue == -202 || intValue == -400 || intValue == -401 || intValue == -405 || intValue == -406) {
                i++;
            }
        }
        if (i * 2 <= 10) {
            return false;
        }
        this.f20435a = currentTimeMillis + 1800000;
        return true;
    }

    /* renamed from: b */
    public void m21035b() {
        String preferNextHop;
        Future future;
        ALog.m20786e("anet.ExceptionDetector", "network detect start.", null, new Object[0]);
        SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        NetworkStatusHelper.NetworkStatus status = NetworkStatusHelper.getStatus();
        jSONObject2.put("status", status.getType());
        jSONObject2.put("subType", NetworkStatusHelper.getNetworkSubType());
        if (status != NetworkStatusHelper.NetworkStatus.NO) {
            if (status.isMobile()) {
                jSONObject2.put("apn", NetworkStatusHelper.getApn());
                jSONObject2.put("carrier", NetworkStatusHelper.getCarrier());
            } else {
                jSONObject2.put("bssid", NetworkStatusHelper.getWifiBSSID());
                jSONObject2.put("ssid", NetworkStatusHelper.getWifiSSID());
            }
            jSONObject2.put("proxy", NetworkStatusHelper.getProxyType());
        }
        jSONObject.put("NetworkInfo", jSONObject2);
        if (status.isWifi()) {
            preferNextHop = NetUtils.getDefaultGateway("114.114.114.114");
        } else {
            preferNextHop = NetUtils.getPreferNextHop("114.114.114.114", 2);
        }
        if (!TextUtils.isEmpty(preferNextHop)) {
            future = new PingTask(preferNextHop, 1000, 3, 0, 0).launch();
        } else {
            future = null;
        }
        C0477a m21037a = m21037a("guide-acs.m.taobao.com", this.f20436b);
        C0477a m21037a2 = m21037a("gw.alicdn.com", this.f20438d);
        C0477a m21037a3 = m21037a("msgacs.m.taobao.com", this.f20437c);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("nextHop", preferNextHop);
        jSONObject3.put("ping", m21036a(future));
        jSONObject.put("LocalDetect", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(m21040a(m21037a));
        jSONArray.put(m21040a(m21037a2));
        jSONArray.put(m21040a(m21037a3));
        jSONObject.put("InternetDetect", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        Iterator it = this.f20439e.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            jSONObject4.put((String) pair.first, pair.second);
        }
        jSONObject.put("BizDetect", jSONObject4);
        this.f20439e.clear();
        ALog.m20786e("anet.ExceptionDetector", C0002O.m25086C("network detect result: ", jSONObject.toString()), null, new Object[0]);
    }

    /* renamed from: anet.channel.detect.ExceptionDetector$a */
    /* loaded from: classes20.dex */
    public class C0477a {

        /* renamed from: a */
        public String f20442a;

        /* renamed from: b */
        public String f20443b;

        /* renamed from: c */
        public String f20444c;

        /* renamed from: d */
        public Future f20445d;

        /* renamed from: e */
        public Future f20446e;

        /* renamed from: f */
        public Future f20447f;

        static {
            Covode.recordClassIndex(2171);
        }

        public C0477a() {
        }

        public /* synthetic */ C0477a(ExceptionDetector exceptionDetector, C0478a c0478a) {
            this();
        }
    }

    /* loaded from: classes8.dex */
    public class LimitedQueue<E> extends LinkedList<E> {

        /* renamed from: b */
        public int f20441b;

        static {
            Covode.recordClassIndex(2170);
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
        public boolean add(E e) {
            boolean add = super.add(e);
            if (add) {
                while (size() > this.f20441b) {
                    super.remove();
                }
            }
            return add;
        }

        public LimitedQueue(int i) {
            this.f20441b = i;
        }
    }

    /* renamed from: a */
    public void m21039a(RequestStatistic requestStatistic) {
        if (!AwcnConfig.isNetworkDetectEnable()) {
            ALog.m20785i("anet.ExceptionDetector", "network detect closed.", null, new Object[0]);
        } else {
            ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0480c(this, requestStatistic));
        }
    }

    /* renamed from: a */
    private JSONObject m21040a(C0477a c0477a) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (c0477a != null && c0477a.f20445d != null) {
            jSONObject.put(C1315c.f22208f, c0477a.f20442a);
            jSONObject.put("currentIp", c0477a.f20444c);
            jSONObject.put("localIp", c0477a.f20443b);
            jSONObject.put("ping", m21036a(c0477a.f20445d));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("1200", m21036a(c0477a.f20446e));
            jSONObject2.put("1460", m21036a(c0477a.f20447f));
            jSONObject.put("MTU", jSONObject2);
            if ("guide-acs.m.taobao.com".equals(c0477a.f20442a)) {
                if (!TextUtils.isEmpty(c0477a.f20444c)) {
                    str = c0477a.f20444c;
                } else {
                    str = c0477a.f20443b;
                }
                ArrayList<String> m21038a = m21038a(str, 5);
                JSONObject jSONObject3 = new JSONObject();
                int i = 0;
                while (i < m21038a.size()) {
                    int i2 = i + 1;
                    jSONObject3.put(String.valueOf(i2), m21038a.get(i));
                    i = i2;
                }
                jSONObject.put("traceRoute", jSONObject3);
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m21036a(Future future) {
        PingResponse pingResponse;
        PingEntry[] results;
        JSONObject jSONObject = new JSONObject();
        if (future == null) {
            return jSONObject;
        }
        try {
            pingResponse = (PingResponse) future.get();
        } catch (Exception unused) {
            pingResponse = null;
        }
        if (pingResponse == null) {
            return jSONObject;
        }
        jSONObject.put("errCode", pingResponse.getErrcode());
        JSONArray jSONArray = new JSONArray();
        for (PingEntry pingEntry : pingResponse.getResults()) {
            jSONArray.put("seq=" + pingEntry.seq + ",hop=" + pingEntry.hop + ",rtt=" + pingEntry.rtt);
        }
        jSONObject.put("response", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    private C0477a m21037a(String str, String str2) {
        String str3;
        C0477a c0477a = new C0477a(this, null);
        c0477a.f20442a = str;
        try {
            c0477a.f20443b = InetAddress.getByName(str).getHostAddress();
        } catch (UnknownHostException unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            c0477a.f20444c = str2;
        } else {
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(str);
            if (connStrategyListByHost != null && !connStrategyListByHost.isEmpty()) {
                c0477a.f20444c = connStrategyListByHost.get(0).getIp();
            }
        }
        if (!TextUtils.isEmpty(c0477a.f20444c)) {
            str3 = c0477a.f20444c;
        } else {
            str3 = c0477a.f20443b;
        }
        if (!TextUtils.isEmpty(str3)) {
            c0477a.f20445d = new PingTask(str3, 1000, 3, 0, 0).launch();
            c0477a.f20446e = new PingTask(str3, 1000, 3, 1172, 0).launch();
            c0477a.f20447f = new PingTask(str3, 1000, 3, 1432, 0).launch();
        }
        return c0477a;
    }

    /* renamed from: a */
    private ArrayList<String> m21038a(String str, int i) {
        PingResponse pingResponse;
        ArrayList<String> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i2 = 0;
        while (i2 < i) {
            i2++;
            try {
                pingResponse = (PingResponse) new PingTask(str, 0, 1, 0, i2).launch().get();
            } catch (Exception unused) {
                pingResponse = null;
            }
            StringBuilder sb = new StringBuilder();
            if (pingResponse != null) {
                String lastHopIPStr = pingResponse.getLastHopIPStr();
                double d = pingResponse.getResults()[0].rtt;
                int errcode = pingResponse.getErrcode();
                if (TextUtils.isEmpty(lastHopIPStr)) {
                    lastHopIPStr = "*";
                }
                sb.append("hop=");
                sb.append(lastHopIPStr);
                sb.append(",rtt=");
                sb.append(d);
                sb.append(",errCode=");
                sb.append(errcode);
            }
            arrayList.add(sb.toString());
        }
        return arrayList;
    }
}
