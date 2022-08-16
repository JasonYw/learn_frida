package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import com.bytedance.android.livesdk.chatroom.model.interact.C6148ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class i$b {
    public static ChangeQuickRedirect LIZ;
    public final C6148ae LIZIZ;

    static {
        Covode.recordClassIndex(27541);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof i$b) {
            return C106862S5w.LIZ(((i$b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LinkRoomFightSearchResultViewBinder$ResultData:%s", LIZ());
    }

    public i$b(C6148ae c6148ae) {
        C106862S5w.LIZ(c6148ae);
        this.LIZIZ = c6148ae;
    }
}
