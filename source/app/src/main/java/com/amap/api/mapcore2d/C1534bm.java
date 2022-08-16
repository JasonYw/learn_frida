package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.amap.api.mapcore2d.bm */
/* loaded from: classes19.dex */
public class C1534bm {

    /* renamed from: a */
    public static C1534bm f23030a = new C1534bm();

    /* renamed from: b */
    public ArrayList<AbstractC1535a> f23031b = new ArrayList<>();

    /* renamed from: com.amap.api.mapcore2d.bm$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1535a {
        static {
            Covode.recordClassIndex(5083);
        }

        /* renamed from: u */
        void mo18268u();
    }

    /* renamed from: a */
    public static C1534bm m18271a() {
        return f23030a;
    }

    static {
        Covode.recordClassIndex(5082);
    }

    /* renamed from: b */
    public synchronized void m18269b() {
        Iterator<AbstractC1535a> it = this.f23031b.iterator();
        while (it.hasNext()) {
            AbstractC1535a next = it.next();
            if (next != null) {
                next.mo18268u();
            }
        }
    }

    /* renamed from: a */
    public synchronized void m18270a(AbstractC1535a abstractC1535a) {
        if (abstractC1535a != null) {
            this.f23031b.remove(abstractC1535a);
        }
    }
}
