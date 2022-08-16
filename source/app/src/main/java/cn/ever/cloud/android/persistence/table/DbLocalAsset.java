package cn.ever.cloud.android.persistence.table;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DbLocalAsset {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean deleteOnEnd;
    public final Long durationMs;
    public final int height;
    public final long mediaId;
    public final String mime;
    public final String path;
    public final long takenMs;
    public final String uri;
    public final int width;

    static {
        Covode.recordClassIndex(2942);
    }

    public static /* synthetic */ DbLocalAsset copy$default(DbLocalAsset dbLocalAsset, long j, String str, String str2, long j2, Long l, String str3, int i, int i2, boolean z, int i3, Object obj) {
        long j3 = j;
        String str4 = str2;
        String str5 = str;
        long j4 = j2;
        String str6 = str3;
        Long l2 = l;
        int i4 = i2;
        int i5 = i;
        boolean z2 = z;
        byte b = z2 ? (byte) 1 : (byte) 0;
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbLocalAsset, new Long(j3), str5, str4, new Long(j4), l2, str6, Integer.valueOf(i5), Integer.valueOf(i4), Byte.valueOf(b), Integer.valueOf(i3), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbLocalAsset) proxy.result;
        }
        if ((i3 & 1) != 0) {
            j3 = dbLocalAsset.mediaId;
        }
        if ((i3 & 2) != 0) {
            str5 = dbLocalAsset.uri;
        }
        if ((i3 & 4) != 0) {
            str4 = dbLocalAsset.path;
        }
        if ((i3 & 8) != 0) {
            j4 = dbLocalAsset.takenMs;
        }
        if ((i3 & 16) != 0) {
            l2 = dbLocalAsset.durationMs;
        }
        if ((i3 & 32) != 0) {
            str6 = dbLocalAsset.mime;
        }
        if ((i3 & 64) != 0) {
            i5 = dbLocalAsset.width;
        }
        if ((i3 & 128) != 0) {
            i4 = dbLocalAsset.height;
        }
        if ((i3 & 256) != 0) {
            z2 = dbLocalAsset.deleteOnEnd;
        }
        boolean z3 = z2 ? 1 : 0;
        Object[] objArr = z2 ? 1 : 0;
        return dbLocalAsset.copy(j3, str5, str4, j4, l2, str6, i5, i4, z3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.mediaId), this.uri, this.path, Long.valueOf(this.takenMs), this.durationMs, this.mime, Integer.valueOf(this.width), Integer.valueOf(this.height), Boolean.valueOf(this.deleteOnEnd)};
    }

    public final long component1() {
        return this.mediaId;
    }

    public final String component2() {
        return this.uri;
    }

    public final String component3() {
        return this.path;
    }

    public final long component4() {
        return this.takenMs;
    }

    public final Long component5() {
        return this.durationMs;
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

    public final DbLocalAsset copy(long j, String str, String str2, long j2, Long l, String str3, int i, int i2, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2, new Long(j2), l, str3, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DbLocalAsset) proxy.result;
        }
        C106862S5w.LIZ(str3);
        return new DbLocalAsset(j, str, str2, j2, l, str3, i, i2, z);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DbLocalAsset) {
            return C106862S5w.LIZ(((DbLocalAsset) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DbLocalAsset:%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
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

    public final String getPath() {
        return this.path;
    }

    public final long getTakenMs() {
        return this.takenMs;
    }

    public final String getUri() {
        return this.uri;
    }

    public final int getWidth() {
        return this.width;
    }

    public DbLocalAsset(long j, String str, String str2, long j2, Long l, String str3, int i, int i2, boolean z) {
        C106862S5w.LIZ(str3);
        this.mediaId = j;
        this.uri = str;
        this.path = str2;
        this.takenMs = j2;
        this.durationMs = l;
        this.mime = str3;
        this.width = i;
        this.height = i2;
        this.deleteOnEnd = z;
    }

    public /* synthetic */ DbLocalAsset(long j, String str, String str2, long j2, Long l, String str3, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, j2, (i3 & 16) != 0 ? null : l, str3, i, i2, z);
    }
}
