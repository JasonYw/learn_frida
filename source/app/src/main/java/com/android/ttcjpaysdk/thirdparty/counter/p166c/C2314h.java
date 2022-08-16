package com.android.ttcjpaysdk.thirdparty.counter.p166c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayResultGuideInfo;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.counter.data.CJPayCounterTradeQueryResponseBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayTradeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC135416cAd;
import p003X.C106862S5w;
import p003X.C135377cA0;
import p003X.C135394cAH;
import p003X.C135415cAc;
import p003X.C135418cAf;
import p003X.C135419cAg;
import p003X.C135439cB0;
import p003X.C136415cQk;
import p003X.C136438cR7;
import p003X.RunnableC135420cAh;
import p003X.RunnableC135436cAx;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.h */
/* loaded from: classes17.dex */
public final class C2314h extends CJPayBaseFragment {
    public static ChangeQuickRedirect LIZ;
    public AbstractC135416cAd LIZIZ;
    public C135377cA0 LIZJ;
    public CJPayCounterTradeQueryResponseBean LIZLLL;

    /* renamed from: LJ */
    public String f25516LJ = "";
    public JSONObject LJFF;
    public int LJIIJ;
    public ICJPayFingerprintService LJIIJJI;
    public HashMap LJIIL;

    static {
        Covode.recordClassIndex(8178);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690607;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final String LJI() {
        return "支付收银台";
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIIJJI = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
        ICJPayFingerprintService iCJPayFingerprintService = this.LJIIJJI;
        if (iCJPayFingerprintService != null) {
            iCJPayFingerprintService.releaseFingerprintGuide();
        }
    }

    public final JSONObject LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = this.LJFF;
        if (jSONObject != null) {
            Intrinsics.checkNotNull(jSONObject);
            return jSONObject;
        }
        return new JSONObject();
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported && (hashMap = this.LJIIL) != null) {
            hashMap.clear();
        }
    }

    public final void LIZ() {
        ICJPayFingerprintService iCJPayFingerprintService;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (iCJPayFingerprintService = this.LJIIJJI) != null) {
            iCJPayFingerprintService.showFingerprintGuide(getActivity(), 2131493160, true, true, CJPayCheckoutCounterActivity.LJIIIZ.process_info.toJson(), CJPayCheckoutCounterActivity.LJIIIZ.user_info.uid, CJPayHostInfo.Companion.LIZIZ(CJPayCheckoutCounterActivity.LJIIJ), CJPayCheckoutCounterActivity.LJIIIZ.trade_info.trade_no, new C135439cB0(this));
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
        C135377cA0 c135377cA0;
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 7).isSupported && (c135377cA0 = this.LIZJ) != null) {
            c135377cA0.LIZ();
        }
    }

    public final void LIZ(long j) {
        C135377cA0 c135377cA0;
        View view;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 9).isSupported && (c135377cA0 = this.LIZJ) != null && (view = c135377cA0.mRootView) != null) {
            view.postDelayed(new RunnableC135420cAh(this), j);
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        TextUtils.isEmpty(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        CJPayResultGuideInfo cJPayResultGuideInfo;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onCreate(bundle);
        JSONObject LIZLLL = LIZLLL();
        String str2 = this.f25516LJ;
        CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean = this.LIZLLL;
        if (cJPayCounterTradeQueryResponseBean == null || (cJPayResultGuideInfo = cJPayCounterTradeQueryResponseBean.result_guide_info) == null || (str = cJPayResultGuideInfo.pic_url) == null) {
            str = "";
        }
        C136438cR7.LIZ(LIZLLL, str2, str);
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("result", str);
            String LIZ2 = C136415cQk.LIZ(this.LIZLLL);
            if (!TextUtils.isEmpty(LIZ2)) {
                LIZLLL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
            }
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_cashier_fingerprint_enable_result_pop_imp", LIZLLL);
    }

    public final void LIZLLL(String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJIIJ++;
        JSONObject LIZLLL = LIZLLL();
        int i = this.LJIIJ;
        String str3 = this.f25516LJ;
        AbstractC135416cAd abstractC135416cAd = this.LIZIZ;
        if (abstractC135416cAd == null || (str2 = abstractC135416cAd.getPicUrl()) == null) {
            str2 = "";
        }
        C136438cR7.LIZ(LIZLLL, i, str3, str, str2);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        boolean z;
        Object systemService;
        String bioType;
        Object systemService2;
        C135377cA0 c135377cA0;
        MethodCollector.m14708i(506);
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(506);
            return;
        }
        C106862S5w.LIZ(view);
        AbstractC135416cAd abstractC135416cAd = this.LIZIZ;
        if (abstractC135416cAd != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, abstractC135416cAd}, this, LIZ, false, 11);
            Object obj = null;
            if (proxy.isSupported) {
                obj = proxy.result;
            } else {
                String title = abstractC135416cAd.getTitle();
                if (title != null && title.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z && (bioType = abstractC135416cAd.getBioType()) != null && bioType.length() != 0) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 13);
                    if (proxy2.isSupported) {
                        c135377cA0 = (C135415cAc) proxy2.result;
                    } else {
                        Context context = getContext();
                        if (context != null && (systemService2 = context.getSystemService("layout_inflater")) != null) {
                            View inflate = ((LayoutInflater) systemService2).inflate(2131690606, (ViewGroup) null);
                            ((FrameLayout) view.findViewById(2131169845)).addView(inflate);
                            Intrinsics.checkNotNullExpressionValue(inflate, "");
                            C135415cAc c135415cAc = new C135415cAc(inflate, this.LIZIZ);
                            c135415cAc.LJII = new C135418cAf(c135415cAc, this);
                            c135377cA0 = c135415cAc;
                        } else {
                            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                            MethodCollector.m14707o(506);
                            throw nullPointerException;
                        }
                    }
                    this.LIZJ = c135377cA0;
                    MethodCollector.m14707o(506);
                    return;
                } else if (Intrinsics.areEqual(abstractC135416cAd.isShowGuide(), Boolean.TRUE)) {
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 12);
                    if (proxy3.isSupported) {
                        obj = (C135394cAH) proxy3.result;
                    } else {
                        Context context2 = getContext();
                        if (context2 != null && (systemService = context2.getSystemService("layout_inflater")) != null) {
                            View inflate2 = ((LayoutInflater) systemService).inflate(2131690608, (ViewGroup) null);
                            ((FrameLayout) view.findViewById(2131169845)).addView(inflate2);
                            Intrinsics.checkNotNullExpressionValue(inflate2, "");
                            C135394cAH c135394cAH = new C135394cAH(inflate2, this.LIZIZ);
                            c135394cAH.LJII = new C135419cAg(c135394cAH, this);
                            obj = c135394cAH;
                        } else {
                            NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                            MethodCollector.m14707o(506);
                            throw nullPointerException2;
                        }
                    }
                }
            }
            c135377cA0 = (C135377cA0) obj;
            this.LIZJ = c135377cA0;
            MethodCollector.m14707o(506);
            return;
        }
        MethodCollector.m14707o(506);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
        FragmentActivity activity;
        View view;
        View view2;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported && (activity = getActivity()) != null) {
            if (z) {
                C135377cA0 c135377cA0 = this.LIZJ;
                if (c135377cA0 != null && (view2 = c135377cA0.mRootView) != null) {
                    view2.post(new RunnableC135436cAx(activity, this, z, z2));
                    return;
                }
                return;
            }
            C135377cA0 c135377cA02 = this.LIZJ;
            if (c135377cA02 == null || (view = c135377cA02.mRootView) == null) {
                return;
            }
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public final void LIZ(AbstractC135416cAd abstractC135416cAd, CJPayCounterTradeQueryResponseBean cJPayCounterTradeQueryResponseBean) {
        String str;
        CJPayTradeInfo cJPayTradeInfo;
        if (PatchProxy.proxy(new Object[]{abstractC135416cAd, cJPayCounterTradeQueryResponseBean}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ = abstractC135416cAd;
        this.LIZLLL = cJPayCounterTradeQueryResponseBean;
        if (cJPayCounterTradeQueryResponseBean != null && (cJPayTradeInfo = cJPayCounterTradeQueryResponseBean.trade_info) != null && cJPayTradeInfo.isTradeAgain()) {
            str = "wallet_cashier_payafter_second";
        } else {
            str = "wallet_cashier_payafter";
        }
        this.f25516LJ = str;
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 15).isSupported) {
            return;
        }
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("button_name", str);
            String LIZ2 = C136415cQk.LIZ(this.LIZLLL);
            if (!TextUtils.isEmpty(LIZ2)) {
                LIZLLL.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, LIZ2);
            }
            LIZLLL.put("from", this.f25516LJ);
            if (str2.length() == 0) {
                str2 = "words_style";
            }
            LIZLLL.put("fingerprint_type", str2);
        } catch (Exception unused) {
        }
        C2118a.LIZ().LIZ("wallet_cashier_fingerprint_enable_pop_click", LIZLLL);
    }
}
