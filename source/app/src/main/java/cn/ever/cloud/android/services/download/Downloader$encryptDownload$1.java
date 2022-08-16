package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.Downloader", m135f = "Downloader.kt", m134i = {}, m133l = {199}, m132m = "encryptDownload", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class Downloader$encryptDownload$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Downloader this$0;

    static {
        Covode.recordClassIndex(3030);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownload$1(Downloader downloader, Continuation continuation) {
        super(continuation);
        this.this$0 = downloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.encryptDownload(null, null, null, 0L, 0L, null, null, this);
    }
}
