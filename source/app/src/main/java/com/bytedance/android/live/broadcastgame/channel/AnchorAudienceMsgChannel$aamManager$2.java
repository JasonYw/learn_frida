package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class AnchorAudienceMsgChannel$aamManager$2 extends Lambda implements Function0<AAMManager> {
    public static final AnchorAudienceMsgChannel$aamManager$2 INSTANCE = new AnchorAudienceMsgChannel$aamManager$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19322);
    }

    public AnchorAudienceMsgChannel$aamManager$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.channel.AAMManager] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AAMManager mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new AAMManager();
    }
}
