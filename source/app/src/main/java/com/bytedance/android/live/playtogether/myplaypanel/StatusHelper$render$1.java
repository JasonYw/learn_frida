package com.bytedance.android.live.playtogether.myplaypanel;

import android.view.View;
import com.bytedance.android.live.playtogether.p409c.C5212l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.LT5;

/* loaded from: classes5.dex */
public final class StatusHelper$render$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C5212l $order;
    public final /* synthetic */ LT5 this$0;

    static {
        Covode.recordClassIndex(33007);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusHelper$render$1(LT5 lt5, C5212l c5212l) {
        super(1);
        this.this$0 = lt5;
        this.$order = c5212l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJI.LIZIZ(this.$order);
        }
        return Unit.INSTANCE;
    }
}
