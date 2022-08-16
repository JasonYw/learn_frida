package com.alibaba.p052a.p053a;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.alibaba.a.a.g */
/* loaded from: classes11.dex */
public class C0914g implements Parcelable {
    public static final Parcelable.Creator<C0914g> CREATOR = new Parcelable.Creator<C0914g>() { // from class: com.alibaba.a.a.g.1
        static {
            Covode.recordClassIndex(4225);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0914g createFromParcel(Parcel parcel) {
            return C0914g.m20331a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0914g[] newArray(int i) {
            return new C0914g[i];
        }
    };

    /* renamed from: a */
    public Integer f21228a;

    /* renamed from: b */
    public String f21229b;

    /* renamed from: c */
    public String f21230c;

    /* renamed from: d */
    public C0921d f21231d;

    /* renamed from: e */
    public String f21232e;

    /* renamed from: f */
    public Map<String, String> f21233f;

    static {
        Covode.recordClassIndex(4224);
    }

    /* renamed from: a */
    public static C0914g m20331a(Parcel parcel) {
        C0914g c0914g = new C0914g();
        try {
            c0914g.f21231d = (C0921d) parcel.readParcelable(C0914g.class.getClassLoader());
            c0914g.f21228a = Integer.valueOf(parcel.readInt());
            c0914g.f21229b = parcel.readString();
            c0914g.f21230c = parcel.readString();
            c0914g.f21232e = parcel.readString();
            c0914g.f21233f = parcel.readHashMap(C0914g.class.getClassLoader());
        } catch (Throwable unused) {
        }
        return c0914g;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f21231d, i);
        parcel.writeInt(this.f21228a.intValue());
        parcel.writeString(this.f21229b);
        parcel.writeString(this.f21230c);
        parcel.writeString(this.f21232e);
        parcel.writeMap(this.f21233f);
    }
}
