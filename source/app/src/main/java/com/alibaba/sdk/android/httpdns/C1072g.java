package com.alibaba.sdk.android.httpdns;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alibaba.sdk.android.httpdns.g */
/* loaded from: classes19.dex */
public class C1072g {

    /* renamed from: b */
    public int f21610b;

    /* renamed from: e */
    public String f21611e;

    static {
        Covode.recordClassIndex(4478);
    }

    public C1072g(int i, String str) {
        this.f21610b = i;
        this.f21611e = new JSONObject(str).getString(C2521l.LJIIJ);
    }

    /* renamed from: b */
    public String m19885b() {
        return this.f21611e;
    }

    public int getErrorCode() {
        return this.f21610b;
    }
}
