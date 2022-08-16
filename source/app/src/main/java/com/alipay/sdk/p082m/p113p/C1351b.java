package com.alipay.sdk.p082m.p113p;

import android.text.TextUtils;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.m.p.b */
/* loaded from: classes2.dex */
public final class C1351b {

    /* renamed from: a */
    public final String f22308a;

    /* renamed from: b */
    public final String f22309b;

    static {
        Covode.recordClassIndex(4851);
    }

    /* renamed from: a */
    public final String m19021a() {
        return this.f22309b;
    }

    /* renamed from: b */
    public final String m19020b() {
        return this.f22308a;
    }

    /* renamed from: c */
    public final JSONObject m19019c() {
        if (TextUtils.isEmpty(this.f22309b)) {
            return null;
        }
        try {
            return new JSONObject(this.f22309b);
        } catch (Exception e) {
            C1385e.m18866a(e);
            return null;
        }
    }

    public final String toString() {
        return String.format("<Letter envelop=%s body=%s>", this.f22308a, this.f22309b);
    }

    public C1351b(String str, String str2) {
        this.f22308a = str;
        this.f22309b = str2;
    }
}
