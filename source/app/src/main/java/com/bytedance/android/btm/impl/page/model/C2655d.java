package com.bytedance.android.btm.impl.page.model;

import android.app.Activity;
import com.bytedance.android.btm.api.BtmHostDependManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C142371dzB;

/* renamed from: com.bytedance.android.btm.impl.page.model.d */
/* loaded from: classes18.dex */
public final class C2655d {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final C2654b LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public String f25638LJ;
    public boolean LJFF;
    public boolean LJI;

    static {
        Covode.recordClassIndex(11486);
    }

    public final List<C2654b> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return this.LIZJ.LIZ();
    }

    public final C2654b LIZ(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C2654b) proxy.result;
        }
        for (C2654b c2654b : LIZ()) {
            if (Intrinsics.areEqual(c2654b.LIZLLL.get(), obj)) {
                return c2654b;
            }
        }
        return null;
    }

    public C2655d(Activity activity) {
        String str;
        C106862S5w.LIZ(activity);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C142371dzB.f18874LJ, C142371dzB.LIZ, false, 2);
        if (proxy.isSupported) {
            str = (String) proxy.result;
        } else if (BtmHostDependManager.INSTANCE.getDebug()) {
            StringBuilder sb = new StringBuilder();
            sb.append(C142371dzB.LIZJ.incrementAndGet());
            str = sb.toString();
        } else {
            long incrementAndGet = C142371dzB.LIZJ.incrementAndGet();
            if (incrementAndGet > 10000) {
                C142371dzB.LIZJ.set(0L);
            }
            str = System.currentTimeMillis() + "_" + incrementAndGet;
        }
        this.LIZIZ = str;
        C2654b c2654b = new C2654b(activity);
        c2654b.LIZJ = this;
        this.LIZJ = c2654b;
        this.LIZLLL = true;
    }

    public final C2654b LIZ(String str) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C2654b) proxy.result;
        }
        if (str != null && str.length() != 0) {
            z = false;
        }
        if (z) {
            return null;
        }
        for (C2654b c2654b : LIZ()) {
            if (Intrinsics.areEqual(c2654b.LIZIZ, str)) {
                return c2654b;
            }
        }
        return null;
    }
}
