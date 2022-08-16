package com.bytedance.android.live.core.utils.rxutils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class RxUtilKt$getOnErrorNoOp$1 extends Lambda implements Function1<Throwable, Unit> {
    public static final RxUtilKt$getOnErrorNoOp$1 INSTANCE = new RxUtilKt$getOnErrorNoOp$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23977);
    }

    public RxUtilKt$getOnErrorNoOp$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th);
        }
        return Unit.INSTANCE;
    }
}
