package com.alibaba.p052a.p053a.p054a;

import com.alibaba.p052a.p053a.p056c.AbstractC0890b;
import com.alibaba.p052a.p053a.p056c.C0889a;
import com.alibaba.p052a.p053a.p056c.C0893e;
import com.bytedance.covode.number.Covode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.a.d */
/* loaded from: classes13.dex */
public abstract class AbstractC0874d implements AbstractC0890b {

    /* renamed from: e */
    public String f21146e;

    /* renamed from: f */
    public String f21147f;

    /* renamed from: g */
    public String f21148g;

    /* renamed from: h */
    public int f21149h;

    static {
        Covode.recordClassIndex(4184);
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
        this.f21149h = ((Integer) objArr[0]).intValue();
        this.f21146e = (String) objArr[1];
        this.f21147f = (String) objArr[2];
        if (objArr.length <= 3 || objArr[3] == null) {
            return;
        }
        this.f21148g = (String) objArr[3];
    }

    /* renamed from: c */
    public JSONObject mo20471c() {
        JSONObject jSONObject = (JSONObject) C0889a.m20418a().m20415a(C0893e.class, new Object[0]);
        try {
            jSONObject.put("page", this.f21146e);
            jSONObject.put("monitorPoint", this.f21147f);
            if (this.f21148g != null) {
                jSONObject.put("arg", this.f21148g);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        this.f21149h = 0;
        this.f21146e = null;
        this.f21147f = null;
        this.f21148g = null;
    }
}
