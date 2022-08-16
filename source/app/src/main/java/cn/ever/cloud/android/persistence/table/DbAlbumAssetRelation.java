package cn.ever.cloud.android.persistence.table;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DbAlbumAssetRelation {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long addTime;
    public final long albumId;
    public final long cloudId;
    public final long linkId;
    public final long localId;
    public final int status;
    public final long takenTime;

    static {
        Covode.recordClassIndex(2939);
    }

    public static /* synthetic */ DbAlbumAssetRelation copy$default(DbAlbumAssetRelation dbAlbumAssetRelation, long j, long j2, long j3, long j4, long j5, long j6, int i, int i2, Object obj) {
        long j7 = j;
        long j8 = j3;
        long j9 = j2;
        long j10 = j5;
        long j11 = j4;
        int i3 = i;
        long j12 = j6;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbAlbumAssetRelation, new Long(j7), new Long(j9), new Long(j8), new Long(j11), new Long(j10), new Long(j12), Integer.valueOf(i3), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbAlbumAssetRelation) proxy.result;
        }
        if ((i2 & 1) != 0) {
            j7 = dbAlbumAssetRelation.linkId;
        }
        if ((i2 & 2) != 0) {
            j9 = dbAlbumAssetRelation.albumId;
        }
        if ((i2 & 4) != 0) {
            j8 = dbAlbumAssetRelation.localId;
        }
        if ((i2 & 8) != 0) {
            j11 = dbAlbumAssetRelation.cloudId;
        }
        if ((i2 & 16) != 0) {
            j10 = dbAlbumAssetRelation.addTime;
        }
        if ((i2 & 32) != 0) {
            j12 = dbAlbumAssetRelation.takenTime;
        }
        if ((i2 & 64) != 0) {
            i3 = dbAlbumAssetRelation.status;
        }
        return dbAlbumAssetRelation.copy(j7, j9, j8, j11, j10, j12, i3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
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

    public final DbAlbumAssetRelation copy(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5), new Long(j6), Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (DbAlbumAssetRelation) proxy.result : new DbAlbumAssetRelation(j, j2, j3, j4, j5, j6, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DbAlbumAssetRelation) {
            return C106862S5w.LIZ(((DbAlbumAssetRelation) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DbAlbumAssetRelation:%s,%s,%s,%s,%s,%s,%s", getObjects());
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

    public DbAlbumAssetRelation(long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.linkId = j;
        this.albumId = j2;
        this.localId = j3;
        this.cloudId = j4;
        this.addTime = j5;
        this.takenTime = j6;
        this.status = i;
    }
}
