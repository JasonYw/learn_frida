package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.t */
/* loaded from: classes3.dex */
public final class C4326t {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    static {
        Covode.recordClassIndex(26068);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4326t) {
            return C106862S5w.LIZ(((C4326t) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PkSwitchFollowData:%s,%s,%s", LIZ());
    }

    public C4326t(int i, int i2, String str) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = str;
    }
}
