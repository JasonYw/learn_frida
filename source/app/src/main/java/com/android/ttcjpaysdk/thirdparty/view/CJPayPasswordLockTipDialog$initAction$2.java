package com.android.ttcjpaysdk.thirdparty.view;

import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136686cV7;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC136685cV6;

/* loaded from: classes17.dex */
public final class CJPayPasswordLockTipDialog$initAction$2 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC136685cV6 this$0;

    static {
        Covode.recordClassIndex(9228);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayPasswordLockTipDialog$initAction$2(DialogC136685cV6 dialogC136685cV6) {
        super(1);
        this.this$0 = dialogC136685cV6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            C116971W2r.LIZ(this.this$0);
            AbstractC136686cV7 abstractC136686cV7 = this.this$0.LIZIZ;
            if (abstractC136686cV7 != null) {
                abstractC136686cV7.LIZIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
