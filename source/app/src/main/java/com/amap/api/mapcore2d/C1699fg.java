package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import java.util.Random;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.fg */
/* loaded from: classes19.dex */
public class C1699fg {

    /* renamed from: a */
    public static WeakReference<C1690fa> f23610a;

    static {
        Covode.recordClassIndex(5247);
    }

    /* renamed from: a */
    public static void m17529a(final Context context) {
        C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.fg.2
            static {
                Covode.recordClassIndex(5249);
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C1690fa m17520a = C1702fh.m17520a(C1699fg.f23610a);
                    C1702fh.m17523a(context, m17520a, C1613dm.f23356h, 1000, 307200, "2");
                    if (m17520a.f23589g == null) {
                        m17520a.f23589g = new C1703fi(new C1707fm(context, new C1704fj(new C1708fn(new C1710fp()))));
                    }
                    m17520a.f23590h = 3600000;
                    if (TextUtils.isEmpty(m17520a.f23591i)) {
                        m17520a.f23591i = "cKey";
                    }
                    if (m17520a.f23588f == null) {
                        m17520a.f23588f = new C1714ft(context, m17520a.f23590h, m17520a.f23591i, new C1711fq(30, m17520a.f23583a, new C1716fv(context, false)));
                    }
                    C1691fb.m17546a(m17520a);
                } catch (Throwable th) {
                    C1616do.m17866c(th, "stm", "usd");
                }
            }
        });
    }

    /* renamed from: a */
    public static synchronized void m17527a(final C1698ff c1698ff, final Context context) {
        synchronized (C1699fg.class) {
            C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.fg.1
                static {
                    Covode.recordClassIndex(5248);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        synchronized (C1699fg.class) {
                            C1699fg.m17526b(context, c1698ff.m17534a());
                        }
                    } catch (Throwable th) {
                        C1616do.m17866c(th, "stm", "as");
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public static void m17526b(Context context, byte[] bArr) {
        C1690fa m17520a = C1702fh.m17520a(f23610a);
        C1702fh.m17523a(context, m17520a, C1613dm.f23356h, 1000, 307200, "2");
        if (m17520a.f23587e == null) {
            m17520a.f23587e = new C1608dh();
        }
        Random random = new Random();
        new StringBuilder();
        try {
            C1691fb.m17544a(C0002O.m25086C(Integer.toString(random.nextInt(100)), Long.toString(System.nanoTime())), bArr, m17520a);
        } catch (Throwable th) {
            C1616do.m17866c(th, "stm", "wts");
        }
    }
}
