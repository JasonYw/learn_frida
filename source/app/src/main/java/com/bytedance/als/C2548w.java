package com.bytedance.als;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scene.group.AbstractC13981b;
import kotlin.TypeCastException;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.R5V;

/* renamed from: com.bytedance.als.w */
/* loaded from: classes9.dex */
public final class C2548w extends AbstractC13981b {
    public static ChangeQuickRedirect LIZ;
    public R5V LIZIZ;

    static {
        Covode.recordClassIndex(10107);
    }

    @Override // com.bytedance.scene.group.AbstractC13981b
    public final void cW_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.cW_();
        R5V r5v = this.LIZIZ;
        if (r5v != null) {
            r5v.LIZ();
        }
    }

    @Override // com.bytedance.scene.group.AbstractC13981b
    public final void cX_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.cX_();
        R5V r5v = this.LIZIZ;
        if (r5v != null) {
            r5v.LIZIZ();
        }
    }

    @Override // com.bytedance.scene.group.AbstractC13981b
    /* renamed from: f_ */
    public final void mo14228f_() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.mo14228f_();
        R5V r5v = this.LIZIZ;
        if (r5v != null) {
            r5v.LIZJ();
        }
    }

    @Override // com.bytedance.scene.AbstractC13985k
    public final void LIZ(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.LIZ(bundle);
    }

    @Override // com.bytedance.scene.group.AbstractC13981b, com.bytedance.scene.AbstractC13985k
    public final /* synthetic */ View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LIZIZ(layoutInflater, viewGroup, bundle);
    }

    @Override // com.bytedance.scene.group.AbstractC13981b
    public final ViewGroup LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (ViewGroup) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater, viewGroup);
        View LIZ2 = C116971W2r.LIZ(layoutInflater, m14226g_().getInt("layoutId"), viewGroup, false);
        if (LIZ2 != null) {
            return (ViewGroup) LIZ2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
