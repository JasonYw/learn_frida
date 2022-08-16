package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.amap.api.mapcore2d.n */
/* loaded from: classes19.dex */
public class C1765n {

    /* renamed from: a */
    public static C1765n f23994a = new C1765n();

    /* renamed from: b */
    public ArrayList<AbstractC1766a> f23995b = new ArrayList<>();

    /* renamed from: com.amap.api.mapcore2d.n$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1766a {
        static {
            Covode.recordClassIndex(5314);
        }

        /* renamed from: t */
        void mo17208t();
    }

    /* renamed from: a */
    public static C1765n m17212a() {
        return f23994a;
    }

    static {
        Covode.recordClassIndex(5313);
    }

    /* renamed from: b */
    public synchronized void m17210b() {
        Iterator<AbstractC1766a> it = this.f23995b.iterator();
        while (it.hasNext()) {
            AbstractC1766a next = it.next();
            if (next != null) {
                next.mo17208t();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m17211a(AbstractC1766a abstractC1766a) {
        if (abstractC1766a != null) {
            this.f23995b.add(abstractC1766a);
        }
    }

    /* renamed from: b */
    public synchronized void m17209b(AbstractC1766a abstractC1766a) {
        if (abstractC1766a != null) {
            this.f23995b.remove(abstractC1766a);
        }
    }
}
