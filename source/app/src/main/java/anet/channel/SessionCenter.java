package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.detect.C0491n;
import anet.channel.entity.C0504c;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.p026e.C0493a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.AmdcRuntimeInfo;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C0587Utils;
import anet.channel.util.C0596i;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import p002O.C0002O;

/* loaded from: classes2.dex */
public class SessionCenter {

    /* renamed from: a */
    public static Map<Config, SessionCenter> f20371a = new HashMap();

    /* renamed from: j */
    public static boolean f20372j = false;

    /* renamed from: c */
    public String f20374c;

    /* renamed from: d */
    public Config f20375d;

    /* renamed from: e */
    public final C0492e f20376e = new C0492e();

    /* renamed from: f */
    public final LruCache<String, SessionRequest> f20377f = new LruCache<>(32);

    /* renamed from: g */
    public final C0472c f20378g = new C0472c();

    /* renamed from: i */
    public final C0456a f20380i = new C0456a(this, null);

    /* renamed from: b */
    public Context f20373b = GlobalAppRuntimeInfo.getContext();

    /* renamed from: h */
    public final AccsSessionManager f20379h = new AccsSessionManager(this);

    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.f20379h.forceCloseSession(true);
    }

    /* renamed from: anet.channel.SessionCenter$a */
    /* loaded from: classes2.dex */
    public class C0456a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* renamed from: a */
        public boolean f20381a;

        static {
            Covode.recordClassIndex(2140);
        }

        /* renamed from: a */
        public void m21077a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        /* renamed from: b */
        public void m21076b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            ALog.m20785i("awcn.SessionCenter", "[background]", SessionCenter.this.f20374c, new Object[0]);
            if (!SessionCenter.f20372j) {
                ALog.m20786e("awcn.SessionCenter", "background not inited!", SessionCenter.this.f20374c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (AwcnConfig.isAccsSessionCreateForbiddenInBg() && "OPPO".equalsIgnoreCase(Build.BRAND)) {
                    ALog.m20785i("awcn.SessionCenter", "close session for OPPO", SessionCenter.this.f20374c, new Object[0]);
                    SessionCenter.this.f20379h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void forground() {
            ALog.m20785i("awcn.SessionCenter", "[forground]", SessionCenter.this.f20374c, new Object[0]);
            if (SessionCenter.this.f20373b == null || this.f20381a) {
                return;
            }
            this.f20381a = true;
            if (!SessionCenter.f20372j) {
                ALog.m20786e("awcn.SessionCenter", "forground not inited!", SessionCenter.this.f20374c, new Object[0]);
                return;
            }
            try {
                try {
                    if (AppLifecycle.lastEnterBackgroundTime != 0 && System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime > 60000) {
                        SessionCenter.this.f20379h.forceCloseSession(true);
                    } else {
                        SessionCenter.this.f20379h.checkAndStartSession();
                    }
                } catch (Exception unused) {
                }
                this.f20381a = false;
            } catch (Exception unused2) {
            }
        }

        public C0456a() {
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(C0568l.C0572d c0572d) {
            SessionCenter.this.m21083a(c0572d);
            SessionCenter.this.f20379h.checkAndStartSession();
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.m20786e("awcn.SessionCenter", "onNetworkStatusChanged.", SessionCenter.this.f20374c, "networkStatus", networkStatus);
            List<SessionRequest> m21019a = SessionCenter.this.f20376e.m21019a();
            if (!m21019a.isEmpty()) {
                for (SessionRequest sessionRequest : m21019a) {
                    ALog.m20788d("awcn.SessionCenter", "network change, try recreate session", SessionCenter.this.f20374c, new Object[0]);
                    sessionRequest.m21065a((String) null);
                }
            }
            SessionCenter.this.f20379h.checkAndStartSession();
        }

        public /* synthetic */ C0456a(SessionCenter sessionCenter, C0475d c0475d) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(2139);
    }

    public static void checkAndStartAccsSession() {
        for (SessionCenter sessionCenter : f20371a.values()) {
            sessionCenter.f20379h.checkAndStartSession();
        }
    }

    public static synchronized SessionCenter getInstance() {
        Context appContext;
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(17);
            if (!f20372j && (appContext = C0587Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry<Config, SessionCenter> entry : f20371a.entrySet()) {
                sessionCenter = entry.getValue();
                if (entry.getKey() != Config.DEFAULT_CONFIG) {
                    MethodCollector.m14707o(17);
                    return sessionCenter;
                }
            }
            MethodCollector.m14707o(17);
            return sessionCenter;
        }
    }

    public void registerAccsSessionListener(ISessionListener iSessionListener) {
        this.f20379h.registerListener(iSessionListener);
    }

    public void unregisterAccsSessionListener(ISessionListener iSessionListener) {
        this.f20379h.unregisterListener(iSessionListener);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.f20378g.m21047a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.f20379h.checkAndStartSession();
        }
    }

    public synchronized void switchEnv(ENV env) {
        MethodCollector.m14708i(13);
        switchEnvironment(env);
        MethodCollector.m14707o(13);
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo m21046a = this.f20378g.m21046a(str);
        if (m21046a != null && m21046a.isKeepAlive) {
            this.f20379h.checkAndStartSession();
        }
    }

    /* renamed from: a */
    private SessionRequest m21082a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String scheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            scheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, scheme);
        }
        return m21080a(StringUtils.concatString(scheme, "://", cNameByHost));
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        Context appContext;
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(16);
            if (config != null) {
                if (!f20372j && (appContext = C0587Utils.getAppContext()) != null) {
                    init(appContext);
                }
                sessionCenter = f20371a.get(config);
                if (sessionCenter == null) {
                    sessionCenter = new SessionCenter(config);
                    f20371a.put(config, sessionCenter);
                }
                MethodCollector.m14707o(16);
            } else {
                NullPointerException nullPointerException = new NullPointerException("config is null!");
                MethodCollector.m14707o(16);
                throw nullPointerException;
            }
        }
        return sessionCenter;
    }

    public SessionCenter(Config config) {
        this.f20375d = config;
        this.f20374c = config.getAppkey();
        this.f20380i.m21077a();
        if (!config.getAppkey().equals("[default]")) {
            AmdcRuntimeInfo.setSign(new C0475d(this, config.getAppkey(), config.getSecurity()));
        }
    }

    /* renamed from: a */
    private void m21084a(C0568l.C0570b c0570b) {
        for (Session session : this.f20376e.m21018a(m21080a(StringUtils.buildKey(c0570b.f20781c, c0570b.f20779a)))) {
            if (!StringUtils.isStringEqual(session.f20356l, c0570b.f20783e)) {
                ALog.m20785i("awcn.SessionCenter", "unit change", session.f20360p, "session unit", session.f20356l, "unit", c0570b.f20783e);
                session.close(true);
            }
        }
    }

    public static synchronized void init(Context context) {
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(9);
            if (context != null) {
                GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
                if (!f20372j) {
                    f20371a.put(Config.DEFAULT_CONFIG, new SessionCenter(Config.DEFAULT_CONFIG));
                    AppLifecycle.initialize();
                    NetworkStatusHelper.startListener(context);
                    if (!AwcnConfig.isTbNextLaunch()) {
                        StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                    }
                    if (GlobalAppRuntimeInfo.isTargetProcess()) {
                        C0491n.m21021a();
                        C0493a.m21013a();
                    }
                    f20372j = true;
                }
                MethodCollector.m14707o(9);
            } else {
                ALog.m20786e("awcn.SessionCenter", "context is null!", null, new Object[0]);
                NullPointerException nullPointerException = new NullPointerException("init failed. context is null");
                MethodCollector.m14707o(9);
                throw nullPointerException;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m21083a(C0568l.C0572d c0572d) {
        C0568l.C0570b[] c0570bArr;
        try {
            for (C0568l.C0570b c0570b : c0572d.f20794b) {
                if (c0570b.f20789k) {
                    m21079b(c0570b);
                }
                if (c0570b.f20783e != null) {
                    m21084a(c0570b);
                }
            }
        } catch (Exception e) {
            ALog.m20787e("awcn.SessionCenter", "checkStrategy failed", this.f20374c, e, new Object[0]);
        }
    }

    /* renamed from: b */
    private void m21079b(C0568l.C0570b c0570b) {
        boolean z;
        ALog.m20785i("awcn.SessionCenter", "find effectNow", this.f20374c, C1315c.f22208f, c0570b.f20779a);
        C0568l.C0569a[] c0569aArr = c0570b.f20786h;
        String[] strArr = c0570b.f20784f;
        for (Session session : this.f20376e.m21018a(m21080a(StringUtils.buildKey(c0570b.f20781c, c0570b.f20779a)))) {
            if (!session.getConnType().isHttpType()) {
                int i = 0;
                while (true) {
                    if (i < strArr.length) {
                        if (session.getIp().equals(strArr[i])) {
                            z = true;
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    if (ALog.isPrintLog(2)) {
                        ALog.m20785i("awcn.SessionCenter", "ip not match", session.f20360p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                    }
                    session.close(true);
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 < c0569aArr.length) {
                            if (session.getPort() != c0569aArr[i2].f20771a || !session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(c0569aArr[i2])))) {
                                i2++;
                            }
                        } else {
                            if (ALog.isPrintLog(2)) {
                                ALog.m20785i("awcn.SessionCenter", "aisle not match", session.f20360p, "port", Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(c0569aArr));
                            }
                            session.close(true);
                        }
                    }
                }
            }
        }
    }

    public static synchronized SessionCenter getInstance(String str) {
        SessionCenter sessionCenter;
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(15);
            Config configByTag = Config.getConfigByTag(str);
            if (configByTag != null) {
                sessionCenter = getInstance(configByTag);
                MethodCollector.m14707o(15);
            } else {
                RuntimeException runtimeException = new RuntimeException("tag not exist!");
                MethodCollector.m14707o(15);
                throw runtimeException;
            }
        }
        return sessionCenter;
    }

    public static synchronized void switchEnvironment(ENV env) {
        int i;
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(14);
            if (GlobalAppRuntimeInfo.getEnv() != env) {
                ALog.m20785i("awcn.SessionCenter", "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                GlobalAppRuntimeInfo.setEnv(env);
                StrategyCenter.getInstance().switchEnv();
                SpdyAgent spdyAgent = SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
                if (env == ENV.TEST) {
                    i = 0;
                } else {
                    i = 1;
                }
                spdyAgent.switchAccsServer(i);
            }
            Iterator<Map.Entry<Config, SessionCenter>> it = f20371a.entrySet().iterator();
            while (it.hasNext()) {
                SessionCenter value = it.next().getValue();
                if (value.f20375d.getEnv() != env) {
                    ALog.m20785i("awcn.SessionCenter", "remove instance", value.f20374c, "ENVIRONMENT", value.f20375d.getEnv());
                    value.f20379h.forceCloseSession(false);
                    value.f20380i.m21076b();
                    it.remove();
                }
            }
            MethodCollector.m14707o(14);
        }
    }

    /* renamed from: a */
    public SessionRequest m21080a(String str) {
        SessionRequest sessionRequest;
        MethodCollector.m14708i(18);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m14707o(18);
            return null;
        }
        synchronized (this.f20377f) {
            try {
                sessionRequest = this.f20377f.get(str);
                if (sessionRequest == null) {
                    sessionRequest = new SessionRequest(str, this);
                    this.f20377f.put(str, sessionRequest);
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(18);
                throw th;
            }
        }
        MethodCollector.m14707o(18);
        return sessionRequest;
    }

    public void registerPublicKey(String str, int i) {
        this.f20378g.m21045a(str, i);
    }

    public static synchronized void init(Context context, String str) {
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(10);
            init(context, str, GlobalAppRuntimeInfo.getEnv());
            MethodCollector.m14707o(10);
        }
    }

    public Session get(String str, long j) {
        return get(HttpUrl.parse(str), C0504c.f20507c, j);
    }

    public Session getThrowsException(String str, long j) {
        return m21081a(HttpUrl.parse(str), C0504c.f20507c, j, null);
    }

    public static synchronized void init(Context context, Config config) {
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(12);
            if (context != null) {
                if (config != null) {
                    init(context);
                    if (!f20371a.containsKey(config)) {
                        f20371a.put(config, new SessionCenter(config));
                    }
                    MethodCollector.m14707o(12);
                } else {
                    ALog.m20786e("awcn.SessionCenter", "paramter config is null!", null, new Object[0]);
                    NullPointerException nullPointerException = new NullPointerException("init failed. config is null");
                    MethodCollector.m14707o(12);
                    throw nullPointerException;
                }
            } else {
                ALog.m20786e("awcn.SessionCenter", "context is null!", null, new Object[0]);
                NullPointerException nullPointerException2 = new NullPointerException("init failed. context is null");
                MethodCollector.m14707o(12);
                throw nullPointerException2;
            }
        }
    }

    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) {
        int i;
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i = C0504c.f20505a;
        } else {
            i = C0504c.f20506b;
        }
        return get(httpUrl, i, j);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, long j) {
        return m21081a(httpUrl, i, j, null);
    }

    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) {
        int i;
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i = C0504c.f20505a;
        } else {
            i = C0504c.f20506b;
        }
        return m21081a(httpUrl, i, j, null);
    }

    public static synchronized void init(Context context, String str, ENV env) {
        synchronized (SessionCenter.class) {
            MethodCollector.m14708i(11);
            if (context != null) {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    Config.Builder builder = new Config.Builder();
                    builder.setAppkey(str);
                    builder.setEnv(env);
                    config = builder.build();
                }
                init(context, config);
                MethodCollector.m14707o(11);
            } else {
                ALog.m20786e("awcn.SessionCenter", "context is null!", null, new Object[0]);
                NullPointerException nullPointerException = new NullPointerException("init failed. context is null");
                MethodCollector.m14707o(11);
                throw nullPointerException;
            }
        }
    }

    public Session get(String str, ConnType.TypeLevel typeLevel, long j) {
        int i;
        HttpUrl parse = HttpUrl.parse(str);
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i = C0504c.f20505a;
        } else {
            i = C0504c.f20506b;
        }
        return get(parse, i, j);
    }

    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j) {
        int i;
        HttpUrl parse = HttpUrl.parse(str);
        if (typeLevel == ConnType.TypeLevel.SPDY) {
            i = C0504c.f20505a;
        } else {
            i = C0504c.f20506b;
        }
        return m21081a(parse, i, j, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable, anet.channel.Session] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [anet.channel.Session] */
    /* JADX WARN: Type inference failed for: r4v3, types: [anet.channel.Session] */
    /* JADX WARN: Type inference failed for: r4v4, types: [anet.channel.Session] */
    /* JADX WARN: Type inference failed for: r4v5, types: [anet.channel.Session] */
    /* JADX WARN: Type inference failed for: r4v6, types: [anet.channel.Session] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public Session get(HttpUrl httpUrl, int i, long j) {
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        try {
            r4 = m21081a(httpUrl, i, j, null);
            return r4;
        } catch (NoAvailStrategyException e) {
            ALog.m20785i("awcn.SessionCenter", C0002O.m25086C("[Get]", e.getMessage()), this.f20374c, new Object[]{r4, PushConstants.WEB_URL, httpUrl.urlString()});
            return r4;
        } catch (ConnectException e2) {
            ALog.m20786e("awcn.SessionCenter", "[Get]connect exception", this.f20374c, "errMsg", e2.getMessage(), PushConstants.WEB_URL, httpUrl.urlString());
            return r4;
        } catch (InvalidParameterException e3) {
            ALog.m20787e("awcn.SessionCenter", "[Get]param url is invalid", this.f20374c, e3, PushConstants.WEB_URL, httpUrl);
            return r4;
        } catch (TimeoutException e4) {
            ALog.m20787e("awcn.SessionCenter", "[Get]timeout exception", this.f20374c, e4, PushConstants.WEB_URL, httpUrl.urlString());
            return r4;
        } catch (Exception e5) {
            ALog.m20787e("awcn.SessionCenter", C0002O.m25086C("[Get]", e5.getMessage()), this.f20374c, r4, PushConstants.WEB_URL, httpUrl.urlString());
            return r4;
        }
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) {
        if (sessionGetCallback != null) {
            if (j > 0) {
                try {
                    m21078b(httpUrl, i, j, sessionGetCallback);
                    return;
                } catch (Exception unused) {
                    sessionGetCallback.onSessionGetFail();
                    return;
                }
            }
            throw new InvalidParameterException("timeout must > 0");
        }
        throw new NullPointerException("cb is null");
    }

    /* renamed from: a */
    public Session m21081a(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) {
        String str;
        SessionInfo m21044b;
        if (f20372j) {
            if (httpUrl != null) {
                String str2 = this.f20374c;
                Object[] objArr = new Object[6];
                objArr[0] = "u";
                objArr[1] = httpUrl.urlString();
                objArr[2] = "sessionType";
                if (i == C0504c.f20505a) {
                    str = "LongLink";
                } else {
                    str = "ShortLink";
                }
                objArr[3] = str;
                objArr[4] = "timeout";
                objArr[5] = Long.valueOf(j);
                ALog.m20788d("awcn.SessionCenter", "getInternal", str2, objArr);
                SessionRequest m21082a = m21082a(httpUrl);
                Session m21017a = this.f20376e.m21017a(m21082a, i);
                if (m21017a != null) {
                    ALog.m20788d("awcn.SessionCenter", "get internal hit cache session", this.f20374c, "session", m21017a);
                } else if (this.f20375d == Config.DEFAULT_CONFIG && i != C0504c.f20506b) {
                    if (sessionGetCallback != null) {
                        sessionGetCallback.onSessionGetFail();
                        return null;
                    }
                    return null;
                } else if (GlobalAppRuntimeInfo.isAppBackground() && i == C0504c.f20505a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (m21044b = this.f20378g.m21044b(httpUrl.host())) != null && m21044b.isAccs) {
                    ALog.m20783w("awcn.SessionCenter", "app background, forbid to create accs session", this.f20374c, new Object[0]);
                    throw new ConnectException("accs session connecting forbidden in background");
                } else {
                    m21082a.m21072a(this.f20373b, i, C0596i.m20754a(this.f20374c), sessionGetCallback, j);
                    if (sessionGetCallback == null && j > 0 && (i == C0504c.f20507c || m21082a.m21062b() == i)) {
                        m21082a.m21073a(j);
                        m21017a = this.f20376e.m21017a(m21082a, i);
                        if (m21017a == null) {
                            throw new ConnectException("session connecting failed or timeout");
                        }
                    }
                }
                return m21017a;
            }
            throw new InvalidParameterException("httpUrl is null");
        }
        ALog.m20786e("awcn.SessionCenter", "getInternal not inited!", this.f20374c, new Object[0]);
        throw new IllegalStateException("getInternal not inited");
    }

    /* renamed from: b */
    public void m21078b(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) {
        String str;
        SessionInfo m21044b;
        if (f20372j) {
            if (httpUrl != null) {
                if (sessionGetCallback != null) {
                    String str2 = this.f20374c;
                    Object[] objArr = new Object[6];
                    objArr[0] = "u";
                    objArr[1] = httpUrl.urlString();
                    objArr[2] = "sessionType";
                    if (i == C0504c.f20505a) {
                        str = "LongLink";
                    } else {
                        str = "ShortLink";
                    }
                    objArr[3] = str;
                    objArr[4] = "timeout";
                    objArr[5] = Long.valueOf(j);
                    ALog.m20788d("awcn.SessionCenter", "getInternal", str2, objArr);
                    SessionRequest m21082a = m21082a(httpUrl);
                    Session m21017a = this.f20376e.m21017a(m21082a, i);
                    if (m21017a != null) {
                        ALog.m20788d("awcn.SessionCenter", "get internal hit cache session", this.f20374c, "session", m21017a);
                        sessionGetCallback.onSessionGetSuccess(m21017a);
                        return;
                    } else if (this.f20375d == Config.DEFAULT_CONFIG && i != C0504c.f20506b) {
                        sessionGetCallback.onSessionGetFail();
                        return;
                    } else if (GlobalAppRuntimeInfo.isAppBackground() && i == C0504c.f20505a && AwcnConfig.isAccsSessionCreateForbiddenInBg() && (m21044b = this.f20378g.m21044b(httpUrl.host())) != null && m21044b.isAccs) {
                        ALog.m20783w("awcn.SessionCenter", "app background, forbid to create accs session", this.f20374c, new Object[0]);
                        throw new ConnectException("accs session connecting forbidden in background");
                    } else {
                        m21082a.m21061b(this.f20373b, i, C0596i.m20754a(this.f20374c), sessionGetCallback, j);
                        return;
                    }
                }
                throw new InvalidParameterException("sessionGetCallback is null");
            }
            throw new InvalidParameterException("httpUrl is null");
        }
        ALog.m20786e("awcn.SessionCenter", "getInternal not inited!", this.f20374c, new Object[0]);
        throw new IllegalStateException("getInternal not inited");
    }
}
