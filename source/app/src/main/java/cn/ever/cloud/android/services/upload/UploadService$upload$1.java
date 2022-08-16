package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.upload.UploadService", m135f = "UploadService.kt", m134i = {}, m133l = {61}, m132m = "upload", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UploadService$upload$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UploadService this$0;

    static {
        Covode.recordClassIndex(3151);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadService$upload$1(UploadService uploadService, Continuation continuation) {
        super(continuation);
        this.this$0 = uploadService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.upload(null, null, null, this);
    }
}
