package com.alipay.sdk.p082m.p117r;

import android.text.TextUtils;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p120t.C1379a;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.r.b */
/* loaded from: classes2.dex */
public class C1371b {

    /* renamed from: a */
    public EnumC1370a f22353a;

    /* renamed from: b */
    public String f22354b;

    /* renamed from: c */
    public String[] f22355c;

    static {
        Covode.recordClassIndex(4871);
    }

    /* renamed from: a */
    public EnumC1370a m18963a() {
        return this.f22353a;
    }

    /* renamed from: b */
    public String m18959b() {
        return this.f22354b;
    }

    /* renamed from: c */
    public String[] m18957c() {
        return this.f22355c;
    }

    public C1371b(String str) {
        this.f22354b = str;
    }

    /* renamed from: a */
    public static String[] m18961a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.split(";");
        }
        return null;
    }

    /* renamed from: a */
    public static List<C1371b> m18960a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject == null) {
            return arrayList;
        }
        String[] m18961a = m18961a(jSONObject.optString("name", ""));
        for (int i = 0; i < m18961a.length; i++) {
            EnumC1370a m18964a = EnumC1370a.m18964a(m18961a[i]);
            if (m18964a != EnumC1370a.None) {
                C1371b c1371b = new C1371b(m18961a[i], m18964a);
                c1371b.f22355c = m18958b(m18961a[i]);
                arrayList.add(c1371b);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m18962a(C1371b c1371b) {
        String[] m18957c = c1371b.m18957c();
        if (m18957c.length == 3 && TextUtils.equals("tid", m18957c[0])) {
            C1379a m18912a = C1379a.m18912a(C1378b.m18915d().m18917b());
            if (!TextUtils.isEmpty(m18957c[1]) && !TextUtils.isEmpty(m18957c[2])) {
                m18912a.m18911a(m18957c[1], m18957c[2]);
            }
        }
    }

    /* renamed from: b */
    public static String[] m18958b(String str) {
        ArrayList arrayList = new ArrayList();
        int indexOf = str.indexOf(40);
        int lastIndexOf = str.lastIndexOf(41);
        if (indexOf != -1 && lastIndexOf != -1 && lastIndexOf > indexOf) {
            String[] split = str.substring(indexOf + 1, lastIndexOf).split("' *, *'", -1);
            for (String str2 : split) {
                arrayList.add(str2.trim().replaceAll("'", "").replaceAll(C1394i.f22426f, ""));
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return null;
    }

    public C1371b(String str, EnumC1370a enumC1370a) {
        this.f22354b = str;
        this.f22353a = enumC1370a;
    }
}
