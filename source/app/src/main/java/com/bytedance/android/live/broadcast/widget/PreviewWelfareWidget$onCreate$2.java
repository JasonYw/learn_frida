package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C35G;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewWelfareWidget$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewWelfareWidget this$0;

    static {
        Covode.recordClassIndex(18776);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewWelfareWidget$onCreate$2(PreviewWelfareWidget previewWelfareWidget) {
        super(1);
        this.this$0 = previewWelfareWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            C35G.LIZIZ(false);
            PreviewStatusInfo LIZ = this.this$0.LJIIJJI().m15893LJ().LIZ();
            int LIZ2 = LIZ.LIZ();
            if (LIZ2 != 0 && LIZ2 != 4) {
                C88440Kt0.LIZ(view2.getContext().getString(2131586068, LK5.LIZ(2131587849), LIZ.LIZIZ()));
            } else {
                this.this$0.LIZJ();
            }
        }
        return Unit.INSTANCE;
    }
}
