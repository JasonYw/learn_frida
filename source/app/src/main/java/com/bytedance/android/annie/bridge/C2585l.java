package com.bytedance.android.annie.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.PK0;

/* renamed from: com.bytedance.android.annie.bridge.l */
/* loaded from: classes7.dex */
public final class C2585l {
    public static ChangeQuickRedirect LIZ;
    public final Map<String, PK0<?, ?>> LIZIZ;
    public final Map<String, AbstractC13049f.AbstractC13051b> LIZJ;
    public final Map<String, IJavaMethod> LIZLLL;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(10510);
        } else {
            Covode.recordClassIndex(10510);
        }
    }

    public C2585l() {
        this(null, null, null, 7);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2585l) {
            return C106862S5w.LIZ(((C2585l) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Methods:%s,%s,%s", LIZ());
    }

    public C2585l(Map<String, PK0<?, ?>> map, Map<String, AbstractC13049f.AbstractC13051b> map2, Map<String, IJavaMethod> map3) {
        C106862S5w.LIZ(map, map2, map3);
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = map3;
    }

    public /* synthetic */ C2585l(Map map, Map map2, Map map3, int i) {
        this(new LinkedHashMap(), new LinkedHashMap(), new LinkedHashMap());
    }
}
