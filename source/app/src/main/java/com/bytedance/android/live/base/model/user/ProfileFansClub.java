package com.bytedance.android.live.base.model.user;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* loaded from: classes12.dex */
public class ProfileFansClub {
    @SerializedName(C2521l.LJIIL)
    public ProfileFansClubData data;
    @SerializedName("total_fans_count_str")
    public String fansCountStr;
    @SerializedName("total_fans_count_substr")
    public String fansCountSubStr;
    @SerializedName("prefer_data")
    public Map<Integer, ProfileFansClubData> preferData;
    @SerializedName("total_fans_count")
    public long totalFansCount;

    static {
        Covode.recordClassIndex(14171);
    }

    public ProfileFansClubData getData() {
        return this.data;
    }

    public Map<Integer, ProfileFansClubData> getPreferData() {
        return this.preferData;
    }

    public void setData(ProfileFansClubData profileFansClubData) {
        this.data = profileFansClubData;
    }

    public void setPreferData(Map<Integer, ProfileFansClubData> map) {
        this.preferData = map;
    }
}
