package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcAlbum {
    public static final Companion Companion = new Companion(null);
    public static final List<Long> PREDEFINE_ALBUM = CollectionsKt__CollectionsJVMKt.listOf(70005L);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long albumId;
    public final EcAsset cover;
    public final long createAt;
    public final boolean isDeleted;
    public final String name;
    public final long updateAt;

    public static /* synthetic */ EcAlbum copy$default(EcAlbum ecAlbum, long j, String str, long j2, long j3, EcAsset ecAsset, boolean z, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecAlbum, new Long(j), str, new Long(j2), new Long(j3), ecAsset, Byte.valueOf(b), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcAlbum) proxy.result;
        }
        if ((i & 1) != 0) {
            j = ecAlbum.albumId;
        }
        if ((i & 2) != 0) {
            str = ecAlbum.name;
        }
        if ((i & 4) != 0) {
            j2 = ecAlbum.createAt;
        }
        if ((i & 8) != 0) {
            j3 = ecAlbum.updateAt;
        }
        if ((i & 16) != 0) {
            ecAsset = ecAlbum.cover;
        }
        if ((i & 32) != 0) {
            z = ecAlbum.isDeleted;
        }
        return ecAlbum.copy(j, str, j2, j3, ecAsset, z);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.albumId), this.name, Long.valueOf(this.createAt), Long.valueOf(this.updateAt), this.cover, Boolean.valueOf(this.isDeleted)};
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

    public final EcAsset component5() {
        return this.cover;
    }

    public final boolean component6() {
        return this.isDeleted;
    }

    public final EcAlbum copy(long j, String str, long j2, long j3, EcAsset ecAsset, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, new Long(j2), new Long(j3), ecAsset, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcAlbum) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new EcAlbum(j, str, j2, j3, ecAsset, z);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcAlbum) {
            return C106862S5w.LIZ(((EcAlbum) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcAlbum:%s,%s,%s,%s,%s,%s", getObjects());
    }

    /* loaded from: classes23.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(3389);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isPredefineId(long j) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            return EcAlbum.PREDEFINE_ALBUM.contains(Long.valueOf(j));
        }
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final EcAsset getCover() {
        return this.cover;
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

    static {
        Covode.recordClassIndex(3388);
    }

    public EcAlbum(long j, String str, long j2, long j3, EcAsset ecAsset, boolean z) {
        C106862S5w.LIZ(str);
        this.albumId = j;
        this.name = str;
        this.createAt = j2;
        this.updateAt = j3;
        this.cover = ecAsset;
        this.isDeleted = z;
    }
}
