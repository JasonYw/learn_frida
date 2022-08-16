package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashSet;
import java.util.Set;
import p003X.AbstractC87943Kkz;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.d */
/* loaded from: classes.dex */
public final class C3759d implements AbstractC87943Kkz {
    public static ChangeQuickRedirect LIZ;
    public final Set<String> LIZIZ = new LinkedHashSet();

    static {
        Covode.recordClassIndex(21334);
    }

    @Override // p003X.AbstractC87943Kkz
    public final Set<String> LIZ() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC87943Kkz
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZIZ.clear();
    }

    @Override // p003X.AbstractC87943Kkz
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZIZ.remove(str);
    }

    @Override // p003X.AbstractC87943Kkz
    public final boolean LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        return this.LIZIZ.contains(str);
    }

    @Override // p003X.AbstractC87943Kkz
    public final void LIZ(Set<String> set) {
        if (PatchProxy.proxy(new Object[]{set}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(set);
        this.LIZIZ.addAll(set);
    }

    @Override // p003X.AbstractC87943Kkz
    public final void LIZ(String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!z) {
            this.LIZIZ.clear();
        }
        if (this.LIZIZ.contains(str)) {
            return;
        }
        this.LIZIZ.add(str);
    }
}
