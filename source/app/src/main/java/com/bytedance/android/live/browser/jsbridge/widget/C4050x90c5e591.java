package com.bytedance.android.live.browser.jsbridge.widget;

import android.app.Activity;
import com.bytedance.android.live.browser.jsbridge.newmethods.C4026fa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C101060Pr4;
import p003X.C439993ar;

/* renamed from: com.bytedance.android.live.browser.jsbridge.widget.BridgeSupportWidget$onLoad$6$provideStatefulMethods$1$registerMethod$2 */
/* loaded from: classes8.dex */
public final class C4050x90c5e591 extends Lambda implements Function0<C4026fa> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101060Pr4 this$0;

    static {
        Covode.recordClassIndex(23057);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4050x90c5e591(C101060Pr4 c101060Pr4) {
        super(0);
        this.this$0 = c101060Pr4;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.bytedance.android.live.browser.jsbridge.newmethods.fa] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4026fa mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Activity LIZ = C439993ar.LIZ(this.this$0.LIZIZ.LIZIZ.context);
        DataCenter dataCenter = this.this$0.LIZIZ.LIZIZ.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new C4026fa(LIZ, dataCenter);
    }
}
