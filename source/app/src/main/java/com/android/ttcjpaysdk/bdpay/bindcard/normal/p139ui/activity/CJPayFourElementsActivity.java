package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.CJPayPerformance;
import com.android.ttcjpaysdk.base.imageloader.C2153b;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.android.ttcjpaysdk.base.p135ui.SwipeToFinishView;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2186b;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b.C2189a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.C2193f;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBusiAuthorizeInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayOneKeyCopyWritingInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsTokenBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayIdType;
import com.android.ttcjpaysdk.thirdparty.utils.CJPayIdUtils;
import com.android.ttcjpaysdk.thirdparty.view.CJPayPasteAwareEditText;
import com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractActivityC135714cFR;
import p003X.AbstractC135808cGx;
import p003X.AbstractC136210cNR;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135401cAO;
import p003X.C135734cFl;
import p003X.C135737cFo;
import p003X.C135742cFt;
import p003X.C135848cHb;
import p003X.C135876cI3;
import p003X.C135940cJ5;
import p003X.C135988cJr;
import p003X.C135993cJw;
import p003X.C135995cJy;
import p003X.C135996cJz;
import p003X.C136000cK3;
import p003X.C136003cK6;
import p003X.C136005cK8;
import p003X.C136008cKB;
import p003X.C136017cKK;
import p003X.C136032cKZ;
import p003X.C136038cKf;
import p003X.C136039cKg;
import p003X.C136056cKx;
import p003X.C136058cKz;
import p003X.C136059cL0;
import p003X.C136060cL1;
import p003X.C136061cL2;
import p003X.C136068cL9;
import p003X.C136075cLG;
import p003X.C136076cLH;
import p003X.C136077cLI;
import p003X.C136078cLJ;
import p003X.C136108cLn;
import p003X.C136109cLo;
import p003X.C136134cMD;
import p003X.C136182cMz;
import p003X.C136193cNA;
import p003X.C136194cNB;
import p003X.C136235cNq;
import p003X.GOY;
import p003X.RunnableC136014cKH;
import p003X.RunnableC136070cLB;
import p003X.RunnableC136091cLW;
import p003X.RunnableC136176cMt;
import p003X.View$OnClickListenerC135560cCx;
import p003X.View$OnClickListenerC135561cCy;
import p003X.View$OnClickListenerC135562cCz;
import p003X.View$OnClickListenerC136116cLv;
import p003X.View$OnClickListenerC136186cN3;
import p003X.View$OnFocusChangeListenerC135999cK2;
import p003X.View$OnFocusChangeListenerC136028cKV;
import p003X.View$OnFocusChangeListenerC136030cKX;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayFourElementsActivity */
/* loaded from: classes17.dex */
public class CJPayFourElementsActivity extends AbstractActivityC135714cFR<C2193f, C2186b> implements e$b {
    public static ChangeQuickRedirect LIZ;
    public CJPayCardInfoBean LIZIZ;
    public String LIZJ;
    public C135988cJr LJII;
    public BasicInputWrapper LJIIIIZZ;
    public BasicInputWrapper LJIIIZ;
    public C136008cKB LJIIJ;
    public long LJIILL;
    public long LJIILLIIL;
    public C136039cKg LJIIZILJ;
    public boolean LJIJ;
    public TextWatcher LJJI;
    public TextWatcher LJJIFFI;
    public TextWatcher LJJII;
    public TextWatcher LJJIII;
    public String LJJIJ;
    public String LJJIJIIJI;
    public CJPayRealNameBean LJJIJIIJIL;
    public CJPaySmsTokenBean LJJIJIL;
    public Boolean LIZLLL = Boolean.FALSE;

    /* renamed from: LJ */
    public CJPayOneKeyCopyWritingInfo f25463LJ = new CJPayOneKeyCopyWritingInfo();
    public String LJFF = "";
    public CJPayCardAddBean LJI = C135876cI3.LIZ();
    public AbstractC136210cNR LJJIIJ = CJPayIdUtils.generateMainlandErrorDetector();
    public AbstractC136210cNR LJJIIJZLJL = CJPayIdUtils.generateHKMacauErrorDetector();
    public AbstractC136210cNR LJJIIZ = CJPayIdUtils.generateTWErrorDetector();
    public AbstractC136210cNR LJJIIZI = CJPayIdUtils.generatePassportErrorDetector();
    public CJPayIdType LJIIJJI = CJPayIdType.MAINLAND;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public String LJIJI = "";
    public boolean LJIJJ = false;
    public boolean LJIJJLI = false;
    public boolean LJIL = false;
    public AbstractC135808cGx LJJ = new AbstractC135808cGx() { // from class: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayFourElementsActivity.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(6836);
        }

