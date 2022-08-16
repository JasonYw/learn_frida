package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* renamed from: com.amap.api.mapcore2d.fc */
/* loaded from: classes19.dex */
public class C1692fc {

    /* renamed from: a */
    public static WeakReference<C1690fa> f23592a;

    static {
        Covode.recordClassIndex(5240);
    }

    /* renamed from: a */
    public static void m17543a(final Context context) {
        C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.fc.1
            static {
                Covode.recordClassIndex(5241);
            }

            @Override // java.lang.Runnable
            public final void run() {
                synchronized (C1692fc.class) {
                    C1690fa m17520a = C1702fh.m17520a(C1692fc.f23592a);
                    C1702fh.m17523a(context, m17520a, C1613dm.f23358j, 50, 102400, "10");
                    if (m17520a.f23589g == null) {
                        m17520a.f23589g = new C1706fl(new C1705fk(context, new C1710fp(), new C1605de(new C1609di(new C1607dg())), "WImFwcG5hbWUiOiIlcyIsInBrZyI6IiVzIiwiZGl1IjoiJXMi", C1573cq.m18123b(context), C1573cq.m18121c(context), C1692fc.m17541c(context)));
                    }
                    m17520a.f23590h = 14400000;
                    if (TextUtils.isEmpty(m17520a.f23591i)) {
                        m17520a.f23591i = "eKey";
                    }
                    if (m17520a.f23588f == null) {
                        m17520a.f23588f = new C1714ft(context, m17520a.f23590h, m17520a.f23591i, new C1711fq(5, m17520a.f23583a, new C1716fv(context, false)));
                    }
                    C1691fb.m17546a(m17520a);
                }
            }
        });
    }

    /* renamed from: c */
    public static String m17541c(Context context) {
        String m18031v = C1587cu.m18031v(context);
        if (!TextUtils.isEmpty(m18031v)) {
            return m18031v;
        }
        String m18045h = C1587cu.m18045h(context);
        if (!TextUtils.isEmpty(m18045h)) {
            return m18045h;
        }
        String m18040m = C1587cu.m18040m(context);
        if (!TextUtils.isEmpty(m18040m)) {
            return m18040m;
        }
        return C1587cu.m18067b(context);
    }
}
