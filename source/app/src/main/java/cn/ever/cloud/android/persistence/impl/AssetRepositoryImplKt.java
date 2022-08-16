package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.LocalAsset;
import cn.ever.cloud.android.persistence.table.DbAlbumAssetRelation;
import cn.ever.cloud.android.persistence.table.DbCloudAsset;
import cn.ever.cloud.android.persistence.table.DbLocalAsset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AssetRepositoryImplKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2925);
    }

    public static final AlbumAssetRelation toAlbumAssetRelation(DbAlbumAssetRelation dbAlbumAssetRelation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbAlbumAssetRelation}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (AlbumAssetRelation) proxy.result;
        }
        C106862S5w.LIZ(dbAlbumAssetRelation);
        return new AlbumAssetRelation(dbAlbumAssetRelation.getLinkId(), dbAlbumAssetRelation.getAlbumId(), dbAlbumAssetRelation.getLocalId(), dbAlbumAssetRelation.getCloudId(), dbAlbumAssetRelation.getAddTime(), dbAlbumAssetRelation.getTakenTime(), dbAlbumAssetRelation.getStatus());
    }

    public static final DbAlbumAssetRelation toDbAlbumAssetRelation(AlbumAssetRelation albumAssetRelation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumAssetRelation}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbAlbumAssetRelation) proxy.result;
        }
        C106862S5w.LIZ(albumAssetRelation);
        return new DbAlbumAssetRelation(albumAssetRelation.getLinkId(), albumAssetRelation.getAlbumId(), albumAssetRelation.getLocalId(), albumAssetRelation.getCloudId(), albumAssetRelation.getAddTime(), albumAssetRelation.getTakenTime(), albumAssetRelation.getStatus());
    }

    public static final CloudAsset toCloudAsset(DbCloudAsset dbCloudAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbCloudAsset}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (CloudAsset) proxy.result;
        }
        C106862S5w.LIZ(dbCloudAsset);
        return new CloudAsset(dbCloudAsset.getCloudId(), dbCloudAsset.getMd5(), dbCloudAsset.getTakenMs(), dbCloudAsset.getDurationMs(), dbCloudAsset.getType(), dbCloudAsset.getSubType(), dbCloudAsset.getMime(), dbCloudAsset.getWidth(), dbCloudAsset.getHeight(), dbCloudAsset.getStatus(), dbCloudAsset.getPreviewUrl(), dbCloudAsset.getThumbnailUrl(), dbCloudAsset.getKey(), dbCloudAsset.getSize());
    }

    public static final DbCloudAsset toDbCloudAsset(CloudAsset cloudAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cloudAsset}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (DbCloudAsset) proxy.result;
        }
        C106862S5w.LIZ(cloudAsset);
        return new DbCloudAsset(cloudAsset.getCloudId(), cloudAsset.getMd5(), cloudAsset.getTakenMs(), cloudAsset.getDurationMs(), cloudAsset.getType(), cloudAsset.getSubType(), cloudAsset.getMime(), cloudAsset.getWidth(), cloudAsset.getHeight(), cloudAsset.getStatus(), cloudAsset.getPreviewUrl(), cloudAsset.getThumbnailUrl(), cloudAsset.getAesEncKey(), cloudAsset.getSize());
    }

    public static final DbLocalAsset toDbLocalAsset(LocalAsset localAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{localAsset}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (DbLocalAsset) proxy.result;
        }
        C106862S5w.LIZ(localAsset);
        return new DbLocalAsset(localAsset.getLocalId(), localAsset.getUri(), localAsset.getPath(), localAsset.getTakenMs(), localAsset.getDurationMs(), localAsset.getMime(), localAsset.getWidth(), localAsset.getHeight(), localAsset.getDeleteOnEnd());
    }

    public static final LocalAsset toLocalAsset(DbLocalAsset dbLocalAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbLocalAsset}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (LocalAsset) proxy.result;
        }
        C106862S5w.LIZ(dbLocalAsset);
        return new LocalAsset(dbLocalAsset.getMediaId(), dbLocalAsset.getUri(), dbLocalAsset.getPath(), dbLocalAsset.getTakenMs(), dbLocalAsset.getDurationMs(), dbLocalAsset.getMime(), dbLocalAsset.getWidth(), dbLocalAsset.getHeight(), dbLocalAsset.getDeleteOnEnd());
    }
}
