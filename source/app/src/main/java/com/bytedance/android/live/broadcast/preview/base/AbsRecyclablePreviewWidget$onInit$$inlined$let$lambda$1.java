package com.bytedance.android.live.broadcast.preview.base;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AbsRecyclablePreviewWidget$onInit$$inlined$let$lambda$1 extends Lambda implements Function1<LiveMode, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbsRecyclablePreviewWidget this$0;

    static {
        Covode.recordClassIndex(17220);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsRecyclablePreviewWidget$onInit$$inlined$let$lambda$1(AbsRecyclablePreviewWidget absRecyclablePreviewWidget) {
        super(1);
        this.this$0 = absRecyclablePreviewWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LiveMode liveMode) {
        LiveMode liveMode2 = liveMode;
        if (!PatchProxy.proxy(new Object[]{liveMode2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(liveMode2);
            this.this$0.LIZ(liveMode2);
        }
        return Unit.INSTANCE;
    }
}
