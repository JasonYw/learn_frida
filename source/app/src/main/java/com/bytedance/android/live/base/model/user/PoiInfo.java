package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class PoiInfo implements Parcelable {
    public static final Parcelable.Creator<PoiInfo> CREATOR = new C65773BxH(PoiInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("follower_count_permission")
    public long followerCountPermission;
    @SerializedName("poi_id")
    public long poiId;
    @SerializedName("poi_id_str")
    public String poiIdStr;
    @SerializedName("poi_name")
    public String poiName;
    @SerializedName("is_poi_enabled")
    public boolean poiPermission;
    @SerializedName("white_user_permission")
    public long whiteUserPermission;

    static {
        Covode.recordClassIndex(14164);
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
        parcel.writeByte(this.poiPermission ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.poiId);
        parcel.writeString(this.poiName);
        parcel.writeString(this.poiIdStr);
        parcel.writeLong(this.followerCountPermission);
        parcel.writeLong(this.whiteUserPermission);
    }

    public PoiInfo() {
    }

    public long getPoiId() {
        return this.poiId;
    }

    public String getPoiIdStr() {
        return this.poiIdStr;
    }

    public String getPoiName() {
        return this.poiName;
    }

    public boolean isFollowPermission() {
        if (this.followerCountPermission == 1) {
            return true;
        }
        return false;
    }

    public boolean isPoiPermission() {
        if (!this.poiPermission && this.whiteUserPermission != 1) {
            return false;
        }
        return true;
    }

    public PoiInfo(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.poiPermission = z;
        this.poiId = parcel.readLong();
        this.poiName = parcel.readString();
        this.poiIdStr = parcel.readString();
        this.followerCountPermission = parcel.readLong();
        this.whiteUserPermission = parcel.readLong();
    }
}
