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
public final class EnterRoomDurationItem implements AbstractC4253b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    public String date;
    @SerializedName("enter_duration_sum")
    public long enterDurationSum;
    public int frequency;

    static {
        Covode.recordClassIndex(25035);
    }

    public EnterRoomDurationItem() {
        this(null, 0L, 0, 7, null);
    }

    public static /* synthetic */ EnterRoomDurationItem copy$default(EnterRoomDurationItem enterRoomDurationItem, String str, long j, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{enterRoomDurationItem, str, new Long(j), Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EnterRoomDurationItem) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = enterRoomDurationItem.date;
        }
        if ((i2 & 2) != 0) {
            j = enterRoomDurationItem.enterDurationSum;
        }
        if ((i2 & 4) != 0) {
            i = enterRoomDurationItem.frequency;
        }
        return enterRoomDurationItem.copy(str, j, i);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.date, Long.valueOf(this.enterDurationSum), Integer.valueOf(this.frequency)};
    }

    public final String component1() {
        return this.date;
    }

    public final long component2() {
        return this.enterDurationSum;
    }

    public final int component3() {
        return this.frequency;
    }

    public final EnterRoomDurationItem copy(String str, long j, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (EnterRoomDurationItem) proxy.result : new EnterRoomDurationItem(str, j, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnterRoomDurationItem) {
            return C106862S5w.LIZ(((EnterRoomDurationItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EnterRoomDurationItem:%s,%s,%s", getObjects());
    }

    public final String getDate() {
        return this.date;
    }

    public final long getEnterDurationSum() {
        return this.enterDurationSum;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setEnterDurationSum(long j) {
        this.enterDurationSum = j;
    }

    public final void setFrequency(int i) {
        this.frequency = i;
    }

    public EnterRoomDurationItem(String str, long j, int i) {
        this.date = str;
        this.enterDurationSum = j;
        this.frequency = i;
    }

    public /* synthetic */ EnterRoomDurationItem(String str, long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? 0 : i);
    }
}
