package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ItemProgress {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final long doneBytes;
    public final long totalBytes;

    static {
        Covode.recordClassIndex(3091);
    }

    public static /* synthetic */ ItemProgress copy$default(ItemProgress itemProgress, long j, long j2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{itemProgress, new Long(j), new Long(j2), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ItemProgress) proxy.result;
        }
        if ((i & 1) != 0) {
            j = itemProgress.totalBytes;
        }
        if ((i & 2) != 0) {
            j2 = itemProgress.doneBytes;
        }
        return itemProgress.copy(j, j2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.totalBytes), Long.valueOf(this.doneBytes)};
    }

    public final long component1() {
        return this.totalBytes;
    }

    public final long component2() {
        return this.doneBytes;
    }

    public final ItemProgress copy(long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (ItemProgress) proxy.result : new ItemProgress(j, j2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ItemProgress) {
            return C106862S5w.LIZ(((ItemProgress) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ItemProgress:%s,%s", getObjects());
    }

    public final long getDoneBytes() {
        return this.doneBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public ItemProgress(long j, long j2) {
        this.totalBytes = j;
        this.doneBytes = j2;
    }
}
