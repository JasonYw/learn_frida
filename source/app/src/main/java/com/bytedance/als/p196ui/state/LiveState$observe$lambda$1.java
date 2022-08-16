package com.bytedance.als.p196ui.state;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC526426qy;

/* renamed from: com.bytedance.als.ui.state.LiveState$observe$lambda$1 */
/* loaded from: classes23.dex */
public final class LiveState$observe$lambda$1 extends Lambda implements Function1<T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC526426qy $observer;

    static {
        Covode.recordClassIndex(10090);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveState$observe$lambda$1(AbstractC526426qy abstractC526426qy) {
        super(1);
        this.$observer = abstractC526426qy;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Object obj) {
        if (!PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$observer.onChanged(obj);
        }
        return Unit.INSTANCE;
    }
}
