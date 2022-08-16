package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNameAndIdentifyCodeBillBean;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.p143a.C2233e;
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
import p003X.FWT;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuthActivity$initActions$1 */
/* loaded from: classes17.dex */
public final class TwoElementAuthActivity$initActions$1 extends Lambda implements Function1<LoadingButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TwoElementAuthActivity this$0;

    static {
        Covode.recordClassIndex(7301);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoElementAuthActivity$initActions$1(TwoElementAuthActivity twoElementAuthActivity) {
        super(1);
        this.this$0 = twoElementAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LoadingButton loadingButton) {
        C135401cAO c135401cAO;
        if (!PatchProxy.proxy(new Object[]{loadingButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(loadingButton);
            if (this.this$0.LJIIL) {
                TwoElementAuthActivity twoElementAuthActivity = this.this$0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], twoElementAuthActivity, TwoElementAuthActivity.LIZ, false, 3);
                if (proxy.isSupported) {
                    c135401cAO = (C135401cAO) proxy.result;
                } else {
                    c135401cAO = twoElementAuthActivity.f25488LJ;
                    if (c135401cAO == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                if (!c135401cAO.LIZ()) {
                    TwoElementAuthActivity twoElementAuthActivity2 = this.this$0;
                    CJPayBasicUtils.displayToast(twoElementAuthActivity2, twoElementAuthActivity2.getResources().getString(2131561885));
                }
            }
            this.this$0.LIZLLL();
            if (CJPayBasicUtils.isNetworkAvailable(this.this$0)) {
                CJPayNameAndIdentifyCodeBillBean cJPayNameAndIdentifyCodeBillBean = this.this$0.LJIIIZ;
                if (cJPayNameAndIdentifyCodeBillBean != null) {
                    this.this$0.LIZJ();
                    C2233e c2233e = (C2233e) this.this$0.mBasePresenter;
                    if (c2233e != null) {
                        String str = cJPayNameAndIdentifyCodeBillBean.member_biz_order_no;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        String obj = TwoElementAuthActivity.LIZ(this.this$0).getText().toString();
                        String str2 = CJPayIdType.MAINLAND.label;
                        Intrinsics.checkNotNullExpressionValue(str2, "");
                        c2233e.LIZ(str, obj, str2, TwoElementAuthActivity.LIZIZ(this.this$0).getText().toString());
                    }
                }
            } else {
                TwoElementAuthActivity twoElementAuthActivity3 = this.this$0;
                CJPayBasicUtils.displayToast(twoElementAuthActivity3, twoElementAuthActivity3.getResources().getString(2131558456));
            }
            FWT.LIZ("caijing_two_elements_validation");
        }
        return Unit.INSTANCE;
    }
}
