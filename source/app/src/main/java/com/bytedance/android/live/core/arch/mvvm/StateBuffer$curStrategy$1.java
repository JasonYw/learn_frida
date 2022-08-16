package com.bytedance.android.live.core.arch.mvvm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.QBJ;

/* loaded from: classes8.dex */
public final /* synthetic */ class StateBuffer$curStrategy$1 extends FunctionReferenceImpl implements Function1<T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23308);
    }

    public StateBuffer$curStrategy$1(QBJ qbj) {
        super(1, qbj, QBJ.class, "processState", "processState(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1).isSupported) {
            ((QBJ) this.receiver).LIZ((QBJ) obj);
        }
        return Unit.INSTANCE;
    }
}
