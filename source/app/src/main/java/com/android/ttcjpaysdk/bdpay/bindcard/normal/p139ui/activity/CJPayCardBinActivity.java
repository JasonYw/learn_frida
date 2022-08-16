package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity;

import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.android.ttcjpaysdk.base.p135ui.widget.CJPayKeyboardView;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.ICJPayOCRService;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2185a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b.C2189a;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.C2191b;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter.CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBankInfoBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayButtonInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayKeepDialogBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayOneKeyCopyWritingInfo;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsTokenBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySupportBankBean;
import com.android.ttcjpaysdk.bindcard.base.p142ui.BankCardListFragment;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.bindcard.base.view.a$a;
import com.android.ttcjpaysdk.thirdparty.data.C2341h;
import com.android.ttcjpaysdk.thirdparty.data.CJPayLynxBindCardEndPageSchemeInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.android.ttcjpaysdk.thirdparty.utils.CJPayIdUtils;
import com.android.ttcjpaysdk.thirdparty.view.CJPayPasteAwareEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractActivityC135714cFR;
import p003X.AbstractC135990cJt;
import p003X.C106862S5w;
import p003X.C116125VnT;
import p003X.C116971W2r;
import p003X.C135347c9W;
import p003X.C135401cAO;
import p003X.C135464cBP;
import p003X.C135611cDm;
import p003X.C135726cFd;
import p003X.C135734cFl;
import p003X.C135737cFo;
import p003X.C135743cFu;
import p003X.C135754cG5;
import p003X.C135846cHZ;
import p003X.C135876cI3;
import p003X.C135912cId;
import p003X.C135916cIh;
import p003X.C135939cJ4;
import p003X.C135985cJo;
import p003X.C135986cJp;
import p003X.C135992cJv;
import p003X.C135994cJx;
import p003X.C135996cJz;
import p003X.C135997cK0;
import p003X.C136000cK3;
import p003X.C136004cK7;
import p003X.C136011cKE;
import p003X.C136026cKT;
import p003X.C136035cKc;
import p003X.C136039cKg;
import p003X.C136041cKi;
import p003X.C136044cKl;
import p003X.C136051cKs;
import p003X.C136057cKy;
import p003X.C136058cKz;
import p003X.C136069cLA;
import p003X.C136082cLN;
import p003X.C136083cLO;
import p003X.C136104cLj;
import p003X.C136107cLm;
import p003X.C136169cMm;
import p003X.C136180cMx;
import p003X.C136182cMz;
import p003X.C136183cN0;
import p003X.C136192cN9;
import p003X.C136204cNL;
import p003X.C136221cNc;
import p003X.C136235cNq;
import p003X.C136757cWG;
import p003X.C9H6;
import p003X.DialogC135318c93;
import p003X.DialogC137460chc;
import p003X.GOY;
import p003X.RunnableC136037cKe;
import p003X.RunnableC136081cLM;
import p003X.RunnableC136110cLp;
import p003X.RunnableC136126cM5;
import p003X.RunnableC136163cMg;
import p003X.RunnableC136173cMq;
import p003X.RunnableC136174cMr;
import p003X.RunnableC136175cMs;
import p003X.View$OnClickListenerC135367c9q;
import p003X.View$OnClickListenerC136052cKt;
import p003X.View$OnClickListenerC136053cKu;
import p003X.View$OnClickListenerC136054cKv;
import p003X.View$OnClickListenerC136055cKw;
import p003X.View$OnClickListenerC136071cLC;
import p003X.View$OnClickListenerC136090cLV;
import p003X.View$OnClickListenerC136100cLf;
import p003X.View$OnClickListenerC136153cMW;
import p003X.View$OnClickListenerC136184cN1;
import p003X.View$OnClickListenerC136185cN2;
import p003X.View$OnClickListenerC136190cN7;
import p003X.View$OnFocusChangeListenerC136007cKA;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayCardBinActivity */
/* loaded from: classes17.dex */
public class CJPayCardBinActivity extends AbstractActivityC135714cFR<C2191b, C2185a> implements View.OnClickListener, e$a {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25462LJ;
    public boolean LJI;
    public boolean LJII;
    public RelativeLayout LJIIIZ;
    public ProgressBar LJIIJ;
    public ImageView LJIIJJI;
    public C135986cJp LJIIL;
    public CJPayKeyboardView LJIILIIL;
    public DialogC135318c93 LJIILJJIL;
    public CJPayCardInfoBean LJIJI;
    public CJPaySupportBankBean LJIJJ;
    public DialogC137460chc LJIJJLI;
    public BankCardListFragment LJJI;
    public C136004cK7 LJJIFFI;
    public C136039cKg LJJII;
    public RelativeLayout LJJIII;
    public LinearLayout LJJIIJ;
    public NestedScrollView LJJIIZ;
    public int LJJIIZI;
    public TextView LJJIJ;
    public ImageView LJJIJIIJI;
    public RelativeLayout LJJIJIIJIL;
    public TextView LJJIJL;
    public TextView LJJIJLIJ;
    public TextView LJJIL;
    public ImageView LJJIZ;
    public LinearLayout LJJJ;
    public CJPayBankInfoBean LJJJIL;
    public String LJJJJ;
    public TextView LJJJJI;
    public LinearLayout LJJJJIZL;
    public ImageView LJJJJJ;
    public TextView LJJJJJL;
    public String LJJJJL;
    public String LJJJJLI;
    public String LJJJJLL;
    public String LJJJJZ;
    public DialogC137460chc LJJJLL;
    public CJPayCustomButton LJJL;
    public RelativeLayout LJJLI;
    public CJPayInputKeyboardHelper LJJLIIIIJ;
    public C135401cAO LJJLIIIJJIZ;
    public CJPayRealNameBean LJJLIIIJL;
    public CJPaySmsTokenBean LJJLIIIJLJLI;
    public RelativeLayout LJJLIIIJLLLLLLLZ;
    public TextView LJJLIIJ;
    public TextView LJJLIL;
    public View LJJLJ;
    public RelativeLayout LJJLJLI;
    public RelativeLayout LJJLL;
    public RelativeLayout LJJZ;
    public RelativeLayout LJJZZI;
    public TextView LJJZZIII;
    public TextView LJL;
    public boolean LJLILLLLZI;
    public boolean LJFF = true;
    public CJPayCardAddBean LJIIIIZZ = C135876cI3.LIZ();
    public String LJIILL = "";
    public String LJIILLIIL = "";
    public String LJIIZILJ = "0";
    public boolean LJJLIIIJ = false;
    public boolean LJIJ = false;
    public boolean LJJLIIIJILLIZJL = false;
    public boolean LJIL = true;
    public boolean LJJLIIIJJI = false;
    public boolean LJJ = false;
    public boolean LJJIIJZLJL = false;
    public boolean LJJIJIL = true;
    public String LJJJI = "";
    public int LJJJJZI = 0;
    public boolean LJLI = false;
    public boolean LJLIIIL = false;
    public ICJPayNormalBindCardService.SourceType LJLIIL = ICJPayNormalBindCardService.SourceType.Null;
    public long LJLIL = 0;
    public String LJJJLIIL = "lastNo";

