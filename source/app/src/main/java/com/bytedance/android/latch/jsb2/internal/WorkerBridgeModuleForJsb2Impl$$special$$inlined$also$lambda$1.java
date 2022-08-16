package com.bytedance.android.latch.jsb2.internal;

import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class WorkerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1 extends Lambda implements Function0<Unit> {
    public final /* synthetic */ WorkerBridgeModuleForJsb2Impl this$0;

    static {
        Covode.recordClassIndex(13769);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerBridgeModuleForJsb2Impl$$special$$inlined$also$lambda$1(WorkerBridgeModuleForJsb2Impl workerBridgeModuleForJsb2Impl) {
        super(0);
        this.this$0 = workerBridgeModuleForJsb2Impl;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Unit mo30099invoke() {
        this.this$0.jsFunctionReturned = true;
        return Unit.INSTANCE;
    }
}
