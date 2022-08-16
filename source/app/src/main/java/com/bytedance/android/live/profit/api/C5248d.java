package com.bytedance.android.live.profit.api;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C458454Bb;

/* renamed from: com.bytedance.android.live.profit.api.d */
/* loaded from: classes12.dex */
public final class C5248d {
    public static ChangeQuickRedirect LIZ;
    public final Fragment LIZIZ;
    public final C458454Bb LIZJ;

    static {
        Covode.recordClassIndex(33225);
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
        if (obj instanceof C5248d) {
            return C106862S5w.LIZ(((C5248d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("InteractionLayerInfo:%s,%s", LIZ());
    }

    public C5248d(Fragment fragment, C458454Bb c458454Bb) {
        C106862S5w.LIZ(fragment, c458454Bb);
        this.LIZIZ = fragment;
        this.LIZJ = c458454Bb;
    }
}
