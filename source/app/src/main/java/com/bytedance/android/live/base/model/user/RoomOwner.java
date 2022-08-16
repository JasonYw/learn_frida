package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes22.dex */
public class RoomOwner implements Parcelable {
    public static final Parcelable.Creator<RoomOwner> CREATOR = new C65773BxH(RoomOwner.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brand_store_title")
    public ImageModel brandCertImg;
    @SerializedName("left_color")
    public String leftColor;
    @SerializedName("right_color")
    public String rightColor;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public ImageModel title;
    @SerializedName("anchor_industry_type")
    public int type;

    static {
        Covode.recordClassIndex(14182);
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
        parcel.writeParcelable(this.title, i);
        parcel.writeString(this.subTitle);
        parcel.writeString(this.leftColor);
        parcel.writeString(this.rightColor);
        parcel.writeInt(this.type);
        parcel.writeParcelable(this.brandCertImg, i);
    }

    public RoomOwner() {
    }

    public RoomOwner(Parcel parcel) {
        this.title = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.subTitle = parcel.readString();
        this.leftColor = parcel.readString();
        this.rightColor = parcel.readString();
        this.type = parcel.readInt();
        this.brandCertImg = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
    }
}
