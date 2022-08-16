package com.bytedance.android.live.broadcast.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class CommentDetailListView$getErrorView$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CommentDetailListView this$0;

    static {
        Covode.recordClassIndex(15217);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDetailListView$getErrorView$1(CommentDetailListView commentDetailListView) {
        super(0);
        this.this$0 = commentDetailListView;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            CommentDetailListView commentDetailListView = this.this$0;
            commentDetailListView.LIZ(commentDetailListView.LJI);
        }
        return Unit.INSTANCE;
    }
}
