package com.bytedance.android.live.broadcast.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class CommentDetailListView$initView$5 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CommentDetailListView this$0;

    static {
        Covode.recordClassIndex(15220);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDetailListView$initView$5(CommentDetailListView commentDetailListView) {
        super(1);
        this.this$0 = commentDetailListView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && this.this$0.LJI != intValue) {
            CommentDetailListView commentDetailListView = this.this$0;
            commentDetailListView.LJIIIIZZ = true;
            commentDetailListView.LJII = 0;
            commentDetailListView.LIZ(intValue);
        }
        return Unit.INSTANCE;
    }
}
