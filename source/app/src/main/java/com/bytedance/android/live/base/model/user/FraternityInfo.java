package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes8.dex */
public class FraternityInfo implements Parcelable {
    public static final Parcelable.Creator<FraternityInfo> CREATOR = new C65773BxH(FraternityInfo.class);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("background")
    public ImageModel background;
    @SerializedName("font_color")
    public String fontColor;
    @SerializedName("level")
    public long level;
    @SerializedName("name")
    public String name;

    static {
        Covode.recordClassIndex(14148);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        parcel.writeString(this.name);
        parcel.writeLong(this.level);
        parcel.writeParcelable(this.background, i);
        parcel.writeString(this.fontColor);
    }

    public FraternityInfo() {
    }

    public ImageModel getBackground() {
        return this.background;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public long getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public boolean isValid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(this.name) || this.level <= 0 || this.background == null) {
            return false;
        }
        return true;
    }

    public void setBackground(ImageModel imageModel) {
        this.background = imageModel;
    }

    public void setFontColor(String str) {
        this.fontColor = str;
    }

    public void setLevel(long j) {
        this.level = j;
    }

    public void setName(String str) {
        this.name = str;
    }

    public FraternityInfo(Parcel parcel) {
        this.name = parcel.readString();
        this.level = parcel.readLong();
        this.background = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.fontColor = parcel.readString();
    }
}
