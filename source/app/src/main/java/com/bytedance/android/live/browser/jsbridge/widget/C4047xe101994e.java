package com.bytedance.android.live.browser.jsbridge.widget;

import com.bytedance.android.live.browser.jsbridge.newmethods.C4002bp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C101061Pr5;

/* renamed from: com.bytedance.android.live.browser.jsbridge.widget.BridgeSupportWidget$onLoad$3$provideStatefulMethods$1$registerMethod$2 */
/* loaded from: classes8.dex */
public final class C4047xe101994e extends Lambda implements Function0<C4002bp> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101061Pr5 this$0;

    static {
        Covode.recordClassIndex(23054);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4047xe101994e(C101061Pr5 c101061Pr5) {
        super(0);
        this.this$0 = c101061Pr5;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.browser.jsbridge.newmethods.bp, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4002bp mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        DataCenter dataCenter = this.this$0.LIZIZ.LIZIZ.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new C4002bp(dataCenter);
    }
}