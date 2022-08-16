package com.alipay.sdk.p082m.p115q;

import android.content.Context;
import com.alipay.sdk.p082m.p099i.C1287a;
import com.alipay.sdk.p082m.p109n.C1334b;
import com.alipay.sdk.p082m.p111o.C1344a;
import com.alipay.sdk.p082m.p113p.AbstractC1354e;
import com.alipay.sdk.p082m.p113p.C1351b;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import com.umeng.message.proguard.C34037f;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.q.e */
/* loaded from: classes2.dex */
public class C1365e extends AbstractC1354e {
    static {
        Covode.recordClassIndex(4865);
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public String mo18976a(C1376a c1376a, String str, JSONObject jSONObject) {
        return str;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public JSONObject mo18974a() {
        return null;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: c */
    public boolean mo18973c() {
        return false;
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public Map<String, String> mo18975a(boolean z, String str) {
        return new HashMap();
    }

    @Override // com.alipay.sdk.p082m.p113p.AbstractC1354e
    /* renamed from: a */
    public C1351b mo18977a(C1376a c1376a, Context context, String str) {
        C1385e.m18862d("mspl", "mdap post");
        byte[] m19078a = C1334b.m19078a(str.getBytes(Charset.forName(C34037f.f43302f)));
        HashMap hashMap = new HashMap();
        hashMap.put("utdId", C1378b.m18915d().m18916c());
        hashMap.put("logHeader", "RAW");
        hashMap.put("bizCode", "alipaysdk");
        hashMap.put("productId", "alipaysdk_android");
        hashMap.put("Content-Encoding", "Gzip");
        hashMap.put("productVersion", C1287a.f22143g);
        C1344a.C1346b m19035a = C1344a.m19035a(context, new C1344a.C1345a("https://loggw-exsdk.alipay.com/loggw/logUpload.do", hashMap, m19078a));
        C1385e.m18862d("mspl", "mdap got " + m19035a);
        if (m19035a != null) {
            boolean m19008a = AbstractC1354e.m19008a(m19035a);
            try {
                byte[] bArr = m19035a.f22307c;
                if (m19008a) {
                    bArr = C1334b.m19077b(bArr);
                }
                return new C1351b("", new String(bArr, Charset.forName(C34037f.f43302f)));
            } catch (Exception e) {
                C1385e.m18866a(e);
                return null;
            }
        }
        throw new RuntimeException("Response is null");
    }
}
