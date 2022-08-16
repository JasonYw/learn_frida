package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcNetworkTimeout {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long downloadMs;
    public final long generalMs;
    public final long uploadMs;

    static {
        Covode.recordClassIndex(3287);
    }

    public static /* synthetic */ EcNetworkTimeout copy$default(EcNetworkTimeout ecNetworkTimeout, long j, long j2, long j3, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecNetworkTimeout, new Long(j), new Long(j2), new Long(j3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcNetworkTimeout) proxy.result;
        }
        if ((i & 1) != 0) {
            j = ecNetworkTimeout.generalMs;
        }
        if ((i & 2) != 0) {
            j2 = ecNetworkTimeout.uploadMs;
        }
        if ((i & 4) != 0) {
            j3 = ecNetworkTimeout.downloadMs;
        }
        return ecNetworkTimeout.copy(j, j2, j3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.generalMs), Long.valueOf(this.uploadMs), Long.valueOf(this.downloadMs)};
    }

    public final long component1() {
        return this.generalMs;
    }

    public final long component2() {
        return this.uploadMs;
    }

    public final long component3() {
        return this.downloadMs;
    }

    public final EcNetworkTimeout copy(long j, long j2, long j3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (EcNetworkTimeout) proxy.result : new EcNetworkTimeout(j, j2, j3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcNetworkTimeout) {
            return C106862S5w.LIZ(((EcNetworkTimeout) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcNetworkTimeout:%s,%s,%s", getObjects());
    }

    public final long getDownloadMs() {
        return this.downloadMs;
    }

    public final long getGeneralMs() {
        return this.generalMs;
    }

    public final long getUploadMs() {
        return this.uploadMs;
    }

    public EcNetworkTimeout(long j, long j2, long j3) {
        this.generalMs = j;
        this.uploadMs = j2;
        this.downloadMs = j3;
    }
}
