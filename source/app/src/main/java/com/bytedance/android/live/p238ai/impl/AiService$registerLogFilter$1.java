package com.bytedance.android.live.p238ai.impl;

import com.bytedance.android.live.p238ai.impl.p240b.AbstractC2791e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C4574547f;
import p003X.C91478M2e;
import p003X.C91479M2f;

/* renamed from: com.bytedance.android.live.ai.impl.AiService$registerLogFilter$1 */
/* loaded from: classes5.dex */
public final class AiService$registerLogFilter$1 extends Lambda implements Function0<Unit> {
    public static final AiService$registerLogFilter$1 INSTANCE = new AiService$registerLogFilter$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13838);
    }

    public AiService$registerLogFilter$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C4574547f.LIZ().LIZ("AiServiceLogFilter", C91478M2e.LIZJ);
            C91478M2e.LIZJ.LIZ((AbstractC2791e) C91479M2f.LIZIZ);
        }
        return Unit.INSTANCE;
    }
}
