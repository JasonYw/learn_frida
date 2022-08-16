package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.a.g.e */
/* loaded from: classes13.dex */
public class C0923e implements Parcelable {
    public static final Parcelable.Creator<C0923e> CREATOR = new Parcelable.Creator<C0923e>() { // from class: com.alibaba.a.a.g.e.1
        static {
            Covode.recordClassIndex(4234);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0923e createFromParcel(Parcel parcel) {
            return C0923e.m20306a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0923e[] newArray(int i) {
            return new C0923e[i];
        }
    };

    /* renamed from: a */
    public Double f21238a;

    /* renamed from: b */
    public Double f21239b;

    /* renamed from: c */
    public String f21240c;

    /* renamed from: d */
    public Double f21241d;

    static {
        Covode.recordClassIndex(4233);
    }

    public C0923e(String str, Double d, Double d2, Double d3) {
        double d4 = 0.0d;
        Double valueOf = Double.valueOf(0.0d);
        this.f21238a = valueOf;
        this.f21239b = valueOf;
        this.f21241d = valueOf;
        this.f21238a = d2;
        this.f21239b = d3;
        this.f21240c = str;
        this.f21241d = Double.valueOf(d != null ? d.doubleValue() : d4);
    }

    /* renamed from: a */
    public static C0923e m20306a(Parcel parcel) {
        try {
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            return new C0923e(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), valueOf);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public Double m20307a() {
        return this.f21239b;
    }

    /* renamed from: a */
    public boolean m20305a(C0927g c0927g) {
        Double valueOf = Double.valueOf(c0927g.m20283e());
        if (valueOf != null) {
            if (this.f21238a != null && valueOf.doubleValue() < this.f21238a.doubleValue()) {
                return false;
            }
            return this.f21239b == null || valueOf.doubleValue() <= this.f21239b.doubleValue();
        }
        return false;
    }

    /* renamed from: b */
    public String m20304b() {
        return this.f21240c;
    }

    /* renamed from: c */
    public Double m20303c() {
        return this.f21241d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f21240c;
        String str2 = ((C0923e) obj).f21240c;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.f21240c;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            int i2 = 0;
            parcel.writeInt(this.f21239b == null ? 0 : 1);
            if (this.f21239b != null) {
                parcel.writeDouble(this.f21239b.doubleValue());
            }
            parcel.writeInt(this.f21238a == null ? 0 : 1);
            if (this.f21238a != null) {
                parcel.writeDouble(this.f21238a.doubleValue());
            }
            parcel.writeString(this.f21240c);
            if (this.f21241d != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            if (this.f21241d == null) {
                return;
            }
            parcel.writeDouble(this.f21241d.doubleValue());
        } catch (Throwable unused) {
        }
    }
}
