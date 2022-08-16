package com.bytedance.android.live.broadcast.gamedetailv2.pageview;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L4U;
import p003X.L5E;

/* loaded from: classes5.dex */
public final class GameCommentPageView$initRecyclerView$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L5E this$0;

    static {
        Covode.recordClassIndex(16664);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentPageView$initRecyclerView$3(L5E l5e) {
        super(1);
        this.this$0 = l5e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        L4U l4u;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && ((l4u = this.this$0.LJFF) == null || l4u.LIZIZ != intValue)) {
            L5E l5e = this.this$0;
            l5e.LJIIIIZZ = true;
            l5e.LJII = 0;
            l5e.LIZ(intValue);
        }
        return Unit.INSTANCE;
    }
}
