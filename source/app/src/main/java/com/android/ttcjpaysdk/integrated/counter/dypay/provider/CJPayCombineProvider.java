package com.android.ttcjpaysdk.integrated.counter.dypay.provider;

import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.android.ttcjpaysdk.base.p135ui.CJPayMiddleTitleText;
import com.android.ttcjpaysdk.base.service.ICJPayCombineCallback;
import com.android.ttcjpaysdk.base.service.ICJPayCombineService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.integrated.counter.data.PaymentMethodInfo;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135388cAB;
import p003X.C136216cNX;
import p003X.C137153ccf;
import p003X.C137179cd5;
import p003X.C137345cfl;
import p003X.C137356cfw;

/* loaded from: classes17.dex */
public final class CJPayCombineProvider implements ICJPayCombineService {
    public static ChangeQuickRedirect LIZ;
    public ICJPayCombineCallback LIZIZ;
    public C137153ccf LIZJ;

    static {
        Covode.recordClassIndex(7681);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void release() {
        this.LIZJ = null;
        this.LIZIZ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final ICJPayCombineService.CombinePayErrorType getErrorType() {
        ICJPayCombineService.CombinePayErrorType combinePayErrorType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (ICJPayCombineService.CombinePayErrorType) proxy.result;
        }
        C137153ccf fragment = getFragment();
        if (fragment == null || (combinePayErrorType = fragment.LJJII) == null) {
            return ICJPayCombineService.CombinePayErrorType.Init;
        }
        return combinePayErrorType;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final ICJPayCombineService.CombinePaySource getPaySource() {
        ICJPayCombineService.CombinePaySource combinePaySource;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (ICJPayCombineService.CombinePaySource) proxy.result;
        }
        C137153ccf fragment = getFragment();
        if (fragment == null || (combinePaySource = fragment.LJJIII) == null) {
            return ICJPayCombineService.CombinePaySource.Init;
        }
        return combinePaySource;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void hideBtnLoading() {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && (fragment = getFragment()) != null) {
            fragment.LJIILJJIL();
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void refreshCardList() {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (fragment = getFragment()) != null) {
            fragment.LJIIJ();
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void setUnionPayDisable() {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && (fragment = getFragment()) != null) {
            C137153ccf.LIZ(fragment, false, 1, null);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void showBtnLoading() {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported && (fragment = getFragment()) != null) {
            fragment.LJIILIIL();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    /* renamed from: LIZ */
    public C137153ccf getFragment() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C137153ccf) proxy.result;
        }
        C137153ccf c137153ccf = this.LIZJ;
        if (c137153ccf != null) {
            return c137153ccf;
        }
        C137153ccf c137153ccf2 = new C137153ccf();
        c137153ccf2.LIZIZ = new C137345cfl(this);
        this.LIZJ = c137153ccf2;
        return this.LIZJ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final ICJPayCombineService.CombineType getCombineType() {
        ICJPayCombineService.CombineType combineType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (ICJPayCombineService.CombineType) proxy.result;
        }
        C137153ccf fragment = getFragment();
        if (fragment == null || (combineType = fragment.LJJIIJ) == null) {
            return ICJPayCombineService.CombineType.BalanceAndBankCard;
        }
        return combineType;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final String getCurrentMethod() {
        String LJIIIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C137153ccf fragment = getFragment();
        if (fragment == null || (LJIIIZ = fragment.LJIIIZ()) == null) {
            return "";
        }
        return LJIIIZ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final Object getSelectedCardInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C137153ccf fragment = getFragment();
        if (fragment != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], fragment, C137153ccf.LIZ, false, 36);
            if (proxy2.isSupported) {
                return proxy2.result;
            }
            PaymentMethodInfo paymentMethodInfo = fragment.LJJIFFI;
            if (paymentMethodInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            return paymentMethodInfo;
        }
        return null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final boolean isInsufficentStatus() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C137153ccf fragment = getFragment();
        if (fragment == null) {
            return false;
        }
        if (fragment.LJJII != ICJPayCombineService.CombinePayErrorType.NewCardInsufficentError && fragment.LJJII != ICJPayCombineService.CombinePayErrorType.OldCardInsufficentError) {
            return false;
        }
        return true;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final String getSelectedCardNo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C137153ccf fragment = getFragment();
        if (fragment != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], fragment, C137153ccf.LIZ, false, 67);
            if (proxy2.isSupported) {
                String str = (String) proxy2.result;
                if (str != null) {
                    return str;
                }
            } else {
                C137179cd5 c137179cd5 = fragment.LJJ;
                if (c137179cd5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str2 = c137179cd5.LIZIZ().card_no;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                return str2;
            }
        }
        return "";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void logBackBtnClick() {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && (fragment = getFragment()) != null && !PatchProxy.proxy(new Object[0], fragment, C137153ccf.LIZ, false, 72).isSupported) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (fragment.LJJII == ICJPayCombineService.CombinePayErrorType.NewCardInsufficentError || fragment.LJJII == ICJPayCombineService.CombinePayErrorType.OldCardInsufficentError) {
                    jSONObject.put("error_info", 1);
                }
                jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, fragment.LJIIIZ());
            } catch (Exception unused) {
            }
            C137356cfw.LIZIZ.LIZ("wallet_cashier_combine_back_click", jSONObject);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void refreshCombinePayHeader() {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (fragment = getFragment()) != null && !PatchProxy.proxy(new Object[0], fragment, C137153ccf.LIZ, false, 62).isSupported) {
            RecyclerView recyclerView = fragment.LJIIZILJ;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            recyclerView.scrollToPosition(0);
            if (fragment.LJJII == ICJPayCombineService.CombinePayErrorType.OldCardInsufficentError) {
                fragment.LJIIJJI();
            } else if (fragment.LJJII == ICJPayCombineService.CombinePayErrorType.NewCardInsufficentError) {
                fragment.LJIIJJI();
            } else {
                fragment.LJIIL();
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void showBigLoading() {
        C137153ccf fragment;
        String str;
        Resources resources;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (fragment = getFragment()) != null && !PatchProxy.proxy(new Object[0], fragment, C137153ccf.LIZ, false, 77).isSupported) {
            try {
                FrameLayout frameLayout = fragment.LJIJJLI;
                if (frameLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                frameLayout.setVisibility(0);
                ImageView imageView = fragment.LJFF;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                imageView.setVisibility(8);
                CJPayMiddleTitleText cJPayMiddleTitleText = fragment.f18133LJ;
                if (cJPayMiddleTitleText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                C136216cNX c136216cNX = C135388cAB.LIZ;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null && (resources = activity.getResources()) != null) {
                    str = resources.getString(2131561842);
                } else {
                    str = null;
                }
                cJPayMiddleTitleText.setText(c136216cNX.LIZIZ(str));
                CJPayMiddleTitleText cJPayMiddleTitleText2 = fragment.f18133LJ;
                if (cJPayMiddleTitleText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                cJPayMiddleTitleText2.setVisibility(0);
                FrameLayout frameLayout2 = fragment.LJIL;
                if (frameLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                frameLayout2.setBackgroundColor(Color.parseColor("#FFFFFF"));
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void setCallBack(ICJPayCombineCallback iCJPayCombineCallback) {
        this.LIZIZ = iCJPayCombineCallback;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void isQueryConnecting(boolean z) {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 15).isSupported && (fragment = getFragment()) != null) {
            fragment.setIsQueryConnecting(z);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void setCombineType(ICJPayCombineService.CombineType combineType) {
        if (PatchProxy.proxy(new Object[]{combineType}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(combineType);
        C137153ccf fragment = getFragment();
        if (fragment != null && !PatchProxy.proxy(new Object[]{combineType}, fragment, C137153ccf.LIZ, false, 40).isSupported) {
            C106862S5w.LIZ(combineType);
            fragment.LJJIIJ = combineType;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void setErrorType(ICJPayCombineService.CombinePayErrorType combinePayErrorType) {
        if (PatchProxy.proxy(new Object[]{combinePayErrorType}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(combinePayErrorType);
        C137153ccf fragment = getFragment();
        if (fragment != null && !PatchProxy.proxy(new Object[]{combinePayErrorType}, fragment, C137153ccf.LIZ, false, 38).isSupported) {
            C106862S5w.LIZ(combinePayErrorType);
            fragment.LJJII = combinePayErrorType;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void setPaySource(ICJPayCombineService.CombinePaySource combinePaySource) {
        if (PatchProxy.proxy(new Object[]{combinePaySource}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(combinePaySource);
        C137153ccf fragment = getFragment();
        if (fragment != null && !PatchProxy.proxy(new Object[]{combinePaySource}, fragment, C137153ccf.LIZ, false, 39).isSupported) {
            C106862S5w.LIZ(combinePaySource);
            fragment.LJJIII = combinePaySource;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void setShareData(Object obj) {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 2).isSupported && (fragment = getFragment()) != null) {
            if (!(obj instanceof C2272a)) {
                obj = null;
            }
            fragment.LJJIIZI = (C2272a) obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.ttcjpaysdk.base.service.ICJPayCombineService
    public final void processRoutineErrorCode(String str, boolean z, String str2) {
        C137153ccf fragment;
        if (!PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2}, this, LIZ, false, 18).isSupported && (fragment = getFragment()) != null && !PatchProxy.proxy(new Object[]{str, Byte.valueOf((byte) z), str2}, fragment, C137153ccf.LIZ, false, 75).isSupported) {
            if (!TextUtils.isEmpty(str) && !TextUtils.equals("CD002104", str2)) {
                CJPayBasicUtils.displayToastInternal(fragment.getActivity(), str, 0);
            }
            fragment.LJIILJJIL();
        }
    }
}
