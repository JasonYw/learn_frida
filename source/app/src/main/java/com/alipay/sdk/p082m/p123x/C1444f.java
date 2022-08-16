package com.alipay.sdk.p082m.p123x;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: com.alipay.sdk.m.x.f */
/* loaded from: classes2.dex */
public class C1444f {

    /* renamed from: a */
    public Stack<C1434e> f22514a = new Stack<>();

    static {
        Covode.recordClassIndex(4945);
    }

    /* renamed from: b */
    public boolean m18675b() {
        return this.f22514a.isEmpty();
    }

    /* renamed from: c */
    public C1434e m18674c() {
        return this.f22514a.pop();
    }

    /* renamed from: a */
    public void m18677a() {
        if (m18675b()) {
            return;
        }
        Iterator<C1434e> it = this.f22514a.iterator();
        while (it.hasNext()) {
            it.next().m18705a();
        }
        this.f22514a.clear();
    }

    /* renamed from: a */
    public void m18676a(C1434e c1434e) {
        this.f22514a.push(c1434e);
    }
}
