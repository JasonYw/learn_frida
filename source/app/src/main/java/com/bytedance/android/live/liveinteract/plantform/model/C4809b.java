package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.b */
/* loaded from: classes3.dex */
public final class C4809b {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    static {
        Covode.recordClassIndex(29424);
    }

    public C4809b(String str) {
        this(str, null, 2);
    }

    private Object[] LIZIZ() {
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
        if (obj instanceof C4809b) {
            return C106862S5w.LIZ(((C4809b) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AnchorCancelParams:%s,%s", LIZIZ());
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String str = this.LIZJ;
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    public C4809b(String str, String str2) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = str2;
    }

    public /* synthetic */ C4809b(String str, String str2, int i) {
        this(str, null);
    }
}