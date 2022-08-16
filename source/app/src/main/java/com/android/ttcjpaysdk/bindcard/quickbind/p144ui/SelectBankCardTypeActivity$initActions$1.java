package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.base.view.LoadingButton;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2235c;
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

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SelectBankCardTypeActivity$initActions$1 */
/* loaded from: classes17.dex */
public final class SelectBankCardTypeActivity$initActions$1 extends Lambda implements Function1<LoadingButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SelectBankCardTypeActivity this$0;

    static {
        Covode.recordClassIndex(7264);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBankCardTypeActivity$initActions$1(SelectBankCardTypeActivity selectBankCardTypeActivity) {
        super(1);
        this.this$0 = selectBankCardTypeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LoadingButton loadingButton) {
        C135401cAO c135401cAO;
        if (!PatchProxy.proxy(new Object[]{loadingButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(loadingButton);
            SelectBankCardTypeActivity selectBankCardTypeActivity = this.this$0;
            selectBankCardTypeActivity.getContext();
            if (!CJPayBasicUtils.isNetworkAvailable(selectBankCardTypeActivity)) {
                SelectBankCardTypeActivity selectBankCardTypeActivity2 = this.this$0;
                CJPayBasicUtils.displayToast(selectBankCardTypeActivity2, selectBankCardTypeActivity2.getResources().getString(2131558456));
            } else {
                if (this.this$0.LJIL) {
                    SelectBankCardTypeActivity selectBankCardTypeActivity3 = this.this$0;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[0], selectBankCardTypeActivity3, SelectBankCardTypeActivity.LIZ, false, 37);
                    if (proxy.isSupported) {
                        c135401cAO = (C135401cAO) proxy.result;
                    } else {
                        c135401cAO = selectBankCardTypeActivity3.LJIJ;
                        if (c135401cAO == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                    }
                    if (!c135401cAO.LIZ()) {
                        SelectBankCardTypeActivity selectBankCardTypeActivity4 = this.this$0;
                        CJPayBasicUtils.displayToast(selectBankCardTypeActivity4, selectBankCardTypeActivity4.getResources().getString(2131561885));
                    }
                }
                this.this$0.LIZ();
                C2235c c2235c = this.this$0.mvpLogger;
                if (c2235c != null) {
                    String str = this.this$0.quickBindData.bankName;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    String str2 = this.this$0.LJIJJLI;
                    String str3 = this.this$0.quickBindData.cardType;
                    Intrinsics.checkNotNullExpressionValue(str3, "");
                    c2235c.LIZ(str, str2, str3, "activity_info", this.this$0.LJIJJLI);
                }
                FWT.LIZ("caijing_risk_fast_sign_request");
            }
        }
        return Unit.INSTANCE;
    }
}
