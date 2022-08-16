package cn.com.chinatelecom.account.api.p038e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.e.h */
/* loaded from: classes2.dex */
public final class C0673h {

    /* renamed from: a */
    public static String f21026a;

    /* renamed from: b */
    public static String f21027b;

    /* renamed from: c */
    public static String f21028c;

    /* renamed from: d */
    public static String f21029d;

    /* renamed from: e */
    public static final String[] f21030e = {"46000", "46002", "46004", "46007", "46008"};

    /* renamed from: f */
    public static final String[] f21031f = {"46003", "46005", "46011"};

    /* renamed from: g */
    public static final String[] f21032g = {"46001", "46006", "46009"};

    static {
        Covode.recordClassIndex(2724);
    }

    /* renamed from: a */
    public static String m20598a() {
        return f21026a;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0053 A[RETURN] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m20596a(android.content.Context r5, boolean r6) {
        /*
            java.lang.String r5 = m20588g(r5)
            if (r5 == 0) goto L4e
            java.lang.String[] r2 = cn.com.chinatelecom.account.api.p038e.C0673h.f21031f
            r4 = 0
            r1 = 0
        La:
            r0 = r2[r1]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L17
            if (r6 == 0) goto L45
            java.lang.String r0 = "1"
            return r0
        L17:
            int r1 = r1 + 1
            r3 = 3
            if (r1 < r3) goto La
            java.lang.String[] r2 = cn.com.chinatelecom.account.api.p038e.C0673h.f21030e
            r1 = 0
        L1f:
            r0 = r2[r1]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L2c
            if (r6 == 0) goto L48
            java.lang.String r0 = "2"
            return r0
        L2c:
            int r1 = r1 + 1
            r0 = 5
            if (r1 < r0) goto L1f
            java.lang.String[] r1 = cn.com.chinatelecom.account.api.p038e.C0673h.f21032g
        L33:
            r0 = r1[r4]
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L40
            if (r6 == 0) goto L4b
            java.lang.String r0 = "3"
            return r0
        L40:
            int r4 = r4 + 1
            if (r4 >= r3) goto L4e
            goto L33
        L45:
            java.lang.String r0 = "CT"
            return r0
        L48:
            java.lang.String r0 = "CM"
            return r0
        L4b:
            java.lang.String r0 = "CU"
            return r0
        L4e:
            if (r6 == 0) goto L53
            java.lang.String r0 = "0"
            return r0
        L53:
            java.lang.String r0 = "UN"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.p038e.C0673h.m20596a(android.content.Context, boolean):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m20597a(Context context) {
        NetworkInfo m20586i = m20586i(context);
        return m20586i != null && m20586i.isAvailable();
    }

    /* renamed from: b */
    public static String m20595b() {
        return f21027b != null ? "https://open.e.189.cn/openapi/special/getTimeStamp.do".replace(C0632d.m20735a(C0667b.f20992c), f21027b) : "https://open.e.189.cn/openapi/special/getTimeStamp.do";
    }

    /* renamed from: b */
    public static boolean m20594b(Context context) {
        NetworkInfo m20586i = m20586i(context);
        return m20586i != null && m20586i.getType() == 0;
    }

    /* renamed from: c */
    public static String m20593c() {
        String str = f21028c;
        return str != null ? "https://api-e189.21cn.com/gw/client/accountMsg.do".replace("e189.21cn.com", str) : "https://api-e189.21cn.com/gw/client/accountMsg.do";
    }

    /* renamed from: c */
    public static boolean m20592c(Context context) {
        if (context == null) {
            return true;
        }
        try {
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity"), new Object[0])).booleanValue();
        } catch (Throwable th) {
            CtAuth.warn("NetUtil", "isMobileEnable error ", th);
            return true;
        }
    }

    /* renamed from: d */
    public static String m20591d(Context context) {
        int m20585j = m20585j(context);
        return m20585j != -101 ? (m20585j == -1 || m20585j == 0) ? "null" : m20585j != 1 ? m20585j != 2 ? m20585j != 3 ? m20585j != 4 ? Integer.toString(m20585j) : "5G" : "4G" : "3G" : "2G" : "WIFI";
    }

    /* renamed from: e */
    public static String m20590e(Context context) {
        String m20591d = m20591d(context);
        return (m20591d == null || !m20591d.equals("WIFI") || !m20592c(context)) ? m20591d : "BOTH";
    }

    /* renamed from: f */
    public static String m20589f(Context context) {
        String m20590e = m20590e(context);
        if (!TextUtils.isEmpty(m20590e) && !m20590e.equals("null")) {
            if (m20590e.equals("2G")) {
                return "10";
            }
            if (m20590e.equals("3G")) {
                return "11";
            }
            if (m20590e.equals("4G")) {
                return "12";
            }
            if (m20590e.equals("5G")) {
                return "16";
            }
            if (m20590e.equals("WIFI")) {
                return "13";
            }
            if (m20590e.equals("BOTH")) {
                return "14";
            }
        }
        return "15";
    }

    /* renamed from: g */
    public static String m20588g(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            return !TextUtils.isEmpty(simOperator) ? simOperator : "00000";
        } catch (Throwable th) {
            th.printStackTrace();
            return "00000";
        }
    }

    /* renamed from: h */
    public static String m20587h(Context context) {
        return m20596a(context, true);
    }

    /* renamed from: i */
    public static NetworkInfo m20586i(Context context) {
        if (context == null) {
            return null;
        }
        return C116971W2r.LIZ((ConnectivityManager) context.getSystemService("connectivity"));
    }

    /* renamed from: j */
    public static int m20585j(Context context) {
        NetworkInfo m20586i;
        int i = 0;
        try {
            m20586i = m20586i(context);
        } catch (NullPointerException e) {
            e.printStackTrace();
            return i;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (m20586i != null && m20586i.isAvailable() && m20586i.isConnected()) {
            int type = m20586i.getType();
            if (type != 1) {
                if (type == 0) {
                    try {
                        i = C116971W2r.LIZ((TelephonyManager) context.getSystemService("phone"));
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    if (i == 0) {
                        i = m20586i.getSubtype();
                    }
                    if (i != -101) {
                        if (i != -1) {
                            switch (i) {
                                case 1:
                                case 2:
                                case 4:
                                case 7:
                                case 11:
                                case 16:
                                    return 1;
                                case 3:
                                case 5:
                                case 6:
                                case 8:
                                case 9:
                                case 10:
                                case 12:
                                case 14:
                                case MotionEventCompat.AXIS_HAT_X /* 15 */:
                                case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
                                    return 2;
                                case 13:
                                case 18:
                                case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                                    return 3;
                                case 20:
                                    return 4;
                                default:
                                    return i;
                            }
                        }
                    }
                }
                return i;
            }
            return -101;
        }
        return -1;
    }
}
