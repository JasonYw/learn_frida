package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBusiAuthorizeInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.view.LabelEditText;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2236d;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e;
import com.android.ttcjpaysdk.bindcard.quickbind.b$d;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeySignOrderResponseBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2232d;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.android.ttcjpaysdk.thirdparty.utils.CJPayIdUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;
import p003X.C123320YgE;
import p003X.C135401cAO;
import p003X.C135850cHd;
import p003X.C135863cHq;
import p003X.C135876cI3;
import p003X.C135884cIB;
import p003X.C135893cIK;
import p003X.C135895cIM;
import p003X.C135897cIO;
import p003X.GOY;
import p003X.RunnableC135886cID;
import p003X.RunnableC135901cIS;
import p003X.View$OnFocusChangeListenerC135889cIG;
import p003X.View$OnFocusChangeListenerC135891cII;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuth2Activity */
/* loaded from: classes17.dex */
public final class TwoElementAuth2Activity extends BaseQuickBindView<C2232d, C2236d> implements b$d {
    public static ChangeQuickRedirect LIZ;
    public LabelEditText LIZIZ;
    public LabelEditText LIZJ;
    public LinearLayout LIZLLL;

    /* renamed from: LJ */
    public C135401cAO f25487LJ;
    public String LJFF = "";
    public CJPayNameAndIdentifyCodeBillBean LJI = new CJPayNameAndIdentifyCodeBillBean();
    public boolean LJII;
    public CJPayProtocolGroupContentsBean LJIIIIZZ;
    public TextView LJIIIZ;
    public LoadingButton LJIIJ;
    public TextView LJIIJJI;
    public String LJIIL;
    public HashMap LJIILIIL;

