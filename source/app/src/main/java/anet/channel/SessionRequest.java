package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0502a;
import anet.channel.entity.C0504c;
import anet.channel.entity.ConnType;
import anet.channel.session.C0537d;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0579c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0590c;
import anet.channel.util.C0596i;
import anet.channel.util.HttpUrl;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class SessionRequest {

    /* renamed from: a */
    public SessionCenter f20383a;

    /* renamed from: b */
    public C0492e f20384b;

    /* renamed from: c */
    public SessionInfo f20385c;

    /* renamed from: d */
    public volatile boolean f20386d;

    /* renamed from: e */
    public volatile Session f20387e;

    /* renamed from: f */
    public volatile boolean f20388f;

    /* renamed from: i */
    public String f20391i;

    /* renamed from: j */
    public String f20392j;

    /* renamed from: k */
    public volatile Future f20393k;

    /* renamed from: g */
    public HashMap<SessionGetCallback, RunnableC0459c> f20389g = new HashMap<>();

    /* renamed from: h */
    public SessionConnStat f20390h = null;

    /* renamed from: l */
    public Object f20394l = new Object();

    /* loaded from: classes20.dex */
    public interface IConnCb {
        static {
            Covode.recordClassIndex(2144);
        }

        void onDisConnect(Session session, long j, int i);

        void onFailed(Session session, long j, int i, int i2);

        void onSuccess(Session session, long j);
    }

    static {
        Covode.recordClassIndex(2143);
    }

    /* renamed from: a */
    public void m21063a(boolean z) {
        this.f20386d = z;
        if (!z) {
            if (this.f20393k != null) {
                this.f20393k.cancel(true);
                this.f20393k = null;
            }
            this.f20387e = null;
        }
    }

    /* renamed from: a */
    public void m21069a(Session session, int i, int i2) {
        if (256 != i || i2 == -2613 || i2 == -2601) {
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f20391i;
        alarmObject.errorCode = String.valueOf(i2);
        alarmObject.isSuccess = false;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        SessionConnStat sessionConnStat = this.f20390h;
        sessionConnStat.ret = 0;
        sessionConnStat.appendErrorTrace(i2);
        this.f20390h.errorCode = String.valueOf(i2);
        this.f20390h.totalTime = System.currentTimeMillis() - this.f20390h.start;
        this.f20390h.syncValueFromSession(session);
        AppMonitor.getInstance().commitStat(this.f20390h);
    }

    /* renamed from: a */
    public void m21065a(String str) {
        ALog.m20788d("awcn.SessionRequest", "reCreateSession", str, C1315c.f22208f, this.f20391i);
        m21059b(true);
    }

    /* renamed from: a */
    public String m21075a() {
        return this.f20391i;
    }

    /* renamed from: b */
    public int m21062b() {
        Session session = this.f20387e;
        if (session != null) {
            return session.f20354j.getType();
        }
        return -1;
    }

    /* renamed from: c */
    public void m21058c() {
        MethodCollector.m14708i(25);
        m21063a(false);
        synchronized (this.f20394l) {
            try {
                this.f20394l.notifyAll();
            } catch (Throwable th) {
                MethodCollector.m14707o(25);
                throw th;
            }
        }
        MethodCollector.m14707o(25);
    }

    /* renamed from: anet.channel.SessionRequest$c */
    /* loaded from: classes3.dex */
    public class RunnableC0459c implements Runnable {

        /* renamed from: a */
        public SessionGetCallback f20402a;

        /* renamed from: b */
        public AtomicBoolean f20403b = new AtomicBoolean(false);

        static {
            Covode.recordClassIndex(2147);
        }

        @Override // java.lang.Runnable
        public void run() {
            MethodCollector.m14708i(21);
            if (this.f20403b.compareAndSet(false, true)) {
                ALog.m20786e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f20389g) {
                    try {
                        SessionRequest.this.f20389g.remove(this.f20402a);
                    } finally {
                        MethodCollector.m14707o(21);
                    }
                }
                this.f20402a.onSessionGetFail();
            }
        }

        public RunnableC0459c(SessionGetCallback sessionGetCallback) {
            this.f20402a = sessionGetCallback;
        }
    }

    /* renamed from: anet.channel.SessionRequest$b */
    /* loaded from: classes2.dex */
    public class RunnableC0458b implements Runnable {

        /* renamed from: a */
        public String f20400a;

        static {
            Covode.recordClassIndex(2146);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SessionRequest.this.f20386d) {
                ALog.m20786e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f20400a, new Object[0]);
                SessionRequest.this.f20390h.ret = 2;
                SessionRequest.this.f20390h.totalTime = System.currentTimeMillis() - SessionRequest.this.f20390h.start;
                if (SessionRequest.this.f20387e != null) {
                    SessionRequest.this.f20387e.f20365u = false;
                    SessionRequest.this.f20387e.close();
                    SessionRequest.this.f20390h.syncValueFromSession(SessionRequest.this.f20387e);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.f20390h);
                SessionRequest.this.m21063a(false);
            }
        }

        public RunnableC0458b(String str) {
            this.f20400a = str;
        }
    }

    /* renamed from: anet.channel.SessionRequest$a */
    /* loaded from: classes2.dex */
    public class C0457a implements IConnCb {

        /* renamed from: a */
        public boolean f20395a;

        /* renamed from: c */
        public Context f20397c;

        /* renamed from: d */
        public List<C0502a> f20398d;

        /* renamed from: e */
        public C0502a f20399e;

        static {
            Covode.recordClassIndex(2145);
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j) {
            MethodCollector.m14708i(20);
            ALog.m20788d("awcn.SessionRequest", "Connect Success", this.f20399e.m20988h(), "session", session, C1315c.f22208f, SessionRequest.this.m21075a());
            try {
                if (SessionRequest.this.f20388f) {
                    SessionRequest.this.f20388f = false;
                    session.close(false);
                    return;
                }
                SessionRequest.this.f20384b.m21016a(SessionRequest.this, session);
                SessionRequest.this.m21070a(session);
                synchronized (SessionRequest.this.f20389g) {
                    try {
                        for (Map.Entry<SessionGetCallback, RunnableC0459c> entry : SessionRequest.this.f20389g.entrySet()) {
                            RunnableC0459c value = entry.getValue();
                            if (value.f20403b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value);
                                entry.getKey().onSessionGetSuccess(session);
                            }
                        }
                        SessionRequest.this.f20389g.clear();
                    } catch (Throwable th) {
                        MethodCollector.m14707o(20);
                        throw th;
                    }
                }
            } catch (Exception e) {
                ALog.m20787e("awcn.SessionRequest", "[onSuccess]:", this.f20399e.m20988h(), e, new Object[0]);
            } finally {
                SessionRequest.this.m21058c();
                MethodCollector.m14707o(20);
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(Session session, long j, int i) {
            boolean isAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.m20788d("awcn.SessionRequest", "Connect Disconnect", this.f20399e.m20988h(), "session", session, C1315c.f22208f, SessionRequest.this.m21075a(), "appIsBg", Boolean.valueOf(isAppBackground), "isHandleFinish", Boolean.valueOf(this.f20395a));
            SessionRequest.this.f20384b.m21015b(SessionRequest.this, session);
            if (this.f20395a) {
                return;
            }
            this.f20395a = true;
            if (!session.f20364t) {
                return;
            }
            if (isAppBackground && (SessionRequest.this.f20385c == null || !SessionRequest.this.f20385c.isAccs || AwcnConfig.isAccsSessionCreateForbiddenInBg())) {
                ALog.m20786e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f20399e.m20988h(), "session", session);
            } else if (!NetworkStatusHelper.isConnected()) {
                ALog.m20786e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f20399e.m20988h(), "session", session);
            } else {
                try {
                    ALog.m20788d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f20399e.m20988h(), new Object[0]);
                    int i2 = 10000;
                    if (SessionRequest.this.f20385c != null && SessionRequest.this.f20385c.isAccs) {
                        i2 = AwcnConfig.getAccsReconnectionDelayPeriod();
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0514i(this, session), (long) (Math.random() * i2), TimeUnit.MILLISECONDS);
                } catch (Exception unused) {
                }
            }
        }

        public C0457a(Context context, List<C0502a> list, C0502a c0502a) {
            this.f20397c = context;
            this.f20398d = list;
            this.f20399e = c0502a;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j, int i, int i2) {
            MethodCollector.m14708i(19);
            if (ALog.isPrintLog(1)) {
                ALog.m20788d("awcn.SessionRequest", "Connect failed", this.f20399e.m20988h(), "session", session, C1315c.f22208f, SessionRequest.this.m21075a(), "isHandleFinish", Boolean.valueOf(this.f20395a));
            }
            if (SessionRequest.this.f20388f) {
                SessionRequest.this.f20388f = false;
                MethodCollector.m14707o(19);
            } else if (this.f20395a) {
                MethodCollector.m14707o(19);
            } else {
                this.f20395a = true;
                SessionRequest.this.f20384b.m21015b(SessionRequest.this, session);
                if (session.f20365u && NetworkStatusHelper.isConnected() && !this.f20398d.isEmpty()) {
                    if (ALog.isPrintLog(1)) {
                        ALog.m20788d("awcn.SessionRequest", "use next connInfo to create session", this.f20399e.m20988h(), C1315c.f22208f, SessionRequest.this.m21075a());
                    }
                    if (this.f20399e.f20498b == this.f20399e.f20499c && (i2 == -2003 || i2 == -2410)) {
                        ListIterator<C0502a> listIterator = this.f20398d.listIterator();
                        while (listIterator.hasNext()) {
                            if (session.getIp().equals(listIterator.next().f20497a.getIp())) {
                                listIterator.remove();
                            }
                        }
                    }
                    if (C0579c.m20793b(session.getIp())) {
                        ListIterator<C0502a> listIterator2 = this.f20398d.listIterator();
                        while (listIterator2.hasNext()) {
                            if (C0579c.m20793b(listIterator2.next().f20497a.getIp())) {
                                listIterator2.remove();
                            }
                        }
                    }
                    if (this.f20398d.isEmpty()) {
                        SessionRequest.this.m21058c();
                        SessionRequest.this.m21069a(session, i, i2);
                        synchronized (SessionRequest.this.f20389g) {
                            try {
                                for (Map.Entry<SessionGetCallback, RunnableC0459c> entry : SessionRequest.this.f20389g.entrySet()) {
                                    RunnableC0459c value = entry.getValue();
                                    if (value.f20403b.compareAndSet(false, true)) {
                                        ThreadPoolExecutorFactory.removeScheduleTask(value);
                                        entry.getKey().onSessionGetFail();
                                    }
                                }
                                SessionRequest.this.f20389g.clear();
                            } finally {
                            }
                        }
                        MethodCollector.m14707o(19);
                        return;
                    }
                    C0502a remove = this.f20398d.remove(0);
                    SessionRequest sessionRequest = SessionRequest.this;
                    Context context = this.f20397c;
                    sessionRequest.m21071a(context, remove, new C0457a(context, this.f20398d, remove), remove.m20988h());
                    MethodCollector.m14707o(19);
                    return;
                }
                SessionRequest.this.m21058c();
                SessionRequest.this.m21069a(session, i, i2);
                synchronized (SessionRequest.this.f20389g) {
                    try {
                        for (Map.Entry<SessionGetCallback, RunnableC0459c> entry2 : SessionRequest.this.f20389g.entrySet()) {
                            RunnableC0459c value2 = entry2.getValue();
                            if (value2.f20403b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value2);
                                entry2.getKey().onSessionGetFail();
                            }
                        }
                        SessionRequest.this.f20389g.clear();
                    } finally {
                    }
                }
                MethodCollector.m14707o(19);
            }
        }
    }

    /* renamed from: a */
    public void m21070a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f20391i;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.f20390h.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.f20390h;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.f20390h.start;
        AppMonitor.getInstance().commitStat(this.f20390h);
    }

    /* renamed from: b */
    public void m21059b(boolean z) {
        ALog.m20788d("awcn.SessionRequest", "closeSessions", this.f20383a.f20374c, C1315c.f22208f, this.f20391i, "autoCreate", Boolean.valueOf(z));
        if (!z && this.f20387e != null) {
            this.f20387e.f20365u = false;
            this.f20387e.close(false);
        }
        List<Session> m21018a = this.f20384b.m21018a(this);
        if (m21018a != null) {
            for (Session session : m21018a) {
                if (session != null) {
                    session.close(z);
                }
            }
        }
    }

    /* renamed from: a */
    public void m21073a(long j) {
        MethodCollector.m14708i(24);
        ALog.m20788d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j));
        if (j <= 0) {
            MethodCollector.m14707o(24);
            return;
        }
        synchronized (this.f20394l) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + j;
                while (this.f20386d) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 >= currentTimeMillis) {
                        break;
                    }
                    this.f20394l.wait(currentTimeMillis - currentTimeMillis2);
                }
                if (this.f20386d) {
                    TimeoutException timeoutException = new TimeoutException();
                    MethodCollector.m14707o(24);
                    throw timeoutException;
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(24);
                throw th;
            }
        }
        MethodCollector.m14707o(24);
    }

    public SessionRequest(String str, SessionCenter sessionCenter) {
        this.f20391i = str;
        String str2 = this.f20391i;
        this.f20392j = str2.substring(str2.indexOf("://") + 3);
        this.f20383a = sessionCenter;
        this.f20385c = sessionCenter.f20378g.m21044b(this.f20392j);
        this.f20384b = sessionCenter.f20376e;
    }

    /* renamed from: a */
    private List<C0502a> m21064a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            IConnStrategy iConnStrategy = list.get(i2);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i3 = 0; i3 <= retryTimes; i3++) {
                i++;
                String m21075a = m21075a();
                C0502a c0502a = new C0502a(m21075a, str + "_" + i, iConnStrategy);
                c0502a.f20498b = i3;
                c0502a.f20499c = retryTimes;
                arrayList.add(c0502a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private List<IConnStrategy> m21074a(int i, String str) {
        HttpUrl parse;
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        try {
            parse = HttpUrl.parse(m21075a());
        } catch (Throwable th) {
            ALog.m20787e("awcn.SessionRequest", "", str, th, new Object[0]);
        }
        if (parse == null) {
            return Collections.EMPTY_LIST;
        }
        list = StrategyCenter.getInstance().getConnStrategyListByHost(parse.host());
        if (!list.isEmpty()) {
            boolean equalsIgnoreCase = "https".equalsIgnoreCase(parse.scheme());
            boolean m20769b = C0590c.m20769b();
            ListIterator<IConnStrategy> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                IConnStrategy next = listIterator.next();
                ConnType valueOf = ConnType.valueOf(next.getProtocol());
                if (valueOf != null) {
                    if (valueOf.isSSL() != equalsIgnoreCase || (i != C0504c.f20507c && valueOf.getType() != i)) {
                        listIterator.remove();
                    } else if (m20769b && C0579c.m20793b(next.getIp())) {
                        listIterator.remove();
                    }
                }
            }
        }
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", list);
            return list;
        }
        return list;
    }

    /* renamed from: a */
    public void m21068a(Session session, int i, String str) {
        if (AwcnConfig.isSendConnectInfoByService()) {
            m21060b(session, i, str);
        }
        m21057c(session, i, str);
    }

    /* renamed from: a */
    private void m21067a(Session session, IConnCb iConnCb, long j) {
        if (iConnCb == null) {
            return;
        }
        session.registerEventcb(4095, new C0505f(this, iConnCb, j));
        session.registerEventcb(1792, new C0509g(this, session));
    }

    /* renamed from: b */
    private void m21060b(Session session, int i, String str) {
        SessionInfo sessionInfo;
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context != null && (sessionInfo = this.f20385c) != null && sessionInfo.isAccs) {
            ALog.m20786e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, new Object[0]);
            try {
                Intent intent = new Intent("com.taobao.accs.intent.action.RECEIVE");
                intent.setPackage(context.getPackageName());
                intent.setClassName(context, "com.taobao.accs.data.MsgDistributeService");
                intent.putExtra(MiPushCommandMessage.KEY_COMMAND, 103);
                intent.putExtra(C1315c.f22208f, session.getHost());
                intent.putExtra("is_center_host", true);
                boolean isAvailable = session.isAvailable();
                if (!isAvailable) {
                    intent.putExtra("errorCode", i);
                    intent.putExtra("errorDetail", str);
                }
                intent.putExtra("connect_avail", isAvailable);
                intent.putExtra("type_inapp", true);
                if (Build.VERSION.SDK_INT >= 26) {
                    C116971W2r.LIZ(context, intent, new ServiceConnectionC0510h(this, intent, context), 1);
                } else {
                    C116971W2r.LIZJ(context, intent);
                }
            } catch (Throwable th) {
                ALog.m20787e("awcn.SessionRequest", "sendConnectInfoToAccsByService", null, th, new Object[0]);
            }
        }
    }

    /* renamed from: c */
    private void m21057c(Session session, int i, String str) {
        SessionInfo sessionInfo = this.f20385c;
        if (sessionInfo != null && sessionInfo.isAccs) {
            ALog.m20786e("awcn.SessionRequest", "sendConnectInfoToAccsByCallBack", null, new Object[0]);
            Intent intent = new Intent("com.taobao.ACCS_CONNECT_INFO");
            intent.putExtra(MiPushCommandMessage.KEY_COMMAND, 103);
            intent.putExtra(C1315c.f22208f, session.getHost());
            intent.putExtra("is_center_host", true);
            boolean isAvailable = session.isAvailable();
            if (!isAvailable) {
                intent.putExtra("errorCode", i);
                intent.putExtra("errorDetail", str);
            }
            intent.putExtra("connect_avail", isAvailable);
            intent.putExtra("type_inapp", true);
            this.f20383a.f20379h.notifyListener(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m21071a(Context context, C0502a c0502a, IConnCb iConnCb, String str) {
        ConnType m20993c = c0502a.m20993c();
        if (context != null && !m20993c.isHttpType()) {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, c0502a);
            tnetSpdySession.initConfig(this.f20383a.f20375d);
            tnetSpdySession.initSessionInfo(this.f20385c);
            tnetSpdySession.setTnetPublicKey(this.f20383a.f20378g.m21043c(this.f20392j));
            this.f20387e = tnetSpdySession;
        } else {
            this.f20387e = new C0537d(context, c0502a);
        }
        ALog.m20785i("awcn.SessionRequest", "create connection...", str, "Host", m21075a(), "Type", c0502a.m20993c(), "IP", c0502a.m20995a(), "Port", Integer.valueOf(c0502a.m20994b()), "heartbeat", Integer.valueOf(c0502a.m20989g()), "session", this.f20387e);
        m21067a(this.f20387e, iConnCb, System.currentTimeMillis());
        this.f20387e.connect();
        this.f20390h.retryTimes++;
        this.f20390h.startConnect = System.currentTimeMillis();
        if (this.f20390h.retryTimes == 0) {
            this.f20390h.putExtra("firstIp", c0502a.m20995a());
        }
    }

    /* renamed from: b */
    public synchronized void m21061b(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j) {
        String str2 = str;
        synchronized (this) {
            MethodCollector.m14708i(23);
            Session m21017a = this.f20384b.m21017a(this, i);
            if (m21017a != null) {
                ALog.m20788d("awcn.SessionRequest", "Available Session exist!!!", str2, new Object[0]);
                sessionGetCallback.onSessionGetSuccess(m21017a);
                MethodCollector.m14707o(23);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = C0596i.m20754a(null);
            }
            ALog.m20788d("awcn.SessionRequest", "SessionRequest start", str2, C1315c.f22208f, this.f20391i, "type", Integer.valueOf(i));
            if (this.f20386d) {
                ALog.m20788d("awcn.SessionRequest", "session connecting", str2, C1315c.f22208f, m21075a());
                if (m21062b() == i) {
                    RunnableC0459c runnableC0459c = new RunnableC0459c(sessionGetCallback);
                    synchronized (this.f20389g) {
                        this.f20389g.put(sessionGetCallback, runnableC0459c);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC0459c, j, TimeUnit.MILLISECONDS);
                    MethodCollector.m14707o(23);
                    return;
                }
                sessionGetCallback.onSessionGetFail();
                MethodCollector.m14707o(23);
                return;
            }
            m21063a(true);
            this.f20393k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0458b(str2), 45L, TimeUnit.SECONDS);
            this.f20390h = new SessionConnStat();
            this.f20390h.start = System.currentTimeMillis();
            if (!NetworkStatusHelper.isConnected()) {
                if (ALog.isPrintLog(1)) {
                    ALog.m20788d("awcn.SessionRequest", "network is not available, can't create session", str2, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
                }
                m21058c();
                RuntimeException runtimeException = new RuntimeException("no network");
                MethodCollector.m14707o(23);
                throw runtimeException;
            }
            List<IConnStrategy> m21074a = m21074a(i, str2);
            if (!m21074a.isEmpty()) {
                List<C0502a> m21064a = m21064a(m21074a, str2);
                C0502a remove = m21064a.remove(0);
                m21071a(context, remove, new C0457a(context, m21064a, remove), remove.m20988h());
                RunnableC0459c runnableC0459c2 = new RunnableC0459c(sessionGetCallback);
                synchronized (this.f20389g) {
                    this.f20389g.put(sessionGetCallback, runnableC0459c2);
                }
                ThreadPoolExecutorFactory.submitScheduledTask(runnableC0459c2, j, TimeUnit.MILLISECONDS);
                MethodCollector.m14707o(23);
                return;
            }
            ALog.m20785i("awcn.SessionRequest", "no avalible strategy, can't create session", str2, C1315c.f22208f, this.f20391i, "type", Integer.valueOf(i));
            m21058c();
            NoAvailStrategyException noAvailStrategyException = new NoAvailStrategyException("no avalible strategy");
            MethodCollector.m14707o(23);
            throw noAvailStrategyException;
        }
    }

    /* renamed from: a */
    public synchronized void m21072a(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j) {
        String str2 = str;
        synchronized (this) {
            MethodCollector.m14708i(22);
            Session m21017a = this.f20384b.m21017a(this, i);
            if (m21017a != null) {
                ALog.m20788d("awcn.SessionRequest", "Available Session exist!!!", str2, new Object[0]);
                if (sessionGetCallback != null) {
                    sessionGetCallback.onSessionGetSuccess(m21017a);
                }
                MethodCollector.m14707o(22);
                return;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = C0596i.m20754a(null);
            }
            ALog.m20788d("awcn.SessionRequest", "SessionRequest start", str2, C1315c.f22208f, this.f20391i, "type", Integer.valueOf(i));
            if (this.f20386d) {
                ALog.m20788d("awcn.SessionRequest", "session connecting", str2, C1315c.f22208f, m21075a());
                if (sessionGetCallback != null) {
                    if (m21062b() == i) {
                        RunnableC0459c runnableC0459c = new RunnableC0459c(sessionGetCallback);
                        synchronized (this.f20389g) {
                            this.f20389g.put(sessionGetCallback, runnableC0459c);
                        }
                        ThreadPoolExecutorFactory.submitScheduledTask(runnableC0459c, j, TimeUnit.MILLISECONDS);
                        MethodCollector.m14707o(22);
                        return;
                    }
                    sessionGetCallback.onSessionGetFail();
                }
                MethodCollector.m14707o(22);
                return;
            }
            m21063a(true);
            this.f20393k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0458b(str2), 45L, TimeUnit.SECONDS);
            this.f20390h = new SessionConnStat();
            this.f20390h.start = System.currentTimeMillis();
            if (!NetworkStatusHelper.isConnected()) {
                if (ALog.isPrintLog(1)) {
                    ALog.m20788d("awcn.SessionRequest", "network is not available, can't create session", str2, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
                }
                m21058c();
                RuntimeException runtimeException = new RuntimeException("no network");
                MethodCollector.m14707o(22);
                throw runtimeException;
            }
            List<IConnStrategy> m21074a = m21074a(i, str2);
            if (!m21074a.isEmpty()) {
                List<C0502a> m21064a = m21064a(m21074a, str2);
                C0502a remove = m21064a.remove(0);
                m21071a(context, remove, new C0457a(context, m21064a, remove), remove.m20988h());
                if (sessionGetCallback != null) {
                    RunnableC0459c runnableC0459c2 = new RunnableC0459c(sessionGetCallback);
                    synchronized (this.f20389g) {
                        this.f20389g.put(sessionGetCallback, runnableC0459c2);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(runnableC0459c2, j, TimeUnit.MILLISECONDS);
                }
                MethodCollector.m14707o(22);
                return;
            }
            ALog.m20785i("awcn.SessionRequest", "no avalible strategy, can't create session", str2, C1315c.f22208f, this.f20391i, "type", Integer.valueOf(i));
            m21058c();
            NoAvailStrategyException noAvailStrategyException = new NoAvailStrategyException("no avalible strategy");
            MethodCollector.m14707o(22);
            throw noAvailStrategyException;
        }
    }
}
