package com.alibaba.p052a.p061b.p065d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.core.view.MotionEventCompat;
import com.alibaba.p052a.p061b.C0941a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* renamed from: com.alibaba.a.b.d.l */
/* loaded from: classes2.dex */
public class C0977l {

    /* renamed from: a */
    public static String[] f21413a = {"Unknown", "Unknown"};

    /* renamed from: b */
    public static C0980b f21414b = new C0980b(null);

    /* renamed from: c */
    public static RunnableC0979a f21415c = new RunnableC0979a(null);

    /* renamed from: com.alibaba.a.b.d.l$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C09781 {
        static {
            Covode.recordClassIndex(4288);
        }
    }

    /* renamed from: com.alibaba.a.b.d.l$a */
    /* loaded from: classes2.dex */
    public static class RunnableC0979a implements Runnable {

        /* renamed from: a */
        public Context f21416a;

        static {
            Covode.recordClassIndex(4289);
        }

        public RunnableC0979a() {
        }

        public /* synthetic */ RunnableC0979a(C09781 c09781) {
            this();
        }

        /* renamed from: a */
        public RunnableC0979a m20081a(Context context) {
            this.f21416a = context;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            Context context = this.f21416a;
            if (context == null) {
                return;
            }
            try {
                if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f21416a.getPackageName()) != 0) {
                    C0977l.f21413a[0] = "Unknown";
                    return;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f21416a.getSystemService("connectivity");
                if (connectivityManager == null) {
                    C0977l.f21413a[0] = "Unknown";
                    return;
                }
                NetworkInfo LIZ = C116971W2r.LIZ(connectivityManager);
                if (LIZ == null || !LIZ.isConnected()) {
                    return;
                }
                if (1 == LIZ.getType()) {
                    C0977l.f21413a[0] = "Wi-Fi";
                } else if (LIZ.getType() != 0) {
                } else {
                    C0977l.f21413a[0] = "2G/3G";
                    C0977l.f21413a[1] = LIZ.getSubtypeName();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.alibaba.a.b.d.l$b */
    /* loaded from: classes2.dex */
    public static class C0980b extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(4290);
        }

        public C0980b() {
        }

        public /* synthetic */ C0980b(C09781 c09781) {
            this();
        }

        /* renamed from: com_alibaba_a_b_d_l$b_com_ss_android_ugc_aweme_lancet_JatoBoostLancet_onBroadcastReceiverReceive */
        public static void m20080xcbc08202(C0980b c0980b, Context context, Intent intent) {
            if (!AppMonitor.INSTANCE.isAppBackground() && intent != null && !C140192dPo.LIZIZ.contains(intent.getAction()) && C140192dPo.LIZ("onBroadcastReceiverReceive")) {
                C140181dPd.m21607LJ();
            }
            c0980b.com_alibaba_a_b_d_l$b__onReceive$___twin___(context, intent);
        }

        public void com_alibaba_a_b_d_l$b__onReceive$___twin___(Context context, Intent intent) {
            C0989s m20062a = C0989s.m20062a();
            RunnableC0979a runnableC0979a = C0977l.f21415c;
            runnableC0979a.m20081a(context);
            m20062a.m20058a(runnableC0979a);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            m20080xcbc08202(this, context, intent);
        }
    }

    static {
        Covode.recordClassIndex(4287);
    }

    /* renamed from: a */
    public static String m20089a() {
        NetworkInfo LIZ;
        Context m20233c = C0941a.m20233c();
        if (m20233c == null) {
            return "Unknown";
        }
        try {
            if (m20233c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", m20233c.getPackageName()) == 0 && (LIZ = C116971W2r.LIZ((ConnectivityManager) m20233c.getSystemService("connectivity"))) != null && LIZ.isConnected()) {
                if (LIZ.getType() == 1) {
                    return "wifi";
                }
                if (LIZ.getType() == 0) {
                    return m20088a(LIZ.getSubtype());
                }
            }
        } catch (Throwable unused) {
        }
        return "Unknown";
    }

    /* renamed from: a */
    public static String m20088a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case MotionEventCompat.AXIS_HAT_X /* 15 */:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    /* renamed from: a */
    public static String[] m20087a(Context context) {
        return f21413a;
    }

    /* renamed from: b */
    public static void m20085b(Context context) {
        if (context == null) {
            return;
        }
        C116971W2r.LIZ(context, f21414b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    /* renamed from: b */
    public static boolean m20086b() {
        Context m20233c = C0941a.m20233c();
        if (m20233c != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) m20233c.getSystemService("connectivity");
                if (connectivityManager == null) {
                    return true;
                }
                NetworkInfo LIZ = C116971W2r.LIZ(connectivityManager);
                if (LIZ == null) {
                    return false;
                }
                return LIZ.isConnected();
            } catch (Exception unused) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m20083c(Context context) {
        C0980b c0980b;
        if (context == null || (c0980b = f21414b) == null) {
            return;
        }
        C116971W2r.LIZ(context, c0980b);
    }
}
