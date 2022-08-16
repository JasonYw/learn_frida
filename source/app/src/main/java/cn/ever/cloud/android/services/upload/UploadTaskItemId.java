package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class UploadTaskItemId {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long inner;

    static {
        Covode.recordClassIndex(3154);
    }

    public static /* synthetic */ UploadTaskItemId copy$default(UploadTaskItemId uploadTaskItemId, long j, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadTaskItemId, new Long(j), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadTaskItemId) proxy.result;
        }
        if ((i & 1) != 0) {
            j = uploadTaskItemId.inner;
        }
        return uploadTaskItemId.copy(j);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.inner)};
    }

    public final long component1() {
        return this.inner;
    }

    public final UploadTaskItemId copy(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (UploadTaskItemId) proxy.result : new UploadTaskItemId(j);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadTaskItemId) {
            return C106862S5w.LIZ(((UploadTaskItemId) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UploadTaskItemId:%s", getObjects());
    }

    public final long getInner() {
        return this.inner;
    }

    public UploadTaskItemId(long j) {
        this.inner = j;
    }
}
