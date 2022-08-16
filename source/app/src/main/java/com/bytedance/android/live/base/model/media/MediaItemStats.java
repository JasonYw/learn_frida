package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;

/* loaded from: classes11.dex */
public class MediaItemStats {
    @SerializedName("comment_count")
    public int commentCount;
    @SerializedName("digg_count")
    public int diggCount;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public long f25751id;
    @SerializedName("play_count")
    public int playCount;
    @SerializedName("share_count")
    public int shareCount;

    static {
        Covode.recordClassIndex(14086);
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getId() {
        return this.f25751id;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setId(long j) {
        this.f25751id = j;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }
}
