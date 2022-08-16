package com.bytedance.android.live.liveinteract.interact.audience;

import com.bytedance.android.live.liveinteract.voicechat.dialog.C5011d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class InteractAudienceGuestWidget$mGuestApplyDialog$2 extends Lambda implements Function0<C5011d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ InteractAudienceGuestWidget this$0;

    static {
        Covode.recordClassIndex(27005);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceGuestWidget$mGuestApplyDialog$2(InteractAudienceGuestWidget interactAudienceGuestWidget) {
        super(0);
        this.this$0 = interactAudienceGuestWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.voicechat.dialog.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5011d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C5011d.LJIILJJIL.LIZ(this.this$0.LJJIIJZLJL());
    }
}
