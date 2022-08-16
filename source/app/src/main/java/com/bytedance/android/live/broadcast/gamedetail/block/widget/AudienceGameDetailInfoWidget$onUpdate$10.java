package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceGameDetailInfoWidget$onUpdate$10 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameDetailInfoWidget this$0;

    static {
        Covode.recordClassIndex(16328);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameDetailInfoWidget$onUpdate$10(AudienceGameDetailInfoWidget audienceGameDetailInfoWidget) {
        super(1);
        this.this$0 = audienceGameDetailInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && this.this$0.LIZIZ) {
            if (intValue != 1) {
                View view = this.this$0.LIZJ;
                if (view != null) {
                    view.setVisibility(8);
                }
                ConstraintLayout constraintLayout = this.this$0.LIZLLL;
                if (constraintLayout != null) {
                    constraintLayout.setBackground(LK5.LIZJ(2130855877));
                }
            } else {
                View view2 = this.this$0.LIZJ;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ConstraintLayout constraintLayout2 = this.this$0.LIZLLL;
                if (constraintLayout2 != null) {
                    constraintLayout2.setBackgroundColor(LK5.LIZIZ(2131623937));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
