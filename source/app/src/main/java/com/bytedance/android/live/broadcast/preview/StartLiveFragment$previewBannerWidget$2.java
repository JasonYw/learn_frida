package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.banner.widget.PreviewBannerWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class StartLiveFragment$previewBannerWidget$2 extends Lambda implements Function0<PreviewBannerWidget> {
    public static final StartLiveFragment$previewBannerWidget$2 INSTANCE = new StartLiveFragment$previewBannerWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17134);
    }

    public StartLiveFragment$previewBannerWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.banner.widget.PreviewBannerWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewBannerWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PreviewBannerWidget();
    }
}
