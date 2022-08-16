package com.bytedance.android.live.liveinteract.videotalk.emoji.p389a;

import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4929c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.emoji.a.e */
/* loaded from: classes20.dex */
public final class C4926e {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final C4929c LIZJ;
    public final boolean LIZLLL;

    static {
        Covode.recordClassIndex(30185);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ, Boolean.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4926e) {
            return C106862S5w.LIZ(((C4926e) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("TalkRoomEmojiEvent:%s,%s,%s", LIZ());
    }

    public C4926e(int i, C4929c c4929c, boolean z) {
        C106862S5w.LIZ(c4929c);
        this.LIZIZ = i;
        this.LIZJ = c4929c;
        this.LIZLLL = z;
    }

    public /* synthetic */ C4926e(int i, C4929c c4929c, boolean z, int i2) {
        this(2, c4929c, false);
    }
}
