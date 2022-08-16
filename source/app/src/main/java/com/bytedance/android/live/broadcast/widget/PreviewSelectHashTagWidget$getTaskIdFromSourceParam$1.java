package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.C2919v;
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
import p003X.C86816KIw;

/* loaded from: classes5.dex */
public final class PreviewSelectHashTagWidget$getTaskIdFromSourceParam$1 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSelectHashTagWidget this$0;

    static {
        Covode.recordClassIndex(18646);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSelectHashTagWidget$getTaskIdFromSourceParam$1(PreviewSelectHashTagWidget previewSelectHashTagWidget) {
        super(1);
        this.this$0 = previewSelectHashTagWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            C2919v LIZ = previewSourceParam2.LIZ();
            if (LIZ != null) {
                String LIZ2 = C86816KIw.LIZ(LIZ);
                if (LIZ2.length() > 0) {
                    PreviewSelectHashTagWidget previewSelectHashTagWidget = this.this$0;
                    String str = previewSourceParam2.challengeId;
                    if (str == null || str.length() <= 0 || !Intrinsics.areEqual(previewSourceParam2.challengeTaskOptional, Boolean.FALSE)) {
                        z = false;
                    }
                    previewSelectHashTagWidget.LJIILJJIL = z;
                    String LIZ3 = this.this$0.LIZ();
                    ALogger.m15795w(LIZ3, "get task_id " + LIZ2 + " from sourceParam, needShowToast: " + this.this$0.LJIILJJIL);
                } else {
                    String LIZ4 = this.this$0.LIZ();
                    ALogger.m15800e(LIZ4, "get task_id error,invalid sourceParam " + LIZ);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
