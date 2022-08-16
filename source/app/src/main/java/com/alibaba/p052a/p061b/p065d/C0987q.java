package com.alibaba.p052a.p061b.p065d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.alibaba.a.b.d.q */
/* loaded from: classes26.dex */
public class C0987q {
    static {
        Covode.recordClassIndex(4297);
    }

    /* renamed from: a */
    public static String m20067a(Object obj) {
        if (obj != null) {
            if (obj instanceof String) {
                String str = (String) obj;
                str.toString();
                return str;
            } else if (obj instanceof Integer) {
                StringBuilder sb = new StringBuilder();
                sb.append(((Integer) obj).intValue());
                return sb.toString();
            } else if (obj instanceof Long) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(((Long) obj).longValue());
                return sb2.toString();
            } else if (obj instanceof Double) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(((Double) obj).doubleValue());
                return sb3.toString();
            } else if (obj instanceof Float) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(((Float) obj).floatValue());
                return sb4.toString();
            } else if (obj instanceof Short) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append((int) ((Short) obj).shortValue());
                return sb5.toString();
            } else if (!(obj instanceof Byte)) {
                return obj instanceof Boolean ? ((Boolean) obj).toString() : obj instanceof Character ? ((Character) obj).toString() : obj.toString();
            } else {
                StringBuilder sb6 = new StringBuilder();
                sb6.append((int) ((Byte) obj).byteValue());
                return sb6.toString();
            }
        }
        return "";
    }

    /* renamed from: a */
    public static Map<String, String> m20066a(Map<String, String> map) {
        if (map != null) {
            HashMap hashMap = new HashMap();
            for (String str : map.keySet()) {
                if (str instanceof String) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                        try {
                            hashMap.put(URLEncoder.encode(str, C34037f.f43302f), URLEncoder.encode(str2, C34037f.f43302f));
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            return hashMap;
        }
        return map;
    }

    /* renamed from: b */
    public static String m20065b(Map<String, String> map) {
        if (map != null) {
            boolean z = true;
            StringBuffer stringBuffer = new StringBuffer();
            for (String str : map.keySet()) {
                String m20067a = m20067a(map.get(str));
                String m20067a2 = m20067a(str);
                if (m20067a != null && m20067a2 != null) {
                    if (z) {
                        new StringBuilder();
                        stringBuffer.append(C0002O.m25085C(m20067a2, "=", m20067a));
                        z = false;
                    } else {
                        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        new StringBuilder();
                        stringBuffer.append(C0002O.m25085C(m20067a2, "=", m20067a));
                    }
                }
            }
            return stringBuffer.toString();
        }
        return null;
    }
}
