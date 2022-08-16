package com.alipay.sdk.p082m.p110n0;

import android.content.Context;
import com.alipay.sdk.p082m.p106l0.C1322d;
import com.alipay.sdk.p082m.p106l0.C1326f;
import com.bytedance.covode.number.Covode;
import java.util.zip.Adler32;

/* renamed from: com.alipay.sdk.m.n0.c */
/* loaded from: classes13.dex */
public class C1340c {

    /* renamed from: a */
    public static C1339b f22288a;

    /* renamed from: b */
    public static final Object f22289b = new Object();

    static {
        Covode.recordClassIndex(4840);
    }

    /* renamed from: b */
    public static synchronized C1339b m19052b(Context context) {
        synchronized (C1340c.class) {
            C1339b c1339b = f22288a;
            if (c1339b != null) {
                return c1339b;
            }
            if (context != null) {
                C1339b m19054a = m19054a(context);
                f22288a = m19054a;
                return m19054a;
            }
            return null;
        }
    }

    /* renamed from: a */
    public static long m19053a(C1339b c1339b) {
        if (c1339b != null) {
            String format = String.format("%s%s%s%s%s", c1339b.m19059c(), c1339b.m19057d(), Long.valueOf(c1339b.m19065a()), c1339b.m19055e(), c1339b.m19062b());
            if (!C1326f.m19144a(format)) {
                Adler32 adler32 = new Adler32();
                adler32.reset();
                adler32.update(format.getBytes());
                return adler32.getValue();
            }
            return 0L;
        }
        return 0L;
    }

    /* renamed from: a */
    public static C1339b m19054a(Context context) {
        if (context != null) {
            synchronized (f22289b) {
                String m19047b = C1341d.m19050a(context).m19047b();
                if (!C1326f.m19144a(m19047b)) {
                    if (m19047b.endsWith("\n")) {
                        m19047b = m19047b.substring(0, m19047b.length() - 1);
                    }
                    C1339b c1339b = new C1339b();
                    long currentTimeMillis = System.currentTimeMillis();
                    String m19152a = C1322d.m19152a(context);
                    String m19150b = C1322d.m19150b(context);
                    c1339b.m19058c(m19152a);
                    c1339b.m19063a(m19152a);
                    c1339b.m19061b(currentTimeMillis);
                    c1339b.m19060b(m19150b);
                    c1339b.m19056d(m19047b);
                    c1339b.m19064a(m19053a(c1339b));
                    return c1339b;
                }
                return null;
            }
        }
        return null;
    }
}
