package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorAudienceMsgChannel$heartBeatSeiTicker$2 extends Lambda implements Function0<C3431f> {
    public static final AnchorAudienceMsgChannel$heartBeatSeiTicker$2 INSTANCE = new AnchorAudienceMsgChannel$heartBeatSeiTicker$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19331);
    }

    public AnchorAudienceMsgChannel$heartBeatSeiTicker$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcastgame.channel.f, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3431f mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3431f("heart-beat");
    }
}
