package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes20.dex */
public final class RoomStatusData {
    @SerializedName("live_comment_ucnt")
    public long commentCount;
    @SerializedName("live_consume_ucnt")
    public long giftCount;
    @SerializedName("live_new_fans_ucnt")
    public long newFansCount;
    @SerializedName("room_id")
    public long roomId;
    @SerializedName("live_watch_ucnt")
    public long watchCount;

    static {
        Covode.recordClassIndex(14519);
    }

    public final long getCommentCount() {
        return this.commentCount;
    }

    public final long getGiftCount() {
        return this.giftCount;
    }

    public final long getNewFansCount() {
        return this.newFansCount;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final long getWatchCount() {
        return this.watchCount;
    }

    public final void setCommentCount(long j) {
        this.commentCount = j;
    }

    public final void setGiftCount(long j) {
        this.giftCount = j;
    }

    public final void setNewFansCount(long j) {
        this.newFansCount = j;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setWatchCount(long j) {
        this.watchCount = j;
    }
}
