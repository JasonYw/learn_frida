package com.bytedance.android.latch.internal.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.SingleEmitter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class ExtKt$asyncWithEmitter$1 extends Lambda implements Function1<T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SingleEmitter $emitter;

    static {
        Covode.recordClassIndex(13750);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtKt$asyncWithEmitter$1(SingleEmitter singleEmitter) {
        super(1);
        this.$emitter = singleEmitter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(obj);
            this.$emitter.onSuccess(obj);
        }
        return Unit.INSTANCE;
    }
}
