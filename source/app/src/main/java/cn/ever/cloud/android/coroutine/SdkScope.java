package cn.ever.cloud.android.coroutine;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.CancellationException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.ThreadPoolDispatcherKt;
import p003X.C106862S5w;
import p003X.C520606ha;

/* loaded from: classes23.dex */
public final class SdkScope {
    public static final C520606ha Companion = new C520606ha((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final CoroutineContext coroutineContext;

    static {
        Covode.recordClassIndex(2841);
    }

    public final void async() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        throw new NotImplementedError(null, 1, null);
    }

    public final void tearDown() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            JobKt__JobKt.cancel$default(this.coroutineContext, (CancellationException) null, 1, (Object) null);
        }
    }

    public final CoroutineScope newScope() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (CoroutineScope) proxy.result;
        }
        CoroutineContext coroutineContext = this.coroutineContext;
        return CoroutineScopeKt.CoroutineScope(coroutineContext.plus(SupervisorKt.SupervisorJob(JobKt.getJob(coroutineContext))));
    }

    public final Job launch(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        Job launch$default;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{coroutineContext, function2}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Job) proxy.result;
        }
        C106862S5w.LIZ(coroutineContext, function2);
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(coroutineContext), coroutineContext, null, function2, 2, null);
        return launch$default;
    }

    public SdkScope(int i, CoroutineDispatcher coroutineDispatcher, CoroutineExceptionHandler coroutineExceptionHandler) {
        CompletableJob Job$default;
        C106862S5w.LIZ(coroutineExceptionHandler);
        CoroutineContext plus = (coroutineDispatcher == null ? ThreadPoolDispatcherKt.newFixedThreadPoolContext(i, "EverCloudSdk") : coroutineDispatcher).plus(coroutineExceptionHandler);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.coroutineContext = plus.plus(Job$default);
    }

    public /* synthetic */ SdkScope(int i, CoroutineDispatcher coroutineDispatcher, CoroutineExceptionHandler coroutineExceptionHandler, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : coroutineDispatcher, (i2 & 4) != 0 ? SdkScopeKt.getSdkCoroutineExceptionHandler() : coroutineExceptionHandler);
    }

    public static /* synthetic */ Job launch$default(SdkScope sdkScope, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sdkScope, coroutineContext, function2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Job) proxy.result;
        }
        if ((i & 1) != 0) {
            CoroutineContext coroutineContext2 = sdkScope.coroutineContext;
            coroutineContext = coroutineContext2.plus(SupervisorKt.SupervisorJob(JobKt.getJob(coroutineContext2)));
        }
        return sdkScope.launch(coroutineContext, function2);
    }
}
