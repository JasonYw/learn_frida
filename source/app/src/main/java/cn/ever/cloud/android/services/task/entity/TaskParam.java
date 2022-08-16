package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes23.dex */
public final class TaskParam {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final HashMap<Class<?>, Object> inner = new HashMap<>();

    static {
        Covode.recordClassIndex(3117);
    }

    public final HashMap<Class<?>, Object> getInner() {
        return this.inner;
    }

    public final /* synthetic */ <T> T get() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        HashMap<Class<?>, Object> inner = getInner();
        Intrinsics.reifiedOperationMarker(4, "");
        T t = (T) inner.get(Object.class);
        if (t != null) {
            Intrinsics.reifiedOperationMarker(1, "");
            return t;
        }
        return null;
    }

    public final /* synthetic */ <T> void insert(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        HashMap<Class<?>, Object> inner = getInner();
        Intrinsics.reifiedOperationMarker(4, "");
        if (t != null) {
            inner.put(Object.class, t);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
    }
}
