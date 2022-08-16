package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcVideoPlayInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String key;
    public final String primaryUrl;
    public final String secondaryUrl;

    static {
        Covode.recordClassIndex(3407);
    }

    public static /* synthetic */ EcVideoPlayInfo copy$default(EcVideoPlayInfo ecVideoPlayInfo, String str, String str2, String str3, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecVideoPlayInfo, str, str2, str3, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcVideoPlayInfo) proxy.result;
        }
        if ((i & 1) != 0) {
            str = ecVideoPlayInfo.primaryUrl;
        }
        if ((i & 2) != 0) {
            str2 = ecVideoPlayInfo.secondaryUrl;
        }
        if ((i & 4) != 0) {
            str3 = ecVideoPlayInfo.key;
        }
        return ecVideoPlayInfo.copy(str, str2, str3);
    }

    private Object[] getObjects() {
        return new Object[]{this.primaryUrl, this.secondaryUrl, this.key};
    }

    public final String component1() {
        return this.primaryUrl;
    }

    public final String component2() {
        return this.secondaryUrl;
    }

    public final String component3() {
        return this.key;
    }

    public final EcVideoPlayInfo copy(String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcVideoPlayInfo) proxy.result;
        }
        C106862S5w.LIZ(str, str2, str3);
        return new EcVideoPlayInfo(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcVideoPlayInfo) {
            return C106862S5w.LIZ(((EcVideoPlayInfo) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcVideoPlayInfo:%s,%s,%s", getObjects());
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPrimaryUrl() {
        return this.primaryUrl;
    }

    public final String getSecondaryUrl() {
        return this.secondaryUrl;
    }

    public EcVideoPlayInfo(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.primaryUrl = str;
        this.secondaryUrl = str2;
        this.key = str3;
    }
}
