package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.AbstractC12648a;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.L6P;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.widget.b */
/* loaded from: classes5.dex */
public final class C3139b implements AbstractC3125c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final C3121e LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25902LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    static {
        Covode.recordClassIndex(16766);
    }

    private Object[] LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25902LJ, this.LJFF, this.LJI, this.LJII, Integer.valueOf(this.LJIIIIZZ), this.LJIIIZ, this.LJIIJ};
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final int LIZIZ() {
        return 1;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3139b) {
            return C106862S5w.LIZ(((C3139b) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameDetailLynxProps:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZJ());
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

    public C3139b(String str, C3121e c3121e, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = c3121e;
        this.LIZLLL = str2;
        this.f25902LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = i;
        this.LJIIIZ = str7;
        this.LJIIJ = str8;
    }
}
