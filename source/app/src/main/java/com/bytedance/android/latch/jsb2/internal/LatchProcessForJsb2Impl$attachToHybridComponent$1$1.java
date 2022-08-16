package com.bytedance.android.latch.jsb2.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p003X.AbstractC137655ckl;
import p003X.PUE;

/* loaded from: classes7.dex */
public final /* synthetic */ class LatchProcessForJsb2Impl$attachToHybridComponent$1$1 extends FunctionReference implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13767);
    }

    public LatchProcessForJsb2Impl$attachToHybridComponent$1$1(PUE pue) {
        super(0, pue);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "onJsbCall";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (KDeclarationContainer) proxy.result : Reflection.getOrCreateKotlinClass(PUE.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "onJsbCall()V";
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((AbstractC137655ckl) this.receiver).LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
