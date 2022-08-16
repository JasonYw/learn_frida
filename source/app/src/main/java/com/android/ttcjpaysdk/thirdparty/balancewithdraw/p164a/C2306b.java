package com.android.ttcjpaysdk.thirdparty.balancewithdraw.p164a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.thirdparty.balance.data.CJPayBalanceTradeInfo;
import com.android.ttcjpaysdk.thirdparty.balance.data.CJPayBalanceTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.android.ttcjpaysdk.thirdparty.balance.p161f.C2299a;
import com.android.ttcjpaysdk.thirdparty.balancewithdraw.p165b.C2308b;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.android.ttcjpaysdk.thirdparty.data.CJPayUserInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC136297cOq;
import p003X.AbstractC136299cOs;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135465cBQ;
import p003X.C136240cNv;
import p003X.C136246cO1;
import p003X.C136294cOn;
import p003X.C136295cOo;
import p003X.C136296cOp;
import p003X.C136298cOr;
import p003X.C136301cOu;
import p003X.C136342cPZ;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancewithdraw.a.b */
/* loaded from: classes17.dex */
public final class C2306b extends AbstractC136297cOq<C2299a, C2308b> {
    public static ChangeQuickRedirect LJIIJ;
    public long LJIIJJI;
    public HashMap LJIIL;

    static {
        Covode.recordClassIndex(8055);
    }

