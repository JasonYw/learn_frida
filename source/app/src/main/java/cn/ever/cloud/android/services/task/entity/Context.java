package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class Context {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Resource resource;

    static {
        Covode.recordClassIndex(3082);
    }

    public static /* synthetic */ Context copy$default(Context context, Resource resource, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, resource, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        if ((i & 1) != 0) {
            resource = context.resource;
        }
        return context.copy(resource);
    }

    private Object[] getObjects() {
        return new Object[]{this.resource};
    }

    public final Resource component1() {
        return this.resource;
    }

    public final Context copy(Resource resource) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resource}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Context) proxy.result;
        }
        C106862S5w.LIZ(resource);
        return new Context(resource);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Context) {
            return C106862S5w.LIZ(((Context) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Context:%s", getObjects());
    }

    public final Resource getResource() {
        return this.resource;
    }

    public Context(Resource resource) {
        C106862S5w.LIZ(resource);
        this.resource = resource;
    }
}
