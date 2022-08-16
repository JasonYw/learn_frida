package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.android.live.liveinteract.interact.audience.context.C4428d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class LinkPkInteractAudienceGuestWidget$onCreate$2$1 extends Lambda implements Function0<C4428d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ IMessageManager $mm;

    static {
        Covode.recordClassIndex(27048);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkPkInteractAudienceGuestWidget$onCreate$2$1(IMessageManager iMessageManager) {
        super(0);
        this.$mm = iMessageManager;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.liveinteract.interact.audience.context.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4428d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4428d(this.$mm);
    }
}
