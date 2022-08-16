package com.bytedance.android.annie.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.forest.model.C12101h;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C99665PNb;

/* loaded from: classes7.dex */
public final class RequestTaskAdapter$createRequestOption$1 extends Lambda implements Function1<C12101h, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C99665PNb this$0;

    static {
        Covode.recordClassIndex(10958);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestTaskAdapter$createRequestOption$1(C99665PNb c99665PNb) {
        super(1);
        this.this$0 = c99665PNb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C12101h c12101h) {
        C12101h c12101h2 = c12101h;
        if (!PatchProxy.proxy(new Object[]{c12101h2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c12101h2);
            this.this$0.LIZIZ.invoke(this.this$0.LIZ(c12101h2));
        }
        return Unit.INSTANCE;
    }
}
