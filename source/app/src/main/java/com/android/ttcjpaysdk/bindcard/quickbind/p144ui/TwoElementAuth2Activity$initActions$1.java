package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2232d;
import com.android.ttcjpaysdk.thirdparty.data.CJPayIdType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135401cAO;
import p003X.C135876cI3;
import p003X.FWT;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuth2Activity$initActions$1 */
/* loaded from: classes17.dex */
public final class TwoElementAuth2Activity$initActions$1 extends Lambda implements Function1<LoadingButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TwoElementAuth2Activity this$0;

    static {
        Covode.recordClassIndex(7288);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoElementAuth2Activity$initActions$1(TwoElementAuth2Activity twoElementAuth2Activity) {
        super(1);
        this.this$0 = twoElementAuth2Activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LoadingButton loadingButton) {
        C135401cAO c135401cAO;
        if (!PatchProxy.proxy(new Object[]{loadingButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(loadingButton);
            if (this.this$0.LJII) {
                TwoElementAuth2Activity twoElementAuth2Activity = this.this$0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], twoElementAuth2Activity, TwoElementAuth2Activity.LIZ, false, 3);
                if (proxy.isSupported) {
                    c135401cAO = (C135401cAO) proxy.result;
                } else {
                    c135401cAO = twoElementAuth2Activity.f25487LJ;
                    if (c135401cAO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                if (!c135401cAO.LIZ()) {
                    TwoElementAuth2Activity twoElementAuth2Activity2 = this.this$0;
                    CJPayBasicUtils.displayToast(twoElementAuth2Activity2, twoElementAuth2Activity2.getResources().getString(2131561885));
                }
            }
            this.this$0.LIZJ();
            if (CJPayBasicUtils.isNetworkAvailable(this.this$0)) {
                CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean = this.this$0.LJI;
                if (cJPayNameAndIdentifyCodeBillBean != null) {
                    String LJIIJJI = C135876cI3.LJIIJJI();
                    this.this$0.showProgressLoading();
                    C2232d c2232d = (C2232d) this.this$0.mBasePresenter;
                    if (c2232d != null) {
                        String str = cJPayNameAndIdentifyCodeBillBean.member_biz_order_no;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        String str2 = this.this$0.quickBindData.bankCode;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        String str3 = this.this$0.LJFF;
                        String obj = TwoElementAuth2Activity.LIZ(this.this$0).getText().toString();
                        String str4 = CJPayIdType.MAINLAND.label;
                        Intrinsics.checkNotNullExpressionValue(str4, "");
                        c2232d.LIZ(str, LJIIJJI, str2, str3, obj, str4, TwoElementAuth2Activity.LIZIZ(this.this$0).getText().toString(), C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo(), this.this$0.quickBindData.isBindCardThenPay());
                    }
                }
            } else {
                TwoElementAuth2Activity twoElementAuth2Activity3 = this.this$0;
                CJPayBasicUtils.displayToast(twoElementAuth2Activity3, twoElementAuth2Activity3.getResources().getString(2131558456));
            }
            FWT.LIZ("caijing_two_elements_validation");
        }
        return Unit.INSTANCE;
    }
}
