package com.bytedance.android.btm.impl.page.model;

import com.bytedance.android.btm.api.BtmHostDependManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;
import p003X.C142369dz9;
import p003X.C142371dzB;

/* renamed from: com.bytedance.android.btm.impl.page.model.b */
/* loaded from: classes18.dex */
public final class C2654b {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public C2655d LIZJ;
    public final C142369dz9<Object> LIZLLL;

    /* renamed from: LJ */
    public int f25637LJ;
    public boolean LJFF;
    public boolean LJI;
    public C2654b LJII;
    public List<C2654b> LJIIIIZZ;
    public C2654b LJIIIZ;

    static {
        Covode.recordClassIndex(11484);
    }

    public final List<C2654b> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (C2654b c2654b : this.LJIIIIZZ) {
            arrayList.addAll(c2654b.LIZ());
        }
        return arrayList;
    }

    public C2654b(Object obj) {
        String str;
        C106862S5w.LIZ(obj);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C142371dzB.f18874LJ, C142371dzB.LIZ, false, 3);
        if (proxy.isSupported) {
            str = (String) proxy.result;
        } else if (BtmHostDependManager.INSTANCE.getDebug()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C142371dzB.LIZLLL.incrementAndGet());
            str = sb.toString();
        } else {
            long incrementAndGet = C142371dzB.LIZLLL.incrementAndGet();
            if (incrementAndGet > 10000) {
                C142371dzB.LIZLLL.set(0L);
            }
            str = System.currentTimeMillis() + "_" + incrementAndGet;
        }
        this.LIZIZ = str;
        this.LIZLLL = new C142369dz9<>(obj);
        this.LJIIIIZZ = new ArrayList();
    }

    public final void LIZ(C2654b c2654b) {
        if (!PatchProxy.proxy(new Object[]{c2654b}, this, LIZ, false, 1).isSupported && c2654b != null) {
            c2654b.LJIIIIZZ.add(this);
            this.LJII = c2654b;
            this.f25637LJ = c2654b.f25637LJ + 1;
            this.LIZJ = c2654b.LIZJ;
        }
    }
}
