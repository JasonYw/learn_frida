package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class VideoInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String assetId;
    public final VideoPlayInfo p360;
    public final VideoPlayInfo p480;
    public final VideoPlayInfo p720;
    public final int status;

    static {
        Covode.recordClassIndex(2879);
    }

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, String str, int i, VideoPlayInfo videoPlayInfo, VideoPlayInfo videoPlayInfo2, VideoPlayInfo videoPlayInfo3, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{videoInfo, str, Integer.valueOf(i), videoPlayInfo, videoPlayInfo2, videoPlayInfo3, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (VideoInfo) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = videoInfo.assetId;
        }
        if ((i2 & 2) != 0) {
            i = videoInfo.status;
        }
        if ((i2 & 4) != 0) {
            videoPlayInfo = videoInfo.p360;
        }
        if ((i2 & 8) != 0) {
            videoPlayInfo2 = videoInfo.p480;
        }
        if ((i2 & 16) != 0) {
            videoPlayInfo3 = videoInfo.p720;
        }
        return videoInfo.copy(str, i, videoPlayInfo, videoPlayInfo2, videoPlayInfo3);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.assetId, Integer.valueOf(this.status), this.p360, this.p480, this.p720};
    }

    public final String component1() {
        return this.assetId;
    }

    public final int component2() {
        return this.status;
    }

    public final VideoPlayInfo component3() {
        return this.p360;
    }

    public final VideoPlayInfo component4() {
        return this.p480;
    }

    public final VideoPlayInfo component5() {
        return this.p720;
    }

    public final VideoInfo copy(String str, int i, VideoPlayInfo videoPlayInfo, VideoPlayInfo videoPlayInfo2, VideoPlayInfo videoPlayInfo3) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), videoPlayInfo, videoPlayInfo2, videoPlayInfo3}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (VideoInfo) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new VideoInfo(str, i, videoPlayInfo, videoPlayInfo2, videoPlayInfo3);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof VideoInfo) {
            return C106862S5w.LIZ(((VideoInfo) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("VideoInfo:%s,%s,%s,%s,%s", getObjects());
    }

    public final String getAssetId() {
        return this.assetId;
    }

    public final VideoPlayInfo getP360() {
        return this.p360;
    }

    public final VideoPlayInfo getP480() {
        return this.p480;
    }

    public final VideoPlayInfo getP720() {
        return this.p720;
    }

    public final int getStatus() {
        return this.status;
    }

    public VideoInfo(String str, int i, VideoPlayInfo videoPlayInfo, VideoPlayInfo videoPlayInfo2, VideoPlayInfo videoPlayInfo3) {
        C106862S5w.LIZ(str);
        this.assetId = str;
        this.status = i;
        this.p360 = videoPlayInfo;
        this.p480 = videoPlayInfo2;
        this.p720 = videoPlayInfo3;
    }
}
