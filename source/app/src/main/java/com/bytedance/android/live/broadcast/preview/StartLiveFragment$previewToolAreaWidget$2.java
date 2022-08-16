package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.AbstractC2873ap;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$previewToolAreaWidget$2 extends Lambda implements Function0<AbsPreviewWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17172);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$previewToolAreaWidget$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbsPreviewWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC2873ap abstractC2873ap = this.this$0.LJIJ;
        if (abstractC2873ap != null) {
            return abstractC2873ap.LIZ(KJV.LIZ(this.this$0));
        }
        return null;
    }
}
