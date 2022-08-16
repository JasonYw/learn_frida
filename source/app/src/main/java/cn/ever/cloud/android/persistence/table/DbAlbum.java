package cn.ever.cloud.android.persistence.table;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DbAlbum {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long albumId;
    public final Long coverLink;
    public final String coverMd5;
    public final long createAt;
    public final boolean isDeleted;
    public final String name;
    public final long updateAt;

    static {
        Covode.recordClassIndex(2938);
    }

    public static /* synthetic */ DbAlbum copy$default(DbAlbum dbAlbum, long j, String str, long j2, long j3, boolean z, Long l, String str2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbAlbum, new Long(j), str, new Long(j2), new Long(j3), Byte.valueOf(b), l, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbAlbum) proxy.result;
        }
        if ((i & 1) != 0) {
            j = dbAlbum.albumId;
        }
        if ((i & 2) != 0) {
            str = dbAlbum.name;
        }
        if ((i & 4) != 0) {
            j2 = dbAlbum.createAt;
        }
        if ((i & 8) != 0) {
            j3 = dbAlbum.updateAt;
        }
        if ((i & 16) != 0) {
            z = dbAlbum.isDeleted;
        }
        if ((i & 32) != 0) {
            l = dbAlbum.coverLink;
        }
        if ((i & 64) != 0) {
            str2 = dbAlbum.coverMd5;
        }
        return dbAlbum.copy(j, str, j2, j3, z, l, str2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.albumId), this.name, Long.valueOf(this.createAt), Long.valueOf(this.updateAt), Boolean.valueOf(this.isDeleted), this.coverLink, this.coverMd5};
    }

    public final long component1() {
        return this.albumId;
    }

    public final String component2() {
        return this.name;
    }

    public final long component3() {
        return this.createAt;
    }

    public final long component4() {
        return this.updateAt;
    }

    public final boolean component5() {
        return this.isDeleted;
    }

    public final Long component6() {
        return this.coverLink;
    }

    public final String component7() {
        return this.coverMd5;
    }

    public final DbAlbum copy(long j, String str, long j2, long j3, boolean z, Long l, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), l, str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DbAlbum) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new DbAlbum(j, str, j2, j3, z, l, str2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DbAlbum) {
            return C106862S5w.LIZ(((DbAlbum) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DbAlbum:%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final Long getCoverLink() {
        return this.coverLink;
    }

    public final String getCoverMd5() {
        return this.coverMd5;
    }

    public final long getCreateAt() {
        return this.createAt;
    }

    public final String getName() {
        return this.name;
    }

    public final long getUpdateAt() {
        return this.updateAt;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public DbAlbum(long j, String str, long j2, long j3, boolean z, Long l, String str2) {
        C106862S5w.LIZ(str);
        this.albumId = j;
        this.name = str;
        this.createAt = j2;
        this.updateAt = j3;
        this.isDeleted = z;
        this.coverLink = l;
        this.coverMd5 = str2;
    }
}
