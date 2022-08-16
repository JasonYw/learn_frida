package cn.everphoto.model;

import cn.everphoto.core.cvinfo.cache.C0771j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class MomentBean {
    public final List<AssetCVBean> assetCVBeans;
    public final AssetCVBean cover;
    public final C0771j momentInfo;

    static {
        Covode.recordClassIndex(3620);
    }

    public final List<AssetCVBean> getAssetCVBeans() {
        return this.assetCVBeans;
    }

    public final AssetCVBean getCover() {
        return this.cover;
    }

    public final C0771j getMomentInfo() {
        return this.momentInfo;
    }

    public MomentBean(C0771j c0771j, AssetCVBean assetCVBean, List<AssetCVBean> list) {
        C106862S5w.LIZ(c0771j, assetCVBean, list);
        this.momentInfo = c0771j;
        this.cover = assetCVBean;
        this.assetCVBeans = list;
    }
}
