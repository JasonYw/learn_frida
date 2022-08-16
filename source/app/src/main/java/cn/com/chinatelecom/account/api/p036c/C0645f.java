package cn.com.chinatelecom.account.api.p036c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import cn.com.chinatelecom.account.api.CtAuth;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.net.InetAddress;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.c.f */
/* loaded from: classes2.dex */
public class C0645f {

    /* renamed from: a */
    public static final String f20927a = C0645f.class.getSimpleName();

    /* renamed from: b */
    public static Handler f20928b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public boolean f20929c;

    /* renamed from: d */
    public Context f20930d;

    /* renamed from: e */
    public ConnectivityManager.NetworkCallback f20931e;

    static {
        Covode.recordClassIndex(2696);
    }

    public C0645f(Context context) {
        this.f20930d = context;
    }

    /* renamed from: a */
    public static int m20705a(String str) {
        try {
            byte[] address = InetAddress.getByName(str).getAddress();
            return (address[0] & 255) | ((address[3] & 255) << 24) | ((address[2] & 255) << 16) | ((address[1] & 255) << 8);
        } catch (Throwable th) {
            CtAuth.warn(f20927a, "When InetAddress.getByName(),throws exception", th);
            return -1;
        }
    }

    /* renamed from: b */
    public static String m20702b(String str) {
        int indexOf = str.indexOf("://");
        if (indexOf > 0) {
            str = str.substring(indexOf + 3);
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 >= 0) {
            str = str.substring(0, indexOf2);
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 >= 0) {
            str = str.substring(0, indexOf3);
        }
        int indexOf4 = str.indexOf(63);
        return indexOf4 >= 0 ? str.substring(0, indexOf4) : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public int m20700c(String str) {
        int i;
        boolean booleanValue;
        MethodCollector.m14708i(176);
        try {
            Class LIZ = C116971W2r.LIZ("android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f20930d.getSystemService("connectivity");
            if (C116971W2r.LIZ(connectivityManager, 5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0) {
                LIZ.getMethod("startUsingNetworkFeature", Integer.TYPE, String.class).invoke(connectivityManager, 0, "enableHIPRI");
                int i2 = 0;
                while (C116971W2r.LIZ(connectivityManager, 5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0) {
                    Thread.sleep(500L);
                    i2++;
                    if (i2 >= 5) {
                        break;
                    }
                }
            }
            booleanValue = ((Boolean) LIZ.getMethod("requestRouteToHost", Integer.TYPE, Integer.TYPE).invoke(connectivityManager, 5, Integer.valueOf(m20705a(m20702b(str))))).booleanValue();
            CtAuth.info(f20927a, "STMN_V4 ：".concat(String.valueOf(booleanValue)));
        } catch (Throwable th) {
            CtAuth.warn(f20927a, "STMN_V4_T", th);
            i = -1;
        }
        if (booleanValue) {
            MethodCollector.m14707o(176);
            return 0;
        }
        i = -2;
        MethodCollector.m14707o(176);
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m20701c() {
        MethodCollector.m14708i(174);
        this.f20929c = true;
        MethodCollector.m14707o(174);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public synchronized boolean m20699d() {
        boolean z;
        MethodCollector.m14708i(175);
        z = this.f20929c;
        MethodCollector.m14707o(175);
        return z;
    }

    /* renamed from: a */
    public final void m20710a() {
        try {
            if (this.f20931e == null) {
                return;
            }
            ((ConnectivityManager) this.f20930d.getSystemService("connectivity")).unregisterNetworkCallback(this.f20931e);
            this.f20931e = null;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m20709a(AbstractC0644e abstractC0644e) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            f20928b.postDelayed(new RunnableC0646g(this, abstractC0644e), 2500L);
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest build = builder.build();
            this.f20931e = new C0647h(this, abstractC0644e, currentTimeMillis);
            ((ConnectivityManager) this.f20930d.getSystemService("connectivity")).requestNetwork(build, this.f20931e);
        } catch (Throwable unused) {
            if (m20699d()) {
                return;
            }
            abstractC0644e.mo20712a(System.currentTimeMillis() - currentTimeMillis);
        }
    }

    /* renamed from: a */
    public final void m20708a(AbstractC0644e abstractC0644e, String str) {
        new C0651l().execute(new C0648i(this, str, abstractC0644e));
    }
}
