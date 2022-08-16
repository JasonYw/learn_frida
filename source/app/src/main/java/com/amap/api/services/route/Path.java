package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class Path implements Parcelable {
    public static final Parcelable.Creator<Path> CREATOR = new Parcelable.Creator<Path>() { // from class: com.amap.api.services.route.Path.1
        static {
            Covode.recordClassIndex(5786);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Path[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final Path createFromParcel(Parcel parcel) {
            return new Path(parcel);
        }
    };

    /* renamed from: a */
    public float f25217a;

    /* renamed from: b */
    public long f25218b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Path() {
    }

    public float getDistance() {
        return this.f25217a;
    }

    public long getDuration() {
        return this.f25218b;
    }

    static {
        Covode.recordClassIndex(5785);
    }

    public void setDistance(float f) {
        this.f25217a = f;
    }

    public void setDuration(long j) {
        this.f25218b = j;
    }

    public Path(Parcel parcel) {
        this.f25217a = parcel.readFloat();
        this.f25218b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f25217a);
        parcel.writeLong(this.f25218b);
    }
}
