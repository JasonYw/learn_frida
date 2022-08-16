package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.a.g.b */
/* loaded from: classes11.dex */
public class C0917b implements Parcelable {
    public static final Parcelable.Creator<C0917b> CREATOR = new Parcelable.Creator<C0917b>() { // from class: com.alibaba.a.a.g.b.1
        static {
            Covode.recordClassIndex(4228);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0917b createFromParcel(Parcel parcel) {
            return C0917b.m20327a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0917b[] newArray(int i) {
            return new C0917b[i];
        }
    };

    /* renamed from: a */
    public String f21234a;

    /* renamed from: b */
    public String f21235b;

    static {
        Covode.recordClassIndex(4227);
    }

    public C0917b() {
        this.f21235b = "null";
    }

    public C0917b(String str, String str2) {
        this.f21235b = "null";
        this.f21234a = str;
        this.f21235b = str2 == null ? "null" : str2;
    }

    /* renamed from: a */
    public static C0917b m20327a(Parcel parcel) {
        try {
            return new C0917b(parcel.readString(), parcel.readString());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public String m20328a() {
        return this.f21234a;
    }

    /* renamed from: b */
    public String m20326b() {
        return this.f21235b;
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
        String str = this.f21234a;
        String str2 = ((C0917b) obj).f21234a;
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
        String str = this.f21234a;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f21235b);
        parcel.writeString(this.f21234a);
    }
}
