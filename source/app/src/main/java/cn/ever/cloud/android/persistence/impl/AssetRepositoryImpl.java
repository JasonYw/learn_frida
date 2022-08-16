package cn.ever.cloud.android.persistence.impl;

import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.AlbumChange;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.LocalAsset;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.android.persistence.table.DbAlbum;
import cn.ever.cloud.android.persistence.table.DbAlbumAssetRelation;
import cn.ever.cloud.android.persistence.table.DbCloudAsset;
import cn.ever.cloud.android.persistence.table.DbLocalAsset;
import cn.ever.cloud.android.services.AlbumChangeEventBus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.AbstractC522116k1;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AssetRepositoryImpl implements AbstractC0680b {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AlbumChangeEventBus albumChangeEventBus;

    /* renamed from: db */
    public final SdkDatabase f21050db;

    static {
        Covode.recordClassIndex(2922);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final AlbumAssetRelation getAlbumAssetRelationByLinkId(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (AlbumAssetRelation) proxy.result;
        }
        return (AlbumAssetRelation) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) getAlbumAssetRelationsByLinkId(CollectionsKt__CollectionsJVMKt.listOf(Long.valueOf(j))));
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final void deleteAlbumAssetRelations(List<AlbumAssetRelation> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        AbstractC522116k1 assetDao = this.f21050db.assetDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AlbumAssetRelation albumAssetRelation : list) {
            arrayList.add(AssetRepositoryImplKt.toDbAlbumAssetRelation(albumAssetRelation));
        }
        assetDao.deleteAlbumAssetRelations(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AlbumAssetRelation albumAssetRelation2 : list) {
            arrayList2.add(Long.valueOf(albumAssetRelation2.getAlbumId()));
        }
        ArrayList arrayList3 = arrayList2;
        if (!arrayList3.isEmpty()) {
            this.albumChangeEventBus.notifyAlbums(new AlbumChange(CollectionsKt__CollectionsKt.emptyList(), arrayList3));
        }
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final List<AlbumAssetRelation> getAlbumAssetRelationByAlbumId(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<DbAlbumAssetRelation> albumAssetRelation = this.f21050db.assetDao().getAlbumAssetRelation(j);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(albumAssetRelation, 10));
        for (DbAlbumAssetRelation dbAlbumAssetRelation : albumAssetRelation) {
            arrayList.add(AssetRepositoryImplKt.toAlbumAssetRelation(dbAlbumAssetRelation));
        }
        return arrayList;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final List<AlbumAssetRelation> getAlbumAssetRelationsByCloudId(List<Long> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        List<List<Long>> chunked = CollectionsKt___CollectionsKt.chunked(list, 900);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        for (List<Long> list2 : chunked) {
            arrayList.add(this.f21050db.assetDao().getAlbumAssetRelationsByCloudIds(list2));
        }
        List<DbAlbumAssetRelation> flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
        for (DbAlbumAssetRelation dbAlbumAssetRelation : flatten) {
            arrayList2.add(AssetRepositoryImplKt.toAlbumAssetRelation(dbAlbumAssetRelation));
        }
        return arrayList2;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final List<AlbumAssetRelation> getAlbumAssetRelationsByLinkId(List<Long> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        List<List<Long>> chunked = CollectionsKt___CollectionsKt.chunked(list, 900);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        for (List<Long> list2 : chunked) {
            arrayList.add(this.f21050db.assetDao().getAlbumAssetRelationsByLinkIds(list2));
        }
        List<DbAlbumAssetRelation> flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
        for (DbAlbumAssetRelation dbAlbumAssetRelation : flatten) {
            arrayList2.add(AssetRepositoryImplKt.toAlbumAssetRelation(dbAlbumAssetRelation));
        }
        return arrayList2;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final List<CloudAsset> getCloudAssets(List<Long> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        List<List<Long>> chunked = CollectionsKt___CollectionsKt.chunked(list, 900);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        for (List<Long> list2 : chunked) {
            arrayList.add(this.f21050db.assetDao().getCloudAssets(list2));
        }
        List<DbCloudAsset> flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
        for (DbCloudAsset dbCloudAsset : flatten) {
            arrayList2.add(AssetRepositoryImplKt.toCloudAsset(dbCloudAsset));
        }
        return arrayList2;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final List<LocalAsset> getLocalAssets(List<Long> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        List<List<Long>> chunked = CollectionsKt___CollectionsKt.chunked(list, 900);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        for (List<Long> list2 : chunked) {
            arrayList.add(this.f21050db.assetDao().getLocalAssets(list2));
        }
        List<DbLocalAsset> flatten = CollectionsKt__IterablesKt.flatten(arrayList);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
        for (DbLocalAsset dbLocalAsset : flatten) {
            arrayList2.add(AssetRepositoryImplKt.toLocalAsset(dbLocalAsset));
        }
        return arrayList2;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final void upsertCloudAssets(List<CloudAsset> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CloudAsset cloudAsset : list) {
            arrayList.add(AssetRepositoryImplKt.toDbCloudAsset(cloudAsset));
        }
        this.f21050db.assetDao().upsertCloudAsset(arrayList);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final void upsertLocalAssets(List<LocalAsset> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        AbstractC522116k1 assetDao = this.f21050db.assetDao();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (LocalAsset localAsset : list) {
            arrayList.add(AssetRepositoryImplKt.toDbLocalAsset(localAsset));
        }
        assetDao.upsertLocalAsset(arrayList);
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final void upsertAlbumAssetRelation(List<AlbumAssetRelation> list) {
        AlbumAssetRelation attachLocal;
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        Sequence flattenSequenceOfIterable = SequencesKt__SequencesKt.flattenSequenceOfIterable(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.chunked(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(list), C0722x8bd8f91d.INSTANCE), 900), new C0723x8bd8f91e(this)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : flattenSequenceOfIterable) {
            linkedHashMap.put(Long.valueOf(((DbAlbumAssetRelation) obj).getLinkId()), obj);
        }
        if (!linkedHashMap.isEmpty()) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (AlbumAssetRelation albumAssetRelation : list) {
                DbAlbumAssetRelation dbAlbumAssetRelation = (DbAlbumAssetRelation) linkedHashMap.get(Long.valueOf(albumAssetRelation.getLinkId()));
                if (dbAlbumAssetRelation != null && (attachLocal = albumAssetRelation.attachLocal(Long.valueOf(dbAlbumAssetRelation.getLocalId()))) != null) {
                    albumAssetRelation = attachLocal;
                }
                arrayList.add(albumAssetRelation);
            }
            list = arrayList;
        }
        AbstractC522116k1 assetDao = this.f21050db.assetDao();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AlbumAssetRelation albumAssetRelation2 : list) {
            arrayList2.add(AssetRepositoryImplKt.toDbAlbumAssetRelation(albumAssetRelation2));
        }
        assetDao.upsertAlbumAssetRelation(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AlbumAssetRelation albumAssetRelation3 : list) {
            arrayList3.add(Long.valueOf(albumAssetRelation3.getAlbumId()));
        }
        List<List<Long>> chunked = CollectionsKt___CollectionsKt.chunked(arrayList3, 900);
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        for (List<Long> list2 : chunked) {
            List<DbAlbum> albums = this.f21050db.albumDao().getAlbums(list2);
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(albums, 10));
            for (DbAlbum dbAlbum : albums) {
                arrayList5.add(AlbumRepositoryImplKt.toAlbum(dbAlbum));
            }
            arrayList4.add(arrayList5);
        }
        List flatten = CollectionsKt__IterablesKt.flatten(arrayList4);
        if (true ^ flatten.isEmpty()) {
            this.albumChangeEventBus.notifyAlbums(new AlbumChange(flatten, CollectionsKt__CollectionsKt.emptyList()));
        }
    }

    public AssetRepositoryImpl(SdkDatabase sdkDatabase, AlbumChangeEventBus albumChangeEventBus) {
        C106862S5w.LIZ(sdkDatabase, albumChangeEventBus);
        this.f21050db = sdkDatabase;
        this.albumChangeEventBus = albumChangeEventBus;
    }

    @Override // cn.ever.cloud.android.p039a.AbstractC0680b
    public final List<AlbumAssetRelation> getAlbumAssetRelation(long j, long j2, long j3, long j4, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<DbAlbumAssetRelation> albumAssetRelations = this.f21050db.assetDao().getAlbumAssetRelations(j, j2, j3, j4, i);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(albumAssetRelations, 10));
        for (DbAlbumAssetRelation dbAlbumAssetRelation : albumAssetRelations) {
            arrayList.add(AssetRepositoryImplKt.toAlbumAssetRelation(dbAlbumAssetRelation));
        }
        return arrayList;
    }
}
