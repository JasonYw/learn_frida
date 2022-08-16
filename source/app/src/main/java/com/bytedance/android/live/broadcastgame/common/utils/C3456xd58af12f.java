package com.bytedance.android.live.broadcastgame.common.utils;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC520516hR;
import p003X.AbstractC87170KWm;
import p003X.C106862S5w;

@DebugMetadata(m136c = "com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideEffectGameStartUpMutexStrategy$1", m135f = "LiveOpenFeatureMutexHelper.kt", m134i = {}, m133l = {159}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideEffectGameStartUpMutexStrategy$1 */
/* loaded from: classes23.dex */
public final class C3456xd58af12f extends RestrictedSuspendLambda implements Function2<AbstractC520516hR<? super Function0<? extends Boolean>>, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public /* synthetic */ Object L$0;
    public int label;

    static {
        Covode.recordClassIndex(19665);
    }

    public C3456xd58af12f(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        C3456xd58af12f c3456xd58af12f = new C3456xd58af12f(continuation);
        c3456xd58af12f.L$0 = obj;
        return c3456xd58af12f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC520516hR<? super Function0<? extends Boolean>> abstractC520516hR, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC520516hR, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(abstractC520516hR, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideEffectGameStartUpMutexStrategy$1$1 */
    /* loaded from: classes23.dex */
    public static final class C34571 extends Lambda implements Function0<Boolean> {
        public static final C34571 INSTANCE = new C34571();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19666);
        }

        public C34571() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Boolean mo30099invoke() {
            boolean isPlayingGame;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                isPlayingGame = ((Boolean) proxy.result).booleanValue();
            } else {
                isPlayingGame = ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).isPlayingGame();
            }
            return Boolean.valueOf(isPlayingGame);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideEffectGameStartUpMutexStrategy$1$2 */
    /* loaded from: classes5.dex */
    public static final class C34582 extends Lambda implements Function0<Boolean> {
        public static final C34582 INSTANCE = new C34582();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19667);
        }

        public C34582() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Boolean mo30099invoke() {
            boolean LIZJ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                LIZJ = ((Boolean) proxy.result).booleanValue();
            } else {
                LIZJ = AbstractC87170KWm.LJI.LIZJ();
            }
            return Boolean.valueOf(LIZJ);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideEffectGameStartUpMutexStrategy$1$3 */
    /* loaded from: classes12.dex */
    public static final class C34593 extends Lambda implements Function0<Boolean> {
        public static final C34593 INSTANCE = new C34593();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19668);
        }

        public C34593() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Boolean mo30099invoke() {
            boolean isInDrawGuessGame;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                isInDrawGuessGame = ((Boolean) proxy.result).booleanValue();
            } else {
                IService service = ServiceManager.getService(IBroadcastService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                isInDrawGuessGame = ((IBroadcastService) service).isInDrawGuessGame();
            }
            return Boolean.valueOf(isInDrawGuessGame);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(C34571.INSTANCE, C34582.INSTANCE, C34593.INSTANCE);
            this.label = 1;
            if (((AbstractC520516hR) this.L$0).LIZ((Iterable) mutableListOf, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
