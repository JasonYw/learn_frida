package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameDetailIntroItemWidget$updateMediaUrls$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailIntroItemWidget this$0;

    static {
        Covode.recordClassIndex(16758);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailIntroItemWidget$updateMediaUrls$3(GameDetailIntroItemWidget gameDetailIntroItemWidget) {
        super(1);
        this.this$0 = gameDetailIntroItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJFF().post(new Runnable() { // from class: com.bytedance.android.live.broadcast.gamedetailv2.widget.GameDetailIntroItemWidget$updateMediaUrls$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16759);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    GameDetailIntroItemWidget gameDetailIntroItemWidget = GameDetailIntroItemWidget$updateMediaUrls$3.this.this$0;
                    if (!PatchProxy.proxy(new Object[0], gameDetailIntroItemWidget, GameDetailIntroItemWidget.LIZ, false, 18).isSupported && gameDetailIntroItemWidget.LIZLLL && gameDetailIntroItemWidget.LJFF().getLocalVisibleRect(gameDetailIntroItemWidget.f25900LJ)) {
                        if (gameDetailIntroItemWidget.f25900LJ.top == 0 && gameDetailIntroItemWidget.f25900LJ.bottom == gameDetailIntroItemWidget.LJFF().getHeight()) {
                            gameDetailIntroItemWidget.LIZJ.LIZIZ();
                        } else {
                            gameDetailIntroItemWidget.LIZJ.LIZJ();
                        }
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
