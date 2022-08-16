package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.digitavatar.u */
/* loaded from: classes3.dex */
public final class C4385u {
    public static ChangeQuickRedirect LIZ;
    public final AvatarGender LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(26717);
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
        if (obj instanceof C4385u) {
            return C106862S5w.LIZ(((C4385u) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UpdateAvatarParams:%s,%s", LIZ());
    }

    public C4385u(AvatarGender avatarGender, String str) {
        C106862S5w.LIZ(avatarGender, str);
        this.LIZIZ = avatarGender;
        this.LIZJ = str;
    }
}
