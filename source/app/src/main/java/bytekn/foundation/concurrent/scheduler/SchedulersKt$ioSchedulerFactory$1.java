package bytekn.foundation.concurrent.scheduler;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;
import p003X.C134173bqX;
import p003X.C144263eTh;
import p003X.C145708er6;
import p003X.ThreadFactoryC104119QzJ;

/* loaded from: classes19.dex */
public final /* synthetic */ class SchedulersKt$ioSchedulerFactory$1 extends FunctionReference implements Function0<AbstractC0616h> {
    public static final SchedulersKt$ioSchedulerFactory$1 INSTANCE = new SchedulersKt$ioSchedulerFactory$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2602);
    }

    public SchedulersKt$ioSchedulerFactory$1() {
        super(0);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    public final String getName() {
        return "createIoScheduler";
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final KDeclarationContainer getOwner() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (KDeclarationContainer) proxy.result : Reflection.getOrCreateKotlinPackage(C145708er6.class, "kn_common_release");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final String getSignature() {
        return "createIoScheduler()Lbytekn/foundation/concurrent/scheduler/Scheduler;";
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, bytekn.foundation.concurrent.scheduler.h] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, bytekn.foundation.concurrent.scheduler.h] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC0616h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], null, C145708er6.LIZ, true, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return new C144263eTh(new C134173bqX(TimeUnit.MINUTES.toMillis(1L), new ThreadFactoryC104119QzJ("IO")));
    }
}
