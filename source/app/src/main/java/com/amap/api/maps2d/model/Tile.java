package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class Tile implements Parcelable {
    public static final C1796j CREATOR = new C1796j();

    /* renamed from: a */
    public final int f24205a;

    /* renamed from: b */
    public final int f24206b;

    /* renamed from: c */
    public final int f24207c;
    public final byte[] data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(5392);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24205a);
        parcel.writeInt(this.f24206b);
        parcel.writeInt(this.f24207c);
        parcel.writeByteArray(this.data);
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, i, i2, bArr);
    }

    public Tile(int i, int i2, int i3, byte[] bArr) {
        this.f24205a = i;
        this.f24206b = i2;
        this.f24207c = i3;
        this.data = bArr;
    }
}
