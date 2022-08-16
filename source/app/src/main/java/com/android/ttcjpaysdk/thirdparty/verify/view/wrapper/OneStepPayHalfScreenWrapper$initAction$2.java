package com.android.ttcjpaysdk.thirdparty.verify.view.wrapper;

import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136650cUX;
import p003X.C106862S5w;
import p003X.C136603cTm;

/* loaded from: classes17.dex */
public final class OneStepPayHalfScreenWrapper$initAction$2 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136603cTm this$0;

    static {
        Covode.recordClassIndex(9087);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStepPayHalfScreenWrapper$initAction$2(C136603cTm c136603cTm) {
        super(1);
        this.this$0 = c136603cTm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            AbstractC136650cUX abstractC136650cUX = this.this$0.LIZIZ;
            if (abstractC136650cUX != null) {
                abstractC136650cUX.LIZIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
