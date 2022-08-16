package com.bytedance.android.live.broadcast.promotelist;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class p$b {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final View.OnClickListener f25930LJ;

    static {
        Covode.recordClassIndex(17554);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Boolean.valueOf(this.LIZLLL), this.f25930LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof p$b) {
            return C106862S5w.LIZ(((p$b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PromoteListDialog$MorePopupViewItem:%s,%s,%s,%s", LIZ());
    }

    public p$b(int i, int i2, boolean z, View.OnClickListener onClickListener) {
        C106862S5w.LIZ(onClickListener);
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.f25930LJ = onClickListener;
    }
}
