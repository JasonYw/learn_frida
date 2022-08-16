package com.alibaba.p052a.p053a.p060g;

import com.alibaba.p052a.p053a.p054a.AbstractC0874d;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.alibaba.a.a.g.k */
/* loaded from: classes13.dex */
public class C0933k implements AbstractC0890b {

    /* renamed from: a */
    public Map<C0931i, AbstractC0874d> f21257a = Collections.synchronizedMap(new HashMap());

    static {
        Covode.recordClassIndex(4243);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public AbstractC0874d m20255a(Integer num, String str, String str2, String str3, Class<? extends AbstractC0874d> cls) {
        Object m20415a;
        boolean z;
        AbstractC0874d abstractC0874d;
        if (num.intValue() == EnumC0877f.STAT.m20485a()) {
            m20415a = C0932j.m20260a().m20258a(str, str2);
            z = false;
        } else {
            m20415a = C0889a.m20418a().m20415a(C0931i.class, str, str2, str3);
            z = true;
        }
        AbstractC0874d abstractC0874d2 = null;
        if (m20415a != null) {
            if (!this.f21257a.containsKey(m20415a)) {
                synchronized (C0933k.class) {
                    abstractC0874d = (AbstractC0874d) C0889a.m20418a().m20415a(cls, num, str, str2, str3);
                    this.f21257a.put(m20415a, abstractC0874d);
                }
                return abstractC0874d;
            }
            abstractC0874d2 = this.f21257a.get(m20415a);
            if (z) {
                C0889a.m20418a().m20417a((C0889a) m20415a);
            }
        }
        return abstractC0874d2;
    }

    /* renamed from: a */
    public List<AbstractC0874d> m20256a() {
        return new ArrayList(this.f21257a.values());
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        if (this.f21257a == null) {
            this.f21257a = Collections.synchronizedMap(new HashMap());
        }
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        for (AbstractC0874d abstractC0874d : this.f21257a.values()) {
            C0889a.m20418a().m20417a((C0889a) abstractC0874d);
        }
        this.f21257a.clear();
    }
}
