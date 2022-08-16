package com.bytedance.android.live.broadcast.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class CommentDetailListView$initView$7 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ CommentDetailListView this$0;

    static {
        Covode.recordClassIndex(15222);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentDetailListView$initView$7(CommentDetailListView commentDetailListView) {
        super(1);
        this.this$0 = commentDetailListView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue) {
            this.this$0.LJIILJJIL.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
