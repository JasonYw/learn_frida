package cn.ever.cloud.android.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.AssetService", m135f = "AssetService.kt", m134i = {0, 0, 0}, m133l = {219}, m132m = "getVideoInfo", m131n = {"this", "cloudIdsMap", "destination$iv$iv"}, m130s = {"L$0", "L$1", "L$2"})
/* loaded from: classes23.dex */
public final class AssetService$getVideoInfo$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AssetService this$0;

    static {
        Covode.recordClassIndex(2985);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetService$getVideoInfo$1(AssetService assetService, Continuation continuation) {
        super(continuation);
        this.this$0 = assetService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getVideoInfo(null, this);
    }
}
