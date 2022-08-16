package com.bytedance.android.live.broadcastgame.channel.p288a;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.android.live.broadcastgame.api.channel.MessageTarget;
import com.bytedance.android.live.broadcastgame.api.channel.SendType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.a.c */
/* loaded from: classes5.dex */
public final class C3424c implements AbstractC3341h.AbstractC3342a {
    public static ChangeQuickRedirect LIZ;
    public final SendType LIZIZ;
    public final String LIZJ;
    public final MessageTarget LIZLLL;

    /* renamed from: LJ */
    public final String f26038LJ;

    static {
        Covode.recordClassIndex(19387);
    }

    private Object[] LIZJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26038LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3424c) {
            return C106862S5w.LIZ(((C3424c) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AudienceSendMessage:%s,%s,%s,%s", LIZJ());
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h.AbstractC3342a
    public final MessageTarget LIZ() {
        return this.LIZLLL;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h.AbstractC3342a
    public final String LIZIZ() {
        return this.f26038LJ;
    }

    public C3424c(SendType sendType, String str, MessageTarget messageTarget, String str2) {
        C106862S5w.LIZ(sendType, str, messageTarget, str2);
        this.LIZIZ = sendType;
        this.LIZJ = str;
        this.LIZLLL = messageTarget;
        this.f26038LJ = str2;
    }
}
