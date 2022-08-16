package com.bytedance.android.latch.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p003X.AbstractC137655ckl;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final /* synthetic */ class BaseLatchProcess$createJsWorker$3$1 extends FunctionReference implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13699);
    }

    public BaseLatchProcess$createJsWorker$3$1(AbstractC137655ckl abstractC137655ckl) {
        super(1, abstractC137655ckl);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "handleMessage";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (KDeclarationContainer) proxy.result : Reflection.getOrCreateKotlinClass(AbstractC137655ckl.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "handleMessage(Ljava/lang/String;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            ((AbstractC137655ckl) this.receiver).LIZIZ(str2);
        }
        return Unit.INSTANCE;
    }
}
