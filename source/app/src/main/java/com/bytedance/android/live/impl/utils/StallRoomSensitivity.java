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
public final class StallRoomSensitivity implements AbstractC4253b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    public String date;
    @SerializedName("stall_room_count_more_than_watch_4s")
    public long stallRoomCount;
    @SerializedName("watch_room_count_more_than_4s")
    public long watchRoomCount;

    static {
        Covode.recordClassIndex(25045);
    }

    public StallRoomSensitivity() {
        this(null, 0L, 0L, 7, null);
    }

    public static /* synthetic */ StallRoomSensitivity copy$default(StallRoomSensitivity stallRoomSensitivity, String str, long j, long j2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{stallRoomSensitivity, str, new Long(j), new Long(j2), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (StallRoomSensitivity) proxy.result;
        }
        if ((i & 1) != 0) {
            str = stallRoomSensitivity.date;
        }
        if ((i & 2) != 0) {
            j = stallRoomSensitivity.watchRoomCount;
        }
        if ((i & 4) != 0) {
            j2 = stallRoomSensitivity.stallRoomCount;
        }
        return stallRoomSensitivity.copy(str, j, j2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.date, Long.valueOf(this.watchRoomCount), Long.valueOf(this.stallRoomCount)};
    }

    public final String component1() {
        return this.date;
    }

    public final long component2() {
        return this.watchRoomCount;
    }

    public final long component3() {
        return this.stallRoomCount;
    }

    public final StallRoomSensitivity copy(String str, long j, long j2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (StallRoomSensitivity) proxy.result : new StallRoomSensitivity(str, j, j2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof StallRoomSensitivity) {
            return C106862S5w.LIZ(((StallRoomSensitivity) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StallRoomSensitivity:%s,%s,%s", getObjects());
    }

    public final String getDate() {
        return this.date;
    }

    public final long getStallRoomCount() {
        return this.stallRoomCount;
    }

    public final long getWatchRoomCount() {
        return this.watchRoomCount;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setStallRoomCount(long j) {
        this.stallRoomCount = j;
    }

    public final void setWatchRoomCount(long j) {
        this.watchRoomCount = j;
    }

    public StallRoomSensitivity(String str, long j, long j2) {
        this.date = str;
        this.watchRoomCount = j;
        this.stallRoomCount = j2;
    }

    public /* synthetic */ StallRoomSensitivity(String str, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}
