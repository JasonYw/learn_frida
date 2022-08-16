package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import android.widget.TextView;
import com.android.ttcjpaysdk.base.router.AnimationType;
import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2235c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135876cI3;
import p003X.C135996cJz;
import p003X.C136011cKE;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.SelectBankCardType2Activity$initActions$$inlined$let$lambda$1 */
/* loaded from: classes17.dex */
public final class SelectBankCardType2Activity$initActions$$inlined$let$lambda$1 extends Lambda implements Function1<TextView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TextView $jumpCardBinTv$inlined;
    public final /* synthetic */ SelectBankCardType2Activity this$0;

    static {
        Covode.recordClassIndex(7257);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectBankCardType2Activity$initActions$$inlined$let$lambda$1(TextView textView, SelectBankCardType2Activity selectBankCardType2Activity) {
        super(1);
        this.$jumpCardBinTv$inlined = textView;
        this.this$0 = selectBankCardType2Activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        if (!PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView);
            C136011cKE LIZ = C135996cJz.LIZ().LIZ("/normalbind/CJPayCardBinActivity").LIZ("param_bind_card_info", C135876cI3.f17973LJ.LJIILIIL().getBindCardInfo()).LIZ(AnimationType.SlideLeftAndRigth);
            if (C135876cI3.f17973LJ.LJIILIIL().isIndependentBindCard()) {
                LIZ.LIZ("param_is_independent_bind_card", true);
            }
            LIZ.LIZ(this.this$0);
            C2235c c2235c = this.this$0.mvpLogger;
            if (c2235c != null) {
                String str = this.this$0.quickBindData.cardType;
                Intrinsics.checkNotNullExpressionValue(str, "");
                c2235c.LIZIZ(str);
            }
        }
        return Unit.INSTANCE;
    }
}
