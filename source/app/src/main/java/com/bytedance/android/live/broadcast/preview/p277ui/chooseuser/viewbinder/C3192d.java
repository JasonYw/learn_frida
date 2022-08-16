package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.d */
/* loaded from: classes3.dex */
public final class C3192d {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;

    static {
        Covode.recordClassIndex(17419);
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
        if (obj instanceof C3192d) {
            return C106862S5w.LIZ(((C3192d) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UserTypeTitleItem:%s", LIZ());
    }

    public C3192d(String str) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
    }
}
