package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.widget.PreviewThirdPartyEntranceWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class StartLiveFragment$previewThirdPartyEntranceWidget$2 extends Lambda implements Function0<PreviewThirdPartyEntranceWidget> {
    public static final StartLiveFragment$previewThirdPartyEntranceWidget$2 INSTANCE = new StartLiveFragment$previewThirdPartyEntranceWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17171);
    }

    public StartLiveFragment$previewThirdPartyEntranceWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.widget.PreviewThirdPartyEntranceWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewThirdPartyEntranceWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PreviewThirdPartyEntranceWidget();
    }
}