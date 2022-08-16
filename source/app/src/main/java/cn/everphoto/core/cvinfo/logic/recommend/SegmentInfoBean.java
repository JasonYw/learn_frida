package cn.everphoto.core.cvinfo.logic.recommend;

import cn.everphoto.model.ReframeBoundingBox;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class SegmentInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("crop_cxy")
    public final ReframeBoundingBox clip;
    @SerializedName("end_time")
    public final float endTime;
    @SerializedName("segment_id")
    public final String fragmentId;
    @SerializedName("material_id")
    public final String materialId;
    @SerializedName("start_time")
    public final float startTime;

    static {
        Covode.recordClassIndex(3594);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "OptimizeInfo(materialId='" + this.materialId + "', startTime=" + this.startTime + ", endTime=" + this.endTime + ", fragmentId='" + this.fragmentId + "', clip=" + this.clip + LoggerUtil.S_RIGHT_TAG;
    }
}
