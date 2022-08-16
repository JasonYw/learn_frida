package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.p518ui.DouyinLoadingLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class GameLoadingWidget$onUpdate$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameLoadingWidget this$0;

    static {
        Covode.recordClassIndex(16396);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameLoadingWidget$onUpdate$2(GameLoadingWidget gameLoadingWidget) {
        super(1);
        this.this$0 = gameLoadingWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                DouyinLoadingLayout douyinLoadingLayout = this.this$0.LIZIZ;
                if (douyinLoadingLayout != null) {
                    LK1.LIZJ(douyinLoadingLayout);
                }
                DouyinLoadingLayout douyinLoadingLayout2 = this.this$0.LIZIZ;
                if (douyinLoadingLayout2 != null) {
                    douyinLoadingLayout2.LIZ();
                }
            } else {
                DouyinLoadingLayout douyinLoadingLayout3 = this.this$0.LIZIZ;
                if (douyinLoadingLayout3 != null) {
                    douyinLoadingLayout3.LIZIZ();
                }
                DouyinLoadingLayout douyinLoadingLayout4 = this.this$0.LIZIZ;
                if (douyinLoadingLayout4 != null) {
                    LK1.LIZ((View) douyinLoadingLayout4);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
