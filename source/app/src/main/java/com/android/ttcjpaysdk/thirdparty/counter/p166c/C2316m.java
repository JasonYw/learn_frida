package com.android.ttcjpaysdk.thirdparty.counter.p166c;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C136218cNZ;
import p003X.C136438cR7;
import p003X.C136681cV2;
import p003X.C136683cV4;
import p003X.RunnableC136682cV3;
import p003X.RunnableC136684cV5;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.c.m */
/* loaded from: classes17.dex */
public final class C2316m extends CJPayBaseFragment {
    public static ChangeQuickRedirect LIZ;
    public C136683cV4 LIZIZ;
    public JSONObject LIZJ;

    /* renamed from: LJ */
    public int f25517LJ;
    public HashMap LJIIJ;
    public final ICJPayFingerprintService LIZLLL = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class);
    public int LJFF = 516;

    static {
        Covode.recordClassIndex(8202);
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view, Bundle bundle) {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LIZIZ() {
        return 2131690632;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(View view) {
    }

    public final JSONObject LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = this.LIZJ;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZJ() {
        ICJPayFingerprintService iCJPayFingerprintService;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (iCJPayFingerprintService = this.LIZLLL) != null) {
            iCJPayFingerprintService.releaseFingerprintGuide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        HashMap hashMap;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onDestroyView();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (hashMap = this.LJIIJ) != null) {
            hashMap.clear();
        }
    }

    public final void LIZ(long j) {
        C136683cV4 c136683cV4;
        View view;
        if (!PatchProxy.proxy(new Object[]{0L}, this, LIZ, false, 5).isSupported && (c136683cV4 = this.LIZIZ) != null && (view = c136683cV4.mRootView) != null) {
            view.postDelayed(new RunnableC136684cV5(this), 0L);
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.f25517LJ++;
        C136438cR7.LIZ(LIZ(), this.f25517LJ, "wallet_cashier_paying", str, "");
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZ(View view) {
        ICJPayFingerprintService iCJPayFingerprintService;
        View view2;
        ViewGroup.LayoutParams layoutParams;
        Integer valueOf;
        int intValue;
        if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && view != null) {
            Bundle arguments = getArguments();
            if (arguments != null && 516 <= (intValue = (valueOf = Integer.valueOf(arguments.getInt("pre_bio_guide_fragment_height"))).intValue()) && 580 >= intValue && valueOf != null) {
                this.LJFF = valueOf.intValue();
            }
            View findViewById = view.findViewById(2131169996);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            C136683cV4 c136683cV4 = new C136683cV4(findViewById);
            int i = this.LJFF;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c136683cV4, C136683cV4.LIZ, false, 1).isSupported) {
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c136683cV4, C136683cV4.LIZ, false, 2).isSupported && (view2 = c136683cV4.mRootView) != null && i != 516 && (layoutParams = view2.getLayoutParams()) != null) {
                    layoutParams.height = CJPayBasicUtils.dipToPX(c136683cV4.mContext, i);
                }
                new C136218cNZ(c136683cV4.LIZLLL);
                c136683cV4.LIZJ.setVisibility(8);
                TextView textView = c136683cV4.LIZIZ;
                Context context = c136683cV4.mContext;
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView.setText(context.getResources().getString(2131561599));
                c136683cV4.LJFF.setVisibility(8);
            }
            if (!PatchProxy.proxy(new Object[0], c136683cV4, C136683cV4.LIZ, false, 3).isSupported) {
                c136683cV4.LIZLLL.setVisibility(0);
                c136683cV4.f18072LJ.setVisibility(0);
            }
            if (Build.VERSION.SDK_INT >= 23 && getActivity() != null && CJPayCheckoutCounterActivity.LJIIIZ != null && !PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && (iCJPayFingerprintService = this.LIZLLL) != null) {
                iCJPayFingerprintService.showFingerprintGuide(getActivity(), 2131493160, true, false, CJPayCheckoutCounterActivity.LJIIIZ.process_info.toJson(), CJPayCheckoutCounterActivity.LJIIIZ.user_info.uid, CJPayHostInfo.Companion.LIZIZ(CJPayCheckoutCounterActivity.LJIIJ), CJPayCheckoutCounterActivity.LJIIIZ.trade_info.trade_no, new C136681cV2(this));
            }
            this.LIZIZ = c136683cV4;
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final void LIZIZ(boolean z, boolean z2) {
        FragmentActivity activity;
        View view;
        View view2;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported && (activity = getActivity()) != null) {
            if (z) {
                C136683cV4 c136683cV4 = this.LIZIZ;
                if (c136683cV4 != null && (view2 = c136683cV4.mRootView) != null) {
                    view2.post(new RunnableC136682cV3(activity, this, z, z2));
                    return;
                }
                return;
            }
            C136683cV4 c136683cV42 = this.LIZIZ;
            if (c136683cV42 == null || (view = c136683cV42.mRootView) == null) {
                return;
            }
            if (!z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }
}
