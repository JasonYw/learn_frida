package com.alibaba.p052a.p053a.p056c;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alibaba.a.a.c.e */
/* loaded from: classes10.dex */
public class C0893e extends JSONObject implements AbstractC0890b {
    static {
        Covode.recordClassIndex(4203);
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: a */
    public void mo20254a(Object... objArr) {
    }

    @Override // com.alibaba.p052a.p053a.p056c.AbstractC0890b
    /* renamed from: d */
    public void mo20252d() {
        Iterator<String> keys = keys();
        if (keys != null) {
            while (keys.hasNext()) {
                try {
                    Object obj = get(keys.next());
                    if (obj != null && (obj instanceof AbstractC0890b)) {
                        C0889a.m20418a().m20417a((C0889a) ((AbstractC0890b) obj));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
