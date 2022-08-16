package cn.ever.cloud.android.remote;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.remote.SyncRemoteRepo", m135f = "SyncRemoteRepo.kt", m134i = {0}, m133l = {28}, m132m = "getUpdates", m131n = {"this"}, m130s = {"L$0"})
/* loaded from: classes23.dex */
public final class SyncRemoteRepo$getUpdates$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SyncRemoteRepo this$0;

    static {
        Covode.recordClassIndex(2951);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncRemoteRepo$getUpdates$1(SyncRemoteRepo syncRemoteRepo, Continuation continuation) {
        super(continuation);
        this.this$0 = syncRemoteRepo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getUpdates(null, this);
    }
}
