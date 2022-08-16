package com.bytedance.android.live.broadcastgame.channel.p288a;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.a.e */
/* loaded from: classes5.dex */
public final class C3426e implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC3341h.AbstractC3342a LIZIZ;

    static {
        Covode.recordClassIndex(19389);
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return -1L;
    }

    public C3426e(AbstractC3341h.AbstractC3342a abstractC3342a) {
        C106862S5w.LIZ(abstractC3342a);
        this.LIZIZ = abstractC3342a;
    }
}
