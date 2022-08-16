package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p146c.C2254b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.FWT;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayAuthActivity$initActions$2 */
/* loaded from: classes17.dex */
public final class UnionPayAuthActivity$initActions$2 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UnionPayAuthActivity this$0;

    static {
        Covode.recordClassIndex(7364);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayAuthActivity$initActions$2(UnionPayAuthActivity unionPayAuthActivity) {
        super(1);
        this.this$0 = unionPayAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        String str;
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            if (this.this$0.f25491LJ && !this.this$0.LIZLLL) {
                UnionPayAuthActivity unionPayAuthActivity = this.this$0;
                CJPayBasicUtils.displayToast(unionPayAuthActivity, unionPayAuthActivity.getResources().getString(2131561885));
            } else {
                FWT.LIZ("caijing_risk_bind_unionpay_request");
                this.this$0.LIZ(true);
                C2254b c2254b = (C2254b) this.this$0.mBasePresenter;
                if (c2254b != null) {
                    UnionPaySignInfo unionPaySignInfo = this.this$0.LJFF;
                    if (unionPaySignInfo != null) {
                        str = unionPaySignInfo.signOrderNo;
                    } else {
                        str = null;
                    }
                    c2254b.LIZ(str);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
