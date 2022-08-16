package cn.ever.cloud.android.persistence.table;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DbUserStorage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long mediaNum;
    public final long quota;
    public final long usage;
    public final long userId;

    static {
        Covode.recordClassIndex(2945);
    }

    public static /* synthetic */ DbUserStorage copy$default(DbUserStorage dbUserStorage, long j, long j2, long j3, long j4, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dbUserStorage, new Long(j), new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DbUserStorage) proxy.result;
        }
        if ((i & 1) != 0) {
            j = dbUserStorage.userId;
        }
        if ((i & 2) != 0) {
            j2 = dbUserStorage.quota;
        }
        if ((i & 4) != 0) {
            j3 = dbUserStorage.usage;
        }
        if ((i & 8) != 0) {
            j4 = dbUserStorage.mediaNum;
        }
        return dbUserStorage.copy(j, j2, j3, j4);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.userId), Long.valueOf(this.quota), Long.valueOf(this.usage), Long.valueOf(this.mediaNum)};
    }

    public final long component1() {
        return this.userId;
    }

    public final long component2() {
        return this.quota;
    }

    public final long component3() {
        return this.usage;
    }

    public final long component4() {
        return this.mediaNum;
    }

    public final DbUserStorage copy(long j, long j2, long j3, long j4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (DbUserStorage) proxy.result : new DbUserStorage(j, j2, j3, j4);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DbUserStorage) {
            return C106862S5w.LIZ(((DbUserStorage) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DbUserStorage:%s,%s,%s,%s", getObjects());
    }

    public final long getMediaNum() {
        return this.mediaNum;
    }

    public final long getQuota() {
        return this.quota;
    }

    public final long getUsage() {
        return this.usage;
    }

    public final long getUserId() {
        return this.userId;
    }

    public DbUserStorage(long j, long j2, long j3, long j4) {
        this.userId = j;
        this.quota = j2;
        this.usage = j3;
        this.mediaNum = j4;
    }
}
