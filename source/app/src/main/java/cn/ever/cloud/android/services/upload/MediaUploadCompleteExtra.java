package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class MediaUploadCompleteExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int assetType;
    public final long createdAtUtc;
    public final Long durationMs;
    public final long height;
    public final int orientation;
    public final long tagAddedAtUtc;
    public final long takenAtUtc;
    public final long width;

    static {
        Covode.recordClassIndex(3128);
    }

    public static /* synthetic */ MediaUploadCompleteExtra copy$default(MediaUploadCompleteExtra mediaUploadCompleteExtra, long j, long j2, long j3, long j4, int i, Long l, long j5, int i2, int i3, Object obj) {
        long j6 = j;
        long j7 = j3;
        long j8 = j2;
        Long l2 = l;
        long j9 = j4;
        int i4 = i;
        long j10 = j5;
        int i5 = i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{mediaUploadCompleteExtra, new Long(j6), new Long(j8), new Long(j7), new Long(j9), Integer.valueOf(i4), l2, new Long(j10), Integer.valueOf(i5), Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (MediaUploadCompleteExtra) proxy.result;
        }
        if ((i3 & 1) != 0) {
            j6 = mediaUploadCompleteExtra.takenAtUtc;
        }
        if ((i3 & 2) != 0) {
            j8 = mediaUploadCompleteExtra.createdAtUtc;
        }
        if ((i3 & 4) != 0) {
            j7 = mediaUploadCompleteExtra.width;
        }
        if ((i3 & 8) != 0) {
            j9 = mediaUploadCompleteExtra.height;
        }
        if ((i3 & 16) != 0) {
            i4 = mediaUploadCompleteExtra.orientation;
        }
        if ((i3 & 32) != 0) {
            l2 = mediaUploadCompleteExtra.durationMs;
        }
        if ((i3 & 64) != 0) {
            j10 = mediaUploadCompleteExtra.tagAddedAtUtc;
        }
        if ((i3 & 128) != 0) {
            i5 = mediaUploadCompleteExtra.assetType;
        }
        return mediaUploadCompleteExtra.copy(j6, j8, j7, j9, i4, l2, j10, i5);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.takenAtUtc), Long.valueOf(this.createdAtUtc), Long.valueOf(this.width), Long.valueOf(this.height), Integer.valueOf(this.orientation), this.durationMs, Long.valueOf(this.tagAddedAtUtc), Integer.valueOf(this.assetType)};
    }

    public final long component1() {
        return this.takenAtUtc;
    }

    public final long component2() {
        return this.createdAtUtc;
    }

    public final long component3() {
        return this.width;
    }

    public final long component4() {
        return this.height;
    }

    public final int component5() {
        return this.orientation;
    }

    public final Long component6() {
        return this.durationMs;
    }

    public final long component7() {
        return this.tagAddedAtUtc;
    }

    public final int component8() {
        return this.assetType;
    }

    public final MediaUploadCompleteExtra copy(long j, long j2, long j3, long j4, int i, Long l, long j5, int i2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), l, new Long(j5), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (MediaUploadCompleteExtra) proxy.result : new MediaUploadCompleteExtra(j, j2, j3, j4, i, l, j5, i2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaUploadCompleteExtra) {
            return C106862S5w.LIZ(((MediaUploadCompleteExtra) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("MediaUploadCompleteExtra:%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final int getAssetType() {
        return this.assetType;
    }

    public final long getCreatedAtUtc() {
        return this.createdAtUtc;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final long getHeight() {
        return this.height;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final long getTagAddedAtUtc() {
        return this.tagAddedAtUtc;
    }

    public final long getTakenAtUtc() {
        return this.takenAtUtc;
    }

    public final long getWidth() {
        return this.width;
    }

    public MediaUploadCompleteExtra(long j, long j2, long j3, long j4, int i, Long l, long j5, int i2) {
        this.takenAtUtc = j;
        this.createdAtUtc = j2;
        this.width = j3;
        this.height = j4;
        this.orientation = i;
        this.durationMs = l;
        this.tagAddedAtUtc = j5;
        this.assetType = i2;
    }
}
