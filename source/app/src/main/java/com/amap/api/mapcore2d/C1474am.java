package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.am */
/* loaded from: classes19.dex */
public class C1474am extends C1536bn<C1541bs> {
    static {
        Covode.recordClassIndex(5022);
    }

    /* renamed from: a */
    public synchronized void m18619a(C1541bs c1541bs) {
        remove(c1541bs);
    }

    /* renamed from: b */
    public synchronized boolean m18618b(C1541bs c1541bs) {
        if (contains(c1541bs)) {
            return false;
        }
        m18267a((C1474am) c1541bs);
        return true;
    }
}
