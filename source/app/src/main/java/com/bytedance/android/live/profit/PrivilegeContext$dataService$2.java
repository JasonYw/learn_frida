package com.bytedance.android.live.profit;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.IQY;

/* loaded from: classes5.dex */
public final class PrivilegeContext$dataService$2 extends Lambda implements Function1<IQY<C5249c>, Unit> {
    public static final PrivilegeContext$dataService$2 INSTANCE = new PrivilegeContext$dataService$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33212);
    }

    public PrivilegeContext$dataService$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IQY<C5249c> iqy) {
        IQY<C5249c> iqy2 = iqy;
        if (!PatchProxy.proxy(new Object[]{iqy2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(iqy2);
            iqy2.f7561LJ = null;
        }
        return Unit.INSTANCE;
    }
}
