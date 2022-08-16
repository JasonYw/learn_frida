package com.bytedance.android.latch.internal;

import com.bytedance.android.latch.internal.util.LatchException;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137655ckl;
import p003X.C106862S5w;
import p003X.C137651ckh;

/* loaded from: classes17.dex */
public final class BaseLatchProcess$createStateHolder$3 extends Lambda implements Function1<LatchException, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC137655ckl this$0;

    static {
        Covode.recordClassIndex(13703);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLatchProcess$createStateHolder$3(AbstractC137655ckl abstractC137655ckl) {
        super(1);
        this.this$0 = abstractC137655ckl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LatchException latchException) {
        LatchException latchException2 = latchException;
        if (!PatchProxy.proxy(new Object[]{latchException2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(latchException2);
            this.this$0.LIZ(new C137651ckh(latchException2));
        }
        return Unit.INSTANCE;
    }
}
