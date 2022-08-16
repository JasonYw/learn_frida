package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.o */
/* loaded from: classes3.dex */
public final class C3525o implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final List<C3524n> LIZIZ;

    static {
        Covode.recordClassIndex(20310);
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return -1L;
    }

    public C3525o(List<C3524n> list) {
        C106862S5w.LIZ(list);
        this.LIZIZ = list;
    }
}
