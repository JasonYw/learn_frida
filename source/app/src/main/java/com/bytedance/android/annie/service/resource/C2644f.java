package com.bytedance.android.annie.service.resource;

import com.bytedance.android.annie.api.resource.AnnieResType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.annie.service.resource.f */
/* loaded from: classes7.dex */
public final class C2644f {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final AnnieResType f25633LJ;
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(RequestConfig$customParams$2.INSTANCE);

    static {
        Covode.recordClassIndex(11213);
    }

    private Object[] LIZIZ() {
        return new Object[]{this.f25633LJ};
    }

    public final Map<String, Object> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Map) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2644f) {
            return C106862S5w.LIZ(((C2644f) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("RequestConfig:%s", LIZIZ());
    }

    public C2644f(AnnieResType annieResType) {
        C106862S5w.LIZ(annieResType);
        this.f25633LJ = annieResType;
    }
}
