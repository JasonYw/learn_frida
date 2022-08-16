package cn.ever.cloud.android.services;

import android.net.Uri;
import android.util.Base64;
import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.android.entity.AssetIdUtil;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.LocalAsset;
import cn.ever.cloud.android.entity.Media;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.utils.AesUtil;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.ClientError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C522176k7;

/* loaded from: classes23.dex */
public final class AssetService {
    public static final C522176k7 Companion = new C522176k7((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0729a apiClient;
    public final AbstractC0680b assetRepository;

    static {
        Covode.recordClassIndex(2983);
    }

    public final List<Asset> getAssetsByRelations(List<AlbumAssetRelation> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        return relationToAssets(list);
    }

    private final String formatCursor(AlbumAssetRelation albumAssetRelation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumAssetRelation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(albumAssetRelation.getAddTime());
        sb.append('_');
        sb.append(albumAssetRelation.getTakenTime());
        sb.append('_');
        sb.append(albumAssetRelation.getLinkId());
        return sb.toString();
    }

    public final List<Asset> getAssetInfo(List<String> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (String str : list) {
            arrayList.add(Long.valueOf(AssetIdUtil.INSTANCE.parseAssetId(str, AssetIdUtil.AssetIdType.LINK_ID)));
        }
        return relationToAssets(this.assetRepository.getAlbumAssetRelationsByLinkId(arrayList));
    }

    public final List<String> importUpsertChangeMedias(List<Media> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        List<LocalAsset> mediaToLocalAsset = mediaToLocalAsset(list);
        this.assetRepository.upsertLocalAssets(mediaToLocalAsset);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(mediaToLocalAsset, 10));
        for (LocalAsset localAsset : mediaToLocalAsset) {
            arrayList.add(AssetIdUtil.INSTANCE.idToString(localAsset.getLocalId(), AssetIdUtil.AssetIdType.LOCAL_ID));
        }
        ArrayList arrayList2 = arrayList;
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("AssetService", "importUpsertChangeMedias return ids:" + arrayList2);
        return arrayList2;
    }

    private final List<LocalAsset> mediaToLocalAsset(List<Media> list) {
        boolean z;
        String uri;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (Media media : list) {
            Uri parse = Uri.parse(media.getUriOrPath());
            Intrinsics.checkNotNullExpressionValue(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null && scheme.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = parse.toString();
                uri = null;
            } else {
                uri = parse.toString();
                str = null;
            }
            arrayList.add(new LocalAsset(media.getMediaId(), uri, str, media.getTakenMs(), media.getDurationMs(), media.getMime(), media.getWidth(), media.getHeight(), media.getDeleteOnEnd()));
        }
        return arrayList;
    }

    private final Triple<Long, Long, Long> parseCursor(String str) {
        long j;
        long j2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (Triple) proxy.result;
        }
        long j3 = 0;
        if (str == null || str.length() == 0) {
            j = Long.MAX_VALUE;
            if (1 != 0) {
                j2 = Long.MAX_VALUE;
                return new Triple<>(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
            }
        }
        List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null);
        if (split$default.size() >= 3) {
            j = Long.parseLong((String) split$default.get(0));
            j2 = Long.parseLong((String) split$default.get(1));
            j3 = Long.parseLong((String) split$default.get(2));
            return new Triple<>(Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3));
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20554e("AssetService", "split.size:" + split$default.size());
        ClientError.Companion companion = ClientError.Companion;
        throw companion.internal("cursor parse err, size:" + split$default + ".size");
    }

