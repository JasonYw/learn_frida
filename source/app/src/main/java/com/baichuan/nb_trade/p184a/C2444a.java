package com.baichuan.nb_trade.p184a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.baichuan.nb_trade.a.a */
/* loaded from: classes13.dex */
public final class C2444a {
    public static volatile C2444a LIZIZ;
    public boolean LIZ;

    /* renamed from: com.baichuan.nb_trade.a.a$a */
    /* loaded from: classes13.dex */
    public class C2445a {
        public int LIZ;

        static {
            Covode.recordClassIndex(9453);
        }

        public C2445a(C2444a c2444a, int i) {
            this.LIZ = i;
        }
    }

    static {
        Covode.recordClassIndex(9452);
    }

    public static synchronized C2444a LIZ() {
        C2444a c2444a;
        synchronized (C2444a.class) {
            if (LIZIZ == null) {
                LIZIZ = new C2444a();
            }
            c2444a = LIZIZ;
        }
        return c2444a;
    }
}
