package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.android.livesdk.message.model.C8998kd;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.ao */
/* loaded from: classes12.dex */
public final class C3954ao implements AbstractC3959e {
    public static ChangeQuickRedirect LIZ;
    public final C8998kd LIZIZ;

    static {
        Covode.recordClassIndex(22295);
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
        if (obj instanceof C3954ao) {
            return C106862S5w.LIZ(((C3954ao) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("VSCommentClickEvent:%s", LIZ());
    }

    public C3954ao(C8998kd c8998kd) {
        C106862S5w.LIZ(c8998kd);
        this.LIZIZ = c8998kd;
    }
}
