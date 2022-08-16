package com.alibaba.p052a.p053a.p060g;

import com.alibaba.p052a.p053a.p059f.C0911a;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.alibaba.a.a.g.l */
/* loaded from: classes13.dex */
public class C0934l extends C0921d {

    /* renamed from: b */
    public static final Set<EnumC0998a> f21258b = new HashSet<EnumC0998a>() { // from class: com.alibaba.a.a.g.l.1
        static {
            Covode.recordClassIndex(4245);
        }

        {
            add(EnumC0998a.PAGE);
            add(EnumC0998a.ARG1);
            add(EnumC0998a.ARG2);
            add(EnumC0998a.ARG3);
            add(EnumC0998a.ARGS);
        }
    };

    static {
        Covode.recordClassIndex(4244);
    }

    @Override // com.alibaba.p052a.p053a.p060g.C0921d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        super.mo20254a(objArr);
    }

    /* renamed from: c */
    public Integer m20253c() {
        int i;
        String str;
        if (this.f21237a != null && (str = this.f21237a.get(EnumC0998a.EVENTID.toString())) != null) {
            try {
                i = C0911a.m20338a(str);
            } catch (NumberFormatException unused) {
            }
            return Integer.valueOf(i);
        }
        i = 0;
        return Integer.valueOf(i);
    }

    @Override // com.alibaba.p052a.p053a.p060g.C0921d, com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        super.mo20252d();
    }
}
