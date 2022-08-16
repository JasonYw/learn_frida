package anet.channel.p026e;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: anet.channel.e.a */
/* loaded from: classes2.dex */
public class C0493a {

    /* renamed from: a */
    public static C0495b f20479a;

    /* renamed from: b */
    public static String f20480b;

    /* renamed from: f */
    public static SharedPreferences f20484f;

    /* renamed from: c */
    public static AtomicBoolean f20481c = new AtomicBoolean(false);

    /* renamed from: d */
    public static AtomicBoolean f20482d = new AtomicBoolean(false);

    /* renamed from: e */
    public static long f20483e = 21600000;

    /* renamed from: g */
    public static IStrategyFilter f20485g = new C0496b();

    /* renamed from: h */
    public static AtomicInteger f20486h = new AtomicInteger(1);

    /* renamed from: i */
    public static IStrategyListener f20487i = new C0497c();

    /* renamed from: j */
    public static NetworkStatusHelper.INetworkStatusChangeListener f20488j = new C0498d();

    /* renamed from: anet.channel.e.a$a */
    /* loaded from: classes2.dex */
    public static class C0494a {

        /* renamed from: a */
        public long f20489a;

        /* renamed from: b */
        public boolean f20490b;

        static {
            Covode.recordClassIndex(2188);
        }

        public C0494a() {
        }

        public /* synthetic */ C0494a(C0496b c0496b) {
            this();
        }
    }

    /* renamed from: anet.channel.e.a$b */
    /* loaded from: classes2.dex */
    public static class C0495b {

        /* renamed from: a */
        public Map<String, C0494a> f20491a = new ConcurrentHashMap();

        static {
            Covode.recordClassIndex(2189);
        }

        public C0495b() {
            m21000a();
        }

        /* renamed from: a */
        private void m21000a() {
            MethodCollector.m14708i(38);
            String string = C0493a.f20484f.getString("networksdk_http3_history_records", null);
            if (TextUtils.isEmpty(string)) {
                MethodCollector.m14707o(38);
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    C0494a c0494a = new C0494a(null);
                    String string2 = jSONObject.getString("networkUniqueId");
                    c0494a.f20489a = jSONObject.getLong("time");
                    c0494a.f20490b = jSONObject.getBoolean("enable");
                    if (m20999a(c0494a.f20489a)) {
                        synchronized (this.f20491a) {
                            this.f20491a.put(string2, c0494a);
                        }
                    }
                }
                MethodCollector.m14707o(38);
            } catch (JSONException unused) {
                MethodCollector.m14707o(38);
            }
        }

