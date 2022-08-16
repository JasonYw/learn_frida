package cn.ever.cloud.android.entity;

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
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class Album$cover$2 extends Lambda implements Function0<Asset> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Album this$0;

    static {
        Covode.recordClassIndex(2846);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Album$cover$2(Album album) {
        super(0);
        this.this$0 = album;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Asset mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Asset) proxy.result;
        }
        return (Asset) BuildersKt.runBlocking$default(null, new C07081(null), 1, null);
    }

    @DebugMetadata(m136c = "cn.ever.cloud.android.entity.Album$cover$2$1", m135f = "Album.kt", m134i = {}, m133l = {21}, m132m = "invokeSuspend", m131n = {}, m130s = {})
    /* renamed from: cn.ever.cloud.android.entity.Album$cover$2$1 */
    /* loaded from: classes23.dex */
    public static final class C07081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Asset>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int label;

        static {
            Covode.recordClassIndex(2847);
        }

        public C07081(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (Continuation) proxy.result;
            }
            C106862S5w.LIZ(continuation);
            return new C07081(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Asset> continuation) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{coroutineScope, continuation}, this, changeQuickRedirect, false, 3);
            return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Function2<Long, Continuation<? super Asset>, Object> getCoverClosure = Album$cover$2.this.this$0.getGetCoverClosure();
                Long coverLink = Album$cover$2.this.this$0.getCoverLink();
                this.label = 1;
                obj = getCoverClosure.invoke(coverLink, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return obj;
        }
    }
}
