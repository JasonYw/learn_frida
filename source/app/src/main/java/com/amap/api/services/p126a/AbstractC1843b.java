package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.ServiceSettings;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.b */
/* loaded from: classes19.dex */
public abstract class AbstractC1843b<T, V> extends AbstractC1799a<T, V> {
    static {
        Covode.recordClassIndex(5454);
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a, com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: d */
    public Map<String, String> mo16450d() {
        return null;
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: f */
    public V mo16995f() {
        return null;
    }

    /* renamed from: g */
    public abstract String mo16251g();

    @Override // com.amap.api.services.p126a.AbstractC1799a, com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: e */
    public Map<String, String> mo16388e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Search 7.1.0");
        hashMap.put("X-INFO", C1875bi.m16936a(this.f24224d));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", "7.1.0", "sea"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: h */
    public byte[] mo16449h() {
        try {
            StringBuffer stringBuffer = new StringBuffer(mo16251g());
            stringBuffer.append("&language=");
            stringBuffer.append(ServiceSettings.getInstance().getLanguage());
            String stringBuffer2 = stringBuffer.toString();
            String m16998b = m16998b(stringBuffer2);
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(stringBuffer2);
            String m16937a = C1875bi.m16937a();
            stringBuffer3.append(C0002O.m25086C("&ts=", m16937a));
            stringBuffer3.append(C0002O.m25086C("&scode=", C1875bi.m16933a(this.f24224d, m16937a, m16998b)));
            return stringBuffer3.toString().getBytes("utf-8");
        } catch (Throwable th) {
            C2007j.m16371a(th, "ProtocalHandler", "getEntity");
            return null;
        }
    }

    /* renamed from: c */
    public String m16997c(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C2007j.m16371a(e, "ProtocalHandler", "strEncoderUnsupportedEncodingException");
            return "";
        } catch (Exception e2) {
            C2007j.m16371a(e2, "ProtocalHandler", "strEncoderException");
            return "";
        }
    }

    /* renamed from: d */
    public String m16996d(String str) {
        if (str == null) {
            return str;
        }
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C2007j.m16371a(e, "ProtocalHandler", "strReEncoder");
            return "";
        } catch (Exception e2) {
            C2007j.m16371a(e2, "ProtocalHandler", "strReEncoderException");
            return "";
        }
    }

    /* renamed from: b */
    public String m16998b(String str) {
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            stringBuffer.append(m16996d(str2));
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.length() > 1) {
            return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
        }
        return str;
    }

    public AbstractC1843b(Context context, T t) {
        super(context, t);
    }
}
