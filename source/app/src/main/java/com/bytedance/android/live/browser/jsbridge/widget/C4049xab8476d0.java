package com.bytedance.android.live.browser.jsbridge.widget;

import com.bytedance.android.live.browser.jsbridge.newmethods.C4012cu;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C101063Pr7;
import p003X.C439993ar;

/* renamed from: com.bytedance.android.live.browser.jsbridge.widget.BridgeSupportWidget$onLoad$5$provideStatefulMethods$1$registerMethod$2 */
/* loaded from: classes8.dex */
public final class C4049xab8476d0 extends Lambda implements Function0<C4012cu> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101063Pr7 this$0;

    static {
        Covode.recordClassIndex(23056);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4049xab8476d0(C101063Pr7 c101063Pr7) {
        super(0);
        this.this$0 = c101063Pr7;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.browser.jsbridge.newmethods.cu, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4012cu mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4012cu(C439993ar.LIZ(this.this$0.LIZIZ.LIZIZ.context));
    }
}
