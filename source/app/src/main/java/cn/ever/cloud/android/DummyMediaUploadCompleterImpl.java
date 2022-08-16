package cn.ever.cloud.android;

import cn.ever.cloud.android.services.upload.AbstractC0727a;
import cn.ever.cloud.android.services.upload.MediaUploadCompleteExtra;
import cn.ever.cloud.android.services.upload.UploadMedia;
import cn.ever.cloud.network.entity.NAsset;
import cn.ever.cloud.utils.Result;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DummyMediaUploadCompleterImpl implements AbstractC0727a {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2739);
    }

    @Override // cn.ever.cloud.android.services.upload.AbstractC0727a
    public final Result<Long> importCloudAsset(NAsset nAsset) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nAsset}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Result) proxy.result;
        }
        C106862S5w.LIZ(nAsset);
        return Result.Companion.success(0L);
    }

    @Override // cn.ever.cloud.android.services.upload.AbstractC0727a
    public final MediaUploadCompleteExtra uploadCompleteExtra(UploadMedia uploadMedia) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadMedia}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (MediaUploadCompleteExtra) proxy.result;
        }
        C106862S5w.LIZ(uploadMedia);
        return new MediaUploadCompleteExtra(System.currentTimeMillis(), System.currentTimeMillis(), 0L, 0L, 0, 0L, System.currentTimeMillis(), 0);
    }
}
