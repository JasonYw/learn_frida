package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class StartLiveWidget$previewWidgetContext$2 extends Lambda implements Function0<C3180k> {
    public static final StartLiveWidget$previewWidgetContext$2 INSTANCE = new StartLiveWidget$previewWidgetContext$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18822);
    }

    public StartLiveWidget$previewWidgetContext$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.preview.k, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3180k mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C3180k.LIZLLL.LIZ();
    }
}
