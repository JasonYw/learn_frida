package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameBottomButtonWidget$onUpdate$4 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameBottomButtonWidget this$0;

    static {
        Covode.recordClassIndex(16373);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameBottomButtonWidget$onUpdate$4(GameBottomButtonWidget gameBottomButtonWidget) {
        super(1);
        this.this$0 = gameBottomButtonWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                ReserveButton reserveButton = this.this$0.LIZIZ;
                if (reserveButton != null) {
                    reserveButton.LIZ();
                }
            } else {
                ReserveButton reserveButton2 = this.this$0.LIZIZ;
                if (reserveButton2 != null) {
                    reserveButton2.LIZIZ();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
