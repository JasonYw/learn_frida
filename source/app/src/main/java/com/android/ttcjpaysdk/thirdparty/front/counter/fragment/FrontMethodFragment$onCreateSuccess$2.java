package com.android.ttcjpaysdk.thirdparty.front.counter.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes17.dex */
public final class FrontMethodFragment$onCreateSuccess$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2376c this$0;

    static {
        Covode.recordClassIndex(8655);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrontMethodFragment$onCreateSuccess$2(C2376c c2376c) {
        super(0);
        this.this$0 = c2376c;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ(false);
        }
        return Unit.INSTANCE;
    }
}
