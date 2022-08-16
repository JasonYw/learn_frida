package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcStorage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long quota;
    public final long usage;

    static {
        Covode.recordClassIndex(3399);
    }

    public static /* synthetic */ EcStorage copy$default(EcStorage ecStorage, long j, long j2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecStorage, new Long(j), new Long(j2), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcStorage) proxy.result;
        }
        if ((i & 1) != 0) {
            j = ecStorage.quota;
        }
        if ((i & 2) != 0) {
            j2 = ecStorage.usage;
        }
        return ecStorage.copy(j, j2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.quota), Long.valueOf(this.usage)};
    }

    public final long component1() {
        return this.quota;
    }

    public final long component2() {
        return this.usage;
    }

    public final EcStorage copy(long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (EcStorage) proxy.result : new EcStorage(j, j2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcStorage) {
            return C106862S5w.LIZ(((EcStorage) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcStorage:%s,%s", getObjects());
    }

    public final long getQuota() {
        return this.quota;
    }

    public final long getUsage() {
        return this.usage;
    }

    public EcStorage(long j, long j2) {
        this.quota = j;
        this.usage = j2;
    }
}
