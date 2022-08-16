package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p059f.C0912b;
import com.alibaba.p052a.p053a.p059f.C0913c;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.alibaba.p052a.p053a.p060g.C0929h;
import com.alibaba.p052a.p053a.p060g.C0931i;
import com.alibaba.p052a.p053a.p060g.C0932j;
import com.alibaba.p052a.p053a.p060g.C0933k;
import com.alibaba.p052a.p053a.p060g.C0934l;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p062a.C0942a;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0989s;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alibaba.a.a.a.e */
/* loaded from: classes13.dex */
public class C0875e {

    /* renamed from: c */
    public static C0875e f21150c;

    /* renamed from: d */
    public AtomicInteger f21153d = new AtomicInteger(0);

    /* renamed from: e */
    public AtomicInteger f21154e = new AtomicInteger(0);

    /* renamed from: f */
    public AtomicInteger f21155f = new AtomicInteger(0);

    /* renamed from: b */
    public Map<C0934l, C0933k> f21152b = new ConcurrentHashMap();

    /* renamed from: a */
    public Map<String, C0873c> f21151a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(4185);
    }

    /* renamed from: a */
    private AbstractC0874d m20495a(C0934l c0934l, String str, String str2, String str3, Class<? extends AbstractC0874d> cls) {
        Integer m20253c;
        C0933k c0933k;
        if (!C0912b.m20337a(str) || !C0912b.m20337a(str2) || (m20253c = c0934l.m20253c()) == null) {
            return null;
        }
        synchronized (this.f21152b) {
            c0933k = this.f21152b.get(c0934l);
            if (c0933k == null) {
                c0933k = (C0933k) C0889a.m20418a().m20415a(C0933k.class, new Object[0]);
                this.f21152b.put(c0934l, c0933k);
            }
        }
        return c0933k.m20255a(m20253c, str, str2, str3, cls);
    }

    /* renamed from: a */
    public static synchronized C0875e m20503a() {
        C0875e c0875e;
        synchronized (C0875e.class) {
            if (f21150c == null) {
                f21150c = new C0875e();
            }
            c0875e = f21150c;
        }
        return c0875e;
    }

    /* renamed from: a */
    private C0934l m20497a(int i, Map<String, String> map) {
        C0934l c0934l = (C0934l) C0889a.m20418a().m20415a(C0934l.class, new Object[0]);
        if (map != null) {
            c0934l.m20312a(map);
        }
        c0934l.m20313a(EnumC0998a.ACCESS.toString(), C0941a.m20231e());
        c0934l.m20313a(EnumC0998a.ACCESS_SUBTYPE.toString(), C0941a.m20230f());
        c0934l.m20313a(EnumC0998a.USERID.toString(), C0941a.m20229g());
        c0934l.m20313a(EnumC0998a.USERNICK.toString(), C0941a.m20228h());
        c0934l.m20313a(EnumC0998a.EVENTID.toString(), String.valueOf(i));
        return c0934l;
    }

    /* renamed from: a */
    private String m20491a(String str, String str2) {
        C0931i m20258a = C0932j.m20260a().m20258a(str, str2);
        if (m20258a != null) {
            return m20258a.m20270a();
        }
        return null;
    }

    /* renamed from: a */
    private void m20496a(EnumC0877f enumC0877f, AtomicInteger atomicInteger) {
        int incrementAndGet = atomicInteger.incrementAndGet();
        C0974i.m20097a("EventRepo", enumC0877f.toString(), " EVENT size:", String.valueOf(incrementAndGet));
        if (incrementAndGet >= enumC0877f.m20480c()) {
            C0974i.m20098a("EventRepo", enumC0877f.toString(), " event size exceed trigger count.");
            atomicInteger.set(0);
            m20487b(enumC0877f.m20485a());
        }
    }

    /* renamed from: b */
    private void m20486b(String str, String str2) {
        C0931i m20258a = C0932j.m20260a().m20258a(str, str2);
        if (m20258a != null) {
            m20258a.m20266b();
        }
    }

    /* renamed from: a */
    public Map<C0934l, List<AbstractC0874d>> m20502a(int i) {
        HashMap hashMap = new HashMap();
        synchronized (this.f21152b) {
            ArrayList arrayList = new ArrayList(this.f21152b.keySet());
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0934l c0934l = (C0934l) arrayList.get(i2);
                if (c0934l != null && c0934l.m20253c().intValue() == i) {
                    hashMap.put(c0934l, this.f21152b.get(c0934l).m20256a());
                    this.f21152b.remove(c0934l);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public void m20501a(int i, String str, String str2, C0929h c0929h, C0921d c0921d, Map<String, String> map) {
        C0931i m20258a = C0932j.m20260a().m20258a(str, str2);
        if (m20258a == null) {
            C0974i.m20100a("EventRepo", "metric is null");
            return;
        }
        if (m20258a.m20263f() != null) {
            m20258a.m20263f().m20320b(c0921d);
        }
        if (m20258a.m20262g() != null) {
            m20258a.m20262g().m20294b(c0929h);
        }
        C0934l m20497a = m20497a(i, map);
        ((C0878g) m20495a(m20497a, str, str2, (String) null, C0878g.class)).m20472a(c0921d, c0929h);
        if (C0942a.m20221b()) {
            C0878g c0878g = (C0878g) C0889a.m20418a().m20415a(C0878g.class, Integer.valueOf(i), str, str2);
            c0878g.m20472a(c0921d, c0929h);
            C0913c.m20334a(m20497a, c0878g);
        }
        m20496a(EnumC0877f.m20481b(i), this.f21155f);
    }

    /* renamed from: a */
    public void m20500a(int i, String str, String str2, String str3, double d, Map<String, String> map) {
        C0934l m20497a = m20497a(i, map);
        ((C0872b) m20495a(m20497a, str, str2, str3, C0872b.class)).m20512a(d);
        if (C0942a.m20221b()) {
            C0872b c0872b = (C0872b) C0889a.m20418a().m20415a(C0872b.class, Integer.valueOf(i), str, str2, str3);
            c0872b.m20512a(d);
            C0913c.m20334a(m20497a, c0872b);
        }
        m20496a(EnumC0877f.m20481b(i), this.f21154e);
    }

    /* renamed from: a */
    public void m20499a(int i, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        C0934l m20497a = m20497a(i, map);
        C0871a c0871a = (C0871a) m20495a(m20497a, str, str2, str3, C0871a.class);
        c0871a.m20513b();
        c0871a.m20514a(str4, str5);
        if (C0942a.m20221b()) {
            C0871a c0871a2 = (C0871a) C0889a.m20418a().m20415a(C0871a.class, Integer.valueOf(i), str, str2, str3);
            c0871a2.m20513b();
            c0871a2.m20514a(str4, str5);
            C0913c.m20334a(m20497a, c0871a2);
        }
        m20496a(EnumC0877f.m20481b(i), this.f21153d);
    }

    /* renamed from: a */
    public void m20498a(int i, String str, String str2, String str3, Map<String, String> map) {
        C0934l m20497a = m20497a(i, map);
        ((C0871a) m20495a(m20497a, str, str2, str3, C0871a.class)).m20516a();
        if (C0942a.m20221b()) {
            C0871a c0871a = (C0871a) C0889a.m20418a().m20415a(C0871a.class, Integer.valueOf(i), str, str2, str3);
            c0871a.m20516a();
            C0913c.m20334a(m20497a, c0871a);
        }
        m20496a(EnumC0877f.m20481b(i), this.f21153d);
    }

    /* renamed from: a */
    public void m20494a(Integer num, String str, String str2, String str3) {
        String m20491a = m20491a(str, str2);
        if (m20491a != null) {
            m20492a(m20491a, num, str, str2, str3);
        }
    }

    /* renamed from: a */
    public void m20493a(String str, Integer num, String str2, String str3, C0921d c0921d) {
        C0873c c0873c;
        synchronized (C0873c.class) {
            c0873c = this.f21151a.get(str);
            if (c0873c == null) {
                c0873c = (C0873c) C0889a.m20418a().m20415a(C0873c.class, num, str2, str3);
                this.f21151a.put(str, c0873c);
            }
        }
        c0873c.m20510a(c0921d);
    }

    /* renamed from: a */
    public void m20492a(String str, Integer num, String str2, String str3, String str4) {
        C0873c c0873c;
        C0931i m20258a = C0932j.m20260a().m20258a(str2, str3);
        if (m20258a == null || m20258a.m20262g() == null || m20258a.m20262g().m20296a(str4) == null) {
            return;
        }
        synchronized (C0873c.class) {
            c0873c = this.f21151a.get(str);
            if (c0873c == null) {
                c0873c = (C0873c) C0889a.m20418a().m20415a(C0873c.class, num, str2, str3);
                this.f21151a.put(str, c0873c);
            }
        }
        c0873c.m20509a(str4);
    }

    /* renamed from: a */
    public void m20490a(String str, String str2, String str3) {
        String m20491a = m20491a(str, str2);
        if (m20491a != null) {
            m20489a(m20491a, str3, true, (Map<String, String>) null);
        }
    }

    /* renamed from: a */
    public void m20489a(String str, String str2, boolean z, Map<String, String> map) {
        C0873c c0873c = this.f21151a.get(str);
        if (c0873c == null || !c0873c.m20507b(str2)) {
            return;
        }
        this.f21151a.remove(str);
        if (z) {
            m20486b(c0873c.f21146e, c0873c.f21147f);
        }
        m20501a(c0873c.f21149h, c0873c.f21146e, c0873c.f21147f, c0873c.m20508b(), c0873c.m20506e(), map);
        C0889a.m20418a().m20417a((C0889a) c0873c);
    }

    /* renamed from: b */
    public void m20488b() {
        ArrayList arrayList = new ArrayList(this.f21151a.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            C0873c c0873c = this.f21151a.get(obj);
            if (c0873c != null && c0873c.m20511a()) {
                this.f21151a.remove(obj);
            }
        }
    }

    /* renamed from: b */
    public void m20487b(int i) {
        final Map<C0934l, List<AbstractC0874d>> m20502a = m20502a(i);
        C0989s.m20062a().m20058a(new Runnable() { // from class: com.alibaba.a.a.a.e.1
            static {
                Covode.recordClassIndex(4186);
            }

            @Override // java.lang.Runnable
            public void run() {
                C0913c.m20333a(m20502a);
            }
        });
    }
}
