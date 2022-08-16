package cn.everphoto.core.localmedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.vesdk.VEUtils;
import java.io.File;
import java.io.Serializable;
import p002O.C0002O;
import p003X.C106006Roe;
import p003X.C116971W2r;

/* loaded from: classes13.dex */
public class Asset implements Serializable, Cloneable, Comparable<Asset> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long creationTime;
    public String fileName;
    public int height;
    public double latitude;
    public String localId;
    public String location;
    public double longitude;
    public int mimeIndex;
    public String mimeType;
    public long modifiedTime;
    public Integer orientation;
    public String relativePath;
    public String resourcePath;
    public long size;
    public long takenTime;
    public int type;
    public int videoDuration;
    public int width;

    static {
        Covode.recordClassIndex(3610);
    }

    public long getCreationTime() {
        return this.creationTime;
    }

    public String getFileName() {
        return this.fileName;
    }

    public int getHeight() {
        return this.height;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocalId() {
        return this.localId;
    }

    public String getLocation() {
        return this.location;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public long getModifiedTime() {
        return this.modifiedTime;
    }

    public String getRelativePath() {
        return this.relativePath;
    }

    public String getResourcePath() {
        return this.resourcePath;
    }

    public long getSize() {
        return this.size;
    }

    public long getTakenTime() {
        return this.takenTime;
    }

    public int getType() {
        return this.type;
    }

    public int getVideoDuration() {
        return this.videoDuration;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isImage() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public long getDisplayTime() {
        long j = this.takenTime;
        if (j > 0) {
            return j;
        }
        return this.creationTime;
    }

    public boolean isGif() {
        if (this.mimeIndex == 2) {
            return true;
        }
        return false;
    }

    public boolean isVideo() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return getLocalId().hashCode();
    }

    public String getFileAbsolutePath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (C106006Roe.LIZ() != null) {
            if (C106006Roe.LIZ().LIZLLL(this.resourcePath)) {
                new StringBuilder();
                return C0002O.m25084C(C116971W2r.LIZIZ().getAbsolutePath(), File.separator, this.relativePath, this.fileName);
            }
            return this.resourcePath;
        }
        throw new IllegalArgumentException("mediasource == null");
    }

    public int getOrientation() {
        VEUtils.VEVideoFileInfo videoFileInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.orientation == null) {
            if (isVideo() && (videoFileInfo = VEUtils.getVideoFileInfo(this.resourcePath)) != null) {
                this.orientation = Integer.valueOf(videoFileInfo.rotation);
            }
            if (this.orientation == null) {
                this.orientation = 0;
            }
        }
        return this.orientation.intValue();
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setRelativePath(String str) {
        this.relativePath = str;
    }

    public void setTakenTime(long j) {
        this.takenTime = j;
    }

    public static Asset fromPath(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (Asset) proxy.result;
        }
        if (C106006Roe.LIZ() != null) {
            return C106006Roe.LIZ().LIZJ(str);
        }
        throw new IllegalArgumentException("mediasource == null");
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        return getLocalId().equals(((Asset) obj).getLocalId());
    }

    @Override // java.lang.Comparable
    public int compareTo(Asset asset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{asset}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (asset == null) {
            return -1;
        }
        if (this == asset || this.localId.equals(asset.localId)) {
            return 0;
        }
        int i = (getDisplayTime() > asset.getDisplayTime() ? 1 : (getDisplayTime() == asset.getDisplayTime() ? 0 : -1));
        if (i > 0) {
            return -1;
        }
        if (i < 0) {
            return 1;
        }
        return Integer.compare(hashCode(), asset.hashCode());
    }

    public Asset(String str, String str2, int i, long j, long j2, long j3, long j4, int i2, Integer num, String str3, int i3, int i4, int i5, String str4) {
        this.localId = str;
        this.resourcePath = str2;
        this.type = i;
        this.takenTime = j2;
        this.creationTime = j3;
        this.modifiedTime = j4;
        this.videoDuration = i2;
        this.orientation = num;
        this.width = i4;
        this.height = i5;
        this.mimeType = str3;
        this.mimeIndex = i3;
        this.size = j;
        this.location = str4;
    }
}
