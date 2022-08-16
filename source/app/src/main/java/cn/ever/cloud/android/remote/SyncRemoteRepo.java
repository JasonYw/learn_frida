package cn.ever.cloud.android.remote;

import cn.ever.cloud.android.entity.Album;
import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.entity.NAsset;
import cn.ever.cloud.network.entity.NPackTag;
import cn.ever.cloud.network.entity.NTagV2;
import cn.ever.cloud.network.entity.NUserProfile;
import cn.ever.cloud.utils.KotlinExtKt;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.C106862S5w;
import p003X.C522156k5;

/* loaded from: classes23.dex */
public final class SyncRemoteRepo {
    public static final C522156k5 Companion = new C522156k5((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0729a apiClient;
    public final AbstractC0680b assetRepository;

    static {
        Covode.recordClassIndex(2949);
    }

    private final List<CloudAsset> mapCloudAssets(List<NAsset> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (NAsset nAsset : list) {
            arrayList.add(SyncRemoteRepoKt.toCloudAsset(nAsset));
        }
        return arrayList;
    }

    private final Storage mapUserProfile(NUserProfile nUserProfile) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nUserProfile}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Storage) proxy.result;
        }
        if (nUserProfile != null) {
            return new Storage(nUserProfile.getId(), nUserProfile.getQuota(), nUserProfile.getUsage(), nUserProfile.getMediaNum());
        }
        return null;
    }

    private final List<AlbumAssetRelation> mapAlbumAssetRelations(List<NAsset> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (NAsset nAsset : list) {
            for (NTagV2 nTagV2 : nAsset.getTagsV2()) {
                arrayList.add(new AlbumAssetRelation(KotlinExtKt.getOrDefault(nTagV2.getLinkId()), nTagV2.getTagId(), 0L, nAsset.getId(), nTagV2.getAddedAtUtc(), KotlinExtKt.getOrDefault(nAsset.getTakenUtc()), (int) KotlinExtKt.getOrDefault(Long.valueOf(nAsset.getStatus()))));
            }
        }
        return arrayList;
    }

    private final List<Album> mapAlbums(List<NPackTag> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (NPackTag nPackTag : list) {
            arrayList.add(new Album(nPackTag.getId(), nPackTag.getDisplayName(), nPackTag.getCreatedAtUtc(), nPackTag.getModifiedTimeUtc(), nPackTag.getDeleted(), nPackTag.getCoverLink(), nPackTag.getCoverMd5(), new SyncRemoteRepo$mapAlbums$1$1(null)));
        }
        return arrayList;
    }

    private final Pair<List<AlbumAssetRelation>, List<AlbumAssetRelation>> mapNewAddedAndDeletedRelations(List<NAsset> list) {
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        Object valueOf4;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (NAsset nAsset : list) {
            arrayList.add(Long.valueOf(nAsset.getId()));
        }
        List<AlbumAssetRelation> albumAssetRelationsByCloudId = this.assetRepository.getAlbumAssetRelationsByCloudId(arrayList);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(albumAssetRelationsByCloudId, 10)), 16));
        for (Object obj : albumAssetRelationsByCloudId) {
            linkedHashMap.put(Long.valueOf(((AlbumAssetRelation) obj).getLinkId()), obj);
        }
        List<AlbumAssetRelation> mapAlbumAssetRelations = mapAlbumAssetRelations(list);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(mapAlbumAssetRelations, 10)), 16));
        for (Object obj2 : mapAlbumAssetRelations) {
            linkedHashMap2.put(Long.valueOf(((AlbumAssetRelation) obj2).getLinkId()), obj2);
        }
        Set minus = SetsKt___SetsKt.minus(linkedHashMap.keySet(), (Iterable) linkedHashMap2.keySet());
        Set minus2 = SetsKt___SetsKt.minus(linkedHashMap2.keySet(), (Iterable) linkedHashMap.keySet());
        LogHelper logHelper = LogHelper.INSTANCE;
        StringBuilder sb = new StringBuilder("album asset relation newLinks: ");
        if (linkedHashMap2.size() <= 10) {
            valueOf = linkedHashMap2.toString();
        } else {
            valueOf = Integer.valueOf(linkedHashMap2.size());
        }
        sb.append(valueOf);
        logHelper.m20553i("SyncRemoteRepo", sb.toString());
        LogHelper logHelper2 = LogHelper.INSTANCE;
        StringBuilder sb2 = new StringBuilder("album asset relation oldLinks: ");
        if (linkedHashMap.size() <= 10) {
            valueOf2 = linkedHashMap.toString();
        } else {
            valueOf2 = Integer.valueOf(linkedHashMap.size());
        }
        sb2.append(valueOf2);
        logHelper2.m20553i("SyncRemoteRepo", sb2.toString());
        Collection emptyList = CollectionsKt__CollectionsKt.emptyList();
        Collection emptyList2 = CollectionsKt__CollectionsKt.emptyList();
        if (!minus.isEmpty()) {
            LogHelper logHelper3 = LogHelper.INSTANCE;
            StringBuilder sb3 = new StringBuilder("album asset relation toRemove: ");
            if (minus.size() <= 10) {
                valueOf4 = minus.toString();
            } else {
                valueOf4 = Integer.valueOf(minus.size());
            }
            sb3.append(valueOf4);
            sb3.append(LoggerUtil.BLANK_TAG);
            logHelper3.m20553i("SyncRemoteRepo", sb3.toString());
            emptyList2 = new ArrayList();
            for (Object obj3 : albumAssetRelationsByCloudId) {
                if (minus.contains(Long.valueOf(((AlbumAssetRelation) obj3).getLinkId()))) {
                    emptyList2.add(obj3);
                }
            }
        }
        if (true ^ minus2.isEmpty()) {
            LogHelper logHelper4 = LogHelper.INSTANCE;
            StringBuilder sb4 = new StringBuilder("album asset relation toAdd: ");
            if (minus2.size() <= 10) {
                valueOf3 = minus2.toString();
            } else {
                valueOf3 = Integer.valueOf(minus2.size());
            }
            sb4.append(valueOf3);
            logHelper4.m20553i("SyncRemoteRepo", sb4.toString());
            emptyList = new ArrayList();
            for (Object obj4 : mapAlbumAssetRelations) {
                if (minus2.contains(Long.valueOf(((AlbumAssetRelation) obj4).getLinkId()))) {
                    emptyList.add(obj4);
                }
            }
        }
        return new Pair<>(emptyList, emptyList2);
    }

    public SyncRemoteRepo(AbstractC0729a abstractC0729a, AbstractC0680b abstractC0680b) {
        C106862S5w.LIZ(abstractC0729a, abstractC0680b);
        this.apiClient = abstractC0729a;
        this.assetRepository = abstractC0680b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getUpdates(java.lang.String r11, kotlin.coroutines.Continuation<? super cn.ever.cloud.android.remote.PullUpdateResult> r12) {
        /*
            r10 = this;
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            r2[r1] = r11
            r5 = 1
            r2[r5] = r12
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.remote.SyncRemoteRepo.changeQuickRedirect
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r10, r0, r1, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.result
            return r0
        L16:
            boolean r0 = r12 instanceof cn.ever.cloud.android.remote.SyncRemoteRepo$getUpdates$1
            if (r0 == 0) goto Laa
            r4 = r12
            cn.ever.cloud.android.remote.SyncRemoteRepo$getUpdates$1 r4 = (cn.ever.cloud.android.remote.SyncRemoteRepo$getUpdates$1) r4
            int r0 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto Laa
            int r0 = r4.label
            int r0 = r0 - r1
            r4.label = r0
        L29:
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r4.label
            if (r0 == 0) goto L86
            if (r0 != r5) goto Lb1
            java.lang.Object r3 = r4.L$0
            cn.ever.cloud.android.remote.SyncRemoteRepo r3 = (cn.ever.cloud.android.remote.SyncRemoteRepo) r3
            kotlin.ResultKt.throwOnFailure(r1)
        L3c:
            cn.ever.cloud.network.entity.NGenericResponse2 r1 = (cn.ever.cloud.network.entity.NGenericResponse2) r1
            java.lang.Object r0 = r1.getData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            cn.ever.cloud.network.entity.NGetUpdatesResponseData r0 = (cn.ever.cloud.network.entity.NGetUpdatesResponseData) r0
            cn.ever.cloud.network.entity.NGetUserResourcesResponseData r2 = r0.getUserData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r9 = r1.getPagination()
            cn.ever.cloud.network.entity.NPagination r9 = (cn.ever.cloud.network.entity.NPagination) r9
            java.util.List r0 = r2.getAssetList()
            java.util.List r4 = r3.mapCloudAssets(r0)
            java.util.List r0 = r2.getTagList()
            java.util.List r5 = r3.mapAlbums(r0)
            java.util.List r0 = r2.getAssetList()
            kotlin.Pair r1 = r3.mapNewAddedAndDeletedRelations(r0)
            cn.ever.cloud.network.entity.NUserProfile r0 = r2.getUserProfile()
            cn.ever.cloud.android.entity.Storage r8 = r3.mapUserProfile(r0)
            cn.ever.cloud.android.remote.PullUpdateResult r3 = new cn.ever.cloud.android.remote.PullUpdateResult
            java.lang.Object r6 = r1.getFirst()
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r7 = r1.getSecond()
            java.util.List r7 = (java.util.List) r7
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L86:
            kotlin.ResultKt.throwOnFailure(r1)
            cn.ever.cloud.utils.LogHelper r2 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.String r0 = "getUpdates, cursor:"
            java.lang.String r1 = p002O.C0002O.m25086C(r0, r11)
            java.lang.String r0 = "SyncRemoteRepo"
            r2.m20555d(r0, r1)
            cn.ever.cloud.network.entity.NGetUpdatesRequest r1 = new cn.ever.cloud.network.entity.NGetUpdatesRequest
            r1.<init>(r11)
            cn.ever.cloud.network.api.a r0 = r10.apiClient
            r4.L$0 = r10
            r4.label = r5
            java.lang.Object r1 = r0.getUpdates(r1, r4)
            if (r1 != r3) goto La8
            return r3
        La8:
            r3 = r10
            goto L3c
        Laa:
            cn.ever.cloud.android.remote.SyncRemoteRepo$getUpdates$1 r4 = new cn.ever.cloud.android.remote.SyncRemoteRepo$getUpdates$1
            r4.<init>(r10, r12)
            goto L29
        Lb1:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.remote.SyncRemoteRepo.getUpdates(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
