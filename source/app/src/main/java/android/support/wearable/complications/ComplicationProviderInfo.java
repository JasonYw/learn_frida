package android.support.wearable.complications;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public class ComplicationProviderInfo implements Parcelable {
    public static final Parcelable.Creator<ComplicationProviderInfo> CREATOR = new Parcelable.Creator<ComplicationProviderInfo>() { // from class: android.support.wearable.complications.ComplicationProviderInfo.1
        static {
            Covode.recordClassIndex(260);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComplicationProviderInfo[] newArray(int i) {
            return new ComplicationProviderInfo[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComplicationProviderInfo createFromParcel(Parcel parcel) {
            return new ComplicationProviderInfo(parcel);
        }
    };
    public final String LIZ;
    public final String LIZIZ;
    public final Icon LIZJ;
    public final int LIZLLL;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(259);
    }

    public String toString() {
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String valueOf = String.valueOf(this.LIZJ);
        int i = this.LIZLLL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 98 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("ComplicationProviderInfo{appName='");
        sb.append(str);
        sb.append('\'');
        sb.append(", providerName='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", providerIcon=");
        sb.append(valueOf);
        sb.append(", complicationType=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }

    public ComplicationProviderInfo(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.LIZ = readBundle.getString("app_name");
        this.LIZIZ = readBundle.getString("provider_name");
        this.LIZJ = (Icon) readBundle.getParcelable("provider_icon");
        this.LIZLLL = readBundle.getInt("complication_type");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("app_name", this.LIZ);
        bundle.putString("provider_name", this.LIZIZ);
        bundle.putParcelable("provider_icon", this.LIZJ);
        bundle.putInt("complication_type", this.LIZLLL);
        parcel.writeBundle(bundle);
    }
}
