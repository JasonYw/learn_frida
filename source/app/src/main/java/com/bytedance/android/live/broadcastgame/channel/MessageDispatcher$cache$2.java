package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3335e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class MessageDispatcher$cache$2 extends Lambda implements Function0<Map<AbstractC3335e, Set<Long>>> {
    public static final MessageDispatcher$cache$2 INSTANCE = new MessageDispatcher$cache$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19372);
    }

    public MessageDispatcher$cache$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map<com.bytedance.android.live.broadcastgame.api.channel.e, java.util.Set<java.lang.Long>>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<AbstractC3335e, Set<Long>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new LinkedHashMap();
    }
}
