package com.bytedance.android.live.liveinteract.newpk.p379vm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$7 */
/* loaded from: classes19.dex */
public final class PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$7 extends Lambda implements Function1<R, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $value;

    static {
        Covode.recordClassIndex(28571);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkTeamTaskStateMachine$stateMachine$1$$special$$inlined$state$7(Object obj) {
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
