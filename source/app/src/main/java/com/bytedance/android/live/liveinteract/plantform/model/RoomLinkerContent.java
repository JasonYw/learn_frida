package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes3.dex */
public class RoomLinkerContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("anchor_id")
    public long anchorId;
    @SerializedName("is_anchor_background")
    public int isGuestAnchorBackground;
    @SerializedName("linked_users")
    public List<AnchorLinkUser> linkedUsers;
    @SerializedName("room_link_silence_status")
    public int roomLinkSilenceStatus;

    static {
        Covode.recordClassIndex(29411);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "RoomLinkerContent{linkedUsers=" + this.linkedUsers + ", roomLinkSilenceStatus=" + this.roomLinkSilenceStatus + ", anchorId=" + this.anchorId + ", isGuestAnchorBackground=" + this.isGuestAnchorBackground + '}';
    }
}
