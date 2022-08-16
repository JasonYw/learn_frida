package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.as */
/* loaded from: classes5.dex */
public final class C3555as implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("customized")
    public boolean LIZIZ;
    @SerializedName("sub_title")
    public String LIZJ;
    @SerializedName("cover")
    public ImageModel LIZLLL;

    static {
        Covode.recordClassIndex(20364);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3555as) {
            return C106862S5w.LIZ(((C3555as) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StampCustomizedData:%s,%s,%s", LIZ());
    }

    public C3555as() {
        this.LIZIZ = false;
        this.LIZJ = "";
        this.LIZLLL = null;
    }

    public C3555as(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        QV1.LJII(c10532g);
                    } else {
                        this.LIZLLL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    this.LIZJ = QV1.LJFF(c10532g);
                }
            } else {
                this.LIZIZ = QV1.LIZ(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (!this.LIZIZ) {
            this.LIZIZ = false;
        }
        if (this.LIZJ == null) {
            this.LIZJ = "";
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = null;
        }
    }
}
