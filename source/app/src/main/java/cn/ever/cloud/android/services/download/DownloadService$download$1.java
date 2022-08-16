package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p003X.C64868Big;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.DownloadService", m135f = "DownloadService.kt", m134i = {}, m133l = {72}, m132m = C64868Big.LIZJ, m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class DownloadService$download$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DownloadService this$0;

    static {
        Covode.recordClassIndex(3012);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$download$1(DownloadService downloadService, Continuation continuation) {
        super(continuation);
        this.this$0 = downloadService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.download(null, null, this);
    }
}
