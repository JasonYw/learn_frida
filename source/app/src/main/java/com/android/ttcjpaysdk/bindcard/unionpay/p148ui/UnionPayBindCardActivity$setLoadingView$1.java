package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C135682cEv;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayBindCardActivity$setLoadingView$1 */
/* loaded from: classes17.dex */
public final class UnionPayBindCardActivity$setLoadingView$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UnionPayBindCardActivity this$0;

    static {
        Covode.recordClassIndex(7370);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayBindCardActivity$setLoadingView$1(UnionPayBindCardActivity unionPayBindCardActivity) {
        super(0);
        this.this$0 = unionPayBindCardActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C135682cEv c135682cEv;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (c135682cEv = this.this$0.LIZIZ) != null) {
            c135682cEv.LIZ(false);
        }
        return Unit.INSTANCE;
    }
}
