package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes23.dex */
public final class Storage {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long mediaNum;
    public final long quota;
    public final long usage;
    public final long userId;

    static {
        Covode.recordClassIndex(2865);
    }

    public static /* synthetic */ Storage copy$default(Storage storage, long j, long j2, long j3, long j4, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{storage, new Long(j), new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Storage) proxy.result;
        }
        if ((i & 1) != 0) {
            j = storage.userId;
        }
        if ((i & 2) != 0) {
            j2 = storage.quota;
        }
        if ((i & 4) != 0) {
            j3 = storage.usage;
        }
        if ((i & 8) != 0) {
            j4 = storage.mediaNum;
        }
        return storage.copy(j, j2, j3, j4);
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

    public final Storage copy(long j, long j2, long j3, long j4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (Storage) proxy.result : new Storage(j, j2, j3, j4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Storage)) {
                return false;
            }
            Storage storage = (Storage) obj;
            return this.userId == storage.userId && this.quota == storage.quota && this.usage == storage.usage && this.mediaNum == storage.mediaNum;
        }
        return true;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : (((((C116971W2r.LIZ(this.userId) * 31) + C116971W2r.LIZ(this.quota)) * 31) + C116971W2r.LIZ(this.usage)) * 31) + C116971W2r.LIZ(this.mediaNum);
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

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "quota:" + ((this.quota / 1024) / 1024) + "M, usage:" + ((this.usage / 1024) / 1024) + 'M';
    }

    public Storage(long j, long j2, long j3, long j4) {
        this.userId = j;
        this.quota = j2;
        this.usage = j3;
        this.mediaNum = j4;
    }
}
