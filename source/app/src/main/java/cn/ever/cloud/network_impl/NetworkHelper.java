package cn.ever.cloud.network_impl;

import cn.ever.cloud.network.retrofit.NetCall;
import cn.ever.cloud.network.retrofit.NetRequest;
import cn.ever.cloud.network.retrofit.NetResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.client.SsCall;
import com.bytedance.ttnet.HttpClient;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class NetworkHelper {
    public static final NetworkHelper INSTANCE = new NetworkHelper();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3260);
    }

    public final NetResponse execute(NetCall netCall) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{netCall}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (NetResponse) proxy.result;
        }
        C106862S5w.LIZ(netCall);
        return netCall.execute();
    }

    public final NetCall newNetCall(NetRequest netRequest) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{netRequest}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (NetCall) proxy.result;
        }
        C106862S5w.LIZ(netRequest);
        SsCall newSsCall = HttpClient.getHttpClient(netRequest.getUrl()).newSsCall(NetworkHelperKt.toSsRequest(netRequest));
        Intrinsics.checkNotNullExpressionValue(newSsCall, "");
        return NetworkHelperKt.toNetCall(newSsCall);
    }
}
