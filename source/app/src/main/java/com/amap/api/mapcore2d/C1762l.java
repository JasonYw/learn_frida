package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.amap.api.mapcore2d.l */
/* loaded from: classes19.dex */
public class C1762l {

    /* renamed from: a */
    public static C1762l f23989a = new C1762l();

    /* renamed from: b */
    public ArrayList<AbstractC1763a> f23990b = new ArrayList<>();

    /* renamed from: com.amap.api.mapcore2d.l$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1763a {
        static {
            Covode.recordClassIndex(5311);
        }

        /* renamed from: v */
        void mo17229v();
    }

    /* renamed from: a */
    public static C1762l m17233a() {
        return f23989a;
    }

    static {
        Covode.recordClassIndex(5310);
    }

    /* renamed from: b */
    public void m17231b() {
        Iterator<AbstractC1763a> it = this.f23990b.iterator();
        while (it.hasNext()) {
            AbstractC1763a next = it.next();
            if (next != null) {
                next.mo17229v();
            }
        }
    }

    /* renamed from: a */
    public void m17232a(AbstractC1763a abstractC1763a) {
        if (abstractC1763a != null) {
            this.f23990b.add(abstractC1763a);
        }
    }

    /* renamed from: b */
    public void m17230b(AbstractC1763a abstractC1763a) {
        if (abstractC1763a != null) {
            this.f23990b.remove(abstractC1763a);
        }
    }
}
