package com.bytedance.android.live.profit.fansclub.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* renamed from: com.bytedance.android.live.profit.fansclub.widget.b */
/* loaded from: classes12.dex */
public final class C5276b {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ;
    public final Lazy LIZJ;

    static {
        Covode.recordClassIndex(33369);
    }

    public final UserInfoFansClubWidget LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (UserInfoFansClubWidget) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    public final OvalFollowFansClubWidget LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (OvalFollowFansClubWidget) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public C5276b(boolean z) {
        this.LIZIZ = LazyKt__LazyJVMKt.lazy(new FansClubWidgetService$userInfoFansClubWidget$2(z));
        this.LIZJ = LazyKt__LazyJVMKt.lazy(new FansClubWidgetService$ovalFollowFansClubWidget$2(z));
    }
}
