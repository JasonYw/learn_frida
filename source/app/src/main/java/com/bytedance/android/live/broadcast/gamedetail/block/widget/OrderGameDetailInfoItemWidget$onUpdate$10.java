package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L3P;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class OrderGameDetailInfoItemWidget$onUpdate$10 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OrderGameDetailInfoItemWidget this$0;

    static {
        Covode.recordClassIndex(16417);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderGameDetailInfoItemWidget$onUpdate$10(OrderGameDetailInfoItemWidget orderGameDetailInfoItemWidget) {
        super(1);
        this.this$0 = orderGameDetailInfoItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && L3P.LIZ()) {
            if (intValue != 1) {
                View view = this.this$0.LIZLLL;
                if (view != null) {
                    view.setVisibility(8);
                }
                View view2 = this.this$0.f25867LJ;
                if (view2 != null) {
                    view2.setBackground(LK5.LIZJ(2130857618));
                }
            } else {
                View view3 = this.this$0.LIZLLL;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
                View view4 = this.this$0.f25867LJ;
                if (view4 != null) {
                    view4.setBackgroundColor(LK5.LIZIZ(2131623937));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
