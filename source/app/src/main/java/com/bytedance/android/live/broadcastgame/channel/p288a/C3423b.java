package com.bytedance.android.live.broadcastgame.channel.p288a;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.android.live.broadcastgame.api.channel.ChannelType;
import com.bytedance.android.live.broadcastgame.api.channel.MessageTarget;
import com.bytedance.android.live.broadcastgame.api.channel.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.a.b */
/* loaded from: classes5.dex */
public final class C3423b implements AbstractC3341h.AbstractC3342a {
    public static ChangeQuickRedirect LIZ;
    public final MessageType LIZIZ;
    public final ChannelType LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final MessageTarget f26037LJ;
    public final String LJFF;

    static {
        Covode.recordClassIndex(19386);
    }

    private Object[] LIZJ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26037LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3423b) {
            return C106862S5w.LIZ(((C3423b) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AnchorSendMessage:%s,%s,%s,%s,%s", LIZJ());
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h.AbstractC3342a
    public final MessageTarget LIZ() {
        return this.f26037LJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h.AbstractC3342a
    public final String LIZIZ() {
        return this.LJFF;
    }

    public C3423b(MessageType messageType, ChannelType channelType, String str, MessageTarget messageTarget, String str2) {
        C106862S5w.LIZ(messageType, channelType, str, messageTarget, str2);
        this.LIZIZ = messageType;
        this.LIZJ = channelType;
        this.LIZLLL = str;
        this.f26037LJ = messageTarget;
        this.LJFF = str2;
    }
}
