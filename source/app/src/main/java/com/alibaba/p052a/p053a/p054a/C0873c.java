package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p060g.C0921d;
import com.alibaba.p052a.p053a.p060g.C0923e;
import com.alibaba.p052a.p053a.p060g.C0927g;
import com.alibaba.p052a.p053a.p060g.C0929h;
import com.alibaba.p052a.p053a.p060g.C0931i;
import com.alibaba.p052a.p053a.p060g.C0932j;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.a.a.a.c */
/* loaded from: classes13.dex */
public class C0873c extends AbstractC0874d {

    /* renamed from: a */
    public static final Long f21140a = Long.valueOf((long) Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL);

    /* renamed from: b */
    public C0931i f21141b;

    /* renamed from: c */
    public C0929h f21142c;

    /* renamed from: d */
    public C0921d f21143d;

    /* renamed from: i */
    public Map<String, C0927g> f21144i;

    /* renamed from: j */
    public Long f21145j;

    static {
        Covode.recordClassIndex(4183);
    }

    /* renamed from: a */
    public void m20510a(C0921d c0921d) {
        C0921d c0921d2 = this.f21143d;
        if (c0921d2 == null) {
            this.f21143d = c0921d;
        } else {
            c0921d2.m20315a(c0921d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m20509a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f21144i.isEmpty()) {
            this.f21145j = Long.valueOf(currentTimeMillis);
        }
        this.f21144i.put(str, C0889a.m20418a().m20415a(C0927g.class, Double.valueOf(currentTimeMillis), Double.valueOf(currentTimeMillis - this.f21145j.longValue())));
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        super.mo20254a(objArr);
        if (this.f21144i == null) {
            this.f21144i = new HashMap();
        }
        this.f21141b = C0932j.m20260a().m20258a(this.f21146e, this.f21147f);
        if (this.f21141b.m20263f() != null) {
            this.f21143d = (C0921d) C0889a.m20418a().m20415a(C0921d.class, new Object[0]);
            this.f21141b.m20263f().m20320b(this.f21143d);
        }
        this.f21142c = (C0929h) C0889a.m20418a().m20415a(C0929h.class, new Object[0]);
    }

    /* renamed from: a */
    public boolean m20511a() {
        long currentTimeMillis = System.currentTimeMillis();
        List<C0923e> m20295b = this.f21141b.m20262g().m20295b();
        if (m20295b != null) {
            int size = m20295b.size();
            for (int i = 0; i < size; i++) {
                C0923e c0923e = m20295b.get(i);
                if (c0923e != null) {
                    double doubleValue = c0923e.m20307a() != null ? c0923e.m20307a().doubleValue() : f21140a.longValue();
                    C0927g c0927g = this.f21144i.get(c0923e.m20304b());
                    if (c0927g != null && !c0927g.m20284c() && currentTimeMillis - c0927g.m20283e() > doubleValue) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public C0929h m20508b() {
        return this.f21142c;
    }

    /* renamed from: b */
    public boolean m20507b(String str) {
        C0927g c0927g = this.f21144i.get(str);
        if (c0927g != null) {
            double currentTimeMillis = System.currentTimeMillis();
            C0974i.m20098a("DurationEvent", "statEvent consumeTime. module:", this.f21146e, " monitorPoint:", this.f21147f, " measureName:", str, " time:", Double.valueOf(currentTimeMillis - c0927g.m20283e()));
            c0927g.m20285b(currentTimeMillis - c0927g.m20283e());
            c0927g.m20287a(true);
            this.f21142c.m20275a(str, c0927g);
            if (this.f21141b.m20262g().m20297a(this.f21142c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.alibaba.p052a.p053a.p054a.AbstractC0874d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        super.mo20252d();
        this.f21141b = null;
        this.f21145j = null;
        for (C0927g c0927g : this.f21144i.values()) {
            C0889a.m20418a().m20417a((C0889a) c0927g);
        }
        this.f21144i.clear();
        if (this.f21142c != null) {
            C0889a.m20418a().m20417a((C0889a) this.f21142c);
            this.f21142c = null;
        }
        if (this.f21143d != null) {
            C0889a.m20418a().m20417a((C0889a) this.f21143d);
            this.f21143d = null;
        }
    }

    /* renamed from: e */
    public C0921d m20506e() {
        return this.f21143d;
    }
}
