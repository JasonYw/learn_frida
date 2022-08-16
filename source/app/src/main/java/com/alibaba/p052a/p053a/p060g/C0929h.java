package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.alibaba.a.a.g.h */
/* loaded from: classes13.dex */
public class C0929h implements Parcelable, AbstractC0890b {
    public static final Parcelable.Creator<C0929h> CREATOR = new Parcelable.Creator<C0929h>() { // from class: com.alibaba.a.a.g.h.1
        static {
            Covode.recordClassIndex(4240);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0929h createFromParcel(Parcel parcel) {
            return C0929h.m20279a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0929h[] newArray(int i) {
            return new C0929h[i];
        }
    };

    /* renamed from: a */
    public Map<String, C0927g> f21246a = new LinkedHashMap();

    static {
        Covode.recordClassIndex(4239);
    }

    /* renamed from: a */
    public static C0929h m20280a() {
        return (C0929h) C0889a.m20418a().m20415a(C0929h.class, new Object[0]);
    }

    /* renamed from: a */
    public static C0929h m20279a(Parcel parcel) {
        try {
            C0929h m20280a = m20280a();
            try {
                m20280a.f21246a = parcel.readHashMap(C0921d.class.getClassLoader());
                return m20280a;
            } catch (Throwable unused) {
                return m20280a;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public C0927g m20277a(String str) {
        return this.f21246a.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public C0929h m20276a(String str, double d) {
        this.f21246a.put(str, C0889a.m20418a().m20415a(C0927g.class, Double.valueOf(d)));
        return this;
    }

    /* renamed from: a */
    public void m20278a(C0929h c0929h) {
        for (String str : this.f21246a.keySet()) {
            this.f21246a.get(str).m20288a(c0929h.m20277a(str));
        }
    }

    /* renamed from: a */
    public void m20275a(String str, C0927g c0927g) {
        this.f21246a.put(str, c0927g);
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        if (this.f21246a == null) {
            this.f21246a = new LinkedHashMap();
        }
    }

    /* renamed from: b */
    public Map<String, C0927g> m20274b() {
        return this.f21246a;
    }

    /* renamed from: b */
    public boolean m20273b(String str) {
        return this.f21246a.containsKey(str);
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        for (C0927g c0927g : this.f21246a.values()) {
            C0889a.m20418a().m20417a((C0889a) c0927g);
        }
        this.f21246a.clear();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f21246a);
    }
}
