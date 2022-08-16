package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.FlexImageModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C109391T5d;

/* loaded from: classes11.dex */
public class ProfileCustomSkin {
    @SerializedName("avatar_border")
    public ImageModel avatarBorder;
    @SerializedName("avatar_border_dress_id")
    public String avatarBorderDressId;
    @SerializedName("bg_ui")
    public BgUI bgSkin;
    @SerializedName("follow_info_color")
    public String followInfoColor;
    @SerializedName("honor_wall_ui")
    public HonorWallUI honorWallSkin;
    @SerializedName("nickname_color")
    public GradientColor nickNameColor;
    @SerializedName("secondary_button_ui")
    public SecondaryButtonUI secondaryButtonSkin;
    @SerializedName("signature_color")
    public String signatureColor;
    @SerializedName("tag_ui")
    public TagUI tagSkin;

    /* loaded from: classes11.dex */
    public static class BgUI {
        @SerializedName(C109391T5d.LIZ)
        public GradientColor bgColor;
        @SerializedName("overall_image")
        public ImageModel cardBg;
        @SerializedName("split_line_color")
        public String dividerColor;
        @SerializedName("right_image")
        public FlexImageModel rightBottomImage;
        @SerializedName("top_border")
        public FlexImageModel topBorder;

        static {
            Covode.recordClassIndex(14166);
        }
    }

    /* loaded from: classes11.dex */
    public static class GradientColor {
        @SerializedName("from")
        public String from;
        @SerializedName("to")

        /* renamed from: to */
        public String f25760to;

        static {
            Covode.recordClassIndex(14167);
        }
    }

    /* loaded from: classes11.dex */
    public static class HonorWallUI {
        @SerializedName("content_color")
        public String contentColor;
        @SerializedName("title_color")
        public String titleColor;

        static {
            Covode.recordClassIndex(14168);
        }
    }

    /* loaded from: classes11.dex */
    public static class SecondaryButtonUI {
        @SerializedName("background_color")
        public String backgroundColor;
        @SerializedName("border_color")
        public String borderColor;
        @SerializedName("icon_color")
        public String iconColor;

        static {
            Covode.recordClassIndex(14169);
        }
    }

    /* loaded from: classes11.dex */
    public static class TagUI {
        @SerializedName("background_color")
        public String backgroundColor;
        @SerializedName("word_color")
        public String wordColor;

        static {
            Covode.recordClassIndex(14170);
        }
    }

    static {
        Covode.recordClassIndex(14165);
    }
}
