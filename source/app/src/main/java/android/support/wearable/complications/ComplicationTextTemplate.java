package android.support.wearable.complications;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public class ComplicationTextTemplate implements Parcelable, TimeDependentText {
    public static final Parcelable.Creator<ComplicationTextTemplate> CREATOR = new Parcelable.Creator<ComplicationTextTemplate>() { // from class: android.support.wearable.complications.ComplicationTextTemplate.1
        static {
            Covode.recordClassIndex(265);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ComplicationTextTemplate[] newArray(int i) {
            return new ComplicationTextTemplate[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ComplicationTextTemplate createFromParcel(Parcel parcel) {
            return new ComplicationTextTemplate(parcel, (byte) 0);
        }
    };
    public final CharSequence LIZ;
    public final ComplicationText[] LIZIZ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(264);
    }

    public ComplicationTextTemplate(Parcel parcel) {
        this(parcel.readBundle(ComplicationTextTemplate.class.getClassLoader()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComplicationTextTemplate(Bundle bundle) {
        this.LIZ = bundle.getCharSequence("KEY_SURROUNDING_STRING");
        Parcelable[] parcelableArray = bundle.getParcelableArray("KEY_TIME_DEPENDENT_TEXTS");
        this.LIZIZ = new ComplicationText[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            this.LIZIZ[i] = parcelableArray[i];
        }
        if (this.LIZ == null && this.LIZIZ.length == 0) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    public /* synthetic */ ComplicationTextTemplate(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final boolean LIZ(long j, long j2) {
        for (ComplicationText complicationText : this.LIZIZ) {
            if (!complicationText.LIZ(j, j2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("KEY_SURROUNDING_STRING", this.LIZ);
        bundle.putParcelableArray("KEY_TIME_DEPENDENT_TEXTS", this.LIZIZ);
        parcel.writeBundle(bundle);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    public final CharSequence LIZ(Context context, long j) {
        int length = this.LIZIZ.length;
        if (length == 0) {
            return this.LIZ;
        }
        CharSequence[] charSequenceArr = new CharSequence[length];
        int i = 0;
        do {
            charSequenceArr[i] = this.LIZIZ[i].LIZ(context, j);
            i++;
        } while (i < length);
        CharSequence charSequence = this.LIZ;
        if (charSequence == null) {
            return TextUtils.join(" ", charSequenceArr);
        }
        return TextUtils.expandTemplate(charSequence, charSequenceArr);
    }
}
