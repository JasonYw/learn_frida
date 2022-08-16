package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.android.phone.mrpc.core.s */
/* loaded from: classes2.dex */
public final class C1172s {

    /* renamed from: a */
    public static Boolean f21934a;

    static {
        Covode.recordClassIndex(4643);
    }

    /* renamed from: a */
    public static final boolean m19600a(Context context) {
        Boolean bool = f21934a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f21934a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }
}
