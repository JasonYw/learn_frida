package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes19.dex */
public class TimeInfosElement implements Parcelable {
    public static final Parcelable.Creator<TimeInfosElement> CREATOR = new Parcelable.Creator<TimeInfosElement>() { // from class: com.amap.api.services.route.TimeInfosElement.1
        static {
            Covode.recordClassIndex(5838);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TimeInfosElement[] newArray(int i) {
            return null;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TimeInfosElement createFromParcel(Parcel parcel) {
            return new TimeInfosElement(parcel);
        }
    };

    /* renamed from: a */
    public int f25319a;

    /* renamed from: b */
    public float f25320b;

    /* renamed from: c */
    public float f25321c;

    /* renamed from: d */
    public int f25322d;

    /* renamed from: e */
    public List<TMC> f25323e;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getDuration() {
        return this.f25320b;
    }

    public int getPathindex() {
        return this.f25319a;
    }

    public int getRestriction() {
        return this.f25322d;
    }

    public List<TMC> getTMCs() {
        return this.f25323e;
    }

    public float getTolls() {
        return this.f25321c;
    }

    static {
        Covode.recordClassIndex(5837);
    }

    public TimeInfosElement() {
        this.f25323e = new ArrayList();
    }

    public void setDuration(float f) {
        this.f25320b = f;
    }

    public void setPathindex(int i) {
        this.f25319a = i;
    }

    public void setRestriction(int i) {
        this.f25322d = i;
    }

    public void setTMCs(List<TMC> list) {
        this.f25323e = list;
    }

    public void setTolls(float f) {
        this.f25321c = f;
    }

    public TimeInfosElement(Parcel parcel) {
        this.f25323e = new ArrayList();
        this.f25319a = parcel.readInt();
        this.f25320b = parcel.readFloat();
        this.f25321c = parcel.readFloat();
        this.f25322d = parcel.readInt();
        this.f25323e = parcel.createTypedArrayList(TMC.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25319a);
        parcel.writeFloat(this.f25320b);
        parcel.writeFloat(this.f25321c);
        parcel.writeInt(this.f25322d);
        parcel.writeTypedList(this.f25323e);
    }
}
