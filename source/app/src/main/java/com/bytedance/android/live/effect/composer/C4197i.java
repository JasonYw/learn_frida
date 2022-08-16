package com.bytedance.android.live.effect.composer;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.effect.composer.i */
/* loaded from: classes5.dex */
public final class C4197i {
    public static ChangeQuickRedirect LIZ;
    public Float LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(24487);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LiveComposerTagNode(tag='" + this.LIZJ + "', value=" + this.LIZIZ;
    }

    public C4197i(String str) {
        C106862S5w.LIZ(str);
        this.LIZJ = str;
    }
}
