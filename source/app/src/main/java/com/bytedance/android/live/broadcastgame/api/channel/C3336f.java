package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.broadcastgame.api.channel.f */
/* loaded from: classes5.dex */
public final class C3336f implements AbstractC3337g.AbstractC3338a {
    public static ChangeQuickRedirect LIZ;
    public transient int LIZIZ;
    public transient JsFuncInjector.Type LIZJ;
    @SerializedName("name")
    public final String LIZLLL;
    @SerializedName("channel")

    /* renamed from: LJ */
    public final long f26013LJ;
    @SerializedName("body")
    public final String LJFF;
    @SerializedName("scene")
    public int LJI;
    public transient boolean LJII;

    static {
        Covode.recordClassIndex(19051);
    }

    public final JSONObject LIZ() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        if (this.LIZIZ != 0) {
            i = 1;
        }
        jSONObject.put("isFromRemote", i);
        jSONObject.put("name", this.LIZLLL);
        jSONObject.put("body", this.LJFF);
        jSONObject.put("isCacheMsg", this.LJII ? 1 : 0);
        return jSONObject;
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String json = GsonProtectorUtils.toJson(KM9.LIZIZ(), this);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public C3336f(String str, long j, String str2, int i, boolean z) {
        C106862S5w.LIZ(str, str2);
        this.LIZLLL = str;
        this.f26013LJ = j;
        this.LJFF = str2;
        this.LJI = i;
        this.LJII = z;
    }

    public /* synthetic */ C3336f(String str, long j, String str2, int i, boolean z, int i2) {
        this(str, (i2 & 2) != 0 ? 1L : j, (i2 & 4) != 0 ? "{}" : str2, (i2 & 8) != 0 ? 0 : i, false);
    }
}
