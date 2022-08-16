package cn.ever.cloud.android.services;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.Asset;
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
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.AlbumService$getAlbum$2$1", m135f = "AlbumService.kt", m134i = {}, m133l = {111}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AlbumService$getAlbum$$inlined$apply$lambda$1 extends SuspendLambda implements Function2<Long, Continuation<? super Asset>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Continuation $continuation$inlined;
    public final /* synthetic */ Album $this_apply;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AlbumService this$0;

    static {
        Covode.recordClassIndex(2974);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumService$getAlbum$$inlined$apply$lambda$1(Album album, Continuation continuation, AlbumService albumService, Continuation continuation2) {
        super(2, continuation);
        this.$this_apply = album;
        this.this$0 = albumService;
        this.$continuation$inlined = continuation2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        AlbumService$getAlbum$$inlined$apply$lambda$1 albumService$getAlbum$$inlined$apply$lambda$1 = new AlbumService$getAlbum$$inlined$apply$lambda$1(this.$this_apply, continuation, this.this$0, this.$continuation$inlined);
        albumService$getAlbum$$inlined$apply$lambda$1.L$0 = obj;
        return albumService$getAlbum$$inlined$apply$lambda$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Long l, Continuation<? super Asset> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l, continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(l, continuation)).invokeSuspend(Unit.INSTANCE);
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
            AlbumService albumService = this.this$0;
            long albumId = this.$this_apply.getAlbumId();
            this.label = 1;
            obj = albumService.getAssetByLink(albumId, (Long) this.L$0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