    static {
        Covode.recordClassIndex(7277);
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported && (hashMap = this.LJIILIIL) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 32);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIILIIL == null) {
            this.LJIILIIL = new HashMap();
        }
        View view = (View) this.LJIILIIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIILIIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690545;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final String getSelectedBankCardType() {
        return this.LJFF;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2229a();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void hideProgressLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIIJ;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void hideQueryLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        hideStyleLoading();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void showProgressLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIIJ;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void showQueryLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        showStyleLoading();
    }

    private final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LabelEditText labelEditText = this.LIZIZ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Editable text = labelEditText.getText();
        if (text == null || text.length() <= 0) {
            return false;
        }
        return true;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        LabelEditText labelEditText = this.LIZIZ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        labelEditText.LIZLLL();
        LabelEditText labelEditText2 = this.LIZJ;
        if (labelEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        labelEditText2.LIZLLL();
        new Handler().post(new RunnableC135901cIS(this));
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        C2237e c2237e;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (c2237e = this.mvpLogger) != null) {
            HashMap<String, CJPayVoucherInfo> hashMap = this.quickBindData.voucher_info_map;
            Intrinsics.checkNotNullExpressionValue(hashMap, "");
            String str = this.quickBindData.cardType;
            Intrinsics.checkNotNullExpressionValue(str, "");
            c2237e.LIZ(hashMap, str, "page");
        }
    }

    public final void LIZIZ() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIIJ;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (LIZ() && LIZLLL()) {
            z = true;
        }
        loadingButton.setEnabled(z);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        View findViewById = findViewById(2131166080);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LJIIIZ = (TextView) findViewById;
        View findViewById2 = findViewById(2131196523);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LJIIJ = (LoadingButton) findViewById2;
        Intrinsics.checkNotNullExpressionValue(findViewById(2131175311), "");
        View findViewById3 = findViewById(2131169921);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJIIJJI = (TextView) findViewById3;
        View findViewById4 = findViewById(2131177117);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LIZJ = (LabelEditText) findViewById4;
        View findViewById5 = findViewById(2131183713);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LIZIZ = (LabelEditText) findViewById5;
        View findViewById6 = findViewById(2131181492);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LIZLLL = (LinearLayout) findViewById6;
        LinearLayout linearLayout = this.LIZLLL;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.f25487LJ = new C135401cAO(linearLayout);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIIJ;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(loadingButton, 0L, new TwoElementAuth2Activity$initActions$1(this), 1, null);
        TextView textView = this.LJIIJJI;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(textView, 0L, new TwoElementAuth2Activity$initActions$2(this), 1, null);
        C135401cAO c135401cAO = this.f25487LJ;
        if (c135401cAO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c135401cAO.LIZJ = new C135893cIK(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
        C2232d c2232d;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (c2232d = (C2232d) this.mBasePresenter) != null) {
            String str = this.quickBindData.bankCode;
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = this.quickBindData.cardType;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            if (!PatchProxy.proxy(new Object[]{str, str2}, c2232d, C2232d.f25480LJ, false, 1).isSupported) {
                C106862S5w.LIZ(str, str2);
                HashMap hashMap = new HashMap();
                hashMap.put("biz_order_type", "verify_identity_info");
                hashMap.put("bank_code", str);
                hashMap.put("card_type", str2);
                C2229a c2229a = (C2229a) c2232d.mModel;
                if (c2229a != null) {
                    c2229a.LIZJ(hashMap, new C135897cIO(c2232d));
                }
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 41).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 40).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported) {
                    GOY.LIZLLL(this);
                    super.onStop();
                }
                if (EnterTransitionCrashOptimizer.getContext() != null) {
                    int i = Build.VERSION.SDK_INT;
                    try {
                        getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                    } catch (Throwable unused) {
                    }
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        String str;
        CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean;
        CJPayBusiAuthorizeInfo cJPayBusiAuthorizeInfo;
        String str2;
        String string;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        String str3 = null;
        AbstractActivityC135987cJq.setTitleText$default(this, "", 0, 2, null);
        String str4 = this.quickBindData.bankName;
        Intrinsics.checkNotNullExpressionValue(str4, "");
        if (Intrinsics.areEqual("DEBIT", this.LJFF)) {
            str = "储蓄卡";
        } else {
            str = "信用卡";
        }
        if (!PatchProxy.proxy(new Object[]{str4, str}, this, LIZ, false, 18).isSupported && (string = getResources().getString(2131561996, str4, str)) != null) {
            TextView textView = this.LJIIIZ;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText(string);
        }
        String str5 = this.LJI.sign_card_map.button_description;
        if (str5 != null && str5.length() != 0) {
            str3 = this.LJI.sign_card_map.button_description;
        } else {
            Resources resources = getResources();
            if (resources != null) {
                str3 = resources.getString(2131561464);
            }
        }
        if (!PatchProxy.proxy(new Object[]{str3}, this, LIZ, false, 19).isSupported && str3 != null) {
            if (Intrinsics.areEqual(str3, "")) {
                str2 = this.LJIIL;
            } else {
                str2 = str3;
            }
            this.LJIIL = str2;
            LoadingButton loadingButton = this.LJIIJ;
            if (loadingButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            loadingButton.setButtonText(str3);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            LabelEditText labelEditText = this.LIZIZ;
            if (labelEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText.LJIIIZ = new C135895cIM(this);
            LabelEditText labelEditText2 = this.LIZIZ;
            if (labelEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText2.setOnFocusChangeListener(new View$OnFocusChangeListenerC135889cIG(this));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            LabelEditText labelEditText3 = this.LIZJ;
            if (labelEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText3.LJIIIZ = new C135863cHq(this, Arrays.asList(6, 14));
            LabelEditText labelEditText4 = this.LIZJ;
            if (labelEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText4.setOnFocusChangeListener(new View$OnFocusChangeListenerC135891cII(this));
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
                LabelEditText labelEditText5 = this.LIZJ;
                if (labelEditText5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                labelEditText5.setOnPasteListener(new C135850cHd(this));
            }
        }
        if (TextUtils.equals(C135876cI3.LJIIL(), "card_sign_business_auth_v20220330") && !PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported && (cJPayNameAndIdentifyCodeBillBean = this.LJI) != null && (cJPayBusiAuthorizeInfo = (CJPayBusiAuthorizeInfo) CJPayJsonParser.fromJson(cJPayNameAndIdentifyCodeBillBean.busi_authorize_info_str, CJPayBusiAuthorizeInfo.class)) != null && cJPayBusiAuthorizeInfo.is_need_authorize) {
            cJPayBusiAuthorizeInfo.needIdentify = 1;
            cJPayBusiAuthorizeInfo.hasPass = 0;
            cJPayBusiAuthorizeInfo.showOneStep = 0;
            cJPayBusiAuthorizeInfo.isOneStep = 1;
            cJPayBusiAuthorizeInfo.authType = "two_elements";
            LabelEditText labelEditText6 = this.LIZIZ;
            if (labelEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText6.LIZ(cJPayBusiAuthorizeInfo.busi_authorize_content.business_brief_info.input_display_icon, cJPayBusiAuthorizeInfo.busi_authorize_content.business_brief_info.input_display_desc, new C135884cIB(this, cJPayBusiAuthorizeInfo));
            LabelEditText labelEditText7 = this.LIZIZ;
            if (labelEditText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText7.LIZ(true);
            LIZ(cJPayBusiAuthorizeInfo);
        }
        if (!this.LJI.busi_authorize_info.is_need_authorize) {
            LabelEditText labelEditText8 = this.LIZIZ;
            if (labelEditText8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            labelEditText8.LIZ();
        }
        LIZIZ();
        C2237e c2237e = this.mvpLogger;
        if (c2237e != null) {
            c2237e.LIZIZ();
        }
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LabelEditText labelEditText = this.LIZJ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return CJPayIdUtils.isMainLandIdValid(labelEditText.getText().toString());
    }

    public static final /* synthetic */ LabelEditText LIZ(TwoElementAuth2Activity twoElementAuth2Activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{twoElementAuth2Activity}, null, LIZ, true, 30);
        if (proxy.isSupported) {
            return (LabelEditText) proxy.result;
        }
        LabelEditText labelEditText = twoElementAuth2Activity.LIZIZ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return labelEditText;
    }

    public static final /* synthetic */ LabelEditText LIZIZ(TwoElementAuth2Activity twoElementAuth2Activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{twoElementAuth2Activity}, null, LIZ, true, 31);
        if (proxy.isSupported) {
            return (LabelEditText) proxy.result;
        }
        LabelEditText labelEditText = twoElementAuth2Activity.LIZJ;
        if (labelEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return labelEditText;
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$d
    public final void LIZ(CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean) {
        if (!PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean}, this, LIZ, false, 14).isSupported && cJPayProtocolGroupContentsBean != null && cJPayProtocolGroupContentsBean.protocol_list.size() > 0) {
            this.LJIIIIZZ = cJPayProtocolGroupContentsBean;
            this.LJII = cJPayProtocolGroupContentsBean.isNeedCheckBox();
            C135401cAO c135401cAO = this.f25487LJ;
            if (c135401cAO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c135401cAO.LIZ(cJPayProtocolGroupContentsBean.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean.guide_message, this.LJII);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 34).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 36).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 35).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    public final void LIZ(CJPayBusiAuthorizeInfo cJPayBusiAuthorizeInfo) {
        if (PatchProxy.proxy(new Object[]{cJPayBusiAuthorizeInfo}, this, LIZ, false, 29).isSupported) {
            return;
        }
        if (cJPayBusiAuthorizeInfo != null && !cJPayBusiAuthorizeInfo.is_need_authorize) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC135886cID(this, cJPayBusiAuthorizeInfo), 300L);
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$d
    public final void LIZ(CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean) {
        if (PatchProxy.proxy(new Object[]{cJPayOneKeySignOrderResponseBean}, this, LIZ, false, 15).isSupported || cJPayOneKeySignOrderResponseBean == null) {
            return;
        }
        if (cJPayOneKeySignOrderResponseBean.isResponseOK()) {
            C2237e c2237e = this.mvpLogger;
            if (c2237e != null) {
                c2237e.LIZ(1, (String) null, (String) null);
            }
        } else {
            C2237e c2237e2 = this.mvpLogger;
            if (c2237e2 != null) {
                c2237e2.LIZ(0, cJPayOneKeySignOrderResponseBean.code, cJPayOneKeySignOrderResponseBean.msg);
            }
        }
        C2237e c2237e3 = this.mvpLogger;
        if (c2237e3 != null) {
            boolean isResponseOK = cJPayOneKeySignOrderResponseBean.isResponseOK();
            String str = cJPayOneKeySignOrderResponseBean.code;
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = cJPayOneKeySignOrderResponseBean.msg;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            c2237e3.LIZIZ(isResponseOK ? 1 : 0, str, str2);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$d
    public final void LIZ(String str, String str2) {
        C2237e c2237e;
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 16).isSupported && (c2237e = this.mvpLogger) != null) {
            c2237e.LIZ(0, str, str2);
        }
    }
}
