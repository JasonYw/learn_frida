package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import p003X.HandlerC95384Nhi;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.download.Downloader", m135f = "Downloader.kt", m134i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, m133l = {HandlerC95384Nhi.LIZLLL, 114, 118}, m132m = "downloadAndCheckIntegrity", m131n = {"this", "media", "progressFn", "targetPath", "tempPath", "alreadyDownloaded", "this", "media", "targetPath", "tempPath", "this", "media", "targetPath", "tempPath"}, m130s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes23.dex */
public final class Downloader$downloadAndCheckIntegrity$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long J$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ Downloader this$0;

    static {
        Covode.recordClassIndex(3025);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$downloadAndCheckIntegrity$1(Downloader downloader, Continuation continuation) {
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
        return this.this$0.downloadAndCheckIntegrity(null, null, this);
    }
}
