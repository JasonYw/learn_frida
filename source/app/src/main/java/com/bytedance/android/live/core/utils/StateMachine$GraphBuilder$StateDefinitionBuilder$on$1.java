package com.bytedance.android.live.core.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C103396Qne;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class StateMachine$GraphBuilder$StateDefinitionBuilder$on$1 extends Lambda implements Function2<STATE, EVENT, C103396Qne<? extends STATE, ? extends SIDE_EFFECT>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function2 $createTransitionTo;

    static {
        Covode.recordClassIndex(23824);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$GraphBuilder$StateDefinitionBuilder$on$1(Function2 function2) {
        super(2);
        this.$createTransitionTo = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(obj, obj2);
        return this.$createTransitionTo.invoke(obj, obj2);
    }
}
