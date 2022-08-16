package android.support.wearable.watchface.accessibility;

import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.TimeDependentText;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* loaded from: classes10.dex */
public class ContentDescriptionLabel implements Parcelable {
    public static final Parcelable.Creator<ContentDescriptionLabel> CREATOR = new Parcelable.Creator<ContentDescriptionLabel>() { // from class: android.support.wearable.watchface.accessibility.ContentDescriptionLabel.1
        static {
            Covode.recordClassIndex(360);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ContentDescriptionLabel[] newArray(int i) {
            return new ContentDescriptionLabel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ContentDescriptionLabel createFromParcel(Parcel parcel) {
            return new ContentDescriptionLabel(parcel);
        }
    };
    public final TimeDependentText LIZ;
    public final Rect LIZIZ;
    public PendingIntent LIZJ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(359);
    }

    public int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ, this.LIZJ);
    }

    public String toString() {
        String valueOf = String.valueOf(this.LIZ);
        String valueOf2 = String.valueOf(this.LIZIZ);
        String valueOf3 = String.valueOf(this.LIZJ);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ContentDescriptionLabel{text=");
        sb.append(valueOf);
        sb.append(", bounds=");
        sb.append(valueOf2);
        sb.append(", tapAction=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }

    public ContentDescriptionLabel(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        this.LIZ = (TimeDependentText) readBundle.getParcelable("KEY_TEXT");
        this.LIZIZ = (Rect) readBundle.getParcelable("KEY_BOUNDS");
        this.LIZJ = (PendingIntent) readBundle.getParcelable("KEY_TAP_ACTION");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContentDescriptionLabel contentDescriptionLabel = (ContentDescriptionLabel) obj;
            if (Objects.equals(this.LIZ, contentDescriptionLabel.LIZ) && Objects.equals(this.LIZIZ, contentDescriptionLabel.LIZIZ) && Objects.equals(this.LIZJ, contentDescriptionLabel.LIZJ)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("KEY_TEXT", this.LIZ);
        bundle.putParcelable("KEY_BOUNDS", this.LIZIZ);
        bundle.putParcelable("KEY_TAP_ACTION", this.LIZJ);
        parcel.writeBundle(bundle);
    }
}
