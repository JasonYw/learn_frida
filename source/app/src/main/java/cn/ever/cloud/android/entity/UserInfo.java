package cn.ever.cloud.android.entity;

import cn.ever.cloud.network.auth.UserId;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String token;
    public final UserId userId;

    static {
        Covode.recordClassIndex(2878);
    }

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, UserId userId, String str, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userInfo, userId, str, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UserInfo) proxy.result;
        }
        if ((i & 1) != 0) {
            userId = userInfo.userId;
        }
        if ((i & 2) != 0) {
            str = userInfo.token;
        }
        return userInfo.copy(userId, str);
    }

    private Object[] getObjects() {
        return new Object[]{this.userId, this.token};
    }

    public final UserId component1() {
        return this.userId;
    }

    public final String component2() {
        return this.token;
    }

    public final UserInfo copy(UserId userId, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userId, str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserInfo) proxy.result;
        }
        C106862S5w.LIZ(userId, str);
        return new UserInfo(userId, str);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserInfo) {
            return C106862S5w.LIZ(((UserInfo) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UserInfo:%s,%s", getObjects());
    }

    public final String getToken() {
        return this.token;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public UserInfo(UserId userId, String str) {
        C106862S5w.LIZ(userId, str);
        this.userId = userId;
        this.token = str;
    }
}
