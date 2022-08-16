package com.bytedance.als.p194a;

import androidx.lifecycle.ViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.objectcontainer.C13805g;
import com.bytedance.objectcontainer.C13808o;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.als.a.h */
/* loaded from: classes9.dex */
public final class C2540h extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public final C13808o LIZIZ;
    public C13805g LIZJ;

    static {
        Covode.recordClassIndex(10041);
    }

    public final C13805g LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C13805g) proxy.result;
        }
        C13805g c13805g = this.LIZJ;
        if (c13805g == null) {
            return LIZ();
        }
        return c13805g;
    }

    public final C13805g LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C13805g) proxy.result;
        }
        C13805g LIZ2 = this.LIZIZ.LIZ();
        this.LIZJ = LIZ2;
        Intrinsics.checkExpressionValueIsNotNull(LIZ2, "");
        return LIZ2;
    }

    public C2540h(C13805g c13805g, C2539f c2539f) {
        C13808o c13808o;
        C106862S5w.LIZ(c2539f);
        if (c13805g == null) {
            c13808o = new C13808o(null, c2539f.LIZ);
        } else {
            c13808o = new C13808o(c13805g, c2539f.LIZ);
        }
        this.LIZIZ = c13808o;
    }
}
