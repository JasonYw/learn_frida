package com.alibaba.sdk.android.httpdns.p071b;

import android.content.Context;
import com.alibaba.sdk.android.httpdns.p072c.C1043a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.b */
/* loaded from: classes19.dex */
public class C1035b {

    /* renamed from: a */
    public static AbstractC1039f f21533a;

    /* renamed from: a */
    public static C1043a f21534a;

    /* renamed from: a */
    public static boolean f21535a;

    /* renamed from: n */
    public static boolean f21536n = true;

    static {
        Covode.recordClassIndex(4441);
    }

    /* renamed from: a */
    public static List<C1038e> m19978a() {
        ArrayList arrayList = new ArrayList();
        if (!f21535a) {
            return arrayList;
        }
        arrayList.addAll(f21533a.mo19949a());
        return arrayList;
    }

    /* renamed from: a */
    public static void m19976a(Context context) {
        m19975a(context, (C1043a) null);
    }

    /* renamed from: a */
    public static void m19975a(Context context, C1043a c1043a) {
        f21533a = new C1034a(context);
        f21534a = c1043a;
        if (c1043a == null) {
            f21534a = C1043a.m19945a();
        }
    }

    /* renamed from: a */
    public static void m19974a(C1038e c1038e) {
        if (c1038e == null) {
            return;
        }
        f21533a.mo19948a(c1038e);
    }

    /* renamed from: a */
    public static void m19973a(boolean z, boolean z2) {
        f21535a = z;
        f21536n = z2;
    }

    /* renamed from: a */
    public static boolean m19977a() {
        return f21535a;
    }

    /* renamed from: b */
    public static void m19972b(Context context) {
        if (context != null) {
            f21534a.m19941c(context);
        }
    }

    /* renamed from: b */
    public static void m19971b(C1038e c1038e) {
        if (c1038e == null) {
            return;
        }
        f21533a.mo19947b(c1038e);
    }

    /* renamed from: g */
    public static boolean m19970g() {
        return f21536n;
    }

    /* renamed from: i */
    public static String m19969i() {
        return f21534a.m19938i();
    }
}
