package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.AbstractC2930as;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KJV;

/* loaded from: classes3.dex */
public final class StartLiveFragment$startLiveVisibilityServiceWidget$2 extends Lambda implements Function0<Widget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17191);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$startLiveVisibilityServiceWidget$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.ies.sdk.widgets.Widget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Widget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC2930as abstractC2930as = this.this$0.LJIJI;
        if (abstractC2930as != null) {
            return abstractC2930as.LIZ(this.this$0.hashCode());
        }
        return null;
    }
}
