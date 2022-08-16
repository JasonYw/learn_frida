package cn.ever.cloud.network.auth;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserId {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long epUid;
    public final String thirdPartySecUid;
    public final String thirdPartyUid;

    static {
        Covode.recordClassIndex(3181);
    }

    public static /* synthetic */ UserId copy$default(UserId userId, String str, String str2, long j, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userId, str, str2, new Long(j), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        if ((i & 1) != 0) {
            str = userId.thirdPartyUid;
        }
        if ((i & 2) != 0) {
            str2 = userId.thirdPartySecUid;
        }
        if ((i & 4) != 0) {
            j = userId.epUid;
        }
        return userId.copy(str, str2, j);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.thirdPartyUid, this.thirdPartySecUid, Long.valueOf(this.epUid)};
    }

    public final String component1() {
        return this.thirdPartyUid;
    }

    public final String component2() {
        return this.thirdPartySecUid;
    }

    public final long component3() {
        return this.epUid;
    }

    public final UserId copy(String str, String str2, long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, new Long(j)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UserId) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new UserId(str, str2, j);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserId) {
            return C106862S5w.LIZ(((UserId) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UserId:%s,%s,%s", getObjects());
    }

    public final long getEpUid() {
        return this.epUid;
    }

    public final String getThirdPartySecUid() {
        return this.thirdPartySecUid;
    }

    public final String getThirdPartyUid() {
        return this.thirdPartyUid;
    }

    public UserId(String str, String str2, long j) {
        C106862S5w.LIZ(str);
        this.thirdPartyUid = str;
        this.thirdPartySecUid = str2;
        this.epUid = j;
    }
}
