package com.bytedance.android.live.liveinteract.bid.p344ui;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.bid.ui.BidTopUserViewBinder$BidTopUserViewHolder$priceTv$2 */
/* loaded from: classes3.dex */
public final class BidTopUserViewBinder$BidTopUserViewHolder$priceTv$2 extends Lambda implements Function0<TextView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ c$b this$0;

    static {
        Covode.recordClassIndex(25257);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidTopUserViewBinder$BidTopUserViewHolder$priceTv$2(c$b c_b) {
        super(0);
        this.this$0 = c_b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.TextView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ TextView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.itemView.findViewById(2131168012);
    }
}
