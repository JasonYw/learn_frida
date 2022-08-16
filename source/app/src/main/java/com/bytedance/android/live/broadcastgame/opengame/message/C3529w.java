package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.w */
/* loaded from: classes3.dex */
public final class C3529w implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final List<C3528v> LIZIZ;

    static {
        Covode.recordClassIndex(20321);
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return -1L;
    }

    public C3529w(List<C3528v> list) {
        C106862S5w.LIZ(list);
        this.LIZIZ = list;
    }
}
