package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class StartLiveFragment$previewGameCategoryWidget$2 extends Lambda implements Function0<PreviewGameCategoryWidget> {
    public static final StartLiveFragment$previewGameCategoryWidget$2 INSTANCE = new StartLiveFragment$previewGameCategoryWidget$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17146);
    }

    public StartLiveFragment$previewGameCategoryWidget$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.category.viewmodel.PreviewGameCategoryWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewGameCategoryWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PreviewGameCategoryWidget();
    }
}
