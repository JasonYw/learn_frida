package com.bytedance.android.live.broadcast.widget;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes5.dex */
public final class PreviewPaidLiveInfoWidget$coverView$2 extends Lambda implements Function0<FrameLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewPaidLiveInfoWidget this$0;

    static {
        Covode.recordClassIndex(18625);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPaidLiveInfoWidget$coverView$2(PreviewPaidLiveInfoWidget previewPaidLiveInfoWidget) {
        super(0);
        this.this$0 = previewPaidLiveInfoWidget;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.FrameLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.widget.FrameLayout, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ FrameLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ?? LIZ = C116971W2r.LIZ(LayoutInflater.from(this.this$0.context), 2131698469, (ViewGroup) this.this$0.LJI, false);
        if (LIZ != 0) {
            return LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
    }
}
