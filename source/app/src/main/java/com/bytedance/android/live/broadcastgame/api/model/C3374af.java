package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.af */
/* loaded from: classes12.dex */
public final class C3374af implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("result")
    public Map<String, C3363a> LIZIZ;

    static {
        Covode.recordClassIndex(19186);
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
        if (obj instanceof C3374af) {
            return C106862S5w.LIZ(((C3374af) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StampAvailableResponse:%s", LIZ());
    }

    public C3374af() {
        this.LIZIZ = null;
    }

    public C3374af(C10532g c10532g) {
        this.LIZIZ = new HashMap();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            String str = null;
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    QV1.LJII(c10532g);
                } else {
                    long LIZ3 = c10532g.LIZ();
                    C3363a c3363a = null;
                    while (true) {
                        int LIZIZ2 = c10532g.LIZIZ();
                        if (LIZIZ2 == -1) {
                            break;
                        } else if (LIZIZ2 != 1) {
                            if (LIZIZ2 != 2) {
                                QV1.LJII(c10532g);
                            } else {
                                c3363a = new C3363a(c10532g);
                            }
                        } else {
                            str = QV1.LJFF(c10532g);
                        }
                    }
                    c10532g.LIZ(LIZ3);
                    Map<String, C3363a> map = this.LIZIZ;
                    if (str != null) {
                        if (c3363a != null) {
                            map.put(str, c3363a);
                        } else {
                            throw new IllegalStateException("Value must not be null");
                        }
                    } else {
                        throw new IllegalStateException("Key must not be null");
                    }
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZIZ == null) {
                    this.LIZIZ = null;
                    return;
                }
                return;
            }
        }
    }
}
