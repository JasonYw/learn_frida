package cn.ever.cloud.android;

import cn.ever.cloud.network.auth.AbstractC0730a;
import cn.ever.cloud.network.auth.UserId;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes20.dex */
public final class AndroidUserModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2737);
    }

    public final UserId provideUserId(AbstractC0730a abstractC0730a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC0730a}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        C106862S5w.LIZ(abstractC0730a);
        return abstractC0730a.getUserId();
    }
}
