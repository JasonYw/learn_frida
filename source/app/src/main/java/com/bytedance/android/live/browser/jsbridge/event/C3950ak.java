package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.android.livesdk.message.model.C8777bt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.ak */
/* loaded from: classes12.dex */
public final class C3950ak {
    public static ChangeQuickRedirect LIZ;
    public final C8777bt LIZIZ;

    static {
        Covode.recordClassIndex(22291);
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
        if (obj instanceof C3950ak) {
            return C106862S5w.LIZ(((C3950ak) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ShowFollowGuideEvent:%s", LIZ());
    }

    public C3950ak(C8777bt c8777bt) {
        C106862S5w.LIZ(c8777bt);
        this.LIZIZ = c8777bt;
    }
}
