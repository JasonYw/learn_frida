package com.bytedance.android.live.base.model.user;

import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes11.dex */
public class ProfileOwnRoom {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("room_ids_display")
    public List<Integer> roomIdDisplay;
    @SerializedName("room_ids")
    public List<Long> roomIdList;
    @SerializedName("room_ids_str")
    public List<String> roomIdStrList;

    static {
        Covode.recordClassIndex(14175);
    }

    public List<Long> getRoomIdList() {
        return this.roomIdList;
    }

    public List<String> getRoomIdStrList() {
        return this.roomIdStrList;
    }

    public boolean canJumpToLiveRoom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!Lists.isEmpty(this.roomIdDisplay) && this.roomIdDisplay.get(0).intValue() == 0) {
            return false;
        }
        return true;
    }

    public long getId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (Lists.isEmpty(this.roomIdList)) {
            return 0L;
        }
        return this.roomIdList.get(0).longValue();
    }
}
