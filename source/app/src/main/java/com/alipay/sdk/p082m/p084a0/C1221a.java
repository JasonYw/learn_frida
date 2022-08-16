package com.alipay.sdk.p082m.p084a0;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.a0.a */
/* loaded from: classes2.dex */
public final class C1221a {

    /* renamed from: a */
    public static C1221a f22062a = new C1221a();

    static {
        Covode.recordClassIndex(4721);
    }

    /* renamed from: a */
    public static C1221a m19424a() {
        return f22062a;
    }

    /* renamed from: a */
    public static String m19423a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
