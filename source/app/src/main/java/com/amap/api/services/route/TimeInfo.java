package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class TimeInfo implements Parcelable {
    public static final Parcelable.Creator<TimeInfo> CREATOR = new Parcelable.Creator<TimeInfo>() { // from class: com.amap.api.services.route.TimeInfo.1
        static {
            Covode.recordClassIndex(5836);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TimeInfo[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TimeInfo createFromParcel(Parcel parcel) {
            return new TimeInfo(parcel);
        }
    };

    /* renamed from: a */
    public long f25317a;

    /* renamed from: b */
    public List<TimeInfosElement> f25318b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<TimeInfosElement> getElements() {
        return this.f25318b;
    }

    public long getStartTime() {
        return this.f25317a;
    }

    static {
        Covode.recordClassIndex(5835);
    }

    public TimeInfo() {
        this.f25318b = new ArrayList();
    }

    public void setElements(List<TimeInfosElement> list) {
        this.f25318b = list;
    }

    public void setStartTime(long j) {
        this.f25317a = j;
    }

    public TimeInfo(Parcel parcel) {
        this.f25318b = new ArrayList();
        this.f25317a = parcel.readInt();
        this.f25318b = parcel.createTypedArrayList(TimeInfosElement.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f25317a);
        parcel.writeTypedList(this.f25318b);
    }
}
