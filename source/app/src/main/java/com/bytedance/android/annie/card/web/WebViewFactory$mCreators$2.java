package com.bytedance.android.annie.card.web;

import com.bytedance.android.annie.card.web.WebViewFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class WebViewFactory$mCreators$2 extends Lambda implements Function0<HashMap<WebViewFactory.WebViewType, WebViewFactory.AbstractC2602a>> {
    public static final WebViewFactory$mCreators$2 INSTANCE = new WebViewFactory$mCreators$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10696);
    }

    public WebViewFactory$mCreators$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap<com.bytedance.android.annie.card.web.WebViewFactory$WebViewType, com.bytedance.android.annie.card.web.WebViewFactory$a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HashMap<WebViewFactory.WebViewType, WebViewFactory.AbstractC2602a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new HashMap<>();
    }
}
