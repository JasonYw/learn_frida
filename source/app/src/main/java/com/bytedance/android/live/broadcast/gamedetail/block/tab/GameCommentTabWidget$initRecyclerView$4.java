package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L46;

/* loaded from: classes5.dex */
public final class GameCommentTabWidget$initRecyclerView$4 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameCommentTabWidget this$0;

    static {
        Covode.recordClassIndex(16293);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentTabWidget$initRecyclerView$4(GameCommentTabWidget gameCommentTabWidget) {
        super(1);
        this.this$0 = gameCommentTabWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            GameCommentTabWidget gameCommentTabWidget = this.this$0;
            gameCommentTabWidget.LJIIJ = booleanValue;
            if (booleanValue) {
                L46.LIZIZ.LIZ(System.currentTimeMillis() - this.this$0.LJIIL);
            } else {
                gameCommentTabWidget.LJIIL = System.currentTimeMillis();
            }
        }
        return Unit.INSTANCE;
    }
}
