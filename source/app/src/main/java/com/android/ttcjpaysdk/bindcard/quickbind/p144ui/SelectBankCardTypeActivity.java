package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.eventbus.EventManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCircleCheckBox;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.constants.CJPayBindCardType;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2235c;
import com.android.ttcjpaysdk.bindcard.quickbind.b$c;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2231c;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.android.ttcjpaysdk.thirdparty.view.CJPayRoundCornerImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p1594ss.android.agilelogger.ALog;
import com.p1594ss.android.ugc.aweme.pad_impl.common.PadCommonServiceImpl;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C123320YgE;
import p003X.C135401cAO;
import p003X.C135565cD2;
import p003X.C135726cFd;
import p003X.C135876cI3;
import p003X.C135903cIU;
import p003X.C135904cIV;
import p003X.C135906cIX;
import p003X.C135907cIY;
import p003X.C136215cNW;
import p003X.C136757cWG;
import p003X.C472904mq;
import p003X.GOY;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SelectBankCardTypeActivity */
/* loaded from: classes17.dex */
public final class SelectBankCardTypeActivity extends BaseQuickBindView<C2231c, C2235c> implements b$c {
    public static ChangeQuickRedirect LIZ;
    public RelativeLayout LIZIZ;
    public RelativeLayout LIZJ;
    public RelativeLayout LIZLLL;

    /* renamed from: LJ */
    public ImageView f25485LJ;
    public CJPayRoundCornerImageView LJFF;
    public TextView LJI;
    public CJPayCircleCheckBox LJII;
    public CJPayCircleCheckBox LJIIIIZZ;
    public ImageView LJIIIZ;
    public ImageView LJIIJ;
    public TextView LJIIJJI;
    public TextView LJIIL;
    public TextView LJIILIIL;
    public TextView LJIILJJIL;
    public TextView LJIILL;
    public LoadingButton LJIILLIIL;
    public LinearLayout LJIIZILJ;
    public C135401cAO LJIJ;
    public boolean LJIJJ;
    public boolean LJIL;
    public CJPayProtocolGroupContentsBean LJJ;
    public CJPayProtocolGroupContentsBean LJJI;
    public HashMap LJJIII;
    public CJPayNameAndIdentifyCodeBillBean LJIJI = new CJPayNameAndIdentifyCodeBillBean();
    public String LJIJJLI = "DEBIT";
    public String LJJIFFI = "";
    public String LJJII = "";

