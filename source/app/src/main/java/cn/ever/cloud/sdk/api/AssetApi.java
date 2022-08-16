package cn.ever.cloud.sdk.api;

import cn.ever.cloud.sdk.entity.EcAsset;
import cn.ever.cloud.sdk.entity.EcAssetQuery;
import cn.ever.cloud.sdk.entity.EcPageData;
import cn.ever.cloud.sdk.entity.EcVideoInfo;
import cn.ever.cloud.sdk.entity.Result;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.coroutines.Continuation;
import p003X.AbstractC521356in;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AssetApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC521356in component;

    static {
        Covode.recordClassIndex(3344);
    }

    public AssetApi(AbstractC521356in abstractC521356in) {
        C106862S5w.LIZ(abstractC521356in);
        this.component = abstractC521356in;
    }

    public final void setComponent$sdk_douyin_release(AbstractC521356in abstractC521356in) {
        if (PatchProxy.proxy(new Object[]{abstractC521356in}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC521356in);
        this.component = abstractC521356in;
    }

    public final Object getAssetInfo(List<String> list, Continuation<? super Result<List<EcAsset>>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, continuation}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new AssetApi$getAssetInfo$2(this, list, null), continuation);
    }

    public final Object getAssets(EcAssetQuery ecAssetQuery, Continuation<? super Result<EcPageData<EcAsset>>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecAssetQuery, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new AssetApi$getAssets$2(this, MapperKt.toAssetQuery(ecAssetQuery), null), continuation);
    }

    public final Object getVideoInfo(List<String> list, Continuation<? super Result<List<EcVideoInfo>>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, continuation}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new AssetApi$getVideoInfo$2(this, list, null), continuation);
    }

    public final Object decrypt(String str, byte[] bArr, Continuation<? super Result<byte[]>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, bArr, continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new AssetApi$decrypt$2(this, str, bArr, null), continuation);
    }
}
