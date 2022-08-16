package com.bytedance.android.annie.card.web.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC90724Lok;
import p003X.C90746Lp6;

/* loaded from: classes5.dex */
public final class WebResourceProvider$forceUseForest$2 extends Lambda implements Function0<Boolean> {
    public static final WebResourceProvider$forceUseForest$2 INSTANCE = new WebResourceProvider$forceUseForest$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10726);
    }

    public WebResourceProvider$forceUseForest$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Boolean, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJJIII;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        return c90746Lp6.LIZ();
    }
}
