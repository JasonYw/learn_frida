package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ProfileFollowInfo extends FollowInfo {
    @SerializedName("accounts")
    public ArrayList<MutualFollowUser> accounts;
    @SerializedName("follower_count_enable")
    public boolean followerCountEnable = true;
    @SerializedName("follower_list_enable")
    public boolean jumpFollowerListEnable = true;
    @SerializedName("mutual_follow_count")
    public long mutualFollowCount;

    static {
        Covode.recordClassIndex(14174);
    }
}
