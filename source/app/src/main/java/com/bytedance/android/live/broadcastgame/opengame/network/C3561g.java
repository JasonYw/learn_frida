package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C87884Kk2;
import p003X.C87885Kk3;
import p003X.C87886Kk4;
import p003X.C87887Kk5;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.g */
/* loaded from: classes5.dex */
public final class C3561g {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("status_tag")
    public C87884Kk2 LIZIZ;
    @SerializedName("property_tag")
    public C87887Kk5 LIZJ;
    @SerializedName("image")
    public ImageModel LIZLLL;
    @SerializedName("title")

    /* renamed from: LJ */
    public C87885Kk3 f26070LJ;
    @SerializedName("btn")
    public C87886Kk4 LJFF;

    static {
        Covode.recordClassIndex(20422);
    }

    public C3561g() {
        this(null, null, null, null, null, 31);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26070LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3561g) {
            return C106862S5w.LIZ(((C3561g) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("CardTemplate:%s,%s,%s,%s,%s", LIZ());
    }

    public C3561g(C87884Kk2 c87884Kk2, C87887Kk5 c87887Kk5, ImageModel imageModel, C87885Kk3 c87885Kk3, C87886Kk4 c87886Kk4) {
        this.LIZIZ = c87884Kk2;
        this.LIZJ = c87887Kk5;
        this.LIZLLL = imageModel;
        this.f26070LJ = c87885Kk3;
        this.LJFF = c87886Kk4;
    }

    public /* synthetic */ C3561g(C87884Kk2 c87884Kk2, C87887Kk5 c87887Kk5, ImageModel imageModel, C87885Kk3 c87885Kk3, C87886Kk4 c87886Kk4, int i) {
        this(null, null, null, null, null);
    }
}
