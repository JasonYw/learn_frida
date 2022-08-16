package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.AbstractC12648a;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.L6P;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.widget.c */
/* loaded from: classes5.dex */
public final class C3140c implements AbstractC3125c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final C3243u LIZJ;

    static {
        Covode.recordClassIndex(16767);
    }

    private Object[] LIZJ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final int LIZIZ() {
        return 0;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3140c) {
            return C106862S5w.LIZ(((C3140c) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameIntroItemProps:%s,%s", LIZJ());
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final boolean LIZ(AbstractC12648a abstractC12648a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC12648a}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC12648a);
        return L6P.LIZ(this, abstractC12648a);
    }

    public C3140c(String str, C3243u c3243u) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = c3243u;
    }
}
