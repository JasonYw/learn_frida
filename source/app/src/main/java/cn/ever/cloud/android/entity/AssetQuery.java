package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AssetQuery {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long albumId;
    public final PageParams pageParams;

    static {
        Covode.recordClassIndex(2855);
    }

    public static /* synthetic */ AssetQuery copy$default(AssetQuery assetQuery, PageParams pageParams, long j, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{assetQuery, pageParams, new Long(j), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AssetQuery) proxy.result;
        }
        if ((i & 1) != 0) {
            pageParams = assetQuery.pageParams;
        }
        if ((i & 2) != 0) {
            j = assetQuery.albumId;
        }
        return assetQuery.copy(pageParams, j);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.pageParams, Long.valueOf(this.albumId)};
    }

    public final PageParams component1() {
        return this.pageParams;
    }

    public final long component2() {
        return this.albumId;
    }

    public final AssetQuery copy(PageParams pageParams, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageParams, new Long(j)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AssetQuery) proxy.result;
        }
        C106862S5w.LIZ(pageParams);
        return new AssetQuery(pageParams, j);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AssetQuery) {
            return C106862S5w.LIZ(((AssetQuery) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AssetQuery:%s,%s", getObjects());
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final PageParams getPageParams() {
        return this.pageParams;
    }

    public AssetQuery(PageParams pageParams, long j) {
        C106862S5w.LIZ(pageParams);
        this.pageParams = pageParams;
        this.albumId = j;
    }
}
