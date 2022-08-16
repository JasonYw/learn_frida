package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewGroupPurchaseWidget$bubbleTv$2 extends Lambda implements Function0<TextView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewGroupPurchaseWidget this$0;

    static {
        Covode.recordClassIndex(18526);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGroupPurchaseWidget$bubbleTv$2(PreviewGroupPurchaseWidget previewGroupPurchaseWidget) {
        super(0);
        this.this$0 = previewGroupPurchaseWidget;
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
        return this.this$0.contentView.findViewById(2131168801);
    }
}
