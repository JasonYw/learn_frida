package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$b;
import com.bytedance.android.livesdk.common.C6801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C7KL;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.b.b$a */
/* loaded from: classes3.dex */
public abstract class b$a<V extends b$b> extends C6801d {
    public static ChangeQuickRedirect LIZ;
    public V LIZJ;
    public final String LIZIZ = getClass().getSimpleName();
    public final LinkCrossRoomDataHolder LIZLLL = LinkCrossRoomDataHolder.LJII();

    static {
        Covode.recordClassIndex(25661);
    }

    public final <S> C7KL<S> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        return this.LIZJ.LJIIIIZZ();
    }

    public final <R> C7KL<R> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C7KL) proxy.result;
        }
        return this.LIZJ.LJIIIZ();
    }

    public b$a(V v) {
        this.LIZJ = v;
        LIZ((b$a<V>) v);
    }

    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
            return;
        }
        ALogger.stacktrace(6, this.LIZIZ, th.getStackTrace());
    }
}
