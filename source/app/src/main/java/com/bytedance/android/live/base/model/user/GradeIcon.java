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

/* loaded from: classes3.dex */
public class GradeIcon implements Parcelable {
    public static final Parcelable.Creator<GradeIcon> CREATOR = new C65773BxH(GradeIcon.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("level_str")
    public String LIZIZ;
    @SerializedName("icon_diamond")
    public int LIZJ;
    @SerializedName("icon")
    public ImageModel LIZLLL;
    @SerializedName("level")

    /* renamed from: LJ */
    public int f25759LJ;

    static {
        Covode.recordClassIndex(14151);
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
        parcel.writeString(this.LIZIZ);
        parcel.writeInt(this.LIZJ);
        parcel.writeParcelable(this.LIZLLL, i);
        parcel.writeInt(this.f25759LJ);
    }

    public GradeIcon() {
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String str = this.LIZIZ;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((i * 31) + this.LIZJ) * 31;
        ImageModel imageModel = this.LIZLLL;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        }
        return ((i3 + i2) * 31) + this.f25759LJ;
    }

    public GradeIcon(Parcel parcel) {
        this.LIZIZ = parcel.readString();
        this.LIZJ = parcel.readInt();
        this.LIZLLL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.f25759LJ = parcel.readInt();
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
            GradeIcon gradeIcon = (GradeIcon) obj;
            if (this.LIZJ != gradeIcon.LIZJ || this.f25759LJ != gradeIcon.f25759LJ) {
                return false;
            }
            String str = this.LIZIZ;
            if (str != null) {
                if (!str.equals(gradeIcon.LIZIZ)) {
                    return false;
                }
            } else if (gradeIcon.LIZIZ != null) {
                return false;
            }
            ImageModel imageModel = this.LIZLLL;
            ImageModel imageModel2 = gradeIcon.LIZLLL;
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
