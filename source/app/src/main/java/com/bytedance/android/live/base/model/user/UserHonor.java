package com.bytedance.android.live.base.model.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.AbstractC109983TRx;
import p003X.C65773BxH;

/* loaded from: classes11.dex */
public class UserHonor implements Parcelable, AbstractC109983TRx {
    public static final Parcelable.Creator<UserHonor> CREATOR = new C65773BxH(UserHonor.class);
    public static ChangeQuickRedirect LIZ;
    @SerializedName("diamond_icon")
    public ImageModel LIZIZ;
    @SerializedName("icon")
    public ImageModel LIZJ;
    @SerializedName("next_icon")
    public ImageModel LIZLLL;
    @SerializedName("next_name")

    /* renamed from: LJ */
    public String f25762LJ;
    @SerializedName("name")
    public String LJFF;
    @SerializedName("total_diamond_count")
    public long LJI;
    @SerializedName("now_diamond")
    public long LJII;
    @SerializedName("next_diamond")
    public long LJIIIIZZ;
    @SerializedName("im_icon")
    public ImageModel LJIIIZ;
    @SerializedName("im_icon_with_level")
    public ImageModel LJIIJ;
    @SerializedName("new_im_icon_with_level")
    public ImageModel LJIIJJI;
    @SerializedName("live_icon")
    public ImageModel LJIIL;
    @SerializedName("new_live_icon")
    public ImageModel LJIILIIL;
    @SerializedName("level")
    public int LJIILJJIL;
    @SerializedName("grade_icon_list")
    public List<GradeIcon> LJIILL;
    @SerializedName("grade_describe")
    public String LJIILLIIL;
    @SerializedName("this_grade_max_diamond")
    public long LJIIZILJ;
    @SerializedName("this_grade_min_diamond")
    public long LJIJ;
    @SerializedName("background")
    public ImageModel LJIJI;
    @SerializedName("background_back")
    public ImageModel LJIJJ;
    @SerializedName("upgrade_need_consume")
    public long LJIJJLI;
    @SerializedName("grade_banner")
    public String LJIL;
    @SerializedName("pay_diamond_bak")
    public long LJJ;
    @SerializedName("next_privileges")
    public String LJJI;
    @SerializedName("score")
    public long LJJIFFI;
    @SerializedName("screen_chat_type")
    public long LJJII;
    @SerializedName("buff_info")
    public GradeBuffInfo LJJIII;

    static {
        Covode.recordClassIndex(14191);
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
        parcel.writeParcelable(this.LIZIZ, i);
        parcel.writeParcelable(this.LIZJ, i);
        parcel.writeParcelable(this.LIZLLL, i);
        parcel.writeString(this.f25762LJ);
        parcel.writeString(this.LJFF);
        parcel.writeLong(this.LJI);
        parcel.writeLong(this.LJII);
        parcel.writeLong(this.LJIIIIZZ);
        parcel.writeParcelable(this.LJIIIZ, i);
        parcel.writeParcelable(this.LJIIJ, i);
        parcel.writeParcelable(this.LJIIJJI, i);
        parcel.writeParcelable(this.LJIIL, i);
        parcel.writeParcelable(this.LJIILIIL, i);
        parcel.writeInt(this.LJIILJJIL);
        parcel.writeTypedList(this.LJIILL);
        parcel.writeString(this.LJIILLIIL);
        parcel.writeLong(this.LJIIZILJ);
        parcel.writeLong(this.LJIJ);
        parcel.writeParcelable(this.LJIJI, i);
        parcel.writeParcelable(this.LJIJJ, i);
        parcel.writeLong(this.LJIJJLI);
        parcel.writeString(this.LJIL);
        parcel.writeLong(this.LJJ);
        parcel.writeString(this.LJJI);
        parcel.writeLong(this.LJJIFFI);
        parcel.writeLong(this.LJJII);
        parcel.writeParcelable(this.LJJIII, i);
    }

    public UserHonor() {
    }

