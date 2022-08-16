package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.io.File;
import kotlin.Deprecated;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcAsset {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final Long cloudId;
    public final Long durationMs;
    public final int height;
    public final boolean isDeleted;
    public final Long mediaId;
    public final String mime;
    public final String path;
    public final String previewUrl;
    public final Long size;
    public final String thumbnailUrl;
    public final int type;
    public final String uri;
    public final int width;

    static {
        Covode.recordClassIndex(3391);
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final Long getCloudId() {
        return this.cloudId;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final int getHeight() {
        return this.height;
    }

    public final Long getMediaId() {
        return this.mediaId;
    }

    public final String getMime() {
        return this.mime;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final Long getSize() {
        return this.size;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isVideo() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public final boolean hasCloud() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Long l = this.cloudId;
        if (l == null || l.longValue() == 0) {
            return false;
        }
        return true;
    }

    @Deprecated(message = "the result inaccurate")
    public final boolean hasLocal() {
        try {
            if (this.mediaId == null) {
                return false;
            }
            String str = this.path;
            if (str == null || str.length() == 0 || !new File(this.path).exists()) {
                String str2 = this.uri;
                if (str2 == null || str2.length() == 0) {
                    return false;
                }
                if (!new File(this.uri).exists()) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "EcAsset(assetId=" + this.assetId + "\npath: " + this.path + "\nwidth: " + this.width + "\nheight: " + this.height + LoggerUtil.S_RIGHT_TAG;
    }

    public EcAsset(String str, Long l, String str2, String str3, Long l2, int i, int i2, String str4, Long l3, Long l4, int i3, boolean z, String str5, String str6) {
        C106862S5w.LIZ(str);
        this.assetId = str;
        this.mediaId = l;
        this.path = str2;
        this.uri = str3;
        this.cloudId = l2;
        this.width = i;
        this.height = i2;
        this.mime = str4;
        this.durationMs = l3;
        this.size = l4;
        this.type = i3;
        this.isDeleted = z;
        this.previewUrl = str5;
        this.thumbnailUrl = str6;
    }
}
