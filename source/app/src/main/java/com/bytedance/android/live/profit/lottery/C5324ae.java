package com.bytedance.android.live.profit.lottery;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.lottery.ae */
/* loaded from: classes12.dex */
public final class C5324ae {
    public static ChangeQuickRedirect LIZ;
    public final AbstractC5315aa LIZIZ;
    public final AbstractC5331i LIZJ;
    public final AbstractC5315aa LIZLLL;

    static {
        Covode.recordClassIndex(33471);
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
        if (obj instanceof C5324ae) {
            return C106862S5w.LIZ(((C5324ae) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("StateChangeEvent:%s,%s,%s", LIZ());
    }

    public C5324ae(AbstractC5315aa abstractC5315aa, AbstractC5331i abstractC5331i, AbstractC5315aa abstractC5315aa2) {
        C106862S5w.LIZ(abstractC5315aa, abstractC5331i, abstractC5315aa2);
        this.LIZIZ = abstractC5315aa;
        this.LIZJ = abstractC5331i;
        this.LIZLLL = abstractC5315aa2;
    }
}
