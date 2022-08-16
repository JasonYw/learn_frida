package com.bytedance.android.live.core.arch.mvvm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.QBJ;

/* loaded from: classes8.dex */
public final class StateBuffer$Companion$create$1 extends Lambda implements Function1<T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ QBJ $buf;

    static {
        Covode.recordClassIndex(23307);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateBuffer$Companion$create$1(Function2 function2, QBJ qbj) {
        super(1);
        this.$block = function2;
        this.$buf = qbj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$block.invoke(this.$buf, obj);
        }
        return Unit.INSTANCE;
    }
}
