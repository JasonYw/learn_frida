package cn.ever.cloud.utils;

import cn.ever.cloud.android.coroutine.SdkScope;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ThrottleKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3442);
    }

    public static final <T> Function1<T, Unit> debounce(long j, SdkScope sdkScope, Function1<? super T, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), sdkScope, function1}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Function1) proxy.result;
        }
        C106862S5w.LIZ(sdkScope, function1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        return new ThrottleKt$debounce$1(objectRef, sdkScope, j, function1);
    }

    public static final <T> Function1<T, Unit> throttleLatest(long j, SdkScope sdkScope, Function1<? super T, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), sdkScope, function1}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Function1) proxy.result;
        }
        C106862S5w.LIZ(sdkScope, function1);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        return new ThrottleKt$throttleLatest$1(new Ref.ObjectRef(), objectRef, sdkScope, j, function1);
    }

    public static /* synthetic */ Function1 debounce$default(long j, SdkScope sdkScope, Function1 function1, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), sdkScope, function1, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Function1) proxy.result;
        }
        if ((i & 1) != 0) {
            j = 300;
        }
        return debounce(j, sdkScope, function1);
    }

    public static /* synthetic */ Function1 throttleLatest$default(long j, SdkScope sdkScope, Function1 function1, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), sdkScope, function1, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (Function1) proxy.result;
        }
        if ((i & 1) != 0) {
            j = 300;
        }
        return throttleLatest(j, sdkScope, function1);
    }
}
