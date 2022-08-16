package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.android.live.broadcastgame.api.model.AbstractC3378h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.broadcastgame.api.channel.a */
/* loaded from: classes5.dex */
public final class C3331a implements AbstractC3337g.AbstractC3338a, AbstractC3378h {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("seq_num")
    public long LIZIZ;
    @SerializedName("conn_id")
    public long LIZJ;
    @SerializedName("extra")
    public String LIZLLL;
    @SerializedName("game_id")

    /* renamed from: LJ */
    public long f26012LJ;
    @SerializedName("time_stamp")
    public final long LJFF;
    @SerializedName("need_cache")
    public int LJI;
    public transient boolean LJII;
    public transient C3336f LJIIIIZZ;

    static {
        Covode.recordClassIndex(19044);
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3378h
    public final int LIZIZ() {
        return this.LJI;
    }

    @Override // com.bytedance.android.live.broadcastgame.api.model.AbstractC3378h
    public final long LIZJ() {
        return this.LJFF;
    }

    public final C3336f LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C3336f) proxy.result;
        }
        if (this.LJIIIIZZ == null) {
            this.LJIIIIZZ = LIZLLL();
        }
        return this.LJIIIIZZ;
    }

    private final C3336f LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C3336f) proxy.result;
        }
        try {
            Object fromJson = KM9.LIZ().fromJson(this.LIZLLL, (Class<Object>) C3336f.class);
            ((C3336f) fromJson).LJII = this.LJII;
            return (C3336f) fromJson;
        } catch (Exception unused) {
            return null;
        }
    }

    public C3331a(long j, long j2, String str, long j3, long j4, int i, boolean z) {
        C106862S5w.LIZ(str);
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.f26012LJ = j3;
        this.LJFF = j4;
        this.LJI = i;
        this.LJII = z;
    }

    public /* synthetic */ C3331a(long j, long j2, String str, long j3, long j4, int i, boolean z, int i2) {
        this(j, j2, str, j3, (i2 & 16) != 0 ? 0L : j4, (i2 & 32) != 0 ? DelayType.NO_DELAY.value : i, (i2 & 64) != 0 ? false : z);
    }
}
