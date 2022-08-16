package cn.everphoto.model;

import cn.everphoto.core.localmedia.Asset;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.io.Serializable;
import p003X.C106862S5w;

/* loaded from: classes4.dex */
public final class SegmentInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Asset material;
    public final OptimizeInfo optimizeInfo;

    static {
        Covode.recordClassIndex(3627);
    }

    public final Asset getMaterial() {
        return this.material;
    }

    public final OptimizeInfo getOptimizeInfo() {
        return this.optimizeInfo;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "SegmentInfo(material=" + this.material + ", optimizeInfo=" + this.optimizeInfo + LoggerUtil.S_RIGHT_TAG;
    }

    public SegmentInfo(Asset asset, OptimizeInfo optimizeInfo) {
        C106862S5w.LIZ(asset, optimizeInfo);
        this.material = asset;
        this.optimizeInfo = optimizeInfo;
    }
}
