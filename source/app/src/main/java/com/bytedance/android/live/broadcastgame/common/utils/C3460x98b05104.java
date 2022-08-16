package com.bytedance.android.live.broadcastgame.common.utils;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
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
import p003X.C106862S5w;

@DebugMetadata(m136c = "com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideOpenFeatureStartUpMutexStrategy$1", m135f = "LiveOpenFeatureMutexHelper.kt", m134i = {}, m133l = {203}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideOpenFeatureStartUpMutexStrategy$1 */
/* loaded from: classes23.dex */
public final class C3460x98b05104 extends RestrictedSuspendLambda implements Function2<AbstractC520516hR<? super Function0<? extends Boolean>>, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3384q $gameItem;
    public /* synthetic */ Object L$0;
    public int label;

    static {
        Covode.recordClassIndex(19669);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3460x98b05104(C3384q c3384q, Continuation continuation) {
        super(2, continuation);
        this.$gameItem = c3384q;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        C3460x98b05104 c3460x98b05104 = new C3460x98b05104(this.$gameItem, continuation);
        c3460x98b05104.L$0 = obj;
        return c3460x98b05104;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC520516hR<? super Function0<? extends Boolean>> abstractC520516hR, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC520516hR, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(abstractC520516hR, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideOpenFeatureStartUpMutexStrategy$1$1 */
    /* loaded from: classes23.dex */
    public static final class C34611 extends Lambda implements Function0<Boolean> {
        public static final C34611 INSTANCE = new C34611();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19670);
        }

        public C34611() {
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

    /* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideOpenFeatureStartUpMutexStrategy$1$3 */
    /* loaded from: classes12.dex */
    public static final class C34633 extends Lambda implements Function0<Boolean> {
        public static final C34633 INSTANCE = new C34633();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19672);
        }

        public C34633() {
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

    /* renamed from: com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideOpenFeatureStartUpMutexStrategy$1$2 */
    /* loaded from: classes5.dex */
    public static final class C34622 extends Lambda implements Function0<Boolean> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19671);
        }

        public C34622() {
            super(0);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
            if (r1.LIZ(r0) == false) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
            r2 = true;
         */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ java.lang.Boolean mo30099invoke() {
            /*
                r6 = this;
                r2 = 0
                java.lang.Object[] r1 = new java.lang.Object[r2]
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcastgame.common.utils.C3460x98b05104.C34622.changeQuickRedirect
                r3 = 1
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r2, r3)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L1b
                java.lang.Object r0 = r1.result
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r2 = r0.booleanValue()
            L16:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                return r0
            L1b:
                X.KWs r5 = p003X.C87176KWs.LIZIZ
                com.bytedance.android.live.broadcastgame.common.utils.LiveOpenFeatureMutexHelper$provideOpenFeatureStartUpMutexStrategy$1 r0 = com.bytedance.android.live.broadcastgame.common.utils.C3460x98b05104.this
                com.bytedance.android.live.broadcastgame.api.model.q r4 = r0.$gameItem
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r4
                com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C87176KWs.LIZ
                r0 = 10
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r5, r1, r2, r0)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L3a
                java.lang.Object r0 = r1.result
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r2 = r0.booleanValue()
                goto L16
            L3a:
                boolean r0 = p003X.AnonymousClass325.LIZ()
                java.lang.String r3 = ""
                if (r0 != 0) goto L5f
                X.KWl r0 = p003X.AbstractC87170KWm.LJI
                boolean r0 = r0.LIZJ()
                if (r0 == 0) goto L16
                X.KWl r1 = p003X.AbstractC87170KWm.LJI
                com.bytedance.android.live.broadcastgame.api.model.p r0 = r4.LJFF()
                if (r0 == 0) goto L56
                java.lang.String r0 = r0.LJLIIIL
                if (r0 != 0) goto L57
            L56:
                r0 = r3
            L57:
                boolean r0 = r1.LIZ(r0)
                if (r0 != 0) goto L16
            L5d:
                r2 = 1
                goto L16
            L5f:
                X.KWl r0 = p003X.AbstractC87170KWm.LJI
                boolean r0 = r0.LIZJ()
                if (r0 == 0) goto L16
                X.KWl r1 = p003X.AbstractC87170KWm.LJI
                com.bytedance.android.live.broadcastgame.api.model.p r0 = r4.LJFF()
                if (r0 == 0) goto L74
                java.lang.String r0 = r0.LJLIIIL
                if (r0 == 0) goto L74
                r3 = r0
            L74:
                boolean r0 = r1.LIZ(r3)
                if (r0 != 0) goto L16
                int r1 = r4.f26027LJ
                com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.OpenGame
                int r0 = r0.value
                if (r1 == r0) goto La0
                com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.SonicMiniGame
                int r0 = r0.value
                if (r1 == r0) goto La0
                com.bytedance.android.live.broadcastgame.api.model.InteractID r0 = com.bytedance.android.live.broadcastgame.api.model.InteractID.OpenMicroApp
                int r0 = r0.value
                if (r1 != r0) goto L5d
                X.KWl r0 = p003X.AbstractC87170KWm.LJI
                boolean r0 = r0.LIZLLL()
                if (r0 != 0) goto L16
                X.KWl r0 = p003X.AbstractC87170KWm.LJI
                boolean r0 = r0.LJFF()
                if (r0 == 0) goto L5d
                goto L16
            La0:
                X.KWl r0 = p003X.AbstractC87170KWm.LJI
                boolean r0 = r0.m23476LJ()
                if (r0 == 0) goto L5d
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.common.utils.C3460x98b05104.C34622.mo30099invoke():java.lang.Object");
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
            List mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(C34611.INSTANCE, new C34622(), C34633.INSTANCE);
            this.label = 1;
            if (((AbstractC520516hR) this.L$0).LIZ((Iterable) mutableListOf, (Continuation<? super Unit>) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
