package com.bytedance.android.live.core.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.QL7;

/* loaded from: classes8.dex */
public final class StateMachine$Matcher$predicates$1 extends Lambda implements Function1<T, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ QL7 this$0;

    static {
        Covode.recordClassIndex(23827);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMachine$Matcher$predicates$1(QL7 ql7) {
        super(1);
        this.this$0 = ql7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Object obj) {
        boolean isInstance;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            isInstance = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(obj);
            isInstance = this.this$0.LIZIZ.isInstance(obj);
        }
        return Boolean.valueOf(isInstance);
    }
}
