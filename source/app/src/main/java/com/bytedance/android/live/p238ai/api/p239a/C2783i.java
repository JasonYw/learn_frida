package com.bytedance.android.live.p238ai.api.p239a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.api.a.i */
/* loaded from: classes.dex */
public final class C2783i {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(13817);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2783i) {
            return C106862S5w.LIZ(((C2783i) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ModelInfo:%s,%s", LIZ());
    }

    public C2783i(String str, String str2) {
        C106862S5w.LIZ(str, str2);
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
