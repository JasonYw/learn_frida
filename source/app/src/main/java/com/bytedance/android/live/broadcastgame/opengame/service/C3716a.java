package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.message.ReviewApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.a */
/* loaded from: classes.dex */
public final class C3716a {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(Api$service$2.INSTANCE);

    static {
        Covode.recordClassIndex(21078);
    }

    public final ReviewApi LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (ReviewApi) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }
}
