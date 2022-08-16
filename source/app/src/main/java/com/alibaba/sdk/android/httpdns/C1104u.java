package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.sdk.android.httpdns.net64.C1084a;
import com.alibaba.sdk.android.httpdns.p071b.C1035b;
import com.alibaba.sdk.android.httpdns.p073d.C1051b;
import com.alibaba.sdk.android.httpdns.p073d.C1066c;
import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import com.xiaomi.mipush.sdk.Constants;
import java.net.SocketTimeoutException;
import p002O.C0002O;
import p003X.G4Y;

/* renamed from: com.alibaba.sdk.android.httpdns.u */
/* loaded from: classes19.dex */
public class C1104u {

    /* renamed from: a */
    public static SharedPreferences f21689a;

    /* renamed from: a */
    public static EnumC1105a f21690a = EnumC1105a.ENABLE;

    /* renamed from: d */
    public static boolean f21691d;

    /* renamed from: e */
    public static long f21692e;

    /* renamed from: g */
    public static volatile int f21693g;

    /* renamed from: h */
    public static volatile int f21694h;

    /* renamed from: l */
    public static boolean f21695l;

    /* renamed from: com.alibaba.sdk.android.httpdns.u$a */
    /* loaded from: classes10.dex */
    public enum EnumC1105a {
        ENABLE,
        PRE_DISABLE,
        DISABLE;

        static {
            Covode.recordClassIndex(4514);
        }
    }

    static {
        Covode.recordClassIndex(4513);
    }

