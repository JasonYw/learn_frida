package com.android.ttcjpaysdk.thirdparty.verify.view.wrapper;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136638cUL;
import p003X.AbstractC136650cUX;
import p003X.C106862S5w;
import p003X.C136603cTm;
import p003X.C136654cUb;

/* loaded from: classes17.dex */
public final class OneStepPayHalfScreenWrapper$initAction$3 extends Lambda implements Function1<TextView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136603cTm this$0;

    static {
        Covode.recordClassIndex(9088);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStepPayHalfScreenWrapper$initAction$3(C136603cTm c136603cTm) {
        super(1);
        this.this$0 = c136603cTm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        String str;
        C136654cUb LIZIZ;
        if (!PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView);
            AbstractC136650cUX abstractC136650cUX = this.this$0.LIZIZ;
            if (abstractC136650cUX != null) {
                AbstractC136638cUL abstractC136638cUL = this.this$0.LJI;
                if (abstractC136638cUL != null && (LIZIZ = abstractC136638cUL.LIZIZ()) != null) {
                    str = LIZIZ.choice_pwd_check_way;
                } else {
                    str = null;
                }
                abstractC136650cUX.LIZ(str);
            }
        }
        return Unit.INSTANCE;
    }
}
