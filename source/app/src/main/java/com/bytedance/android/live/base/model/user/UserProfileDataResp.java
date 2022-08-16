package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes12.dex */
public class UserProfileDataResp {
    @SerializedName("user_profile")
    public NewProfileUser profileUser;
    @SerializedName("user_data")
    public User roomUser;

    /* loaded from: classes12.dex */
    public static class UserProfileExtra extends Extra {
        @SerializedName("anonymous_is_silence")
        public boolean anonymousIsSilence;
        @SerializedName("mystery_detail_jump_schema")
        public String mysteryDetailJumpSchema;

        static {
            Covode.recordClassIndex(14193);
        }
    }

    static {
        Covode.recordClassIndex(14192);
    }
}
