package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes5.dex */
public class GradeBuffInfo implements Parcelable {
    public static final Parcelable.Creator<GradeBuffInfo> CREATOR = new C65773BxH(GradeBuffInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("buff_badge")
    public ImageModel buffBadge;
    @SerializedName("buff_level")
    public int buffLevel;
    @SerializedName("end_time")
    public int endTime;
    @SerializedName("status")
    public int status;

    static {
        Covode.recordClassIndex(14150);
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
        parcel.writeInt(this.buffLevel);
        parcel.writeInt(this.status);
        parcel.writeInt(this.endTime);
        parcel.writeParcelable(this.buffBadge, i);
    }

    public GradeBuffInfo() {
    }

    public GradeBuffInfo(Parcel parcel) {
        this.buffLevel = parcel.readInt();
        this.status = parcel.readInt();
        this.endTime = parcel.readInt();
        this.buffBadge = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
    }
}
