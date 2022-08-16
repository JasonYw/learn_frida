package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes5.dex */
public class WaitingReviewInfo {
    @SerializedName("audit_content")
    public String content;
    @SerializedName("audit_status")
    public int status;
    @SerializedName("total_queue_cnt")
    public int totalWaitingCount;
    @SerializedName("cur_wait_cnt")
    public int waitingCount;
    @SerializedName("rule_info")
    public List<C3165l> waitingReviewRules;
    @SerializedName("to_wait_time")
    public int waitingTime;

    static {
        Covode.recordClassIndex(16986);
    }

    public String getContent() {
        return this.content;
    }

    public int getStatus() {
        return this.status;
    }

    public int getTotalWaitingCount() {
        return this.totalWaitingCount;
    }

    public int getWaitingCount() {
        return this.waitingCount;
    }

    public List<C3165l> getWaitingReviewRules() {
        return this.waitingReviewRules;
    }

    public int getWaitingTime() {
        return this.waitingTime;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalWaitingCount(int i) {
        this.totalWaitingCount = i;
    }

    public void setWaitingCount(int i) {
        this.waitingCount = i;
    }

    public void setWaitingReviewRules(List<C3165l> list) {
        this.waitingReviewRules = list;
    }

    public void setWaitingTime(int i) {
        this.waitingTime = i;
    }
}
