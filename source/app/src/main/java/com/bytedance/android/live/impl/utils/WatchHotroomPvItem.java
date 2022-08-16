package com.bytedance.android.live.impl.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class WatchHotroomPvItem implements AbstractC4253b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    public String date;
    @SerializedName("watch_hotroom_count")
    public long watchHotroomCount;
    @SerializedName("watch_hotroom_duration_sum")
    public long watchHotroomDurationSum;
    @SerializedName("watch_nothotroom_count")
    public long watchNotHotroomCount;
    @SerializedName("watch_nothotroom_duration_sum")
    public long watchNotHotroomDurationSum;

    static {
        Covode.recordClassIndex(25047);
    }

    public WatchHotroomPvItem() {
        this(null, 0L, 0L, 0L, 0L, 31, null);
    }

    public static /* synthetic */ WatchHotroomPvItem copy$default(WatchHotroomPvItem watchHotroomPvItem, String str, long j, long j2, long j3, long j4, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{watchHotroomPvItem, str, new Long(j), new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (WatchHotroomPvItem) proxy.result;
        }
        if ((i & 1) != 0) {
            str = watchHotroomPvItem.date;
        }
        if ((i & 2) != 0) {
            j = watchHotroomPvItem.watchHotroomCount;
        }
        if ((i & 4) != 0) {
            j2 = watchHotroomPvItem.watchHotroomDurationSum;
        }
        if ((i & 8) != 0) {
            j3 = watchHotroomPvItem.watchNotHotroomCount;
        }
        if ((i & 16) != 0) {
            j4 = watchHotroomPvItem.watchNotHotroomDurationSum;
        }
        return watchHotroomPvItem.copy(str, j, j2, j3, j4);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.date, Long.valueOf(this.watchHotroomCount), Long.valueOf(this.watchHotroomDurationSum), Long.valueOf(this.watchNotHotroomCount), Long.valueOf(this.watchNotHotroomDurationSum)};
    }

    public final String component1() {
        return this.date;
    }

    public final long component2() {
        return this.watchHotroomCount;
    }

    public final long component3() {
        return this.watchHotroomDurationSum;
    }

    public final long component4() {
        return this.watchNotHotroomCount;
    }

    public final long component5() {
        return this.watchNotHotroomDurationSum;
    }

    public final WatchHotroomPvItem copy(String str, long j, long j2, long j3, long j4) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), new Long(j2), new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (WatchHotroomPvItem) proxy.result : new WatchHotroomPvItem(str, j, j2, j3, j4);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof WatchHotroomPvItem) {
            return C106862S5w.LIZ(((WatchHotroomPvItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("WatchHotroomPvItem:%s,%s,%s,%s,%s", getObjects());
    }

    public final String getDate() {
        return this.date;
    }

    public final long getWatchHotroomCount() {
        return this.watchHotroomCount;
    }

    public final long getWatchHotroomDurationSum() {
        return this.watchHotroomDurationSum;
    }

    public final long getWatchNotHotroomCount() {
        return this.watchNotHotroomCount;
    }

    public final long getWatchNotHotroomDurationSum() {
        return this.watchNotHotroomDurationSum;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setWatchHotroomCount(long j) {
        this.watchHotroomCount = j;
    }

    public final void setWatchHotroomDurationSum(long j) {
        this.watchHotroomDurationSum = j;
    }

    public final void setWatchNotHotroomCount(long j) {
        this.watchNotHotroomCount = j;
    }

    public final void setWatchNotHotroomDurationSum(long j) {
        this.watchNotHotroomDurationSum = j;
    }

    public WatchHotroomPvItem(String str, long j, long j2, long j3, long j4) {
        this.date = str;
        this.watchHotroomCount = j;
        this.watchHotroomDurationSum = j2;
        this.watchNotHotroomCount = j3;
        this.watchNotHotroomDurationSum = j4;
    }

    public /* synthetic */ WatchHotroomPvItem(String str, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) == 0 ? j4 : 0L);
    }
}
