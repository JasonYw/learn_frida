package com.bytedance.android.live.broadcast;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86405K3b;

/* loaded from: classes5.dex */
public final class BroadcastStreamFragment$widgetManager$2 extends Lambda implements Function0<WidgetManager> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86405K3b this$0;

    static {
        Covode.recordClassIndex(14292);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastStreamFragment$widgetManager$2(C86405K3b c86405K3b) {
        super(0);
        this.this$0 = c86405K3b;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.ies.sdk.widgets.WidgetManager] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ WidgetManager mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C86405K3b c86405K3b = this.this$0;
        return WidgetManager.m14494of(c86405K3b, c86405K3b.getView());
    }
}
