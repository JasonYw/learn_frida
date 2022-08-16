package cn.ever.cloud.sdk.api;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.android.entity.PageParams;
import cn.ever.cloud.sdk.entity.EcAlbum;
import cn.ever.cloud.sdk.entity.EcPageData;
import cn.ever.cloud.sdk.entity.EcPageParams;
import cn.ever.cloud.sdk.mapper.MapperKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.api.AlbumApi$getAlbums$2", m135f = "AlbumApi.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_12}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AlbumApi$getAlbums$2 extends SuspendLambda implements Function1<Continuation<? super EcPageData<EcAlbum>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ EcPageParams $ecPageParams;
    public int label;
    public final /* synthetic */ AlbumApi this$0;

    static {
        Covode.recordClassIndex(3339);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumApi$getAlbums$2(AlbumApi albumApi, EcPageParams ecPageParams, Continuation continuation) {
        super(1, continuation);
        this.this$0 = albumApi;
        this.$ecPageParams = ecPageParams;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AlbumApi$getAlbums$2(this.this$0, this.$ecPageParams, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super EcPageData<EcAlbum>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: cn.ever.cloud.sdk.api.AlbumApi$getAlbums$2$1 */
    /* loaded from: classes23.dex */
    public static final class C07441 extends Lambda implements Function1<Album, EcAlbum> {
        public static final C07441 INSTANCE = new C07441();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3340);
        }

        public C07441() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final EcAlbum invoke(Album album) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{album}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EcAlbum) proxy.result;
            }
            C106862S5w.LIZ(album);
            return MapperKt.toEcAlbum(album);
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
            cn.ever.cloud.android.api.AlbumApi albumApi = this.this$0.component.albumApi();
            PageParams pageParams = MapperKt.toPageParams(this.$ecPageParams);
            this.label = 1;
            obj = albumApi.getAlbums(pageParams, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return MapperKt.toEcPageData((PageData) obj, C07441.INSTANCE);
    }
}
