package cn.ever.cloud.sdk;

import cn.ever.cloud.network.auth.DependToken;
import cn.ever.cloud.sdk.entity.EpUserInfo;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes23.dex */
public final class UserSdkProxy$buildSdkComponent$tokenProvider$1 implements DependToken {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UserSdkProxy this$0;

    static {
        Covode.recordClassIndex(3315);
    }

    @Override // cn.ever.cloud.network.auth.DependToken
    public final DependToken.SessionToken getNewToken() {
        Object runBlocking$default;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DependToken.SessionToken) proxy.result;
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new C0741xcc8383e0(this, null), 1, null);
        EpUserInfo epUserInfo = (EpUserInfo) runBlocking$default;
        return new DependToken.SessionToken(MapperKt.toUserId(epUserInfo.getUser()), epUserInfo.getToken());
    }

    public UserSdkProxy$buildSdkComponent$tokenProvider$1(UserSdkProxy userSdkProxy) {
        this.this$0 = userSdkProxy;
    }
}
