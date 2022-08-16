package com.alibaba.p052a.p053a.p060g;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.alibaba.a.a.g.d */
/* loaded from: classes13.dex */
public class C0921d implements Parcelable, AbstractC0890b {
    public static final Parcelable.Creator<C0921d> CREATOR = new Parcelable.Creator<C0921d>() { // from class: com.alibaba.a.a.g.d.1
        static {
            Covode.recordClassIndex(4232);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0921d createFromParcel(Parcel parcel) {
            return C0921d.m20316a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final C0921d[] newArray(int i) {
            return new C0921d[i];
        }
    };

    /* renamed from: a */
    public Map<String, String> f21237a;

    static {
        Covode.recordClassIndex(4231);
    }

    public C0921d() {
        if (this.f21237a == null) {
            this.f21237a = new LinkedHashMap();
        }
    }

    /* renamed from: a */
    public static C0921d m20317a() {
        return (C0921d) C0889a.m20418a().m20415a(C0921d.class, new Object[0]);
    }

    /* renamed from: a */
    public static C0921d m20316a(Parcel parcel) {
        try {
            C0921d m20317a = m20317a();
            try {
                m20317a.f21237a = parcel.readHashMap(C0921d.class.getClassLoader());
                return m20317a;
            } catch (Throwable unused) {
                return m20317a;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public C0921d m20315a(C0921d c0921d) {
        Map<String, String> m20311b;
        if (c0921d != null && (m20311b = c0921d.m20311b()) != null) {
            for (Map.Entry<String, String> entry : m20311b.entrySet()) {
                this.f21237a.put(entry.getKey(), entry.getValue() != null ? entry.getValue() : "null");
            }
        }
        return this;
    }

    /* renamed from: a */
    public C0921d m20313a(String str, String str2) {
        Map<String, String> map = this.f21237a;
        if (str2 == null) {
            str2 = "null";
        }
        map.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public void m20312a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f21237a.put(entry.getKey(), entry.getValue() != null ? entry.getValue() : "null");
        }
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        if (this.f21237a == null) {
            this.f21237a = new LinkedHashMap();
        }
    }

    /* renamed from: a */
    public boolean m20314a(String str) {
        return this.f21237a.containsKey(str);
    }

    /* renamed from: b */
    public String m20310b(String str) {
        return this.f21237a.get(str);
    }

    /* renamed from: b */
    public Map<String, String> m20311b() {
        return this.f21237a;
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        this.f21237a.clear();
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
        Map<String, String> map = this.f21237a;
        Map<String, String> map2 = ((C0921d) obj).f21237a;
        if (map == null) {
            if (map2 != null) {
                return false;
            }
        } else if (!map.equals(map2)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Map<String, String> map = this.f21237a;
        return (map == null ? 0 : map.hashCode()) + 31;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f21237a);
    }
}
