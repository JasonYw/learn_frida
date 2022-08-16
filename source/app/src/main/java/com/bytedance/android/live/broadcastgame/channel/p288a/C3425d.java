package com.bytedance.android.live.broadcastgame.channel.p288a;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.android.live.broadcastgame.api.channel.C3331a;
import com.bytedance.android.live.broadcastgame.api.channel.C3336f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.a.d */
/* loaded from: classes5.dex */
public final class C3425d implements AbstractC3404c {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC3337g.AbstractC3338a LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(19388);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.LIZIZ.toString();
    }

    @Override // com.bytedance.android.live.broadcastgame.AbstractC3404c
    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC3337g.AbstractC3338a abstractC3338a = this.LIZIZ;
        if (!(abstractC3338a instanceof C3336f) && (abstractC3338a instanceof C3331a)) {
            return ((C3331a) abstractC3338a).LIZIZ;
        }
        return -1L;
    }

    public final long LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        AbstractC3337g.AbstractC3338a abstractC3338a = this.LIZIZ;
        if (abstractC3338a instanceof C3336f) {
            return -102L;
        }
        if (abstractC3338a instanceof C3331a) {
            return ((C3331a) abstractC3338a).LIZJ;
        }
        return -1L;
    }

    public C3425d(AbstractC3337g.AbstractC3338a abstractC3338a, String str) {
        C106862S5w.LIZ(abstractC3338a, str);
        this.LIZIZ = abstractC3338a;
        this.LIZJ = str;
    }

    public /* synthetic */ C3425d(AbstractC3337g.AbstractC3338a abstractC3338a, String str, int i) {
        this(abstractC3338a, "");
    }
}
