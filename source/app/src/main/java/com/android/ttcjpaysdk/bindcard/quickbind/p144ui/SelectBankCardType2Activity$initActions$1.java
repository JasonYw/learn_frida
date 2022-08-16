package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.constants.CJPayBindCardType;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2235c;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2231c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C135401cAO;
import p003X.C135876cI3;
import p003X.C135996cJz;
import p003X.FWT;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SelectBankCardType2Activity$initActions$1 */
/* loaded from: classes17.dex */
public final class SelectBankCardType2Activity$initActions$1 extends Lambda implements Function1<LoadingButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SelectBankCardType2Activity this$0;

    static {
        Covode.recordClassIndex(7258);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBankCardType2Activity$initActions$1(SelectBankCardType2Activity selectBankCardType2Activity) {
        super(1);
        this.this$0 = selectBankCardType2Activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LoadingButton loadingButton) {
        String str;
        String bindCardSource;
        C135401cAO c135401cAO;
        if (!PatchProxy.proxy(new Object[]{loadingButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(loadingButton);
            if (C135876cI3.f17973LJ.LIZJ()) {
                SelectBankCardType2Activity selectBankCardType2Activity = this.this$0;
                selectBankCardType2Activity.getContext();
                if (!CJPayBasicUtils.isNetworkAvailable(selectBankCardType2Activity)) {
                    SelectBankCardType2Activity selectBankCardType2Activity2 = this.this$0;
                    CJPayBasicUtils.displayToast(selectBankCardType2Activity2, selectBankCardType2Activity2.getResources().getString(2131558456));
                } else {
                    if (this.this$0.LJIJJ) {
                        SelectBankCardType2Activity selectBankCardType2Activity3 = this.this$0;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], selectBankCardType2Activity3, SelectBankCardType2Activity.LIZ, false, 35);
                        if (proxy.isSupported) {
                            c135401cAO = (C135401cAO) proxy.result;
                        } else {
                            c135401cAO = selectBankCardType2Activity3.LJIIZILJ;
                            if (c135401cAO == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("");
                            }
                        }
                        if (!c135401cAO.LIZ()) {
                            SelectBankCardType2Activity selectBankCardType2Activity4 = this.this$0;
                            CJPayBasicUtils.displayToast(selectBankCardType2Activity4, selectBankCardType2Activity4.getResources().getString(2131561885));
                        }
                    }
                    SelectBankCardType2Activity selectBankCardType2Activity5 = this.this$0;
                    if (!PatchProxy.proxy(new Object[0], selectBankCardType2Activity5, SelectBankCardType2Activity.LIZ, false, 43).isSupported) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("return_url", C0002O.m25086C("https://onekeysigncard/cardbind/quickbind/notify?afterQuickbind=", CJPayQuickBindCardUtils.LIZLLL(CJPayHostInfo.aid)));
                        String str2 = selectBankCardType2Activity5.quickBindData.bankCode;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        linkedHashMap.put("bank_code", str2);
                        if (Intrinsics.areEqual(selectBankCardType2Activity5.quickBindData.cardType, CJPayBindCardType.ALL.mType)) {
                            str = selectBankCardType2Activity5.LJIJI;
                        } else {
                            str = selectBankCardType2Activity5.quickBindData.cardType;
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
                        String LIZIZ = selectBankCardType2Activity5.LIZIZ();
                        if (LIZIZ != null && LIZIZ.length() > 0) {
                            linkedHashMap.put("exts", LIZIZ);
                        }
                        if (selectBankCardType2Activity5.quickBindData.isBindCardThenPay()) {
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
                        selectBankCardType2Activity5.showProgressLoading();
                        C2231c c2231c = (C2231c) selectBankCardType2Activity5.mBasePresenter;
                        if (c2231c != null && !PatchProxy.proxy(new Object[]{linkedHashMap}, c2231c, C2231c.f25479LJ, false, 2).isSupported) {
                            C106862S5w.LIZ(linkedHashMap);
                            c2231c.LIZ(linkedHashMap, "");
                        }
                    }
                }
            } else {
                CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean = this.this$0.LJIJ;
                if (cJPayNameAndIdentifyCodeBillBean != null) {
                    C135996cJz.LIZ().LIZ("/quickbind/TwoElementAuth2Activity").LIZ("quick_bind_data", this.this$0.quickBindData).LIZ("selectedCardType", this.this$0.LJIJI).LIZ("two_element_order_data", cJPayNameAndIdentifyCodeBillBean).LIZ(AnimationType.SlideLeftAndRigth).LIZ(this.this$0);
                }
            }
            C2235c c2235c = this.this$0.mvpLogger;
            if (c2235c != null) {
                String str3 = this.this$0.quickBindData.bankName;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                String str4 = this.this$0.LJIJI;
                String str5 = this.this$0.quickBindData.cardType;
                Intrinsics.checkNotNullExpressionValue(str5, "");
                c2235c.LIZ(str3, str4, str5, "activity_info", this.this$0.LJIJI);
            }
            FWT.LIZ("caijing_risk_fast_sign_request");
        }
        return Unit.INSTANCE;
    }
}
