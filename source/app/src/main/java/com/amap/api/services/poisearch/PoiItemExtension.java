package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class PoiItemExtension implements Parcelable {
    public static final Parcelable.Creator<PoiItemExtension> CREATOR = new Parcelable.Creator<PoiItemExtension>() { // from class: com.amap.api.services.poisearch.PoiItemExtension.1
        static {
            Covode.recordClassIndex(5743);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PoiItemExtension[] newArray(int i) {
            return new PoiItemExtension[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PoiItemExtension createFromParcel(Parcel parcel) {
            return new PoiItemExtension(parcel);
        }
    };

    /* renamed from: a */
    public String f25107a;

    /* renamed from: b */
    public String f25108b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getOpentime() {
        return this.f25107a;
    }

    public String getmRating() {
        return this.f25108b;
    }

    static {
        Covode.recordClassIndex(5742);
    }

    public PoiItemExtension(Parcel parcel) {
        this.f25107a = parcel.readString();
        this.f25108b = parcel.readString();
    }

    public PoiItemExtension(String str, String str2) {
        this.f25107a = str;
        this.f25108b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25107a);
        parcel.writeString(this.f25108b);
    }
}
