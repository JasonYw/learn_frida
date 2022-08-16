package com.bytedance.android.live.p482ui;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.ui.LinkGuestSendGiftView$guestSendGiftContainer$2 */
/* loaded from: classes3.dex */
public final class LinkGuestSendGiftView$guestSendGiftContainer$2 extends Lambda implements Function0<ConstraintLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkGuestSendGiftView this$0;

    static {
        Covode.recordClassIndex(36324);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkGuestSendGiftView$guestSendGiftContainer$2(LinkGuestSendGiftView linkGuestSendGiftView) {
        super(0);
        this.this$0 = linkGuestSendGiftView;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.constraintlayout.widget.ConstraintLayout, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConstraintLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.findViewById(2131176414);
    }
}
