package com.alibaba.p052a.p053a.p057d;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.d.a */
/* loaded from: classes13.dex */
public abstract class AbstractC0897a<T extends JSONObject> {

    /* renamed from: a */
    public int f21198a;

    static {
        Covode.recordClassIndex(4207);
    }

    public AbstractC0897a(int i) {
        this.f21198a = i;
    }

    /* renamed from: a */
    public void mo20402a(T t) {
        try {
            Integer valueOf = Integer.valueOf(t.getInt("sampling"));
            if (valueOf == null) {
                return;
            }
            this.f21198a = valueOf.intValue();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public boolean m20412a(int i) {
        return i < this.f21198a;
    }
}
