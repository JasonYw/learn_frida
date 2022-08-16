package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.feed.C2827a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.api.s */
/* loaded from: classes8.dex */
public final class C2925s {
    public static ChangeQuickRedirect LIZ;
    public final List<FeedItem> LIZIZ;
    public final C2827a LIZJ;

    static {
        Covode.recordClassIndex(14587);
    }

    public C2925s() {
        this(null, null, 3);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2925s) {
            return C106862S5w.LIZ(((C2925s) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LiveGameRoomList:%s,%s", LIZ());
    }

    public C2925s(List<FeedItem> list, C2827a c2827a) {
        this.LIZIZ = list;
        this.LIZJ = c2827a;
    }

    public /* synthetic */ C2925s(List list, C2827a c2827a, int i) {
        this(new ArrayList(), new C2827a());
    }
}
