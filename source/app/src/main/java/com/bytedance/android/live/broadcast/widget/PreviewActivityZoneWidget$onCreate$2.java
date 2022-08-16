package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewActivityZoneWidget$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewActivityZoneWidget this$0;

    static {
        Covode.recordClassIndex(18399);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewActivityZoneWidget$onCreate$2(PreviewActivityZoneWidget previewActivityZoneWidget) {
        super(1);
        this.this$0 = previewActivityZoneWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
