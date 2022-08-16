package cn.ever.cloud.android.p039a;

import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.LocalAsset;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: cn.ever.cloud.android.a.b */
/* loaded from: classes23.dex */
public interface AbstractC0680b {
    static {
        Covode.recordClassIndex(2744);
    }

    void deleteAlbumAssetRelations(List<AlbumAssetRelation> list);

    List<AlbumAssetRelation> getAlbumAssetRelation(long j, long j2, long j3, long j4, int i);

    List<AlbumAssetRelation> getAlbumAssetRelationByAlbumId(long j);

    AlbumAssetRelation getAlbumAssetRelationByLinkId(long j);

    List<AlbumAssetRelation> getAlbumAssetRelationsByCloudId(List<Long> list);

    List<AlbumAssetRelation> getAlbumAssetRelationsByLinkId(List<Long> list);

    List<CloudAsset> getCloudAssets(List<Long> list);

    List<LocalAsset> getLocalAssets(List<Long> list);

    void upsertAlbumAssetRelation(List<AlbumAssetRelation> list);

    void upsertCloudAssets(List<CloudAsset> list);

    void upsertLocalAssets(List<LocalAsset> list);
}
