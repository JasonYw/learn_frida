package com.bytedance.android.live.base.model.emoji;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.BaseEmoji;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p003X.C109391T5d;

/* loaded from: classes27.dex */
public class SelfEmoji extends BaseEmoji implements Serializable {
    public static final long serialVersionUID = 0;
    @SerializedName("animate_type")
    public String animateType;
    @SerializedName("animatedImage")
    public ImageModel animatedImage;
    @SerializedName("display_name")
    public String displayName;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public String f25738id;
    @SerializedName("isFromCache")
    public boolean isFromCache;
    @SerializedName("is_gif")
    public boolean isGif;
    @SerializedName("url_list")
    public List<String> mUrls = new ArrayList();
    @SerializedName("origin_package_id")
    public long resourcesId;
    @SerializedName("selfPosition")
    public int[] selfPosition;
    @SerializedName("staticImage")
    public ImageModel staticImage;
    @SerializedName("sticker_type")
    public int stickerType;
    @SerializedName(C109391T5d.LJFF)
    public int viewHeight;
    @SerializedName("width")
    public int viewWidth;
    @SerializedName("web_uri")
    public String webUri;

    static {
        Covode.recordClassIndex(14024);
    }

    public SelfEmoji() {
        this.type = BaseEmoji.Type.SelfEmoji;
    }
}
