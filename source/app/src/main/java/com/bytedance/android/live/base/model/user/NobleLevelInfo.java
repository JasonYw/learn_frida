package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class NobleLevelInfo implements Parcelable {
    public static final Parcelable.Creator<NobleLevelInfo> CREATOR = new C65773BxH(NobleLevelInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("expire_time")
    public long expireTime;
    @SerializedName("noble_background")
    public ImageModel nobleBackground;
    @SerializedName("noble_background_color")
    public List<String> nobleBackgroundColor;
    @SerializedName("noble_big_icon")
    public ImageModel nobleBigIcon;
    @SerializedName("noble_boarder")
    public ImageModel nobleBoarder;
    @SerializedName("noble_icon")
    public ImageModel nobleIcon;
    @SerializedName("noble_icon_with_back")
    public ImageModel nobleIconWithBack;
    @SerializedName("noble_level")
    public long nobleLevel;
    @SerializedName("noble_name")
    public String nobleName;

    static {
        Covode.recordClassIndex(14162);
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
        parcel.writeParcelable(this.nobleBackground, i);
        parcel.writeLong(this.nobleLevel);
        parcel.writeParcelable(this.nobleIcon, i);
        parcel.writeParcelable(this.nobleBigIcon, i);
        parcel.writeParcelable(this.nobleIconWithBack, i);
        parcel.writeString(this.nobleName);
        parcel.writeLong(this.expireTime);
        parcel.writeParcelable(this.nobleBoarder, i);
        parcel.writeStringList(this.nobleBackgroundColor);
    }

    public NobleLevelInfo() {
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public ImageModel getNobleBackground() {
        return this.nobleBackground;
    }

    public List<String> getNobleBackgroundColor() {
        return this.nobleBackgroundColor;
    }

    public ImageModel getNobleBigIcon() {
        return this.nobleBigIcon;
    }

    public ImageModel getNobleBoarder() {
        return this.nobleBoarder;
    }

    public ImageModel getNobleIcon() {
        return this.nobleIcon;
    }

    public ImageModel getNobleIconWithBack() {
        return this.nobleIconWithBack;
    }

    public long getNobleLevel() {
        return this.nobleLevel;
    }

    public String getNobleName() {
        return this.nobleName;
    }

    public void setExpireTime(long j) {
        this.expireTime = j;
    }

    public void setNobleBackground(ImageModel imageModel) {
        this.nobleBackground = imageModel;
    }

    public void setNobleBackgroundColor(List<String> list) {
        this.nobleBackgroundColor = list;
    }

    public void setNobleBigIcon(ImageModel imageModel) {
        this.nobleBigIcon = imageModel;
    }

    public void setNobleBoarder(ImageModel imageModel) {
        this.nobleBoarder = imageModel;
    }

    public void setNobleIcon(ImageModel imageModel) {
        this.nobleIcon = imageModel;
    }

    public void setNobleIconWithBack(ImageModel imageModel) {
        this.nobleIconWithBack = imageModel;
    }

    public void setNobleLevel(long j) {
        this.nobleLevel = j;
    }

    public void setNobleName(String str) {
        this.nobleName = str;
    }

    public NobleLevelInfo(Parcel parcel) {
        this.nobleBackground = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.nobleLevel = parcel.readLong();
        this.nobleIcon = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.nobleBigIcon = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.nobleIconWithBack = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.nobleName = parcel.readString();
        this.expireTime = parcel.readLong();
        this.nobleBoarder = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.nobleBackgroundColor = parcel.createStringArrayList();
    }
}
