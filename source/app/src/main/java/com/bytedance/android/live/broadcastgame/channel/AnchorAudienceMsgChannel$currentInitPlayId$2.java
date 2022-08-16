package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorAudienceMsgChannel$currentInitPlayId$2 extends Lambda implements Function0<C3428as> {
    public static final AnchorAudienceMsgChannel$currentInitPlayId$2 INSTANCE = new AnchorAudienceMsgChannel$currentInitPlayId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19330);
    }

    public AnchorAudienceMsgChannel$currentInitPlayId$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.channel.as] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3428as mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3428as();
    }
}
