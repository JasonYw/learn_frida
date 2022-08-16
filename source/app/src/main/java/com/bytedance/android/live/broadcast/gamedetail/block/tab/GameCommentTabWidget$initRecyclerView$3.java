package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L4U;

/* loaded from: classes5.dex */
public final class GameCommentTabWidget$initRecyclerView$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameCommentTabWidget this$0;

    static {
        Covode.recordClassIndex(16292);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentTabWidget$initRecyclerView$3(GameCommentTabWidget gameCommentTabWidget) {
        super(1);
        this.this$0 = gameCommentTabWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        L4U l4u;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && ((l4u = this.this$0.LJFF) == null || l4u.LIZIZ != intValue)) {
            GameCommentTabWidget gameCommentTabWidget = this.this$0;
            gameCommentTabWidget.LJIIIIZZ = true;
            gameCommentTabWidget.LJII = 0;
            gameCommentTabWidget.LIZ(intValue);
        }
        return Unit.INSTANCE;
    }
}
