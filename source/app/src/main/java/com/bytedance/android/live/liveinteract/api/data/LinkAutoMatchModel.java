package com.bytedance.android.live.liveinteract.api.data;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes3.dex */
public class LinkAutoMatchModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("can_high_way")
    public boolean canHighWay;
    @SerializedName("default_avatar")
    public ImageModel defaultAvatar;
    @SerializedName("default_content")
    public String defaultContent;
    @SerializedName("expect_time")
    public long expectTime;
    @SerializedName("max_wait_time")
    public long maxWaitTime;
    @SerializedName("preview_user_list")
    public List<C4279a> previewUserList;
    @SerializedName("rival_room")
    public Room rivalRoom;
    @SerializedName("rival_user_id")
    public long rivalUserId;
    @SerializedName("rivals")
    public List<C4278a> rivals;
    @SerializedName("sign_extra")
    public String signExtra;

    static {
        Covode.recordClassIndex(25151);
    }

    public ImageModel getDefaultAvatar() {
        return this.defaultAvatar;
    }

    public String getDefaultContent() {
        return this.defaultContent;
    }

    public long getExpectTime() {
        return this.expectTime;
    }

    public List<C4279a> getPreviewUserList() {
        return this.previewUserList;
    }

    public Room getRivalRoom() {
        return this.rivalRoom;
    }

    public long getRivalUserId() {
        return this.rivalUserId;
    }

    public boolean isCanHighWay() {
        return this.canHighWay;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.api.data.LinkAutoMatchModel$a */
    /* loaded from: classes3.dex */
    public static class C4278a {
        public static ChangeQuickRedirect LIZ;
        @SerializedName("user_id")
        public long LIZIZ;
        @SerializedName("room")
        public Room LIZJ;

        static {
            Covode.recordClassIndex(25152);
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return "RivalInfo{userId=" + this.LIZIZ + '}';
        }
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LinkAutoMatchModel{rivalUserId=" + this.rivalUserId + ", rivalRoom=" + this.rivalRoom + ", expectTime=" + this.expectTime + ", canHighWay=" + this.canHighWay + ", maxWaitTime=" + this.maxWaitTime + ", signExtra='" + this.signExtra + "', rivals=" + this.rivals + '}';
    }

    public void setCanHighWay(boolean z) {
        this.canHighWay = z;
    }

    public void setDefaultAvatar(ImageModel imageModel) {
        this.defaultAvatar = imageModel;
    }

    public void setDefaultContent(String str) {
        this.defaultContent = str;
    }

    public void setPreviewUserList(List<C4279a> list) {
        this.previewUserList = list;
    }

    public void setRivalRoom(Room room) {
        this.rivalRoom = room;
    }

    public void setRivalUserId(long j) {
        this.rivalUserId = j;
    }
}
