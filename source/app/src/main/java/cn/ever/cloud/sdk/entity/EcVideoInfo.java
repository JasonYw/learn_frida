package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcVideoInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final EcVideoPlayInfo p360;
    public final EcVideoPlayInfo p480;
    public final EcVideoPlayInfo p720;
    public final int status;

    static {
        Covode.recordClassIndex(3406);
    }

    public static /* synthetic */ EcVideoInfo copy$default(EcVideoInfo ecVideoInfo, String str, int i, EcVideoPlayInfo ecVideoPlayInfo, EcVideoPlayInfo ecVideoPlayInfo2, EcVideoPlayInfo ecVideoPlayInfo3, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecVideoInfo, str, Integer.valueOf(i), ecVideoPlayInfo, ecVideoPlayInfo2, ecVideoPlayInfo3, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcVideoInfo) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = ecVideoInfo.assetId;
        }
        if ((i2 & 2) != 0) {
            i = ecVideoInfo.status;
        }
        if ((i2 & 4) != 0) {
            ecVideoPlayInfo = ecVideoInfo.p360;
        }
        if ((i2 & 8) != 0) {
            ecVideoPlayInfo2 = ecVideoInfo.p480;
        }
        if ((i2 & 16) != 0) {
            ecVideoPlayInfo3 = ecVideoInfo.p720;
        }
        return ecVideoInfo.copy(str, i, ecVideoPlayInfo, ecVideoPlayInfo2, ecVideoPlayInfo3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.assetId, Integer.valueOf(this.status), this.p360, this.p480, this.p720};
    }

    public final String component1() {
        return this.assetId;
    }

    public final int component2() {
        return this.status;
    }

    public final EcVideoPlayInfo component3() {
        return this.p360;
    }

    public final EcVideoPlayInfo component4() {
        return this.p480;
    }

    public final EcVideoPlayInfo component5() {
        return this.p720;
    }

    public final EcVideoInfo copy(String str, int i, EcVideoPlayInfo ecVideoPlayInfo, EcVideoPlayInfo ecVideoPlayInfo2, EcVideoPlayInfo ecVideoPlayInfo3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), ecVideoPlayInfo, ecVideoPlayInfo2, ecVideoPlayInfo3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcVideoInfo) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new EcVideoInfo(str, i, ecVideoPlayInfo, ecVideoPlayInfo2, ecVideoPlayInfo3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcVideoInfo) {
            return C106862S5w.LIZ(((EcVideoInfo) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcVideoInfo:%s,%s,%s,%s,%s", getObjects());
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final EcVideoPlayInfo getP360() {
        return this.p360;
    }

    public final EcVideoPlayInfo getP480() {
        return this.p480;
    }

    public final EcVideoPlayInfo getP720() {
        return this.p720;
    }

    public final int getStatus() {
        return this.status;
    }

    public EcVideoInfo(String str, int i, EcVideoPlayInfo ecVideoPlayInfo, EcVideoPlayInfo ecVideoPlayInfo2, EcVideoPlayInfo ecVideoPlayInfo3) {
        C106862S5w.LIZ(str);
        this.assetId = str;
        this.status = i;
        this.p360 = ecVideoPlayInfo;
        this.p480 = ecVideoPlayInfo2;
        this.p720 = ecVideoPlayInfo3;
    }
}
