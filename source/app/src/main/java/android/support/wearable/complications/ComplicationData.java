package android.support.wearable.complications;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p003X.C144560eYU;

/* loaded from: classes19.dex */
public class ComplicationData implements Parcelable {
    public final int LIZIZ;
    public final Bundle LIZJ;
    public static final String[][] LIZ = {null, new String[0], new String[0], new String[]{"SHORT_TEXT"}, new String[]{"LONG_TEXT"}, new String[]{"VALUE", "MIN_VALUE", "MAX_VALUE"}, new String[]{"ICON"}, new String[]{"SMALL_IMAGE", "IMAGE_STYLE"}, new String[]{"LARGE_IMAGE"}, new String[0], new String[0]};
    public static final String[][] LIZLLL = {null, new String[0], new String[0], new String[]{"SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", "SMALL_IMAGE_BURN_IN_PROTECTION", "IMAGE_STYLE", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "SMALL_IMAGE_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", "SHORT_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[0]};
    public static final Parcelable.Creator<ComplicationData> CREATOR = new Parcelable.Creator<ComplicationData>() { // from class: android.support.wearable.complications.ComplicationData.1
        static {
            Covode.recordClassIndex(257);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComplicationData[] newArray(int i) {
            return new ComplicationData[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComplicationData createFromParcel(Parcel parcel) {
            return new ComplicationData(parcel, (byte) 0);
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final ComplicationText LIZIZ() {
        LIZ("SHORT_TEXT", this.LIZIZ);
        return (ComplicationText) LIZ("SHORT_TEXT");
    }

    public final ComplicationText LIZJ() {
        LIZ("LONG_TITLE", this.LIZIZ);
        return (ComplicationText) LIZ("LONG_TITLE");
    }

    public final ComplicationText LIZLLL() {
        LIZ("LONG_TEXT", this.LIZIZ);
        return (ComplicationText) LIZ("LONG_TEXT");
    }

    /* renamed from: LJ */
    public final Icon m21220LJ() {
        LIZ("ICON", this.LIZIZ);
        return (Icon) LIZ("ICON");
    }

    public final Icon LJFF() {
        LIZ("ICON_BURN_IN_PROTECTION", this.LIZIZ);
        return (Icon) LIZ("ICON_BURN_IN_PROTECTION");
    }

    public final Icon LJI() {
        LIZ("SMALL_IMAGE", this.LIZIZ);
        return (Icon) LIZ("SMALL_IMAGE");
    }

    public final Icon LJII() {
        LIZ("SMALL_IMAGE_BURN_IN_PROTECTION", this.LIZIZ);
        return (Icon) LIZ("SMALL_IMAGE_BURN_IN_PROTECTION");
    }

    public final int LJIIIIZZ() {
        LIZ("IMAGE_STYLE", this.LIZIZ);
        return this.LIZJ.getInt("IMAGE_STYLE");
    }

    public final Icon LJIIIZ() {
        LIZ("LARGE_IMAGE", this.LIZIZ);
        return (Icon) LIZ("LARGE_IMAGE");
    }

    public final PendingIntent LJIIJ() {
        LIZ("TAP_ACTION", this.LIZIZ);
        return (PendingIntent) LIZ("TAP_ACTION");
    }

    public String toString() {
        int i = this.LIZIZ;
        String valueOf = String.valueOf(this.LIZJ);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("ComplicationData{mType=");
        sb.append(i);
        sb.append(", mFields=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }

    public final ComplicationText LIZ() {
        LIZ("SHORT_TITLE", this.LIZIZ);
        return (ComplicationText) LIZ("SHORT_TITLE");
    }

    static {
        Covode.recordClassIndex(256);
    }

    public ComplicationData(C144560eYU c144560eYU) {
        this.LIZIZ = c144560eYU.LIZ;
        this.LIZJ = c144560eYU.LIZIZ;
    }

    private <T extends Parcelable> T LIZ(String str) {
        try {
            return (T) this.LIZJ.getParcelable(str);
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public ComplicationData(Parcel parcel) {
        this.LIZIZ = parcel.readInt();
        this.LIZJ = parcel.readBundle(getClass().getClassLoader());
    }

    public static boolean LIZ(int i) {
        if (i > 0 && i <= LIZ.length) {
            return true;
        }
        return false;
    }

    public /* synthetic */ ComplicationData(C144560eYU c144560eYU, byte b) {
        this(c144560eYU);
    }

    public /* synthetic */ ComplicationData(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.LIZIZ);
        parcel.writeBundle(this.LIZJ);
    }

    public static void LIZ(String str, int i) {
        if (!LIZ(i)) {
            return;
        }
        LIZJ(str, i);
    }

    public static boolean LIZJ(String str, int i) {
        for (String str2 : LIZ[i]) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : LIZLLL[i]) {
            if (str3.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(String str, int i) {
        if (LIZ(i)) {
            if (LIZJ(str, i)) {
                return;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
            sb.append("Field ");
            sb.append(str);
            sb.append(" is not supported for type ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(38);
        sb2.append("Type ");
        sb2.append(i);
        sb2.append(" can not be recognized");
        throw new IllegalStateException(sb2.toString());
    }
}
