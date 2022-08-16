package com.android.ttcjpaysdk.thirdparty.verify.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC136619cU2;
import p003X.C136608cTr;

/* loaded from: classes17.dex */
public final class VerifyOneStepPayFragment$processLoadingDelay$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isShow;
    public final /* synthetic */ C136608cTr this$0;

    static {
        Covode.recordClassIndex(8977);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyOneStepPayFragment$processLoadingDelay$1(C136608cTr c136608cTr, boolean z) {
        super(0);
        this.this$0 = c136608cTr;
        this.$isShow = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        AbstractC136619cU2 abstractC136619cU2;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (abstractC136619cU2 = this.this$0.LIZLLL) != null) {
            abstractC136619cU2.LIZ(this.$isShow);
        }
        return Unit.INSTANCE;
    }
}
