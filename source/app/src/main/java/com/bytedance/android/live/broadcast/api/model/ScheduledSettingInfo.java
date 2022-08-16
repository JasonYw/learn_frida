package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.LJ0;

/* loaded from: classes5.dex */
public final class ScheduledSettingInfo implements Serializable {
    public static final LJ0 Companion = new LJ0((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("scheduled_days")
    public int anchorScheduledDays;
    @SerializedName("scheduled_time")
    public String anchorScheduledTime;
    @SerializedName("scheduled_master_switch")
    public boolean masterSwitch;
    @SerializedName("scheduled_notice_switch_display")
    public int noticeSwitchDisplay;
    @SerializedName("scheduled_profile_switch")
    public boolean profileSwitch;
    @SerializedName("scheduled_notice_switch")
    public int pushSwitch;
    @SerializedName("scheduled_time_text")
    public String scheduledTimeWords;

    static {
        Covode.recordClassIndex(14521);
    }

    public ScheduledSettingInfo() {
        this(false, false, 0, null, 0, 0, null, 127);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.masterSwitch), Boolean.valueOf(this.profileSwitch), Integer.valueOf(this.pushSwitch), this.anchorScheduledTime, Integer.valueOf(this.anchorScheduledDays), Integer.valueOf(this.noticeSwitchDisplay), this.scheduledTimeWords};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScheduledSettingInfo) {
            return C106862S5w.LIZ(((ScheduledSettingInfo) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ScheduledSettingInfo:%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public ScheduledSettingInfo(boolean z, boolean z2, int i, String str, int i2, int i3, String str2) {
        this.masterSwitch = z;
        this.profileSwitch = z2;
        this.pushSwitch = i;
        this.anchorScheduledTime = str;
        this.anchorScheduledDays = i2;
        this.noticeSwitchDisplay = i3;
        this.scheduledTimeWords = str2;
    }

    public /* synthetic */ ScheduledSettingInfo(boolean z, boolean z2, int i, String str, int i2, int i3, String str2, int i4) {
        this(false, false, 0, null, 0, 0, null);
    }
}
