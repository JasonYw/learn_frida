package cn.ever.cloud.sdk.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class EcTaskProgress {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Long bytesDone;
    public final Long bytesTotal;
    public final int itemDone;
    public final int itemFailed;
    public final int itemTotal;
    public final List<String> processList;

    static {
        Covode.recordClassIndex(3402);
    }

    public static /* synthetic */ EcTaskProgress copy$default(EcTaskProgress ecTaskProgress, List list, int i, int i2, int i3, Long l, Long l2, int i4, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecTaskProgress, list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), l, l2, Integer.valueOf(i4), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EcTaskProgress) proxy.result;
        }
        if ((i4 & 1) != 0) {
            list = ecTaskProgress.processList;
        }
        if ((i4 & 2) != 0) {
            i = ecTaskProgress.itemFailed;
        }
        if ((i4 & 4) != 0) {
            i2 = ecTaskProgress.itemDone;
        }
        if ((i4 & 8) != 0) {
            i3 = ecTaskProgress.itemTotal;
        }
        if ((i4 & 16) != 0) {
            l = ecTaskProgress.bytesDone;
        }
        if ((i4 & 32) != 0) {
            l2 = ecTaskProgress.bytesTotal;
        }
        return ecTaskProgress.copy(list, i, i2, i3, l, l2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.processList, Integer.valueOf(this.itemFailed), Integer.valueOf(this.itemDone), Integer.valueOf(this.itemTotal), this.bytesDone, this.bytesTotal};
    }

    public final List<String> component1() {
        return this.processList;
    }

    public final int component2() {
        return this.itemFailed;
    }

    public final int component3() {
        return this.itemDone;
    }

    public final int component4() {
        return this.itemTotal;
    }

    public final Long component5() {
        return this.bytesDone;
    }

    public final Long component6() {
        return this.bytesTotal;
    }

    public final EcTaskProgress copy(List<String> list, int i, int i2, int i3, Long l, Long l2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), l, l2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (EcTaskProgress) proxy.result;
        }
        C106862S5w.LIZ(list);
        return new EcTaskProgress(list, i, i2, i3, l, l2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EcTaskProgress) {
            return C106862S5w.LIZ(((EcTaskProgress) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EcTaskProgress:%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final Long getBytesDone() {
        return this.bytesDone;
    }

    public final Long getBytesTotal() {
        return this.bytesTotal;
    }

    public final int getItemDone() {
        return this.itemDone;
    }

    public final int getItemFailed() {
        return this.itemFailed;
    }

    public final int getItemTotal() {
        return this.itemTotal;
    }

    public final List<String> getProcessList() {
        return this.processList;
    }

    public EcTaskProgress(List<String> list, int i, int i2, int i3, Long l, Long l2) {
        C106862S5w.LIZ(list);
        this.processList = list;
        this.itemFailed = i;
        this.itemDone = i2;
        this.itemTotal = i3;
        this.bytesDone = l;
        this.bytesTotal = l2;
    }
}