    public final long LIZ() {
        return this.LJJIFFI;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LIZIZ() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LIZJ() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LIZLLL() {
        return this.LIZLLL;
    }

    @Override // p003X.AbstractC109983TRx
    /* renamed from: LJ */
    public final String mo15922LJ() {
        return this.f25762LJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final String LJFF() {
        return this.LJFF;
    }

    @Override // p003X.AbstractC109983TRx
    public final long LJI() {
        return this.LJI;
    }

    @Override // p003X.AbstractC109983TRx
    public final long LJII() {
        return this.LJII;
    }

    @Override // p003X.AbstractC109983TRx
    public final long LJIIIIZZ() {
        return this.LJIIIIZZ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIIIZ() {
        return this.LJIIIZ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIILIIL() {
        return this.LJIIJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final int LJIILJJIL() {
        return this.LJIILJJIL;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIILL() {
        return this.LJIIL;
    }

    @Override // p003X.AbstractC109983TRx
    public final List<GradeIcon> LJIILLIIL() {
        return this.LJIILL;
    }

    @Override // p003X.AbstractC109983TRx
    public final String LJIIZILJ() {
        return this.LJIILLIIL;
    }

    @Override // p003X.AbstractC109983TRx
    public final long LJIJ() {
        return this.LJIIZILJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final long LJIJI() {
        return this.LJIJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIJJ() {
        return this.LJIJI;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIJJLI() {
        return this.LJIJJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIIJ() {
        ImageModel imageModel = this.LJIIJJI;
        if (imageModel != null) {
            return imageModel;
        }
        return this.LJIIJ;
    }

    @Override // p003X.AbstractC109983TRx
    public final ImageModel LJIIL() {
        ImageModel imageModel = this.LJIILIIL;
        if (imageModel != null) {
            return imageModel;
        }
        return this.LJIIL;
    }

    public final ImageModel LJIIJJI() {
        GradeBuffInfo gradeBuffInfo = this.LJJIII;
        if (gradeBuffInfo != null && gradeBuffInfo.buffBadge != null) {
            return this.LJJIII.buffBadge;
        }
        ImageModel imageModel = this.LJIIJJI;
        if (imageModel != null) {
            return imageModel;
        }
        return this.LJIIJ;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ImageModel imageModel = this.LIZIZ;
        if (imageModel != null) {
            i = imageModel.hashCode();
        } else {
            i = 0;
        }
        int i15 = i * 31;
        ImageModel imageModel2 = this.LIZJ;
        if (imageModel2 != null) {
            i2 = imageModel2.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = (i15 + i2) * 31;
        ImageModel imageModel3 = this.LIZLLL;
        if (imageModel3 != null) {
            i3 = imageModel3.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        String str = this.f25762LJ;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str2 = this.LJFF;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        long j = this.LJI;
        long j2 = this.LJII;
        long j3 = this.LJIIIIZZ;
        int i19 = (((((((i18 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        ImageModel imageModel4 = this.LJIIIZ;
        if (imageModel4 != null) {
            i6 = imageModel4.hashCode();
        } else {
            i6 = 0;
        }
        int i20 = (i19 + i6) * 31;
        ImageModel imageModel5 = this.LJIIJ;
        if (imageModel5 != null) {
            i7 = imageModel5.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        ImageModel imageModel6 = this.LJIIJJI;
        if (imageModel6 != null) {
            i8 = imageModel6.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        ImageModel imageModel7 = this.LJIIL;
        if (imageModel7 != null) {
            i9 = imageModel7.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        ImageModel imageModel8 = this.LJIILIIL;
        if (imageModel8 != null) {
            i10 = imageModel8.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (((i23 + i10) * 31) + this.LJIILJJIL) * 31;
        List<GradeIcon> list = this.LJIILL;
        if (list != null) {
            i11 = list.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (i24 + i11) * 31;
        String str3 = this.LJIILLIIL;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        long j4 = this.LJIIZILJ;
        long j5 = this.LJIJ;
        int i26 = (((((i25 + i12) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        ImageModel imageModel9 = this.LJIJI;
        if (imageModel9 != null) {
            i13 = imageModel9.hashCode();
        } else {
            i13 = 0;
        }
        int i27 = (i26 + i13) * 31;
        ImageModel imageModel10 = this.LJIJJ;
        if (imageModel10 != null) {
            i14 = imageModel10.hashCode();
        }
        return i27 + i14;
    }

    public UserHonor(Parcel parcel) {
        this.LIZIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LIZJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LIZLLL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.f25762LJ = parcel.readString();
        this.LJFF = parcel.readString();
        this.LJI = parcel.readLong();
        this.LJII = parcel.readLong();
        this.LJIIIIZZ = parcel.readLong();
        this.LJIIIZ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIIJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIIJJI = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIIL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIILIIL = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIILJJIL = parcel.readInt();
        this.LJIILL = parcel.createTypedArrayList(GradeIcon.CREATOR);
        this.LJIILLIIL = parcel.readString();
        this.LJIIZILJ = parcel.readLong();
        this.LJIJ = parcel.readLong();
        this.LJIJI = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIJJ = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
        this.LJIJJLI = parcel.readLong();
        this.LJIL = parcel.readString();
        this.LJJ = parcel.readLong();
        this.LJJI = parcel.readString();
        this.LJJIFFI = parcel.readLong();
        this.LJJII = parcel.readLong();
        this.LJJIII = (GradeBuffInfo) parcel.readParcelable(GradeBuffInfo.class.getClassLoader());
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
            UserHonor userHonor = (UserHonor) obj;
            if (this.LJI != userHonor.LJI || this.LJII != userHonor.LJII || this.LJIIIIZZ != userHonor.LJIIIIZZ || this.LJIILJJIL != userHonor.LJIILJJIL) {
                return false;
            }
            ImageModel imageModel = this.LIZIZ;
            if (imageModel != null) {
                if (!imageModel.equals(userHonor.LIZIZ)) {
                    return false;
                }
            } else if (userHonor.LIZIZ != null) {
                return false;
            }
            ImageModel imageModel2 = this.LIZJ;
            if (imageModel2 != null) {
                if (!imageModel2.equals(userHonor.LIZJ)) {
                    return false;
                }
            } else if (userHonor.LIZJ != null) {
                return false;
            }
            ImageModel imageModel3 = this.LIZLLL;
            if (imageModel3 != null) {
                if (!imageModel3.equals(userHonor.LIZLLL)) {
                    return false;
                }
            } else if (userHonor.LIZLLL != null) {
                return false;
            }
            String str = this.f25762LJ;
            if (str != null) {
                if (!str.equals(userHonor.f25762LJ)) {
                    return false;
                }
            } else if (userHonor.f25762LJ != null) {
                return false;
            }
            String str2 = this.LJFF;
            if (str2 != null) {
                if (!str2.equals(userHonor.LJFF)) {
                    return false;
                }
            } else if (userHonor.LJFF != null) {
                return false;
            }
            ImageModel imageModel4 = this.LJIIIZ;
            if (imageModel4 != null) {
                if (!imageModel4.equals(userHonor.LJIIIZ)) {
                    return false;
                }
            } else if (userHonor.LJIIIZ != null) {
                return false;
            }
            ImageModel imageModel5 = this.LJIIJ;
            if (imageModel5 != null) {
                if (!imageModel5.equals(userHonor.LJIIJ)) {
                    return false;
                }
            } else if (userHonor.LJIIJ != null) {
                return false;
            }
            ImageModel imageModel6 = this.LJIIJJI;
            if (imageModel6 != null) {
                if (!imageModel6.equals(userHonor.LJIIJJI)) {
                    return false;
                }
            } else if (userHonor.LJIIJJI != null) {
                return false;
            }
            ImageModel imageModel7 = this.LJIIL;
            if (imageModel7 != null) {
                if (!imageModel7.equals(userHonor.LJIIL)) {
                    return false;
                }
            } else if (userHonor.LJIIL != null) {
                return false;
            }
            ImageModel imageModel8 = this.LJIILIIL;
            if (imageModel8 != null) {
                if (!imageModel8.equals(userHonor.LJIILIIL)) {
                    return false;
                }
            } else if (userHonor.LJIILIIL != null) {
                return false;
            }
            List<GradeIcon> list = this.LJIILL;
            if (list != null) {
                if (!list.equals(userHonor.LJIILL)) {
                    return false;
                }
            } else if (userHonor.LJIILL != null) {
                return false;
            }
            if (this.LJIJ != userHonor.LJIJ || this.LJIIZILJ != userHonor.LJIIZILJ) {
                return false;
            }
            ImageModel imageModel9 = this.LJIJI;
            if (imageModel9 != null) {
                if (!imageModel9.equals(userHonor.LJIJI)) {
                    return false;
                }
            } else if (userHonor.LJIJI != null) {
                return false;
            }
            ImageModel imageModel10 = this.LJIJJ;
            if (imageModel10 != null) {
                if (!imageModel10.equals(userHonor.LJIJJ)) {
                    return false;
                }
            } else if (userHonor.LJIJJ != null) {
                return false;
            }
            String str3 = this.LJIILLIIL;
            String str4 = userHonor.LJIILLIIL;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }
}
