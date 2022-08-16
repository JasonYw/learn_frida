package com.bytedance.android.live.profit.lottery;

import androidx.lifecycle.ViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import p003X.C106862S5w;
import p003X.C448893pD;

/* renamed from: com.bytedance.android.live.profit.lottery.v */
/* loaded from: classes12.dex */
public final class C5341v extends ViewModel implements AbstractC5327e {
    public static ChangeQuickRedirect LIZ;
    public final Map<Object, AbstractC5326d> LIZIZ = new LinkedHashMap();
    public boolean LIZJ;
    public final C448893pD LIZLLL;

    static {
        Covode.recordClassIndex(33541);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZJ = true;
        for (AbstractC5326d abstractC5326d : this.LIZIZ.values()) {
            abstractC5326d.LIZ();
        }
        this.LIZIZ.clear();
    }

    public C5341v(C448893pD c448893pD) {
        C106862S5w.LIZ(c448893pD);
        this.LIZLLL = c448893pD;
        this.LIZLLL.LJI().LIZ(new LotteryPluginStore$1(this));
    }

    @Override // com.bytedance.android.live.profit.lottery.AbstractC5327e
    public final void LIZ(AbstractC5326d abstractC5326d) {
        if (PatchProxy.proxy(new Object[]{abstractC5326d}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5326d);
        LIZ(abstractC5326d.getClass(), abstractC5326d);
    }

    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        for (AbstractC5326d abstractC5326d : this.LIZIZ.values()) {
            abstractC5326d.LIZ(map);
        }
    }

    private void LIZ(Object obj, AbstractC5326d abstractC5326d) {
        if (PatchProxy.proxy(new Object[]{obj, abstractC5326d}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj, abstractC5326d);
        if (this.LIZJ || this.LIZIZ.containsKey(obj)) {
            return;
        }
        this.LIZIZ.put(obj, abstractC5326d);
        abstractC5326d.LIZ(this.LIZLLL);
    }
}
