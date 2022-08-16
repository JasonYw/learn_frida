package cn.ever.cloud.sdk.api;

import androidx.core.view.MotionEventCompat;
import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.sdk.entity.EcAsset;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC521156iT;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.api.AssetApi$getAssetInfo$2", m135f = "AssetApi.kt", m134i = {}, m133l = {MotionEventCompat.AXIS_GENERIC_7}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AssetApi$getAssetInfo$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends EcAsset>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $assetIds;
    public int label;
    public final /* synthetic */ AssetApi this$0;

    static {
        Covode.recordClassIndex(3346);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetApi$getAssetInfo$2(AssetApi assetApi, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = assetApi;
        this.$assetIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AssetApi$getAssetInfo$2(this.this$0, this.$assetIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super List<? extends EcAsset>> continuation) {
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
            AbstractC521156iT assetApi = this.this$0.component.assetApi();
            List<String> list = this.$assetIds;
            this.label = 1;
            obj = assetApi.getAssetInfo(list, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        Iterable<Asset> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (Asset asset : iterable) {
            arrayList.add(MapperKt.toEcAsset(asset));
        }
        return arrayList;
    }
}
