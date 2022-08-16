package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class LiveGameDebugService$debugMsgChannel$2 extends Lambda implements Function0<C3465b> {
    public static final LiveGameDebugService$debugMsgChannel$2 INSTANCE;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(19694);
        INSTANCE = new LiveGameDebugService$debugMsgChannel$2();
    }

    public LiveGameDebugService$debugMsgChannel$2() {
        super(0);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(19694);
        INSTANCE = new LiveGameDebugService$debugMsgChannel$2();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.debug.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3465b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3465b();
    }
}
