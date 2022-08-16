package cn.ever.cloud.android;

import cn.ever.cloud.network.api.AbstractC0729a;
import cn.ever.cloud.network.api.ApiBundle;
import cn.ever.cloud.network.auth.AbstractC0730a;
import cn.ever.cloud.network_impl.api.ApiClientImpl;
import cn.ever.cloud.network_impl.api.ApiExecutor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Retrofit;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class AndroidNetworkModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2735);
    }

    public final AbstractC0729a bindApiClient(Retrofit retrofit, AbstractC0730a abstractC0730a, ApiBundle apiBundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{retrofit, abstractC0730a, apiBundle}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC0729a) proxy.result;
        }
        C106862S5w.LIZ(retrofit, abstractC0730a, apiBundle);
        return new ApiClientImpl(apiBundle, retrofit, new ApiExecutor(abstractC0730a));
    }
}
