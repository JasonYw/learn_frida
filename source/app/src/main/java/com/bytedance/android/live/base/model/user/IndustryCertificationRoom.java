package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class IndustryCertificationRoom implements Parcelable {
    public static final Parcelable.Creator<IndustryCertificationRoom> CREATOR = new C65773BxH(IndustryCertificationRoom.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("room_owner")
    public RoomOwner mRoomOwner;

    static {
        Covode.recordClassIndex(14158);
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
        parcel.writeParcelable(this.mRoomOwner, i);
    }

    public IndustryCertificationRoom() {
    }

    public RoomOwner getRoomOwner() {
        return this.mRoomOwner;
    }

    public void setRoomOwner(RoomOwner roomOwner) {
        this.mRoomOwner = roomOwner;
    }

    public IndustryCertificationRoom(Parcel parcel) {
        this.mRoomOwner = (RoomOwner) parcel.readParcelable(RoomOwner.class.getClassLoader());
    }
}
