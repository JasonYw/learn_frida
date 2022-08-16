package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C65773BxH;

/* loaded from: classes12.dex */
public class BorderInfo implements Parcelable {
    public static final Parcelable.Creator<BorderInfo> CREATOR = new C65773BxH(BorderInfo.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("icon")
    public ImageModel LIZIZ;
    @SerializedName("level")
    public long LIZJ;
    @SerializedName("thumb_icon")
    public ImageModel LIZLLL;
    @SerializedName("dress_id")

    /* renamed from: LJ */
    public String f25758LJ;

    static {
        Covode.recordClassIndex(14140);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        parcel.writeParcelable(this.LIZIZ, i);
        parcel.writeLong(this.LIZJ);
        parcel.writeParcelable(this.LIZLLL, i);
        parcel.writeString(this.f25758LJ);
    }

    public BorderInfo() {
    }

    public int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ImageModel imageModel = this.LIZIZ;
        if (imageModel != null) {
            i = imageModel.hashCode();
        }
        long j = this.LIZJ;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public BorderInfo(Parcel parcel) {
        this.LIZIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LIZJ = parcel.readLong();
        this.LIZLLL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.f25758LJ = parcel.readString();
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BorderInfo borderInfo = (BorderInfo) obj;
            if (this.LIZJ != borderInfo.LIZJ) {
                return false;
            }
            ImageModel imageModel = this.LIZIZ;
            ImageModel imageModel2 = borderInfo.LIZIZ;
            if (imageModel != null) {
                return imageModel.equals(imageModel2);
            }
            if (imageModel2 == null) {
                return true;
            }
        }
        return false;
    }
}
