package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.android.live.liveinteract.interact.audience.context.C4430f;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LinkPkInteractAudienceAnchorWidget$onCreate$1 extends Lambda implements Function0<C4430f> {
    public static final LinkPkInteractAudienceAnchorWidget$onCreate$1 INSTANCE = new LinkPkInteractAudienceAnchorWidget$onCreate$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27030);
    }

    public LinkPkInteractAudienceAnchorWidget$onCreate$1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.liveinteract.interact.audience.context.f] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4430f mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4430f();
    }
}
