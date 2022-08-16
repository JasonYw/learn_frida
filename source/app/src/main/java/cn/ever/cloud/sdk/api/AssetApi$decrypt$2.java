package cn.ever.cloud.sdk.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.AbstractC521156iT;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.api.AssetApi$decrypt$2", m135f = "AssetApi.kt", m134i = {}, m133l = {LegoCommitOptExperiment.ALL}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class AssetApi$decrypt$2 extends SuspendLambda implements Function1<Continuation<? super byte[]>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $assetId;
    public final /* synthetic */ byte[] $data;
    public int label;
    public final /* synthetic */ AssetApi this$0;

    static {
        Covode.recordClassIndex(3345);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetApi$decrypt$2(AssetApi assetApi, String str, byte[] bArr, Continuation continuation) {
        super(1, continuation);
        this.this$0 = assetApi;
        this.$assetId = str;
        this.$data = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new AssetApi$decrypt$2(this.this$0, this.$assetId, this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super byte[]> continuation) {
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
            String str = this.$assetId;
            byte[] bArr = this.$data;
            this.label = 1;
            obj = assetApi.decrypt(str, bArr, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return obj;
    }
}
