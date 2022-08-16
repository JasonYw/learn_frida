package cn.ever.cloud.network_impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.network_impl.api.ApiClientImpl", m135f = "ApiClientImpl.kt", m134i = {}, m133l = {140}, m132m = "streamDownload", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class ApiClientImpl$streamDownload$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ApiClientImpl this$0;

    static {
        Covode.recordClassIndex(3267);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiClientImpl$streamDownload$1(ApiClientImpl apiClientImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = apiClientImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.streamDownload(null, 0L, null, this);
    }
}
