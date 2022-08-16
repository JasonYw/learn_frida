package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.android.live.liveinteract.interact.audience.context.C4426b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class InteractAudienceAnchorWidget$onCreate$1 extends Lambda implements Function0<C4426b> {
    public static final InteractAudienceAnchorWidget$onCreate$1 INSTANCE = new InteractAudienceAnchorWidget$onCreate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26988);
    }

    public InteractAudienceAnchorWidget$onCreate$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.interact.audience.context.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4426b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4426b();
    }
}
