package com.android.ttcjpaysdk.thirdparty.balancerecharge.p162a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.thirdparty.balance.p161f.C2299a;
import com.android.ttcjpaysdk.thirdparty.balancerecharge.p163b.C2303a;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC136249cO4;
import p003X.AbstractC136266cOL;
import p003X.AbstractC136285cOe;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C136246cO1;
import p003X.C136250cO5;
import p003X.C136265cOK;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancerecharge.a.a */
/* loaded from: classes17.dex */
public final class C2301a extends AbstractC136266cOL<C2299a, C2303a> {
    public static ChangeQuickRedirect LJIIJ;
    public volatile boolean LJIIJJI;
    public HashMap LJIIL;

    static {
        Covode.recordClassIndex(8025);
    }

    @Override // p003X.AbstractC136266cOL, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 9).isSupported && (hashMap = this.LJIIL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "零钱充值收银台";
    }

    @Override // p003X.AbstractC136266cOL
    public final void LJIILIIL() {
        this.LJIIJJI = false;
    }

    @Override // p003X.AbstractC136266cOL
    public final String LJIILJJIL() {
        return "recharge";
    }

    @Override // p003X.AbstractC136266cOL, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 10).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 3).isSupported) {
            return;
        }
        AbstractC136249cO4 abstractC136249cO4 = ((AbstractC136266cOL) this).LIZIZ;
        if (!(abstractC136249cO4 instanceof C136250cO5)) {
            abstractC136249cO4 = null;
        }
        if (abstractC136249cO4 != null) {
            abstractC136249cO4.LIZLLL();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        C136250cO5 c136250cO5;
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 2);
        if (proxy.isSupported) {
            c136250cO5 = (C136250cO5) proxy.result;
        } else {
            View LIZ = C116971W2r.LIZ(LayoutInflater.from(view.getContext()), 2131690685, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            c136250cO5 = new C136250cO5(LIZ, view, new C136265cOK(this));
        }
        ((AbstractC136266cOL) this).LIZIZ = c136250cO5;
        AbstractC136249cO4 abstractC136249cO4 = ((AbstractC136266cOL) this).LIZIZ;
        if (!(abstractC136249cO4 instanceof C136250cO5)) {
            abstractC136249cO4 = null;
        }
        if (abstractC136249cO4 != null) {
            abstractC136249cO4.LIZJ();
        }
    }

    @Override // p003X.AbstractC136266cOL
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJ, false, 4).isSupported) {
            return;
        }
        if (i == 0) {
            if (this.LJIIJJI) {
                this.LJIIJJI = false;
                CJPayCard cJPayCard = C136246cO1.f18003LJ;
                if (cJPayCard != null && cJPayCard.isCardInactive()) {
                    AbstractC136285cOe abstractC136285cOe = (AbstractC136285cOe) LIZ(AbstractC136285cOe.class);
                    if (abstractC136285cOe != null) {
                        abstractC136285cOe.LIZ(true);
                        return;
                    }
                    return;
                }
                AbstractC136285cOe abstractC136285cOe2 = (AbstractC136285cOe) LIZ(AbstractC136285cOe.class);
                if (abstractC136285cOe2 != null) {
                    abstractC136285cOe2.LIZ();
                    return;
                }
                return;
            }
            return;
        }
        this.LJIIJJI = false;
    }
}
