package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.category.viewmodel.PreviewLiveInfoGameCategoryWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LiveInformationDialog$previewLiveInfoGameCategoryWidget$2 extends Lambda implements Function0<PreviewLiveInfoGameCategoryWidget> {
    public static final LiveInformationDialog$previewLiveInfoGameCategoryWidget$2 INSTANCE = new LiveInformationDialog$previewLiveInfoGameCategoryWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18347);
    }

    public LiveInformationDialog$previewLiveInfoGameCategoryWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.broadcast.category.viewmodel.PreviewLiveInfoGameCategoryWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewLiveInfoGameCategoryWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PreviewLiveInfoGameCategoryWidget();
    }
}
