package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class IndustryCertificationProfile implements Parcelable {
    public static final Parcelable.Creator<IndustryCertificationProfile> CREATOR = new C65773BxH(IndustryCertificationProfile.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bg_color")
    public String bgColor;
    @SerializedName("cert_type")
    public int certType;
    @SerializedName("content")
    public String content;
    @SerializedName("content_color")
    public String contentColor;
    @SerializedName("icon")
    public ImageModel icon;
    @SerializedName("schema")
    public String schema;

    static {
        Covode.recordClassIndex(14157);
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
        parcel.writeParcelable(this.icon, i);
        parcel.writeString(this.content);
        parcel.writeString(this.schema);
        parcel.writeString(this.contentColor);
        parcel.writeString(this.bgColor);
        parcel.writeInt(this.certType);
    }

    public IndustryCertificationProfile() {
    }

    public String getContent() {
        return this.content;
    }

    public ImageModel getIcon() {
        return this.icon;
    }

    public String getSchema() {
        return this.schema;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIcon(ImageModel imageModel) {
        this.icon = imageModel;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public IndustryCertificationProfile(Parcel parcel) {
        this.icon = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.content = parcel.readString();
        this.schema = parcel.readString();
        this.contentColor = parcel.readString();
        this.bgColor = parcel.readString();
        this.certType = parcel.readInt();
    }
}
