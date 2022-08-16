package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.services.AlbumService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.AlbumApiImpl$addAssets$2", m135f = "AlbumApiImpl.kt", m134i = {}, m133l = {81}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AlbumApiImpl$addAssets$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends String>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $albumId;
    public final /* synthetic */ List $medias;
    public int label;
    public final /* synthetic */ AlbumApiImpl this$0;

    static {
        Covode.recordClassIndex(2760);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumApiImpl$addAssets$2(AlbumApiImpl albumApiImpl, List list, long j, Continuation continuation) {
        super(1, continuation);
        this.this$0 = albumApiImpl;
        this.$medias = list;
        this.$albumId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AlbumApiImpl$addAssets$2(this.this$0, this.$medias, this.$albumId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super List<? extends String>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            List<String> importUpsertChangeMedias = this.this$0.assetService.importUpsertChangeMedias(this.$medias);
            AlbumService albumService = this.this$0.albumService;
            long j = this.$albumId;
            this.label = 1;
            obj = albumService.addAssets(j, importUpsertChangeMedias, false, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}