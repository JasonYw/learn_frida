package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.AbstractC109984TRy;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class AnchorLevel implements Parcelable, AbstractC109984TRy {
    public static final Parcelable.Creator<AnchorLevel> CREATOR = new C65773BxH(AnchorLevel.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("level")
    public int LIZIZ;
    @SerializedName("experience")
    public long LIZJ;
    @SerializedName("lowest_experience_this_level")
    public long LIZLLL;
    @SerializedName("highest_experience_this_level")

    /* renamed from: LJ */
    public long f25755LJ;
    @SerializedName("task_start_experience")
    public long LJFF;
    @SerializedName("task_start_time")
    public long LJI;
    @SerializedName("task_decrease_experience")
    public long LJII;
    @SerializedName("task_target_experience")
    public long LJIIIIZZ;
    @SerializedName("task_end_time")
    public long LJIIIZ;
    @SerializedName("profile_dialog_bg")
    public ImageModel LJIIJ;
    @SerializedName("profile_dialog_bg_back")
    public ImageModel LJIIJJI;
    @SerializedName("stage_level")
    public ImageModel LJIIL;
    @SerializedName("small_icon")
    public ImageModel LJIILIIL;

    static {
        Covode.recordClassIndex(14135);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        parcel.writeInt(this.LIZIZ);
        parcel.writeLong(this.LIZJ);
        parcel.writeLong(this.LIZLLL);
        parcel.writeLong(this.f25755LJ);
        parcel.writeLong(this.LJFF);
        parcel.writeLong(this.LJI);
        parcel.writeLong(this.LJII);
        parcel.writeLong(this.LJIIIIZZ);
        parcel.writeLong(this.LJIIIZ);
        parcel.writeParcelable(this.LJIIJ, i);
        parcel.writeParcelable(this.LJIIJJI, i);
        parcel.writeParcelable(this.LJIIL, i);
        parcel.writeParcelable(this.LJIILIIL, i);
    }

    public AnchorLevel() {
    }

    @Override // p003X.AbstractC109984TRy
    public final int LIZ() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LIZJ() {
        return this.LIZLLL;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LIZLLL() {
        return this.f25755LJ;
    }

    @Override // p003X.AbstractC109984TRy
    /* renamed from: LJ */
    public final long mo15923LJ() {
        return this.LJFF;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LJFF() {
        return this.LJI;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LJI() {
        return this.LJII;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LJII() {
        return this.LJIIIIZZ;
    }

    @Override // p003X.AbstractC109984TRy
    public final long LJIIIIZZ() {
        return this.LJIIIZ;
    }

    @Override // p003X.AbstractC109984TRy
    public final ImageModel LJIIIZ() {
        return this.LJIIJ;
    }

    @Override // p003X.AbstractC109984TRy
    public final ImageModel LJIIJ() {
        return this.LJIIJJI;
    }

    @Override // p003X.AbstractC109984TRy
    public final ImageModel LJIIJJI() {
        return this.LJIIL;
    }

    @Override // p003X.AbstractC109984TRy
    public final ImageModel LJIIL() {
        return this.LJIILIIL;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ImageModel imageModel = this.LJIILIIL;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        long j3 = this.f25755LJ;
        long j4 = this.LJFF;
        long j5 = this.LJI;
        long j6 = this.LJII;
        long j7 = this.LJIIIIZZ;
        long j8 = this.LJIIIZ;
        int i6 = ((((((((((((((((((i * 31) + this.LIZIZ) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        ImageModel imageModel2 = this.LJIIJ;
        if (imageModel2 != null) {
            i2 = imageModel2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        ImageModel imageModel3 = this.LJIIJJI;
        if (imageModel3 != null) {
            i3 = imageModel3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        ImageModel imageModel4 = this.LJIIL;
        if (imageModel4 != null) {
            i4 = imageModel4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        ImageModel imageModel5 = this.LJIILIIL;
        if (imageModel5 != null) {
            i5 = imageModel5.hashCode();
        }
        return i9 + i5;
    }

    public AnchorLevel(Parcel parcel) {
        this.LIZIZ = parcel.readInt();
        this.LIZJ = parcel.readLong();
        this.LIZLLL = parcel.readLong();
        this.f25755LJ = parcel.readLong();
        this.LJFF = parcel.readLong();
        this.LJI = parcel.readLong();
        this.LJII = parcel.readLong();
        this.LJIIIIZZ = parcel.readLong();
        this.LJIIIZ = parcel.readLong();
        this.LJIIJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIIJJI = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIIL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIILIIL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnchorLevel anchorLevel = (AnchorLevel) obj;
            if (this.LIZIZ != anchorLevel.LIZIZ || this.LIZJ != anchorLevel.LIZJ || this.LIZLLL != anchorLevel.LIZLLL || this.f25755LJ != anchorLevel.f25755LJ || this.LJFF != anchorLevel.LJFF || this.LJI != anchorLevel.LJI || this.LJII != anchorLevel.LJII || this.LJIIIIZZ != anchorLevel.LJIIIIZZ || this.LJIIIZ != anchorLevel.LJIIIZ) {
                return false;
            }
            ImageModel imageModel = this.LJIIJ;
            if (imageModel != null) {
                if (!imageModel.equals(anchorLevel.LJIIJ)) {
                    return false;
                }
            } else if (anchorLevel.LJIIJ != null) {
                return false;
            }
            ImageModel imageModel2 = this.LJIIJJI;
            if (imageModel2 != null) {
                if (!imageModel2.equals(anchorLevel.LJIIJJI)) {
                    return false;
                }
            } else if (anchorLevel.LJIIJJI != null) {
                return false;
            }
            ImageModel imageModel3 = this.LJIIL;
            if (imageModel3 != null) {
                if (!imageModel3.equals(anchorLevel.LJIIL)) {
                    return false;
                }
            } else if (anchorLevel.LJIIL != null) {
                return false;
            }
            ImageModel imageModel4 = this.LJIILIIL;
            ImageModel imageModel5 = anchorLevel.LJIILIIL;
            if (imageModel4 != null) {
                return imageModel4.equals(imageModel5);
            }
            if (imageModel5 == null) {
                return true;
            }
        }
        return false;
    }
}
