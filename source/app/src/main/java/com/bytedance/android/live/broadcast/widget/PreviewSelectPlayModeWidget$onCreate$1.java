package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.model.VideoInteractMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewSelectPlayModeWidget$onCreate$1 extends Lambda implements Function1<VideoInteractMode, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewSelectPlayModeWidget this$0;

    static {
        Covode.recordClassIndex(18651);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSelectPlayModeWidget$onCreate$1(PreviewSelectPlayModeWidget previewSelectPlayModeWidget) {
        super(1);
        this.this$0 = previewSelectPlayModeWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(VideoInteractMode videoInteractMode) {
        VideoInteractMode videoInteractMode2 = videoInteractMode;
        if (!PatchProxy.proxy(new Object[]{videoInteractMode2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(videoInteractMode2);
            this.this$0.LIZIZ().LJJIJIIJI().LIZ(Integer.valueOf(videoInteractMode2.linkMicScene));
        }
        return Unit.INSTANCE;
    }
}
