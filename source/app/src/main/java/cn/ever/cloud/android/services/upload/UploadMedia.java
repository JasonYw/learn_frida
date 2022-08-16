package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadMedia {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final boolean deleteOnEnd;
    public final String itemKey;
    public final long linkId;
    public final String path;
    public final boolean predefineAlbumEdit;
    public final long tagId;
    public final String uri;

    static {
        Covode.recordClassIndex(3142);
    }

    public static /* synthetic */ UploadMedia copy$default(UploadMedia uploadMedia, String str, String str2, String str3, long j, long j2, String str4, boolean z, boolean z2, int i, Object obj) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        long j3 = j;
        long j4 = j2;
        String str8 = str4;
        boolean z3 = z;
        boolean z4 = z2;
        byte b = z3 ? (byte) 1 : (byte) 0;
        byte b2 = z3 ? (byte) 1 : (byte) 0;
        byte b3 = z4 ? (byte) 1 : (byte) 0;
        byte b4 = z4 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia, str5, str6, str7, new Long(j3), new Long(j4), str8, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadMedia) proxy.result;
        }
        if ((i & 1) != 0) {
            str5 = uploadMedia.assetId;
        }
        if ((i & 2) != 0) {
            str6 = uploadMedia.path;
        }
        if ((i & 4) != 0) {
            str7 = uploadMedia.uri;
        }
        if ((i & 8) != 0) {
            j3 = uploadMedia.tagId;
        }
        if ((i & 16) != 0) {
            j4 = uploadMedia.linkId;
        }
        if ((i & 32) != 0) {
            str8 = uploadMedia.itemKey;
        }
        if ((i & 64) != 0) {
            z3 = uploadMedia.predefineAlbumEdit;
        }
        if ((i & 128) != 0) {
            z4 = uploadMedia.deleteOnEnd;
        }
        boolean z5 = z4 ? 1 : 0;
        Object[] objArr = z4 ? 1 : 0;
        boolean z6 = z3 ? 1 : 0;
        Object[] objArr2 = z3 ? 1 : 0;
        return uploadMedia.copy(str5, str6, str7, j3, j4, str8, z6, z5);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.assetId, this.path, this.uri, Long.valueOf(this.tagId), Long.valueOf(this.linkId), this.itemKey, Boolean.valueOf(this.predefineAlbumEdit), Boolean.valueOf(this.deleteOnEnd)};
    }

    public final String component1() {
        return this.assetId;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.uri;
    }

    public final long component4() {
        return this.tagId;
    }

    public final long component5() {
        return this.linkId;
    }

    public final String component6() {
        return this.itemKey;
    }

    public final boolean component7() {
        return this.predefineAlbumEdit;
    }

    public final boolean component8() {
        return this.deleteOnEnd;
    }

    public final UploadMedia copy(String str, String str2, String str3, long j, long j2, String str4, boolean z, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, new Long(j), new Long(j2), str4, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadMedia) proxy.result;
        }
        C106862S5w.LIZ(str, str4);
        return new UploadMedia(str, str2, str3, j, j2, str4, z, z2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadMedia) {
            return C106862S5w.LIZ(((UploadMedia) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UploadMedia:%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final boolean getDeleteOnEnd() {
        return this.deleteOnEnd;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getPredefineAlbumEdit() {
        return this.predefineAlbumEdit;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public final String getUri() {
        return this.uri;
    }

    public UploadMedia(String str, String str2, String str3, long j, long j2, String str4, boolean z, boolean z2) {
        C106862S5w.LIZ(str, str4);
        this.assetId = str;
        this.path = str2;
        this.uri = str3;
        this.tagId = j;
        this.linkId = j2;
        this.itemKey = str4;
        this.predefineAlbumEdit = z;
        this.deleteOnEnd = z2;
    }
}
