package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC87952Kl8;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.p */
/* loaded from: classes5.dex */
public final class C3736p {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public String LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public final AbstractC87952Kl8 f26097LJ;

    static {
        Covode.recordClassIndex(21217);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZJ = str;
    }

    public C3736p(int i, String str, int i2, AbstractC87952Kl8 abstractC87952Kl8) {
        C106862S5w.LIZ(str, abstractC87952Kl8);
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = i2;
        this.f26097LJ = abstractC87952Kl8;
    }
}
