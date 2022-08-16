package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.message.ReviewApi;
import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class Api$service$2 extends Lambda implements Function0<ReviewApi> {
    public static final Api$service$2 INSTANCE = new Api$service$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20966);
    }

    public Api$service$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcastgame.opengame.message.ReviewApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcastgame.opengame.message.ReviewApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ReviewApi mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C3599x.LIZJ.LIZ().LIZ(ReviewApi.class);
    }
}
