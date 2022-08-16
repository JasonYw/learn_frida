package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class ActivityBadges {
    @SerializedName("badges")
    public ArrayList<NewProfileBadge> badges;
    @SerializedName("open_url")
    public String url;

    /* loaded from: classes11.dex */
    public static class GradientColor {
        @SerializedName("from")
        public String from;
        @SerializedName("to")

        /* renamed from: to */
        public String f25754to;

        static {
            Covode.recordClassIndex(14130);
        }
    }

    /* loaded from: classes11.dex */
    public static class NewProfileBadge {
        @SerializedName("bg_color")
        public GradientColor bgColor;
        @SerializedName("expire_date")
        public String expireDate;
        @SerializedName("image")
        public ImageModel image;
        @SerializedName("name")
        public String name;
        @SerializedName("reward_date")
        public String reward_date;
        @SerializedName("bg_icon")
        public ImageModel rightIcon;

        static {
            Covode.recordClassIndex(14131);
        }
    }

    static {
        Covode.recordClassIndex(14129);
    }
}
