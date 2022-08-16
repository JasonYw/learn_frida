package com.bytedance.android.live.broadcastgame.api.roomcat;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes8.dex */
public class CatData implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("age")
    public int age;
    @SerializedName("bowl_pos_x")
    public int bowlPosX;
    @SerializedName("bowl_pos_y")
    public int bowlPosY;
    @SerializedName("bowl_storage")
    public int bowlStorage;
    @SerializedName("bowl_weight")
    public int bowlWeight;
    @SerializedName("cat_id")
    public long catId;
    @SerializedName("cat_pos_x")
    public int catPosX;
    @SerializedName("cat_pos_y")
    public int catPosY;
    @SerializedName("cat_weight")
    public int catWeight;
    @SerializedName("category")
    public int category;
    @SerializedName("extra")
    public String extra;
    @SerializedName("last_feed_time")
    public long lastFeedTime;
    @SerializedName("last_interact_time")
    public long lastInteractTime;
    @SerializedName("name")
    public String name;
    @SerializedName("status")
    public int status;
    @SerializedName("user_id")
    public long userId;

    static {
        Covode.recordClassIndex(19248);
    }

    /* renamed from: clone */
    public CatData m25452clone() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (CatData) proxy.result;
        }
        return (CatData) super.clone();
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "CatData{catId=" + this.catId + ", userId=" + this.userId + ", status=" + this.status + ", category=" + this.category + ", name='" + this.name + "', age=" + this.age + ", catWeight=" + this.catWeight + ", bowlWeight=" + this.bowlWeight + ", bowlStorage=" + this.bowlStorage + ", catPosX=" + this.catPosX + ", catPosY=" + this.catPosY + ", bowlPosX=" + this.bowlPosX + ", bowlPosY=" + this.bowlPosY + ", lastInteractTime=" + this.lastInteractTime + ", lastFeedTime=" + this.lastFeedTime + ", extra='" + this.extra + "'}";
    }
}
