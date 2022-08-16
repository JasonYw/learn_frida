package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.android.live.liveinteract.voicechat.p392b.C5001e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.interact.audience.LinkPkInteractAudienceGuestWidget$mInteractLiveCorePermissionGuarantor$2 */
/* loaded from: classes3.dex */
public final class C4415xc213d153 extends Lambda implements Function0<C5001e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkPkInteractAudienceGuestWidget this$0;

    static {
        Covode.recordClassIndex(27045);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4415xc213d153(LinkPkInteractAudienceGuestWidget linkPkInteractAudienceGuestWidget) {
        super(0);
        this.this$0 = linkPkInteractAudienceGuestWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.liveinteract.voicechat.b.e] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5001e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5001e c5001e = new C5001e();
        c5001e.LIZ(this.this$0.LJIIIZ);
        return c5001e;
    }
}