        /* renamed from: a */
        private boolean m20999a(long j) {
            if (System.currentTimeMillis() - j < C0493a.f20483e) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public boolean m20998a(String str) {
            MethodCollector.m14708i(39);
            synchronized (this.f20491a) {
                try {
                    C0494a c0494a = this.f20491a.get(str);
                    boolean z = true;
                    if (c0494a == null) {
                        MethodCollector.m14707o(39);
                        return true;
                    }
                    if (m20999a(c0494a.f20489a)) {
                        z = false;
                    }
                    MethodCollector.m14707o(39);
                    return z;
                } catch (Throwable th) {
                    MethodCollector.m14707o(39);
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public boolean m20996b(String str) {
            MethodCollector.m14708i(41);
            synchronized (this.f20491a) {
                try {
                    C0494a c0494a = this.f20491a.get(str);
                    if (c0494a != null) {
                        boolean z = c0494a.f20490b;
                        MethodCollector.m14707o(41);
                        return z;
                    }
                    MethodCollector.m14707o(41);
                    return false;
                } catch (Throwable th) {
                    MethodCollector.m14707o(41);
                    throw th;
                }
            }
        }

        /* renamed from: a */
        public void m20997a(String str, boolean z) {
            MethodCollector.m14708i(40);
            C0494a c0494a = new C0494a(null);
            c0494a.f20490b = z;
            c0494a.f20489a = System.currentTimeMillis();
            JSONArray jSONArray = new JSONArray();
            synchronized (this.f20491a) {
                try {
                    this.f20491a.put(str, c0494a);
                    for (Map.Entry<String, C0494a> entry : this.f20491a.entrySet()) {
                        String key = entry.getKey();
                        C0494a value = entry.getValue();
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("networkUniqueId", key);
                            jSONObject.put("time", value.f20489a);
                            jSONObject.put("enable", value.f20490b);
                            jSONArray.put(jSONObject);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(40);
                    throw th;
                }
            }
            C0493a.f20484f.edit().putString("networksdk_http3_history_records", jSONArray.toString()).apply();
            MethodCollector.m14707o(40);
        }
    }

    /* renamed from: b */
    public static boolean m21007b() {
        C0495b c0495b = f20479a;
        if (c0495b != null) {
            return c0495b.m20996b(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()));
        }
        return false;
    }

    static {
        Covode.recordClassIndex(2187);
    }

    /* renamed from: a */
    public static void m21013a() {
        try {
            ALog.m20786e("awcn.Http3ConnDetector", "registerListener", null, "http3Enable", Boolean.valueOf(AwcnConfig.isHttp3Enable()));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(GlobalAppRuntimeInfo.getContext());
            f20484f = defaultSharedPreferences;
            f20480b = defaultSharedPreferences.getString("http3_detector_host", "");
            m21011a(NetworkStatusHelper.getStatus());
            NetworkStatusHelper.addStatusChangeListener(f20488j);
            StrategyCenter.getInstance().registerListener(f20487i);
        } catch (Exception e) {
            ALog.m20787e("awcn.Http3ConnDetector", "[registerListener]error", null, e, new Object[0]);
        }
    }

    /* renamed from: b */
    public static IConnStrategy m21006b(IConnStrategy iConnStrategy) {
        return new C0501g(iConnStrategy);
    }

    /* renamed from: a */
    public static void m21012a(long j) {
        if (j < 0) {
            return;
        }
        f20483e = j;
    }

    /* renamed from: a */
    public static void m21008a(boolean z) {
        C0495b c0495b = f20479a;
        if (c0495b != null) {
            c0495b.m20997a(NetworkStatusHelper.getUniqueId(NetworkStatusHelper.getStatus()), z);
        }
    }

    /* renamed from: a */
    public static void m21011a(NetworkStatusHelper.NetworkStatus networkStatus) {
        if (!AwcnConfig.isHttp3Enable()) {
            ALog.m20785i("awcn.Http3ConnDetector", "startDetect", null, "http3 global config close.");
        } else if (f20482d.get()) {
            ALog.m20786e("awcn.Http3ConnDetector", "tnet exception.", null, new Object[0]);
        } else if (!NetworkStatusHelper.isConnected()) {
        } else {
            if (TextUtils.isEmpty(f20480b)) {
                ALog.m20786e("awcn.Http3ConnDetector", "startDetect", null, "host is null");
                return;
            }
            List<IConnStrategy> connStrategyListByHost = StrategyCenter.getInstance().getConnStrategyListByHost(f20480b, f20485g);
            if (connStrategyListByHost.isEmpty()) {
                ALog.m20786e("awcn.Http3ConnDetector", "startDetect", null, "http3 strategy is null.");
                return;
            }
            if (f20481c.compareAndSet(false, true)) {
                try {
                    long currentTimeMillis = System.currentTimeMillis();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).InitializeSecurityStuff();
                    ALog.m20786e("awcn.Http3ConnDetector", "tnet init http3.", null, "cost", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                } catch (Throwable th) {
                    ALog.m20787e("awcn.Http3ConnDetector", "tnet init http3 error.", null, th, new Object[0]);
                    f20482d.set(true);
                    return;
                }
            }
            if (f20479a == null) {
                f20479a = new C0495b();
            }
            if (!f20479a.m20998a(NetworkStatusHelper.getUniqueId(networkStatus))) {
                return;
            }
            ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0499e(connStrategyListByHost, networkStatus));
        }
    }
}
