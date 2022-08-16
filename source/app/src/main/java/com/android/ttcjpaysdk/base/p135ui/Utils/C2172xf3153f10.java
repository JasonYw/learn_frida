package com.android.ttcjpaysdk.base.p135ui.Utils;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135737cFo;
import p003X.C135740cFr;

/* renamed from: com.android.ttcjpaysdk.base.ui.Utils.ErrorDialogBuilder$ErrorDialogBuilderStageTwoImpl$enableActionJumpToCustomerService$1 */
/* loaded from: classes17.dex */
public final class C2172xf3153f10 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C135740cFr this$0;

    static {
        Covode.recordClassIndex(6607);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2172xf3153f10(C135740cFr c135740cFr) {
        super(1);
        this.this$0 = c135740cFr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C135737cFo.LIZIZ(this.this$0.f17954LJ, this.this$0.LJI);
        }
        return Unit.INSTANCE;
    }
}
