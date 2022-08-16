package cn.ever.cloud.sdk.api;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.android.entity.AssetQuery;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.sdk.entity.EcAsset;
import cn.ever.cloud.sdk.entity.EcPageData;
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
import p003X.AbstractC521156iT;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.api.AssetApi$getAssets$2", m135f = "AssetApi.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_DISTANCE}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AssetApi$getAssets$2 extends SuspendLambda implements Function1<Continuation<? super EcPageData<EcAsset>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AssetQuery $assetQuery;
    public int label;
    public final /* synthetic */ AssetApi this$0;

    static {
        Covode.recordClassIndex(3347);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetApi$getAssets$2(AssetApi assetApi, AssetQuery assetQuery, Continuation continuation) {
        super(1, continuation);
        this.this$0 = assetApi;
        this.$assetQuery = assetQuery;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AssetApi$getAssets$2(this.this$0, this.$assetQuery, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super EcPageData<EcAsset>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* renamed from: cn.ever.cloud.sdk.api.AssetApi$getAssets$2$1 */
    /* loaded from: classes23.dex */
    public static final class C07451 extends Lambda implements Function1<Asset, EcAsset> {
        public static final C07451 INSTANCE = new C07451();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3348);
        }

        public C07451() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final EcAsset invoke(Asset asset) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{asset}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EcAsset) proxy.result;
            }
            C106862S5w.LIZ(asset);
            return MapperKt.toEcAsset(asset);
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
            AbstractC521156iT assetApi = this.this$0.component.assetApi();
            AssetQuery assetQuery = this.$assetQuery;
            this.label = 1;
            obj = assetApi.getAssets(assetQuery, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return MapperKt.toEcPageData((PageData) obj, C07451.INSTANCE);
    }
}
