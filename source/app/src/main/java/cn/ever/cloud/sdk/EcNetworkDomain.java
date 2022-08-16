package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcNetworkDomain {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String host;
    public final boolean isHttps;

    static {
        Covode.recordClassIndex(3286);
    }

    public static /* synthetic */ EcNetworkDomain copy$default(EcNetworkDomain ecNetworkDomain, String str, boolean z, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecNetworkDomain, str, Byte.valueOf(b), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcNetworkDomain) proxy.result;
        }
        if ((i & 1) != 0) {
            str = ecNetworkDomain.host;
        }
        if ((i & 2) != 0) {
            z = ecNetworkDomain.isHttps;
        }
        return ecNetworkDomain.copy(str, z);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.host, Boolean.valueOf(this.isHttps)};
    }

    public final String component1() {
        return this.host;
    }

    public final boolean component2() {
        return this.isHttps;
    }

    public final EcNetworkDomain copy(String str, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcNetworkDomain) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new EcNetworkDomain(str, z);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcNetworkDomain) {
            return C106862S5w.LIZ(((EcNetworkDomain) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcNetworkDomain:%s,%s", getObjects());
    }

    public final String getHost() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public EcNetworkDomain(String str, boolean z) {
        C106862S5w.LIZ(str);
        this.host = str;
        this.isHttps = z;
    }
}
