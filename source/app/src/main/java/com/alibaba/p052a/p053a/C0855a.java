package com.alibaba.p052a.p053a;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.alibaba.p052a.p053a.AbstractC0894d;
import com.alibaba.p052a.p053a.p060g.C0919c;
import com.alibaba.p052a.p053a.p060g.C0925f;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C116971W2r;

/* renamed from: com.alibaba.a.a.a */
/* loaded from: classes13.dex */
public final class C0855a {

    /* renamed from: a */
    public static HandlerC0870d f21093a;

    /* renamed from: b */
    public static AbstractC0894d f21094b;

    /* renamed from: c */
    public static Application f21095c;

    /* renamed from: d */
    public static HandlerThread f21096d;

    /* renamed from: e */
    public static volatile boolean f21097e;

    /* renamed from: i */
    public static String f21101i;

    /* renamed from: j */
    public static String f21102j;

    /* renamed from: k */
    public static boolean f21103k;

    /* renamed from: l */
    public static String f21104l;

    /* renamed from: n */
    public static Context f21106n;

    /* renamed from: p */
    public static String f21108p;

    /* renamed from: f */
    public static Object f21098f = new Object();

    /* renamed from: g */
    public static List<C0868b> f21099g = Collections.synchronizedList(new ArrayList());

    /* renamed from: h */
    public static boolean f21100h = false;

    /* renamed from: m */
    public static EnumC0869c f21105m = EnumC0869c.Local;

    /* renamed from: o */
    public static ServiceConnection f21107o = new ServiceConnection() { // from class: com.alibaba.a.a.a.5
        static {
            Covode.recordClassIndex(4170);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (EnumC0869c.Service == C0855a.f21105m) {
                C0855a.f21094b = AbstractC0894d.AbstractBinderC0895a.m20411a(iBinder);
                if (C0855a.f21100h && C0855a.f21093a != null) {
                    C0855a.f21093a.postAtFrontOfQueue(new Runnable() { // from class: com.alibaba.a.a.a.5.1
                        static {
                            Covode.recordClassIndex(4171);
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C0855a.m20519i();
                        }
                    });
                }
            }
            synchronized (C0855a.f21098f) {
                C0855a.f21098f.notifyAll();
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            C0974i.m20098a("AppMonitor", "[onServiceDisconnected]");
            synchronized (C0855a.f21098f) {
                C0855a.f21098f.notifyAll();
            }
            boolean unused = C0855a.f21100h = true;
        }
    };

    /* renamed from: q */
    public static Map<String, Object> f21109q = Collections.synchronizedMap(new HashMap());

    /* renamed from: com.alibaba.a.a.a$a */
    /* loaded from: classes13.dex */
    public static class C0866a {
        static {
            Covode.recordClassIndex(4176);
        }

        /* renamed from: a */
        public static void m20515a(final int i) {
            if (!C0855a.m20530b()) {
                return;
            }
            C0855a.f21093a.m20505a(new Runnable() { // from class: com.alibaba.a.a.a.a.1
                static {
                    Covode.recordClassIndex(4177);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C0855a.f21094b.mo20343j(i);
                    } catch (RemoteException e) {
                        C0855a.m20529b(e);
                    }
                }
            });
        }
    }

    /* renamed from: com.alibaba.a.a.a$b */
    /* loaded from: classes13.dex */
    public static class C0868b {

        /* renamed from: a */
        public String f21125a;

        /* renamed from: b */
        public String f21126b;

        /* renamed from: c */
        public C0925f f21127c;

        /* renamed from: d */
        public C0919c f21128d;

        /* renamed from: e */
        public boolean f21129e;

        static {
            Covode.recordClassIndex(4178);
        }
    }

    /* renamed from: com.alibaba.a.a.a$c */
    /* loaded from: classes13.dex */
    public enum EnumC0869c {
        Local,
        Service;

        static {
            Covode.recordClassIndex(4179);
        }
    }

    /* renamed from: com.alibaba.a.a.a$d */
    /* loaded from: classes13.dex */
    public static class HandlerC0870d extends Handler {

        /* renamed from: a */
        public boolean f21133a;

        static {
            Covode.recordClassIndex(4180);
        }

        public HandlerC0870d(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public void m20505a(Runnable runnable) {
            if (runnable == null) {
                return;
            }
            try {
                Message obtain = Message.obtain();
                obtain.what = 1;
                obtain.obj = runnable;
                sendMessage(obtain);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public void m20504a(boolean z) {
            this.f21133a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                if (this.f21133a) {
                    this.f21133a = false;
                    synchronized (C0855a.f21098f) {
                        try {
                            C0855a.f21098f.wait(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME);
                        } catch (InterruptedException unused) {
                            C0855a.m20518j();
                        }
                    }
                }
                if (message.obj != null && (message.obj instanceof Runnable)) {
                    ((Runnable) message.obj).run();
                }
            } catch (Throwable unused2) {
            }
            super.handleMessage(message);
        }
    }

    static {
        Covode.recordClassIndex(4165);
    }

    /* renamed from: a */
    public static Runnable m20534a(final String str, final String str2, final C0925f c0925f, final C0919c c0919c, final boolean z) {
        return new Runnable() { // from class: com.alibaba.a.a.a.9
            static {
                Covode.recordClassIndex(4175);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0974i.m20098a("AppMonitor", "register stat event. module: ", str, " monitorPoint: ", str2);
                    C0855a.f21094b.mo20371a(str, str2, c0925f, c0919c, z);
                } catch (RemoteException e) {
                    C0855a.m20529b(e);
                }
            }
        };
    }

