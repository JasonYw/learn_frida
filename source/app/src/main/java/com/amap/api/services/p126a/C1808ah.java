package com.amap.api.services.p126a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ah */
/* loaded from: classes19.dex */
public class C1808ah extends AbstractC1799a<String, String> {

    /* renamed from: i */
    public String f24235i;

    static {
        Covode.recordClassIndex(5419);
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        return C2006i.m16376d();
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a, com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: d */
    public Map<String, String> mo16450d() {
        byte[] bArr;
        new StringBuilder();
        String m25086C = C0002O.m25086C("&address=", URLEncoder.encode(this.f24235i));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("open_api1");
        stringBuffer.append(this.f24235i);
        stringBuffer.append("@8UbJH6N2szojnTHONAWzB6K7N1kaj7Y0iUMarxac");
        try {
            bArr = C1816ap.m17063a(C0002O.m25083C("channel=open_api&flag=1", m25086C, "&sign=", C1887bm.m16832b(stringBuffer.toString()).toUpperCase(Locale.US), "&output=json").getBytes("utf-8"), "Yaynpa84IKOfasFx".getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            C2007j.m16371a(e, "ShareUrlSearchHandler", "getParams");
            bArr = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ent", "2");
        hashMap.put("in", C1882bk.m16859b(bArr));
        hashMap.put("keyt", "openapi");
        return hashMap;
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: b */
    public String mo16254a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String m16338a = C2014q.m16338a(jSONObject, C2521l.LJIIJ);
            String m16338a2 = C2014q.m16338a(jSONObject, "message");
            if ("1".equals(m16338a)) {
                return C2014q.m16338a(jSONObject, "transfer_url");
            }
            if (!"0".equals(m16338a)) {
                if (!"2".equals(m16338a)) {
                    if (!PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START.equals(m16338a)) {
                        if (!"4".equals(m16338a)) {
                            if ("5".equals(m16338a)) {
                                throw new AMapException("短串分享认证失败", 0, m16338a2);
                            }
                            return null;
                        }
                        throw new AMapException("用户签名未通过", 0, m16338a2);
                    }
                    throw new AMapException("请求参数非法", 0, m16338a2);
                }
                throw new AMapException("短串请求失败", 0, m16338a2);
            }
            throw new AMapException("其他未知错误", 0, m16338a2);
        } catch (JSONException e) {
            C2007j.m16371a(e, "ShareUrlSearchHandler", "paseJSON");
            return null;
        }
    }

    public C1808ah(Context context, String str) {
        super(context, str);
        this.f24235i = str;
    }

    @Override // com.amap.api.services.p126a.AbstractC1799a
    /* renamed from: a */
    public byte[] mo17078a(int i, C1966dh c1966dh, AbstractC1969di abstractC1969di) {
        if (i == 1) {
            return c1966dh.m16455d(abstractC1969di);
        }
        if (i == 2) {
            return c1966dh.m16454e(abstractC1969di);
        }
        return null;
    }
}
