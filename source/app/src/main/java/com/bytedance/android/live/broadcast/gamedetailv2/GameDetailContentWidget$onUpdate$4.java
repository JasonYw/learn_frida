package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameDetailContentWidget$onUpdate$4 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailContentWidget this$0;

    static {
        Covode.recordClassIndex(16580);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailContentWidget$onUpdate$4(GameDetailContentWidget gameDetailContentWidget) {
        super(1);
        this.this$0 = gameDetailContentWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue == 200) {
                this.this$0.LIZ(false);
            } else {
                this.this$0.LIZ().LJIIJJI();
                this.this$0.LIZ().LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
