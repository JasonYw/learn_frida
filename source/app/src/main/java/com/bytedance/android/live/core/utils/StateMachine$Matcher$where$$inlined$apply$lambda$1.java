package com.bytedance.android.live.core.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class StateMachine$Matcher$where$$inlined$apply$lambda$1 extends Lambda implements Function1<T, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $predicate$inlined;

    static {
        Covode.recordClassIndex(23828);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$Matcher$where$$inlined$apply$lambda$1(Function1 function1) {
        super(1);
        this.$predicate$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Object obj) {
        boolean booleanValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            booleanValue = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(obj);
            booleanValue = ((Boolean) this.$predicate$inlined.invoke(obj)).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
