package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class GameDeveloperInfoWidget$onUpdate$6 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDeveloperInfoWidget this$0;

    static {
        Covode.recordClassIndex(16389);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDeveloperInfoWidget$onUpdate$6(GameDeveloperInfoWidget gameDeveloperInfoWidget) {
        super(1);
        this.this$0 = gameDeveloperInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                View view = this.this$0.contentView;
                Intrinsics.checkNotNullExpressionValue(view, "");
                view.setBackground(LK5.LIZJ(2130854432));
            } else {
                this.this$0.contentView.setBackgroundColor(LK5.LIZIZ(2131626090));
            }
        }
        return Unit.INSTANCE;
    }
}
