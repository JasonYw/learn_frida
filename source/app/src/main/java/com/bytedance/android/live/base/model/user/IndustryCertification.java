package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class IndustryCertification implements Parcelable {
    public static final Parcelable.Creator<IndustryCertification> CREATOR = new C65773BxH(IndustryCertification.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("profile")
    public IndustryCertificationProfile profile;
    @SerializedName("room")
    public IndustryCertificationRoom room;

    static {
        Covode.recordClassIndex(14156);
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
        parcel.writeParcelable(this.profile, i);
        parcel.writeParcelable(this.room, i);
    }

    public IndustryCertification() {
    }

    public IndustryCertificationProfile getProfile() {
        return this.profile;
    }

    public IndustryCertificationRoom getRoom() {
        return this.room;
    }

    public void setProfile(IndustryCertificationProfile industryCertificationProfile) {
        this.profile = industryCertificationProfile;
    }

    public void setRoom(IndustryCertificationRoom industryCertificationRoom) {
        this.room = industryCertificationRoom;
    }

    public IndustryCertification(Parcel parcel) {
        this.profile = (IndustryCertificationProfile) parcel.readParcelable(IndustryCertificationProfile.class.getClassLoader());
        this.room = (IndustryCertificationRoom) parcel.readParcelable(IndustryCertificationRoom.class.getClassLoader());
    }
}
