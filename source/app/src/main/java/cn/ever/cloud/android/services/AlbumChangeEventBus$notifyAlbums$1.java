package cn.ever.cloud.android.services;

import cn.ever.cloud.android.entity.AlbumChange;
import cn.ever.cloud.utils.LogHelper;
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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.AlbumChangeEventBus$notifyAlbums$1", m135f = "AlbumChangeEventBus.kt", m134i = {}, m133l = {26}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AlbumChangeEventBus$notifyAlbums$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AlbumChange $change;
    public int label;
    public final /* synthetic */ AlbumChangeEventBus this$0;

    static {
        Covode.recordClassIndex(2962);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumChangeEventBus$notifyAlbums$1(AlbumChangeEventBus albumChangeEventBus, AlbumChange albumChange, Continuation continuation) {
        super(2, continuation);
        this.this$0 = albumChangeEventBus;
        this.$change = albumChange;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AlbumChangeEventBus$notifyAlbums$1(this.this$0, this.$change, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
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
            MutableSharedFlow<AlbumChange> mutableSharedFlow = this.this$0.albumChangeEvent;
            AlbumChange albumChange = this.$change;
            this.label = 1;
            if (mutableSharedFlow.emit(albumChange, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("AlbumChangeEventBus", "notify albums -> upsert: " + this.$change.getUpsert().size() + ", deleted: " + this.$change.getDeleted().size());
        return Unit.INSTANCE;
    }
}
