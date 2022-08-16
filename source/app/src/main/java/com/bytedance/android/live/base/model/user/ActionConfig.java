package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class ActionConfig {
    @SerializedName("action")
    public ImageModel action;
    @SerializedName("action_type")
    public long actionType;
    @SerializedName("enable")
    public boolean enable = true;
    @SerializedName("click_text")
    public String tips = "";
    public static long TYPE_WGAME = 1;
    public static long TYPE_SEND_GIFT = 2;
    public static long TYPE_LINK = 3;
    public static long TYPE_FLASH_SHOP = 4;
    public static long TYPE_DIGG = 5;

    static {
        Covode.recordClassIndex(14127);
    }
}
