package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alibaba.a.a.g.g */
/* loaded from: classes13.dex */
public class C0927g implements Parcelable, AbstractC0890b {
    public static final Parcelable.Creator<C0927g> CREATOR = new Parcelable.Creator<C0927g>() { // from class: com.alibaba.a.a.g.g.1
        static {
            Covode.recordClassIndex(4238);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0927g createFromParcel(Parcel parcel) {
            return C0927g.m20289a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0927g[] newArray(int i) {
            return new C0927g[i];
        }
    };

    /* renamed from: a */
    public boolean f21243a;

    /* renamed from: b */
    public Double f21244b;

    /* renamed from: c */
    public double f21245c;

    static {
        Covode.recordClassIndex(4237);
    }

    /* renamed from: a */
    public static C0927g m20291a() {
        return (C0927g) C0889a.m20418a().m20415a(C0927g.class, new Object[0]);
    }

    /* renamed from: a */
    public static C0927g m20289a(Parcel parcel) {
        try {
            boolean z = parcel.readInt() != 0;
            Double valueOf = Double.valueOf(parcel.readDouble());
            double readDouble = parcel.readDouble();
            C0927g m20291a = m20291a();
            try {
                m20291a.f21243a = z;
                m20291a.f21244b = valueOf;
                m20291a.f21245c = readDouble;
                return m20291a;
            } catch (Throwable unused) {
                return m20291a;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public void m20290a(double d) {
        this.f21244b = Double.valueOf(d);
    }

    /* renamed from: a */
    public synchronized void m20288a(C0927g c0927g) {
        if (c0927g == null) {
            return;
        }
        try {
            this.f21245c += c0927g.m20283e();
            if (c0927g.m20286b() != null) {
                if (this.f21244b == null) {
                    this.f21244b = Double.valueOf(0.0d);
                }
                this.f21244b = Double.valueOf(this.f21244b.doubleValue() + c0927g.m20286b().doubleValue());
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void m20287a(boolean z) {
        this.f21243a = z;
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public synchronized void mo20254a(Object... objArr) {
        if (objArr == null) {
            return;
        }
        if (objArr.length > 0) {
            this.f21245c = ((Double) objArr[0]).doubleValue();
        }
        if (objArr.length > 1) {
            this.f21244b = (Double) objArr[1];
            this.f21243a = false;
        }
    }

    /* renamed from: b */
    public Double m20286b() {
        return this.f21244b;
    }

    /* renamed from: b */
    public void m20285b(double d) {
        this.f21245c = d;
    }

    /* renamed from: c */
    public boolean m20284c() {
        return this.f21243a;
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public synchronized void mo20252d() {
        this.f21245c = 0.0d;
        this.f21244b = null;
        this.f21243a = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public double m20283e() {
        return this.f21245c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeInt(this.f21243a ? 1 : 0);
            parcel.writeDouble(this.f21244b == null ? 0.0d : this.f21244b.doubleValue());
            parcel.writeDouble(this.f21245c);
        } catch (Throwable unused) {
        }
    }
}