    @Override // p003X.AbstractC136297cOq, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP
    public final void LIZ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 10).isSupported && (hashMap = this.LJIIL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "零钱提现收银台";
    }

    @Override // p003X.AbstractC136297cOq
    public final String LJIIIZ() {
        return "withdraw";
    }

    @Override // p003X.AbstractC136297cOq, p003X.AbstractC136027cKU, p003X.AbstractC136022cKP, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 11).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        C136342cPZ c136342cPZ;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 6).isSupported) {
            return;
        }
        super.onPause();
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (abstractC136299cOs != null && (c136342cPZ = abstractC136299cOs.LIZJ) != null) {
            c136342cPZ.m21737LJ();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        C136342cPZ c136342cPZ;
        C136342cPZ c136342cPZ2;
        if (PatchProxy.proxy(new Object[0], this, LJIIJ, false, 5).isSupported) {
            return;
        }
        super.onResume();
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (abstractC136299cOs != null && (c136342cPZ2 = abstractC136299cOs.LIZJ) != null) {
            c136342cPZ2.LIZLLL();
        }
        AbstractC136299cOs abstractC136299cOs2 = ((AbstractC136297cOq) this).LIZIZ;
        if (abstractC136299cOs2 != null && (c136342cPZ = abstractC136299cOs2.LIZJ) != null) {
            c136342cPZ.LIZJ();
        }
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [boolean, int] */
    @Override // p003X.AbstractC136297cOq
    public final void LJIIIIZZ() {
        C2297a c2297a;
        long j;
        String str;
        String str2;
        String str3;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo2;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo3;
        CJPayBalanceTradeInfo cJPayBalanceTradeInfo4;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJ, false, 8).isSupported && (c2297a = this.LJFF) != null) {
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean != null && (cJPayBalanceTradeInfo4 = cJPayBalanceTradeQueryResponseBean.trade_info) != null) {
                j = cJPayBalanceTradeInfo4.trade_amount;
            } else {
                j = 0;
            }
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean2 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean2 != null && (cJPayBalanceTradeInfo3 = cJPayBalanceTradeQueryResponseBean2.trade_info) != null) {
                str = cJPayBalanceTradeInfo3.trade_status;
            } else {
                str = null;
            }
            ?? areEqual = Intrinsics.areEqual("SUCCESS", str);
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean3 = C136246cO1.LIZLLL;
            String str4 = "";
            if (cJPayBalanceTradeQueryResponseBean3 == null || (cJPayBalanceTradeInfo2 = cJPayBalanceTradeQueryResponseBean3.trade_info) == null || (str2 = cJPayBalanceTradeInfo2.trade_status) == null) {
                str2 = str4;
            }
            CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean4 = C136246cO1.LIZLLL;
            if (cJPayBalanceTradeQueryResponseBean4 == null || (cJPayBalanceTradeInfo = cJPayBalanceTradeQueryResponseBean4.trade_info) == null || (str3 = cJPayBalanceTradeInfo.trade_status_desc_msg) == null) {
                str3 = str4;
            }
            if (!PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(areEqual == true ? 1 : 0), str2, str3}, c2297a, C2308b.LIZIZ, false, 1).isSupported) {
                C2118a LIZ = C2118a.LIZ();
                JSONObject[] jSONObjectArr = new JSONObject[1];
                JSONObject LIZ2 = c2297a.LIZ(j);
                C135465cBQ.LIZ(LIZ2, "loading_time", 1);
                C135465cBQ.LIZ(LIZ2, "tixian_result", Integer.valueOf((int) areEqual));
                if (TextUtils.isEmpty(str2)) {
                    str2 = str4;
                }
                C135465cBQ.LIZ(LIZ2, "error_code", str2);
                if (!TextUtils.isEmpty(str3)) {
                    str4 = str3;
                }
                C135465cBQ.LIZ(LIZ2, PushMessageHelper.ERROR_MESSAGE, str4);
                jSONObjectArr[0] = c2297a.LIZ(LIZ2);
                LIZ.LIZ("wallet_tixian_confirm", jSONObjectArr);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 3).isSupported) {
            return;
        }
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (!(abstractC136299cOs instanceof C136301cOu)) {
            abstractC136299cOs = null;
        }
        if (abstractC136299cOs != null) {
            abstractC136299cOs.LIZIZ();
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        C136301cOu c136301cOu;
        if (PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LJIIJ, false, 2);
        if (proxy.isSupported) {
            c136301cOu = (C136301cOu) proxy.result;
        } else {
            View LIZ = C116971W2r.LIZ(LayoutInflater.from(view.getContext()), 2131690695, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            c136301cOu = new C136301cOu(LIZ, view, new C136240cNv(this));
        }
        ((AbstractC136297cOq) this).LIZIZ = c136301cOu;
        AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
        if (!(abstractC136299cOs instanceof C136301cOu)) {
            abstractC136299cOs = null;
        }
        if (abstractC136299cOs != null) {
            abstractC136299cOs.LIZ();
        }
        this.LJIIJJI = System.currentTimeMillis();
    }

    @Override // p003X.AbstractC136297cOq
    public final void LIZJ(CJPayBalanceTradeQueryResponseBean cJPayBalanceTradeQueryResponseBean) {
        C2297a c2297a;
        CJPayUserInfo cJPayUserInfo;
        if (!PatchProxy.proxy(new Object[]{cJPayBalanceTradeQueryResponseBean}, this, LJIIJ, false, 4).isSupported && cJPayBalanceTradeQueryResponseBean != null) {
            C2342n c2342n = C136246cO1.LIZJ;
            if (c2342n != null && (cJPayUserInfo = c2342n.user_info) != null) {
                cJPayUserInfo.balance_amount = cJPayBalanceTradeQueryResponseBean.user_info.balance_amount;
            }
            AbstractC136299cOs abstractC136299cOs = ((AbstractC136297cOq) this).LIZIZ;
            if (!(abstractC136299cOs instanceof C136301cOu)) {
                abstractC136299cOs = null;
            }
            C136301cOu c136301cOu = (C136301cOu) abstractC136299cOs;
            if (c136301cOu != null && !PatchProxy.proxy(new Object[]{cJPayBalanceTradeQueryResponseBean}, c136301cOu, C136301cOu.f18009LJ, false, 3).isSupported) {
                C136298cOr c136298cOr = c136301cOu.LJFF;
                if (c136298cOr != null) {
                    c136298cOr.LIZ(cJPayBalanceTradeQueryResponseBean);
                }
                C136295cOo c136295cOo = c136301cOu.LJI;
                if (c136295cOo != null) {
                    c136295cOo.LIZ(cJPayBalanceTradeQueryResponseBean);
                }
                C136296cOp c136296cOp = c136301cOu.LJII;
                if (c136296cOp != null) {
                    c136296cOp.LIZ(cJPayBalanceTradeQueryResponseBean);
                }
            }
            LIZIZ(cJPayBalanceTradeQueryResponseBean);
            if (!TextUtils.isEmpty(cJPayBalanceTradeQueryResponseBean.result_page_show_conf.withdraw_result_page_desc) && (c2297a = this.LJFF) != null) {
                long j = cJPayBalanceTradeQueryResponseBean.trade_info.trade_amount;
                if (!PatchProxy.proxy(new Object[]{new Long(j)}, c2297a, C2308b.LIZIZ, false, 8).isSupported) {
                    C2118a.LIZ().LIZ("wallet_tixian_progress_reason_imp", c2297a.LIZ(c2297a.LIZ(j)));
                }
            }
            C2297a c2297a2 = this.LJFF;
            if (c2297a2 != null) {
                String LIZJ = C136294cOn.LIZIZ.LIZJ(cJPayBalanceTradeQueryResponseBean.trade_info.trade_status);
                String str = cJPayBalanceTradeQueryResponseBean.trade_info.fail_msg;
                long j2 = cJPayBalanceTradeQueryResponseBean.trade_info.trade_amount;
                if (!PatchProxy.proxy(new Object[]{LIZJ, str, new Long(j2)}, c2297a2, C2308b.LIZIZ, false, 2).isSupported) {
                    C2118a LIZ = C2118a.LIZ();
                    JSONObject[] jSONObjectArr = new JSONObject[1];
                    JSONObject LIZ2 = c2297a2.LIZ(j2);
                    if (TextUtils.isEmpty(LIZJ)) {
                        LIZJ = "";
                    }
                    C135465cBQ.LIZ(LIZ2, "status", LIZJ);
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                    C135465cBQ.LIZ(LIZ2, "reason_type", str);
                    jSONObjectArr[0] = c2297a2.LIZ(LIZ2);
                    LIZ.LIZ("wallet_tixian_progress_imp", jSONObjectArr);
                }
            }
        }
    }
}
