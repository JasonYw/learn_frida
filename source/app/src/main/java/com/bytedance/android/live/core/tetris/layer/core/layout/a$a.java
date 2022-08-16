package com.bytedance.android.live.core.tetris.layer.core.layout;

import com.bytedance.android.live.core.tetris.layer.core.element.Element;
import com.bytedance.android.live.core.tetris.layer.view.ElementConstraint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class a$a {
    public static ChangeQuickRedirect LIZ;
    public final Element<?> LIZIZ;
    public final List<ElementConstraint.C4116c> LIZJ;

    static {
        Covode.recordClassIndex(23705);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "Dependency(element=" + this.LIZIZ + ", rules=" + this.LIZJ + ")";
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof a$a)) {
            obj = null;
        }
        a$a a_a = (a$a) obj;
        if (a_a == null) {
            return false;
        }
        return Intrinsics.areEqual(a_a.LIZIZ, this.LIZIZ);
    }

    public a$a(Element<?> element, List<ElementConstraint.C4116c> list) {
        C106862S5w.LIZ(element, list);
        this.LIZIZ = element;
        this.LIZJ = list;
    }
}
