package com.bytedance.android.live.core.p314d;

import android.app.Activity;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC134533bwO;
import p003X.AbstractC134537bwS;
import p003X.AbstractC134538bwT;
import p003X.AbstractC144461eWt;
import p003X.C6GV;

/* renamed from: com.bytedance.android.live.core.d.b$a */
/* loaded from: classes19.dex */
public class b$a {
    public static ChangeQuickRedirect LIZ;
    public String[] LIZIZ;
    public String[] LIZJ = new String[0];
    public AbstractC134537bwS LIZLLL;

    /* renamed from: LJ */
    public Runnable f26166LJ;
    public Runnable LJFF;
    public AbstractC144461eWt LJI;
    public AbstractC134538bwT LJII;
    public AbstractC134537bwS LJIIIIZZ;

    static {
        Covode.recordClassIndex(23416);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.f26166LJ.run();
        C6GV.LIZ().LIZJ(this.LIZIZ, this.LIZJ);
    }

    public final void LIZJ() {
        AbstractC134538bwT abstractC134538bwT;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (abstractC134538bwT = this.LJII) != null) {
            abstractC134538bwT.LIZ();
        }
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJI.LIZIZ(this.LIZIZ);
        C6GV.LIZ().LIZ(this.LIZIZ, this.LIZJ);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJI.LIZ(this.LIZIZ);
        C6GV.LIZ().LIZ(this.LIZIZ);
        if (z) {
            this.LJFF.run();
            C6GV.LIZ().LIZIZ(this.LIZIZ, this.LIZJ);
        }
    }

    public final void LIZ(Activity activity, AbstractC134533bwO abstractC134533bwO) {
        if (PatchProxy.proxy(new Object[]{activity, abstractC134533bwO}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIIIIZZ.LIZ(activity, abstractC134533bwO, this.LIZIZ, this.LIZJ);
    }

    public b$a(String[] strArr, Runnable runnable, AbstractC144461eWt abstractC144461eWt, AbstractC134538bwT abstractC134538bwT, AbstractC134537bwS abstractC134537bwS, Runnable runnable2, AbstractC134537bwS abstractC134537bwS2, Cert cert) {
        this.LIZIZ = strArr;
        this.f26166LJ = runnable;
        this.LJFF = runnable2;
        this.LJI = abstractC144461eWt;
        this.LJII = abstractC134538bwT;
        this.LIZLLL = abstractC134537bwS;
        this.LJIIIIZZ = abstractC134537bwS2;
    }
}
