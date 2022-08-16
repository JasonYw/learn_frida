package com.bytedance.android.annie.container.fragment;

import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class AnnieFragment$bindRetryEvent$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2606a this$0;

    static {
        Covode.recordClassIndex(10746);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieFragment$bindRetryEvent$1(C2606a c2606a) {
        super(0);
        this.this$0 = c2606a;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        IHybridComponent mAnnieCard;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (mAnnieCard = this.this$0.getMAnnieCard()) != null) {
            IHybridComponent.DefaultImpls.load$default(mAnnieCard, null, null, 3, null);
        }
        return Unit.INSTANCE;
    }
}
