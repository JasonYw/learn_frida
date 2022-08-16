package android.support.p007v4.media;

import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes16.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.1
        static {
            Covode.recordClassIndex(163);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    };
    public final int LIZ;
    public final float LIZIZ;
    public Object LIZJ;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.LIZ;
    }

    static {
        Covode.recordClassIndex(162);
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.LIZ);
        sb.append(" rating=");
        float f = this.LIZIZ;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    public final boolean LIZ() {
        if (this.LIZIZ >= 0.0f) {
            return true;
        }
        return false;
    }

    public static RatingCompat LIZ(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(1, f);
    }

    public static RatingCompat LIZIZ(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return new RatingCompat(2, f);
    }

    public static RatingCompat LIZ(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        return null;
    }

    public static RatingCompat LIZ(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static RatingCompat LIZ(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            int i = Build.VERSION.SDK_INT;
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                ratingCompat = LIZ(ratingStyle);
            } else {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = LIZ(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = LIZIZ(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = LIZ(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = LIZ(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat.LIZJ = obj;
        }
        return ratingCompat;
    }

    public RatingCompat(int i, float f) {
        this.LIZ = i;
        this.LIZIZ = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LIZ);
        parcel.writeFloat(this.LIZIZ);
    }

    public static RatingCompat LIZ(int i, float f) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return null;
                }
                f2 = 5.0f;
            } else {
                f2 = 4.0f;
            }
        } else {
            f2 = 3.0f;
        }
        if (f < 0.0f || f > f2) {
            return null;
        }
        return new RatingCompat(i, f);
    }
}
