package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.entity.C0502a;
import anet.channel.entity.C0503b;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public abstract class Session implements Comparable<Session> {

    /* renamed from: v */
    public static ExecutorService f20344v = C116971W2r.LIZ();

    /* renamed from: a */
    public Context f20345a;

    /* renamed from: c */
    public String f20347c;

    /* renamed from: d */
    public String f20348d;

    /* renamed from: e */
    public String f20349e;

    /* renamed from: f */
    public String f20350f;

    /* renamed from: g */
    public int f20351g;

    /* renamed from: h */
    public String f20352h;

    /* renamed from: i */
    public int f20353i;

    /* renamed from: j */
    public ConnType f20354j;

    /* renamed from: k */
    public IConnStrategy f20355k;

    /* renamed from: m */
    public boolean f20357m;

    /* renamed from: o */
    public Runnable f20359o;

    /* renamed from: p */
    public final String f20360p;

    /* renamed from: q */
    public final SessionStatistic f20361q;

    /* renamed from: r */
    public int f20362r;

    /* renamed from: s */
    public int f20363s;

    /* renamed from: x */
    public Future<?> f20367x;

    /* renamed from: b */
    public Map<EventCb, Integer> f20346b = new LinkedHashMap();

    /* renamed from: w */
    public boolean f20366w = false;

    /* renamed from: l */
    public String f20356l = null;

    /* renamed from: n */
    public int f20358n = 6;

    /* renamed from: t */
    public boolean f20364t = false;

    /* renamed from: u */
    public boolean f20365u = true;

    /* renamed from: y */
    public List<Long> f20368y = null;

    /* renamed from: z */
    public long f20369z = 0;

    public abstract void close();

    public void connect() {
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public abstract boolean isAvailable();

    public void onDisconnect() {
    }

    public void ping(boolean z) {
    }

    public void ping(boolean z, int i) {
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i, byte[] bArr, int i2) {
    }

    public IConnStrategy getConnStrategy() {
        return this.f20355k;
    }

    public ConnType getConnType() {
        return this.f20354j;
    }

    public String getHost() {
        return this.f20347c;
    }

    public String getIp() {
        return this.f20349e;
    }

    public int getPort() {
        return this.f20351g;
    }

    public String getRealHost() {
        return this.f20348d;
    }

    public String getUnit() {
        return this.f20356l;
    }

    public void checkAvailable() {
        ping(true);
    }

    static {
        Covode.recordClassIndex(2137);
    }

    /* renamed from: a */
    public void m21088a() {
        Future<?> future;
        if (this.f20359o != null && (future = this.f20367x) != null) {
            future.cancel(true);
        }
    }

    /* renamed from: anet.channel.Session$a */
    /* loaded from: classes2.dex */
    public static class C0455a {

        /* renamed from: a */
        public static final String[] f20370a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        static {
            Covode.recordClassIndex(2138);
        }

        /* renamed from: a */
        public static String m21087a(int i) {
            return f20370a[i];
        }
    }

    public String toString() {
        return "Session@[" + this.f20360p + '|' + this.f20354j + LoggerUtil.M_RIGHT_TAG;
    }

    public void close(boolean z) {
        this.f20364t = z;
        close();
    }

    @Override // java.lang.Comparable
    public int compareTo(Session session) {
        return ConnType.compare(this.f20354j, session.f20354j);
    }

    public void setPingTimeout(int i) {
        if (this.f20359o == null) {
            this.f20359o = getRecvTimeOutRunnable();
        }
        m21088a();
        Runnable runnable = this.f20359o;
        if (runnable != null) {
            this.f20367x = ThreadPoolExecutorFactory.submitScheduledTask(runnable, i, TimeUnit.MILLISECONDS);
        }
    }

    public void handleCallbacks(int i, C0503b c0503b) {
        f20344v.submit(new RunnableC0465b(this, i, c0503b));
    }

    public void registerEventcb(int i, EventCb eventCb) {
        Map<EventCb, Integer> map = this.f20346b;
        if (map != null) {
            map.put(eventCb, Integer.valueOf(i));
        }
    }

    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        try {
            if (map.containsKey("x-switch-unit")) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, "x-switch-unit");
                if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    singleHeaderFieldByKey = null;
                }
                if (!StringUtils.isStringEqual(this.f20356l, singleHeaderFieldByKey)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f20369z > 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f20369z = currentTimeMillis;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public Session(Context context, C0502a c0502a) {
        boolean z = false;
        this.f20357m = false;
        this.f20345a = context;
        this.f20349e = c0502a.m20995a();
        this.f20350f = this.f20349e;
        this.f20351g = c0502a.m20994b();
        this.f20354j = c0502a.m20993c();
        this.f20347c = c0502a.m20990f();
        String str = this.f20347c;
        this.f20348d = str.substring(str.indexOf("://") + 3);
        this.f20363s = c0502a.m20991e();
        this.f20362r = c0502a.m20992d();
        this.f20355k = c0502a.f20497a;
        IConnStrategy iConnStrategy = this.f20355k;
        if (iConnStrategy != null && iConnStrategy.getIpType() == -1) {
            z = true;
        }
        this.f20357m = z;
        this.f20360p = c0502a.m20988h();
        this.f20361q = new SessionStatistic(c0502a);
        this.f20361q.host = this.f20348d;
    }

    public void handleResponseCode(Request request, int i) {
        MethodCollector.m14708i(8);
        if (!request.getHeaders().containsKey("x-pv")) {
            MethodCollector.m14707o(8);
        } else if (i >= 500 && i < 600) {
            synchronized (this) {
                try {
                    if (this.f20368y == null) {
                        this.f20368y = new LinkedList();
                    }
                    if (this.f20368y.size() < 5) {
                        this.f20368y.add(Long.valueOf(System.currentTimeMillis()));
                    } else {
                        long longValue = this.f20368y.remove(0).longValue();
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - longValue <= 60000) {
                            StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                            this.f20368y.clear();
                        } else {
                            this.f20368y.add(Long.valueOf(currentTimeMillis));
                        }
                    }
                } finally {
                    MethodCollector.m14707o(8);
                }
            }
        } else {
            MethodCollector.m14707o(8);
        }
    }

    public synchronized void notifyStatus(int i, C0503b c0503b) {
        MethodCollector.m14708i(7);
        ALog.m20786e("awcn.Session", "notifyStatus", this.f20360p, "status", C0455a.m21087a(i));
        if (i == this.f20358n) {
            ALog.m20785i("awcn.Session", "ignore notifyStatus", this.f20360p, new Object[0]);
            MethodCollector.m14707o(7);
            return;
        }
        this.f20358n = i;
        switch (this.f20358n) {
            case 0:
                handleCallbacks(1, c0503b);
                MethodCollector.m14707o(7);
                return;
            case 1:
                MethodCollector.m14707o(7);
                return;
            case 2:
                handleCallbacks(256, c0503b);
                MethodCollector.m14707o(7);
                return;
            case 3:
                MethodCollector.m14707o(7);
                return;
            case 4:
                this.f20356l = StrategyCenter.getInstance().getUnitByHost(this.f20348d);
                handleCallbacks(512, c0503b);
                MethodCollector.m14707o(7);
                return;
            case 5:
                handleCallbacks(AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END, c0503b);
                break;
            case 6:
                onDisconnect();
                if (!this.f20366w) {
                    handleCallbacks(2, c0503b);
                    MethodCollector.m14707o(7);
                    return;
                }
                break;
            case 7:
                MethodCollector.m14707o(7);
                return;
        }
        MethodCollector.m14707o(7);
    }

    public static void configTnetALog(Context context, String str, int i, int i2) {
        SpdyAgent spdyAgent = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (spdyAgent != null && SpdyAgent.checkLoadSucc()) {
            spdyAgent.configLogFile(str, i, i2);
        } else {
            ALog.m20786e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
        }
    }
}
