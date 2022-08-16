package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class d$b {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;

    static {
        Covode.recordClassIndex(21400);
    }

    public d$b() {
        this(0, 0, 3);
    }

    private Object[] LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof d$b) {
            return C106862S5w.LIZ(((d$b) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenFeatureChooseListFragment$ItemVisibleBound:%s,%s", LIZJ());
    }

    public final int LIZIZ() {
        return (this.LIZIZ + this.LIZJ) / 2;
    }

    public final boolean LIZ() {
        if (this.LIZIZ == -1 && this.LIZJ == -1) {
            return true;
        }
        return false;
    }

    public d$b(int i, int i2) {
        this.LIZIZ = i;
        this.LIZJ = i2;
    }

    public /* synthetic */ d$b(int i, int i2, int i3) {
        this(-1, -1);
    }
}
