package cn.ever.cloud.network_impl.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes23.dex */
public final class ApiExecutor$suspendCall$2$1 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $curThread;

    static {
        Covode.recordClassIndex(3272);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiExecutor$suspendCall$2$1(Ref.ObjectRef objectRef) {
        super(1);
        this.$curThread = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Thread thread;
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported && (thread = (Thread) this.$curThread.element) != null) {
            thread.interrupt();
        }
    }
}
