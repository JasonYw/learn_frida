package cn.ever.cloud.android;

import cn.ever.cloud.android.persistence.SdkDatabase;
import cn.ever.cloud.network.auth.UserId;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class AndroidDatabaseModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2733);
    }

    public final SdkDatabase provideSdkDatabase(UserId userId) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userId}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (SdkDatabase) proxy.result;
        }
        C106862S5w.LIZ(userId);
        return SdkDatabase.Companion.newInstance(userId);
    }
}
