package com.android.ttcjpaysdk.thirdparty.verify.view.wrapper;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136650cUX;
import p003X.C106862S5w;
import p003X.C136610cTt;

/* loaded from: classes17.dex */
public final class CJPayOneStepPaymentDialogNewWrapper$initClick$1 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C136610cTt this$0;

    static {
        Covode.recordClassIndex(9081);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayOneStepPaymentDialogNewWrapper$initClick$1(C136610cTt c136610cTt) {
        super(1);
        this.this$0 = c136610cTt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView);
            AbstractC136650cUX abstractC136650cUX = this.this$0.LIZIZ;
            if (abstractC136650cUX != null) {
                abstractC136650cUX.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
