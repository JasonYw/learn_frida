package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.tab.c */
/* loaded from: classes5.dex */
public final class C3075c implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final C3121e LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25858LJ;

    static {
        Covode.recordClassIndex(16305);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f25858LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3075c) {
            return C106862S5w.LIZ(((C3075c) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameDetailLynxTabProps:%s,%s,%s,%s", LIZ());
    }

    public C3075c(C3121e c3121e, String str, String str2, String str3) {
        this.LIZIZ = c3121e;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f25858LJ = str3;
    }
}
