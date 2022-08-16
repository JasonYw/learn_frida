package cn.ever.cloud.network.auth;

import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserInconsistentEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final EpError error;
    public final UserId newUser;
    public final UserId oldUser;

    static {
        Covode.recordClassIndex(3183);
    }

    public static /* synthetic */ UserInconsistentEvent copy$default(UserInconsistentEvent userInconsistentEvent, UserId userId, UserId userId2, EpError epError, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userInconsistentEvent, userId, userId2, epError, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UserInconsistentEvent) proxy.result;
        }
        if ((i & 1) != 0) {
            userId = userInconsistentEvent.newUser;
        }
        if ((i & 2) != 0) {
            userId2 = userInconsistentEvent.oldUser;
        }
        if ((i & 4) != 0) {
            epError = userInconsistentEvent.error;
        }
        return userInconsistentEvent.copy(userId, userId2, epError);
    }

    private Object[] getObjects() {
        return new Object[]{this.newUser, this.oldUser, this.error};
    }

    public final UserId component1() {
        return this.newUser;
    }

    public final UserId component2() {
        return this.oldUser;
    }

    public final EpError component3() {
        return this.error;
    }

    public final UserInconsistentEvent copy(UserId userId, UserId userId2, EpError epError) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userId, userId2, epError}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserInconsistentEvent) proxy.result;
        }
        C106862S5w.LIZ(userId, userId2);
        return new UserInconsistentEvent(userId, userId2, epError);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserInconsistentEvent) {
            return C106862S5w.LIZ(((UserInconsistentEvent) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UserInconsistentEvent:%s,%s,%s", getObjects());
    }

    public final EpError getError() {
        return this.error;
    }

    public final UserId getNewUser() {
        return this.newUser;
    }

    public final UserId getOldUser() {
        return this.oldUser;
    }

    public UserInconsistentEvent(UserId userId, UserId userId2, EpError epError) {
        C106862S5w.LIZ(userId, userId2);
        this.newUser = userId;
        this.oldUser = userId2;
        this.error = epError;
    }

    public /* synthetic */ UserInconsistentEvent(UserId userId, UserId userId2, EpError epError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userId, userId2, (i & 4) != 0 ? null : epError);
    }
}