    /* renamed from: a */
    public static synchronized String m19818a(EnumC1102s enumC1102s) {
        synchronized (C1104u.class) {
            try {
                if (enumC1102s != EnumC1102s.QUERY_HOST && enumC1102s != EnumC1102s.SNIFF_HOST) {
                    return (enumC1102s == EnumC1102s.QUERY_SCHEDULE_CENTER || enumC1102s == EnumC1102s.SNIFF_SCHEDULE_CENTER) ? null : null;
                } else if (f21690a == EnumC1105a.ENABLE || f21690a == EnumC1105a.PRE_DISABLE) {
                    return C1071f.f21605a[f21693g];
                } else if (enumC1102s == EnumC1102s.QUERY_HOST) {
                    return null;
                } else {
                    return C1071f.f21605a[f21693g];
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m19819a(Context context) {
        synchronized (C1104u.class) {
            if (!f21691d) {
                synchronized (C1104u.class) {
                    if (!f21691d) {
                        if (context != null) {
                            f21689a = G4Y.LIZ(context, "httpdns_config_cache", 0);
                        }
                        f21695l = f21689a.getBoolean("status", false);
                        int i = f21689a.getInt("activiate_ip_index", 0);
                        f21693g = i;
                        f21694h = i;
                        f21692e = f21689a.getLong("disable_modified_time", 0L);
                        if (System.currentTimeMillis() - f21692e >= C15151a.f30809f) {
                            m19811d(false);
                        }
                        f21690a = f21695l ? EnumC1105a.DISABLE : EnumC1105a.ENABLE;
                        f21691d = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m19817a(String str, String str2, long j) {
        synchronized (C1104u.class) {
            try {
                m19812b(str, str2, j);
                reportHttpDnsSuccess(str, 1);
                if (f21690a != EnumC1105a.ENABLE && str2 != null && str2.equals(C1071f.f21605a[f21693g])) {
                    new StringBuilder();
                    C1074i.m19880f(C0002O.m25086C(f21690a == EnumC1105a.DISABLE ? "Disable " : "Pre_disable ", "mode finished. Enter enable mode."));
                    f21690a = EnumC1105a.ENABLE;
                    m19811d(false);
                    C1103t.m19825a().m19821g();
                    f21694h = f21693g;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m19816a(String str, String str2, Throwable th) {
        synchronized (C1104u.class) {
            try {
                m19815a(str2, th);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (m19814a(th) && str2 != null && str2.equals(C1071f.f21605a[f21693g])) {
                m19809h();
                if (f21694h == f21693g) {
                    C1103t.m19825a().m19823c(false);
                    C1082n.m19871a().m19864c();
                }
                if (f21690a == EnumC1105a.ENABLE) {
                    f21690a = EnumC1105a.PRE_DISABLE;
                    C1074i.m19880f("enter pre_disable mode");
                } else if (f21690a == EnumC1105a.PRE_DISABLE) {
                    f21690a = EnumC1105a.DISABLE;
                    C1074i.m19880f("enter disable mode");
                    m19811d(true);
                    m19808h(str);
                    C1103t.m19825a().m19820g(str);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m19815a(String str, Throwable th) {
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            int m19900a = C1066c.m19900a(th);
            m19921a.m19913a(str, String.valueOf(m19900a), C1066c.m19899a(th), C1066c.m19901a(), C1084a.m19856a().m19852i() ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static boolean m19814a(Throwable th) {
        if (th instanceof SocketTimeoutException) {
            return true;
        }
        if (th instanceof C1073h) {
            C1073h c1073h = (C1073h) th;
            if (c1073h.getErrorCode() == 403 && c1073h.getMessage().equals("ServiceLevelDeny")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m19813b(int i) {
        if (f21689a == null || i < 0 || i >= C1071f.f21605a.length) {
            return;
        }
        f21693g = i;
        SharedPreferences.Editor edit = f21689a.edit();
        edit.putInt("activiate_ip_index", i);
        edit.putLong("activiated_ip_index_modified_time", System.currentTimeMillis());
        edit.commit();
    }

    /* renamed from: b */
    public static void m19812b(String str, String str2, long j) {
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            m19921a.m19910b(str2, j, C1066c.m19901a());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static synchronized void m19811d(boolean z) {
        synchronized (C1104u.class) {
            if (f21695l != z) {
                f21695l = z;
                if (f21689a != null) {
                    SharedPreferences.Editor edit = f21689a.edit();
                    edit.putBoolean("status", f21695l);
                    edit.putLong("disable_modified_time", System.currentTimeMillis());
                    edit.commit();
                }
            }
        }
    }

    /* renamed from: e */
    public static synchronized boolean m19810e() {
        boolean z;
        synchronized (C1104u.class) {
            z = f21695l;
        }
        return z;
    }

    /* renamed from: h */
    public static void m19809h() {
        f21693g = f21693g == C1071f.f21605a.length + (-1) ? 0 : f21693g + 1;
        m19813b(f21693g);
    }

    /* renamed from: h */
    public static void m19808h(String str) {
        int i;
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            String m19862d = C1082n.m19871a().m19862d();
            int i2 = f21693g;
            if (i2 == 0) {
                i2 = C1071f.f21605a.length;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                i = C1071f.f21605a.length - 1;
            } else {
                i = i3 - 1;
                if (i3 < 0) {
                    return;
                }
            }
            if (i3 >= C1071f.f21605a.length || i < 0 || i >= C1071f.f21605a.length) {
                return;
            }
            String str2 = C1071f.f21605a[i3];
            String str3 = C1071f.f21605a[i];
            new StringBuilder();
            m19921a.m19909b(str, m19862d, C0002O.m25085C(str3, Constants.ACCEPT_TIME_SEPARATOR_SP, str2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m19807i() {
        m19813b(0);
        f21694h = f21693g;
        C1103t.m19825a().m19823c(true);
    }

    /* renamed from: j */
    public static void m19806j() {
        C1103t.m19825a().m19823c(true);
    }

    public static void reportHttpDnsSuccess(String str, int i) {
        try {
            C1051b m19921a = C1051b.m19921a();
            if (m19921a == null) {
                return;
            }
            m19921a.m19917a(str, i, C1066c.m19901a(), C1035b.m19977a() ? 1 : 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
