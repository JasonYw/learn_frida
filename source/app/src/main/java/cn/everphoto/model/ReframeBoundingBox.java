package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import p003X.C109391T5d;

/* loaded from: classes4.dex */
public final class ReframeBoundingBox implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("center_x")
    public final float centerX;
    @SerializedName("center_y")
    public final float centerY;
    @SerializedName(C109391T5d.LJFF)
    public final float height;
    @SerializedName("rotate_angle")
    public final float rotateAngle;
    @SerializedName("width")
    public final float width;

    static {
        Covode.recordClassIndex(3626);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "ReframeBoundingBox(centerX=" + this.centerX + ", centerY=" + this.centerY + ", width=" + this.width + ", height=" + this.height + ", rotateAngle=" + this.rotateAngle + LoggerUtil.S_RIGHT_TAG;
    }

    public ReframeBoundingBox(float f, float f2, float f3, float f4, float f5) {
        this.centerX = f;
        this.centerY = f2;
        this.width = f3;
        this.height = f4;
        this.rotateAngle = f5;
    }
}
