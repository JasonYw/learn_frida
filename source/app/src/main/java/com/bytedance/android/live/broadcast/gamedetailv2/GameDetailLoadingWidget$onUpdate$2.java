package com.bytedance.android.live.broadcast.gamedetailv2;

import android.view.View;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class GameDetailLoadingWidget$onUpdate$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailLoadingWidget this$0;

    static {
        Covode.recordClassIndex(16587);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailLoadingWidget$onUpdate$2(GameDetailLoadingWidget gameDetailLoadingWidget) {
        super(1);
        this.this$0 = gameDetailLoadingWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                this.this$0.LIZJ();
            } else {
                GameDetailLoadingWidget gameDetailLoadingWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[0], gameDetailLoadingWidget, GameDetailLoadingWidget.LIZ, false, 7).isSupported) {
                    View view = gameDetailLoadingWidget.contentView;
                    Intrinsics.checkNotNullExpressionValue(view, "");
                    LK1.LIZ(view);
                    LoadingStatusView loadingStatusView = gameDetailLoadingWidget.LIZIZ;
                    if (loadingStatusView != null) {
                        LK1.LIZ((View) loadingStatusView);
                    }
                    LoadingStatusView loadingStatusView2 = gameDetailLoadingWidget.LIZIZ;
                    if (loadingStatusView2 != null) {
                        loadingStatusView2.LIZ();
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
