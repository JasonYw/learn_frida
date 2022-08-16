package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import com.bytedance.android.live.broadcast.gamedetail.order.view.AnchorReverseBtnConfig;
import com.bytedance.android.live.broadcast.gamedetail.order.view.AudienceReverseBtnConfig;
import com.bytedance.android.live.broadcast.gamedetail.order.view.ReserveButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89020L5q;

/* loaded from: classes5.dex */
public final class GameBottomButtonWidget$onUpdate$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameBottomButtonWidget this$0;

    static {
        Covode.recordClassIndex(16370);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameBottomButtonWidget$onUpdate$2(GameBottomButtonWidget gameBottomButtonWidget) {
        super(1);
        this.this$0 = gameBottomButtonWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        final boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                if (this.this$0.LIZJ) {
                    ReserveButton reserveButton = this.this$0.LIZIZ;
                    if (reserveButton != null) {
                        reserveButton.setConfig(new AnchorReverseBtnConfig(AnchorReverseBtnConfig.State.CANCEL_PROMOTE));
                    }
                } else {
                    ReserveButton reserveButton2 = this.this$0.LIZIZ;
                    if (reserveButton2 != null) {
                        reserveButton2.setConfig(new AudienceReverseBtnConfig(AudienceReverseBtnConfig.State.CANCEL_RESERVE));
                    }
                }
            } else if (this.this$0.LIZJ) {
                ReserveButton reserveButton3 = this.this$0.LIZIZ;
                if (reserveButton3 != null) {
                    reserveButton3.setConfig(new AnchorReverseBtnConfig(AnchorReverseBtnConfig.State.IMMEDIATE_PROMOTION));
                }
            } else {
                ReserveButton reserveButton4 = this.this$0.LIZIZ;
                if (reserveButton4 != null) {
                    reserveButton4.setConfig(new AudienceReverseBtnConfig(AudienceReverseBtnConfig.State.IMMEDIATE_RESERVE));
                }
            }
            ReserveButton reserveButton5 = this.this$0.LIZIZ;
            if (reserveButton5 != null) {
                reserveButton5.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.widget.GameBottomButtonWidget$onUpdate$2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(16371);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        GameBottomButtonWidget$onUpdate$2.this.this$0.LIZJ(new C89020L5q(true ^ booleanValue));
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
