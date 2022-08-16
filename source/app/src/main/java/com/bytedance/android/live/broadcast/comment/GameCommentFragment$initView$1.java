package com.bytedance.android.live.broadcast.comment;

import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88975L3x;

/* loaded from: classes5.dex */
public final class GameCommentFragment$initView$1 extends Lambda implements Function1<Boolean, Unit> {
    public final /* synthetic */ C88975L3x this$0;

    static {
        Covode.recordClassIndex(15246);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCommentFragment$initView$1(C88975L3x c88975L3x) {
        super(1);
        this.this$0 = c88975L3x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        this.this$0.LIZJ = bool.booleanValue();
        return Unit.INSTANCE;
    }
}
