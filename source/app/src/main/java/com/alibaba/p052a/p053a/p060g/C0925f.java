package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.alibaba.a.a.g.f */
/* loaded from: classes13.dex */
public class C0925f implements Parcelable {
    public static final Parcelable.Creator<C0925f> CREATOR = new Parcelable.Creator<C0925f>() { // from class: com.alibaba.a.a.g.f.1
        static {
            Covode.recordClassIndex(4236);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0925f createFromParcel(Parcel parcel) {
            return C0925f.m20299a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0925f[] newArray(int i) {
            return new C0925f[i];
        }
    };

    /* renamed from: a */
    public List<C0923e> f21242a = new ArrayList(3);

    static {
        Covode.recordClassIndex(4235);
    }

    /* renamed from: a */
    public static C0925f m20300a() {
        return new C0925f();
    }

    /* renamed from: a */
    public static C0925f m20299a(Parcel parcel) {
        C0925f m20300a = m20300a();
        try {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(C0925f.class.getClassLoader());
            if (readParcelableArray != null) {
                ArrayList arrayList = new ArrayList(readParcelableArray.length);
                for (Parcelable parcelable : readParcelableArray) {
                    arrayList.add((C0923e) parcelable);
                }
                m20300a.f21242a = arrayList;
            }
        } catch (Throwable unused) {
        }
        return m20300a;
    }

    /* renamed from: a */
    public C0923e m20296a(String str) {
        for (C0923e c0923e : this.f21242a) {
            if (c0923e.m20304b().equals(str)) {
                return c0923e;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0925f m20298a(C0923e c0923e) {
        if (!this.f21242a.contains(c0923e)) {
            this.f21242a.add(c0923e);
        }
        return this;
    }

    /* renamed from: a */
    public boolean m20297a(C0929h c0929h) {
        if (this.f21242a != null) {
            if (c0929h == null) {
                return false;
            }
            for (int i = 0; i < this.f21242a.size(); i++) {
                C0923e c0923e = this.f21242a.get(i);
                if (c0923e != null) {
                    String m20304b = c0923e.m20304b();
                    if (!c0929h.m20273b(m20304b) || !c0923e.m20305a(c0929h.m20277a(m20304b))) {
                        return false;
                    }
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: b */
    public List<C0923e> m20295b() {
        return this.f21242a;
    }

    /* renamed from: b */
    public void m20294b(C0929h c0929h) {
        List<C0923e> list = this.f21242a;
        if (list == null || c0929h == null) {
            return;
        }
        for (C0923e c0923e : list) {
            if (c0923e.m20303c() != null && c0929h.m20277a(c0923e.m20304b()) == null) {
                c0929h.m20276a(c0923e.m20304b(), c0923e.m20303c().doubleValue());
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        List<C0923e> list = this.f21242a;
        if (list != null) {
            try {
                Object[] array = list.toArray();
                C0923e[] c0923eArr = null;
                if (array != null) {
                    c0923eArr = new C0923e[array.length];
                    for (int i2 = 0; i2 < array.length; i2++) {
                        c0923eArr[i2] = (C0923e) array[i2];
                    }
                }
                parcel.writeParcelableArray(c0923eArr, i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
