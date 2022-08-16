package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC87945Kl1;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.c */
/* loaded from: classes28.dex */
public final class C3758c implements AbstractC87945Kl1 {
    public static ChangeQuickRedirect LIZ;
    public final List<String> LIZIZ = new ArrayList();

    static {
        Covode.recordClassIndex(21333);
    }

    @Override // p003X.AbstractC87945Kl1
    public final List<String> LIZ() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC87945Kl1
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ.clear();
    }

    @Override // p003X.AbstractC87945Kl1
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (str.length() == 0) {
            return;
        }
        if (this.LIZIZ.contains(str)) {
            this.LIZIZ.remove(str);
        }
        this.LIZIZ.add(0, str);
    }

    @Override // p003X.AbstractC87945Kl1
    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (str.length() == 0) {
            return;
        }
        if (this.LIZIZ.contains(str)) {
            this.LIZIZ.remove(str);
        }
        this.LIZIZ.add(str);
    }

    @Override // p003X.AbstractC87945Kl1
    public final void LIZ(List<C3380j> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        if (this.LIZIZ.isEmpty()) {
            for (C3380j c3380j : list) {
                this.LIZIZ.add(c3380j.LIZLLL());
            }
            return;
        }
        for (C3380j c3380j2 : list) {
            String LIZLLL = c3380j2.LIZLLL();
            if (!this.LIZIZ.contains(LIZLLL)) {
                this.LIZIZ.add(LIZLLL);
            }
        }
    }

    @Override // p003X.AbstractC87945Kl1
    public final void LIZIZ(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZIZ.addAll(list);
    }
}
