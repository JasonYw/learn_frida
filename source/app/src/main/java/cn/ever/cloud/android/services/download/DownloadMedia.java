package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadMedia {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long cloudId;
    public boolean downloadPass;
    public final String itemKey;
    public final String md5;
    public final long size;
    public final String targetPath;

    static {
        Covode.recordClassIndex(3008);
    }

    public static /* synthetic */ DownloadMedia copy$default(DownloadMedia downloadMedia, long j, String str, String str2, long j2, String str3, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{downloadMedia, new Long(j), str, str2, new Long(j2), str3, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DownloadMedia) proxy.result;
        }
        if ((i & 1) != 0) {
            j = downloadMedia.cloudId;
        }
        if ((i & 2) != 0) {
            str = downloadMedia.itemKey;
        }
        if ((i & 4) != 0) {
            str2 = downloadMedia.md5;
        }
        if ((i & 8) != 0) {
            j2 = downloadMedia.size;
        }
        if ((i & 16) != 0) {
            str3 = downloadMedia.targetPath;
        }
        return downloadMedia.copy(j, str, str2, j2, str3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.cloudId), this.itemKey, this.md5, Long.valueOf(this.size), this.targetPath};
    }

    public final long component1() {
        return this.cloudId;
    }

    public final String component2() {
        return this.itemKey;
    }

    public final String component3() {
        return this.md5;
    }

    public final long component4() {
        return this.size;
    }

    public final String component5() {
        return this.targetPath;
    }

    public final DownloadMedia copy(long j, String str, String str2, long j2, String str3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str, str2, new Long(j2), str3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DownloadMedia) proxy.result;
        }
        C106862S5w.LIZ(str, str2, str3);
        return new DownloadMedia(j, str, str2, j2, str3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DownloadMedia) {
            return C106862S5w.LIZ(((DownloadMedia) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DownloadMedia:%s,%s,%s,%s,%s", getObjects());
    }

    public final long getCloudId() {
        return this.cloudId;
    }

    public final boolean getDownloadPass() {
        return this.downloadPass;
    }

    public final String getItemKey() {
        return this.itemKey;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getTargetPath() {
        return this.targetPath;
    }

    public final void setDownloadPass(boolean z) {
        this.downloadPass = z;
    }

    public DownloadMedia(long j, String str, String str2, long j2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.cloudId = j;
        this.itemKey = str;
        this.md5 = str2;
        this.size = j2;
        this.targetPath = str3;
    }
}
