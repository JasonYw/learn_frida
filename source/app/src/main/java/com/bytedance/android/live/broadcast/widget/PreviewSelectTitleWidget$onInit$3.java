package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class PreviewSelectTitleWidget$onInit$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSelectTitleWidget this$0;

    static {
        Covode.recordClassIndex(18660);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSelectTitleWidget$onInit$3(PreviewSelectTitleWidget previewSelectTitleWidget) {
        super(1);
        this.this$0 = previewSelectTitleWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            PreviewSelectTitleWidget previewSelectTitleWidget = this.this$0;
            previewSelectTitleWidget.LIZIZ(previewSelectTitleWidget.LIZIZ().LIZ().LIZ());
        }
        return Unit.INSTANCE;
    }
}
