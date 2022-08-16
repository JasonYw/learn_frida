package com.alipay.sdk.p082m.p100i0;

import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;

/* renamed from: com.alipay.sdk.m.i0.d */
/* loaded from: classes11.dex */
public class C1291d {

    /* renamed from: a */
    public String f22151a;

    /* renamed from: b */
    public int f22152b;

    /* renamed from: c */
    public long f22153c = System.currentTimeMillis() + C15151a.f30809f;

    static {
        Covode.recordClassIndex(4791);
    }

    public C1291d(String str, int i) {
        this.f22151a = str;
        this.f22152b = i;
    }

    public String toString() {
        return "ValueData{value='" + this.f22151a + "', code=" + this.f22152b + ", expired=" + this.f22153c + '}';
    }
}
