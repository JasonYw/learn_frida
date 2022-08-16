package cn.ever.cloud.android.services.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.task.TaskService", m135f = "TaskService.kt", m134i = {}, m133l = {162}, m132m = "cancelItems", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class TaskService$cancelItems$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TaskService this$0;

    static {
        Covode.recordClassIndex(3052);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$cancelItems$1(TaskService taskService, Continuation continuation) {
        super(continuation);
        this.this$0 = taskService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cancelItems(0, null, null, this);
    }
}
