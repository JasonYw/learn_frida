package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.a.a.g.c */
/* loaded from: classes13.dex */
public class C0919c implements Parcelable {
    public static final Parcelable.Creator<C0919c> CREATOR = new Parcelable.Creator<C0919c>() { // from class: com.alibaba.a.a.g.c.1
        static {
            Covode.recordClassIndex(4230);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0919c createFromParcel(Parcel parcel) {
            return C0919c.m20322a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0919c[] newArray(int i) {
            return new C0919c[i];
        }
    };

    /* renamed from: a */
    public List<C0917b> f21236a = new ArrayList(3);

    static {
        Covode.recordClassIndex(4229);
    }

    /* renamed from: a */
    public static C0919c m20323a() {
        return new C0919c();
    }

    /* renamed from: a */
    public static C0919c m20322a(Parcel parcel) {
        C0919c m20323a = m20323a();
        try {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(C0919c.class.getClassLoader());
            if (readParcelableArray != null) {
                if (m20323a.f21236a == null) {
                    m20323a.f21236a = new ArrayList();
                }
                for (int i = 0; i < readParcelableArray.length; i++) {
                    if (readParcelableArray[i] == null || !(readParcelableArray[i] instanceof C0917b)) {
                        C0974i.m20098a("DimensionSet", "parcelables[i]:", readParcelableArray[i]);
                    } else {
                        m20323a.f21236a.add((C0917b) readParcelableArray[i]);
                    }
                }
            }
        } catch (Throwable th) {
            C0974i.m20099a("DimensionSet", "[readFromParcel]", th);
        }
        return m20323a;
    }

    /* renamed from: a */
    public boolean m20321a(C0921d c0921d) {
        List<C0917b> list = this.f21236a;
        if (list != null) {
            if (c0921d == null) {
                return false;
            }
            for (C0917b c0917b : list) {
                if (!c0921d.m20314a(c0917b.m20328a())) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public void m20320b(C0921d c0921d) {
        List<C0917b> list = this.f21236a;
        if (list == null || c0921d == null) {
            return;
        }
        for (C0917b c0917b : list) {
            if (c0917b.m20326b() != null && c0921d.m20310b(c0917b.m20328a()) == null) {
                c0921d.m20313a(c0917b.m20328a(), c0917b.m20326b());
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<C0917b> list = this.f21236a;
        if (list != null) {
            try {
                Object[] array = list.toArray();
                C0917b[] c0917bArr = null;
                if (array != null) {
                    c0917bArr = new C0917b[array.length];
                    for (int i2 = 0; i2 < array.length; i2++) {
                        c0917bArr[i2] = (C0917b) array[i2];
                    }
                }
                parcel.writeParcelableArray(c0917bArr, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
