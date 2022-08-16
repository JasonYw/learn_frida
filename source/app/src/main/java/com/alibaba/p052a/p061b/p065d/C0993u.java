package com.alibaba.p052a.p061b.p065d;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p062a.C0942a;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.alibaba.p052a.p061b.p067f.AbstractC1001b;
import com.alibaba.p052a.p061b.p067f.C1000a;
import com.alibaba.p052a.p061b.p067f.C1002c;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;
import p002O.C0002O;

/* renamed from: com.alibaba.a.b.d.u */
/* loaded from: classes13.dex */
public class C0993u {

    /* renamed from: a */
    public static final String f21432a = C0993u.class.getSimpleName();

    static {
        Covode.recordClassIndex(4303);
    }

    /* renamed from: a */
    public static String m20052a(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, C34037f.f43302f);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* renamed from: a */
    public static String m20051a(String str, String str2, String str3, String str4) {
        String str5;
        String str6 = str3;
        String str7 = str4;
        Context m20233c = C0941a.m20233c();
        String m20133f = C0960b.m20133f();
        String m20136c = C0960b.m20136c();
        if (m20136c == null) {
            m20136c = "";
        }
        String str8 = C0965d.m20124a(m20233c).get(EnumC0998a.APPVERSION.toString());
        String str9 = C0965d.m20124a(m20233c).get(EnumC0998a.OS.toString());
        String str10 = C0965d.m20124a(m20233c).get(EnumC0998a.UTDID.toString());
        String valueOf = String.valueOf(System.currentTimeMillis());
        AbstractC1001b m20232d = C0941a.m20232d();
        String str11 = "1";
        String str12 = "0";
        if (m20232d instanceof C1002c) {
            str12 = str11;
            str11 = str12;
        } else if (!(m20232d instanceof C1000a) || !((C1000a) m20232d).m20040b()) {
            str11 = str12;
        }
        new StringBuilder();
        if (str6 == null) {
            str6 = "";
        }
        if (str7 == null) {
            str7 = "";
        }
        String mo20038a = m20232d.mo20038a(C0975j.m20093b(C0002O.m25080C(m20133f, m20136c, str8, str9, "2.6.4.8_for_bc_dns", str10, valueOf, "3.0", str12, str6, str7).getBytes()));
        if (!TextUtils.isEmpty(str2)) {
            new StringBuilder();
            str5 = C0002O.m25086C(str2, "&");
        } else {
            str5 = "";
        }
        return String.format("%s?%sak=%s&av=%s&c=%s&v=%s&s=%s&d=%s&sv=%s&p=%s&t=%s&u=%s&is=%s&k=%s", str, str5, m20052a(m20133f), m20052a(str8), m20052a(m20136c), m20052a("3.0"), m20052a(mo20038a), m20052a(str10), "2.6.4.8_for_bc_dns", str9, valueOf, "", str12, str11);
    }

    /* renamed from: a */
    public static String m20050a(String str, Map<String, Object> map, Map<String, Object> map2) {
        String m20051a;
        String[] m20110a;
        String str2 = "";
        if (map2 != null && map2.size() > 0) {
            Set<String> keySet = map2.keySet();
            String[] strArr = new String[keySet.size()];
            keySet.toArray(strArr);
            for (String str3 : C0969g.m20111a().m20110a(strArr, true)) {
                new StringBuilder();
                str2 = C0002O.m25085C(str2, str3, C0975j.m20093b((byte[]) map2.get(str3)));
            }
        }
        try {
            m20051a = m20051a(str, null, null, str2);
        } catch (Throwable unused) {
            m20051a = m20051a(C0942a.m20226a(), null, null, str2);
        }
        String str4 = C0942a.f21287b;
        if (!TextUtils.isEmpty(str4)) {
            new StringBuilder();
            return C0002O.m25085C(m20051a, "&dk=", URLEncoder.encode(str4, C34037f.f43302f));
        }
        return m20051a;
    }
}
