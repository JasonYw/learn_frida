package com.alibaba.p052a.p053a.p058e;

import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0992t;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.alibaba.a.a.e.a */
/* loaded from: classes13.dex */
public class C0909a {

    /* renamed from: a */
    public static final String f21225a = null;

    /* renamed from: b */
    public static C0909a f21226b;

    static {
        Covode.recordClassIndex(4219);
    }

    /* renamed from: a */
    public static synchronized C0909a m20341a() {
        C0909a c0909a;
        synchronized (C0909a.class) {
            if (f21226b == null) {
                f21226b = new C0909a();
            }
            c0909a = f21226b;
        }
        return c0909a;
    }

    /* renamed from: a */
    public void m20340a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        C0974i.m20098a(f21225a, "[sendToUT]:", " args:", map);
        if (C0941a.f21280h) {
            C0941a.m20235a(map.get(EnumC0998a.PAGE.toString()), map.get(EnumC0998a.EVENTID.toString()), map.get(EnumC0998a.ARG1.toString()), map.get(EnumC0998a.ARG2.toString()), map.get(EnumC0998a.ARG3.toString()), map);
            return;
        }
        map.put("_fuamf", "yes");
        C0992t.m20053a(map);
    }
}
