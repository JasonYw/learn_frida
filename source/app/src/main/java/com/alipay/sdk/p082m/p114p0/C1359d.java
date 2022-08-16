package com.alipay.sdk.p082m.p114p0;

import android.database.ContentObserver;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.p0.d */
/* loaded from: classes2.dex */
public class C1359d extends ContentObserver {

    /* renamed from: a */
    public String f22339a;

    /* renamed from: b */
    public int f22340b;

    /* renamed from: c */
    public C1357c f22341c;

    static {
        Covode.recordClassIndex(4859);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        C1357c c1357c = this.f22341c;
        if (c1357c != null) {
            c1357c.m18999a(this.f22340b, this.f22339a);
        }
    }

    public C1359d(C1357c c1357c, int i, String str) {
        super(null);
        this.f22341c = c1357c;
        this.f22340b = i;
        this.f22339a = str;
    }
}
