package com.android.ttcjpaysdk.base.service.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class CJPayDataKeepAPI {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6542);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        try {
            Class LIZ = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", obj2.getClass().getSimpleName(), "$$CJPayData$$Index"));
            LIZ.getDeclaredMethod("autoWiredData", Object.class, Object.class).invoke(LIZ, obj, obj2);
        } catch (Exception unused) {
        }
        try {
            Class LIZ2 = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", obj2.getClass().getSuperclass().getSimpleName(), "$$CJPayData$$Index"));
            LIZ2.getDeclaredMethod("autoWiredData", Object.class, Object.class).invoke(LIZ2, obj, obj2);
        } catch (Exception unused2) {
        }
    }

    public static void restoreData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        try {
            Class LIZ = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", obj2.getClass().getSimpleName(), "$$CJPayData$$Index"));
            LIZ.getDeclaredMethod("restoreData", Object.class, Object.class).invoke(LIZ, obj, obj2);
        } catch (Exception unused) {
        }
        try {
            Class LIZ2 = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", obj2.getClass().getSuperclass().getSimpleName(), "$$CJPayData$$Index"));
            LIZ2.getDeclaredMethod("restoreData", Object.class, Object.class).invoke(LIZ2, obj, obj2);
        } catch (Exception unused2) {
        }
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        try {
            Class LIZ = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", obj2.getClass().getSimpleName(), "$$CJPayData$$Index"));
            LIZ.getDeclaredMethod("saveData", Object.class, Object.class).invoke(LIZ, obj, obj2);
        } catch (Exception unused) {
        }
        try {
            Class LIZ2 = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", obj2.getClass().getSuperclass().getSimpleName(), "$$CJPayData$$Index"));
            LIZ2.getDeclaredMethod("saveData", Object.class, Object.class).invoke(LIZ2, obj, obj2);
        } catch (Exception unused2) {
        }
    }
}
