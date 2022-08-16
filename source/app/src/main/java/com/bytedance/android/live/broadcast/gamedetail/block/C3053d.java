package com.bytedance.android.live.broadcast.gamedetail.block;

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

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.d */
/* loaded from: classes5.dex */
public final class C3053d implements AbstractC3125c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final List<C3052c> LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final String f25852LJ;

    static {
        Covode.recordClassIndex(16178);
    }

    private Object[] LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, Integer.valueOf(this.LIZLLL), this.f25852LJ};
    }

    @Override // com.bytedance.ies.sve_list.AbstractC12648a
    public final int LIZIZ() {
        return 3;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3053d) {
            return C106862S5w.LIZ(((C3053d) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameTabProps:%s,%s,%s,%s", LIZJ());
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

    public C3053d(String str, List<C3052c> list, int i, String str2) {
        C106862S5w.LIZ(str, list, str2);
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = i;
        this.f25852LJ = str2;
    }

    public /* synthetic */ C3053d(String str, List list, int i, String str2, int i2) {
        this(str, list, 1, "tab_game_detail");
    }
}
