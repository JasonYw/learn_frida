package com.bytedance.android.live.liveinteract.api.chatroom.p339b;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C78832H5u;

/* renamed from: com.bytedance.android.live.liveinteract.api.chatroom.b.b */
/* loaded from: classes3.dex */
public final class C4267b {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;

    static {
        Covode.recordClassIndex(25124);
    }

    public C4267b() {
        this(false, 0, 3);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4267b) {
            return C106862S5w.LIZ(((C4267b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BidPanelShowEvent:%s,%s", LIZ());
    }

    public C4267b(boolean z, int i) {
        this.LIZIZ = z;
        this.LIZJ = i;
    }

    public /* synthetic */ C4267b(boolean z, int i, int i2) {
        this(false, C78832H5u.LIZ);
    }
}
