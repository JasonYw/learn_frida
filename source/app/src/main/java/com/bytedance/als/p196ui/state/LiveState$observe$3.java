package com.bytedance.als.p196ui.state;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C526446r0;

/* renamed from: com.bytedance.als.ui.state.LiveState$observe$3 */
/* loaded from: classes23.dex */
public final class LiveState$observe$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $callback;
    public final /* synthetic */ C526446r0 this$0;

    static {
        Covode.recordClassIndex(10089);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveState$observe$3(C526446r0 c526446r0, Function1 function1) {
        super(0);
        this.this$0 = c526446r0;
        this.$callback = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(this.$callback);
        }
        return Unit.INSTANCE;
    }
}
