package cn.ever.cloud.android.services.task;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class TaskService$schedule$provideNewItems$1 extends Lambda implements Function0<Long> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TaskService this$0;

    static {
        Covode.recordClassIndex(3059);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskService$schedule$provideNewItems$1(TaskService taskService) {
        super(0);
        this.this$0 = taskService;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: collision with other method in class */
    public final /* synthetic */ Long mo30099invoke() {
        return Long.valueOf(mo30099invoke());
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Long, long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Long, long] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Long mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return this.this$0.idGen.gen();
    }
}
