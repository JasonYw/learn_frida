package cn.ever.cloud.android.remote;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.network.entity.NPagination;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class PullUpdateResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<Album> albums;
    public final List<CloudAsset> assets;
    public final List<AlbumAssetRelation> deleted;
    public final NPagination pagination;
    public final List<AlbumAssetRelation> upsert;
    public final Storage userStorage;

    static {
        Covode.recordClassIndex(2948);
    }

    public static /* synthetic */ PullUpdateResult copy$default(PullUpdateResult pullUpdateResult, List list, List list2, List list3, List list4, Storage storage, NPagination nPagination, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pullUpdateResult, list, list2, list3, list4, storage, nPagination, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (PullUpdateResult) proxy.result;
        }
        if ((i & 1) != 0) {
            list = pullUpdateResult.assets;
        }
        if ((i & 2) != 0) {
            list2 = pullUpdateResult.albums;
        }
        if ((i & 4) != 0) {
            list3 = pullUpdateResult.upsert;
        }
        if ((i & 8) != 0) {
            list4 = pullUpdateResult.deleted;
        }
        if ((i & 16) != 0) {
            storage = pullUpdateResult.userStorage;
        }
        if ((i & 32) != 0) {
            nPagination = pullUpdateResult.pagination;
        }
        return pullUpdateResult.copy(list, list2, list3, list4, storage, nPagination);
    }

    private Object[] getObjects() {
        return new Object[]{this.assets, this.albums, this.upsert, this.deleted, this.userStorage, this.pagination};
    }

    public final List<CloudAsset> component1() {
        return this.assets;
    }

    public final List<Album> component2() {
        return this.albums;
    }

    public final List<AlbumAssetRelation> component3() {
        return this.upsert;
    }

    public final List<AlbumAssetRelation> component4() {
        return this.deleted;
    }

    public final Storage component5() {
        return this.userStorage;
    }

    public final NPagination component6() {
        return this.pagination;
    }

    public final PullUpdateResult copy(List<CloudAsset> list, List<Album> list2, List<AlbumAssetRelation> list3, List<AlbumAssetRelation> list4, Storage storage, NPagination nPagination) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, list2, list3, list4, storage, nPagination}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (PullUpdateResult) proxy.result;
        }
        C106862S5w.LIZ(list, list2, list3, list4);
        return new PullUpdateResult(list, list2, list3, list4, storage, nPagination);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PullUpdateResult) {
            return C106862S5w.LIZ(((PullUpdateResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PullUpdateResult:%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final List<Album> getAlbums() {
        return this.albums;
    }

    public final List<CloudAsset> getAssets() {
        return this.assets;
    }

    public final List<AlbumAssetRelation> getDeleted() {
        return this.deleted;
    }

    public final NPagination getPagination() {
        return this.pagination;
    }

    public final List<AlbumAssetRelation> getUpsert() {
        return this.upsert;
    }

    public final Storage getUserStorage() {
        return this.userStorage;
    }

    public PullUpdateResult(List<CloudAsset> list, List<Album> list2, List<AlbumAssetRelation> list3, List<AlbumAssetRelation> list4, Storage storage, NPagination nPagination) {
        C106862S5w.LIZ(list, list2, list3, list4);
        this.assets = list;
        this.albums = list2;
        this.upsert = list3;
        this.deleted = list4;
        this.userStorage = storage;
        this.pagination = nPagination;
    }
}
