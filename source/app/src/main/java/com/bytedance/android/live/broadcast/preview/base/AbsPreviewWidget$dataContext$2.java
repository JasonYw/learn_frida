package com.bytedance.android.live.broadcast.preview.base;

import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AbsPreviewWidget$dataContext$2 extends Lambda implements Function0<C3180k> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbsPreviewWidget this$0;

    static {
        Covode.recordClassIndex(17214);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsPreviewWidget$dataContext$2(AbsPreviewWidget absPreviewWidget) {
        super(0);
        this.this$0 = absPreviewWidget;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.preview.k, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3180k mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C3180k c3180k = this.this$0.LJIIIZ;
        if (c3180k != null) {
            return c3180k;
        }
        ALogger.m15800e(this.this$0.LIZ(), "fatal widget error, null dataContext");
        return new C3180k();
    }
}
