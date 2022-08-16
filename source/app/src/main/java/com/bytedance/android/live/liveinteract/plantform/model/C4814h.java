package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.livesdk.chatroom.interact.model.C6062s;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.h */
/* loaded from: classes3.dex */
public final class C4814h {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("bid_paid_linkmic_setting")
    public final C6062s LIZIZ;

    static {
        Covode.recordClassIndex(29430);
    }

    public C4814h() {
        this(null, 1);
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
        if (obj instanceof C4814h) {
            return C106862S5w.LIZ(((C4814h) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BidPaidLinkmicTurnOnResponse:%s", LIZ());
    }

    public C4814h(C6062s c6062s) {
        this.LIZIZ = c6062s;
    }

    public /* synthetic */ C4814h(C6062s c6062s, int i) {
        this(null);
    }
}
