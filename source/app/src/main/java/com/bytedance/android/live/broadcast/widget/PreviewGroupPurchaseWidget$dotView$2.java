package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewGroupPurchaseWidget$dotView$2 extends Lambda implements Function0<View> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewGroupPurchaseWidget this$0;

    static {
        Covode.recordClassIndex(18529);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGroupPurchaseWidget$dotView$2(PreviewGroupPurchaseWidget previewGroupPurchaseWidget) {
        super(0);
        this.this$0 = previewGroupPurchaseWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.contentView.findViewById(2131172730);
    }
}
