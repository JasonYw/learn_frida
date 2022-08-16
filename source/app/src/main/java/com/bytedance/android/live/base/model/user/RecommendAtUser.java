package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes17.dex */
public class RecommendAtUser implements Serializable {
    @SerializedName("cursor")
    public long cursor;
    @SerializedName("has_more")
    public boolean hasMore;
    @SerializedName("recently_at_user_list")
    public List<User> recentlyAtUsers;
    @SerializedName("user_list")
    public List<User> users;

    static {
        Covode.recordClassIndex(14181);
    }
}
