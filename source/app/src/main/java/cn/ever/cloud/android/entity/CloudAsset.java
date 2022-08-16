package cn.ever.cloud.android.entity;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C522146k4;

/* loaded from: classes23.dex */
public final class CloudAsset {
    public static final C522146k4 Companion = new C522146k4((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String aesEncKey;
    public final long cloudId;
    public final Long durationMs;
    public final int height;
    public final String md5;
    public final String mime;
    public final String previewUrl;
    public final Long size;
    public final int status;
    public final String subType;
    public final long takenMs;
    public final String thumbnailUrl;
    public final int type;
    public final int width;

    static {
        Covode.recordClassIndex(2856);
    }

    public static /* synthetic */ CloudAsset copy$default(CloudAsset cloudAsset, long j, String str, long j2, Long l, int i, String str2, String str3, int i2, int i3, int i4, String str4, String str5, String str6, Long l2, int i5, Object obj) {
        long j3 = j;
        String str7 = str;
        String str8 = str3;
        String str9 = str2;
        int i6 = i;
        int i7 = i2;
        long j4 = j2;
        Long l3 = l;
        int i8 = i4;
        String str10 = str6;
        int i9 = i3;
        String str11 = str4;
        Long l4 = l2;
        String str12 = str5;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cloudAsset, new Long(j3), str7, new Long(j4), l3, Integer.valueOf(i6), str9, str8, Integer.valueOf(i7), Integer.valueOf(i9), Integer.valueOf(i8), str11, str12, str10, l4, Integer.valueOf(i5), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (CloudAsset) proxy.result;
        }
        if ((i5 & 1) != 0) {
            j3 = cloudAsset.cloudId;
        }
        if ((i5 & 2) != 0) {
            str7 = cloudAsset.md5;
        }
        if ((i5 & 4) != 0) {
            j4 = cloudAsset.takenMs;
        }
        if ((i5 & 8) != 0) {
            l3 = cloudAsset.durationMs;
        }
        if ((i5 & 16) != 0) {
            i6 = cloudAsset.type;
        }
        if ((i5 & 32) != 0) {
            str9 = cloudAsset.subType;
        }
        if ((i5 & 64) != 0) {
            str8 = cloudAsset.mime;
        }
        if ((i5 & 128) != 0) {
            i7 = cloudAsset.width;
        }
        if ((i5 & 256) != 0) {
            i9 = cloudAsset.height;
        }
        if ((i5 & 512) != 0) {
            i8 = cloudAsset.status;
        }
        if ((i5 & AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END) != 0) {
            str11 = cloudAsset.previewUrl;
        }
        if ((i5 & AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED) != 0) {
            str12 = cloudAsset.thumbnailUrl;
        }
        if ((i5 & AccessibilityEventCompat.TYPE_VIEW_SCROLLED) != 0) {
            str10 = cloudAsset.aesEncKey;
        }
        if ((i5 & 8192) != 0) {
            l4 = cloudAsset.size;
        }
        return cloudAsset.copy(j3, str7, j4, l3, i6, str9, str8, i7, i9, i8, str11, str12, str10, l4);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.cloudId), this.md5, Long.valueOf(this.takenMs), this.durationMs, Integer.valueOf(this.type), this.subType, this.mime, Integer.valueOf(this.width), Integer.valueOf(this.height), Integer.valueOf(this.status), this.previewUrl, this.thumbnailUrl, this.aesEncKey, this.size};
    }

    public final long component1() {
        return this.cloudId;
    }

    public final int component10() {
        return this.status;
    }

    public final String component11() {
        return this.previewUrl;
    }

    public final String component12() {
        return this.thumbnailUrl;
    }

    public final String component13() {
        return this.aesEncKey;
    }

    public final Long component14() {
        return this.size;
    }

    public final String component2() {
        return this.md5;
    }

    public final long component3() {
        return this.takenMs;
    }

    public final Long component4() {
        return this.durationMs;
    }

    public final int component5() {
        return this.type;
    }

    public final String component6() {
        return this.subType;
    }

    public final String component7() {
        return this.mime;
    }

    public final int component8() {
        return this.width;
    }

    public final int component9() {
        return this.height;
    }

    public final CloudAsset copy(long j, String str, long j2, Long l, int i, String str2, String str3, int i2, int i3, int i4, String str4, String str5, String str6, Long l2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), l, Integer.valueOf(i), str2, str3, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str4, str5, str6, l2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (CloudAsset) proxy.result;
        }
        C106862S5w.LIZ(str, str3);
        return new CloudAsset(j, str, j2, l, i, str2, str3, i2, i3, i4, str4, str5, str6, l2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof CloudAsset) {
            return C106862S5w.LIZ(((CloudAsset) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CloudAsset:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getAesEncKey() {
        return this.aesEncKey;
    }

    public final long getCloudId() {
        return this.cloudId;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMime() {
        return this.mime;
    }

    public final String getPreviewUrl() {
        return this.previewUrl;
    }

    public final Long getSize() {
        return this.size;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final long getTakenMs() {
        return this.takenMs;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isDeleted() {
        int i = this.status;
        if (i != 404 && i != 999) {
            return false;
        }
        return true;
    }

    public CloudAsset(long j, String str, long j2, Long l, int i, String str2, String str3, int i2, int i3, int i4, String str4, String str5, String str6, Long l2) {
        C106862S5w.LIZ(str, str3);
        this.cloudId = j;
        this.md5 = str;
        this.takenMs = j2;
        this.durationMs = l;
        this.type = i;
        this.subType = str2;
        this.mime = str3;
        this.width = i2;
        this.height = i3;
        this.status = i4;
        this.previewUrl = str4;
        this.thumbnailUrl = str5;
        this.aesEncKey = str6;
        this.size = l2;
    }

    public /* synthetic */ CloudAsset(long j, String str, long j2, Long l, int i, String str2, String str3, int i2, int i3, int i4, String str4, String str5, String str6, Long l2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, (i5 & 8) != 0 ? null : l, i, str2, str3, i2, i3, i4, str4, str5, str6, l2);
    }
}
