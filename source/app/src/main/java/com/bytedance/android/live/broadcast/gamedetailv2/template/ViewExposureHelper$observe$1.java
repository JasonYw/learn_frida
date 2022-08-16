package com.bytedance.android.live.broadcast.gamedetailv2.template;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C3799613e;

/* loaded from: classes.dex */
public final class ViewExposureHelper$observe$1 extends Lambda implements Function2<Boolean, Float, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3799613e this$0;

    static {
        Covode.recordClassIndex(16698);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewExposureHelper$observe$1(C3799613e c3799613e) {
        super(2);
        this.this$0 = c3799613e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Float f) {
        T t;
        Function2<? super Boolean, ? super T, Unit> function2;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Float.valueOf(f.floatValue())}, this, changeQuickRedirect, false, 1).isSupported && (t = this.this$0.LIZIZ) != 0 && (function2 = this.this$0.LIZJ) != 0) {
            function2.invoke(Boolean.valueOf(booleanValue), t);
        }
        return Unit.INSTANCE;
    }
}
