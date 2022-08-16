package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkOperationalPlayStateMachine$stateMachine$1$$special$$inlined$state$4 */
/* loaded from: classes3.dex */
public final class C4600x9d52d2f5 extends Lambda implements Function1<R, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $value;

    static {
        Covode.recordClassIndex(28529);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600x9d52d2f5(Object obj) {
        super(1);
        this.$value = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Object obj) {
        boolean areEqual;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            areEqual = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(obj);
            areEqual = Intrinsics.areEqual(obj, this.$value);
        }
        return Boolean.valueOf(areEqual);
    }
}
