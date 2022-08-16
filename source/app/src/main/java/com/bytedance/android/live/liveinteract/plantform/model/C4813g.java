package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.g */
/* loaded from: classes.dex */
public final class C4813g {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("prompts")
    public final String LIZIZ;

    static {
        Covode.recordClassIndex(29429);
    }

    public C4813g() {
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
        if (obj instanceof C4813g) {
            return C106862S5w.LIZ(((C4813g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BidPaidLinkmicTurnOffResponse:%s", LIZ());
    }

    public C4813g(String str) {
        this.LIZIZ = str;
    }

    public /* synthetic */ C4813g(String str, int i) {
        this(null);
    }
}
