package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.aa */
/* loaded from: classes5.dex */
public final class C3371aa {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ = "";
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final InteractID f26020LJ;

    static {
        Covode.recordClassIndex(19181);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZJ, this.LIZLLL, this.f26020LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3371aa) {
            return C106862S5w.LIZ(((C3371aa) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenPlatformAppInfo:%s,%s,%s", LIZ());
    }

    public C3371aa(String str, String str2, InteractID interactID) {
        C106862S5w.LIZ(str, str2, interactID);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26020LJ = interactID;
    }
}
