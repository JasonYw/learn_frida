package com.alibaba.p052a.p053a.p059f;

import com.alibaba.p052a.p053a.C0910f;
import com.alibaba.p052a.p053a.p054a.AbstractC0874d;
import com.alibaba.p052a.p053a.p054a.C0880h;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p056c.C0892d;
import com.alibaba.p052a.p053a.p058e.C0909a;
import com.alibaba.p052a.p053a.p060g.C0934l;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.f.c */
/* loaded from: classes13.dex */
public class C0913c {
    static {
        Covode.recordClassIndex(4223);
    }

    /* renamed from: a */
    public static void m20335a(C0880h c0880h) {
        if (c0880h == null) {
            return;
        }
        C0941a.m20235a(c0880h.f21177a, String.valueOf(c0880h.f21178b), c0880h.f21179c, c0880h.f21180d, c0880h.f21181e, c0880h.f21182f);
        C0889a.m20418a().m20417a((C0889a) c0880h);
    }

    /* renamed from: a */
    public static void m20334a(C0934l c0934l, AbstractC0874d abstractC0874d) {
        Integer m20253c = c0934l.m20253c();
        if (m20253c != null) {
            EnumC0877f m20481b = EnumC0877f.m20481b(m20253c.intValue());
            C0880h c0880h = (C0880h) C0889a.m20418a().m20415a(C0880h.class, new Object[0]);
            c0880h.f21178b = 6699;
            if (c0934l.m20311b() != null) {
                c0880h.f21182f.putAll(c0934l.m20311b());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("meta", C0910f.m20339a());
            hashMap.put("_event_id", m20253c);
            C0892d c0892d = (C0892d) C0889a.m20418a().m20415a(C0892d.class, new Object[0]);
            c0892d.put(abstractC0874d.mo20471c());
            C0889a.m20418a().m20417a((C0889a) abstractC0874d);
            hashMap.put(C2521l.LJIIL, c0892d);
            c0880h.f21182f.put(m20481b.m20478d(), new JSONObject(hashMap).toString());
            c0880h.f21182f.put(EnumC0998a.EVENTID.toString(), "6699");
            m20332b(c0880h);
            C0889a.m20418a().m20417a((C0889a) c0892d);
        }
    }

    /* renamed from: a */
    public static void m20333a(Map<C0934l, List<AbstractC0874d>> map) {
        Integer m20253c;
        for (Map.Entry<C0934l, List<AbstractC0874d>> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            C0934l key = entry.getKey();
            List<AbstractC0874d> value = entry.getValue();
            if (value.size() != 0 && (m20253c = key.m20253c()) != null) {
                EnumC0877f m20481b = EnumC0877f.m20481b(m20253c.intValue());
                int i = 0;
                C0880h c0880h = (C0880h) C0889a.m20418a().m20415a(C0880h.class, new Object[0]);
                c0880h.f21178b = m20253c.intValue();
                if (key.m20311b() != null) {
                    c0880h.f21182f.putAll(key.m20311b());
                }
                HashMap hashMap = new HashMap();
                hashMap.put("meta", C0910f.m20339a());
                C0892d c0892d = (C0892d) C0889a.m20418a().m20415a(C0892d.class, new Object[0]);
                for (AbstractC0874d abstractC0874d : value) {
                    c0892d.put(abstractC0874d.mo20471c());
                    if (i == 0) {
                        sb.append(abstractC0874d.f21146e);
                    } else {
                        sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                        sb.append(abstractC0874d.f21146e);
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(abstractC0874d.f21147f);
                    i++;
                    C0889a.m20418a().m20417a((C0889a) abstractC0874d);
                }
                hashMap.put(C2521l.LJIIL, c0892d);
                c0880h.f21182f.put(m20481b.m20478d(), new JSONObject(hashMap).toString());
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                c0880h.f21182f.put(EnumC0998a.ARG1.toString(), sb3);
                c0880h.f21182f.put(EnumC0998a.ARG2.toString(), sb4);
                c0880h.f21179c = sb3;
                c0880h.f21180d = sb4;
                m20332b(c0880h);
                C0889a.m20418a().m20417a((C0889a) c0892d);
            }
            C0889a.m20418a().m20417a((C0889a) key);
        }
    }

    /* renamed from: b */
    public static void m20332b(C0880h c0880h) {
        C0974i.m20098a("UTUtil", "upload without flowback. args:", c0880h.f21182f);
        C0909a.m20341a().m20340a(c0880h.f21182f);
        C0889a.m20418a().m20417a((C0889a) c0880h);
    }
}
