package cn.ever.cloud.android.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.AlbumService", m135f = "AlbumService.kt", m134i = {0, 0, 0, 0, 0, 0, 1, 1}, m133l = {234, 270}, m132m = "addAssets", m131n = {"this", "localAssets", "albumId", "predefineAlbumEdit", "begin", "addTimeMs", "toUpload", "begin"}, m130s = {"L$0", "L$1", "J$0", "Z$0", "J$1", "J$2", "L$0", "J$0"})
/* loaded from: classes23.dex */
public final class AlbumService$addAssets$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long J$0;
    public long J$1;
    public long J$2;
    public Object L$0;
    public Object L$1;
    public boolean Z$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ AlbumService this$0;

    static {
        Covode.recordClassIndex(2966);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumService$addAssets$1(AlbumService albumService, Continuation continuation) {
        super(continuation);
        this.this$0 = albumService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addAssets(0L, null, false, this);
    }
}
