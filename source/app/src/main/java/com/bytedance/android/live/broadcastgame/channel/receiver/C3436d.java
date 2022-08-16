package com.bytedance.android.live.broadcastgame.channel.receiver;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.receiver.d */
/* loaded from: classes5.dex */
public final class C3436d implements AbstractC3337g {
    public static ChangeQuickRedirect LIZ;
    public final List<AbstractC3337g> LIZIZ;

    static {
        Covode.recordClassIndex(19541);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        for (AbstractC3337g abstractC3337g : this.LIZIZ) {
            abstractC3337g.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        for (AbstractC3337g abstractC3337g : this.LIZIZ) {
            abstractC3337g.LIZIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3436d(List<? extends AbstractC3337g> list) {
        C106862S5w.LIZ(list);
        this.LIZIZ = list;
    }
}
