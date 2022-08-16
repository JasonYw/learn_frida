package com.android.ttcjpaysdk.thirdparty.verify.view.wrapper;

import android.widget.CheckBox;
import android.widget.LinearLayout;
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
import p003X.C136603cTm;

/* loaded from: classes17.dex */
public final class OneStepPayHalfScreenWrapper$initAction$4 extends Lambda implements Function1<LinearLayout, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136603cTm this$0;

    static {
        Covode.recordClassIndex(9089);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStepPayHalfScreenWrapper$initAction$4(C136603cTm c136603cTm) {
        super(1);
        this.this$0 = c136603cTm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LinearLayout linearLayout) {
        if (!PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(linearLayout);
            CJPayCircleCheckBox cJPayCircleCheckBox = this.this$0.LIZLLL;
            CheckBox checkBox = this.this$0.LIZLLL.getCheckBox();
            Intrinsics.checkNotNullExpressionValue(checkBox, "");
            cJPayCircleCheckBox.setChecked(true ^ checkBox.isChecked());
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
