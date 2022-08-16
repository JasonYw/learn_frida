package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.livesdk.announce.AnnouncementInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes12.dex */
public class PermissionResult {
    public static final String[] AUTH_TYPES = {"others", "enterprise"};
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("announcement")
    public AnnouncementInfo announcementInfo;
    @SerializedName("authentication_type")
    public int authType;
    @SerializedName("broadcast_config")
    public ScheduledSettingInfo broadcastConfig;
    @SerializedName("buy_subscribe_switch")
    public int canBuyVIP;
    @SerializedName("shop_playback")
    public boolean commerceReplay;
    @SerializedName("shop_request_explain")
    public boolean commerceRequestExplain;
    @SerializedName("show_gift_setting_switch")
    public int giftSettingSwitch;
    @SerializedName("group_chat")
    public int groupChat;
    @SerializedName("highlight")
    public int highlight;
    @SerializedName("live_commercial")
    public boolean liveCommercial;
    @SerializedName("play_back")
    public int playBack;
    @SerializedName("record")
    public int record;
    @SerializedName("last_room")
    public LastRoomInfo roomInfo;
    @SerializedName("show_live_life_entry")
    public int showGroupPurchaseEntry;
    @SerializedName("stamps")
    public List<Integer> stamps;
    @SerializedName("welfare_info")
    public WelfarePermissionInfo welfarePermissionInfo;

    public int getGiftSettingSwitch() {
        return this.giftSettingSwitch;
    }

    public int getHighlight() {
        return this.highlight;
    }

    public int getPlayBack() {
        return this.playBack;
    }

    public int getRecord() {
        return this.record;
    }

    public boolean hasCommercialPermission() {
        return this.liveCommercial;
    }

    public boolean shouldShowGroupPurchaseEntry() {
        if (this.showGroupPurchaseEntry == 1) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(14499);
    }

    public String getAuthTypeExcludeDefault() {
        int i = this.authType;
        if (i > 0) {
            String[] strArr = AUTH_TYPES;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }
        return null;
    }

    public String getAuthTypeStr() {
        int i = this.authType;
        if (i >= 0) {
            String[] strArr = AUTH_TYPES;
            if (i < strArr.length) {
                return strArr[i];
            }
            return null;
        }
        return null;
    }

    public boolean hasSettingPermission() {
        if (this.playBack == 0 && this.record == 0 && this.broadcastConfig == null) {
            return false;
        }
        return true;
    }

    public boolean hasMiniAppPermission() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<Integer> list = this.stamps;
        if (list == null || !list.contains(4)) {
            return false;
        }
        return true;
    }

    public boolean hasLastRoomInfo() {
        Integer num;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        LastRoomInfo lastRoomInfo = this.roomInfo;
        if (lastRoomInfo != null) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], lastRoomInfo, LastRoomInfo.changeQuickRedirect, false, 1);
            if (!proxy2.isSupported ? !(lastRoomInfo.roomId == null || (((num = lastRoomInfo.roomId) != null && num.intValue() == 0) || (str = lastRoomInfo.roomIdStr) == null || str.length() == 0)) : !((Boolean) proxy2.result).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "PermissionResult{playBack=" + this.playBack + ", record=" + this.record + ", highlight=" + this.highlight + ", broadcastConfig=" + this.broadcastConfig + ", roomInfo=" + this.roomInfo + ", liveCommercial=" + this.liveCommercial + ", commerceReplay=" + this.commerceReplay + ", commerceRequestExplain=" + this.commerceRequestExplain + ", stamps=" + this.stamps + ", groupChat=" + this.groupChat + ", giftSettingSwitch=" + this.giftSettingSwitch + ", authType=" + this.authType + ", announcementInfo=" + this.announcementInfo + ", welfarePermissionInfo=" + this.welfarePermissionInfo + ", canBuyVIP=" + this.canBuyVIP + ", showGroupPurchaseEntry=" + this.showGroupPurchaseEntry + '}';
    }

    public void setGiftSettingSwitch(int i) {
        this.giftSettingSwitch = i;
    }

    public void setHighlight(int i) {
        this.highlight = i;
    }

    public void setPlayBack(int i) {
        this.playBack = i;
    }

    public void setRecord(int i) {
        this.record = i;
    }
}
