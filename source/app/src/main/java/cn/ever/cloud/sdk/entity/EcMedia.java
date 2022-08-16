package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcMedia {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean deleteOnEnd;
    public final Long durationMs;
    public final int height;
    public final long mediaId;
    public final String mime;
    public final long takenMs;
    public final int type;
    public final String uriOrPath;
    public final int width;

    static {
        Covode.recordClassIndex(3394);
    }

    public static /* synthetic */ EcMedia copy$default(EcMedia ecMedia, long j, String str, long j2, Long l, int i, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        String str3 = str;
        long j3 = j;
        Long l2 = l;
        long j4 = j2;
        String str4 = str2;
        int i5 = i;
        int i6 = i3;
        int i7 = i2;
        boolean z2 = z;
        byte b = z2 ? (byte) 1 : (byte) 0;
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecMedia, new Long(j3), str3, new Long(j4), l2, Integer.valueOf(i5), str4, Integer.valueOf(i7), Integer.valueOf(i6), Byte.valueOf(b), Integer.valueOf(i4), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcMedia) proxy.result;
        }
        if ((i4 & 1) != 0) {
            j3 = ecMedia.mediaId;
        }
        if ((i4 & 2) != 0) {
            str3 = ecMedia.uriOrPath;
        }
        if ((i4 & 4) != 0) {
            j4 = ecMedia.takenMs;
        }
        if ((i4 & 8) != 0) {
            l2 = ecMedia.durationMs;
        }
        if ((i4 & 16) != 0) {
            i5 = ecMedia.type;
        }
        if ((i4 & 32) != 0) {
            str4 = ecMedia.mime;
        }
        if ((i4 & 64) != 0) {
            i7 = ecMedia.width;
        }
        if ((i4 & 128) != 0) {
            i6 = ecMedia.height;
        }
        if ((i4 & 256) != 0) {
            z2 = ecMedia.deleteOnEnd;
        }
        boolean z3 = z2 ? 1 : 0;
        Object[] objArr = z2 ? 1 : 0;
        return ecMedia.copy(j3, str3, j4, l2, i5, str4, i7, i6, z3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.mediaId), this.uriOrPath, Long.valueOf(this.takenMs), this.durationMs, Integer.valueOf(this.type), this.mime, Integer.valueOf(this.width), Integer.valueOf(this.height), Boolean.valueOf(this.deleteOnEnd)};
    }

    @Deprecated(message = "Deprecated")
    public static /* synthetic */ void getType$annotations() {
    }

    public final long component1() {
        return this.mediaId;
    }

    public final String component2() {
        return this.uriOrPath;
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
        return this.mime;
    }

    public final int component7() {
        return this.width;
    }

    public final int component8() {
        return this.height;
    }

    public final boolean component9() {
        return this.deleteOnEnd;
    }

    public final EcMedia copy(long j, String str, long j2, Long l, int i, String str2, int i2, int i3, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), l, Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcMedia) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new EcMedia(j, str, j2, l, i, str2, i2, i3, z);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcMedia) {
            return C106862S5w.LIZ(((EcMedia) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcMedia:%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final boolean getDeleteOnEnd() {
        return this.deleteOnEnd;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getMediaId() {
        return this.mediaId;
    }

    public final String getMime() {
        return this.mime;
    }

    public final long getTakenMs() {
        return this.takenMs;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUriOrPath() {
        return this.uriOrPath;
    }

    public final int getWidth() {
        return this.width;
    }

    public EcMedia(long j, String str, long j2, Long l, int i, String str2, int i2, int i3, boolean z) {
        C106862S5w.LIZ(str, str2);
        this.mediaId = j;
        this.uriOrPath = str;
        this.takenMs = j2;
        this.durationMs = l;
        this.type = i;
        this.mime = str2;
        this.width = i2;
        this.height = i3;
        this.deleteOnEnd = z;
    }

    public /* synthetic */ EcMedia(long j, String str, long j2, Long l, int i, String str2, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, j2, (i4 & 8) != 0 ? null : l, i, str2, i2, i3, (i4 & 256) != 0 ? false : z);
    }
}
