package com.alibaba.p052a.p061b.p065d;

import android.text.TextUtils;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.alibaba.a.b.d.h */
/* loaded from: classes13.dex */
public class C0973h {
    static {
        Covode.recordClassIndex(4283);
    }

    /* renamed from: a */
    public static String m20107a(String str) {
        return TextUtils.isEmpty(str) ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : str;
    }

    /* renamed from: a */
    public static String m20106a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put(EnumC0998a.PAGE.toString(), str);
        }
        hashMap.put(EnumC0998a.EVENTID.toString(), str2);
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put(EnumC0998a.ARG1.toString(), str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put(EnumC0998a.ARG2.toString(), str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put(EnumC0998a.ARG3.toString(), str5);
        }
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put(EnumC0998a.RECORD_TIMESTAMP.toString(), str7);
        }
        if (!TextUtils.isEmpty(str6)) {
            hashMap.put(EnumC0998a.RESERVE3.toString(), str6);
        }
        return m20104b(hashMap);
    }

    /* renamed from: a */
    public static String m20105a(Map<String, String> map) {
        boolean z;
        EnumC0998a enumC0998a;
        StringBuilder sb = new StringBuilder();
        EnumC0998a[] values = EnumC0998a.values();
        int length = values.length;
        int i = 0;
        while (true) {
            String str = null;
            if (i >= length || (enumC0998a = values[i]) == EnumC0998a.ARGS) {
                break;
            }
            if (map.containsKey(enumC0998a.toString())) {
                str = map.get(enumC0998a.toString());
                map.remove(enumC0998a.toString());
            }
            sb.append(m20107a(str));
            sb.append("||");
            i++;
        }
        if (map.containsKey(EnumC0998a.ARGS.toString())) {
            sb.append(m20107a(map.get(EnumC0998a.ARGS.toString())));
            map.remove(EnumC0998a.ARGS.toString());
            z = false;
        } else {
            z = true;
        }
        for (String str2 : map.keySet()) {
            String str3 = map.containsKey(str2) ? map.get(str2) : null;
            if (z) {
                if ("StackTrace".equals(str2)) {
                    sb.append("StackTrace=====>");
                } else {
                    sb.append(m20107a(str2));
                    sb.append("=");
                }
                sb.append(str3);
                z = false;
            } else {
                if ("StackTrace".equals(str2)) {
                    sb.append(",StackTrace=====>");
                } else {
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(m20107a(str2));
                    sb.append("=");
                }
                sb.append(str3);
            }
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2) || !sb2.endsWith("||")) {
            return sb2;
        }
        return sb2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
    }

    /* renamed from: b */
    public static String m20104b(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        m20103c(map);
        return m20105a(map);
    }

    /* renamed from: c */
    public static Map<String, String> m20103c(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        try {
            String m20135d = C0960b.m20135d();
            if (!TextUtils.isEmpty(m20135d) && !map.containsKey(EnumC0998a.USERNICK.toString())) {
                map.put(EnumC0998a.USERNICK.toString(), m20135d);
            }
            String m20142a = C0960b.m20142a();
            if (!TextUtils.isEmpty(m20142a) && !map.containsKey(EnumC0998a.LL_USERNICK.toString())) {
                map.put(EnumC0998a.LL_USERNICK.toString(), m20142a);
            }
            String m20134e = C0960b.m20134e();
            if (!TextUtils.isEmpty(m20134e) && !map.containsKey(EnumC0998a.USERID.toString())) {
                map.put(EnumC0998a.USERID.toString(), m20134e);
            }
            String m20139b = C0960b.m20139b();
            if (!TextUtils.isEmpty(m20139b) && !map.containsKey(EnumC0998a.LL_USERID.toString())) {
                map.put(EnumC0998a.LL_USERID.toString(), m20139b);
            }
            String valueOf = String.valueOf(System.currentTimeMillis());
            if (!map.containsKey(EnumC0998a.RECORD_TIMESTAMP.toString())) {
                map.put(EnumC0998a.RECORD_TIMESTAMP.toString(), valueOf);
            }
            if (!map.containsKey(EnumC0998a.START_SESSION_TIMESTAMP.toString())) {
                map.put(EnumC0998a.START_SESSION_TIMESTAMP.toString(), String.valueOf(C0941a.f21278f));
            }
            Map<String, String> m20124a = C0965d.m20124a(C0941a.m20233c());
            if (m20124a != null) {
                for (String str : m20124a.keySet()) {
                    String str2 = m20124a.get(str);
                    if (!TextUtils.isEmpty(str2) && !map.containsKey(str) && !map.containsKey(str)) {
                        map.put(str, str2);
                    }
                }
            }
            String m20102d = m20102d(map);
            if (!TextUtils.isEmpty(m20102d) && !map.containsKey(EnumC0998a.RESERVES.toString())) {
                map.put(EnumC0998a.RESERVES.toString(), m20102d);
            }
        } catch (Throwable unused) {
        }
        return map;
    }

    /* renamed from: d */
    public static String m20102d(Map<String, String> map) {
        String str = "_ap=1";
        if ("y".equalsIgnoreCase(map.get(EnumC0998a.OS.toString()))) {
            String m20122b = C0965d.m20122b();
            if (!TextUtils.isEmpty(m20122b)) {
                new StringBuilder();
                str = C0002O.m25085C(str, ",_did=", m20122b);
            }
        }
        String str2 = map.get(EnumC0998a.APPKEY.toString());
        if (TextUtils.isEmpty(C0960b.m20133f()) || TextUtils.isEmpty(str2) || C0960b.m20133f().equalsIgnoreCase(str2)) {
            return str;
        }
        new StringBuilder();
        return C0002O.m25085C(str, ",_mak=", C0960b.m20133f());
    }
}
