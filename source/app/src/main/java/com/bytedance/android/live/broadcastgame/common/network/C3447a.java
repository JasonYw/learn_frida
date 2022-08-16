package com.bytedance.android.live.broadcastgame.common.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.common.network.a */
/* loaded from: classes5.dex */
public final class C3447a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("user_id")
    public final long LIZIZ;
    @SerializedName("avatar_url")
    public final List<String> LIZJ;
    @SerializedName("name")
    public final String LIZLLL;
    @SerializedName("index")

    /* renamed from: LJ */
    public final int f26044LJ;
    @SerializedName("score")
    public final long LJFF;
    @SerializedName("is_anchor")
    public final boolean LJI;
    @SerializedName("rank_type")
    public final int LJII;

    static {
        Covode.recordClassIndex(19655);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Long.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL, Integer.valueOf(this.f26044LJ), Long.valueOf(this.LJFF), Boolean.valueOf(this.LJI), Integer.valueOf(this.LJII)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3447a) {
            return C106862S5w.LIZ(((C3447a) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameRankItem:%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public final JSONObject LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", this.LIZIZ);
        jSONObject.put("name", this.LIZLLL);
        jSONObject.put("index", this.f26044LJ);
        jSONObject.put("score", this.LJFF);
        jSONObject.put("is_anchor", this.LJI);
        jSONObject.put("rank_type", this.LJII);
        return jSONObject;
    }
}
