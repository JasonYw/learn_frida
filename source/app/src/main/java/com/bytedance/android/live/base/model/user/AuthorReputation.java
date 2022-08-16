package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class AuthorReputation {
    @SerializedName("level")
    public int level;
    @SerializedName("percent")
    public String percent;
    @SerializedName("sales")
    public String sales;
    @SerializedName("score")
    public double score;
    @SerializedName("text")
    public String text;

    static {
        Covode.recordClassIndex(14138);
    }

    public int getLevel() {
        return this.level;
    }

    public String getPercent() {
        return this.percent;
    }

    public String getSales() {
        return this.sales;
    }

    public double getScore() {
        return this.score;
    }

    public String getText() {
        return this.text;
    }
}
