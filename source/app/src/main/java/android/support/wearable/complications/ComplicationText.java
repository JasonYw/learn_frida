package android.support.wearable.complications;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes18.dex */
public class ComplicationText implements Parcelable, TimeDependentText {
    public static final Parcelable.Creator<ComplicationText> CREATOR = new Parcelable.Creator<ComplicationText>() { // from class: android.support.wearable.complications.ComplicationText.1
        static {
            Covode.recordClassIndex(263);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComplicationText[] newArray(int i) {
            return new ComplicationText[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComplicationText createFromParcel(Parcel parcel) {
            return new ComplicationText(parcel, (byte) 0);
        }
    };
    public final CharSequence LIZ;
    public final TimeDependentText LIZIZ;
    public final CharSequence[] LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public CharSequence f20195LJ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(262);
    }

    private void LIZ() {
        if (this.LIZ == null && this.LIZIZ == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    public static ComplicationText LIZ(CharSequence charSequence) {
        return new ComplicationText(charSequence, (TimeDependentText) null);
    }

    public static TimeUnit LIZ(String str) {
        TimeUnit timeUnit = null;
        if (str == null) {
            return null;
        }
        try {
            timeUnit = TimeUnit.valueOf(str);
            return timeUnit;
        } catch (IllegalArgumentException unused) {
            return timeUnit;
        }
    }

    public ComplicationText(Parcel parcel) {
        this.LIZJ = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.LIZ = readBundle.getCharSequence("surrounding_string");
        if (readBundle.containsKey("difference_style") && readBundle.containsKey("difference_period_start") && readBundle.containsKey("difference_period_end")) {
            this.LIZIZ = new TimeDifferenceText(readBundle.getLong("difference_period_start"), readBundle.getLong("difference_period_end"), readBundle.getInt("difference_style"), readBundle.getBoolean("show_now_text", true), LIZ(readBundle.getString("minimum_unit")));
        } else {
            TimeZone timeZone = null;
            if (readBundle.containsKey("format_format_string") && readBundle.containsKey("format_style")) {
                this.LIZIZ = new TimeFormatText(readBundle.getString("format_format_string"), readBundle.getInt("format_style"), readBundle.containsKey("format_time_zone") ? TimeZone.getTimeZone(readBundle.getString("format_time_zone")) : timeZone);
            } else {
                this.LIZIZ = null;
            }
        }
        LIZ();
    }

    public /* synthetic */ ComplicationText(Parcel parcel, byte b) {
        this(parcel);
    }

    public ComplicationText(CharSequence charSequence, TimeDependentText timeDependentText) {
        this.LIZJ = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        this.LIZ = charSequence;
        this.LIZIZ = null;
        LIZ();
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence LIZ(Context context, long j) {
        CharSequence LIZ;
        TimeDependentText timeDependentText = this.LIZIZ;
        if (timeDependentText == null) {
            return this.LIZ;
        }
        if (this.f20195LJ != null && timeDependentText.LIZ(this.LIZLLL, j)) {
            LIZ = this.f20195LJ;
        } else {
            LIZ = this.LIZIZ.LIZ(context, j);
            this.LIZLLL = j;
            this.f20195LJ = LIZ;
        }
        CharSequence charSequence = this.LIZ;
        if (charSequence == null) {
            return LIZ;
        }
        CharSequence[] charSequenceArr = this.LIZJ;
        charSequenceArr[0] = LIZ;
        return TextUtils.expandTemplate(charSequence, charSequenceArr);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean LIZ(long j, long j2) {
        TimeDependentText timeDependentText = this.LIZIZ;
        if (timeDependentText == null) {
            return true;
        }
        return timeDependentText.LIZ(j, j2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("surrounding_string", this.LIZ);
        TimeDependentText timeDependentText = this.LIZIZ;
        if (timeDependentText instanceof TimeDifferenceText) {
            TimeDifferenceText timeDifferenceText = (TimeDifferenceText) timeDependentText;
            bundle.putLong("difference_period_start", timeDifferenceText.LIZ);
            bundle.putLong("difference_period_end", timeDifferenceText.LIZIZ);
            bundle.putInt("difference_style", timeDifferenceText.LIZJ);
            bundle.putBoolean("show_now_text", timeDifferenceText.LIZLLL);
            if (timeDifferenceText.f20196LJ != null) {
                bundle.putString("minimum_unit", timeDifferenceText.f20196LJ.name());
            }
        } else if (timeDependentText instanceof TimeFormatText) {
            TimeFormatText timeFormatText = (TimeFormatText) timeDependentText;
            bundle.putString("format_format_string", timeFormatText.LIZ.toPattern());
            bundle.putInt("format_style", timeFormatText.LIZIZ);
            TimeZone timeZone = timeFormatText.LIZJ;
            if (timeZone != null) {
                bundle.putString("format_time_zone", timeZone.getID());
            }
        }
        parcel.writeBundle(bundle);
    }
}