    private final List<Asset> relationToAssets(List<AlbumAssetRelation> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AlbumAssetRelation) obj).hasCloud()) {
                arrayList.add(obj);
            }
        }
        ArrayList<AlbumAssetRelation> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (AlbumAssetRelation albumAssetRelation : arrayList2) {
            arrayList3.add(Long.valueOf(albumAssetRelation.getCloudId()));
        }
        List<CloudAsset> cloudAssets = this.assetRepository.getCloudAssets(arrayList3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(cloudAssets, 10)), 16));
        for (Object obj2 : cloudAssets) {
            linkedHashMap.put(Long.valueOf(((CloudAsset) obj2).getCloudId()), obj2);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : list) {
            if (((AlbumAssetRelation) obj3).hasLocal()) {
                arrayList4.add(obj3);
            }
        }
        ArrayList<AlbumAssetRelation> arrayList5 = arrayList4;
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
        for (AlbumAssetRelation albumAssetRelation2 : arrayList5) {
            arrayList6.add(Long.valueOf(albumAssetRelation2.getLocalId()));
        }
        List<LocalAsset> localAssets = this.assetRepository.getLocalAssets(arrayList6);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(localAssets, 10)), 16));
        for (Object obj4 : localAssets) {
            linkedHashMap2.put(Long.valueOf(((LocalAsset) obj4).getLocalId()), obj4);
        }
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (AlbumAssetRelation albumAssetRelation3 : list) {
            Asset asset = null;
            if (albumAssetRelation3.hasCloud()) {
                CloudAsset cloudAsset = (CloudAsset) linkedHashMap.get(Long.valueOf(albumAssetRelation3.getCloudId()));
                if (cloudAsset != null) {
                    asset = Asset.Companion.fromCloud(cloudAsset, albumAssetRelation3.getLinkId());
                } else {
                    ClientError.Companion companion = ClientError.Companion;
                    throw companion.internal("hasCloud , cloudAsset null:" + albumAssetRelation3);
                }
            }
            if (albumAssetRelation3.hasLocal()) {
                LocalAsset localAsset = (LocalAsset) linkedHashMap2.get(Long.valueOf(albumAssetRelation3.getLocalId()));
                if (localAsset != null) {
                    if (asset == null) {
                        asset = Asset.Companion.fromLocal(localAsset, albumAssetRelation3.getLinkId());
                    } else {
                        asset.attachLocal$sdk_impl_douyin_release(localAsset);
                        arrayList7.add(asset);
                    }
                } else {
                    ClientError.Companion companion2 = ClientError.Companion;
                    throw companion2.internal("has not Cloud , localAsset null:" + albumAssetRelation3);
                }
            }
            if (asset == null) {
                throw ClientError.Companion.internal("has no cloud no local, asset is null");
            }
            arrayList7.add(asset);
        }
        return arrayList7;
    }

    public AssetService(AbstractC0680b abstractC0680b, AbstractC0729a abstractC0729a) {
        C106862S5w.LIZ(abstractC0680b, abstractC0729a);
        this.assetRepository = abstractC0680b;
        this.apiClient = abstractC0729a;
    }

    public final byte[] decrypt(String str, byte[] bArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, bArr}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (byte[]) proxy.result;
        }
        C106862S5w.LIZ(str, bArr);
        Asset asset = (Asset) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) getAssetInfo(CollectionsKt__CollectionsJVMKt.listOf(str)));
        if (asset != null) {
            AesUtil aesUtil = AesUtil.INSTANCE;
            byte[] decode = Base64.decode(asset.getKey$sdk_impl_douyin_release(), 0);
            Intrinsics.checkNotNullExpressionValue(decode, "");
            return aesUtil.decrypt(bArr, decode);
        }
        throw new NullPointerException(C0002O.m25086C("get asset is null, assetId: ", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01f0 -> B:15:0x0054). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getVideoInfo(java.util.List<java.lang.String> r23, kotlin.coroutines.Continuation<? super java.util.List<cn.ever.cloud.android.entity.VideoInfo>> r24) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.AssetService.getVideoInfo(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final PageData<Asset> fetchAssets(long j, String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (PageData) proxy.result;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("AssetService", "fetchAssets albumId:" + j + ", cursor:" + str + ", count:" + i);
        Triple<Long, Long, Long> parseCursor = parseCursor(str);
        List<AlbumAssetRelation> albumAssetRelation = this.assetRepository.getAlbumAssetRelation(j, parseCursor.component1().longValue(), parseCursor.component2().longValue(), parseCursor.component3().longValue(), i);
        LogHelper logHelper2 = LogHelper.INSTANCE;
        logHelper2.m20555d("AssetService", "fetchAssets complete, albumId:" + j + ", cursor:" + str + ", count:" + albumAssetRelation.size());
        if (albumAssetRelation.isEmpty()) {
            return new PageData<>(false, str, CollectionsKt__CollectionsKt.emptyList());
        }
        boolean z = false;
        List<Asset> relationToAssets = relationToAssets(albumAssetRelation);
        AlbumAssetRelation albumAssetRelation2 = (AlbumAssetRelation) CollectionsKt___CollectionsKt.last((List<? extends Object>) albumAssetRelation);
        if (relationToAssets.size() >= i) {
            z = true;
        }
        return new PageData<>(z, formatCursor(albumAssetRelation2), relationToAssets);
    }
}