        @Override // p003X.AbstractC135808cGx
        public final void LIZ(boolean z) {
            if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            if (z && !CJPayFourElementsActivity.this.LJIJ()) {
                CJPayFourElementsActivity.this.LJII.LJJIFFI.setVisibility(0);
                C135988cJr c135988cJr = CJPayFourElementsActivity.this.LJII;
                CJPayFourElementsActivity cJPayFourElementsActivity = CJPayFourElementsActivity.this;
                cJPayFourElementsActivity.getContext();
                c135988cJr.LIZ(cJPayFourElementsActivity);
                return;
            }
            CJPayFourElementsActivity.this.LJII.LJJIFFI.setVisibility(8);
        }
    };
    public CJPayIdUtils.AbstractC2391a LJJIJL = new C136193cNA(this);

    static {
        Covode.recordClassIndex(6835);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690609;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void next() {
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 54).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 53).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 52).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        CJPayInputKeyboardHelper.hideSystemKeyboard(this, this.LJIIJ.getEditText());
        LIZIZ();
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 28).isSupported) {
            return;
        }
        this.LJII = new C135988cJr(getLayoutRootView());
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZ(this);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2189a();
    }

    private String LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ.LIZJ())) {
            return this.LJIIZILJ.LIZJ();
        }
        if (this.LJIJJ && !TextUtils.isEmpty(this.LJIJI)) {
            return this.LJIJI;
        }
        return "";
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        boolean hideCustomKeyboard = CJPayInputKeyboardHelper.hideCustomKeyboard(this, this.LJII.LJJIII, this.LJJ);
        getLayoutRootView().post(new RunnableC136070cLB(this));
        this.LJJ.LIZ(false);
        return hideCustomKeyboard;
    }

    public final C2186b LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 51);
        if (proxy.isSupported) {
            return (C2186b) proxy.result;
        }
        if (this.mvpLogger == 0) {
            return new C2186b(this);
        }
        return this.mvpLogger;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported || this.LJJJZ) {
            return;
        }
        if (!LIZIZ()) {
            if (CJPayBasicUtils.isClickValid()) {
                finish();
            }
        } else if (CJPayBasicUtils.isClickValid()) {
            finish();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 35).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
        C2186b LJFF = LJFF();
        if (!PatchProxy.proxy(new Object[0], LJFF, C2186b.LIZ, false, 6).isSupported) {
            try {
                JSONObject LIZLLL = C135734cFl.LIZLLL();
                Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
                LJFF.LIZ("wallet_addbcard_page_back_click", LIZLLL);
            } catch (Exception unused) {
            }
        }
        CJPayPerformance.LIZ().LIZLLL("wallet_rd_bindcard_2_enter");
    }

    private void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        CJPayInputKeyboardHelper cJPayInputKeyboardHelper = new CJPayInputKeyboardHelper(true, this.LJII.LJJIII, true);
        cJPayInputKeyboardHelper.setOnExpandCollapseListener(this.LJJ);
        this.LJIIIZ.switchKeyboard(cJPayInputKeyboardHelper);
        CJPayPasteAwareEditText editText = this.LJIIIZ.getEditText();
        editText.clearFocus();
        editText.mo25203getText().clear();
        this.LJJI.afterTextChanged(editText.mo25203getText());
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(20)});
        editText.removeTextChangedListener(this.LJJIFFI);
        editText.removeTextChangedListener(this.LJJII);
        editText.removeTextChangedListener(this.LJJIII);
        editText.addTextChangedListener(this.LJJI);
        this.LJIIIIZZ.disableInfoButton();
        this.LJIIIIZZ.tryShowAuthLayout(true);
        this.LJIIIIZZ.tryEnableAuthLayout(true);
        this.LJIIIZ.disableInfoButton();
        LIZJ();
    }

    public final void LIZJ() {
        boolean z;
        C136008cKB c136008cKB;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            return;
        }
        boolean LIZLLL = LIZLLL();
        boolean z2 = !TextUtils.isEmpty(this.LJJIJIIJI);
        if (this.LJIIIIZZ.getEditText().length() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (LJIJ()) {
            LIZLLL = true;
            z2 = true;
            z = true;
        }
        if (this.LJIJ) {
            LIZLLL = true;
            z = true;
        }
        if ((this.LJIIJJI != CJPayIdType.PASSPORT || z2) && LIZLLL && z && !this.LJIIIZ.hasError() && (c136008cKB = this.LJIIJ) != null && c136008cKB.getEditText().length() == 13 && !this.LJIIJ.hasError()) {
            this.LJII.LIZ(true);
        } else {
            this.LJII.LIZ(false);
        }
    }

    public final boolean LIZLLL() {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 30);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int length = this.LJIIIZ.getEditText().length();
        String obj = this.LJIIIZ.getEditText().mo25203getText().toString();
        if (this.LJIIJJI == CJPayIdType.MAINLAND) {
            z = CJPayIdUtils.isMainLandIdValid(obj);
        }
        if (this.LJIIJJI == CJPayIdType.HK_MACAU && length >= 9) {
            z = true;
        }
        if (this.LJIIJJI == CJPayIdType.TAIWAN && length >= 8) {
            z = true;
        }
        if (this.LJIIJJI == CJPayIdType.PASSPORT && length > 0) {
            z = true;
        }
        if (this.LJIIJJI == CJPayIdType.HK_MACAU_RESIDENCE) {
            z = CJPayIdUtils.isHkMacauResidenceValid(obj);
        }
        if (this.LJIIJJI == CJPayIdType.TAIWAN_RESIDENCE) {
            return CJPayIdUtils.isTaiwanResidenceValid(obj);
        }
        return z;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            this.LJII.LIZIZ.setOnClickListener(new View$OnClickListenerC136116cLv(this));
        }
        this.LJII.LJIILL.setOnClickListener(new View$OnClickListenerC136186cN3(this));
        this.LJII.LJJIII.showDone();
        this.LJII.LJJIII.setOnDoneListener(new C136194cNB(this));
        this.LJII.LJJII.setOnScrollListener(new C136068cL9(this));
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initData() {
        String charSequence;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LJFF().LIZLLL = this;
        C2186b LJFF = LJFF();
        CJPayCardInfoBean cJPayCardInfoBean = this.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{cJPayCardInfoBean}, LJFF, C2186b.LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(cJPayCardInfoBean);
            LJFF.LIZJ = cJPayCardInfoBean;
        }
        C2186b LJFF2 = LJFF();
        if (LJIJ()) {
            charSequence = "";
        } else {
            charSequence = this.LJII.LJI.getText().toString();
        }
        LJFF2.LIZ(charSequence);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 57).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 56).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 55).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported) {
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

    /* renamed from: LJ */
    public final void m16060LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported && this.LJI != null && this.LIZIZ != null) {
            CJPayRealNameBean cJPayRealNameBean = new CJPayRealNameBean();
            cJPayRealNameBean.commonBean.signOrderNo = this.LJI.url_params.sign_order_no;
            cJPayRealNameBean.commonBean.smchId = this.LJI.url_params.smch_id;
            cJPayRealNameBean.commonBean.processInfo = this.LJI.processInfo;
            cJPayRealNameBean.payUid = this.LJI.url_params.pay_uid;
            cJPayRealNameBean.goSetPwd = this.LJI.goSetPwd;
            cJPayRealNameBean.bank_name = this.LIZIZ.bank_info.bank_name;
            cJPayRealNameBean.card_type = this.LIZIZ.bank_info.card_type;
            cJPayRealNameBean.card_no = this.LIZIZ.bank_info.bankCardNum;
            cJPayRealNameBean.is_need_card_info = this.LJI.isNeedCardInfo;
            cJPayRealNameBean.isAuth = LJIJ();
            cJPayRealNameBean.bank_mobile_no = this.LJIIJ.getInputText().replaceAll(" ", "");
            cJPayRealNameBean.activity_info = C136000cK3.LIZIZ.LIZ(this.LIZIZ.bank_info.getVoucherInfoMap(), this.LIZIZ.bank_info.card_type).toString();
            cJPayRealNameBean.end_page_url = this.LJFF;
            if (!TextUtils.isEmpty(LJI())) {
                cJPayRealNameBean.encryptedMobileNumber = LJI();
            }
            if (this.LJI.authorizeClicked) {
                cJPayRealNameBean.id_no = this.LJI.url_params.id_code_mask;
                cJPayRealNameBean.user_name = this.LJI.url_params.id_name_mask;
            }
            if (!LJIJ()) {
                cJPayRealNameBean.user_name = this.LJIIIIZZ.getInputText().replaceAll("[\\s]{2,}", " ").trim();
                cJPayRealNameBean.id_no = this.LJIIIZ.getInputText().replaceAll(" ", "").trim();
                cJPayRealNameBean.id_type = CJPayIdType.getTypeFromIdName(this, this.LJII.LJI.getText().toString());
                if (this.LJIIJJI == CJPayIdType.PASSPORT) {
                    cJPayRealNameBean.country = this.LJJIJ;
                }
            }
            if (cJPayRealNameBean.LIZ(this.LJJIJIIJIL)) {
                if (C136235cNq.LIZ().LIZ("bind_card_count_down_tag", null)) {
                    C135996cJz.LIZ().LIZ("/basebind/CJPaySmsCodeCheckActivity").LIZ(AnimationType.FadeInAndOut).LIZ("param_bind_card_real_name", cJPayRealNameBean).LIZ("param_bind_card_sms_token", (Serializable) this.LJJIJIL.sms_token).LIZ("param_is_independent_bind_card", this.LIZLLL.booleanValue()).LIZ("param_title_content", this.LJJIJIL.verify_text_msg).LIZ(this);
                    return;
                }
                this.LJIILL = System.currentTimeMillis();
                LIZ(true);
                ((C2193f) this.mBasePresenter).LIZ(cJPayRealNameBean);
                return;
            }
            C136235cNq.LIZ().LIZ("bind_card_count_down_tag");
            this.LJIILL = System.currentTimeMillis();
            LIZ(true);
            ((C2193f) this.mBasePresenter).LIZ(cJPayRealNameBean);
        }
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initViews() {
        CJPayCardAddBean cJPayCardAddBean;
        CJPayBusiAuthorizeInfo cJPayBusiAuthorizeInfo;
        CJPayCardInfoBean cJPayCardInfoBean;
        CJPayCardInfoBean cJPayCardInfoBean2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && (cJPayCardInfoBean2 = this.LIZIZ) != null) {
            String str = cJPayCardInfoBean2.bank_info.bank_name;
            String cardTypeStr = this.LIZIZ.bank_info.getCardTypeStr(this);
            TextView textView = this.LJII.LJIIIIZZ;
            new StringBuilder();
            textView.setText(getString(2131561452, new Object[]{C0002O.m25086C(getString(2131561403), str), cardTypeStr}));
            C135988cJr c135988cJr = this.LJII;
            String voucher = this.LIZIZ.bank_info.getVoucher();
            CJPayOneKeyCopyWritingInfo cJPayOneKeyCopyWritingInfo = this.f25463LJ;
            if (!PatchProxy.proxy(new Object[]{voucher, cJPayOneKeyCopyWritingInfo}, c135988cJr, C135988cJr.LIZ, false, 10).isSupported) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) c135988cJr.LJIIL.getLayoutParams();
                if (!TextUtils.isEmpty(voucher)) {
                    layoutParams.addRule(3, 2131195664);
                    c135988cJr.LJIIIZ.setVisibility(0);
                    c135988cJr.LJJ.setVisibility(8);
                    c135988cJr.LJIIIZ.setText(voucher);
                } else {
                    layoutParams.addRule(3, 2131181697);
                    c135988cJr.LJIIIZ.setVisibility(8);
                    c135988cJr.LJJ.setVisibility(0);
                    if (cJPayOneKeyCopyWritingInfo != null && !TextUtils.isEmpty(cJPayOneKeyCopyWritingInfo.display_icon) && !TextUtils.isEmpty(cJPayOneKeyCopyWritingInfo.display_desc)) {
                        C2153b.LJI.LIZ().LIZ(cJPayOneKeyCopyWritingInfo.display_icon, new C136134cMD(c135988cJr));
                        c135988cJr.LJIILJJIL.setText(cJPayOneKeyCopyWritingInfo.display_desc);
                    }
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            this.LJIIZILJ = new C136039cKg(this, (FrameLayout) findViewById(2131170016), this.LJI);
            this.LJIIZILJ.LJFF = new C136059cL0(this);
            this.LJIIZILJ.f17990LJ = new C136032cKZ(this);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported && (cJPayCardInfoBean = this.LIZIZ) != null) {
            this.LJII.f17981LJ.setText(getString(2131561441, new Object[]{cJPayCardInfoBean.bank_info.bank_name, this.LIZIZ.bank_info.getCardTypeStr(this), this.LIZIZ.bank_info.bankCardNum.substring(this.LIZIZ.bank_info.bankCardNum.length() - 4)}));
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            if (LJIJ()) {
                this.LJII.LJIIZILJ.setVisibility(8);
            } else {
                this.LJII.LJIIZILJ.setOnClickListener(new C135995cJy(this));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            if (LJIJ()) {
                this.LJII.LJIJ.setVisibility(8);
            } else {
                this.LJII.LJIJ.setOnClickListener(new C136003cK6(this));
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            CJPayInputKeyboardHelper cJPayInputKeyboardHelper = new CJPayInputKeyboardHelper(false, this.LJII.LJJIII);
            cJPayInputKeyboardHelper.setOnExpandCollapseListener(this.LJJ);
            this.LJIIIIZZ = new BasicInputWrapper(this.LJII.LJIJI, cJPayInputKeyboardHelper);
            BasicInputWrapper basicInputWrapper = this.LJIIIIZZ;
            getContext();
            String stringRes = getStringRes(this, 2131561731);
            getContext();
            basicInputWrapper.bindData(new BasicInputWrapper.InputData(stringRes, getStringRes(this, 2131561445)));
            this.LJIIIIZZ.setInputErrorDetector(CJPayIdUtils.generateNameErrorDetector());
            this.LJIIIIZZ.getEditText().addTextChangedListener(new C136061cL2(this));
            this.LJIIIIZZ.setOnFocusChangeListener(new View$OnFocusChangeListenerC135999cK2(this));
            this.LJIIIIZZ.setTextChangeListener(new C136108cLn(this));
            if (LJIJ()) {
                this.LJIIIIZZ.hide();
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            CJPayInputKeyboardHelper cJPayInputKeyboardHelper2 = new CJPayInputKeyboardHelper(true, this.LJII.LJJIII, true);
            cJPayInputKeyboardHelper2.setOnExpandCollapseListener(this.LJJ);
            this.LJIIIZ = new BasicInputWrapper(this.LJII.LJIJJ, cJPayInputKeyboardHelper2);
            BasicInputWrapper basicInputWrapper2 = this.LJIIIZ;
            getContext();
            String stringRes2 = getStringRes(this, 2131561442);
            getContext();
            basicInputWrapper2.bindData(new BasicInputWrapper.InputData(stringRes2, getStringRes(this, 2131558467)));
            this.LJJI = CJPayIdUtils.generateMainlandTextWatcher(this, this.LJIIIZ, this.LJJIJL, this.LJJIIJ);
            this.LJJIFFI = CJPayIdUtils.generateHKMacauTextWatcher(this, this.LJIIIZ, this.LJJIJL, this.LJJIIJZLJL);
            this.LJJII = CJPayIdUtils.generateTWTextWatcher(this, this.LJIIIZ, this.LJJIJL, this.LJJIIZ);
            this.LJJIII = CJPayIdUtils.generatePassportTextWatcher(this, this.LJIIIZ, this.LJJIJL, this.LJJIIZI);
            this.LJIIIZ.setOnFocusChangeListener(new View$OnFocusChangeListenerC136028cKV(this));
            this.LJIIIZ.setTextChangeListener(new C136109cLo(this));
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
                CJPayPasteAwareEditText editText = this.LJIIIZ.getEditText();
                editText.setOnPasteListener(new C135848cHb(this, editText));
            }
            LJII();
            if (LJIJ()) {
                this.LJIIIZ.hide();
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            String str2 = null;
            CJPayCardAddBean cJPayCardAddBean2 = this.LJI;
            if (cJPayCardAddBean2 != null) {
                str2 = cJPayCardAddBean2.url_params.mobile_mask;
            }
            CJPayInputKeyboardHelper cJPayInputKeyboardHelper3 = new CJPayInputKeyboardHelper(true, this.LJII.LJJIII);
            cJPayInputKeyboardHelper3.setOnExpandCollapseListener(this.LJJ);
            this.LJIIJ = new C136008cKB(this.LJII.LJIJJLI, cJPayInputKeyboardHelper3, str2);
            C136008cKB c136008cKB = this.LJIIJ;
            getContext();
            String stringRes3 = getStringRes(this, 2131561446);
            getContext();
            c136008cKB.bindData(new BasicInputWrapper.InputData(stringRes3, getStringRes(this, 2131561448)));
            this.LJIIJ.setOnFocusChangeListener(new View$OnFocusChangeListenerC136030cKX(this));
            this.LJIIJ.setTextChangeListener(new C136038cKf(this));
            cJPayInputKeyboardHelper3.setOnDeleteListener(new C136056cKx(this));
            if (!TextUtils.isEmpty(str2) && LJIJ()) {
                this.LJIIJ.LIZ(str2, true);
            }
            if (LJIJ()) {
                getContext();
                cJPayInputKeyboardHelper3.showCustomKeyboard(this, this.LJIIJ.getEditText());
                this.LJIIJ.getEditText().postDelayed(new RunnableC136091cLW(this), 300L);
            }
        }
        if (TextUtils.equals(this.LJI.url_params.ab_version, "card_sign_business_auth_v20220330") && !PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported && (cJPayCardAddBean = this.LJI) != null && (cJPayBusiAuthorizeInfo = (CJPayBusiAuthorizeInfo) CJPayJsonParser.fromJson(cJPayCardAddBean.busi_authorize_info_str, CJPayBusiAuthorizeInfo.class)) != null && cJPayBusiAuthorizeInfo.is_need_authorize) {
            if (this.LJI.url_params != null && !TextUtils.isEmpty(this.LJI.url_params.uid_mobile_mask)) {
                cJPayBusiAuthorizeInfo.uidMobileMask = this.LJI.url_params.uid_mobile_mask;
                ArrayList<String> arrayList = cJPayBusiAuthorizeInfo.busi_authorize_content.propose_contents;
                new StringBuilder();
                getContext();
                arrayList.add(C0002O.m25086C(getStringRes(this, 2131561988), cJPayBusiAuthorizeInfo.uidMobileMask));
            }
            cJPayBusiAuthorizeInfo.needIdentify = 1;
            cJPayBusiAuthorizeInfo.hasPass = 0;
            cJPayBusiAuthorizeInfo.showOneStep = 0;
            cJPayBusiAuthorizeInfo.isOneStep = 0;
            cJPayBusiAuthorizeInfo.authType = "four_elements";
            this.LJIIIIZZ.initAuthLayout(cJPayBusiAuthorizeInfo.busi_authorize_content.business_brief_info.input_display_icon, cJPayBusiAuthorizeInfo.busi_authorize_content.business_brief_info.input_display_desc, new C136017cKK(this, cJPayBusiAuthorizeInfo));
            this.LJIIIIZZ.tryShowAuthLayout(true);
            LIZ(cJPayBusiAuthorizeInfo);
        }
        CJPayCardInfoBean cJPayCardInfoBean3 = this.LIZIZ;
        if (cJPayCardInfoBean3 != null) {
            String str3 = cJPayCardInfoBean3.guide_message;
            if (!PatchProxy.proxy(new Object[]{str3}, this, LIZ, false, 21).isSupported) {
                try {
                    if (this.LIZIZ != null) {
                        this.LIZIZ.protocol_group_names = new JSONObject(this.LIZJ);
                        this.LJIL = this.LIZIZ.isNeedCheckBox();
                    }
                } catch (JSONException unused) {
                }
                C135401cAO c135401cAO = new C135401cAO(this.LJII.LJIL, this.LIZIZ.getCardProtocolGroupBeanList(), str3, this.LJIL);
                c135401cAO.LIZJ = new C135940cJ5(this);
                if (this.LJIL) {
                    c135401cAO.LIZ(this.LJIJJLI);
                }
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            this.LJII.LJFF.setOnClickListener(new C135993cJw(this));
        }
    }

    public final void LIZ(CJPayBusiAuthorizeInfo cJPayBusiAuthorizeInfo) {
        if (PatchProxy.proxy(new Object[]{cJPayBusiAuthorizeInfo}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (cJPayBusiAuthorizeInfo != null && !cJPayBusiAuthorizeInfo.is_need_authorize) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC136014cKH(this, cJPayBusiAuthorizeInfo), 300L);
    }

    private void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 40).isSupported) {
            return;
        }
        this.LJIIIIZZ.getEditText().setFocusable(z);
        this.LJIIIIZZ.getEditText().setFocusableInTouchMode(z);
        this.LJIIIZ.getEditText().setFocusable(z);
        this.LJIIIZ.getEditText().setFocusableInTouchMode(z);
        this.LJIIJ.getEditText().setFocusable(z);
        this.LJIIJ.getEditText().setFocusableInTouchMode(z);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 3).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 2).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        this.mSwipeToFinishView = new SwipeToFinishView(this);
        this.mSwipeToFinishView.setBackgroundColor("#00000000");
        this.mSwipeToFinishView = this.mSwipeToFinishView;
        this.mSwipeToFinishView.setEnableSwipe(false);
    }

    @Override // p003X.AbstractActivityC135714cFR
    public final void LIZ(Map<String, String> map) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (!PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 45).isSupported && map != null) {
            this.LJJIJIIJI = map.get("country_name");
            this.LJJIJ = map.get("country_code");
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported) {
                TextView textView = this.LJII.LJIIJ;
                if (TextUtils.isEmpty(this.LJJIJIIJI)) {
                    i = 4;
                } else {
                    i = 0;
                }
                textView.setVisibility(i);
                TextView textView2 = this.LJII.LJII;
                if (TextUtils.isEmpty(this.LJJIJIIJI)) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                textView2.setVisibility(i2);
                ImageView imageView = this.LJII.LIZJ;
                if (TextUtils.isEmpty(this.LJJIJIIJI)) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                imageView.setVisibility(i3);
                this.LJII.LJII.setText(this.LJJIJIIJI);
                ImageView imageView2 = this.LJII.LIZLLL;
                if (TextUtils.isEmpty(this.LJJIJIIJI)) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                imageView2.setVisibility(i4);
                TextView textView3 = this.LJII.LJIIJJI;
                if (!TextUtils.isEmpty(this.LJJIJIIJI)) {
                    i5 = 8;
                }
                textView3.setVisibility(i5);
                LIZJ();
            }
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 39).isSupported) {
            return;
        }
        if (z) {
            this.LJII.LJJI.setVisibility(0);
            this.LJII.LJFF.setText("");
            LIZIZ(false);
            this.LJJJZ = true;
            return;
        }
        this.LJII.LJJI.setVisibility(8);
        CJPayCustomButton cJPayCustomButton = this.LJII.LJFF;
        getContext();
        cJPayCustomButton.setText(getStringRes(this, 2131561464));
        LIZIZ(true);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported && this.LJIJ) {
            this.LJIIIIZZ.getEditText().setFocusable(false);
            this.LJIIIIZZ.getEditText().setFocusableInTouchMode(false);
            this.LJIIIZ.getEditText().setFocusable(false);
            this.LJIIIZ.getEditText().setFocusableInTouchMode(false);
        }
        this.LJJJZ = false;
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$b
    public final void LIZIZ(JSONObject jSONObject, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{jSONObject, cJPayRealNameBean}, this, LIZ, false, 50).isSupported) {
            return;
        }
        LIZJ(jSONObject, cJPayRealNameBean);
    }

    public final void LIZ(String str, View.OnClickListener onClickListener) {
        if (PatchProxy.proxy(new Object[]{str, onClickListener}, this, LIZ, false, 37).isSupported) {
            return;
        }
        CJPayButtonInfo cJPayButtonInfo = new CJPayButtonInfo();
        cJPayButtonInfo.page_desc = str;
        cJPayButtonInfo.button_type = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
        getContext();
        cJPayButtonInfo.button_desc = getStringRes(this, 2131561708);
        this.LJII.LIZ(this, this.LJIIJ, cJPayButtonInfo, this.LIZIZ.bank_info.getCardTypeStr(this), this.LIZIZ.bank_info.bank_name, onClickListener);
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$b
    public final void LIZ(JSONObject jSONObject, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{jSONObject, cJPayRealNameBean}, this, LIZ, false, 49).isSupported) {
            return;
        }
        LIZJ(jSONObject, cJPayRealNameBean);
    }

    private void LIZJ(JSONObject jSONObject, CJPayRealNameBean cJPayRealNameBean) {
        String charSequence;
        if (PatchProxy.proxy(new Object[]{jSONObject, cJPayRealNameBean}, this, LIZ, false, 44).isSupported || isFinishing()) {
            return;
        }
        this.LJIILLIIL = System.currentTimeMillis();
        getLayoutRootView().postDelayed(new RunnableC136176cMt(this), 400L);
        if (jSONObject.has("error_code")) {
            LJFF().LIZLLL("0");
            try {
                LJFF().LIZJ(0, jSONObject.optString("error_code"), jSONObject.optString("error_msg"));
            } catch (Exception unused) {
            }
            CJPayBasicUtils.displayToast(this, getResources().getString(2131558456));
            return;
        }
        CJPaySmsTokenBean cJPaySmsTokenBean = (CJPaySmsTokenBean) CJPayJsonParser.fromJson(C136182cMz.LIZ(jSONObject), CJPaySmsTokenBean.class);
        if (cJPaySmsTokenBean == null) {
            return;
        }
        if (cJPaySmsTokenBean.isResponseOK()) {
            LJFF().LIZLLL("1");
            LJFF().LIZJ(1, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
            this.LJJIJIIJIL = cJPayRealNameBean;
            this.LJJIJIL = cJPaySmsTokenBean;
            C135996cJz.LIZ().LIZ("/basebind/CJPaySmsCodeCheckActivity").LIZ(AnimationType.FadeInAndOut).LIZ("param_bind_card_real_name", cJPayRealNameBean).LIZ("param_bind_card_sms_token", (Serializable) cJPaySmsTokenBean.sms_token).LIZ("param_is_independent_bind_card", this.LIZLLL.booleanValue()).LIZ("param_title_content", cJPaySmsTokenBean.verify_text_msg).LIZ(this);
        } else if (cJPaySmsTokenBean.button_info.isGoCustomerServiceDialog() && cJPaySmsTokenBean.button_info.isShow()) {
            String LJI = C135876cI3.LJI();
            String LJII = C135876cI3.LJII();
            C135737cFo.LIZ().LIZ(cJPaySmsTokenBean.button_info.toStandardCJPayButtonInfo()).LIZ(cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg).LIZ(C135876cI3.f17973LJ.LJIIIIZZ()).LIZ(this).LIZ().LIZ(new C135742cFt(this, cJPaySmsTokenBean, LJI, LJII)).LIZIZ();
            C135737cFo.LIZ("form", cJPaySmsTokenBean.code, cJPaySmsTokenBean.button_info.page_desc, LJI, LJII);
        } else if ("MP010033".equals(cJPaySmsTokenBean.code) && "1".equals(cJPaySmsTokenBean.button_info.button_status)) {
            C135988cJr c135988cJr = this.LJII;
            CJPayButtonInfo cJPayButtonInfo = cJPaySmsTokenBean.button_info;
            if (!PatchProxy.proxy(new Object[]{this, cJPayButtonInfo}, c135988cJr, C135988cJr.LIZ, false, 7).isSupported && cJPayButtonInfo != null) {
                View$OnClickListenerC135560cCx view$OnClickListenerC135560cCx = new View$OnClickListenerC135560cCx(c135988cJr);
                View$OnClickListenerC135561cCy view$OnClickListenerC135561cCy = new View$OnClickListenerC135561cCy(c135988cJr);
                View$OnClickListenerC135562cCz view$OnClickListenerC135562cCz = new View$OnClickListenerC135562cCz(c135988cJr);
                CJPayDialogBuilder activity = CJPayDialogUtils.getDefaultBuilder(this).setActivity(this);
                activity.setTitle(cJPayButtonInfo.page_desc);
                activity.setLeftBtnStr(cJPayButtonInfo.left_button_desc);
                activity.setRightBtnStr(cJPayButtonInfo.right_button_desc);
                activity.setSingleBtnStr(getString(2131561707));
                activity.setSingleBtnListener(view$OnClickListenerC135561cCy);
                activity.setLeftBtnListener(view$OnClickListenerC135560cCx);
                activity.setRightBtnListener(view$OnClickListenerC135562cCz);
                activity.setLeftBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
                activity.setRightBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
                activity.setSingleBtnColor(C116971W2r.LIZ(getResources(), 2131624875));
                activity.setLeftBtnBold(false);
                activity.setRightBtnBold(false);
                activity.setSingleBtnBold(false);
                activity.setThemeResId(2131493160);
                c135988cJr.LJJIIJ = CJPayDialogUtils.initDialog(activity);
                C116971W2r.LIZJ(c135988cJr.LJJIIJ);
                try {
                    JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
                    JSONObject LIZLLL = C135734cFl.LIZLLL();
                    LIZLLL.put("auth_type", "four_elements");
                    C135734cFl.LIZ("wallet_businesstopay_auth_fail_imp", LIZ2, LIZLLL);
                } catch (Exception unused2) {
                }
            }
            LJFF().LIZJ(0, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
        } else {
            LJFF().LIZLLL("0");
            LJFF().LIZJ(0, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
            if (!TextUtils.isEmpty(cJPaySmsTokenBean.msg)) {
                String str = cJPaySmsTokenBean.msg;
                String str2 = cJPaySmsTokenBean.code;
                if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 38).isSupported) {
                    CJPayButtonInfo cJPayButtonInfo2 = new CJPayButtonInfo();
                    cJPayButtonInfo2.page_desc = str;
                    if ("MP020308".equals(str2)) {
                        cJPayButtonInfo2.button_type = "2";
                        getContext();
                        cJPayButtonInfo2.page_desc = getStringRes(this, 2131561428);
                    } else {
                        cJPayButtonInfo2.button_type = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
                    }
                    cJPayButtonInfo2.error_code = str2;
                    getContext();
                    cJPayButtonInfo2.button_desc = getStringRes(this, 2131561708);
                    getContext();
                    cJPayButtonInfo2.left_button_desc = getStringRes(this, 2131558453);
                    cJPayButtonInfo2.left_button_action = 1;
                    getContext();
                    cJPayButtonInfo2.right_button_desc = getStringRes(this, 2131561433);
                    cJPayButtonInfo2.right_button_action = 2;
                    LJFF().LIZ(2, str, str2);
                    this.LJII.LIZ(this, this.LJIIJ, cJPayButtonInfo2, this.LIZIZ.bank_info.getCardTypeStr(this), this.LIZIZ.bank_info.bank_name, null);
                }
            }
        }
        C2186b LJFF = LJFF();
        long j = this.LJIILLIIL - this.LJIILL;
        if (LJIJ()) {
            charSequence = "";
        } else {
            charSequence = this.LJII.LJI.getText().toString();
        }
        if (!PatchProxy.proxy(new Object[]{new Long(j), charSequence}, LJFF, C2186b.LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(charSequence);
            try {
                JSONObject LIZLLL2 = C135734cFl.LIZLLL();
                LIZLLL2.put("loading_time", j);
                LIZLLL2.put("type", charSequence);
                CJPayCardInfoBean cJPayCardInfoBean = LJFF.LIZJ;
                if (cJPayCardInfoBean == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LIZLLL2.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(LJFF.LIZLLL));
                CJPayCardInfoBean cJPayCardInfoBean2 = LJFF.LIZJ;
                if (cJPayCardInfoBean2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LIZLLL2.put("bank_name", cJPayCardInfoBean2.bank_info.bank_name);
                LJFF.LIZ("wallet_bcard_yaosu_check_time", LIZLLL2);
            } catch (Exception unused3) {
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 42).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 42) {
            CJPayIdType typeFromLabel = CJPayIdType.getTypeFromLabel(intent.getStringExtra("param_current_id"));
            if (typeFromLabel == this.LJIIJJI) {
                return;
            }
            this.LJIIJJI = typeFromLabel;
            this.LJII.LJI.setText(CJPayIdType.getIdNameFromType(this, typeFromLabel));
            LJFF().LIZ(CJPayIdType.getIdNameFromType(this, typeFromLabel));
            this.LJII.LJIJ.setVisibility(8);
            int i3 = C136060cL1.LIZIZ[typeFromLabel.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        LJII();
                    } else if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 34).isSupported) {
                        this.LJII.LJIJ.setVisibility(0);
                        this.LJII.LJII.setText(this.LJJIJIIJI);
                        CJPayInputKeyboardHelper cJPayInputKeyboardHelper = new CJPayInputKeyboardHelper(false, this.LJII.LJJIII);
                        cJPayInputKeyboardHelper.setOnExpandCollapseListener(this.LJJ);
                        this.LJIIIZ.switchKeyboard(cJPayInputKeyboardHelper);
                        CJPayPasteAwareEditText editText = this.LJIIIZ.getEditText();
                        editText.clearFocus();
                        editText.mo25203getText().clear();
                        this.LJJIII.afterTextChanged(editText.mo25203getText());
                        editText.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(9), CJPayIdUtils.getPPIdFilterWithRegex()});
                        editText.removeTextChangedListener(this.LJJI);
                        editText.removeTextChangedListener(this.LJJIFFI);
                        editText.removeTextChangedListener(this.LJJII);
                        editText.addTextChangedListener(this.LJJIII);
                        this.LJIIIIZZ.disableInfoButton();
                        this.LJIIIIZZ.tryShowAuthLayout(false);
                        this.LJIIIZ.enableInfoButton(new C136005cK8(this));
                        LIZJ();
                    }
                } else if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
                    CJPayInputKeyboardHelper cJPayInputKeyboardHelper2 = new CJPayInputKeyboardHelper(true, this.LJII.LJJIII);
                    cJPayInputKeyboardHelper2.setOnExpandCollapseListener(this.LJJ);
                    this.LJIIIZ.switchKeyboard(cJPayInputKeyboardHelper2);
                    CJPayPasteAwareEditText editText2 = this.LJIIIZ.getEditText();
                    editText2.clearFocus();
                    editText2.mo25203getText().clear();
                    this.LJJII.afterTextChanged(editText2.mo25203getText());
                    editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(8)});
                    editText2.removeTextChangedListener(this.LJJI);
                    editText2.removeTextChangedListener(this.LJJIFFI);
                    editText2.removeTextChangedListener(this.LJJIII);
                    editText2.addTextChangedListener(this.LJJII);
                    this.LJIIIIZZ.enableInfoButton(new C136076cLH(this));
                    this.LJIIIIZZ.tryShowAuthLayout(false);
                    this.LJIIIZ.enableInfoButton(new C136078cLJ(this));
                    LIZJ();
                }
            } else if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported) {
                CJPayInputKeyboardHelper cJPayInputKeyboardHelper3 = new CJPayInputKeyboardHelper(false, this.LJII.LJJIII);
                cJPayInputKeyboardHelper3.setOnExpandCollapseListener(this.LJJ);
                this.LJIIIZ.switchKeyboard(cJPayInputKeyboardHelper3);
                CJPayPasteAwareEditText editText3 = this.LJIIIZ.getEditText();
                editText3.clearFocus();
                editText3.mo25203getText().clear();
                this.LJJIFFI.afterTextChanged(editText3.mo25203getText());
                editText3.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(9), CJPayIdUtils.getHMIdFilterWithRegex()});
                editText3.removeTextChangedListener(this.LJJI);
                editText3.removeTextChangedListener(this.LJJII);
                editText3.removeTextChangedListener(this.LJJIII);
                editText3.addTextChangedListener(this.LJJIFFI);
                this.LJIIIIZZ.enableInfoButton(new C136075cLG(this));
                this.LJIIIIZZ.tryShowAuthLayout(false);
                this.LJIIIZ.enableInfoButton(new C136077cLI(this));
                LIZJ();
            }
            this.LJIIIIZZ.showMaskView(false);
            this.LJIIIZ.showMaskView(false);
            this.LJIIJ.showMaskView(false);
            if (this.LJIJ) {
                this.LJIIIIZZ.clearText();
                this.LJIIIZ.clearText();
                this.LJIIJ.clearText();
                this.LJIJ = false;
                this.LJIIZILJ.LIZ();
            }
        } else if (i == 43) {
            m16060LJ();
        }
    }
}
