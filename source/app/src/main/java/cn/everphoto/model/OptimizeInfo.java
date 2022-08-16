package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p003X.C106862S5w;

/* loaded from: classes4.dex */
public final class OptimizeInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("clip")
    public final ReframeBoundingBox clip;
    @SerializedName("end_time")
    public final float endTime;
    @SerializedName("segment_id")
    public final String fragmentId;
    @SerializedName("start_time")
    public final float startTime;

    static {
        Covode.recordClassIndex(3625);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "OptimizeInfo(startTime=" + this.startTime + ", endTime=" + this.endTime + ", fragmentId='" + this.fragmentId + "', clip=" + this.clip + LoggerUtil.S_RIGHT_TAG;
    }

    public OptimizeInfo(float f, float f2, String str, ReframeBoundingBox reframeBoundingBox) {
        C106862S5w.LIZ(str, reframeBoundingBox);
        this.startTime = f;
        this.endTime = f2;
        this.fragmentId = str;
        this.clip = reframeBoundingBox;
    }
}