    static {
        Covode.recordClassIndex(6788);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public int getLayoutId() {
        return 2131690602;
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void next() {
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 73).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 68).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 67).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final DialogC137460chc LJIILIIL() {
        return this.LJIJJLI;
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 24).isSupported) {
            return;
        }
        LJIIZILJ().LIZ(System.currentTimeMillis() - this.LJLIL);
        this.LJJLIIIJILLIZJL = false;
        C116125VnT.LIZ().LIZ(new C135985cJo(this, jSONObject));
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 29).isSupported) {
            return;
        }
        this.LJJLIIIJ = z;
        this.LJJL.setEnabled(z);
        this.LJJL.setVisibility(0);
    }

    public final void LIZ(String str, boolean z, boolean z2, boolean z3) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 34).isSupported) {
            return;
        }
        this.LJLILLLLZI = z2;
        getContext();
        if (CJPayBasicUtils.isNetworkAvailable(this)) {
            if (this.LJIIIIZZ == null || TextUtils.isEmpty(this.LJIILL) || this.LJIILL.length() < 6) {
                return;
            }
            this.LJJJLIIL = str;
            ((C2191b) this.mBasePresenter).LIZ(str, z, z3);
            return;
        }
        LIZIZ(false);
        this.LJIJ = true;
        this.LJJIJIL = false;
        if (!z2) {
            return;
        }
        getContext();
        CJPayBasicUtils.displayToast(this, getString(2131558456));
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZ(JSONObject jSONObject, String str, boolean z) {
        CJPayCardInfoBean cJPayCardInfoBean;
        CJPayCardInfoBean cJPayCardInfoBean2;
        CJPayCardInfoBean cJPayCardInfoBean3;
        if (!PatchProxy.proxy(new Object[]{jSONObject, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 35).isSupported && (cJPayCardInfoBean = (CJPayCardInfoBean) CJPayJsonParser.fromJson(C136182cMz.LIZ(jSONObject), CJPayCardInfoBean.class)) != null && this.LJIILL.length() >= 6) {
            String str2 = "";
            if (cJPayCardInfoBean.isResponseOK()) {
                if (str.length() < this.LJIILL.length() && this.LJIJ) {
                    return;
                }
                this.LJIIL.LIZIZ();
                LJI();
                if (!PatchProxy.proxy(new Object[]{cJPayCardInfoBean}, this, LIZ, false, 39).isSupported) {
                    this.LJJIJIL = false;
                    this.LJIJ = true;
                    if (this.LJIILL.length() >= 12) {
                        if (this.LJIILLIIL.length() >= 11 && LJIJ() && !this.LJJIFFI.LJIIJJI) {
                            LIZ(true);
                        } else if (!LJIJ()) {
                            LIZ(true);
                        }
                    } else {
                        LIZ(false);
                    }
                    this.LJIJI = cJPayCardInfoBean;
                    LJIIZILJ().LIZJ = this.LJIJI;
                    CJPaySupportBankBean cJPaySupportBankBean = this.LJIJJ;
                    if (cJPaySupportBankBean != null && CJPayQuickBindCardUtils.m16059LJ(cJPaySupportBankBean.exts.use_order_info_test)) {
                        C135986cJp c135986cJp = this.LJIIL;
                        CJPayBankInfoBean cJPayBankInfoBean = cJPayCardInfoBean.bank_info;
                        getContext();
                        c135986cJp.LIZ(cJPayBankInfoBean.getCardBinInfo(this), cJPayCardInfoBean.bank_info.icon_url, cJPayCardInfoBean.bank_info.getVoucher(), cJPayCardInfoBean.bank_info.getCardBinVoucher());
                    } else {
                        CJPayVoucherInfo cJPayVoucherInfo = cJPayCardInfoBean.bank_info.getVoucherInfoMap().get(cJPayCardInfoBean.bank_info.card_type);
                        String str3 = cJPayVoucherInfo != null ? cJPayVoucherInfo.voucher_msg : str2;
                        C135986cJp c135986cJp2 = this.LJIIL;
                        CJPayBankInfoBean cJPayBankInfoBean2 = cJPayCardInfoBean.bank_info;
                        getContext();
                        c135986cJp2.LIZ(cJPayBankInfoBean2.getCardBinInfo(this), cJPayCardInfoBean.bank_info.icon_url, cJPayCardInfoBean.bank_info.getVoucher(), str3);
                    }
                    if (!this.LJJLIIIJJI) {
                        this.LJJLIIIJJI = true;
                        C2185a LJIIZILJ = LJIIZILJ();
                        String str4 = cJPayCardInfoBean.bank_info.bank_name;
                        CJPayBankInfoBean cJPayBankInfoBean3 = cJPayCardInfoBean.bank_info;
                        getContext();
                        LJIIZILJ.LIZ(str4, cJPayBankInfoBean3.getCardTypeStr(this), this.LJJJJZI);
                    }
                }
                if (this.LJIJI != null && LJIJ()) {
                    if (this.LJIJI.protocol_group_names != null) {
                        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJJLIIIJLLLLLLLZ.getLayoutParams();
                        int i = layoutParams.leftMargin;
                        getContext();
                        layoutParams.setMargins(i, CJPayBasicUtils.dipToPX(this, 41.0f), layoutParams.rightMargin, layoutParams.bottomMargin);
                        String str5 = this.LJIJI.guide_message;
                        if (!PatchProxy.proxy(new Object[]{str5}, this, LIZ, false, 61).isSupported && (cJPayCardInfoBean3 = this.LJIJI) != null) {
                            try {
                                String jSONObject2 = cJPayCardInfoBean3.protocol_group_names != null ? this.LJIJI.protocol_group_names.toString() : str2;
                                if (this.LJIJI != null) {
                                    this.LJIJI.protocol_group_names = new JSONObject(jSONObject2);
                                }
                            } catch (JSONException unused) {
                            }
                            this.LJI = this.LJIJI.isNeedCheckBox();
                            this.LJJLIIIJJIZ = new C135401cAO(this.LJJIIJ, this.LJIJI.getCardProtocolGroupBeanList(), str5, this.LJI);
                            this.LJJLIIIJJIZ.LIZJ = new C135939cJ4(this);
                            if (this.LJI) {
                                this.LJJLIIIJJIZ.LIZ(this.LJII);
                            }
                            this.LJJIIJ.setVisibility(0);
                        }
                    }
                    CJPayCardAddBean cJPayCardAddBean = this.LJIIIIZZ;
                    if (cJPayCardAddBean != null && !TextUtils.isEmpty(cJPayCardAddBean.url_params.mobile_mask) && LJIJ() && TextUtils.isEmpty(this.LJIILLIIL)) {
                        this.LJJIFFI.LIZLLL(this.LJIIIIZZ.url_params.mobile_mask);
                    }
                    this.LJJIFFI.show();
                    this.LJJL.setText(getString(2131561464));
                    if (this.LJJIJIIJIL.getVisibility() != 0) {
                        this.LJIIL.LJIIJJI();
                        LJIIJJI();
                    }
                }
                if (!this.LJLILLLLZI || PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported || (cJPayCardInfoBean2 = this.LJIJI) == null || !this.LJIJ) {
                    return;
                }
                cJPayCardInfoBean2.bank_info.bankCardNum = this.LJIILL;
                this.LJIJI.isOCRCardNo = this.LJJ;
                CJPayCardAddBean cJPayCardAddBean2 = this.LJIIIIZZ;
                if (cJPayCardAddBean2 != null) {
                    cJPayCardAddBean2.processInfo = CJPayQuickBindCardUtils.LIZJ;
                }
                if (LJIJ()) {
                    if (CJPayBasicUtils.isNetworkAvailable(this)) {
                        LJIIL();
                    } else {
                        CJPayBasicUtils.displayToast(this, getResources().getString(2131558456));
                    }
                } else {
                    CJPaySupportBankBean cJPaySupportBankBean2 = this.LJIJJ;
                    CJPayOneKeyCopyWritingInfo cJPayOneKeyCopyWritingInfo = cJPaySupportBankBean2 == null ? new CJPayOneKeyCopyWritingInfo() : cJPaySupportBankBean2.card_bind_copywriting_info;
                    C136011cKE LIZ2 = C135996cJz.LIZ().LIZ("/normalbind/CJPayFourElementsActivity").LIZ(AnimationType.SlideLeftAndRigth).LIZ("param_bank_card_info", this.LJIJI);
                    if (this.LJIJI.protocol_group_names != null) {
                        str2 = this.LJIJI.protocol_group_names.toString();
                    }
                    LIZ2.LIZ("params_protocol_group_names", (Serializable) str2).LIZ("param_is_independent_bind_card", this.LIZIZ).LIZ("params_one_key_copy_writing_info", cJPayOneKeyCopyWritingInfo).LIZ("bind_card_result_lynx_scheme", LJIJJ()).LIZ(this);
                }
                RelativeLayout relativeLayout = this.LJIIIZ;
                if (relativeLayout != null) {
                    relativeLayout.postDelayed(new RunnableC136174cMr(this), 600L);
                } else {
                    LIZIZ(false);
                }
            } else if (this.LJLILLLLZI) {
                this.LJIJ = false;
                LIZ(cJPayCardInfoBean.code, cJPayCardInfoBean.button_info.button_status, cJPayCardInfoBean.button_info.button_type, cJPayCardInfoBean.button_info.page_desc, cJPayCardInfoBean.button_info, cJPayCardInfoBean.code, cJPayCardInfoBean.msg);
                if ("6".equals(cJPayCardInfoBean.button_info.button_type)) {
                    LJIIZILJ().LIZ(cJPayCardInfoBean.code, cJPayCardInfoBean.button_info.page_desc, "bubble", this.LJJJJZI);
                } else if ("5".equals(cJPayCardInfoBean.button_info.button_type)) {
                    LJIIZILJ().LIZ(cJPayCardInfoBean.code, cJPayCardInfoBean.button_info.page_desc, "pop", this.LJJJJZI);
                } else {
                    LJIIZILJ().LIZ(cJPayCardInfoBean.code, cJPayCardInfoBean.button_info.page_desc, str2, this.LJJJJZI);
                }
            } else {
                this.LJIJ = false;
                if (!"1".equals(C136035cKc.LJIIIIZZ().LIZ(true))) {
                    LIZ(false);
                }
                if (!z) {
                    return;
                }
                LIZ(cJPayCardInfoBean.code, TextUtils.isEmpty(cJPayCardInfoBean.button_info.page_desc) ? cJPayCardInfoBean.msg : cJPayCardInfoBean.button_info.page_desc, cJPayCardInfoBean.button_info.button_type, cJPayCardInfoBean.button_info.page_desc, cJPayCardInfoBean.button_info.button_desc, cJPayCardInfoBean.button_info.action);
                if ("6".equals(cJPayCardInfoBean.button_info.button_type)) {
                    LJIIZILJ().LIZ(cJPayCardInfoBean.code, cJPayCardInfoBean.button_info.page_desc, "bubble", this.LJJJJZI);
                } else if ("5".equals(cJPayCardInfoBean.button_info.button_type)) {
                } else {
                    LJIIZILJ().LIZ(cJPayCardInfoBean.code, cJPayCardInfoBean.button_info.page_desc, str2, this.LJJJJZI);
                }
            }
        }
    }

    private View.OnClickListener LJIJJLI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 57);
        if (proxy.isSupported) {
            return (View.OnClickListener) proxy.result;
        }
        return new View$OnClickListenerC136053cKu(this);
    }

    public final void LJFF() {
        C135986cJp c135986cJp;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 32).isSupported && (c135986cJp = this.LJIIL) != null) {
            c135986cJp.LIZIZ.post(new RunnableC136126cM5(this));
        }
    }

    public final void LJI() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported && this.LJJZZI.getVisibility() == 0) {
            this.LJJZZI.setVisibility(8);
        }
    }

    @Override // p003X.AbstractC136179cMw
    public final void LJIILJJIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported && this.LJLIIIL) {
            LJFF();
        }
    }

    @Override // p003X.AbstractC136179cMw
    public final void LJIILL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported) {
            return;
        }
        LJFF();
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            return;
        }
        super.finish();
        C136058cKz.LIZ(this);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public /* synthetic */ C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2189a();
    }

    private boolean LJIJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJIIL.LIZIZ.mo25203getText().length() == 0) {
            return false;
        }
        return true;
    }

    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && !isFinishing()) {
            C136757cWG.f18084LJ.LIZ();
            RelativeLayout relativeLayout = this.LJJZ;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            C135726cFd.LIZ("绑卡新样式");
            CJPayPageLoadTrace.LIZ().LIZIZ(CJPayPageLoadTrace.Page.NEW_CARD_PAY, CJPayPageLoadTrace.Section.END, "绑卡新样式");
        }
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        this.LJIIIZ.post(new RunnableC136110cLp(this));
        ViewGroup.LayoutParams layoutParams = this.LJJIIZ.getLayoutParams();
        layoutParams.height = this.LJJIIZI;
        this.LJJIIZ.setLayoutParams(layoutParams);
        this.LJJLJ.setVisibility(8);
        return CJPayInputKeyboardHelper.hideCustomKeyboard(this, this.LJIILIIL);
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400L);
        this.LJJIFFI.LIZIZ.mo25203getText().clear();
        this.LJJIII.setVisibility(8);
        this.LJJIIJ.setVisibility(8);
        this.LJJIJIIJIL.setVisibility(8);
        this.LJJIJIIJIL.startAnimation(alphaAnimation);
    }

    @Override // p003X.AbstractC136179cMw
    public final void LJIILLIIL() {
        C135986cJp c135986cJp;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 64).isSupported) {
            return;
        }
        this.LJJI.LJIIL();
        if (this.LJJIJIL && this.LJJIJIIJIL.getVisibility() == 0 && (c135986cJp = this.LJIIL) != null && c135986cJp.LIZIZ.mo25203getText().length() == 0) {
            LJIIJ();
        }
        LIZLLL();
    }

    public final C2185a LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 65);
        if (proxy.isSupported) {
            return (C2185a) proxy.result;
        }
        if (this.mvpLogger == 0) {
            return new C2185a(this);
        }
        return this.mvpLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC136021cKO
    public Class<? extends BaseEvent>[] observerableEvents() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Class[]) proxy.result;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(super.observerableEvents()));
        arrayList.add(C135611cDm.class);
        arrayList.add(C135754cG5.class);
        Class<? extends BaseEvent>[] clsArr = new Class[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            clsArr[i] = arrayList.get(i);
        }
        return clsArr;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported && !this.LJJJZ && !LIZLLL() && CJPayBasicUtils.isClickValid()) {
            LIZJ();
        }
    }

    private String LJIJJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 48);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayCardAddBean cJPayCardAddBean = this.LJIIIIZZ;
        if (cJPayCardAddBean != null && !TextUtils.isEmpty(cJPayCardAddBean.end_page_url)) {
            CJPayLynxBindCardEndPageSchemeInfo cJPayLynxBindCardEndPageSchemeInfo = new CJPayLynxBindCardEndPageSchemeInfo();
            cJPayLynxBindCardEndPageSchemeInfo.url = this.LJIIIIZZ.end_page_url;
            CJPayHostInfo LJIIIIZZ = C135876cI3.f17973LJ.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                if (LJIIIIZZ.merchantId != null) {
                    cJPayLynxBindCardEndPageSchemeInfo.merchant_id = LJIIIIZZ.merchantId;
                }
                if (LJIIIIZZ.appId != null) {
                    cJPayLynxBindCardEndPageSchemeInfo.app_id = LJIIIIZZ.appId;
                }
            }
            cJPayLynxBindCardEndPageSchemeInfo.bankName = this.LJIJI.bank_info.bank_name;
            cJPayLynxBindCardEndPageSchemeInfo.bankType = this.LJIJI.bank_info.card_type;
            cJPayLynxBindCardEndPageSchemeInfo.memberBizOrderNo = this.LJIIIIZZ.url_params.sign_order_no;
            cJPayLynxBindCardEndPageSchemeInfo.isAuth = LJIJ();
            cJPayLynxBindCardEndPageSchemeInfo.isSetPwd = !this.LJIIIIZZ.goSetPwd;
            return cJPayLynxBindCardEndPageSchemeInfo.buildScheme();
        }
        return "";
    }

    public final void LIZJ() {
        CJPayKeepDialogBean cJPayKeepDialogBean;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        if (!this.LJLI) {
            boolean LJIJI = LJIJI();
            ICJPayNormalBindCardService.SourceType sourceType = this.LJLIIL;
            CJPaySupportBankBean cJPaySupportBankBean = this.LJIJJ;
            if (cJPaySupportBankBean != null) {
                cJPayKeepDialogBean = cJPaySupportBankBean.retention_msg;
            } else {
                cJPayKeepDialogBean = new CJPayKeepDialogBean();
            }
            this.LJLI = C135347c9W.LIZ(LJIJI, sourceType, this, cJPayKeepDialogBean);
            return;
        }
        LIZIZ();
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported || this.LJIIL == null) {
            return;
        }
        CJPaySupportBankBean cJPaySupportBankBean = this.LJIJJ;
        if (cJPaySupportBankBean != null && CJPayQuickBindCardUtils.m16059LJ(cJPaySupportBankBean.exts.use_order_info_test)) {
            LJIIIZ();
            LJIIIIZZ();
        } else if (!TextUtils.isEmpty(this.LJJJJL) && !TextUtils.isEmpty(this.LJJJJLI)) {
            this.LJIIL.LIZIZ(this.LJJJJLI, "", this.LJJJJL, this.LJJJJZ);
        } else if (!TextUtils.isEmpty(this.LJJJJL)) {
            this.LJIIL.LIZIZ("", "", this.LJJJJL, this.LJJJJZ);
        }
    }

    public final void LJIIIIZZ() {
        CJPaySupportBankBean cJPaySupportBankBean;
        C135986cJp c135986cJp;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported && (cJPaySupportBankBean = this.LJIJJ) != null) {
            if (("2".equals(cJPaySupportBankBean.exts.one_key_bank_order_test) || PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START.equals(this.LJIJJ.exts.one_key_bank_order_test)) && this.LJIJJ.recommend_banks.size() > 0 && (c135986cJp = this.LJIIL) != null) {
                c135986cJp.LIZ(this.LJIJJ.recommend_banks);
            }
        }
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported || this.LJIIL == null) {
            return;
        }
        if (TextUtils.isEmpty(this.LJJJJLI)) {
            this.LJIIL.LIZIZ("", "", this.LJJJJL, "");
            return;
        }
        CJPayBankInfoBean cJPayBankInfoBean = this.LJJJIL;
        if (cJPayBankInfoBean != null) {
            if (cJPayBankInfoBean.is_support_one_key) {
                this.LJIIL.LJIIJ();
            } else {
                this.LJIIL.LIZIZ(this.LJJJJLI, this.LJJJIL.icon_url, this.LJJJJL, this.LJJJJZ);
            }
        }
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        if (this.LJJIII.getVisibility() == 0) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJJLIIIJLLLLLLLZ.getLayoutParams();
            int i = layoutParams.leftMargin;
            getContext();
            layoutParams.setMargins(i, CJPayBasicUtils.dipToPX(this, 62.0f), layoutParams.rightMargin, layoutParams.bottomMargin);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.LJJLIIIJLLLLLLLZ.getLayoutParams();
            int i2 = layoutParams2.leftMargin;
            getContext();
            layoutParams2.setMargins(i2, CJPayBasicUtils.dipToPX(this, 28.0f), layoutParams2.rightMargin, layoutParams2.bottomMargin);
        }
        this.LJJIJIIJIL.setVisibility(0);
        this.LJJIJIIJIL.startAnimation(alphaAnimation);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LJJIJIIJI.setOnClickListener(new View$OnClickListenerC136153cMW(this));
        this.LJIIIZ.setOnClickListener(this);
        this.LJJL.setOnClickListener(new C136082cLN(this));
        this.LJIILIIL.setOnDoneListener(new C136192cN9(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            this.LJJLL.setOnClickListener(new View$OnClickListenerC136184cN1(this));
            this.LJJIL.setOnClickListener(new C135464cBP(this));
        }
        this.LJJLIIJ.setOnClickListener(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        LJIIZILJ().LIZLLL = this.LIZLLL;
        LJIIZILJ().f25461LJ = this;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            getContext();
            if (CJPayBasicUtils.isNetworkAvailable(this)) {
                C136757cWG c136757cWG = C136757cWG.f18084LJ;
                getContext();
                c136757cWG.LIZ(this, "");
                if (this.mBasePresenter != 0 && !this.LJJLIIIJILLIZJL) {
                    this.LJLIL = System.currentTimeMillis();
                    ((C2191b) this.mBasePresenter).LIZ();
                    this.LJJLIIIJILLIZJL = true;
                    return;
                }
                return;
            }
            this.LJJLIIIJILLIZJL = false;
            LIZ();
        }
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 71).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 70).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 69).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 72).isSupported) {
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
    public final void m16061LJ() {
        ArrayList<CJPayBankInfoBean> arrayList;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        if (this.LJIJJ.card_bin_vouchers.size() != 0) {
            arrayList2.add(this.LJIJJ.card_bin_vouchers.get(0));
        }
        a$a LIZ2 = new a$a(this).LIZ(arrayList2);
        LIZ2.LIZ(new View$OnClickListenerC135367c9q(this));
        this.LJIILJJIL = LIZ2.LIZ();
        DialogC135318c93 dialogC135318c93 = this.LJIILJJIL;
        if (dialogC135318c93 != null) {
            C116971W2r.LIZJ(dialogC135318c93);
            C2185a LJIIZILJ = LJIIZILJ();
            if (!PatchProxy.proxy(new Object[0], LJIIZILJ, C2185a.LIZ, false, 18).isSupported) {
                JSONObject LIZLLL = LJIIZILJ.LIZLLL();
                try {
                    C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
                    CJPaySupportBankBean cJPaySupportBankBean = LJIIZILJ.LIZIZ;
                    if (cJPaySupportBankBean == null || (arrayList = cJPaySupportBankBean.one_key_banks) == null) {
                        arrayList = new ArrayList<>();
                    }
                    LIZLLL.put("campaign_info", c136000cK3.LIZ(arrayList));
                    LIZLLL.put("more_type", "普通绑卡");
                    C135734cFl.LIZ("wallet_addbcard_first_page_moreactivity_click", LIZLLL);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (r2.put("haspass", r0) == null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayCardBinActivity.LIZIZ():void");
    }

    public final void LJIIL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 47).isSupported && this.LJIIIIZZ != null && this.LJIJI != null) {
            LIZIZ(true);
            CJPayRealNameBean cJPayRealNameBean = new CJPayRealNameBean();
            cJPayRealNameBean.commonBean.signOrderNo = this.LJIIIIZZ.url_params.sign_order_no;
            cJPayRealNameBean.commonBean.smchId = this.LJIIIIZZ.url_params.smch_id;
            cJPayRealNameBean.commonBean.processInfo = this.LJIIIIZZ.processInfo;
            cJPayRealNameBean.payUid = this.LJIIIIZZ.url_params.pay_uid;
            cJPayRealNameBean.goSetPwd = this.LJIIIIZZ.goSetPwd;
            cJPayRealNameBean.bank_name = this.LJIJI.bank_info.bank_name;
            cJPayRealNameBean.card_type = this.LJIJI.bank_info.card_type;
            cJPayRealNameBean.card_no = this.LJIJI.bank_info.bankCardNum;
            cJPayRealNameBean.is_need_card_info = this.LJIIIIZZ.isNeedCardInfo;
            cJPayRealNameBean.isAuth = LJIJ();
            cJPayRealNameBean.bank_mobile_no = this.LJJIFFI.LIZ().replaceAll(" ", "");
            cJPayRealNameBean.activity_info = C136000cK3.LIZIZ.LIZ(this.LJIJI.bank_info.getVoucherInfoMap(), this.LJIJI.bank_info.card_type).toString();
            cJPayRealNameBean.end_page_url = LJIJJ();
            if (!TextUtils.isEmpty(this.LJJII.LIZJ())) {
                cJPayRealNameBean.encryptedMobileNumber = this.LJJII.LIZJ();
            }
            if (this.LJIIIIZZ.authorizeClicked) {
                cJPayRealNameBean.id_no = this.LJIIIIZZ.url_params.id_code_mask;
                cJPayRealNameBean.user_name = this.LJIIIIZZ.url_params.id_name_mask;
            }
            if (this.mBasePresenter != 0) {
                if (cJPayRealNameBean.LIZ(this.LJJLIIIJL)) {
                    if (C136235cNq.LIZ().LIZ("bind_card_count_down_tag", null)) {
                        C135996cJz.LIZ().LIZ("/basebind/CJPaySmsCodeCheckActivity").LIZ(AnimationType.FadeInAndOut).LIZ("param_bind_card_real_name", cJPayRealNameBean).LIZ("param_bind_card_sms_token", (Serializable) this.LJJLIIIJLJLI.sms_token).LIZ("param_is_independent_bind_card", this.LIZIZ).LIZ("param_title_content", this.LJJLIIIJLJLI.verify_text_msg).LIZ(this);
                        return;
                    } else {
                        ((C2191b) this.mBasePresenter).LIZ(cJPayRealNameBean);
                        return;
                    }
                }
                C136235cNq.LIZ().LIZ("bind_card_count_down_tag");
                ((C2191b) this.mBasePresenter).LIZ(cJPayRealNameBean);
            }
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            findViewById(2131165243);
            this.LJJIJ = (TextView) findViewById(2131170118);
            findViewById(2131169724);
            this.LJJIJIIJI = (ImageView) findViewById(2131165337);
            this.LJJIJIIJI.setContentDescription(getResources().getString(2131561548));
            this.LJJIJIIJI.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.activity.CJPayCardBinActivity.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6789);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CJPayCardBinActivity.this.onBackPressed();
                }
            });
        }
        this.LJIIIZ = (RelativeLayout) findViewById(2131165242);
        this.LJJL = (CJPayCustomButton) findViewById(2131165244);
        this.LJIIJ = (ProgressBar) findViewById(2131165240);
        this.LJJLI = (RelativeLayout) findViewById(2131181519);
        this.LJJIII = (RelativeLayout) findViewById(2131188181);
        this.LJJIIJ = (LinearLayout) findViewById(2131181492);
        this.LJIILIIL = (CJPayKeyboardView) findViewById(2131192764);
        this.LJIIJJI = (ImageView) findViewById(2131179294);
        this.LJJIIZ = (NestedScrollView) findViewById(2131169719);
        this.LJJLIIIJLLLLLLLZ = (RelativeLayout) findViewById(2131165332);
        LIZ(false);
        this.LJJLIIJ = (TextView) findViewById(2131195459);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            this.LJJJJI = (TextView) findViewById(2131194410);
            this.LJJJJIZL = (LinearLayout) findViewById(2131170116);
            this.LJJJJJ = (ImageView) findViewById(2131170115);
            this.LJJJJJL = (TextView) findViewById(2131170117);
            this.LJJIJIIJIL = (RelativeLayout) findViewById(2131169734);
            this.LJJLJLI = (RelativeLayout) findViewById(2131165243);
            this.LJJLJLI.setBackgroundColor(CastProtectorUtils.parseColor("#f8f8f8"));
            this.LJJLJ = findViewById(2131169732);
            this.LJJLIL = (TextView) findViewById(2131169733);
            this.LJJIJLIJ = (TextView) findViewById(2131169738);
            this.LJJJ = (LinearLayout) findViewById(2131183329);
            this.LJJIJL = (TextView) findViewById(2131169736);
            this.LJJIZ = (ImageView) findViewById(2131169737);
            this.LJJLL = (RelativeLayout) findViewById(2131188799);
            this.LJJIL = (TextView) findViewById(2131195093);
            this.LJJZ = (RelativeLayout) findViewById(2131169718);
        }
        this.LJJZZI = (RelativeLayout) findViewById(2131169035);
        this.LJJZZIII = (TextView) findViewById(2131169036);
        this.LJL = (TextView) findViewById(2131169034);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public void initViews() {
        CJPayCardAddBean cJPayCardAddBean;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            String string = getString(2131561415);
            CJPayCardAddBean cJPayCardAddBean2 = this.LJIIIIZZ;
            if (cJPayCardAddBean2 != null && cJPayCardAddBean2.url_params != null && this.LJIIIIZZ.url_params.card_copywriting_info != null && !TextUtils.isEmpty(this.LJIIIIZZ.url_params.card_copywriting_info.title)) {
                string = this.LJIIIIZZ.url_params.card_copywriting_info.title;
            }
            this.LJJLIL.setText(string);
            this.LJJIIZ.setOnScrollChangeListener(new C136069cLA(this, string));
            this.LJJZ.setVisibility(4);
            this.LJJLIIJ.setVisibility(8);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            this.LJJII = new C136039cKg(this, (FrameLayout) findViewById(2131170016), 2131690710, this.LJIIIIZZ);
            this.LJJII.LJFF = new C136044cKl(this);
            this.LJJII.f17990LJ = new C136026cKT(this);
            this.LJJIIJ.setVisibility(8);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            this.LJJLIIIIJ = new CJPayInputKeyboardHelper(true, this.LJIILIIL);
            this.LJIIL = new C135986cJp(this.LJJLI, this.LJJLIIIIJ);
            this.LJIIL.LIZ(new C136180cMx(((C2191b) this.mBasePresenter).LIZIZ(), "银行卡号", "", ""));
            this.LJIIL.LJIIJ();
            this.LJIIL.LJIIJ = CJPayIdUtils.generateCardNoErrorDetector();
            CJPayPasteAwareEditText cJPayPasteAwareEditText = this.LJIIL.LIZIZ;
            cJPayPasteAwareEditText.setInputType(3);
            cJPayPasteAwareEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(26)});
            cJPayPasteAwareEditText.setOnPasteListener(new C135846cHZ(this, cJPayPasteAwareEditText));
            cJPayPasteAwareEditText.addTextChangedListener(new C135992cJv(this, Arrays.asList(4, 8, 12, 16, 20)));
            this.LJJIIZ.post(new RunnableC136173cMq(this));
            ((AbstractC135990cJt) this.LJIIL).LJIILIIL = new C136051cKs(this);
            this.LJIIL.LJIIIZ = new C136169cMm(this);
            ((AbstractC135990cJt) this.LJIIL).LJIILJJIL = new C136104cLj(this);
            C135986cJp c135986cJp = this.LJIIL;
            View$OnClickListenerC136185cN2 view$OnClickListenerC136185cN2 = new View$OnClickListenerC136185cN2(this);
            if (!PatchProxy.proxy(new Object[]{view$OnClickListenerC136185cN2}, c135986cJp, AbstractC135990cJt.LJIIL, false, 5).isSupported) {
                c135986cJp.LJIJJLI.setOnClickListener(new View$OnClickListenerC136190cN7(c135986cJp, view$OnClickListenerC136185cN2));
            }
        }
        String str = null;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            CJPayInputKeyboardHelper cJPayInputKeyboardHelper = new CJPayInputKeyboardHelper(true, this.LJIILIIL);
            CJPayCardAddBean cJPayCardAddBean3 = this.LJIIIIZZ;
            if (cJPayCardAddBean3 != null) {
                str = cJPayCardAddBean3.url_params.mobile_mask;
            }
            this.LJJIFFI = new C136004cK7(this.LJJIII, cJPayInputKeyboardHelper, str);
            this.LJJIFFI.LIZ(new C136183cN0(getString(2131561446), getString(2131561448)));
            this.LJJIFFI.LIZIZ();
            this.LJJIFFI.LJII();
            this.LJJIFFI.LIZ(2130840423, 2130840424);
            this.LJJIFFI.LIZ(2131624851);
            this.LJIILLIIL = this.LJJIFFI.LIZ().replaceAll(" ", "");
            this.LJJIFFI.LJI = new View$OnFocusChangeListenerC136007cKA(this);
            this.LJJIFFI.LJIIIIZZ = new C135994cJx(this);
            cJPayInputKeyboardHelper.setOnDeleteListener(new C136057cKy(this));
        }
        C136221cNc.LIZIZ.LIZ(this, new RunnableC136163cMg(this));
        if (!this.f25462LJ && (cJPayCardAddBean = this.LJIIIIZZ) != null && cJPayCardAddBean.url_params != null && !TextUtils.equals(this.LJIIIIZZ.url_params.jump_one_key_sign, "1") && !TextUtils.equals(this.LJIIIIZZ.url_params.ab_version, "card_sign_business_auth_v20220330")) {
            C2191b c2191b = (C2191b) this.mBasePresenter;
            C135986cJp c135986cJp2 = this.LJIIL;
            if (!PatchProxy.proxy(new Object[]{c135986cJp2}, c2191b, C2191b.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(c135986cJp2);
                CJPayCardAddBean LIZ2 = C135876cI3.LIZ();
                if (LIZ2 != null) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c2191b, C2191b.LIZ, false, 7);
                    if (!proxy.isSupported ? !(C135734cFl.m21754LJ() == ICJPayNormalBindCardService.SourceType.CardList.getMType() || C135734cFl.m21754LJ() == ICJPayNormalBindCardService.SourceType.MyBindCardTwo.getMType()) : ((Boolean) proxy.result).booleanValue()) {
                        if (LIZ2.busi_authorize_info != null && LIZ2.busi_authorize_info.is_need_authorize) {
                            LIZ2.busi_authorize_info.needIdentify = 1;
                            LIZ2.busi_authorize_info.hasPass = 0;
                            LIZ2.busi_authorize_info.showOneStep = 1;
                            LIZ2.busi_authorize_info.isOneStep = 0;
                            C9H6.LIZ(c2191b.getContext(), new CardBinPresenter$showRealNameAuth$$inlined$apply$lambda$1(LIZ2, c2191b, c135986cJp2), 300L);
                        }
                    }
                }
            }
        }
        C2185a LJIIZILJ = LJIIZILJ();
        if (!PatchProxy.proxy(new Object[0], LJIIZILJ, C2185a.LIZ, false, 19).isSupported) {
            C135734cFl.LIZ("wallet_addbcard_first_page_imp_launch", LJIIZILJ.LIZLLL());
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZ(DialogC137460chc dialogC137460chc) {
        this.LJIJJLI = dialogC137460chc;
    }

    private void LIZJ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 53).isSupported) {
            return;
        }
        this.LJJIJIIJI.setClickable(z);
        this.LJJLIIJ.setClickable(z);
        this.LJJJZ = !z ? 1 : 0;
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZIZ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 25).isSupported) {
            return;
        }
        LIZ();
        this.LJJLIIIJILLIZJL = false;
        LJIIZILJ().LIZ(System.currentTimeMillis() - this.LJLIL);
        LJIIZILJ().LIZ(this.LJIIL, this.LJJJ);
    }

    @Override // p003X.AbstractActivityC135714cFR, p003X.AbstractActivityC136021cKO
    public void onEvent(BaseEvent baseEvent) {
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onEvent(baseEvent);
        if ((baseEvent instanceof C135611cDm) && ((C135611cDm) baseEvent).LIZ == C135611cDm.LIZJ) {
            LJFF();
        }
        if (baseEvent instanceof C135754cG5) {
            C135754cG5 c135754cG5 = (C135754cG5) baseEvent;
            if (!PatchProxy.proxy(new Object[]{c135754cG5}, this, LIZ, false, 33).isSupported && c135754cG5.source == 1008 && this.LJJLIIIJL != null && this.LJJLIIIJLJLI != null) {
                ((C2191b) this.mBasePresenter).LIZ(true);
                C135912cId.LIZ(this, this.LJJLIIIJL.commonBean.signOrderNo, this.LJJLIIIJLJLI.face_verify_info.verify_channel, new C2341h(c135754cG5.ticket, c135754cG5.sdkData, c135754cG5.faceAppId, c135754cG5.scene, c135754cG5.faceScene), new C136107cLm(this));
            }
        }
    }

    private void LIZ(CJPaySmsTokenBean cJPaySmsTokenBean) {
        if (PatchProxy.proxy(new Object[]{cJPaySmsTokenBean}, this, LIZ, false, 58).isSupported) {
            return;
        }
        if ("4".equals(cJPaySmsTokenBean.button_info.button_type)) {
            if (!"MP020306".equals(cJPaySmsTokenBean.code) && !"MP020307".equals(cJPaySmsTokenBean.code)) {
                if ("MP020308".equals(cJPaySmsTokenBean.code)) {
                    this.LJJIFFI.LIZIZ.post(new RunnableC136037cKe(this, cJPaySmsTokenBean));
                    return;
                } else {
                    LIZIZ(cJPaySmsTokenBean);
                    return;
                }
            } else if (!"0".equals(C136035cKc.LJIIIIZZ().LIZ(true))) {
                getContext();
                CJPayBasicUtils.displayToast(this, cJPaySmsTokenBean.button_info.page_desc);
                return;
            } else {
                LIZ(cJPaySmsTokenBean.code, cJPaySmsTokenBean.button_info.button_status, cJPaySmsTokenBean.button_info.button_type, cJPaySmsTokenBean.button_info.page_desc, cJPaySmsTokenBean.button_info.toStandardCJPayButtonInfo(), cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
                return;
            }
        }
        LIZIZ(cJPaySmsTokenBean);
    }

    private void LIZIZ(CJPaySmsTokenBean cJPaySmsTokenBean) {
        String string;
        String str;
        String string2;
        String string3;
        String string4;
        if (PatchProxy.proxy(new Object[]{cJPaySmsTokenBean}, this, LIZ, false, 59).isSupported) {
            return;
        }
        CJPayButtonInfo cJPayButtonInfo = new CJPayButtonInfo();
        CJPayButtonInfo cJPayButtonInfo2 = cJPaySmsTokenBean.button_info;
        if (!TextUtils.isEmpty(cJPayButtonInfo2.page_desc)) {
            string = cJPayButtonInfo2.page_desc;
        } else if (!TextUtils.isEmpty(cJPaySmsTokenBean.msg)) {
            string = cJPaySmsTokenBean.msg;
        } else {
            string = getString(2131558456);
        }
        cJPayButtonInfo.page_desc = string;
        if (!TextUtils.isEmpty(cJPayButtonInfo2.button_type)) {
            str = cJPayButtonInfo2.button_type;
        } else {
            str = PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START;
        }
        cJPayButtonInfo.button_type = str;
        cJPayButtonInfo.error_code = cJPaySmsTokenBean.code;
        if (!TextUtils.isEmpty(cJPayButtonInfo2.button_desc)) {
            string2 = cJPayButtonInfo2.button_desc;
        } else {
            string2 = getString(2131561708);
        }
        cJPayButtonInfo.button_desc = string2;
        if (!TextUtils.isEmpty(cJPayButtonInfo2.left_button_desc)) {
            string3 = cJPayButtonInfo2.left_button_desc;
        } else {
            string3 = getString(2131558453);
        }
        cJPayButtonInfo.left_button_desc = string3;
        cJPayButtonInfo.left_button_action = cJPayButtonInfo2.left_button_action;
        if (!TextUtils.isEmpty(cJPayButtonInfo2.right_button_desc)) {
            string4 = cJPayButtonInfo2.right_button_desc;
        } else {
            string4 = getString(2131561433);
        }
        cJPayButtonInfo.right_button_desc = string4;
        cJPayButtonInfo.right_button_action = cJPayButtonInfo2.right_button_action;
        LJIIZILJ().LIZIZ(cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
        LIZ(this.LJJIFFI, cJPayButtonInfo, this.LJIJI.bank_info.getCardTypeStr(this), this.LJIJI.bank_info.bank_name, null);
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZJ(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 36).isSupported) {
            return;
        }
        LIZIZ(false);
        if (this.LJLILLLLZI) {
            getContext();
            getContext();
            CJPayBasicUtils.displayToast(this, getString(2131558456));
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 3).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 5).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 4).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
        enableSwipeBack();
        this.mSwipeToFinishView.setEnableSwipe(false);
        setStatusBarColor("#f8f8f8");
        if (!PatchProxy.proxy(new Object[0], this.mBasePresenter, C2191b.LIZ, false, 8).isSupported) {
            C136035cKc.LIZLLL().LIZ(true);
            C136035cKc.LIZJ().LIZ(true);
            C136035cKc.LIZIZ.LIZ(true);
            C136035cKc.LJIIIIZZ().LIZ(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        HashMap<String, CJPayVoucherInfo> hashMap;
        String str;
        CJPayBankInfoBean cJPayBankInfoBean;
        CJPayBankInfoBean cJPayBankInfoBean2;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 30).isSupported) {
            return;
        }
        int id = view.getId();
        if (CJPayBasicUtils.isClickValid()) {
            if (id == 2131165244) {
                if (this.LJJLIIIJ) {
                    if (!LJIJ()) {
                        LIZLLL();
                    }
                    getContext();
                    if (CJPayBasicUtils.isNetworkAvailable(this)) {
                        LIZIZ(true);
                        LIZ(this.LJIILL, false, true, true);
                        CJPayCardInfoBean cJPayCardInfoBean = this.LJIJI;
                        if (cJPayCardInfoBean != null && cJPayCardInfoBean.bank_info != null) {
                            C2185a LJIIZILJ = LJIIZILJ();
                            String str2 = this.LJIJI.bank_info.bank_name;
                            CJPayBankInfoBean cJPayBankInfoBean3 = this.LJIJI.bank_info;
                            getContext();
                            String cardTypeStr = cJPayBankInfoBean3.getCardTypeStr(this);
                            if (!PatchProxy.proxy(new Object[]{str2, cardTypeStr}, LJIIZILJ, C2185a.LIZ, false, 14).isSupported) {
                                C106862S5w.LIZ(str2, cardTypeStr);
                                JSONObject LIZLLL = LJIIZILJ.LIZLLL();
                                try {
                                    LIZLLL.put("bank_name", str2);
                                    LIZLLL.put("bank_type", cardTypeStr);
                                    C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
                                    CJPayCardInfoBean cJPayCardInfoBean2 = LJIIZILJ.LIZJ;
                                    if (cJPayCardInfoBean2 == null || (cJPayBankInfoBean2 = cJPayCardInfoBean2.bank_info) == null || (hashMap = cJPayBankInfoBean2.getVoucherInfoMap()) == null) {
                                        hashMap = new HashMap<>();
                                    }
                                    CJPayCardInfoBean cJPayCardInfoBean3 = LJIIZILJ.LIZJ;
                                    if (cJPayCardInfoBean3 == null || (cJPayBankInfoBean = cJPayCardInfoBean3.bank_info) == null || (str = cJPayBankInfoBean.card_type) == null) {
                                        str = "";
                                    }
                                    LIZLLL.put("activity_info", c136000cK3.LIZ(hashMap, str));
                                    C135734cFl.LIZ("wallet_addbcard_first_page_next_click", LIZLLL);
                                } catch (JSONException unused) {
                                }
                            }
                            if (LJIJ()) {
                                LJIIZILJ().LIZIZ();
                            }
                        }
                    } else {
                        getContext();
                        CJPayBasicUtils.displayToast(this, getString(2131558456));
                    }
                }
                if (this.LJJ) {
                    C2185a LJIIZILJ2 = LJIIZILJ();
                    String str3 = this.LJIIZILJ;
                    if (!PatchProxy.proxy(new Object[]{str3}, LJIIZILJ2, C2185a.LIZ, false, 12).isSupported) {
                        C106862S5w.LIZ(str3);
                        JSONObject LIZLLL2 = LJIIZILJ2.LIZLLL();
                        try {
                            LIZLLL2.put("result", str3);
                            C135734cFl.LIZ("wallet_addbcard_orc_accuracy_result", LIZLLL2);
                        } catch (JSONException unused2) {
                        }
                    }
                }
            } else if (id == 2131165242) {
                LIZLLL();
                LIZ(this.LJIILL, true, false, false);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 40).isSupported) {
            return;
        }
        try {
            if (z) {
                this.LJIIJ.setVisibility(0);
                this.LJJL.setText("");
                this.LJJL.setOnClickListener(null);
                LIZJ(false);
                return;
            }
            this.LJIIJ.setVisibility(8);
            if (LJIJ()) {
                this.LJJL.setText(getString(2131561464));
            } else {
                this.LJJL.setText(getString(2131561786));
            }
            this.LJJL.setOnClickListener(new C136083cLO(this));
            LIZJ(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZ(JSONObject jSONObject, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{jSONObject, cJPayRealNameBean}, this, LIZ, false, 49).isSupported) {
            return;
        }
        LIZJ(jSONObject, cJPayRealNameBean);
    }

    @Override // com.android.ttcjpaysdk.bdpay.bindcard.normal.view.e$a
    public final void LIZIZ(JSONObject jSONObject, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{jSONObject, cJPayRealNameBean}, this, LIZ, false, 50).isSupported) {
            return;
        }
        LIZJ(jSONObject, cJPayRealNameBean);
    }

    private void LIZIZ(String str, String str2) {
        String str3;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 56).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            getContext();
            str3 = getString(2131562003, new Object[]{str2});
        } else {
            str3 = "";
        }
        ((C2191b) this.mBasePresenter).LIZ(str, str3, "", "", getString(2131561708), null, null, new View$OnClickListenerC136054cKv(this));
        LJIIZILJ().LIZIZ(str2, str);
    }

    private void LIZJ(JSONObject jSONObject, CJPayRealNameBean cJPayRealNameBean) {
        String string;
        if (PatchProxy.proxy(new Object[]{jSONObject, cJPayRealNameBean}, this, LIZ, false, 51).isSupported) {
            return;
        }
        this.LJIIIZ.postDelayed(new RunnableC136175cMs(this), 400L);
        if (jSONObject.has("error_code")) {
            LJIIZILJ().LIZ("0");
            CJPayCardAddBean cJPayCardAddBean = this.LJIIIIZZ;
            if (cJPayCardAddBean != null && cJPayCardAddBean.busi_authorize_info.is_need_authorize) {
                try {
                    LJIIZILJ().LIZ(0, jSONObject.optString("error_code"), jSONObject.optString("error_msg"));
                } catch (Exception unused) {
                }
            }
            CJPayBasicUtils.displayToast(this, getResources().getString(2131558456));
            return;
        }
        CJPaySmsTokenBean cJPaySmsTokenBean = (CJPaySmsTokenBean) CJPayJsonParser.fromJson(C136182cMz.LIZ(jSONObject), CJPaySmsTokenBean.class);
        if (cJPaySmsTokenBean == null) {
            return;
        }
        if (cJPaySmsTokenBean.isResponseOK()) {
            LJIIZILJ().LIZ("1");
            CJPayCardAddBean cJPayCardAddBean2 = this.LJIIIIZZ;
            if (cJPayCardAddBean2 != null && cJPayCardAddBean2.busi_authorize_info.is_need_authorize) {
                LJIIZILJ().LIZ(1, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
            }
            this.LJJLIIIJL = cJPayRealNameBean;
            this.LJJLIIIJLJLI = cJPaySmsTokenBean;
            if (cJPaySmsTokenBean.face_verify_info != null && cJPaySmsTokenBean.face_verify_info.need_live_detection) {
                C135912cId.LIZ(this, this.LJJLIIIJL.commonBean.signOrderNo, this.LJJLIIIJLJLI.face_verify_info.verify_channel, 1008, "card_sign", this.LJJLIIIJLJLI.face_verify_info.face_scene, new C136204cNL(this));
            } else {
                C135996cJz.LIZ().LIZ("/basebind/CJPaySmsCodeCheckActivity").LIZ(AnimationType.FadeInAndOut).LIZ("param_bind_card_real_name", cJPayRealNameBean).LIZ("param_bind_card_sms_token", (Serializable) cJPaySmsTokenBean.sms_token).LIZ("param_is_independent_bind_card", this.LIZIZ).LIZ("param_title_content", cJPaySmsTokenBean.verify_text_msg).LIZ(this);
            }
        } else if (cJPaySmsTokenBean.button_info != null && "1".equals(cJPaySmsTokenBean.button_info.button_status)) {
            if (cJPaySmsTokenBean.button_info.isGoCustomerServiceDialog()) {
                C135737cFo.LIZ().LIZ(cJPaySmsTokenBean.button_info.toStandardCJPayButtonInfo()).LIZ(cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg).LIZ(C135876cI3.f17973LJ.LJIIIIZZ()).LIZ(this).LIZ().LIZ(new C135743cFu(this, cJPaySmsTokenBean)).LIZIZ();
                C135737cFo.LIZ("3.2", cJPaySmsTokenBean.code, cJPaySmsTokenBean.button_info.page_desc, C135876cI3.LJI(), C135876cI3.LJII());
            } else if ("MP010033".equals(cJPaySmsTokenBean.code)) {
                ((C2191b) this.mBasePresenter).LIZ(cJPaySmsTokenBean.button_info.page_desc, "", cJPaySmsTokenBean.button_info.left_button_desc, cJPaySmsTokenBean.button_info.right_button_desc, "", LJIJJLI(), LJIJJLI(), null);
                LJIIZILJ().LIZ();
                CJPayCardAddBean cJPayCardAddBean3 = this.LJIIIIZZ;
                if (cJPayCardAddBean3 != null && cJPayCardAddBean3.busi_authorize_info.is_need_authorize) {
                    LJIIZILJ().LIZ(0, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
                }
            } else {
                LJIIZILJ().LIZ("0");
                CJPayCardAddBean cJPayCardAddBean4 = this.LJIIIIZZ;
                if (cJPayCardAddBean4 != null && cJPayCardAddBean4.busi_authorize_info.is_need_authorize) {
                    LJIIZILJ().LIZ(0, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
                }
                if (!TextUtils.isEmpty(cJPaySmsTokenBean.msg)) {
                    LIZ(cJPaySmsTokenBean);
                }
            }
        } else {
            LJIIZILJ().LIZ("0");
            CJPayCardAddBean cJPayCardAddBean5 = this.LJIIIIZZ;
            if (cJPayCardAddBean5 != null && cJPayCardAddBean5.busi_authorize_info.is_need_authorize) {
                LJIIZILJ().LIZ(0, cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
            }
            if (!TextUtils.isEmpty(cJPaySmsTokenBean.msg)) {
                string = cJPaySmsTokenBean.msg;
            } else {
                string = getString(2131558456);
            }
            CJPayBasicUtils.displayToast(this, string);
            LJIIZILJ().LIZIZ(cJPaySmsTokenBean.code, cJPaySmsTokenBean.msg);
        }
    }

    public final void LIZ(String str, String str2) {
        ICJPayOCRService iCJPayOCRService;
        Map<String, String> hashMap;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 54).isSupported || (iCJPayOCRService = (ICJPayOCRService) CJPayServiceManager.getInstance().getIService(ICJPayOCRService.class)) == null) {
            return;
        }
        if (C135876cI3.f17973LJ.LJIIIIZZ() != null) {
            hashMap = C135876cI3.f17973LJ.LJIIIIZZ().LIZIZ();
        } else {
            hashMap = new HashMap<>();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("risk_str", new JSONObject(hashMap));
            getContext();
            iCJPayOCRService.startOCR(this, C135876cI3.LJI(), C135876cI3.LJII(), str, str2, jSONObject.toString(), C135876cI3.f17973LJ.LJIIIZ(), new C135997cK0(this));
        } catch (JSONException unused) {
        }
    }

    private void LIZ(C136004cK7 c136004cK7, CJPayButtonInfo cJPayButtonInfo, String str, String str2, View.OnClickListener onClickListener) {
        String str3;
        if (PatchProxy.proxy(new Object[]{c136004cK7, cJPayButtonInfo, str, str2, null}, this, LIZ, false, 60).isSupported) {
            return;
        }
        String str4 = cJPayButtonInfo.left_button_desc;
        String str5 = cJPayButtonInfo.right_button_desc;
        String str6 = cJPayButtonInfo.button_desc;
        if (TextUtils.isEmpty(cJPayButtonInfo.error_code)) {
            str3 = "";
        } else {
            str3 = getString(2131562003, new Object[]{cJPayButtonInfo.error_code});
        }
        if ("2".equals(cJPayButtonInfo.button_type)) {
            str6 = "";
        } else {
            str4 = "";
            str5 = str4;
        }
        ((C2191b) this.mBasePresenter).LIZ(cJPayButtonInfo.page_desc, str3, str4, str5, str6, new View$OnClickListenerC136100cLf(this, str, str2), new View$OnClickListenerC136052cKt(this, c136004cK7, cJPayButtonInfo, str, str2), new View$OnClickListenerC136090cLV(this, null, str, str2));
    }

    public final void LIZ(String str, String str2, String str3, String str4, String str5, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, Integer.valueOf(i)}, this, LIZ, false, 37).isSupported) {
            return;
        }
        if ("6".equals(str3)) {
            this.LJJZZI.setVisibility(0);
            this.LJJZZIII.setText(str4);
            this.LJL.setText(str5);
            this.LJL.setOnClickListener(new View$OnClickListenerC136071cLC(this, i, str, str4, str5));
        } else if ("5".equals(str3)) {
        } else {
            this.LJIIL.LIZIZ(str2);
        }
    }

    private void LIZ(String str, String str2, String str3, String str4, com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo cJPayButtonInfo, String str5, String str6) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, cJPayButtonInfo, str5, str6}, this, LIZ, false, 55).isSupported) {
            return;
        }
        if ("1".equals(str2)) {
            if ("4".equals(str3)) {
                LIZIZ(false);
                this.LJIIL.LIZIZ.post(new RunnableC136081cLM(this, str, str4, str5, str6));
                return;
            } else if ("5".equals(str3)) {
                LIZIZ(false);
                DialogC137460chc dialogC137460chc = this.LJJJLL;
                if (dialogC137460chc != null && dialogC137460chc.isShowing()) {
                    C116971W2r.LIZ(this.LJJJLL);
                }
                this.LJJJLL = C135916cIh.LIZIZ.LIZJ(this, cJPayButtonInfo, new C136041cKi(this, str, cJPayButtonInfo));
                C116971W2r.LIZJ(this.LJJJLL);
                return;
            } else if ("6".equals(str3)) {
                LIZIZ(false);
                this.LJJZZI.setVisibility(0);
                this.LJJZZIII.setText(cJPayButtonInfo.page_desc);
                this.LJL.setText(cJPayButtonInfo.button_desc);
                this.LJL.setOnClickListener(new View$OnClickListenerC136055cKw(this, cJPayButtonInfo, str));
                return;
            } else {
                LIZIZ(getString(2131561564), str5);
                return;
            }
        }
        LIZIZ(getString(2131561564), str5);
    }
}
