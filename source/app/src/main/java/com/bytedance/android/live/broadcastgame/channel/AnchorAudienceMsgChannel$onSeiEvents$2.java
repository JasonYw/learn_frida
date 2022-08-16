package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3337g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorAudienceMsgChannel$onSeiEvents$2 extends Lambda implements Function0<List<AbstractC3337g.AbstractC3339b>> {
    public static final AnchorAudienceMsgChannel$onSeiEvents$2 INSTANCE = new AnchorAudienceMsgChannel$onSeiEvents$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19333);
    }

    public AnchorAudienceMsgChannel$onSeiEvents$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List<com.bytedance.android.live.broadcastgame.api.channel.g$b>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<AbstractC3337g.AbstractC3339b> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
