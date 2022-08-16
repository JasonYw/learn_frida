package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorService$launchFrom$2 extends Lambda implements Function0<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OpenPlatformMonitorService this$0;

    static {
        Covode.recordClassIndex(21004);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorService$launchFrom$2(OpenPlatformMonitorService openPlatformMonitorService) {
        super(0);
        this.this$0 = openPlatformMonitorService;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.this$0.LJII().LJIIJ) {
            return "anchor";
        }
        if (this.this$0.LJII().LJIIJJI) {
            return "preview";
        }
        return "audience";
    }
}
