package com.bytedance.android.live.core.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.utils.StateMachine$GraphBuilder$StateDefinitionBuilder$onExit$$inlined$with$lambda$1 */
/* loaded from: classes3.dex */
public final class C4147x7ca24d98 extends Lambda implements Function2<STATE, EVENT, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function2 $listener$inlined;

    static {
        Covode.recordClassIndex(23826);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4147x7ca24d98(Function2 function2) {
        super(2);
        this.$listener$inlined = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Object obj, Object obj2) {
        if (!PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(obj, obj2);
            this.$listener$inlined.invoke(obj, obj2);
        }
        return Unit.INSTANCE;
    }
}
