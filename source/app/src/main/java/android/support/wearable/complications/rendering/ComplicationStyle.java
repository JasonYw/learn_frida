package android.support.wearable.complications.rendering;

import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class ComplicationStyle {
    public static final Typeface LIZ = Typeface.create("sans-serif-condensed", 0);
    public final int LIZIZ;
    public final Drawable LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final int f20198LJ;
    public final Typeface LJFF;
    public final Typeface LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final ColorFilter LJIIIZ;
    public final int LJIIJ;
    public final int LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final int LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public final int LJIJI;
    public final int LJIJJ;

    /* loaded from: classes19.dex */
    public static class Builder implements Parcelable {
        public static final Parcelable.Creator<Builder> CREATOR = new Parcelable.Creator<Builder>() { // from class: android.support.wearable.complications.rendering.ComplicationStyle.Builder.1
            static {
                Covode.recordClassIndex(280);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Builder[] newArray(int i) {
                return new Builder[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Builder createFromParcel(Parcel parcel) {
                return new Builder(parcel, (byte) 0);
            }
        };
        public int LIZ;
        public Drawable LIZIZ;
        public int LIZJ;
        public int LIZLLL;

        /* renamed from: LJ */
        public Typeface f20199LJ;
        public Typeface LJFF;
        public int LJI;
        public int LJII;
        public ColorFilter LJIIIIZZ;
        public int LJIIIZ;
        public int LJIIJ;
        public int LJIIJJI;
        public int LJIIL;
        public int LJIILIIL;
        public int LJIILJJIL;
        public int LJIILL;
        public int LJIILLIIL;
        public int LJIIZILJ;
        public int LJIJ;
        public int LJIJI;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(279);
        }

        public Builder() {
            this.LIZ = ViewCompat.MEASURED_STATE_MASK;
            this.LIZJ = -1;
            this.LIZLLL = -3355444;
            this.f20199LJ = ComplicationStyle.LIZ;
            this.LJFF = ComplicationStyle.LIZ;
            this.LJI = Integer.MAX_VALUE;
            this.LJII = Integer.MAX_VALUE;
            this.LJIIIZ = -1;
            this.LJIIJ = -1;
            this.LJIIJJI = 1;
            this.LJIIL = 3;
            this.LJIILIIL = 3;
            this.LJIILJJIL = Integer.MAX_VALUE;
            this.LJIILL = 1;
            this.LJIILLIIL = 2;
            this.LJIIZILJ = -1;
            this.LJIJ = -3355444;
            this.LJIJI = -3355444;
        }

        public final ComplicationStyle LIZ() {
            return new ComplicationStyle(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.f20199LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIILJJIL, this.LJIILL, this.LJIIL, this.LJIILIIL, this.LJIILLIIL, this.LJIIZILJ, this.LJIJ, this.LJIJI, (byte) 0);
        }

        public final Builder LIZ(int i) {
            this.LIZ = i;
            return this;
        }

        public final Builder LIZIZ(int i) {
            this.LIZJ = i;
            return this;
        }

        public final Builder LIZJ(int i) {
            this.LIZLLL = i;
            return this;
        }

        public final Builder LIZLLL(int i) {
            this.LJIIIZ = i;
            return this;
        }

        /* renamed from: LJ */
        public final Builder m21219LJ(int i) {
            this.LJI = i;
            return this;
        }

        public final Builder LJFF(int i) {
            this.LJII = i;
            return this;
        }

        public final Builder LJI(int i) {
            this.LJIIJ = i;
            return this;
        }

        public final Builder LJIIIIZZ(int i) {
            this.LJIIL = i;
            return this;
        }

        public final Builder LJIIIZ(int i) {
            this.LJIILIIL = i;
            return this;
        }

        public final Builder LJIIJ(int i) {
            this.LJIILJJIL = i;
            return this;
        }

        public final Builder LJIIJJI(int i) {
            this.LJIILL = i;
            return this;
        }

        public final Builder LJIIL(int i) {
            this.LJIILLIIL = i;
            return this;
        }

        public final Builder LJIILIIL(int i) {
            this.LJIIZILJ = i;
            return this;
        }

        public final Builder LJIILJJIL(int i) {
            this.LJIJ = i;
            return this;
        }

        public final Builder LJIILL(int i) {
            this.LJIJI = i;
            return this;
        }

        public final Builder LIZ(ColorFilter colorFilter) {
            this.LJIIIIZZ = colorFilter;
            return this;
        }

        public final Builder LIZIZ(Typeface typeface) {
            this.LJFF = typeface;
            return this;
        }

        public final Builder LIZ(Typeface typeface) {
            this.f20199LJ = typeface;
            return this;
        }

        public final Builder LJII(int i) {
            if (i == 1) {
                this.LJIIJJI = 1;
                return this;
            } else if (i == 2) {
                this.LJIIJJI = 2;
                return this;
            } else {
                this.LJIIJJI = 0;
                return this;
            }
        }

        public final Builder LIZ(Drawable drawable) {
            this.LIZIZ = drawable;
            return this;
        }

        public Builder(Parcel parcel) {
            this.LIZ = ViewCompat.MEASURED_STATE_MASK;
            this.LIZJ = -1;
            this.LIZLLL = -3355444;
            this.f20199LJ = ComplicationStyle.LIZ;
            this.LJFF = ComplicationStyle.LIZ;
            this.LJI = Integer.MAX_VALUE;
            this.LJII = Integer.MAX_VALUE;
            this.LJIIIZ = -1;
            this.LJIIJ = -1;
            this.LJIIJJI = 1;
            this.LJIIL = 3;
            this.LJIILIIL = 3;
            this.LJIILJJIL = Integer.MAX_VALUE;
            this.LJIILL = 1;
            this.LJIILLIIL = 2;
            this.LJIIZILJ = -1;
            this.LJIJ = -3355444;
            this.LJIJI = -3355444;
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            this.LIZ = readBundle.getInt("background_color");
            this.LIZJ = readBundle.getInt("text_color");
            this.LIZLLL = readBundle.getInt("title_color");
            this.f20199LJ = Typeface.defaultFromStyle(readBundle.getInt("text_style", 0));
            this.LJFF = Typeface.defaultFromStyle(readBundle.getInt("title_style", 0));
            this.LJI = readBundle.getInt("text_size");
            this.LJII = readBundle.getInt("title_size");
            this.LJIIIZ = readBundle.getInt("icon_color");
            this.LJIIJ = readBundle.getInt("border_color");
            this.LJIIJJI = readBundle.getInt("border_style");
            this.LJIIL = readBundle.getInt("border_dash_width");
            this.LJIILIIL = readBundle.getInt("border_dash_gap");
            this.LJIILJJIL = readBundle.getInt("border_radius");
            this.LJIILL = readBundle.getInt("border_width");
            this.LJIILLIIL = readBundle.getInt("ranged_value_ring_width");
            this.LJIIZILJ = readBundle.getInt("ranged_value_primary_color");
            this.LJIJ = readBundle.getInt("ranged_value_secondary_color");
            this.LJIJI = readBundle.getInt("highlight_color");
        }

        public Builder(Builder builder) {
            this.LIZ = ViewCompat.MEASURED_STATE_MASK;
            this.LIZJ = -1;
            this.LIZLLL = -3355444;
            this.f20199LJ = ComplicationStyle.LIZ;
            this.LJFF = ComplicationStyle.LIZ;
            this.LJI = Integer.MAX_VALUE;
            this.LJII = Integer.MAX_VALUE;
            this.LJIIIZ = -1;
            this.LJIIJ = -1;
            this.LJIIJJI = 1;
            this.LJIIL = 3;
            this.LJIILIIL = 3;
            this.LJIILJJIL = Integer.MAX_VALUE;
            this.LJIILL = 1;
            this.LJIILLIIL = 2;
            this.LJIIZILJ = -1;
            this.LJIJ = -3355444;
            this.LJIJI = -3355444;
            this.LIZ = builder.LIZ;
            this.LIZIZ = builder.LIZIZ;
            this.LIZJ = builder.LIZJ;
            this.LIZLLL = builder.LIZLLL;
            this.f20199LJ = builder.f20199LJ;
            this.LJFF = builder.LJFF;
            this.LJI = builder.LJI;
            this.LJII = builder.LJII;
            this.LJIIIIZZ = builder.LJIIIIZZ;
            this.LJIIIZ = builder.LJIIIZ;
            this.LJIIJ = builder.LJIIJ;
            this.LJIIJJI = builder.LJIIJJI;
            this.LJIIL = builder.LJIIL;
            this.LJIILIIL = builder.LJIILIIL;
            this.LJIILJJIL = builder.LJIILJJIL;
            this.LJIILL = builder.LJIILL;
            this.LJIILLIIL = builder.LJIILLIIL;
            this.LJIIZILJ = builder.LJIIZILJ;
            this.LJIJ = builder.LJIJ;
            this.LJIJI = builder.LJIJI;
        }

        public Builder(ComplicationStyle complicationStyle) {
            this.LIZ = ViewCompat.MEASURED_STATE_MASK;
            this.LIZJ = -1;
            this.LIZLLL = -3355444;
            this.f20199LJ = ComplicationStyle.LIZ;
            this.LJFF = ComplicationStyle.LIZ;
            this.LJI = Integer.MAX_VALUE;
            this.LJII = Integer.MAX_VALUE;
            this.LJIIIZ = -1;
            this.LJIIJ = -1;
            this.LJIIJJI = 1;
            this.LJIIL = 3;
            this.LJIILIIL = 3;
            this.LJIILJJIL = Integer.MAX_VALUE;
            this.LJIILL = 1;
            this.LJIILLIIL = 2;
            this.LJIIZILJ = -1;
            this.LJIJ = -3355444;
            this.LJIJI = -3355444;
            this.LIZ = complicationStyle.LIZIZ;
            this.LIZIZ = complicationStyle.LIZJ;
            this.LIZJ = complicationStyle.LIZLLL;
            this.LIZLLL = complicationStyle.f20198LJ;
            this.f20199LJ = complicationStyle.LJFF;
            this.LJFF = complicationStyle.LJI;
            this.LJI = complicationStyle.LJII;
            this.LJII = complicationStyle.LJIIIIZZ;
            this.LJIIIIZZ = complicationStyle.LJIIIZ;
            this.LJIIIZ = complicationStyle.LJIIJ;
            this.LJIIJ = complicationStyle.LJIIJJI;
            this.LJIIJJI = complicationStyle.LJIIL;
            this.LJIIL = complicationStyle.LJIILIIL;
            this.LJIILIIL = complicationStyle.LJIILJJIL;
            this.LJIILJJIL = complicationStyle.LJIILL;
            this.LJIILL = complicationStyle.LJIILLIIL;
            this.LJIILLIIL = complicationStyle.LJIIZILJ;
            this.LJIIZILJ = complicationStyle.LJIJ;
            this.LJIJ = complicationStyle.LJIJI;
            this.LJIJI = complicationStyle.LJIJJ;
        }

        public /* synthetic */ Builder(Parcel parcel, byte b) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Bundle bundle = new Bundle();
            bundle.putInt("background_color", this.LIZ);
            bundle.putInt("text_color", this.LIZJ);
            bundle.putInt("title_color", this.LIZLLL);
            bundle.putInt("text_style", this.f20199LJ.getStyle());
            bundle.putInt("title_style", this.LJFF.getStyle());
            bundle.putInt("text_size", this.LJI);
            bundle.putInt("title_size", this.LJII);
            bundle.putInt("icon_color", this.LJIIIZ);
            bundle.putInt("border_color", this.LJIIJ);
            bundle.putInt("border_style", this.LJIIJJI);
            bundle.putInt("border_dash_width", this.LJIIL);
            bundle.putInt("border_dash_gap", this.LJIILIIL);
            bundle.putInt("border_radius", this.LJIILJJIL);
            bundle.putInt("border_width", this.LJIILL);
            bundle.putInt("ranged_value_ring_width", this.LJIILLIIL);
            bundle.putInt("ranged_value_primary_color", this.LJIIZILJ);
            bundle.putInt("ranged_value_secondary_color", this.LJIJ);
            bundle.putInt("highlight_color", this.LJIJI);
            parcel.writeBundle(bundle);
        }
    }

    static {
        Covode.recordClassIndex(278);
    }

    public ComplicationStyle(int i, Drawable drawable, int i2, int i3, Typeface typeface, Typeface typeface2, int i4, int i5, ColorFilter colorFilter, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.LIZIZ = i;
        this.LIZJ = drawable;
        this.LIZLLL = i2;
        this.f20198LJ = i3;
        this.LJFF = typeface;
        this.LJI = typeface2;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = colorFilter;
        this.LJIIJ = i6;
        this.LJIIJJI = i7;
        this.LJIIL = i8;
        this.LJIILIIL = i11;
        this.LJIILJJIL = i12;
        this.LJIILL = i9;
        this.LJIILLIIL = i10;
        this.LJIIZILJ = i13;
        this.LJIJ = i14;
        this.LJIJI = i15;
        this.LJIJJ = i16;
    }

    public /* synthetic */ ComplicationStyle(int i, Drawable drawable, int i2, int i3, Typeface typeface, Typeface typeface2, int i4, int i5, ColorFilter colorFilter, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, byte b) {
        this(i, drawable, i2, i3, typeface, typeface2, i4, i5, colorFilter, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16);
    }
}
