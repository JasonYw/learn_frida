package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class PlatformBindInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("allow_sync")
    public boolean allowSync;
    @SerializedName("bind_user_name")
    public String bindUserName;
    @SerializedName("platform")
    public String platform;
    @SerializedName("publish_sync_tips_cnt")
    public int publishSyncTipsCnt;
    @SerializedName("tigger_full_sync")
    public boolean tiggerFullSync;

    static {
        Covode.recordClassIndex(14163);
    }

    public String getBindUserName() {
        return this.bindUserName;
    }

    public String getPlatform() {
        return this.platform;
    }

    public int getPublishSyncTipsCnt() {
        return this.publishSyncTipsCnt;
    }

    public boolean isAllowSync() {
        return this.allowSync;
    }

    public boolean isTiggerFullSync() {
        return this.tiggerFullSync;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String str = this.platform;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((((i * 31) + (this.allowSync ? 1 : 0)) * 31) + (this.tiggerFullSync ? 1 : 0)) * 31;
        String str2 = this.bindUserName;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + this.publishSyncTipsCnt;
    }

    public void setAllowSync(boolean z) {
        this.allowSync = z;
    }

    public void setBindUserName(String str) {
        this.bindUserName = str;
    }

    public void setPlatform(String str) {
        this.platform = str;
    }

    public void setPublishSyncTipsCnt(int i) {
        this.publishSyncTipsCnt = i;
    }

    public void setTiggerFullSync(boolean z) {
        this.tiggerFullSync = z;
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlatformBindInfo platformBindInfo = (PlatformBindInfo) obj;
            if (this.allowSync != platformBindInfo.allowSync || this.tiggerFullSync != platformBindInfo.tiggerFullSync || this.publishSyncTipsCnt != platformBindInfo.publishSyncTipsCnt) {
                return false;
            }
            String str = this.platform;
            if (str != null) {
                if (!str.equals(platformBindInfo.platform)) {
                    return false;
                }
            } else if (platformBindInfo.platform != null) {
                return false;
            }
            String str2 = this.bindUserName;
            String str3 = platformBindInfo.bindUserName;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }
}
