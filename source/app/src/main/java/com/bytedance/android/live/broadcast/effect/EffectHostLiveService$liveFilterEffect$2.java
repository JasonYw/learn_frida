package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.stream.capture.p279a.C3239a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class EffectHostLiveService$liveFilterEffect$2 extends Lambda implements Function0<C3239a> {
    public static final EffectHostLiveService$liveFilterEffect$2 INSTANCE = new EffectHostLiveService$liveFilterEffect$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15734);
    }

    public EffectHostLiveService$liveFilterEffect$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.stream.capture.a.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3239a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3239a();
    }
}
