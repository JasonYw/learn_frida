package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.p126a.C2007j;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class RoadTrafficQuery extends AbstractC2114a implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RoadTrafficQuery> CREATOR = new Parcelable.Creator<RoadTrafficQuery>() { // from class: com.amap.api.services.traffic.RoadTrafficQuery.1
        static {
            Covode.recordClassIndex(5868);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RoadTrafficQuery[] newArray(int i) {
            return new RoadTrafficQuery[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final RoadTrafficQuery createFromParcel(Parcel parcel) {
            return new RoadTrafficQuery(parcel);
        }
    };

    /* renamed from: b */
    public String f25390b;

    /* renamed from: c */
    public String f25391c;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f25391c;
    }

    public String getName() {
        return this.f25390b;
    }

    @Override // com.amap.api.services.traffic.AbstractC2114a
    public /* bridge */ /* synthetic */ int getLevel() {
        return super.getLevel();
    }

    static {
        Covode.recordClassIndex(5867);
    }

    /* renamed from: clone */
    public RoadTrafficQuery m25299clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            C2007j.m16371a(e, "RoadTrafficQuery", "RoadTrafficQueryClone");
        }
        return new RoadTrafficQuery(this.f25390b, this.f25391c, this.f25409a);
    }

    public void setAdCode(String str) {
        this.f25391c = str;
    }

    @Override // com.amap.api.services.traffic.AbstractC2114a
    public /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
    }

    public void setName(String str) {
        this.f25390b = str;
    }

    public RoadTrafficQuery(Parcel parcel) {
        this.f25390b = parcel.readString();
        this.f25391c = parcel.readString();
        this.f25409a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f25390b);
        parcel.writeString(this.f25391c);
        parcel.writeInt(this.f25409a);
    }

    public RoadTrafficQuery(String str, String str2, int i) {
        this.f25390b = str;
        this.f25391c = str2;
        this.f25409a = i;
    }
}
