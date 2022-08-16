package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.L8B;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.b */
/* loaded from: classes5.dex */
public final class C3051b extends L8B<AbstractC3125c> {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL = 1;

    /* renamed from: LJ */
    public final String f25851LJ;
    public final List<AbstractC3125c> LJFF;

    static {
        Covode.recordClassIndex(16176);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Boolean.valueOf(this.LIZIZ), Integer.valueOf(this.LIZJ), Integer.valueOf(this.LIZLLL), this.f25851LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3051b) {
            return C106862S5w.LIZ(((C3051b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AudienceGameDetailPageProps:%s,%s,%s,%s,%s", LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3051b(boolean z, int i, int i2, String str, List<? extends AbstractC3125c> list) {
        super(list);
        C106862S5w.LIZ(str, list);
        this.LIZIZ = z;
        this.LIZJ = i;
        this.f25851LJ = str;
        this.LJFF = list;
    }
}
