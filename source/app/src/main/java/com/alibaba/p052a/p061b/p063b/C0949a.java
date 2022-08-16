package com.alibaba.p052a.p061b.p063b;

import android.text.TextUtils;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p066e.C0999b;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* renamed from: com.alibaba.a.b.b.a */
/* loaded from: classes13.dex */
public class C0949a {

    /* renamed from: a */
    public static volatile long f21321a;

    /* renamed from: b */
    public static long f21322b;

    /* renamed from: c */
    public static long f21323c;

    /* renamed from: d */
    public static int f21324d;

    /* renamed from: e */
    public static long f21325e;

    /* renamed from: f */
    public static long f21326f;

    /* renamed from: g */
    public static long f21327g;

    /* renamed from: h */
    public static long f21328h;

    /* renamed from: i */
    public static long f21329i;

    /* renamed from: j */
    public static long f21330j;

    /* renamed from: k */
    public static int f21331k;

    /* renamed from: l */
    public static int f21332l;

    /* renamed from: m */
    public static long f21333m;

    /* renamed from: n */
    public static long f21334n;

    /* renamed from: o */
    public static long f21335o;

    /* renamed from: p */
    public static long f21336p;

    /* renamed from: q */
    public static long f21337q;

    /* renamed from: r */
    public static long f21338r;

    /* renamed from: s */
    public static long f21339s;

    /* renamed from: t */
    public static long f21340t;

    /* renamed from: u */
    public static long f21341u;

    /* renamed from: v */
    public static long f21342v;

    /* renamed from: w */
    public static long f21343w;

    /* renamed from: x */
    public static long f21344x;

    /* renamed from: y */
    public static StringBuilder f21345y = new StringBuilder();

    static {
        Covode.recordClassIndex(4259);
    }

    /* renamed from: a */
    public static synchronized void m20190a() {
        synchronized (C0949a.class) {
            f21325e++;
        }
    }

    /* renamed from: a */
    public static synchronized void m20189a(int i) {
        synchronized (C0949a.class) {
            f21324d += i;
        }
    }

    /* renamed from: a */
    public static synchronized void m20188a(String str) {
        synchronized (C0949a.class) {
            if (m20182c(str)) {
                return;
            }
            if ("65501".equalsIgnoreCase(str)) {
                f21344x++;
            } else if ("65133".equalsIgnoreCase(str)) {
                f21342v++;
            } else if ("65502".equalsIgnoreCase(str)) {
                f21343w++;
            } else if ("65503".equalsIgnoreCase(str)) {
                f21341u++;
            }
            f21321a++;
        }
    }

    /* renamed from: a */
    public static synchronized void m20187a(List<C0999b> list, int i) {
        synchronized (C0949a.class) {
            if (list == null) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C0999b c0999b = list.get(i3);
                if (c0999b != null) {
                    if (!"6005".equalsIgnoreCase(c0999b.f21474b)) {
                        i2++;
                    }
                    f21345y.append(c0999b.f21477e);
                    if (i3 != list.size() - 1) {
                        f21345y.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                }
            }
            C0974i.m20098a("CoreStatics", "[uploadInc]:", Long.valueOf(f21323c), "count:", Integer.valueOf(i));
            f21323c += i;
            C0974i.m20098a("CoreStatics", "[uploadInc]:", Long.valueOf(f21323c));
            if (i2 != i) {
                C0974i.m20100a("CoreStatics", "Mutil Process Upload Error");
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m20186a(boolean z) {
        synchronized (C0949a.class) {
        }
    }

    /* renamed from: b */
    public static synchronized void m20185b() {
        synchronized (C0949a.class) {
            f21326f++;
        }
    }

    /* renamed from: b */
    public static synchronized void m20184b(String str) {
        synchronized (C0949a.class) {
            if (m20182c(str)) {
                return;
            }
            f21322b++;
        }
    }

    /* renamed from: c */
    public static synchronized void m20183c() {
        synchronized (C0949a.class) {
            f21333m++;
        }
    }

    /* renamed from: c */
    public static boolean m20182c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "6005".equalsIgnoreCase(str.trim());
    }

    /* renamed from: d */
    public static synchronized void m20181d() {
        synchronized (C0949a.class) {
            f21334n++;
        }
    }

    /* renamed from: e */
    public static synchronized void m20180e() {
        synchronized (C0949a.class) {
            f21335o++;
        }
    }

    /* renamed from: f */
    public static synchronized void m20179f() {
        synchronized (C0949a.class) {
            f21336p++;
        }
    }

    /* renamed from: g */
    public static synchronized void m20178g() {
        synchronized (C0949a.class) {
            f21337q++;
        }
    }

    /* renamed from: h */
    public static synchronized void m20177h() {
        synchronized (C0949a.class) {
            f21338r++;
        }
    }

    /* renamed from: i */
    public static synchronized void m20176i() {
        synchronized (C0949a.class) {
            f21339s++;
        }
    }

    /* renamed from: j */
    public static synchronized void m20175j() {
        synchronized (C0949a.class) {
            f21340t++;
        }
    }

    /* renamed from: k */
    public static synchronized void m20174k() {
        synchronized (C0949a.class) {
            f21332l++;
            if (f21321a == 0 && f21323c == 0) {
                return;
            }
            if (C0941a.f21273a || f21332l >= 6) {
                m20186a(true);
            }
        }
    }
}
