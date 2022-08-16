package cn.ever.cloud.android;

import cn.ever.cloud.android.entity.AlbumAssetRelation;
import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.android.entity.CloudAsset;
import cn.ever.cloud.android.entity.LocalAsset;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.remote.SyncRemoteRepoKt;
import cn.ever.cloud.android.runtime.RuntimeExtManager;
import cn.ever.cloud.android.services.AssetService;
import cn.ever.cloud.android.services.upload.AbstractC0727a;
import cn.ever.cloud.android.services.upload.MediaUploadCompleteExtra;
import cn.ever.cloud.android.services.upload.UploadMedia;
import cn.ever.cloud.network.entity.NAsset;
import cn.ever.cloud.network.entity.NTagV2;
import cn.ever.cloud.utils.KotlinExtKt;
import cn.ever.cloud.utils.Result;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.ErrorCode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class MediaUploadCompleterImpl implements AbstractC0727a {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0680b assetRepository;
    public final AssetService assetService;
    public final RuntimeExtManager runtimeExtManager;

    static {
        Covode.recordClassIndex(2741);
    }

    @Override // cn.ever.cloud.android.services.upload.AbstractC0727a
    public final MediaUploadCompleteExtra uploadCompleteExtra(UploadMedia uploadMedia) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (MediaUploadCompleteExtra) proxy.result;
        }
        C106862S5w.LIZ(uploadMedia);
        AlbumAssetRelation albumAssetRelationByLinkId = this.assetRepository.getAlbumAssetRelationByLinkId(uploadMedia.getLinkId());
        if (albumAssetRelationByLinkId != null) {
            Asset asset = (Asset) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.assetService.getAssetInfo(CollectionsKt__CollectionsJVMKt.listOf(uploadMedia.getAssetId())));
            if (asset != null) {
                LocalAsset localAsset$sdk_impl_douyin_release = asset.getLocalAsset$sdk_impl_douyin_release();
                if (localAsset$sdk_impl_douyin_release != null) {
                    return new MediaUploadCompleteExtra(localAsset$sdk_impl_douyin_release.getTakenMs(), localAsset$sdk_impl_douyin_release.getTakenMs(), localAsset$sdk_impl_douyin_release.getWidth(), localAsset$sdk_impl_douyin_release.getHeight(), 0, localAsset$sdk_impl_douyin_release.getDurationMs(), albumAssetRelationByLinkId.getAddTime(), asset.getType());
                }
                throw new ClientError(ErrorCode.CLIENT_ASSET_NOT_FOUND);
            }
            throw new ClientError(ErrorCode.CLIENT_ASSET_NOT_FOUND);
        }
        throw new ClientError(ErrorCode.CLIENT_ASSET_NOT_FOUND);
    }

    @Override // cn.ever.cloud.android.services.upload.AbstractC0727a
    public final Result<Long> importCloudAsset(NAsset nAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nAsset}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(nAsset);
        try {
            CloudAsset cloudAsset = SyncRemoteRepoKt.toCloudAsset(nAsset);
            this.assetRepository.upsertCloudAssets(CollectionsKt__CollectionsJVMKt.listOf(cloudAsset));
            ArrayList arrayList = new ArrayList();
            for (NTagV2 nTagV2 : nAsset.getTagsV2()) {
                arrayList.add(new AlbumAssetRelation(KotlinExtKt.getOrDefault(nTagV2.getLinkId()), nTagV2.getTagId(), 0L, nAsset.getId(), nTagV2.getAddedAtUtc(), KotlinExtKt.getOrDefault(nAsset.getTakenUtc()), (int) KotlinExtKt.getOrDefault(Long.valueOf(nAsset.getStatus()))));
            }
            this.assetRepository.upsertAlbumAssetRelation(arrayList);
            return Result.Companion.success(Long.valueOf(cloudAsset.getCloudId()));
        } catch (Exception e) {
            return Result.Companion.failure(e);
        }
    }

    public MediaUploadCompleterImpl(AbstractC0680b abstractC0680b, AssetService assetService, RuntimeExtManager runtimeExtManager) {
        C106862S5w.LIZ(abstractC0680b, assetService, runtimeExtManager);
        this.assetRepository = abstractC0680b;
        this.assetService = assetService;
        this.runtimeExtManager = runtimeExtManager;
    }
}
