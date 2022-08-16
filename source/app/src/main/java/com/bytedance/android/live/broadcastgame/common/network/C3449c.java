package com.bytedance.android.live.broadcastgame.common.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.internal.C33838c;
import java.util.Objects;
import org.json.JSONObject;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.common.network.c */
/* loaded from: classes12.dex */
public final class C3449c {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33838c.f42636f)
    public final String LIZIZ;
    public Boolean LIZJ;

    static {
        Covode.recordClassIndex(19657);
    }

    private Object[] LIZIZ() {
        return new Object[]{this.LIZIZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3449c) {
            return C106862S5w.LIZ(((C3449c) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameRoundStartResponse:%s", LIZIZ());
    }

    public final Boolean LIZ() {
        Boolean bool;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        if (this.LIZJ == null) {
            try {
                bool = Boolean.valueOf(new JSONObject(this.LIZIZ).getBoolean("revival_open"));
            } catch (Exception unused) {
                bool = null;
            }
            this.LIZJ = bool;
        }
        return this.LIZJ;
    }
}
