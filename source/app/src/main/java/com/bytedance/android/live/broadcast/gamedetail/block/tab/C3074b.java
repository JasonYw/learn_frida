package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.tab.b */
/* loaded from: classes5.dex */
public final class C3074b implements AbstractC12642p {
    public static ChangeQuickRedirect LIZ;
    public final Integer LIZIZ;

    static {
        Covode.recordClassIndex(16304);
    }

    public C3074b() {
        this(null, 1);
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
        if (obj instanceof C3074b) {
            return C106862S5w.LIZ(((C3074b) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GameDetailInfoTabProps:%s", LIZ());
    }

    public C3074b(Integer num) {
        this.LIZIZ = num;
    }

    public /* synthetic */ C3074b(Integer num, int i) {
        this(0);
    }
}