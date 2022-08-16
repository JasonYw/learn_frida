package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ToDelAsset {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final String path;
    public final String uri;

    static {
        Covode.recordClassIndex(2877);
    }

    public static /* synthetic */ ToDelAsset copy$default(ToDelAsset toDelAsset, String str, String str2, String str3, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{toDelAsset, str, str2, str3, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ToDelAsset) proxy.result;
        }
        if ((i & 1) != 0) {
            str = toDelAsset.assetId;
        }
        if ((i & 2) != 0) {
            str2 = toDelAsset.path;
        }
        if ((i & 4) != 0) {
            str3 = toDelAsset.uri;
        }
        return toDelAsset.copy(str, str2, str3);
    }

    private Object[] getObjects() {
        return new Object[]{this.assetId, this.path, this.uri};
    }

    public final String component1() {
        return this.assetId;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.uri;
    }

    public final ToDelAsset copy(String str, String str2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ToDelAsset) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new ToDelAsset(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ToDelAsset) {
            return C106862S5w.LIZ(((ToDelAsset) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ToDelAsset:%s,%s,%s", getObjects());
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getUri() {
        return this.uri;
    }

    public ToDelAsset(String str, String str2, String str3) {
        C106862S5w.LIZ(str);
        this.assetId = str;
        this.path = str2;
        this.uri = str3;
    }
}
