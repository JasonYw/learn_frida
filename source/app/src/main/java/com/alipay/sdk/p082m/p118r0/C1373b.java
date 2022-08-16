package com.alipay.sdk.p082m.p118r0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.alipay.sdk.p082m.p116q0.AbstractC1367a;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.r0.b */
/* loaded from: classes2.dex */
public class C1373b {

    /* renamed from: e */
    public static String f22357e = "OpenDeviceId library";

    /* renamed from: f */
    public static boolean f22358f;

    /* renamed from: b */
    public AbstractC1367a f22360b;

    /* renamed from: c */
    public ServiceConnection f22361c;

    /* renamed from: a */
    public Context f22359a = null;

    /* renamed from: d */
    public AbstractC1375b f22362d = null;

    /* renamed from: com.alipay.sdk.m.r0.b$b */
    /* loaded from: classes2.dex */
    public interface AbstractC1375b<T> {
        static {
            Covode.recordClassIndex(4875);
        }

        /* renamed from: a */
        void m18943a(T t, C1373b c1373b);
    }

    static {
        Covode.recordClassIndex(4873);
    }

    /* renamed from: a */
    private void m18951a(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m18948b(String str) {
    }

    /* renamed from: e */
    public boolean m18945e() {
        boolean z = false;
        try {
            if (this.f22360b == null) {
                return false;
            }
            m18948b("Device support opendeviceid");
            z = this.f22360b.mo18967c();
            return z;
        } catch (RemoteException unused) {
            m18951a("isSupport error, RemoteException!");
            return z;
        }
    }

    /* renamed from: f */
    public void m18944f() {
        try {
            this.f22359a.unbindService(this.f22361c);
            m18948b("unBind Service successful");
        } catch (IllegalArgumentException unused) {
            m18951a("unBind Service exception");
        }
        this.f22360b = null;
    }

    /* renamed from: b */
    public String m18949b() {
        if (this.f22359a != null) {
            try {
                if (this.f22360b != null) {
                    return this.f22360b.mo18971a();
                }
                return null;
            } catch (RemoteException e) {
                m18951a("getOAID error, RemoteException!");
                e.printStackTrace();
                return null;
            }
        }
        m18951a("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: c */
    public String m18947c() {
        if (this.f22359a != null) {
            try {
                if (this.f22360b != null) {
                    return this.f22360b.mo18969b();
                }
                return null;
            } catch (RemoteException e) {
                m18951a("getUDID error, RemoteException!");
                e.printStackTrace();
                return null;
            } catch (Exception e2) {
                m18951a("getUDID error, Exception!");
                e2.printStackTrace();
                return null;
            }
        }
        m18951a("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: a */
    public String m18956a() {
        Context context = this.f22359a;
        if (context != null) {
            String packageName = context.getPackageName();
            m18948b(C0002O.m25086C("liufeng, getAAID package：", packageName));
            String str = null;
            if (packageName != null && !packageName.equals("")) {
                try {
                    if (this.f22360b != null && (((str = this.f22360b.mo18970a(packageName)) == null || "".equals(str)) && this.f22360b.mo18966c(packageName))) {
                        str = this.f22360b.mo18970a(packageName);
                        return str;
                    }
                } catch (RemoteException unused) {
                    m18951a("getAAID error, RemoteException!");
                    return str;
                }
            } else {
                m18948b("input package is null!");
            }
            return str;
        }
        m18948b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: d */
    public String m18946d() {
        Context context = this.f22359a;
        if (context != null) {
            String packageName = context.getPackageName();
            m18948b(C0002O.m25086C("liufeng, getVAID package：", packageName));
            if (packageName != null && !packageName.equals("")) {
                try {
                    if (this.f22360b != null) {
                        return this.f22360b.mo18968b(packageName);
                    }
                    return null;
                } catch (RemoteException e) {
                    m18951a("getVAID error, RemoteException!");
                    e.printStackTrace();
                    return null;
                }
            }
            m18948b("input package is null!");
            return null;
        }
        m18948b("Context is null.");
        throw new IllegalArgumentException("Context is null, must be new OpenDeviceId first");
    }

    /* renamed from: com.alipay.sdk.m.r0.b$a */
    /* loaded from: classes2.dex */
    public class ServiceConnectionC1374a implements ServiceConnection {
        static {
            Covode.recordClassIndex(4874);
        }

        public ServiceConnectionC1374a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            C1373b.this.f22360b = null;
            C1373b.this.m18948b("Service onServiceDisconnected");
        }

        @Override // android.content.ServiceConnection
        public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1373b.this.f22360b = AbstractC1367a.AbstractBinderC1368a.m18972a(iBinder);
            if (C1373b.this.f22362d != null) {
                C1373b.this.f22362d.m18943a("Deviceid Service Connected", C1373b.this);
            }
            C1373b.this.m18948b("Service onServiceConnected");
        }
    }

    /* renamed from: a */
    public void m18950a(boolean z) {
        f22358f = z;
    }

    /* renamed from: a */
    public int m18955a(Context context, AbstractC1375b<String> abstractC1375b) {
        if (context != null) {
            this.f22359a = context;
            this.f22362d = abstractC1375b;
            this.f22361c = new ServiceConnectionC1374a();
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            if (C116971W2r.LIZ(this.f22359a, intent, this.f22361c, 1)) {
                m18948b("bindService Successful!");
                return 1;
            }
            m18948b("bindService Failed!");
            return -1;
        }
        throw new NullPointerException("Context can not be null.");
    }
}
