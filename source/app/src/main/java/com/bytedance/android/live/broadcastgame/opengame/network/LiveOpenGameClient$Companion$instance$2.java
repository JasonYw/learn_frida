package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88246Kps;

/* loaded from: classes5.dex */
public final class LiveOpenGameClient$Companion$instance$2 extends Lambda implements Function0<C3599x> {
    public static final LiveOpenGameClient$Companion$instance$2 INSTANCE = new LiveOpenGameClient$Companion$instance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(20332);
    }

    public LiveOpenGameClient$Companion$instance$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.opengame.network.x, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3599x mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3599x(new C88246Kps(), (byte) 0);
    }
}
