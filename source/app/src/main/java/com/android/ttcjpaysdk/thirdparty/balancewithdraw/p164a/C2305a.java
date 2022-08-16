package com.android.ttcjpaysdk.thirdparty.balancewithdraw.p164a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.android.ttcjpaysdk.thirdparty.balance.p161f.C2299a;
import com.android.ttcjpaysdk.thirdparty.balancewithdraw.p165b.C2307a;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC136249cO4;
import p003X.AbstractC136266cOL;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135366c9p;
import p003X.C135465cBQ;
import p003X.C136246cO1;
import p003X.C136251cO6;
import p003X.C136267cOM;
import p003X.C136292cOl;
import p003X.DialogC137460chc;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancewithdraw.a.a */
/* loaded from: classes17.dex */
public final class C2305a extends AbstractC136266cOL<C2299a, C2307a> {
    public static ChangeQuickRedirect LJIIJ;
    public boolean LJIIJJI;
    public DialogC137460chc LJIIL;
    public long LJIILIIL;
    public HashMap LJIILJJIL;

    static {
        Covode.recordClassIndex(8051);
    }

    @Override // p003X.AbstractC136266cOL, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 10).isSupported && (hashMap = this.LJIILJJIL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "零钱提现收银台";
    }

    @Override // p003X.AbstractC136266cOL
    public final void LJIILIIL() {
    }

    @Override // p003X.AbstractC136266cOL
    public final String LJIILJJIL() {
        return "withdraw";
    }

    @Override // p003X.AbstractC136266cOL, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 11).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 4).isSupported) {
            return;
        }
        AbstractC136249cO4 abstractC136249cO4 = ((AbstractC136266cOL) this).LIZIZ;
        if (!(abstractC136249cO4 instanceof C136251cO6)) {
            abstractC136249cO4 = null;
        }
        if (abstractC136249cO4 != null) {
            abstractC136249cO4.LIZLLL();
        }
    }

    public final void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJ, false, 5).isSupported) {
            return;
        }
        AbstractC136249cO4 abstractC136249cO4 = ((AbstractC136266cOL) this).LIZIZ;
        if (!(abstractC136249cO4 instanceof C136251cO6)) {
            abstractC136249cO4 = null;
        }
        C136251cO6 c136251cO6 = (C136251cO6) abstractC136249cO4;
        if (c136251cO6 != null) {
            c136251cO6.LIZ(i);
        }
    }

    @Override // p003X.AbstractC136266cOL
    public final void LIZIZ(int i) {
        C2297a c2297a;
        String str;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJ, false, 3).isSupported && i == 0 && (c2297a = this.LJFF) != null) {
            AbstractC136249cO4 abstractC136249cO4 = ((AbstractC136266cOL) this).LIZIZ;
            if (abstractC136249cO4 != null) {
                str = abstractC136249cO4.LIZIZ();
            } else {
                str = null;
            }
            if (!PatchProxy.proxy(new Object[]{str}, c2297a, C2307a.LIZIZ, false, 4).isSupported) {
                C2118a.LIZ().LIZ("wallet_tixian_cardselect_change", c2297a.LIZ(c2297a.LIZIZ(str)));
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        C136251cO6 c136251cO6;
        C136292cOl c136292cOl;
        C135366c9p c135366c9p;
        String str;
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 2);
        String str2 = "";
        String str3 = null;
        if (proxy.isSupported) {
            c136251cO6 = (C136251cO6) proxy.result;
        } else {
            View LIZ = C116971W2r.LIZ(LayoutInflater.from(view.getContext()), 2131690693, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(LIZ, str2);
            c136251cO6 = new C136251cO6(LIZ, view, new C136267cOM(this));
        }
        ((AbstractC136266cOL) this).LIZIZ = c136251cO6;
        AbstractC136249cO4 abstractC136249cO4 = ((AbstractC136266cOL) this).LIZIZ;
        if (!(abstractC136249cO4 instanceof C136251cO6)) {
            abstractC136249cO4 = null;
        }
        if (abstractC136249cO4 != null) {
            abstractC136249cO4.LIZJ();
        }
        this.LJIILIIL = LIZ("CJPayKeyWithdrawStartTimeParams", 0L);
        C2297a c2297a = this.LJFF;
        if (c2297a != null) {
            AbstractC136249cO4 abstractC136249cO42 = ((AbstractC136266cOL) this).LIZIZ;
            if (abstractC136249cO42 != null) {
                str3 = abstractC136249cO42.LIZIZ();
            }
            long j = this.LJIILIIL;
            if (!PatchProxy.proxy(new Object[]{str3, new Long(j)}, c2297a, C2307a.LIZIZ, false, 1).isSupported) {
                C2118a LIZ2 = C2118a.LIZ();
                JSONObject[] jSONObjectArr = new JSONObject[1];
                JSONObject LIZIZ = c2297a.LIZIZ(str3);
                if (j != 0) {
                    C135465cBQ.LIZ(LIZIZ, "loading_time", String.valueOf(System.currentTimeMillis() - j));
                }
                C2342n c2342n = C136246cO1.LIZJ;
                if (c2342n != null && (c136292cOl = c2342n.cashdesk_show_conf) != null && (c135366c9p = c136292cOl.notice_info) != null && (str = c135366c9p.notice) != null) {
                    str2 = str;
                }
                C135465cBQ.LIZ(LIZIZ, "is_paytype_notice_show", Integer.valueOf(1 ^ (TextUtils.isEmpty(str2) ? 1 : 0)));
                C135465cBQ.LIZ(LIZIZ, "is_tixian_record_show", 0);
                jSONObjectArr[0] = c2297a.LIZ(LIZIZ);
                LIZ2.LIZ("wallet_tixian_imp", jSONObjectArr);
            }
        }
    }
}
