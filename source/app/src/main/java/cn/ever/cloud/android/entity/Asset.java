package cn.ever.cloud.android.entity;

import cn.ever.cloud.android.entity.AssetIdUtil;
import cn.ever.cloud.utils.KotlinExtKt;
import cn.ever.cloud.utils.error.ClientError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class Asset {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public CloudAsset cloudAsset;
    public LocalAsset localAsset;

    static {
        Covode.recordClassIndex(2850);
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2851);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTypeByMime(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            if (StringsKt__StringsJVMKt.startsWith$default(str, "image", false, 2, null)) {
                return 1;
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(str, "video", false, 2, null)) {
                return 0;
            }
            return 2;
        }

        public final Asset fromCloud(CloudAsset cloudAsset, long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cloudAsset, new Long(j)}, this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (Asset) proxy.result;
            }
            C106862S5w.LIZ(cloudAsset);
            if (j != 0) {
                return new Asset(AssetIdUtil.INSTANCE.idToString(j, AssetIdUtil.AssetIdType.LINK_ID)).attachCloud$sdk_impl_douyin_release(cloudAsset);
            }
            throw ClientError.Companion.internal("create fromCloud linkId empty");
        }

        public final Asset fromLocal(LocalAsset localAsset, long j) {
            String idToString;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{localAsset, new Long(j)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (Asset) proxy.result;
            }
            C106862S5w.LIZ(localAsset);
            if (j != 0) {
                idToString = AssetIdUtil.INSTANCE.idToString(j, AssetIdUtil.AssetIdType.LINK_ID);
            } else {
                idToString = AssetIdUtil.INSTANCE.idToString(localAsset.getLocalId(), AssetIdUtil.AssetIdType.LOCAL_ID);
            }
            return new Asset(idToString).attachLocal$sdk_impl_douyin_release(localAsset);
        }
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final CloudAsset getCloudAsset$sdk_impl_douyin_release() {
        return this.cloudAsset;
    }

    public final LocalAsset getLocalAsset$sdk_impl_douyin_release() {
        return this.localAsset;
    }

    public final String getKey$sdk_impl_douyin_release() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            return cloudAsset.getAesEncKey();
        }
        return null;
    }

    public final String getPath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        LocalAsset localAsset = this.localAsset;
        if (localAsset != null) {
            return localAsset.getPath();
        }
        return null;
    }

    public final String getPreviewUrl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            return cloudAsset.getPreviewUrl();
        }
        return null;
    }

    public final Long getSize() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            return cloudAsset.getSize();
        }
        return null;
    }

    public final String getThumbnailUrl() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            return cloudAsset.getThumbnailUrl();
        }
        return null;
    }

    public final String getUri() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        LocalAsset localAsset = this.localAsset;
        if (localAsset != null) {
            return localAsset.getUri();
        }
        return null;
    }

    public final Long getCloudId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            return Long.valueOf(cloudAsset.getCloudId());
        }
        return null;
    }

    public final Long getDuration() {
        Long durationMs;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset == null || (durationMs = cloudAsset.getDurationMs()) == null) {
            LocalAsset localAsset = this.localAsset;
            if (localAsset != null) {
                return localAsset.getDurationMs();
            }
            return null;
        }
        return durationMs;
    }

    public final int getHeight() {
        int height;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            height = cloudAsset.getHeight();
        } else {
            LocalAsset localAsset = this.localAsset;
            if (localAsset == null) {
                return 0;
            }
            height = localAsset.getHeight();
        }
        Integer valueOf = Integer.valueOf(height);
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public final Long getMediaId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        LocalAsset localAsset = this.localAsset;
        if (localAsset != null) {
            return Long.valueOf(localAsset.getLocalId());
        }
        return null;
    }

    public final String getMime() {
        String mime;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset == null || (mime = cloudAsset.getMime()) == null) {
            LocalAsset localAsset = this.localAsset;
            if (localAsset != null) {
                return localAsset.getMime();
            }
            return null;
        }
        return mime;
    }

    public final int getType() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            return cloudAsset.getType();
        }
        Companion companion = Companion;
        LocalAsset localAsset = this.localAsset;
        if (localAsset != null) {
            str = localAsset.getMime();
        } else {
            str = null;
        }
        return companion.getTypeByMime(KotlinExtKt.getOrDefault(str));
    }

    public final int getWidth() {
        int width;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset != null) {
            width = cloudAsset.getWidth();
        } else {
            LocalAsset localAsset = this.localAsset;
            if (localAsset == null) {
                return 0;
            }
            width = localAsset.getWidth();
        }
        Integer valueOf = Integer.valueOf(width);
        if (valueOf == null) {
            return 0;
        }
        return valueOf.intValue();
    }

    public final boolean isDeleted() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CloudAsset cloudAsset = this.cloudAsset;
        if (cloudAsset == null) {
            return false;
        }
        return cloudAsset.isDeleted();
    }

    public final void setCloudAsset$sdk_impl_douyin_release(CloudAsset cloudAsset) {
        this.cloudAsset = cloudAsset;
    }

    public final void setLocalAsset$sdk_impl_douyin_release(LocalAsset localAsset) {
        this.localAsset = localAsset;
    }

    public Asset(String str) {
        C106862S5w.LIZ(str);
        this.assetId = str;
    }

    public final Asset attachCloud$sdk_impl_douyin_release(CloudAsset cloudAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cloudAsset}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (Asset) proxy.result;
        }
        C106862S5w.LIZ(cloudAsset);
        this.cloudAsset = cloudAsset;
        return this;
    }

    public final Asset attachLocal$sdk_impl_douyin_release(LocalAsset localAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{localAsset}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (Asset) proxy.result;
        }
        C106862S5w.LIZ(localAsset);
        this.localAsset = localAsset;
        return this;
    }
}
