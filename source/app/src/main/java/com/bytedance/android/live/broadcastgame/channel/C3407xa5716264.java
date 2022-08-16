package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KY0;

/* renamed from: com.bytedance.android.live.broadcastgame.channel.AnchorAudienceMsgChannel$createMessageChannel$$inlined$apply$lambda$1 */
/* loaded from: classes5.dex */
public final class C3407xa5716264 extends Lambda implements Function0<C3383p> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KY0 this$0;

    static {
        Covode.recordClassIndex(19323);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3407xa5716264(KY0 ky0) {
        super(0);
        this.this$0 = ky0;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.api.model.p] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3383p mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZIZ();
    }
}
