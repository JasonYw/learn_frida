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
public final class StallRecordItem implements AbstractC4253b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    public String date;
    public int frequency;
    @SerializedName("stall_ui_rate_sum")
    public float stallUiRateSum;
    @SerializedName("stall_video_ui_rate_sum")
    public float stallVideoUiRateSum;

    static {
        Covode.recordClassIndex(25044);
    }

    public StallRecordItem() {
        this(null, 0.0f, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ StallRecordItem copy$default(StallRecordItem stallRecordItem, String str, float f, float f2, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{stallRecordItem, str, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (StallRecordItem) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = stallRecordItem.date;
        }
        if ((i2 & 2) != 0) {
            f = stallRecordItem.stallVideoUiRateSum;
        }
        if ((i2 & 4) != 0) {
            f2 = stallRecordItem.stallUiRateSum;
        }
        if ((i2 & 8) != 0) {
            i = stallRecordItem.frequency;
        }
        return stallRecordItem.copy(str, f, f2, i);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.date, Float.valueOf(this.stallVideoUiRateSum), Float.valueOf(this.stallUiRateSum), Integer.valueOf(this.frequency)};
    }

    public final String component1() {
        return this.date;
    }

    public final float component2() {
        return this.stallVideoUiRateSum;
    }

    public final float component3() {
        return this.stallUiRateSum;
    }

    public final int component4() {
        return this.frequency;
    }

    public final StallRecordItem copy(String str, float f, float f2, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (StallRecordItem) proxy.result : new StallRecordItem(str, f, f2, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof StallRecordItem) {
            return C106862S5w.LIZ(((StallRecordItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StallRecordItem:%s,%s,%s,%s", getObjects());
    }

    public final String getDate() {
        return this.date;
    }

    public final int getFrequency() {
        return this.frequency;
    }

    public final float getStallUiRateSum() {
        return this.stallUiRateSum;
    }

    public final float getStallVideoUiRateSum() {
        return this.stallVideoUiRateSum;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setFrequency(int i) {
        this.frequency = i;
    }

    public final void setStallUiRateSum(float f) {
        this.stallUiRateSum = f;
    }

    public final void setStallVideoUiRateSum(float f) {
        this.stallVideoUiRateSum = f;
    }

    public StallRecordItem(String str, float f, float f2, int i) {
        this.date = str;
        this.stallVideoUiRateSum = f;
        this.stallUiRateSum = f2;
        this.frequency = i;
    }

    public /* synthetic */ StallRecordItem(String str, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? 0.0f : f2, (i2 & 8) != 0 ? 0 : i);
    }
}
