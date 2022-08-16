package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AlbumAssetRelation {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long addTime;
    public final long albumId;
    public final long cloudId;
    public final long linkId;
    public final long localId;
    public final int status;
    public final long takenTime;

    static {
        Covode.recordClassIndex(2848);
    }

    public static /* synthetic */ AlbumAssetRelation copy$default(AlbumAssetRelation albumAssetRelation, long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, Object obj) {
        long j7 = j;
        long j8 = j3;
        long j9 = j2;
        long j10 = j5;
        long j11 = j4;
        int i3 = i;
        long j12 = j6;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{albumAssetRelation, new Long(j7), new Long(j9), new Long(j8), new Long(j11), new Long(j10), new Long(j12), Integer.valueOf(i3), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (AlbumAssetRelation) proxy.result;
        }
        if ((i2 & 1) != 0) {
            j7 = albumAssetRelation.linkId;
        }
        if ((i2 & 2) != 0) {
            j9 = albumAssetRelation.albumId;
        }
        if ((i2 & 4) != 0) {
            j8 = albumAssetRelation.localId;
        }
        if ((i2 & 8) != 0) {
            j11 = albumAssetRelation.cloudId;
        }
        if ((i2 & 16) != 0) {
            j10 = albumAssetRelation.addTime;
        }
        if ((i2 & 32) != 0) {
            j12 = albumAssetRelation.takenTime;
        }
        if ((i2 & 64) != 0) {
            i3 = albumAssetRelation.status;
        }
        return albumAssetRelation.copy(j7, j9, j8, j11, j10, j12, i3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.linkId), Long.valueOf(this.albumId), Long.valueOf(this.localId), Long.valueOf(this.cloudId), Long.valueOf(this.addTime), Long.valueOf(this.takenTime), Integer.valueOf(this.status)};
    }

    public final long component1() {
        return this.linkId;
    }

    public final long component2() {
        return this.albumId;
    }

    public final long component3() {
        return this.localId;
    }

    public final long component4() {
        return this.cloudId;
    }

    public final long component5() {
        return this.addTime;
    }

    public final long component6() {
        return this.takenTime;
    }

    public final int component7() {
        return this.status;
    }

    public final AlbumAssetRelation copy(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), Integer.valueOf(i)}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (AlbumAssetRelation) proxy.result : new AlbumAssetRelation(j, j2, j3, j4, j5, j6, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof AlbumAssetRelation) {
            return C106862S5w.LIZ(((AlbumAssetRelation) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AlbumAssetRelation:%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final long getAddTime() {
        return this.addTime;
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final long getCloudId() {
        return this.cloudId;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final long getLocalId() {
        return this.localId;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTakenTime() {
        return this.takenTime;
    }

    public final boolean hasCloud() {
        if (this.cloudId != 0) {
            return true;
        }
        return false;
    }

    public final boolean hasLocal() {
        if (this.localId != 0) {
            return true;
        }
        return false;
    }

    public final String getAssetId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "2_" + this.linkId;
    }

    public final AlbumAssetRelation attachLocal(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (AlbumAssetRelation) proxy.result;
        }
        if (l == null || l.longValue() == 0) {
            return this;
        }
        return copy(this.linkId, this.albumId, l.longValue(), this.cloudId, this.addTime, this.takenTime, this.status);
    }

    public AlbumAssetRelation(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.linkId = j;
        this.albumId = j2;
        this.localId = j3;
        this.cloudId = j4;
        this.addTime = j5;
        this.takenTime = j6;
        this.status = i;
    }
}
