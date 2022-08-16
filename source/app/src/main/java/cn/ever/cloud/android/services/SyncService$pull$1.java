package cn.ever.cloud.android.services;

import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.SyncService", m135f = "SyncService.kt", m134i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, m133l = {MotionEventCompat.AXIS_GENERIC_10, MotionEventCompat.AXIS_GENERIC_15}, m132m = "pull", m131n = {"this", "cursor", "assets", "tags", "this", "cursor", "res", "assets", "tags"}, m130s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: classes23.dex */
public final class SyncService$pull$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ SyncService this$0;

    static {
        Covode.recordClassIndex(2996);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncService$pull$1(SyncService syncService, Continuation continuation) {
        super(continuation);
        this.this$0 = syncService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pull(this);
    }
}
