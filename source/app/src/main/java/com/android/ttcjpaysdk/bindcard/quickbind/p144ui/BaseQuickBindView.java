package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.eventbus.BaseEvent;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayIntegratedCounterService;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayVerifyLiveDetectBean;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.android.ttcjpaysdk.bindcard.base.constants.CJPayBindCardType;
import com.android.ttcjpaysdk.bindcard.base.p142ui.VerifyPwdFragment;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.a;
import com.android.ttcjpaysdk.bindcard.quickbind.b$a;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeyQueryResponseBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeySignBankUrlResponseBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeySignOrderResponseBean;
import com.android.ttcjpaysdk.thirdparty.data.C2341h;
import com.android.ttcjpaysdk.thirdparty.data.CJPayFaceVerifyInfo;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.umeng.message.proguard.C34037f;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractActivityC135987cJq;
import p003X.AbstractC135629cE4;
import p003X.AbstractC135914cIf;
import p003X.C106862S5w;
import p003X.C135388cAB;
import p003X.C135517cCG;
import p003X.C135565cD2;
import p003X.C135737cFo;
import p003X.C135754cG5;
import p003X.C135876cI3;
import p003X.C135903cIU;
import p003X.C135911cIc;
import p003X.C135916cIh;
import p003X.C135918cIj;
import p003X.C135919cIk;
import p003X.C135920cIl;
import p003X.C135921cIm;
import p003X.C135922cIn;
import p003X.C135925cIq;
import p003X.C135929cIu;
import p003X.C135930cIv;
import p003X.C135931cIw;
import p003X.C135934cIz;
import p003X.C135935cJ0;
import p003X.C135938cJ3;
import p003X.C135996cJz;
import p003X.C136000cK3;
import p003X.C136011cKE;
import p003X.C136235cNq;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.BaseQuickBindView */
/* loaded from: classes17.dex */
public abstract class BaseQuickBindView<P extends AbstractC135914cIf<? extends b$a>, L extends a> extends AbstractActivityC135987cJq<P, L> implements b$a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;
    public ICJPayFaceCheckService faceCheckService;
    public ICJPayH5Service h5Service;
    public Object mCallbackOberver;
    public ICJPayIntegratedCounterService mIntegratedCounterService;
    public boolean mIsCMBAppSign;
    public boolean mIsMiniAppSign;
    public ICJPayNormalBindCardService normalBindCardService;
    public CJPayOneKeySignOrderResponseBean quickBindOrderBean;
    public QuickBindCardAdapterBean quickBindData = new QuickBindCardAdapterBean();
    public String bindCardResultLynxScheme = "";

    static {
        Covode.recordClassIndex(7247);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 22);
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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com_android_ttcjpaysdk_bindcard_quickbind_ui_BaseQuickBindView__onStop$___twin___ */
    public void m16056x7ec16279() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        super.onStop();
    }

    public abstract String getSelectedBankCardType();

    public abstract void hideProgressLoading();

    public abstract void hideQueryLoading();

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25).isSupported) {
            return;
        }
        m16055x55106389(this);
    }

    public abstract void showProgressLoading();

    public abstract void showQueryLoading();

    public final CJPayOneKeySignOrderResponseBean getQuickBindOrderBean() {
        return this.quickBindOrderBean;
    }

    @Override // p003X.AbstractActivityC136021cKO
    public Class<? extends BaseEvent>[] observerableEvents() {
        return new Class[]{C135938cJ3.class, C135754cG5.class, C135517cCG.class, C135930cIv.class, C135934cIz.class, C135565cD2.class};
    }

    @Override // p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        super.onResume();
        if (this.mIsCMBAppSign) {
            this.mIsCMBAppSign = false;
            queryQuickBindResult();
        }
        if (this.mIsMiniAppSign) {
            this.mIsCMBAppSign = false;
            hideProgressLoading();
        }
    }

    private final void goFaceCheck() {
        ICJPayFaceCheckService iCJPayFaceCheckService;
        JSONObject jSONObject;
        ICJPayFaceCheckService iCJPayFaceCheckService2;
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported || (iCJPayFaceCheckService = this.faceCheckService) == null) {
            return;
        }
        String str = null;
        C135903cIU c135903cIU = this.mvpLogger;
        if (c135903cIU != null) {
            String str2 = this.quickBindData.cardType;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            jSONObject = c135903cIU.LIZ(str2);
        } else {
            jSONObject = null;
        }
        iCJPayFaceCheckService.setCounterCommonParams(jSONObject);
        CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean;
        if (cJPayOneKeySignOrderResponseBean != null && (iCJPayFaceCheckService2 = this.faceCheckService) != null) {
            String str3 = cJPayOneKeySignOrderResponseBean.member_biz_order_no;
            Integer valueOf = Integer.valueOf(hashCode());
            String str4 = cJPayOneKeySignOrderResponseBean.face_verify_info.verify_channel;
            JSONObject LIZIZ = CJPayHostInfo.Companion.LIZIZ(C135876cI3.f17973LJ.LJIIIIZZ());
            Boolean bool = Boolean.TRUE;
            CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean2 = this.quickBindOrderBean;
            if (cJPayOneKeySignOrderResponseBean2 != null && (cJPayFaceVerifyInfo = cJPayOneKeySignOrderResponseBean2.face_verify_info) != null) {
                str = cJPayFaceVerifyInfo.face_scene;
            }
            iCJPayFaceCheckService2.gotoCheckFace(this, iCJPayFaceCheckService2.getFaceVerifyParams(str3, valueOf, "one_key_sign", str4, LIZIZ, bool, "", "", "", str, "一键绑卡"), new C135935cJ0(this));
        }
    }

    private final void queryQuickBindResult() {
        CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported && (cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str = cJPayOneKeySignOrderResponseBean.member_biz_order_no;
            Intrinsics.checkNotNullExpressionValue(str, "");
            linkedHashMap.put("member_biz_order_no", str);
            String str2 = cJPayOneKeySignOrderResponseBean.sign;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            linkedHashMap.put("sign", str2);
            showQueryLoading();
            AbstractC135914cIf abstractC135914cIf = (AbstractC135914cIf) this.mBasePresenter;
            if (abstractC135914cIf != null && !PatchProxy.proxy(new Object[]{linkedHashMap}, abstractC135914cIf, AbstractC135914cIf.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(linkedHashMap);
                abstractC135914cIf.LIZJ = true;
                abstractC135914cIf.LIZLLL = false;
                C136235cNq.LIZ().LIZ(abstractC135914cIf.LIZIZ);
                C136235cNq.LIZ().LIZ(abstractC135914cIf.LIZIZ, LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, 500L, new C135929cIu(abstractC135914cIf, linkedHashMap));
                abstractC135914cIf.LIZ(linkedHashMap);
            }
        }
    }

    private final void goPassWdCheck() {
        CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18).isSupported && (cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean) != null) {
            C136011cKE LIZ = C135996cJz.LIZ().LIZ("/basebind/VerifyPwdFragment").LIZ("isQuickBind", true).LIZ("title", C135388cAB.LIZ.LIZJ(getString(2131562023))).LIZ("subTitle", getString(2131561524));
            C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
            HashMap<String, CJPayVoucherInfo> hashMap = this.quickBindData.voucher_info_map;
            Intrinsics.checkNotNullExpressionValue(hashMap, "");
            String str = this.quickBindData.cardType;
            Intrinsics.checkNotNullExpressionValue(str, "");
            Object LIZ2 = LIZ.LIZ("voucher_info_str", c136000cK3.LIZ(hashMap, str).toString()).LIZ("smchId", "").LIZ("orderNo", cJPayOneKeySignOrderResponseBean.member_biz_order_no).LIZ(this);
            if (LIZ2 != null) {
                VerifyPwdFragment verifyPwdFragment = (VerifyPwdFragment) LIZ2;
                verifyPwdFragment.setVerifyPwdListener(new C135911cIc(cJPayOneKeySignOrderResponseBean, verifyPwdFragment, this));
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                Intrinsics.checkNotNullExpressionValue(beginTransaction, "");
                beginTransaction.add(verifyPwdFragment, "verifyPwdFragment");
                beginTransaction.commitAllowingStateLoss();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.android.ttcjpaysdk.bindcard.base.ui.VerifyPwdFragment");
        }
    }

    public final void setQuickBindOrderBean(CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean) {
        this.quickBindOrderBean = cJPayOneKeySignOrderResponseBean;
    }

    /* renamed from: com_android_ttcjpaysdk_bindcard_quickbind_ui_BaseQuickBindView_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m16055x55106389(BaseQuickBindView baseQuickBindView) {
        if (PatchProxy.proxy(new Object[]{baseQuickBindView}, null, changeQuickRedirect, true, 24).isSupported) {
            return;
        }
        baseQuickBindView.m16056x7ec16279();
        int i = Build.VERSION.SDK_INT;
        try {
            baseQuickBindView.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused) {
        }
    }

    private final String getBankTypeDesc(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (Intrinsics.areEqual(CJPayBindCardType.DEBIT.mType, str)) {
            return CJPayBindCardType.DEBIT.mDesc;
        }
        if (Intrinsics.areEqual(CJPayBindCardType.CREDIT.mType, str)) {
            return CJPayBindCardType.CREDIT.mDesc;
        }
        return "";
    }

    private final void handleSignBindCardSuccessEvent(C135934cIz c135934cIz) {
        if (PatchProxy.proxy(new Object[]{c135934cIz}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        CJPayOneKeyQueryResponseBean cJPayOneKeyQueryResponseBean = new CJPayOneKeyQueryResponseBean();
        cJPayOneKeyQueryResponseBean.code = "MP000000";
        cJPayOneKeyQueryResponseBean.order_status = "SUCCESS";
        cJPayOneKeyQueryResponseBean.sign_no = c135934cIz.LIZ;
        cJPayOneKeyQueryResponseBean.token = c135934cIz.LIZIZ;
        onQueryQuickBindResultSuccess(cJPayOneKeyQueryResponseBean);
    }

    @Override // p003X.AbstractActivityC136021cKO
    public void onEvent(BaseEvent baseEvent) {
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo;
        Object obj;
        int i = 1;
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(baseEvent);
        super.onEvent(baseEvent);
        if (baseEvent instanceof C135938cJ3) {
            queryQuickBindResult();
        } else if (baseEvent instanceof C135934cIz) {
            handleSignBindCardSuccessEvent((C135934cIz) baseEvent);
        } else if (baseEvent instanceof C135754cG5) {
            handleFaceCollectSuccess((C135754cG5) baseEvent);
        } else if (baseEvent instanceof C135517cCG) {
            hideProgressLoading();
        } else if (baseEvent instanceof C135930cIv) {
            hideProgressLoading();
            ICJPayIntegratedCounterService iCJPayIntegratedCounterService = this.mIntegratedCounterService;
            if (iCJPayIntegratedCounterService != null && (obj = this.mCallbackOberver) != null) {
                iCJPayIntegratedCounterService.setIntegratedObserver(obj);
            }
            handleMiniAppCallbackEvent((C135930cIv) baseEvent);
            C135903cIU c135903cIU = this.mvpLogger;
            if (c135903cIU != null) {
                String str = this.quickBindData.cardType;
                Intrinsics.checkNotNullExpressionValue(str, "");
                CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean;
                if (cJPayOneKeySignOrderResponseBean == null || (cJPayFaceVerifyInfo = cJPayOneKeySignOrderResponseBean.face_verify_info) == null || !cJPayFaceVerifyInfo.need_live_detection) {
                    i = 0;
                }
                c135903cIU.LIZIZ(str, i);
            }
        } else if (baseEvent instanceof C135565cD2) {
            finishWithoutAnimation();
        }
    }

    private final void goToQuickBindCardMiniApp(String str) {
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo;
        Charset charset;
        int i = 1;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 21).isSupported) {
            return;
        }
        ICJPayIntegratedCounterService iCJPayIntegratedCounterService = this.mIntegratedCounterService;
        if (iCJPayIntegratedCounterService != null) {
            this.mCallbackOberver = iCJPayIntegratedCounterService.getIntegratedObserver();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            charset = Charsets.UTF_8;
        } catch (Exception unused) {
            hideProgressLoading();
        }
        if (str != null) {
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String str2 = new String(bytes, Charsets.UTF_8);
            C2118a LIZ = C2118a.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.f25443LJ != null) {
                C2118a LIZ2 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                LIZ2.f25443LJ.openScheme(this, str2);
            } else {
                C2118a LIZ3 = C2118a.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.LIZLLL != null) {
                    C2118a LIZ4 = C2118a.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    LIZ4.LIZLLL.openScheme(str2);
                }
            }
            C135903cIU c135903cIU = this.mvpLogger;
            if (c135903cIU != null) {
                String str3 = this.quickBindData.cardType;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean;
                if (cJPayOneKeySignOrderResponseBean == null || (cJPayFaceVerifyInfo = cJPayOneKeySignOrderResponseBean.face_verify_info) == null || !cJPayFaceVerifyInfo.need_live_detection) {
                    i = 0;
                }
                c135903cIU.LIZ(str3, i);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final void handleFaceCollectSuccess(C135754cG5 c135754cG5) {
        if (!PatchProxy.proxy(new Object[]{c135754cG5}, this, changeQuickRedirect, false, 13).isSupported && c135754cG5.source == hashCode()) {
            C2341h c2341h = new C2341h(c135754cG5.ticket, c135754cG5.sdkData, c135754cG5.faceAppId, c135754cG5.scene, c135754cG5.faceScene);
            showProgressLoading();
            HashMap hashMap = new HashMap();
            CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean;
            if (cJPayOneKeySignOrderResponseBean != null) {
                String str = cJPayOneKeySignOrderResponseBean.member_biz_order_no;
                Intrinsics.checkNotNullExpressionValue(str, "");
                hashMap.put("out_trade_no", str);
                hashMap.put("ailab_app_id", c2341h.face_app_id);
                hashMap.put("scene", c2341h.scene);
                hashMap.put("face_scene", c2341h.face_scene);
                hashMap.put("live_detect_data", c2341h.face_sdk_data);
                hashMap.put("ticket", c2341h.face_veri_ticket);
                AbstractC135914cIf abstractC135914cIf = (AbstractC135914cIf) this.mBasePresenter;
                if (abstractC135914cIf != null && !PatchProxy.proxy(new Object[]{hashMap, c2341h}, abstractC135914cIf, AbstractC135914cIf.LIZ, false, 3).isSupported) {
                    C106862S5w.LIZ(hashMap, c2341h);
                    C2208b c2208b = (C2208b) abstractC135914cIf.mModel;
                    if (c2208b != null) {
                        c2208b.LIZ(hashMap, new C135925cIq(abstractC135914cIf, c2341h));
                    }
                }
            }
        }
    }

    private final void handleMiniAppCallbackEvent(C135930cIv c135930cIv) {
        CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean;
        if (PatchProxy.proxy(new Object[]{c135930cIv}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        String str = c135930cIv.eventCode;
        String str2 = c135930cIv.data;
        if (Intrinsics.areEqual(C135931cIw.LIZ(), str)) {
            if (str2.length() > 0 && str2 != null && (cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean) != null) {
                Uri parse = Uri.parse(str2);
                Intrinsics.checkNotNullExpressionValue(parse, "");
                String queryParam = getQueryParam(parse, "enc_bindelem");
                if (queryParam == null) {
                    queryParam = "";
                }
                String queryParam2 = getQueryParam(parse, "mask_phoneno");
                if (queryParam2 == null) {
                    queryParam2 = "";
                }
                String queryParam3 = getQueryParam(parse, "mask_cardno");
                if (queryParam3 == null) {
                    queryParam3 = "";
                }
                String queryParam4 = getQueryParam(parse, "gw_channel_order_no");
                if (queryParam4 == null) {
                    queryParam4 = "";
                }
                C135996cJz.LIZ().LIZ("/quickbind/SmsFullPageActivity").LIZ("sign_phone_mask_num", queryParam2).LIZ("bank_enc_info", queryParam).LIZ("mask_cardno", queryParam3).LIZ("gw_channel_order_no", queryParam4).LIZ("sign_order_no", cJPayOneKeySignOrderResponseBean.member_biz_order_no).LIZ("smch_id", cJPayOneKeySignOrderResponseBean.face_verify_info.smch_id).LIZ("is_need_card_info", this.quickBindData.isBindCardNotPay()).LIZ("bank_type", getBankTypeDesc(getSelectedBankCardType())).LIZ("bank_name", this.quickBindData.bankName).LIZ("is_alivecheck", cJPayOneKeySignOrderResponseBean.face_verify_info.need_live_detection).LIZ("is_onestep", 1).LIZ("card_type", getSelectedBankCardType()).LIZ("voucher_info_map", this.quickBindData.voucher_info_map).LIZ(this);
            }
        } else if (!Intrinsics.areEqual(C135931cIw.LIZIZ(), str)) {
        } else {
            finish();
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onGetQuickBindBankUrlSuccess(CJPayOneKeySignBankUrlResponseBean cJPayOneKeySignBankUrlResponseBean) {
        String string;
        if (PatchProxy.proxy(new Object[]{cJPayOneKeySignBankUrlResponseBean}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        hideProgressLoading();
        if (cJPayOneKeySignBankUrlResponseBean != null) {
            if (cJPayOneKeySignBankUrlResponseBean.isResponseOK()) {
                String str = cJPayOneKeySignBankUrlResponseBean.bank_url;
                Intrinsics.checkNotNullExpressionValue(str, "");
                String str2 = cJPayOneKeySignBankUrlResponseBean.post_data;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                goQuickBind(str, str2);
            } else if (Intrinsics.areEqual("1", cJPayOneKeySignBankUrlResponseBean.button_info.button_status)) {
                C135916cIh.LIZIZ.LIZ(this, cJPayOneKeySignBankUrlResponseBean.button_info, new C135922cIn(this, cJPayOneKeySignBankUrlResponseBean));
                C135903cIU c135903cIU = this.mvpLogger;
                if (c135903cIU == null) {
                    return;
                }
                String str3 = this.quickBindData.cardType;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                String str4 = this.quickBindData.bankName;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                String selectedBankCardType = getSelectedBankCardType();
                String str5 = cJPayOneKeySignBankUrlResponseBean.code;
                Intrinsics.checkNotNullExpressionValue(str5, "");
                String str6 = cJPayOneKeySignBankUrlResponseBean.button_info.page_desc;
                Intrinsics.checkNotNullExpressionValue(str6, "");
                c135903cIU.LIZ(str3, str4, selectedBankCardType, str5, str6, "");
            } else {
                String str7 = cJPayOneKeySignBankUrlResponseBean.msg;
                Intrinsics.checkNotNullExpressionValue(str7, "");
                if (str7.length() > 0) {
                    string = cJPayOneKeySignBankUrlResponseBean.msg;
                } else {
                    string = getResources().getString(2131561782);
                }
                CJPayBasicUtils.displayToast(this, string);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onCreateQuickBindOrderSuccess(CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean) {
        if (PatchProxy.proxy(new Object[]{cJPayOneKeySignOrderResponseBean}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        hideProgressLoading();
        if (cJPayOneKeySignOrderResponseBean == null) {
            hideProgressLoading();
        } else if (cJPayOneKeySignOrderResponseBean.isResponseOK()) {
            this.quickBindOrderBean = cJPayOneKeySignOrderResponseBean;
            if (cJPayOneKeySignOrderResponseBean.face_verify_info.need_live_detection) {
                goFaceCheck();
                C135903cIU c135903cIU = this.mvpLogger;
                if (c135903cIU != null) {
                    String str = this.quickBindData.bankName;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    String selectedBankCardType = getSelectedBankCardType();
                    String str2 = this.quickBindData.cardType;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    c135903cIU.LIZ(str, selectedBankCardType, str2, 1);
                }
            } else if (Intrinsics.areEqual(cJPayOneKeySignOrderResponseBean.additional_verify_type, "password")) {
                hideProgressLoading();
                goPassWdCheck();
            } else {
                hideProgressLoading();
                String str3 = cJPayOneKeySignOrderResponseBean.bank_url;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                String str4 = cJPayOneKeySignOrderResponseBean.post_data;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                goQuickBind(str3, str4);
            }
        } else {
            if (cJPayOneKeySignOrderResponseBean.button_info != null) {
                CJPayButtonInfo cJPayButtonInfo = cJPayOneKeySignOrderResponseBean.button_info;
                Intrinsics.checkNotNullExpressionValue(cJPayButtonInfo, "");
                if (cJPayButtonInfo.isShow()) {
                    hideProgressLoading();
                    CJPayButtonInfo cJPayButtonInfo2 = cJPayOneKeySignOrderResponseBean.button_info;
                    Intrinsics.checkNotNullExpressionValue(cJPayButtonInfo2, "");
                    if (cJPayButtonInfo2.isGoCustomerServiceDialog()) {
                        AbstractC135629cE4 LIZ = C135737cFo.LIZ();
                        CJPayButtonInfo cJPayButtonInfo3 = cJPayOneKeySignOrderResponseBean.button_info;
                        Intrinsics.checkNotNullExpressionValue(cJPayButtonInfo3, "");
                        AbstractC135629cE4 LIZ2 = LIZ.LIZ(cJPayButtonInfo3);
                        String str5 = cJPayOneKeySignOrderResponseBean.code;
                        Intrinsics.checkNotNullExpressionValue(str5, "");
                        String str6 = cJPayOneKeySignOrderResponseBean.msg;
                        Intrinsics.checkNotNullExpressionValue(str6, "");
                        LIZ2.LIZ(str5, str6).LIZ(C135876cI3.f17973LJ.LJIIIIZZ()).LIZ(this).LIZ().LIZIZ();
                        return;
                    } else if (!TextUtils.isEmpty(cJPayOneKeySignOrderResponseBean.button_info.main_title)) {
                        C135916cIh.LIZIZ.LIZIZ(this, cJPayOneKeySignOrderResponseBean.button_info, new C135918cIj(this, cJPayOneKeySignOrderResponseBean));
                        C135903cIU c135903cIU2 = this.mvpLogger;
                        if (c135903cIU2 != null) {
                            String str7 = this.quickBindData.cardType;
                            Intrinsics.checkNotNullExpressionValue(str7, "");
                            String str8 = this.quickBindData.bankName;
                            Intrinsics.checkNotNullExpressionValue(str8, "");
                            String selectedBankCardType2 = getSelectedBankCardType();
                            String str9 = cJPayOneKeySignOrderResponseBean.code;
                            Intrinsics.checkNotNullExpressionValue(str9, "");
                            String str10 = cJPayOneKeySignOrderResponseBean.button_info.page_desc;
                            Intrinsics.checkNotNullExpressionValue(str10, "");
                            c135903cIU2.LIZ(str7, str8, selectedBankCardType2, str9, str10, "new_style");
                            return;
                        }
                        return;
                    } else {
                        C135916cIh.LIZIZ.LIZ(this, cJPayOneKeySignOrderResponseBean.button_info, new C135919cIk(this, cJPayOneKeySignOrderResponseBean));
                        C135903cIU c135903cIU3 = this.mvpLogger;
                        if (c135903cIU3 != null) {
                            String str11 = this.quickBindData.cardType;
                            Intrinsics.checkNotNullExpressionValue(str11, "");
                            String str12 = this.quickBindData.bankName;
                            Intrinsics.checkNotNullExpressionValue(str12, "");
                            String selectedBankCardType3 = getSelectedBankCardType();
                            String str13 = cJPayOneKeySignOrderResponseBean.code;
                            Intrinsics.checkNotNullExpressionValue(str13, "");
                            String str14 = cJPayOneKeySignOrderResponseBean.button_info.page_desc;
                            Intrinsics.checkNotNullExpressionValue(str14, "");
                            c135903cIU3.LIZ(str11, str12, selectedBankCardType3, str13, str14, "");
                            return;
                        }
                        return;
                    }
                }
            }
            hideProgressLoading();
            String str15 = cJPayOneKeySignOrderResponseBean.msg;
            Intrinsics.checkNotNullExpressionValue(str15, "");
            if (str15.length() > 0) {
                CJPayBasicUtils.displayToast(this, cJPayOneKeySignOrderResponseBean.msg);
            } else {
                CJPayBasicUtils.displayToast(this, getResources().getString(2131561782));
            }
            L l = this.mvpLogger;
            if (l != 0) {
                String str16 = cJPayOneKeySignOrderResponseBean.code;
                Intrinsics.checkNotNullExpressionValue(str16, "");
                String str17 = cJPayOneKeySignOrderResponseBean.msg;
                Intrinsics.checkNotNullExpressionValue(str17, "");
                if (!PatchProxy.proxy(new Object[]{str16, str17}, l, C135903cIU.LIZ, false, 12).isSupported) {
                    C106862S5w.LIZ(str16, str17);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", str16);
                        jSONObject.put("error_msg", str17);
                    } catch (Exception unused) {
                    }
                    C2118a.LIZ().LIZ("wallet_rd_quickbind_order_fail", jSONObject);
                }
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onQueryQuickBindResultFail(CJPayOneKeyQueryResponseBean cJPayOneKeyQueryResponseBean) {
        int i;
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo;
        if (PatchProxy.proxy(new Object[]{cJPayOneKeyQueryResponseBean}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        hideQueryLoading();
        if (cJPayOneKeyQueryResponseBean == null) {
            CJPayBasicUtils.displayToast(this, getResources().getString(2131561782));
        } else if (cJPayOneKeyQueryResponseBean.isResponseOK()) {
            String str = cJPayOneKeyQueryResponseBean.order_status;
            Intrinsics.checkNotNullExpressionValue(str, "");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (Intrinsics.areEqual("fail", lowerCase)) {
                if (Intrinsics.areEqual("1", cJPayOneKeyQueryResponseBean.button_info.button_status)) {
                    if (!TextUtils.isEmpty(cJPayOneKeyQueryResponseBean.button_info.main_title)) {
                        C135916cIh.LIZIZ.LIZIZ(this, cJPayOneKeyQueryResponseBean.button_info, new C135920cIl(this, cJPayOneKeyQueryResponseBean));
                        C135903cIU c135903cIU = this.mvpLogger;
                        if (c135903cIU != null) {
                            String str2 = this.quickBindData.cardType;
                            Intrinsics.checkNotNullExpressionValue(str2, "");
                            String str3 = this.quickBindData.bankName;
                            Intrinsics.checkNotNullExpressionValue(str3, "");
                            String selectedBankCardType = getSelectedBankCardType();
                            String str4 = cJPayOneKeyQueryResponseBean.code;
                            Intrinsics.checkNotNullExpressionValue(str4, "");
                            String str5 = cJPayOneKeyQueryResponseBean.button_info.page_desc;
                            Intrinsics.checkNotNullExpressionValue(str5, "");
                            c135903cIU.LIZ(str2, str3, selectedBankCardType, str4, str5, "new_style");
                        }
                    } else {
                        C135916cIh.LIZIZ.LIZ(this, cJPayOneKeyQueryResponseBean.button_info, new C135921cIm(this, cJPayOneKeyQueryResponseBean));
                        C135903cIU c135903cIU2 = this.mvpLogger;
                        if (c135903cIU2 != null) {
                            String str6 = this.quickBindData.cardType;
                            Intrinsics.checkNotNullExpressionValue(str6, "");
                            String str7 = this.quickBindData.bankName;
                            Intrinsics.checkNotNullExpressionValue(str7, "");
                            String selectedBankCardType2 = getSelectedBankCardType();
                            String str8 = cJPayOneKeyQueryResponseBean.code;
                            Intrinsics.checkNotNullExpressionValue(str8, "");
                            String str9 = cJPayOneKeyQueryResponseBean.button_info.page_desc;
                            Intrinsics.checkNotNullExpressionValue(str9, "");
                            c135903cIU2.LIZ(str6, str7, selectedBankCardType2, str8, str9, "");
                        }
                    }
                } else {
                    CJPayBasicUtils.displayToast(this, getResources().getString(2131561877));
                }
            }
        }
        C135903cIU c135903cIU3 = this.mvpLogger;
        if (c135903cIU3 != null) {
            String str10 = this.quickBindData.bankName;
            Intrinsics.checkNotNullExpressionValue(str10, "");
            String selectedBankCardType3 = getSelectedBankCardType();
            String str11 = this.quickBindData.cardType;
            Intrinsics.checkNotNullExpressionValue(str11, "");
            CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean;
            if (cJPayOneKeySignOrderResponseBean != null && (cJPayFaceVerifyInfo = cJPayOneKeySignOrderResponseBean.face_verify_info) != null && cJPayFaceVerifyInfo.need_live_detection) {
                i = 1;
            } else {
                i = 0;
            }
            c135903cIU3.LIZ(str10, selectedBankCardType3, str11, false, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        if (r3 == null) goto L73;
     */
    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onQueryQuickBindResultSuccess(com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeyQueryResponseBean r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView.onQueryQuickBindResultSuccess(com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeyQueryResponseBean):void");
    }

    private final String getQueryParam(Uri uri, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uri, str}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return "";
        }
        return URLDecoder.decode(uri.getQueryParameter(str));
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onCreateQuickBindOrderFail(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        hideProgressLoading();
        CJPayBasicUtils.displayToast(this, getResources().getString(2131561782));
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onGetQuickBindBankUrlFail(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        hideProgressLoading();
        CJPayBasicUtils.displayToast(this, getResources().getString(2131561782));
    }

    private final void goQuickBind(String str, String str2) {
        CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean;
        String str3 = str;
        if (PatchProxy.proxy(new Object[]{str3, str2}, this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        try {
            if (Intrinsics.areEqual("ICBC", this.quickBindData.bankCode)) {
                this.mIsMiniAppSign = true;
                goToQuickBindCardMiniApp(str3);
                return;
            }
            this.mIsMiniAppSign = false;
            JSONObject jSONObject = new JSONObject(str2);
            CJPayQuickBindCardUtils.C2218a LIZJ = CJPayQuickBindCardUtils.LIZJ(this.quickBindData.bankCode);
            if (LIZJ != null && Intrinsics.areEqual("1128", CJPayHostInfo.aid) && CJPayQuickBindCardUtils.LIZ(this, LIZJ.LIZIZ) && Intrinsics.areEqual("DEBIT", getSelectedBankCardType())) {
                String encode = URLEncoder.encode(jSONObject.optString("epccGwMsg"), C34037f.f43302f);
                new StringBuilder();
                CJPayQuickBindCardUtils.LIZIZ(this, C0002O.m25086C(LIZJ.LIZJ, encode));
                hideProgressLoading();
                this.mIsCMBAppSign = true;
                return;
            }
            String encode2 = URLEncoder.encode(jSONObject.optString("epccGwMsg"));
            this.mIsCMBAppSign = false;
            if (2 == CJPayHostInfo.serverType && (cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean) != null) {
                new StringBuilder();
                str3 = C0002O.m25080C(str3, "?merchant_id=", C135876cI3.LJI(), "&app_id=", C135876cI3.LJII(), "&sign=", cJPayOneKeySignOrderResponseBean.sign, "&member_biz_order_no=", cJPayOneKeySignOrderResponseBean.member_biz_order_no);
            }
            String m25086C = C0002O.m25086C("epccGwMsg=", encode2);
            String str4 = this.quickBindData.bankCode;
            Intrinsics.checkNotNullExpressionValue(str4, "");
            gotoOneKeyBank(str3, m25086C, str4);
            hideProgressLoading();
        } catch (Exception unused) {
            hideProgressLoading();
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onFaceVerifySuccess(CJPayVerifyLiveDetectBean cJPayVerifyLiveDetectBean, C2341h c2341h) {
        CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean;
        String str;
        CJPayFaceVerifyInfo cJPayFaceVerifyInfo;
        if (PatchProxy.proxy(new Object[]{cJPayVerifyLiveDetectBean, c2341h}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2341h);
        hideProgressLoading();
        if (cJPayVerifyLiveDetectBean == null) {
            CJPayBasicUtils.displayToast(this, getResources().getString(2131561782));
            return;
        }
        if (cJPayVerifyLiveDetectBean.isVerifySuccess()) {
            CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean2 = this.quickBindOrderBean;
            if (cJPayOneKeySignOrderResponseBean2 != null) {
                String str2 = cJPayOneKeySignOrderResponseBean2.bank_url;
                Intrinsics.checkNotNullExpressionValue(str2, "");
                String str3 = cJPayOneKeySignOrderResponseBean2.post_data;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                goQuickBind(str2, str3);
            }
        } else if (cJPayVerifyLiveDetectBean.isNeedRetry() && (cJPayOneKeySignOrderResponseBean = this.quickBindOrderBean) != null) {
            CJPayFaceVerifyInfo cJPayFaceVerifyInfo2 = cJPayOneKeySignOrderResponseBean.face_verify_info;
            String str4 = cJPayVerifyLiveDetectBean.face_content;
            Intrinsics.checkNotNullExpressionValue(str4, "");
            cJPayFaceVerifyInfo2.face_content = str4;
            CJPayFaceVerifyInfo cJPayFaceVerifyInfo3 = cJPayOneKeySignOrderResponseBean.face_verify_info;
            String str5 = cJPayVerifyLiveDetectBean.face_recognition_type;
            Intrinsics.checkNotNullExpressionValue(str5, "");
            cJPayFaceVerifyInfo3.verify_type = str5;
            CJPayFaceVerifyInfo cJPayFaceVerifyInfo4 = cJPayOneKeySignOrderResponseBean.face_verify_info;
            String str6 = cJPayVerifyLiveDetectBean.name_mask;
            Intrinsics.checkNotNullExpressionValue(str6, "");
            cJPayFaceVerifyInfo4.name_mask = str6;
            ICJPayFaceCheckService iCJPayFaceCheckService = this.faceCheckService;
            if (iCJPayFaceCheckService != null) {
                String str7 = cJPayOneKeySignOrderResponseBean.member_biz_order_no;
                Integer valueOf = Integer.valueOf(hashCode());
                String str8 = cJPayOneKeySignOrderResponseBean.face_verify_info.verify_channel;
                JSONObject LIZIZ = CJPayHostInfo.Companion.LIZIZ(C135876cI3.f17973LJ.LJIIIIZZ());
                Boolean bool = Boolean.FALSE;
                CJPayOneKeySignOrderResponseBean cJPayOneKeySignOrderResponseBean3 = this.quickBindOrderBean;
                if (cJPayOneKeySignOrderResponseBean3 != null && (cJPayFaceVerifyInfo = cJPayOneKeySignOrderResponseBean3.face_verify_info) != null) {
                    str = cJPayFaceVerifyInfo.face_scene;
                } else {
                    str = null;
                }
                iCJPayFaceCheckService.gotoCheckFaceAgain(this, iCJPayFaceCheckService.getFaceVerifyParams(str7, valueOf, "one_key_sign", str8, LIZIZ, bool, "", "", "", str, "一键绑卡"));
            }
        }
        C135903cIU c135903cIU = this.mvpLogger;
        if (c135903cIU != null) {
            c135903cIU.LIZ(this, cJPayVerifyLiveDetectBean, c2341h);
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$a
    public void onFaceVerifyFail(String str, String str2, C2341h c2341h) {
        if (PatchProxy.proxy(new Object[]{str, str2, c2341h}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2341h);
        hideProgressLoading();
        CJPayBasicUtils.displayToast(this, getResources().getString(2131561782));
        C135903cIU c135903cIU = this.mvpLogger;
        if (c135903cIU != null) {
            c135903cIU.LIZ(this, (CJPayVerifyLiveDetectBean) null, c2341h);
        }
    }

    private final void gotoOneKeyBank(String str, String str2, String str3) {
        ICJPayH5Service iCJPayH5Service;
        if (!PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 20).isSupported && (iCJPayH5Service = this.h5Service) != null) {
            if (Intrinsics.areEqual("PSBC", str3)) {
                H5ParamBuilder h5ParamBuilder = new H5ParamBuilder();
                getContext();
                h5ParamBuilder.setContext(this);
                h5ParamBuilder.setUrl(str);
                h5ParamBuilder.setRequestType(UGCMonitor.TYPE_POST);
                h5ParamBuilder.setFormData(str2);
                h5ParamBuilder.setStatusBarColor("#ffffff");
                h5ParamBuilder.setDisableH5History(true);
                h5ParamBuilder.setHostInfo(CJPayHostInfo.Companion.LIZIZ(C135876cI3.f17973LJ.LJIIIIZZ()));
                iCJPayH5Service.startH5(h5ParamBuilder);
                return;
            }
            H5ParamBuilder h5ParamBuilder2 = new H5ParamBuilder();
            getContext();
            h5ParamBuilder2.setContext(this);
            h5ParamBuilder2.setUrl(str);
            h5ParamBuilder2.setRequestType(UGCMonitor.TYPE_POST);
            h5ParamBuilder2.setFormData(str2);
            h5ParamBuilder2.setStatusBarColor("#ffffff");
            h5ParamBuilder2.setDisableH5History(false);
            h5ParamBuilder2.setHostInfo(CJPayHostInfo.Companion.LIZIZ(C135876cI3.f17973LJ.LJIIIIZZ()));
            iCJPayH5Service.startH5(h5ParamBuilder2);
        }
    }
}
