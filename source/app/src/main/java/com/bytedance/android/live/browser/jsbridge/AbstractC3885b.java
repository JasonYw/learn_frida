package com.bytedance.android.live.browser.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge.IJavaMethod;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import p003X.C106862S5w;
import p003X.PK0;

/* renamed from: com.bytedance.android.live.browser.jsbridge.b */
/* loaded from: classes8.dex */
public abstract class AbstractC3885b {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f26122LJ;

    static {
        Covode.recordClassIndex(22051);
    }

    public Map<String, IJavaMethod> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26122LJ, false, 4);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26122LJ, false, 5);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, AbstractC13049f.AbstractC13051b> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26122LJ, false, 6);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return MapsKt__MapsKt.emptyMap();
    }

    /* renamed from: LJ */
    public Map<String, IJavaMethod> mo15829LJ(AbstractC3940c abstractC3940c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, f26122LJ, false, 7);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> LJFF(AbstractC3940c abstractC3940c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, f26122LJ, false, 8);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, AbstractC13049f.AbstractC13051b> LIZ(AbstractC3940c abstractC3940c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, f26122LJ, false, 2);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c);
        return MapsKt__MapsKt.plus(LIZJ(), LIZIZ(abstractC3940c));
    }

    public Map<String, AbstractC13049f.AbstractC13051b> LIZIZ(AbstractC3940c abstractC3940c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, f26122LJ, false, 9);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c);
        return MapsKt__MapsKt.emptyMap();
    }

    public Map<String, PK0<?, ?>> LIZJ(AbstractC3940c abstractC3940c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, f26122LJ, false, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c);
        return MapsKt__MapsKt.plus(LIZIZ(), LJFF(abstractC3940c));
    }

    public Map<String, IJavaMethod> LIZLLL(AbstractC3940c abstractC3940c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3940c}, this, f26122LJ, false, 3);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(abstractC3940c);
        return MapsKt__MapsKt.plus(LIZ(), mo15829LJ(abstractC3940c));
    }
}
