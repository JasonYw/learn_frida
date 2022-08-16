package com.bytedance.android.live.browser;

import com.bytedance.android.annie.param.C2613i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C47A;

/* loaded from: classes8.dex */
public final class AnnieParamUtil$appendAllFinalParams$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2613i $param;

    static {
        Covode.recordClassIndex(21867);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieParamUtil$appendAllFinalParams$3(C2613i c2613i) {
        super(0);
        this.$param = c2613i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$param.LJJLIIIJLLLLLLLZ = C47A.LIZ() ? 1 : 0;
        }
        return Unit.INSTANCE;
    }
}
