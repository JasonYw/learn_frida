package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.ac */
/* loaded from: classes12.dex */
public final class C3944ac implements AbstractC3959e {
    public static ChangeQuickRedirect LIZ;
    public final ISendCommentEvent LIZIZ;
    public final boolean LIZJ;

    static {
        Covode.recordClassIndex(22283);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Boolean.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3944ac) {
            return C106862S5w.LIZ(((C3944ac) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SendCommentResult:%s,%s", LIZ());
    }

    public C3944ac(ISendCommentEvent iSendCommentEvent, boolean z) {
        C106862S5w.LIZ(iSendCommentEvent);
        this.LIZIZ = iSendCommentEvent;
        this.LIZJ = z;
    }
}
