package com.android.ttcjpaysdk.thirdparty.verify.view.wrapper;

import android.widget.CheckBox;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCircleCheckBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136650cUX;
import p003X.C106862S5w;
import p003X.C136601cTk;

/* loaded from: classes17.dex */
public final class CJPayOneStepPaymentDialogWrapper$initClick$2 extends Lambda implements Function1<CJPayCircleCheckBox, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136601cTk this$0;

    static {
        Covode.recordClassIndex(9084);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayOneStepPaymentDialogWrapper$initClick$2(C136601cTk c136601cTk) {
        super(1);
        this.this$0 = c136601cTk;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCircleCheckBox cJPayCircleCheckBox) {
        if (!PatchProxy.proxy(new Object[]{cJPayCircleCheckBox}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCircleCheckBox);
            CJPayCircleCheckBox cJPayCircleCheckBox2 = this.this$0.LIZLLL;
            CheckBox checkBox = this.this$0.LIZLLL.getCheckBox();
            Intrinsics.checkNotNullExpressionValue(checkBox, "");
            cJPayCircleCheckBox2.setChecked(true ^ checkBox.isChecked());
            AbstractC136650cUX abstractC136650cUX = this.this$0.LIZIZ;
            if (abstractC136650cUX != null) {
                CheckBox checkBox2 = this.this$0.LIZLLL.getCheckBox();
                Intrinsics.checkNotNullExpressionValue(checkBox2, "");
                abstractC136650cUX.LIZ(checkBox2.isChecked());
            }
        }
        return Unit.INSTANCE;
    }
}
