package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.entity.Asset;
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

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.AssetApiImpl$getAssetInfo$2", m135f = "AssetApiImpl.kt", m134i = {}, m133l = {}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AssetApiImpl$getAssetInfo$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends Asset>>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $assetIds;
    public int label;
    public final /* synthetic */ AssetApiImpl this$0;

    static {
        Covode.recordClassIndex(2776);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetApiImpl$getAssetInfo$2(AssetApiImpl assetApiImpl, List list, Continuation continuation) {
        super(1, continuation);
        this.this$0 = assetApiImpl;
        this.$assetIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AssetApiImpl$getAssetInfo$2(this.this$0, this.$assetIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super List<? extends Asset>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            return this.this$0.client.getAssetInfo(this.$assetIds);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
