package com.bytedance.android.live.broadcast.gamedetailv2.pageview;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L46;
import p003X.L5E;

/* loaded from: classes5.dex */
public final class GameCommentPageView$initRecyclerView$4 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L5E this$0;

    static {
        Covode.recordClassIndex(16665);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentPageView$initRecyclerView$4(L5E l5e) {
        super(1);
        this.this$0 = l5e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            L5E l5e = this.this$0;
            l5e.LJIIJ = booleanValue;
            if (booleanValue) {
                L46.LIZIZ.LIZ(System.currentTimeMillis() - this.this$0.LJIIL);
            } else {
                l5e.LJIIL = System.currentTimeMillis();
            }
        }
        return Unit.INSTANCE;
    }
}
