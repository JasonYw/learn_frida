package com.android.ttcjpaysdk.bindcard.unionpay.p148ui.wrapper;

import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC135684cEx;
import p003X.C106862S5w;
import p003X.C135682cEv;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.wrapper.UnionPayBindCardWrapper$initActions$4 */
/* loaded from: classes17.dex */
public final class UnionPayBindCardWrapper$initActions$4 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C135682cEv this$0;

    static {
        Covode.recordClassIndex(7380);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayBindCardWrapper$initActions$4(C135682cEv c135682cEv) {
        super(1);
        this.this$0 = c135682cEv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(cJPayCustomButton);
            this.this$0.LIZ(true);
            AbstractC135684cEx abstractC135684cEx = this.this$0.LJIJ;
            if (abstractC135684cEx != null) {
                abstractC135684cEx.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
