package com.alipay.sdk.p082m.p100i0;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.i0.c */
/* loaded from: classes18.dex */
public class C1290c {

    /* renamed from: a */
    public String f22149a;

    /* renamed from: b */
    public Boolean f22150b;

    static {
        Covode.recordClassIndex(4790);
    }

    /* renamed from: a */
    public void m19259a(boolean z) {
        this.f22150b = Boolean.valueOf(z);
    }

    /* renamed from: a */
    public boolean m19261a() {
        return this.f22150b != null;
    }

    /* renamed from: a */
    public boolean m19260a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f22149a, str);
    }

    /* renamed from: b */
    public void m19257b(String str) {
        this.f22149a = str;
    }

    /* renamed from: b */
    public boolean m19258b() {
        Boolean bool = this.f22150b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
