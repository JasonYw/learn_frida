package com.bytedance.android.live.liveinteract.api.chatroom.p339b;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.api.chatroom.b.a */
/* loaded from: classes3.dex */
public final class C4266a {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final Object LIZJ;

    static {
        Covode.recordClassIndex(25123);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4266a) {
            return C106862S5w.LIZ(((C4266a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BidMsgTypeEvent:%s,%s", LIZ());
    }

    public C4266a(int i, Object obj) {
        this.LIZIZ = i;
        this.LIZJ = obj;
    }

    public /* synthetic */ C4266a(int i, Object obj, int i2) {
        this(i, null);
    }
}
