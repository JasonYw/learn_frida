package com.bytedance.android.live.broadcastgame.common.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import p003X.AbstractC520516hR;
import p003X.C106862S5w;

@DebugMetadata(m136c = "com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1", m135f = "LiveOpenFeatureMutexHelper.kt", m134i = {}, m133l = {}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class LiveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1 extends RestrictedSuspendLambda implements Function2<AbstractC520516hR<? super Function0<? extends Boolean>>, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public /* synthetic */ Object L$0;
    public int label;

    static {
        Covode.recordClassIndex(19661);
    }

    public LiveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        LiveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1 liveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1 = new LiveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1(continuation);
        liveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1.L$0 = obj;
        return liveOpenFeatureMutexHelper$checkIfExclude$mutexStrategies$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC520516hR<? super Function0<? extends Boolean>> abstractC520516hR, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC520516hR, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(abstractC520516hR, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
