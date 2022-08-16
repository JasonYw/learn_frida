package android.support.wearable.complications;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes18.dex */
public class TimeDifferenceText implements TimeDependentText {
    public static final Parcelable.Creator<TimeDifferenceText> CREATOR = new Parcelable.Creator<TimeDifferenceText>() { // from class: android.support.wearable.complications.TimeDifferenceText.1
        static {
            Covode.recordClassIndex(268);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TimeDifferenceText[] newArray(int i) {
            return new TimeDifferenceText[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeDifferenceText createFromParcel(Parcel parcel) {
            return new TimeDifferenceText(parcel);
        }
    };
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final TimeUnit f20196LJ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean LIZ(long j, long j2) {
        long millis;
        if (this.LIZJ == 1) {
            millis = TimeUnit.SECONDS.toMillis(1L);
        } else {
            millis = TimeUnit.MINUTES.toMillis(1L);
        }
        TimeUnit timeUnit = this.f20196LJ;
        if (timeUnit != null) {
            millis = Math.max(millis, timeUnit.toMillis(1L));
        }
        return LIZIZ(LIZ(j), millis) == LIZIZ(LIZ(j2), millis);
    }

    static {
        Covode.recordClassIndex(267);
    }

    /* renamed from: android.support.wearable.complications.TimeDifferenceText$2 */
    /* loaded from: classes18.dex */
    public static /* synthetic */ class C01472 {
        public static final /* synthetic */ int[] LIZ = new int[TimeUnit.values().length];

        static {
            Covode.recordClassIndex(269);
            try {
                LIZ[TimeUnit.MILLISECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LIZ[TimeUnit.SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LIZ[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LIZ[TimeUnit.HOURS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LIZ[TimeUnit.DAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int LIZIZ(long j) {
        return LIZIZ(j, TimeUnit.DAYS);
    }

    public static int LIZJ(long j) {
        return LIZIZ(j, TimeUnit.HOURS);
    }

    public static int LIZLLL(long j) {
        return LIZIZ(j, TimeUnit.MINUTES);
    }

    private long LIZ(long j) {
        long j2 = this.LIZ;
        if (j < j2) {
            return j2 - j;
        }
        long j3 = this.LIZIZ;
        if (j > j3) {
            return j - j3;
        }
        return 0L;
    }

    public TimeDifferenceText(Parcel parcel) {
        boolean z;
        TimeUnit timeUnit;
        this.LIZ = parcel.readLong();
        this.LIZIZ = parcel.readLong();
        this.LIZJ = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZLLL = z;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            timeUnit = null;
        } else {
            timeUnit = TimeUnit.values()[readInt];
        }
        this.f20196LJ = timeUnit;
    }

    public static int LIZ(TimeUnit timeUnit) {
        int i = C01472.LIZ[timeUnit.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 60;
            }
            if (i != 4) {
                if (i == 5) {
                    return Integer.MAX_VALUE;
                }
                String valueOf = String.valueOf(timeUnit);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("Unit not supported: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            return 24;
        }
        return 1000;
    }

    public static long LIZ(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(1L);
        return LIZIZ(j, millis) * millis;
    }

    public static int LIZIZ(long j, TimeUnit timeUnit) {
        return (int) ((j / timeUnit.toMillis(1L)) % LIZ(timeUnit));
    }

    public static long LIZIZ(long j, long j2) {
        int i;
        long j3 = j / j2;
        if (j % j2 == 0) {
            i = 0;
        } else {
            i = 1;
        }
        return j3 + i;
    }

    public static String LIZJ(int i, Resources resources) {
        return resources.getQuantityString(2131886109, i, Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeLong(this.LIZ);
        parcel.writeLong(this.LIZIZ);
        parcel.writeInt(this.LIZJ);
        parcel.writeByte(this.LIZLLL ? (byte) 1 : (byte) 0);
        TimeUnit timeUnit = this.f20196LJ;
        if (timeUnit == null) {
            ordinal = -1;
        } else {
            ordinal = timeUnit.ordinal();
        }
        parcel.writeInt(ordinal);
    }

    public static String LIZIZ(int i, Resources resources) {
        return resources.getQuantityString(2131886108, i, Integer.valueOf(i));
    }

    private String LIZJ(long j, Resources resources) {
        long LIZ = LIZ(j, TimeUnit.HOURS);
        if (!LIZ(this.f20196LJ, TimeUnit.DAYS) && LIZIZ(LIZ) <= 0) {
            long LIZ2 = LIZ(j, TimeUnit.MINUTES);
            if (!LIZ(this.f20196LJ, TimeUnit.HOURS) && LIZJ(LIZ2) <= 0) {
                int LIZLLL = LIZLLL(LIZ2);
                return resources.getQuantityString(2131886112, LIZLLL, Integer.valueOf(LIZLLL));
            }
            int LIZJ = LIZJ(LIZ);
            return resources.getQuantityString(2131886111, LIZJ, Integer.valueOf(LIZJ));
        }
        int LIZIZ = LIZIZ(LIZ(j, TimeUnit.DAYS));
        return resources.getQuantityString(2131886110, LIZIZ, Integer.valueOf(LIZIZ));
    }

    public static String LIZ(int i, Resources resources) {
        return resources.getQuantityString(2131886107, i, Integer.valueOf(i));
    }

    private String LIZIZ(long j, Resources resources) {
        long LIZ = LIZ(j, TimeUnit.HOURS);
        if (!LIZ(this.f20196LJ, TimeUnit.DAYS) && LIZIZ(LIZ) < 10) {
            long LIZ2 = LIZ(j, TimeUnit.MINUTES);
            if (LIZIZ(LIZ2) > 0) {
                int LIZJ = LIZJ(LIZ);
                if (LIZJ > 0) {
                    return LIZ(LIZIZ(LIZ), LIZJ, resources);
                }
                return LIZ(LIZIZ(LIZ), resources);
            } else if (LIZ(this.f20196LJ, TimeUnit.HOURS)) {
                return LIZIZ(LIZJ(LIZ), resources);
            } else {
                int LIZJ2 = LIZJ(LIZ2);
                int LIZLLL = LIZLLL(LIZ2);
                if (LIZJ2 > 0) {
                    if (LIZLLL > 0) {
                        return LIZIZ(LIZJ2, LIZLLL, resources);
                    }
                    return LIZIZ(LIZJ2, resources);
                }
                return LIZJ(LIZLLL(LIZ2), resources);
            }
        }
        return LIZ(LIZIZ(LIZ(j, TimeUnit.DAYS)), resources);
    }

    private String LIZ(long j, Resources resources) {
        long LIZ = LIZ(j, TimeUnit.HOURS);
        if (!LIZ(this.f20196LJ, TimeUnit.DAYS) && LIZIZ(LIZ) <= 0) {
            long LIZ2 = LIZ(j, TimeUnit.MINUTES);
            if (!LIZ(this.f20196LJ, TimeUnit.HOURS) && LIZJ(LIZ2) <= 0) {
                return LIZJ(LIZLLL(LIZ2), resources);
            }
            return LIZIZ(LIZJ(LIZ), resources);
        }
        return LIZ(LIZIZ(LIZ(j, TimeUnit.DAYS)), resources);
    }

    public static boolean LIZ(TimeUnit timeUnit, TimeUnit timeUnit2) {
        if (timeUnit == null || timeUnit.toMillis(1L) < timeUnit2.toMillis(1L)) {
            return false;
        }
        return true;
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence LIZ(Context context, long j) {
        Resources resources = context.getResources();
        long LIZ = LIZ(j);
        if (LIZ == 0 && this.LIZLLL) {
            return resources.getString(2131581321);
        }
        int i = this.LIZJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return LIZ(LIZ, resources);
                        }
                        String LIZJ = LIZJ(LIZ, resources);
                        if (LIZJ.length() <= 7) {
                            return LIZJ;
                        }
                        return LIZ(LIZ, resources);
                    }
                    return LIZJ(LIZ, resources);
                }
                String LIZIZ = LIZIZ(LIZ, resources);
                if (LIZIZ.length() <= 7) {
                    return LIZIZ;
                }
                return LIZ(LIZ, resources);
            }
            return LIZ(LIZ, resources);
        } else if (LIZ(this.f20196LJ, TimeUnit.DAYS)) {
            return LIZ(LIZIZ(LIZ(LIZ, TimeUnit.DAYS)), resources);
        } else {
            long LIZ2 = LIZ(LIZ, TimeUnit.MINUTES);
            if (!LIZ(this.f20196LJ, TimeUnit.HOURS) && LIZIZ(LIZ2) <= 0) {
                long LIZ3 = LIZ(LIZ, TimeUnit.SECONDS);
                if (!LIZ(this.f20196LJ, TimeUnit.MINUTES) && LIZJ(LIZ3) <= 0) {
                    return String.format(Locale.US, "%02d:%02d", Integer.valueOf(LIZLLL(LIZ3)), Integer.valueOf(LIZIZ(LIZ3, TimeUnit.SECONDS)));
                }
                return String.format(Locale.US, "%d:%02d", Integer.valueOf(LIZJ(LIZ2)), Integer.valueOf(LIZLLL(LIZ2)));
            }
            return LIZIZ(LIZ, resources);
        }
    }

    public static String LIZ(int i, int i2, Resources resources) {
        return resources.getString(2131581322, LIZ(i, resources), LIZIZ(i2, resources));
    }

    public static String LIZIZ(int i, int i2, Resources resources) {
        return resources.getString(2131581323, LIZIZ(i, resources), LIZJ(i2, resources));
    }

    public TimeDifferenceText(long j, long j2, int i, boolean z, TimeUnit timeUnit) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.f20196LJ = timeUnit;
    }
}
