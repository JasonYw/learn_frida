package com.android.ttcjpaysdk.facelive.view;

import android.content.Context;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC135369c9s;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C135522cCL;
import p003X.DialogC135370c9t;

/* loaded from: classes17.dex */
public final class CJPayFaceProtocolDialog$initAction$2 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC135370c9t this$0;

    static {
        Covode.recordClassIndex(7428);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFaceProtocolDialog$initAction$2(DialogC135370c9t dialogC135370c9t) {
        super(1);
        this.this$0 = dialogC135370c9t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            if (this.this$0.LJI && !this.this$0.f17916LJ) {
                Context context = this.this$0.getContext();
                Context context2 = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                CJPayBasicUtils.displayToast(context, context2.getResources().getString(2131561885));
                C135522cCL.LIZLLL.LIZ(this.this$0.getContext(), "wallet_alivecheck_firstasignment_guide_next_click", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("agreement_state", "0")));
            } else {
                C116971W2r.LIZ(this.this$0);
                AbstractC135369c9s abstractC135369c9s = this.this$0.LJFF;
                if (abstractC135369c9s != null) {
                    abstractC135369c9s.LIZIZ();
                }
                C135522cCL.LIZLLL.LIZ(this.this$0.getContext(), "wallet_alivecheck_firstasignment_guide_next_click", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("agreement_state", "1")));
            }
        }
        return Unit.INSTANCE;
    }
}
