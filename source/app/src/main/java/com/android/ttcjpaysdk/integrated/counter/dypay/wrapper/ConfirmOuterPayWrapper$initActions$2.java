package com.android.ttcjpaysdk.integrated.counter.dypay.wrapper;

import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137374cgE;
import p003X.C106862S5w;
import p003X.C137151ccd;

/* loaded from: classes17.dex */
public final class ConfirmOuterPayWrapper$initActions$2 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C137151ccd this$0;

    static {
        Covode.recordClassIndex(7684);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmOuterPayWrapper$initActions$2(C137151ccd c137151ccd) {
        super(1);
        this.this$0 = c137151ccd;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            AbstractC137374cgE abstractC137374cgE = this.this$0.f25504LJ;
            if (abstractC137374cgE != null) {
                abstractC137374cgE.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
