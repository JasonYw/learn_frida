package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.network.entity.NAsset;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.ever.cloud.android.services.upload.a */
/* loaded from: classes23.dex */
public interface AbstractC0727a {
    static {
        Covode.recordClassIndex(3164);
    }

    Result<Long> importCloudAsset(NAsset nAsset);

    MediaUploadCompleteExtra uploadCompleteExtra(UploadMedia uploadMedia);
}
