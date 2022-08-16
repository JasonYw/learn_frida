package com.bytedance.android.latch.jsb2.internal;

import com.bytedance.android.latch.internal.util.LatchException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p003X.C106862S5w;
import p003X.C137663ckt;
import p003X.C73879FBh;

/* loaded from: classes17.dex */
public final /* synthetic */ class AttachComponentMethod$invoke$2 extends FunctionReference implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13766);
    }

    public AttachComponentMethod$invoke$2(C137663ckt c137663ckt) {
        super(1, c137663ckt);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "handleError";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (KDeclarationContainer) proxy.result : Reflection.getOrCreateKotlinClass(C137663ckt.class);
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "handleError(Ljava/lang/Throwable;)V";
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            C137663ckt c137663ckt = (C137663ckt) this.receiver;
            if (!PatchProxy.proxy(new Object[]{th2}, c137663ckt, C137663ckt.LIZ, false, 3).isSupported) {
                LatchException LIZ = LatchException.Companion.LIZ(th2);
                c137663ckt.finishWithResult(C73879FBh.LIZ(TuplesKt.m137to("message", LIZ.getMessage()), TuplesKt.m137to("latch_code", Integer.valueOf(LIZ.code))));
                c137663ckt.LIZJ.mo30099invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
