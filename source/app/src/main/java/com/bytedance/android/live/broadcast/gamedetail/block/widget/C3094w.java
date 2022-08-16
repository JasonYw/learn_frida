package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.AbstractC12648a;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.L6P;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.w */
/* loaded from: classes5.dex */
public final class C3094w implements AbstractC3125c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25874LJ;
    public final String LJFF;
    public final String LJI;
    public final List<String> LJII;

    static {
        Covode.recordClassIndex(16453);
    }

    private Object[] LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Integer.valueOf(this.LIZJ), this.LIZLLL, this.f25874LJ, this.LJFF, this.LJI, this.LJII};
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final int LIZIZ() {
        return 4;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3094w) {
            return C106862S5w.LIZ(((C3094w) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OrderGameDetailInfoProps:%s,%s,%s,%s,%s,%s,%s", LIZJ());
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

    public C3094w(String str, int i, String str2, String str3, String str4, String str5, List<String> list) {
        C106862S5w.LIZ(str, str2, str3, str5);
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.f25874LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = list;
    }
}
