package com.bytedance.android.live.gift;

import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.gift.l */
/* loaded from: classes3.dex */
public final class C4245l {
    public static ChangeQuickRedirect LIZ;
    public final List<GiftPage> LIZIZ;

    static {
        Covode.recordClassIndex(24973);
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
        if (obj instanceof C4245l) {
            return C106862S5w.LIZ(((C4245l) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SyncGiftPageListFinishEvent:%s", LIZ());
    }

    public C4245l(List<GiftPage> list) {
        this.LIZIZ = list;
    }
}
