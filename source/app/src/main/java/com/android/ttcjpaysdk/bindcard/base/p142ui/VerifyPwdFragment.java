package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.framework.CJPayActivityManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayTextLoadingView;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$e;
import com.android.ttcjpaysdk.bindcard.base.p140a.C2202e;
import com.android.ttcjpaysdk.bindcard.base.p141b.C2213e;
import com.android.ttcjpaysdk.bindcard.base.p142ui.VerifyPwdFragment;
import com.android.ttcjpaysdk.thirdparty.view.CJPayPwdEditText;
import com.android.ttcjpaysdk.thirdparty.view.a$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC136020cKN;
import p003X.AbstractC136199cNG;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C123320YgE;
import p003X.C135272c8J;
import p003X.C135388cAB;
import p003X.C135726cFd;
import p003X.C135876cI3;
import p003X.C136009cKC;
import p003X.C136045cKm;
import p003X.C136084cLP;
import p003X.C136085cLQ;
import p003X.C136757cWG;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.VerifyPwdFragment */
/* loaded from: classes17.dex */
public final class VerifyPwdFragment extends AbstractC136020cKN<C2213e, C2202e> implements a$e, a$a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;
    public boolean isQuickBind;
    public ImageView mBackView;
    public CJPayTextLoadingView mCJPayTextLoadingView;
    public TextView mForgetPwdView;
    public CJPayPwdEditText mPwdEditTextView;
    public TextView mPwdInputErrorTipView;
    public CJPayKeyboardView mPwdKeyboardView;
    public RelativeLayout mRootView;
    public TextView mTipView;
    public View mTitleBackground;
    public TextView mTitleView;
    public View titileDivider;
    public AbstractC136199cNG verifyPwdListener;
    public String voucherInfoStr = "";
    public String title = "";
    public String subTitle = "";
    public String smchId = "";
    public String orderNo = "";
    public CJPayHostInfo hostInfo = new CJPayHostInfo();
    public String merchantId = "";
    public String appId = "";
    public String mCurrentInputPwdStr = "";

    static {
        Covode.recordClassIndex(7103);
    }

    @Override // p003X.AbstractC136020cKN, com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractC136020cKN, com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 26);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final int getLayoutId() {
        return 2131690633;
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final void next() {
    }

    @Override // p003X.AbstractC136020cKN, com.android.ttcjpaysdk.base.framework.AbstractC2129a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 28).isSupported) {
            return;
        }
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // p003X.AbstractC136020cKN
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2208b();
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        super.onStart();
        setStatusBar();
    }

    private final void showLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        if (this.mCJPayTextLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else if (C136757cWG.f18084LJ.LIZ(getActivity(), "")) {
        } else {
            CJPayTextLoadingView cJPayTextLoadingView = this.mCJPayTextLoadingView;
            if (cJPayTextLoadingView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayTextLoadingView.show();
        }
    }

    private final void stopLoading() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        clearPwdStatus();
        C136757cWG.f18084LJ.LIZ();
        if (this.mCJPayTextLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            return;
        }
        CJPayTextLoadingView cJPayTextLoadingView = this.mCJPayTextLoadingView;
        if (cJPayTextLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayTextLoadingView.hide();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayBasicUtils.rightInAndRightOutAnimation(relativeLayout, false, getActivity(), new C136084cLP(this));
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayBasicUtils.rightInAndRightOutAnimation(relativeLayout, false, getActivity(), new C136085cLQ(this));
    }

    public final void clearPwdStatus() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        this.mCurrentInputPwdStr = "";
        if (this.mPwdEditTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            CJPayPwdEditText cJPayPwdEditText = this.mPwdEditTextView;
            if (cJPayPwdEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayPwdEditText.setText(this.mCurrentInputPwdStr);
            CJPayPwdEditText cJPayPwdEditText2 = this.mPwdEditTextView;
            if (cJPayPwdEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayPwdEditText2.postInvalidate();
        }
        if (this.mPwdInputErrorTipView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            TextView textView = this.mPwdInputErrorTipView;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText("");
            TextView textView2 = this.mPwdInputErrorTipView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2.setVisibility(8);
        }
        updateTip();
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final void initAction() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        CJPayPwdEditText cJPayPwdEditText = this.mPwdEditTextView;
        if (cJPayPwdEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayPwdEditText.setOnTextInputListener(this);
        CJPayKeyboardView cJPayKeyboardView = this.mPwdKeyboardView;
        if (cJPayKeyboardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayKeyboardView.setOnKeyListener(new C136045cKm(this));
        ImageView imageView = this.mBackView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(imageView, 0L, new VerifyPwdFragment$initAction$2(this), 1, null);
        TextView textView = this.mForgetPwdView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(textView, 0L, new VerifyPwdFragment$initAction$3(this), 1, null);
        getDialog().setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.9Ja
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7108);
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                if (i != 4) {
                    return false;
                }
                VerifyPwdFragment.this.dismissAllowingStateLoss();
                return true;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        super.onResume();
        updateForgetPwdViewStatus(true);
        C2202e c2202e = this.mvpLogger;
        if (c2202e != null && !PatchProxy.proxy(new Object[0], c2202e, C2202e.LIZ, false, 2).isSupported) {
            c2202e.LIZ("wallet_modify_password_imp", null);
        }
        C135726cFd.LIZLLL.LIZ("密码验证");
        CJPayPageLoadTrace.LIZ().LIZIZ(CJPayPageLoadTrace.Page.NEW_CARD_PAY, CJPayPageLoadTrace.Section.END, "密码验证");
    }

    public final void openForgotPassword() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        new StringBuilder();
        String m25083C = C0002O.m25083C(CJPayParamsUtils.LIZJ(), "/usercenter/setpass/guide?merchant_id=", this.merchantId, "&app_id=", this.appId);
        ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
        if (iCJPayH5Service != null) {
            H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
            h5ParamBuilder.setContext(getContext());
            h5ParamBuilder.setUrl(m25083C);
            h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(this.hostInfo));
            iCJPayH5Service.startH5(h5ParamBuilder);
        }
    }

    private final void updateTip() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18).isSupported && getActivity() != null) {
            if (this.mTitleView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else if (this.mTipView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                if (!TextUtils.isEmpty(this.title)) {
                    TextView textView = this.mTitleView;
                    if (textView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    textView.setText(C135388cAB.LIZ.LIZJ(this.title));
                } else {
                    TextView textView2 = this.mTitleView;
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    textView2.setText(C135388cAB.LIZ.LIZJ(getResources().getString(2131562023)));
                }
                if (!TextUtils.isEmpty(this.subTitle)) {
                    TextView textView3 = this.mTipView;
                    if (textView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    textView3.setText(this.subTitle);
                    return;
                }
                TextView textView4 = this.mTipView;
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                textView4.setText(getResources().getString(2131561732));
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        this.hostInfo = C135876cI3.f17973LJ.LJIIIIZZ();
        String str = this.hostInfo.merchantId;
        if (str == null) {
            str = "";
        }
        this.merchantId = str;
        String str2 = this.hostInfo.appId;
        if (str2 == null) {
            str2 = "";
        }
        this.appId = str2;
        C2202e c2202e = this.mvpLogger;
        if (c2202e != null) {
            boolean z = this.isQuickBind;
            String str3 = this.voucherInfoStr;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str3}, c2202e, C2202e.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(str3);
                c2202e.LIZIZ = C135876cI3.f17973LJ.LJIIIIZZ();
                CJPayHostInfo cJPayHostInfo = c2202e.LIZIZ;
                if (cJPayHostInfo == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str4 = cJPayHostInfo.merchantId;
                if (str4 == null) {
                    str4 = "";
                }
                c2202e.LIZLLL = str4;
                CJPayHostInfo cJPayHostInfo2 = c2202e.LIZIZ;
                if (cJPayHostInfo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str5 = cJPayHostInfo2.appId;
                if (str5 == null) {
                    str5 = "";
                }
                c2202e.f25468LJ = str5;
                String str6 = c2202e.LIZLLL;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str7 = c2202e.f25468LJ;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                JSONObject LIZ = CJPayParamsUtils.LIZ(str6, str7);
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                c2202e.LIZJ = LIZ;
                c2202e.LJI = z;
                c2202e.LJFF = str3;
            }
        }
    }

    public static final /* synthetic */ void access$dismissAllowingStateLoss$s206173780(VerifyPwdFragment verifyPwdFragment) {
        if (PatchProxy.proxy(new Object[]{verifyPwdFragment}, null, changeQuickRedirect, true, 25).isSupported) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 2131493153);
    }

    public final void setVerifyPwdListener(AbstractC136199cNG abstractC136199cNG) {
        if (PatchProxy.proxy(new Object[]{abstractC136199cNG}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC136199cNG);
        this.verifyPwdListener = abstractC136199cNG;
    }

    public static final /* synthetic */ CJPayPwdEditText access$getMPwdEditTextView$p(VerifyPwdFragment verifyPwdFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{verifyPwdFragment}, null, changeQuickRedirect, true, 24);
        if (proxy.isSupported) {
            return (CJPayPwdEditText) proxy.result;
        }
        CJPayPwdEditText cJPayPwdEditText = verifyPwdFragment.mPwdEditTextView;
        if (cJPayPwdEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return cJPayPwdEditText;
    }

    public static final /* synthetic */ TextView access$getMPwdInputErrorTipView$p(VerifyPwdFragment verifyPwdFragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{verifyPwdFragment}, null, changeQuickRedirect, true, 23);
        if (proxy.isSupported) {
            return (TextView) proxy.result;
        }
        TextView textView = verifyPwdFragment.mPwdInputErrorTipView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return textView;
    }

    public final void updateForgetPwdViewStatus(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        TextView textView = this.mForgetPwdView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView.setEnabled(z);
        if (z) {
            TextView textView2 = this.mForgetPwdView;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2.setTextColor(C116971W2r.LIZ(getResources(), 2131623993));
            return;
        }
        TextView textView3 = this.mForgetPwdView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView3.setTextColor(C116971W2r.LIZ(getResources(), 2131624833));
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final void bindViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131165338);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.mRootView = (RelativeLayout) findViewById;
        View findViewById2 = view.findViewById(2131165337);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.mBackView = (ImageView) findViewById2;
        View findViewById3 = view.findViewById(2131169724);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.titileDivider = findViewById3;
        View findViewById4 = view.findViewById(2131170002);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.mPwdEditTextView = (CJPayPwdEditText) findViewById4;
        View findViewById5 = view.findViewById(2131169863);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.mPwdInputErrorTipView = (TextView) findViewById5;
        View findViewById6 = view.findViewById(2131169841);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.mForgetPwdView = (TextView) findViewById6;
        View findViewById7 = view.findViewById(2131165334);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.mPwdKeyboardView = (CJPayKeyboardView) findViewById7;
        View findViewById8 = view.findViewById(2131170158);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.mCJPayTextLoadingView = (CJPayTextLoadingView) findViewById8;
        View findViewById9 = view.findViewById(2131170059);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.mTitleView = (TextView) findViewById9;
        View findViewById10 = view.findViewById(2131170061);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.mTipView = (TextView) findViewById10;
        View findViewById11 = view.findViewById(2131170119);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.mTitleBackground = findViewById11;
    }

    @Override // com.android.ttcjpaysdk.base.framework.AbstractC2129a
    public final void initViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        View view2 = this.titileDivider;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        view2.setVisibility(8);
        int screenWidth = (CJPayBasicUtils.getScreenWidth(getActivity()) - CJPayBasicUtils.dipToPX(getActivity(), 48.0f)) / 6;
        CJPayPwdEditText cJPayPwdEditText = this.mPwdEditTextView;
        if (cJPayPwdEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayPwdEditText.getLayoutParams().height = screenWidth;
        CJPayPwdEditText cJPayPwdEditText2 = this.mPwdEditTextView;
        if (cJPayPwdEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayPwdEditText2.setHeight(screenWidth);
        CJPayTextLoadingView cJPayTextLoadingView = this.mCJPayTextLoadingView;
        if (cJPayTextLoadingView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayTextLoadingView.hide();
        TextView textView = this.mPwdInputErrorTipView;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView.setVisibility(8);
        TextView textView2 = this.mPwdInputErrorTipView;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView2.setTextColor(C135272c8J.LIZ());
        View view3 = this.mTitleBackground;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        view3.setBackgroundColor(C116971W2r.LIZ(getResources(), 2131623992));
        TextView textView3 = this.mTitleView;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        float screenHeight = CJPayBasicUtils.getScreenHeight(textView3.getContext()) * 0.07f;
        TextView textView4 = this.mTitleView;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
        if (layoutParams != null) {
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = (int) screenHeight;
            CJPayKeyboardView cJPayKeyboardView = this.mPwdKeyboardView;
            if (cJPayKeyboardView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayKeyboardView.showInsurance();
            clearPwdStatus();
            updateForgetPwdViewStatus(true);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // com.android.ttcjpaysdk.thirdparty.view.a$a
    public final void onComplete(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 13).isSupported || str == null) {
            return;
        }
        if (CJPayBasicUtils.isNetworkAvailable(getContext())) {
            if (!TextUtils.isEmpty(str)) {
                String LIZ = C136009cKC.LIZIZ.LIZ(str);
                if (LIZ.length() == 0) {
                    clearPwdStatus();
                    CJPayBasicUtils.displayToast(getContext(), getResources().getString(2131561782));
                    return;
                }
                showLoading();
                C2213e c2213e = (C2213e) this.mPresenter;
                if (c2213e != null) {
                    c2213e.LIZ(this.smchId, this.orderNo, LIZ);
                }
            }
        } else {
            CJPayBasicUtils.displayToast(getActivity(), getResources().getString(2131558456));
        }
        C2202e c2202e = this.mvpLogger;
        if (c2202e != null && !PatchProxy.proxy(new Object[0], c2202e, C2202e.LIZ, false, 4).isSupported) {
            c2202e.LIZ("wallet_modify_password_input", null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
        if (r1.equals("2") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
        r7 = p003X.C135916cIh.LIZIZ;
        r0 = r12.hostInfo;
        r2 = r13.button_info;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
        if (com.bytedance.hotfix.PatchProxy.proxy(new java.lang.Object[]{r12, r0, r2, null}, r7, p003X.C135916cIh.LIZ, false, 1).isSupported != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
        p003X.C106862S5w.LIZ(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00dd, code lost:
        if (r2 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
        r1 = new kotlin.jvm.internal.Ref.ObjectRef();
        r1.element = null;
        r11 = new p003X.View$OnClickListenerC136102cLh(r1, null);
        r3 = com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils.getDefaultBuilder(getActivity());
        r3.setLeftBtnListener(p003X.C135778cGT.LIZ(r2.left_button_action, (p003X.DialogC137460chc) r1.element, r12, r0.merchantId, r0.appId, r11));
        r3.setRightBtnListener(p003X.C135778cGT.LIZ(r2.right_button_action, (p003X.DialogC137460chc) r1.element, r12, r0.merchantId, r0.appId, r11));
        r3.setSingleBtnListener(p003X.C135778cGT.LIZ(r2.action, (p003X.DialogC137460chc) r1.element, r12, r0.merchantId, r0.appId, r11));
        r0 = r3.setAllButtonColor(p003X.C116971W2r.LIZ(getResources(), 2131624875));
        r0.setButtonInfo(r2);
        r1.element = com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils.initDialog(r0);
        r0 = (android.app.Dialog) r1.element;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0142, code lost:
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0144, code lost:
        p003X.C116971W2r.LIZJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r1.equals(com.meizu.cloud.pushsdk.constants.PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START) != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, X.chc] */
    @Override // com.android.ttcjpaysdk.bindcard.base.a$e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onVerifyPwdSuccess(com.android.ttcjpaysdk.bindcard.base.bean.C2215c r13) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.base.p142ui.VerifyPwdFragment.onVerifyPwdSuccess(com.android.ttcjpaysdk.bindcard.base.bean.c):void");
    }

    @Override // com.android.ttcjpaysdk.bindcard.base.a$e
    public final void onVerifyPwdFail(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        stopLoading();
        CJPayBasicUtils.displayToast(getActivity(), getResources().getString(2131558456));
        C2202e c2202e = this.mvpLogger;
        if (c2202e != null) {
            c2202e.LIZ(0, null, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        super.onViewCreated(view, bundle);
        RelativeLayout relativeLayout = this.mRootView;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        CJPayBasicUtils.rightInAndRightOutAnimation(relativeLayout, true, getActivity(), null);
    }

    @Override // p003X.AbstractC136020cKN, com.android.ttcjpaysdk.base.framework.AbstractC2129a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            CJPayActivityManager.disallowCaptureScreen(activity);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
