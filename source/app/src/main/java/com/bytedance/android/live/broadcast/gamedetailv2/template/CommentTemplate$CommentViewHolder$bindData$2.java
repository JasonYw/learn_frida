package com.bytedance.android.live.broadcast.gamedetailv2.template;

import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class CommentTemplate$CommentViewHolder$bindData$2 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ c$a this$0;

    static {
        Covode.recordClassIndex(16689);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTemplate$CommentViewHolder$bindData$2(c$a c_a) {
        super(1);
        this.this$0 = c_a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        this.this$0.f25890LJ = bool.booleanValue();
        return Unit.INSTANCE;
    }
}
