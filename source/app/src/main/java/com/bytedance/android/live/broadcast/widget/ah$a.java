package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class ah$a {
    public static ChangeQuickRedirect LIZ;
    public final Sticker LIZIZ;
    public final String LIZJ;
    public final float LIZLLL;

    static {
        Covode.recordClassIndex(18885);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Float.valueOf(this.LIZLLL)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ah$a) {
            return C106862S5w.LIZ(((ah$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LinkerBeautyStoreHelper$BeautyConfig:%s,%s,%s", LIZ());
    }

    public ah$a(Sticker sticker, String str, float f) {
        C106862S5w.LIZ(sticker, str);
        this.LIZIZ = sticker;
        this.LIZJ = str;
        this.LIZLLL = f;
    }
}
