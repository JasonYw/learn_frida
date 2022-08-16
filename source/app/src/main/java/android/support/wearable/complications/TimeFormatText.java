package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class TimeFormatText implements TimeDependentText {
    public final SimpleDateFormat LIZ;
    public final int LIZIZ;
    public final TimeZone LIZJ;
    public final Date LJFF;
    public long LJI;
    public static final String[][] LIZLLL = {new String[]{"S", NotifyType.SOUND}, new String[]{"m"}, new String[]{"H", "K", "h", "k", "j", "J", "C"}, new String[]{"a", "b", "B"}};

    /* renamed from: LJ */
    public static final long[] f20197LJ = {TimeUnit.SECONDS.toMillis(1), TimeUnit.MINUTES.toMillis(1), TimeUnit.HOURS.toMillis(1), TimeUnit.HOURS.toMillis(12)};
    public static final Parcelable.Creator<TimeFormatText> CREATOR = new Parcelable.Creator<TimeFormatText>() { // from class: android.support.wearable.complications.TimeFormatText.1
        static {
            Covode.recordClassIndex(271);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeFormatText[] newArray(int i) {
            return new TimeFormatText[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeFormatText createFromParcel(Parcel parcel) {
            return new TimeFormatText(parcel);
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(270);
    }

    public TimeFormatText(Parcel parcel) {
        this.LIZ = (SimpleDateFormat) parcel.readSerializable();
        this.LIZIZ = parcel.readInt();
        this.LIZJ = (TimeZone) parcel.readSerializable();
        this.LJI = -1L;
        this.LJFF = new Date();
    }

    private long LIZ(long j) {
        this.LJFF.setTime(j);
        if (this.LIZJ.inDaylightTime(this.LJFF)) {
            return this.LIZJ.getRawOffset() + this.LIZJ.getDSTSavings();
        }
        return this.LIZJ.getRawOffset();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.LIZ);
        parcel.writeInt(this.LIZIZ);
        parcel.writeSerializable(this.LIZJ);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence LIZ(Context context, long j) {
        String format = this.LIZ.format(new Date(j));
        int i = this.LIZIZ;
        if (i != 2) {
            if (i != 3) {
                return format;
            }
            return format.toLowerCase();
        }
        return format.toUpperCase();
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean LIZ(long j, long j2) {
        if (this.LJI == -1) {
            String pattern = this.LIZ.toPattern();
            String str = "";
            int i = 0;
            boolean z = false;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == '\'') {
                    int i2 = i + 1;
                    if (i2 < pattern.length() && pattern.charAt(i2) == '\'') {
                        i += 2;
                    } else {
                        z = !z;
                        i = i2;
                    }
                } else {
                    if (!z) {
                        String valueOf = String.valueOf(str);
                        char charAt = pattern.charAt(i);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
                        sb.append(valueOf);
                        sb.append(charAt);
                        str = sb.toString();
                    }
                    i++;
                }
            }
            for (int i3 = 0; i3 < LIZLLL.length && this.LJI == -1; i3++) {
                int i4 = 0;
                while (true) {
                    String[][] strArr = LIZLLL;
                    if (i4 >= strArr[i3].length) {
                        break;
                    } else if (str.contains(strArr[i3][i4])) {
                        this.LJI = f20197LJ[i3];
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            if (this.LJI == -1) {
                this.LJI = TimeUnit.DAYS.toMillis(1L);
            }
        }
        long j3 = this.LJI;
        if ((j + LIZ(j)) / j3 != (j2 + LIZ(j2)) / j3) {
            return false;
        }
        return true;
    }

    public TimeFormatText(String str, int i, TimeZone timeZone) {
        this.LIZ = new SimpleDateFormat(str);
        this.LIZIZ = i;
        this.LJI = -1L;
        if (timeZone != null) {
            this.LIZ.setTimeZone(timeZone);
            this.LIZJ = timeZone;
        } else {
            this.LIZJ = this.LIZ.getTimeZone();
        }
        this.LJFF = new Date();
    }
}
