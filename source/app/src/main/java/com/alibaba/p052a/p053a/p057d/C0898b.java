package com.alibaba.p052a.p053a.p057d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.Set;

/* renamed from: com.alibaba.a.a.d.b */
/* loaded from: classes13.dex */
public class C0898b {

    /* renamed from: a */
    public Set<String> f21199a;

    /* renamed from: b */
    public EnumC0899a f21200b;

    /* renamed from: com.alibaba.a.a.d.b$a */
    /* loaded from: classes13.dex */
    public enum EnumC0899a {
        IN,
        NOT_IN;

        static {
            Covode.recordClassIndex(4209);
        }
    }

    static {
        Covode.recordClassIndex(4208);
    }

    /* renamed from: a */
    public boolean m20410a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean contains = this.f21199a.contains(str);
        return this.f21200b == EnumC0899a.IN ? contains : !contains;
    }
}
