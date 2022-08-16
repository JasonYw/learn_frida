package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.VideoInteractMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class StartLiveWidget$initStartLiveViewModel$4 extends Lambda implements Function1<VideoInteractMode, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveWidget this$0;

    static {
        Covode.recordClassIndex(18818);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$initStartLiveViewModel$4(StartLiveWidget startLiveWidget) {
        super(1);
        this.this$0 = startLiveWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(VideoInteractMode videoInteractMode) {
        if (!PatchProxy.proxy(new Object[]{videoInteractMode}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(videoInteractMode);
            StartLiveWidget startLiveWidget = this.this$0;
            startLiveWidget.LIZ(startLiveWidget.LJIIJJI().LIZ().LIZ());
        }
        return Unit.INSTANCE;
    }
}
