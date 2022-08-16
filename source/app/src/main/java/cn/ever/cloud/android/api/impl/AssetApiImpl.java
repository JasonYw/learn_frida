package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.entity.Asset;
import cn.ever.cloud.android.entity.AssetQuery;
import cn.ever.cloud.android.entity.PageData;
import cn.ever.cloud.android.entity.VideoInfo;
import cn.ever.cloud.android.exception.BizExceptionKt;
import cn.ever.cloud.android.services.AssetService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.coroutines.Continuation;
import p003X.AbstractC521156iT;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AssetApiImpl implements AbstractC521156iT {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AssetService client;

    static {
        Covode.recordClassIndex(2774);
    }

    public AssetApiImpl(AssetService assetService) {
        C106862S5w.LIZ(assetService);
        this.client = assetService;
    }

    @Override // p003X.AbstractC521156iT
    public final Object getAssetInfo(List<String> list, Continuation<? super List<? extends Asset>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AssetApiImpl$getAssetInfo$2(this, list, null), continuation);
    }

    @Override // p003X.AbstractC521156iT
    public final Object getAssets(AssetQuery assetQuery, Continuation<? super PageData<Asset>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{assetQuery, continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AssetApiImpl$getAssets$2(this, assetQuery, null), continuation);
    }

    @Override // p003X.AbstractC521156iT
    public final Object getVideoInfo(List<String> list, Continuation<? super List<VideoInfo>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, continuation}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AssetApiImpl$getVideoInfo$2(this, list, null), continuation);
    }

    @Override // p003X.AbstractC521156iT
    public final Object decrypt(String str, byte[] bArr, Continuation<? super byte[]> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, bArr, continuation}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new AssetApiImpl$decrypt$2(this, str, bArr, null), continuation);
    }
}
