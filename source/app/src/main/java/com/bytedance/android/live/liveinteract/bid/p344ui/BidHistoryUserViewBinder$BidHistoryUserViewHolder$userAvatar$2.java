package com.bytedance.android.live.liveinteract.bid.p344ui;

import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.bid.ui.BidHistoryUserViewBinder$BidHistoryUserViewHolder$userAvatar$2 */
/* loaded from: classes3.dex */
public final class BidHistoryUserViewBinder$BidHistoryUserViewHolder$userAvatar$2 extends Lambda implements Function0<HSImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ a$b this$0;

    static {
        Covode.recordClassIndex(25253);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidHistoryUserViewBinder$BidHistoryUserViewHolder$userAvatar$2(a$b a_b) {
        super(0);
        this.this$0 = a_b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.core.widget.HSImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.core.widget.HSImageView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HSImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.itemView.findViewById(2131167996);
    }
}
