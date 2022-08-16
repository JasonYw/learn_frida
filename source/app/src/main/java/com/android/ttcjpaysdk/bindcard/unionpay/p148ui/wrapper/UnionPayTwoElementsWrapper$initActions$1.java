package com.android.ttcjpaysdk.bindcard.unionpay.p148ui.wrapper;

import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC135715cFS;
import p003X.C106862S5w;
import p003X.C135812cH1;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.wrapper.UnionPayTwoElementsWrapper$initActions$1 */
/* loaded from: classes17.dex */
public final class UnionPayTwoElementsWrapper$initActions$1 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C135812cH1 this$0;

    static {
        Covode.recordClassIndex(7381);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayTwoElementsWrapper$initActions$1(C135812cH1 c135812cH1) {
        super(1);
        this.this$0 = c135812cH1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            if (this.this$0.LJIILIIL && !this.this$0.LJIIL) {
                CJPayBasicUtils.displayToast(this.this$0.mContext, this.this$0.mContext.getString(2131561885));
            } else {
                this.this$0.LIZ().LJFF();
                this.this$0.LIZIZ().LJFF();
                AbstractC135715cFS abstractC135715cFS = this.this$0.LJIILJJIL;
                if (abstractC135715cFS != null) {
                    String LIZJ = this.this$0.LIZ().LIZJ();
                    Intrinsics.checkNotNullExpressionValue(LIZJ, "");
                    String LIZJ2 = this.this$0.LIZIZ().LIZJ();
                    Intrinsics.checkNotNullExpressionValue(LIZJ2, "");
                    abstractC135715cFS.LIZ(LIZJ, LIZJ2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