    /* renamed from: a */
    public static void m20539a() {
        if (!m20530b()) {
            return;
        }
        f21093a.m20505a(new Runnable() { // from class: com.alibaba.a.a.a.4
            static {
                Covode.recordClassIndex(4169);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20354c();
                } catch (RemoteException e) {
                    C0855a.m20529b(e);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m20538a(final int i) {
        if (!m20530b()) {
            return;
        }
        f21093a.m20505a(new Runnable() { // from class: com.alibaba.a.a.a.1
            static {
                Covode.recordClassIndex(4166);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20382a(i);
                } catch (RemoteException e) {
                    C0855a.m20529b(e);
                }
            }
        });
    }

    /* renamed from: a */
    public static synchronized void m20537a(Application application) {
        synchronized (C0855a.class) {
            C0974i.m20098a("AppMonitor", "[init]");
            try {
                if (!f21097e) {
                    f21095c = application;
                    if (application != null) {
                        f21106n = f21095c.getApplicationContext();
                    }
                    HandlerThread handlerThread = new HandlerThread("AppMonitor_Client");
                    f21096d = handlerThread;
                    handlerThread.start();
                    f21093a = new HandlerC0870d(f21096d.getLooper());
                    if (f21105m == EnumC0869c.Local) {
                        m20518j();
                    } else if (m20520h()) {
                        f21093a.m20504a(true);
                    }
                    m20517k().run();
                    f21097e = true;
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m20535a(String str) {
        if (!m20530b()) {
            return;
        }
        f21093a.m20505a(m20528b(str));
        f21101i = str;
    }

    /* renamed from: a */
    public static void m20533a(final Map<String, String> map) {
        if (!m20530b()) {
            return;
        }
        f21093a.m20505a(new Runnable() { // from class: com.alibaba.a.a.a.3
            static {
                Covode.recordClassIndex(4168);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20363a(map);
                } catch (RemoteException e) {
                    C0855a.m20529b(e);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m20532a(final boolean z) {
        if (!m20530b()) {
            return;
        }
        f21093a.m20505a(new Runnable() { // from class: com.alibaba.a.a.a.2
            static {
                Covode.recordClassIndex(4167);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20362a(z);
                } catch (RemoteException e) {
                    C0855a.m20529b(e);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m20531a(boolean z, String str, String str2, String str3) {
        if (!m20530b()) {
            return;
        }
        f21093a.m20505a(m20526b(z, str, str2, str3));
        f21103k = z;
        f21102j = str;
        f21104l = str2;
        f21108p = str3;
    }

    /* renamed from: b */
    public static Runnable m20528b(final String str) {
        return new Runnable() { // from class: com.alibaba.a.a.a.8
            static {
                Covode.recordClassIndex(4174);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20379a(str);
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* renamed from: b */
    public static Runnable m20526b(final boolean z, final String str, final String str2, final String str3) {
        return new Runnable() { // from class: com.alibaba.a.a.a.7
            static {
                Covode.recordClassIndex(4173);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20361a(z, str, str2, str3);
                } catch (Throwable unused) {
                }
            }
        };
    }

    /* renamed from: b */
    public static void m20529b(Exception exc) {
        C0974i.m20099a("AppMonitor", "", exc);
        if (exc instanceof DeadObjectException) {
            m20519i();
        }
    }

    /* renamed from: b */
    public static boolean m20530b() {
        if (!f21097e) {
            C0974i.m20098a("AppMonitor", "Please call UTAnalytics.getInstance().setAppApplicationInstance()||.setAppApplicationInstance4sdk() before call other method");
        }
        return f21097e;
    }

    /* renamed from: h */
    public static boolean m20520h() {
        Application application = f21095c;
        if (application == null) {
            return false;
        }
        boolean LIZ = C116971W2r.LIZ(application.getApplicationContext(), new Intent(f21095c.getApplicationContext(), ServiceC0888c.class), f21107o, 1);
        if (!LIZ) {
            m20518j();
        }
        C0974i.m20098a("AppMonitor", "bindsuccess:", Boolean.valueOf(LIZ));
        return LIZ;
    }

    /* renamed from: i */
    public static synchronized void m20519i() {
        synchronized (C0855a.class) {
            C0974i.m20098a("AppMonitor", "[restart]");
            if (f21100h) {
                f21100h = false;
                m20518j();
                m20517k().run();
                m20526b(f21103k, f21102j, f21104l, f21108p).run();
                m20528b(f21101i).run();
                synchronized (f21099g) {
                    for (int i = 0; i < f21099g.size(); i++) {
                        C0868b c0868b = f21099g.get(i);
                        if (c0868b != null) {
                            try {
                                m20534a(c0868b.f21125a, c0868b.f21126b, c0868b.f21127c, c0868b.f21128d, c0868b.f21129e).run();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: j */
    public static void m20518j() {
        f21094b = new BinderC0908e(f21095c);
        f21105m = EnumC0869c.Local;
        C0974i.m20100a("AppMonitor", "Start AppMonitor Service failed,AppMonitor run in local Mode...");
    }

    /* renamed from: k */
    public static Runnable m20517k() {
        return new Runnable() { // from class: com.alibaba.a.a.a.6
            static {
                Covode.recordClassIndex(4172);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C0855a.f21094b.mo20383a();
                } catch (RemoteException unused) {
                    C0855a.m20518j();
                    try {
                        C0855a.f21094b.mo20383a();
                    } catch (Throwable unused2) {
                    }
                }
            }
        };
    }
}
