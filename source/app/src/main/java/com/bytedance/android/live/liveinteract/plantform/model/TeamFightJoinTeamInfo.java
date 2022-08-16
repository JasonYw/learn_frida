package com.bytedance.android.live.liveinteract.plantform.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes3.dex */
public class TeamFightJoinTeamInfo implements Parcelable {
    public static final Parcelable.Creator<TeamFightJoinTeamInfo> CREATOR = new C65773BxH(TeamFightJoinTeamInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("team_id")
    public long teamId;

    static {
        Covode.recordClassIndex(29412);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        parcel.writeLong(this.teamId);
    }

    public TeamFightJoinTeamInfo() {
    }

    public TeamFightJoinTeamInfo(Parcel parcel) {
        this.teamId = parcel.readLong();
    }
}
