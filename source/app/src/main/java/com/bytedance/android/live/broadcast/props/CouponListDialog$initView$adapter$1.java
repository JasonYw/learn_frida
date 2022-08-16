package com.bytedance.android.live.broadcast.props;

import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.LC8;

/* loaded from: classes3.dex */
public final class CouponListDialog$initView$adapter$1 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public final /* synthetic */ LC8 this$0;

    static {
        Covode.recordClassIndex(17579);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CouponListDialog$initView$adapter$1(LC8 lc8) {
        super(2);
        this.this$0 = lc8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        int intValue = num.intValue();
        bool.booleanValue();
        this.this$0.f8795LJ = intValue;
        return Unit.INSTANCE;
    }
}
