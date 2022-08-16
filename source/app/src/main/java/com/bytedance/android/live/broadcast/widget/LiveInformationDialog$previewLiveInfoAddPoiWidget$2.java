package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LiveInformationDialog$previewLiveInfoAddPoiWidget$2 extends Lambda implements Function0<PreviewLiveInfoAddPoiWidget> {
    public static final LiveInformationDialog$previewLiveInfoAddPoiWidget$2 INSTANCE = new LiveInformationDialog$previewLiveInfoAddPoiWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18346);
    }

    public LiveInformationDialog$previewLiveInfoAddPoiWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.widget.PreviewLiveInfoAddPoiWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewLiveInfoAddPoiWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PreviewLiveInfoAddPoiWidget();
    }
}
