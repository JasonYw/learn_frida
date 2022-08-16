package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes5.dex */
public class CategoryNode implements Serializable {
    @SerializedName("can_choose")
    @Expose
    public boolean canChoose = true;
    @SerializedName("category_app_android")
    @Expose
    public List<String> categoryAppAndroid;
    @SerializedName("category_id")
    @Expose
    public Long categoryId;
    @SerializedName("challenge_id")
    @Expose
    public Long challengeId;
    @SerializedName("challenge_id_str")
    @Expose
    public String challengeIdStr;
    @SerializedName("challenge_name")
    @Expose
    public String challengeName;
    @Expose
    public boolean isNewCategory;
    @SerializedName("is_other_category")
    @Expose
    public boolean isOtherCategory;
    @SerializedName("is_removed")
    @Expose
    public boolean isRemoved;
    @SerializedName("level")
    @Expose
    public Integer level;
    @SerializedName("orientation")
    @Expose
    public int orientation;
    @SerializedName("sub_categorys")
    @Expose
    public List<CategoryNode> subCategories;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("unchoose_msg")
    @Expose
    public String unChooseMsg;

    static {
        Covode.recordClassIndex(14491);
    }
}
