package com.alibaba.p052a.p053a.p055b;

import android.content.Context;
import com.alibaba.p052a.p053a.C0910f;
import com.alibaba.p052a.p053a.p054a.C0880h;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p056c.C0892d;
import com.alibaba.p052a.p053a.p056c.C0893e;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p053a.p059f.C0913c;
import com.alibaba.p052a.p061b.p065d.C0960b;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.b.b */
/* loaded from: classes13.dex */
public class C0887b {
    static {
        Covode.recordClassIndex(4197);
    }

    /* renamed from: a */
    public static void m20440a(Context context, Throwable th) {
        if (th != null) {
            try {
                C0880h c0880h = (C0880h) C0889a.m20418a().m20415a(C0880h.class, new Object[0]);
                c0880h.f21178b = EnumC0877f.ALARM.m20485a();
                HashMap hashMap = new HashMap();
                hashMap.put("meta", C0910f.m20339a());
                C0892d c0892d = (C0892d) C0889a.m20418a().m20415a(C0892d.class, new Object[0]);
                c0892d.put(m20434b(context, th));
                hashMap.put(C2521l.LJIIL, c0892d);
                c0880h.f21182f.put(EnumC0877f.ALARM.m20478d(), new JSONObject(hashMap).toString());
                c0880h.f21179c = "APPMONITOR";
                c0880h.f21180d = "sdk-exception";
                C0913c.m20335a(c0880h);
                C0889a.m20418a().m20417a((C0889a) c0892d);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m20436a(Throwable th) {
        m20440a(null, th);
    }

    /* renamed from: b */
    public static String m20433b(Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(stackTraceElement.toString());
            }
        }
        String sb2 = sb.toString();
        return C0912b.m20336b(sb2) ? th.toString() : sb2;
    }

    /* renamed from: b */
    public static JSONObject m20434b(Context context, Throwable th) {
        JSONObject jSONObject = (JSONObject) C0889a.m20418a().m20415a(C0893e.class, new Object[0]);
        if (context != null) {
            try {
                jSONObject.put("pname", C0960b.m20138b(context));
            } catch (Exception unused) {
            }
        }
        jSONObject.put("page", "APPMONITOR");
        jSONObject.put("monitorPoint", "sdk-exception");
        jSONObject.put("arg", th.getClass().getSimpleName());
        jSONObject.put("successCount", 0);
        jSONObject.put("failCount", 1);
        ArrayList arrayList = new ArrayList();
        String m20433b = m20433b(th);
        if (m20433b != null) {
            JSONObject jSONObject2 = (JSONObject) C0889a.m20418a().m20415a(C0893e.class, new Object[0]);
            jSONObject2.put("errorCode", m20433b);
            jSONObject2.put("errorCount", 1);
            arrayList.add(jSONObject2);
        }
        jSONObject.put("errors", arrayList);
        return jSONObject;
    }
}
