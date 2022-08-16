package android.support.wearable.watchface;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* loaded from: classes2.dex */
public class WatchFaceStyle implements Parcelable {
    public static final Parcelable.Creator<WatchFaceStyle> CREATOR = new Parcelable.Creator<WatchFaceStyle>() { // from class: android.support.wearable.watchface.WatchFaceStyle.1
        static {
            Covode.recordClassIndex(358);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ WatchFaceStyle[] newArray(int i) {
            return new WatchFaceStyle[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ WatchFaceStyle createFromParcel(Parcel parcel) {
            return new WatchFaceStyle(parcel.readBundle());
        }
    };
    public final ComponentName LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final int f20214LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(357);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((this.LIZ.hashCode() + 31) * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LJII) * 31) + (this.LJIIIIZZ ? 1 : 0)) * 31) + this.LJIIIZ) * 31) + this.LIZLLL) * 31) + this.f20214LJ) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJIIJ) * 31) + (this.LJIIJJI ? 1 : 0)) * 31) + (this.LJIIL ? 1 : 0)) * 31) + (this.LJIILIIL ? 1 : 0)) * 31) + (this.LJIILJJIL ? 1 : 0)) * 31) + (this.LJIILL ? 1 : 0);
    }

    public String toString() {
        String shortClassName;
        Locale locale = Locale.US;
        Object[] objArr = new Object[16];
        ComponentName componentName = this.LIZ;
        if (componentName == null) {
            shortClassName = "default";
        } else {
            shortClassName = componentName.getShortClassName();
        }
        objArr[0] = shortClassName;
        objArr[1] = Integer.valueOf(this.LIZIZ);
        objArr[2] = Integer.valueOf(this.LIZJ);
        objArr[3] = Integer.valueOf(this.LJII);
        objArr[4] = Boolean.valueOf(this.LJIIIIZZ);
        objArr[5] = Integer.valueOf(this.LJIIIZ);
        objArr[6] = Integer.valueOf(this.LIZLLL);
        objArr[7] = Integer.valueOf(this.f20214LJ);
        objArr[8] = Integer.valueOf(this.LJIIJ);
        objArr[9] = Integer.valueOf(this.LJFF);
        objArr[10] = Integer.valueOf(this.LJI);
        objArr[11] = Boolean.valueOf(this.LJIIJJI);
        objArr[12] = Boolean.valueOf(this.LJIIL);
        objArr[13] = Boolean.valueOf(this.LJIILIIL);
        objArr[14] = Boolean.valueOf(this.LJIILJJIL);
        objArr[15] = Boolean.valueOf(this.LJIILL);
        return String.format(locale, "watch face %s (card %d/%d bg %d time %s ambientPeek %d peekOpacityMode %d viewProtectionMode %d accentColor %dstatusBarGravity %d hotwordIndicatorGravity %d showUnreadCountIndicator %s hideNotificationIndicator %s acceptsTapEvents %s hideHotwordIndicator %s hideStatusBar %s)", objArr);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof WatchFaceStyle)) {
            return false;
        }
        WatchFaceStyle watchFaceStyle = (WatchFaceStyle) obj;
        if (!this.LIZ.equals(watchFaceStyle.LIZ) || this.LIZIZ != watchFaceStyle.LIZIZ || this.LIZJ != watchFaceStyle.LIZJ || this.LJII != watchFaceStyle.LJII || this.LJIIIIZZ != watchFaceStyle.LJIIIIZZ || this.LJIIIZ != watchFaceStyle.LJIIIZ || this.LIZLLL != watchFaceStyle.LIZLLL || this.f20214LJ != watchFaceStyle.f20214LJ || this.LJFF != watchFaceStyle.LJFF || this.LJI != watchFaceStyle.LJI || this.LJIIJ != watchFaceStyle.LJIIJ || this.LJIIJJI != watchFaceStyle.LJIIJJI || this.LJIIL != watchFaceStyle.LJIIL || this.LJIILIIL != watchFaceStyle.LJIILIIL || this.LJIILJJIL != watchFaceStyle.LJIILJJIL || this.LJIILL != watchFaceStyle.LJIILL) {
            return false;
        }
        return true;
    }

    public WatchFaceStyle(Bundle bundle) {
        this.LIZ = (ComponentName) bundle.getParcelable("component");
        this.LJIIIZ = bundle.getInt("ambientPeekMode", 0);
        this.LJII = bundle.getInt("backgroundVisibility", 0);
        this.LIZIZ = bundle.getInt("cardPeekMode", 0);
        this.LIZJ = bundle.getInt("cardProgressMode", 0);
        this.LJI = bundle.getInt("hotwordIndicatorGravity");
        this.LIZLLL = bundle.getInt("peekOpacityMode", 0);
        this.LJIIIIZZ = bundle.getBoolean("showSystemUiTime");
        this.LJIIJ = bundle.getInt("accentColor", -1);
        this.LJIIJJI = bundle.getBoolean("showUnreadIndicator");
        this.LJIIL = bundle.getBoolean("hideNotificationIndicator");
        this.LJFF = bundle.getInt("statusBarGravity");
        this.f20214LJ = bundle.getInt("viewProtectionMode");
        this.LJIILIIL = bundle.getBoolean("acceptsTapEvents");
        this.LJIILJJIL = bundle.getBoolean("hideHotwordIndicator");
        this.LJIILL = bundle.getBoolean("hideStatusBar");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("component", this.LIZ);
        bundle.putInt("ambientPeekMode", this.LJIIIZ);
        bundle.putInt("backgroundVisibility", this.LJII);
        bundle.putInt("cardPeekMode", this.LIZIZ);
        bundle.putInt("cardProgressMode", this.LIZJ);
        bundle.putInt("hotwordIndicatorGravity", this.LJI);
        bundle.putInt("peekOpacityMode", this.LIZLLL);
        bundle.putBoolean("showSystemUiTime", this.LJIIIIZZ);
        bundle.putInt("accentColor", this.LJIIJ);
        bundle.putBoolean("showUnreadIndicator", this.LJIIJJI);
        bundle.putBoolean("hideNotificationIndicator", this.LJIIL);
        bundle.putInt("statusBarGravity", this.LJFF);
        bundle.putInt("viewProtectionMode", this.f20214LJ);
        bundle.putBoolean("acceptsTapEvents", this.LJIILIIL);
        bundle.putBoolean("hideHotwordIndicator", this.LJIILJJIL);
        bundle.putBoolean("hideStatusBar", this.LJIILL);
        parcel.writeBundle(bundle);
    }
}
