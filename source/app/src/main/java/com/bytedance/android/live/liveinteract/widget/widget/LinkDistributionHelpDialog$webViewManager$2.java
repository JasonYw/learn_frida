package com.bytedance.android.live.liveinteract.widget.widget;

import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LinkDistributionHelpDialog$webViewManager$2 extends Lambda implements Function0<IBrowserService> {
    public static final LinkDistributionHelpDialog$webViewManager$2 INSTANCE = new LinkDistributionHelpDialog$webViewManager$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31936);
    }

    public LinkDistributionHelpDialog$webViewManager$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.base.IService, com.bytedance.android.live.browser.IBrowserService] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.browser.IBrowserService] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IBrowserService mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ServiceManager.getService(IBrowserService.class);
    }
}
