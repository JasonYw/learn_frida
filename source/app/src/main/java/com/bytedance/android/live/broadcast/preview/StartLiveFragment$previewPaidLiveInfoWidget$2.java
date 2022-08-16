package com.bytedance.android.live.broadcast.preview;

import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.widget.PreviewPaidLiveInfoWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$previewPaidLiveInfoWidget$2 extends Lambda implements Function0<PreviewPaidLiveInfoWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17160);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$previewPaidLiveInfoWidget$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcast.widget.PreviewPaidLiveInfoWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewPaidLiveInfoWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PreviewPaidLiveInfoWidget((FrameLayout) this.this$0.m23490LJ(2131193090), (FrameLayout) this.this$0.m23490LJ(2131193089), (FrameLayout) this.this$0.m23490LJ(2131193088));
    }
}
