package com.bytedance.android.live.liveinteract.digitavatar.videoavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.digitavatar.videoavatar.d */
/* loaded from: classes3.dex */
public final class C4388d {
    public static ChangeQuickRedirect LIZ;
    public final VideoShowMode LIZIZ;
    public final VideoShowMode LIZJ;
    public final boolean LIZLLL;

    static {
        Covode.recordClassIndex(26733);
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
        if (obj instanceof C4388d) {
            return C106862S5w.LIZ(((C4388d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("SetVideoShowModeResult:%s,%s,%s", LIZ());
    }

    public C4388d(VideoShowMode videoShowMode, VideoShowMode videoShowMode2, boolean z) {
        C106862S5w.LIZ(videoShowMode, videoShowMode2);
        this.LIZIZ = videoShowMode;
        this.LIZJ = videoShowMode2;
        this.LIZLLL = z;
    }
}
