package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewPaidLiveWidget$onCreate$3 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewPaidLiveWidget this$0;

    static {
        Covode.recordClassIndex(18635);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPaidLiveWidget$onCreate$3(PreviewPaidLiveWidget previewPaidLiveWidget) {
        super(1);
        this.this$0 = previewPaidLiveWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            if (Intrinsics.areEqual(previewSourceParam2.openPaidLivePanel, Boolean.TRUE)) {
                ALogger.m15801d(this.this$0.LIZ(), "receive sourceParam auto open panel");
                PreviewPaidLiveWidget previewPaidLiveWidget = this.this$0;
                previewPaidLiveWidget.LIZLLL = true;
                previewPaidLiveWidget.LIZJ();
            }
        }
        return Unit.INSTANCE;
    }
}
