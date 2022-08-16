package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class PreviewSettingWidget$mHideTipsRunnable$2 extends Lambda implements Function0<Runnable> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSettingWidget this$0;

    static {
        Covode.recordClassIndex(18668);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSettingWidget$mHideTipsRunnable$2(PreviewSettingWidget previewSettingWidget) {
        super(0);
        this.this$0 = previewSettingWidget;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Runnable mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new Runnable() { // from class: com.bytedance.android.live.broadcast.widget.PreviewSettingWidget$mHideTipsRunnable$2.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18669);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                PreviewSettingWidget$mHideTipsRunnable$2.this.this$0.LJI();
            }
        };
    }
}