    static {
        Covode.recordClassIndex(7261);
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 58).isSupported && (hashMap = this.LJJIII) != null) {
            hashMap.clear();
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 57);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJIII == null) {
            this.LJJIII = new HashMap();
        }
        View view = (View) this.LJJIII.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJJIII.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final int getLayoutId() {
        return 2131690562;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 68).isSupported) {
            return;
        }
        GOY.m23828LJ(this);
        super.onDestroy();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 63).isSupported) {
            return;
        }
        GOY.LIZJ(this);
        super.onPause();
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 62).isSupported) {
            return;
        }
        GOY.LIZ(this);
        super.onStart();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final String getSelectedBankCardType() {
        return this.LJIJJLI;
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO
    public final C2124b getModel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 52);
        if (proxy.isSupported) {
            return (C2124b) proxy.result;
        }
        return new C2229a();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void hideQueryLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 51).isSupported) {
            return;
        }
        hideStyleLoading();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void next() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 44).isSupported) {
            return;
        }
        LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void showQueryLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 50).isSupported) {
            return;
        }
        showStyleLoading();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void hideProgressLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 49).isSupported) {
            return;
        }
        C136757cWG.f18084LJ.LIZ();
        LoadingButton loadingButton = this.LJIILLIIL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView
    public final void showProgressLoading() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 48).isSupported) {
            return;
        }
        C136757cWG c136757cWG = C136757cWG.f18084LJ;
        getContext();
        c136757cWG.LIZ(this, getResources().getString(2131561755));
        LoadingButton loadingButton = this.LJIILLIIL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.LIZ();
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 54).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("biz_order_type", "one_key_sign");
        String str = this.quickBindData.bankCode;
        Intrinsics.checkNotNullExpressionValue(str, "");
        hashMap.put("bank_code", str);
        hashMap.put("card_type", this.LJIJJLI);
        C2231c c2231c = (C2231c) this.mBasePresenter;
        if (c2231c != null) {
            c2231c.LIZ(hashMap, Intrinsics.areEqual("DEBIT", this.LJIJJLI));
        }
    }

    private final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 55);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo())) {
                jSONObject.put("bind_card_info", new JSONObject(C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo()));
            }
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initActions() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 43).isSupported) {
            return;
        }
        LoadingButton loadingButton = this.LJIILLIIL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(loadingButton, 0L, new SelectBankCardTypeActivity$initActions$1(this), 1, null);
        RelativeLayout relativeLayout = this.LIZJ;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(relativeLayout, 0L, new SelectBankCardTypeActivity$initActions$2(this), 1, null);
        RelativeLayout relativeLayout2 = this.LIZLLL;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C123320YgE.LIZ(relativeLayout2, 0L, new SelectBankCardTypeActivity$initActions$3(this), 1, null);
        TextView textView = this.LJIILL;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (textView.getVisibility() == 0 && C135876cI3.LIZ() != null) {
            C123320YgE.LIZ(textView, 0L, new SelectBankCardTypeActivity$initActions$$inlined$let$lambda$1(textView, this), 1, null);
        }
        C135401cAO c135401cAO = this.LJIJ;
        if (c135401cAO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c135401cAO.LIZJ = new C135906cIX(this);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initData() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        this.LJJIFFI = C135904cIV.LIZIZ.LIZ(this.quickBindData);
        this.LJJII = C135904cIV.LIZIZ.LIZIZ(this.quickBindData);
        C135903cIU c135903cIU = this.mvpLogger;
        if (c135903cIU != null) {
            String str = this.quickBindData.bank_rank;
            Intrinsics.checkNotNullExpressionValue(str, "");
            String str2 = this.quickBindData.rank_type;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            HashMap<String, CJPayVoucherInfo> hashMap = this.quickBindData.voucher_info_map;
            Intrinsics.checkNotNullExpressionValue(hashMap, "");
            c135903cIU.LIZ(str, str2, hashMap);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        SelectBankCardTypeActivity selectBankCardTypeActivity;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 45).isSupported) {
            return;
        }
        super.onBackPressed();
        if (this.LJIJJ) {
            EventManager.INSTANCE.notifyNow(new C136215cNW(CJPayQuickBindCardUtils.LIZJ()));
            EventManager.INSTANCE.notify(new C135565cD2());
            if (C135876cI3.f17973LJ.LJIILIIL().isIndependentBindCard()) {
                selectBankCardTypeActivity = this;
            } else {
                selectBankCardTypeActivity = null;
            }
            if (selectBankCardTypeActivity != null) {
                C2118a.LIZ().LIZ(4100).LIZIZ();
            }
        }
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        GOY.LIZIZ(this);
        super.onResume();
        C135903cIU c135903cIU = this.mvpLogger;
        if (c135903cIU != null) {
            String str = this.quickBindData.bankName;
            Intrinsics.checkNotNullExpressionValue(str, "");
            String selectedBankCardType = getSelectedBankCardType();
            String str2 = this.quickBindData.cardType;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            String str3 = CJPayBindCardType.ALL.mType;
            if (!PatchProxy.proxy(new Object[]{str, selectedBankCardType, str2, "campaign_info", str3}, c135903cIU, C2235c.f25482LJ, false, 1).isSupported) {
                C106862S5w.LIZ(str, selectedBankCardType, str2, "campaign_info", str3);
                c135903cIU.LIZIZ("wallet_addbcard_onestepbind_banktype_page_imp", str, selectedBankCardType, str2, "campaign_info", str3);
            }
        }
        C135726cFd.LIZLLL.LIZ("绑卡签约");
        CJPayPageLoadTrace.LIZ().LIZIZ(CJPayPageLoadTrace.Page.NEW_CARD_PAY, CJPayPageLoadTrace.Section.END, "绑卡签约");
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.p144ui.BaseQuickBindView, p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onStop() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 66).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 65).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 64).isSupported) {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 67).isSupported) {
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

    public final void LIZ() {
        String str;
        String bindCardSource;
        String str2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 46).isSupported) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("return_url", C0002O.m25086C("https://onekeysigncard/cardbind/quickbind/notify?afterQuickbind=", CJPayQuickBindCardUtils.LIZLLL(CJPayHostInfo.aid)));
        String str3 = this.quickBindData.bankCode;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        linkedHashMap.put("bank_code", str3);
        if (Intrinsics.areEqual(this.quickBindData.cardType, CJPayBindCardType.ALL.mType)) {
            str = this.LJIJJLI;
        } else {
            str = this.quickBindData.cardType;
        }
        Intrinsics.checkNotNullExpressionValue(str, "");
        linkedHashMap.put("card_type", str);
        if (TextUtils.isEmpty(C135876cI3.f17973LJ.LJIILIIL().getBindCardSource())) {
            bindCardSource = "payment_manage";
        } else {
            bindCardSource = C135876cI3.f17973LJ.LJIILIIL().getBindCardSource();
        }
        linkedHashMap.put("source", bindCardSource);
        String LJIIJJI = C135876cI3.LJIIJJI();
        if (LJIIJJI != null) {
            linkedHashMap.put("out_trade_no", LJIIJJI);
        }
        String LIZJ = LIZJ();
        if (LIZJ != null && LIZJ.length() > 0) {
            linkedHashMap.put("exts", LIZJ);
        }
        if (this.quickBindData.isBindCardThenPay()) {
            linkedHashMap.put("trade_scene", "pay");
        } else {
            int tradeScene = C135876cI3.f17973LJ.LJIILIIL().getTradeScene();
            if (tradeScene != 1) {
                if (tradeScene == 2) {
                    linkedHashMap.put("trade_scene", "balance_withdraw");
                }
            } else {
                linkedHashMap.put("trade_scene", "balance_recharge");
            }
        }
        showProgressLoading();
        C2231c c2231c = (C2231c) this.mBasePresenter;
        if (c2231c != null) {
            CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean = this.LJIJI;
            if (cJPayNameAndIdentifyCodeBillBean == null || (str2 = cJPayNameAndIdentifyCodeBillBean.member_biz_order_no) == null) {
                str2 = "";
            }
            c2231c.LIZ(linkedHashMap, str2);
        }
    }

    @Override // p003X.AbstractActivityC136021cKO
    public final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 40).isSupported) {
            return;
        }
        View findViewById = findViewById(2131169717);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (RelativeLayout) findViewById;
        Intrinsics.checkNotNullExpressionValue(findViewById(2131165242), "");
        View findViewById2 = findViewById(2131188088);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (RelativeLayout) findViewById2;
        View findViewById3 = findViewById(2131188087);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LIZLLL = (RelativeLayout) findViewById3;
        View findViewById4 = findViewById(2131169694);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.f25485LJ = (ImageView) findViewById4;
        View findViewById5 = findViewById(2131179520);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJFF = (CJPayRoundCornerImageView) findViewById5;
        View findViewById6 = findViewById(2131169707);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJI = (TextView) findViewById6;
        View findViewById7 = findViewById(2131169790);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJII = (CJPayCircleCheckBox) findViewById7;
        View findViewById8 = findViewById(2131169774);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIIIIZZ = (CJPayCircleCheckBox) findViewById8;
        View findViewById9 = findViewById(2131169773);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        this.LJIIJ = (ImageView) findViewById9;
        View findViewById10 = findViewById(2131169789);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        this.LJIIIZ = (ImageView) findViewById10;
        View findViewById11 = findViewById(2131193894);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        this.LJIIJJI = (TextView) findViewById11;
        View findViewById12 = findViewById(2131193895);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        this.LJIIL = (TextView) findViewById12;
        View findViewById13 = findViewById(2131193871);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        this.LJIILIIL = (TextView) findViewById13;
        View findViewById14 = findViewById(2131193872);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.LJIILJJIL = (TextView) findViewById14;
        View findViewById15 = findViewById(2131169882);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "");
        this.LJIILL = (TextView) findViewById15;
        View findViewById16 = findViewById(2131189202);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "");
        this.LJIILLIIL = (LoadingButton) findViewById16;
        View findViewById17 = findViewById(2131169639);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "");
        this.LJIIZILJ = (LinearLayout) findViewById17;
        LinearLayout linearLayout = this.LJIIZILJ;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJIJ = new C135401cAO(linearLayout);
    }

    @Override // p003X.AbstractActivityC135987cJq
    public final void initViews() {
        int i;
        int i2;
        CJPayBindCardType cJPayBindCardType;
        int i3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported) {
            return;
        }
        String string = getResources().getString(2131561924);
        Intrinsics.checkNotNullExpressionValue(string, "");
        AbstractActivityC135987cJq.setTitleText$default(this, string, 0, 2, null);
        CJPayCircleCheckBox cJPayCircleCheckBox = this.LJII;
        if (cJPayCircleCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox.setIESNewStyle(true);
        CJPayCircleCheckBox cJPayCircleCheckBox2 = this.LJIIIIZZ;
        if (cJPayCircleCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox2.setIESNewStyle(true);
        CJPayCircleCheckBox cJPayCircleCheckBox3 = this.LJII;
        if (cJPayCircleCheckBox3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox3.setWithCircleWhenUnchecked(true);
        CJPayCircleCheckBox cJPayCircleCheckBox4 = this.LJIIIIZZ;
        if (cJPayCircleCheckBox4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox4.setWithCircleWhenUnchecked(true);
        String str = this.quickBindData.cardType;
        int i4 = 2130840461;
        if (Intrinsics.areEqual(str, CJPayBindCardType.ALL.mType)) {
            boolean z = !Intrinsics.areEqual(this.quickBindData.card_type_chosen, CJPayBindCardType.CREDIT.mType);
            if (z) {
                cJPayBindCardType = CJPayBindCardType.DEBIT;
            } else {
                cJPayBindCardType = CJPayBindCardType.CREDIT;
            }
            this.LJIJJLI = cJPayBindCardType.mType;
            CJPayCircleCheckBox cJPayCircleCheckBox5 = this.LJII;
            if (cJPayCircleCheckBox5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCircleCheckBox5.setChecked(z);
            RelativeLayout relativeLayout = this.LIZJ;
            if (relativeLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (z) {
                i3 = 2130840461;
            } else {
                i3 = 2130840462;
            }
            relativeLayout.setBackgroundResource(i3);
            RelativeLayout relativeLayout2 = this.LIZLLL;
            if (relativeLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (z) {
                i4 = 2130840462;
            }
            relativeLayout2.setBackgroundResource(i4);
            CJPayCircleCheckBox cJPayCircleCheckBox6 = this.LJIIIIZZ;
            if (cJPayCircleCheckBox6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCircleCheckBox6.setChecked(!z);
        } else if (Intrinsics.areEqual(str, CJPayBindCardType.DEBIT.mType)) {
            this.LJIJJLI = CJPayBindCardType.DEBIT.mType;
            CJPayCircleCheckBox cJPayCircleCheckBox7 = this.LJII;
            if (cJPayCircleCheckBox7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCircleCheckBox7.setChecked(true);
            RelativeLayout relativeLayout3 = this.LIZJ;
            if (relativeLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            relativeLayout3.setBackgroundResource(2130840461);
            CJPayCircleCheckBox cJPayCircleCheckBox8 = this.LJIIIIZZ;
            if (cJPayCircleCheckBox8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCircleCheckBox8.setVisibility(4);
            ImageView imageView = this.LJIIJ;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            imageView.setVisibility(0);
            RelativeLayout relativeLayout4 = this.LIZLLL;
            if (relativeLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            relativeLayout4.setEnabled(false);
            TextView textView = this.LJIILIIL;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText(getResources().getString(2131561874));
            TextView textView2 = this.LJIILIIL;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2.setTextColor(C116971W2r.LIZ(getResources(), 2131624850));
        } else if (Intrinsics.areEqual(str, CJPayBindCardType.CREDIT.mType)) {
            this.LJIJJLI = CJPayBindCardType.CREDIT.mType;
            CJPayCircleCheckBox cJPayCircleCheckBox9 = this.LJIIIIZZ;
            if (cJPayCircleCheckBox9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCircleCheckBox9.setChecked(true);
            RelativeLayout relativeLayout5 = this.LIZLLL;
            if (relativeLayout5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            relativeLayout5.setBackgroundResource(2130840461);
            CJPayCircleCheckBox cJPayCircleCheckBox10 = this.LJII;
            if (cJPayCircleCheckBox10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCircleCheckBox10.setVisibility(4);
            ImageView imageView2 = this.LJIIIZ;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            imageView2.setVisibility(0);
            RelativeLayout relativeLayout6 = this.LIZJ;
            if (relativeLayout6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            relativeLayout6.setEnabled(false);
            TextView textView3 = this.LJIIJJI;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView3.setText(getResources().getString(2131561875));
            TextView textView4 = this.LJIIJJI;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView4.setTextColor(C116971W2r.LIZ(getResources(), 2131624850));
        }
        TextView textView5 = this.LJI;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView5.setText(this.quickBindData.bankName);
        C135907cIY c135907cIY = C135907cIY.LIZIZ;
        String str2 = this.quickBindData.iconBackground;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        CJPayRoundCornerImageView cJPayRoundCornerImageView = this.LJFF;
        if (cJPayRoundCornerImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c135907cIY.LIZ(str2, cJPayRoundCornerImageView);
        C135907cIY c135907cIY2 = C135907cIY.LIZIZ;
        String str3 = this.quickBindData.bankIconUrl;
        Intrinsics.checkNotNullExpressionValue(str3, "");
        ImageView imageView3 = this.f25485LJ;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c135907cIY2.LIZ(str3, imageView3);
        C135907cIY c135907cIY3 = C135907cIY.LIZIZ;
        RelativeLayout relativeLayout7 = this.LIZIZ;
        if (relativeLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[]{relativeLayout7, this}, c135907cIY3, C135907cIY.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(relativeLayout7, this);
            C472904mq.LIZ(relativeLayout7, new int[]{CastProtectorUtils.parseColor("#dedede"), CastProtectorUtils.parseColor("#dedede")}, CJPayBasicUtils.dipToPX(this, 5.0f), CastProtectorUtils.parseColor("#26969ba5"), CJPayBasicUtils.dipToPX(this, 5.0f), 0, 0);
        }
        if (Intrinsics.areEqual(this.quickBindData.cardType, CJPayBindCardType.ALL.mType) || Intrinsics.areEqual(this.quickBindData.cardType, CJPayBindCardType.DEBIT.mType)) {
            TextView textView6 = this.LJIIL;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!TextUtils.isEmpty(this.LJJII)) {
                i = 0;
            } else {
                i = 8;
            }
            textView6.setVisibility(i);
            TextView textView7 = this.LJIIL;
            if (textView7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView7.setText(this.LJJII);
        }
        if (Intrinsics.areEqual(this.quickBindData.cardType, CJPayBindCardType.ALL.mType) || Intrinsics.areEqual(this.quickBindData.cardType, CJPayBindCardType.CREDIT.mType)) {
            TextView textView8 = this.LJIILJJIL;
            if (textView8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!TextUtils.isEmpty(this.LJJIFFI)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView8.setVisibility(i2);
            TextView textView9 = this.LJIILJJIL;
            if (textView9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView9.setText(this.LJJIFFI);
        }
        Boolean bool = this.quickBindData.isJumpOneKeySign;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            TextView textView10 = this.LJIILL;
            if (textView10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView10.setVisibility(0);
        } else {
            TextView textView11 = this.LJIILL;
            if (textView11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView11.setVisibility(8);
        }
        LoadingButton loadingButton = this.LJIILLIIL;
        if (loadingButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        loadingButton.setEnabled(true);
    }

    @Override // p003X.AbstractActivityC135987cJq, p003X.AbstractActivityC136021cKO, com.android.ttcjpaysdk.base.framework.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 59).isSupported) {
            return;
        }
        GOY.LIZ(this, bundle);
        if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 61).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this, bundle}, null, LIZ, true, 60).isSupported) {
                super.onCreate(bundle);
            }
            try {
                PadCommonServiceImpl.LIZ(false).LIZ(this, getResources().getConfiguration());
            } catch (ClassCastException unused) {
                ALog.m8956e("PadLancet", "setOrientationForBehind error:can't cast to Activity");
            }
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 53).isSupported) {
            return;
        }
        if (z) {
            CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean = this.LJJ;
            if (cJPayProtocolGroupContentsBean != null) {
                C135401cAO c135401cAO = this.LJIJ;
                if (c135401cAO == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                c135401cAO.LIZ(cJPayProtocolGroupContentsBean.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean.guide_message, this.LJIL);
                return;
            }
            LIZIZ();
            return;
        }
        CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean2 = this.LJJI;
        if (cJPayProtocolGroupContentsBean2 != null) {
            C135401cAO c135401cAO2 = this.LJIJ;
            if (c135401cAO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c135401cAO2.LIZ(cJPayProtocolGroupContentsBean2.getProtocolGroupBeanList(), cJPayProtocolGroupContentsBean2.guide_message, this.LJIL);
            return;
        }
        LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.bindcard.quickbind.b$c
    public final void LIZ(CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean, boolean z) {
        if (!PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 47).isSupported && cJPayProtocolGroupContentsBean != null && cJPayProtocolGroupContentsBean.protocol_list.size() > 0 && 1 != 0) {
            if (z) {
                this.LJJ = cJPayProtocolGroupContentsBean;
            } else {
                this.LJJI = cJPayProtocolGroupContentsBean;
            }
            this.LJIL = cJPayProtocolGroupContentsBean.isNeedCheckBox();
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf.booleanValue()) {
                valueOf.booleanValue();
                if (Intrinsics.areEqual("DEBIT", this.LJIJJLI)) {
                    valueOf.booleanValue();
                    LIZ(true);
                    return;
                }
            }
            Boolean valueOf2 = Boolean.valueOf(z);
            if (!valueOf2.booleanValue()) {
                valueOf2.booleanValue();
                if (Intrinsics.areEqual("CREDIT", this.LJIJJLI)) {
                    valueOf2.booleanValue();
                    LIZ(false);
                }
            }
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        int i;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 56).isSupported) {
            return;
        }
        CJPayCircleCheckBox cJPayCircleCheckBox = this.LJII;
        if (cJPayCircleCheckBox == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox.setChecked(z);
        CJPayCircleCheckBox cJPayCircleCheckBox2 = this.LJIIIIZZ;
        if (cJPayCircleCheckBox2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCircleCheckBox2.setChecked(z2);
        RelativeLayout relativeLayout = this.LIZJ;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int i2 = 2130840461;
        if (z) {
            i = 2130840461;
        } else {
            i = 2130840462;
        }
        relativeLayout.setBackgroundResource(i);
        RelativeLayout relativeLayout2 = this.LIZLLL;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!z2) {
            i2 = 2130840462;
        }
        relativeLayout2.setBackgroundResource(i2);
    }
}
