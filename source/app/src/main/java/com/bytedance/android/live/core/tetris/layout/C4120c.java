package com.bytedance.android.live.core.tetris.layout;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.tetris.layout.c */
/* loaded from: classes17.dex */
public final class C4120c {
    public static ChangeQuickRedirect LIZ;
    public final View LIZIZ;
    public ViewState LIZJ;

    static {
        Covode.recordClassIndex(23755);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4120c) {
            return C106862S5w.LIZ(((C4120c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ViewWrapper:%s,%s", LIZ());
    }

    public C4120c(View view, ViewState viewState) {
        C106862S5w.LIZ(view, viewState);
        this.LIZIZ = view;
        this.LIZJ = viewState;
    }
}
