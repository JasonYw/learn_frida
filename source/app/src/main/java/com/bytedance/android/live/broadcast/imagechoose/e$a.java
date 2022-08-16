package com.bytedance.android.live.broadcast.imagechoose;

import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C64929Bjf;

/* loaded from: classes5.dex */
public final class e$a {
    public static ChangeQuickRedirect LIZ;
    public final C2917q LIZIZ;
    public final C64929Bjf LIZJ;
    public boolean LIZLLL;

    static {
        Covode.recordClassIndex(16815);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Boolean.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof e$a) {
            return C106862S5w.LIZ(((e$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ImagePickerProvider$Image:%s,%s,%s", LIZ());
    }

    public e$a(C2917q c2917q, C64929Bjf c64929Bjf, boolean z) {
        C106862S5w.LIZ(c2917q, c64929Bjf);
        this.LIZIZ = c2917q;
        this.LIZJ = c64929Bjf;
        this.LIZLLL = z;
    }

    public /* synthetic */ e$a(C2917q c2917q, C64929Bjf c64929Bjf, boolean z, int i) {
        this(c2917q, c64929Bjf, false);
    }
}
