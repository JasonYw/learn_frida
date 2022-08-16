package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.banner.C2808b;
import com.bytedance.android.live.base.model.banner.C2809c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.base.model.feed.a */
/* loaded from: classes8.dex */
public class C2827a extends Extra {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("cost")
    public long LIZIZ;
    @SerializedName("rank_round_banner")
    public C2809c LIZJ;
    @SerializedName("unread_extra")
    public String LIZLLL;

    /* renamed from: LJ */
    public transient C2828a f25739LJ;
    @SerializedName("max_time")
    public long LJFF;
    @SerializedName("min_time")
    public long LJI;
    @SerializedName("req_id")
    public String LJII;
    @SerializedName("banner")
    public C2808b LJIIIIZZ;
    @SerializedName("total")
    public int LJIIIZ;
    @SerializedName("style")
    public int LJIIJ;
    @SerializedName("offset")
    public long LJIIJJI;
    @SerializedName("offset_type")
    public int LJIIL;
    @SerializedName("log_pb")
    public JsonObject LJIILIIL;

    /* renamed from: com.bytedance.android.live.base.model.feed.a$a */
    /* loaded from: classes8.dex */
    public static final class C2828a {
        @SerializedName("impr_id")
        public String LIZ;

        static {
            Covode.recordClassIndex(14038);
        }
    }

    static {
        Covode.recordClassIndex(14037);
    }

    public final JsonObject LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JsonObject) proxy.result;
        }
        if (this.f25739LJ != null) {
            this.LJIILIIL = GsonProtectorUtils.toJsonTree(KM9.LIZ(), this.f25739LJ).getAsJsonObject();
            this.f25739LJ = null;
            return this.LJIILIIL;
        }
        return this.LJIILIIL;
    }
}
