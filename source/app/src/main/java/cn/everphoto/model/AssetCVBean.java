package cn.everphoto.model;

import cn.everphoto.core.cvinfo.cache.DbAssetCVInfo;
import cn.everphoto.core.localmedia.Asset;
import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class AssetCVBean {
    public final Asset asset;
    public final DbAssetCVInfo cvInfo;

    static {
        Covode.recordClassIndex(3616);
    }

    public final Asset getAsset() {
        return this.asset;
    }

    public final DbAssetCVInfo getCvInfo() {
        return this.cvInfo;
    }

    public AssetCVBean(Asset asset, DbAssetCVInfo dbAssetCVInfo) {
        C106862S5w.LIZ(asset, dbAssetCVInfo);
        this.asset = asset;
        this.cvInfo = dbAssetCVInfo;
    }
}
