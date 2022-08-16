package com.bytedance.android.btm.impl.p221b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.G4Y;

/* renamed from: com.bytedance.android.btm.impl.b.d */
/* loaded from: classes18.dex */
public final class C2650d {
    public static ChangeQuickRedirect LIZ;
    public SharedPreferences LIZIZ;
    public SharedPreferences.Editor LIZJ;

    static {
        Covode.recordClassIndex(11381);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LIZJ.remove(str);
        this.LIZJ.apply();
    }

    public C2650d(Context context, String str) {
        C106862S5w.LIZ(context, str);
        SharedPreferences LIZ2 = G4Y.LIZ(context, str, 0);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
        SharedPreferences.Editor edit = this.LIZIZ.edit();
        Intrinsics.checkNotNullExpressionValue(edit, "");
        this.LIZJ = edit;
    }

    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZJ.putString(str, str2);
        this.LIZJ.commit();
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ.putString(str, str2);
        this.LIZJ.apply();
    }

    public final String LIZJ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.LIZIZ.getString(str, str2);
    }
}
