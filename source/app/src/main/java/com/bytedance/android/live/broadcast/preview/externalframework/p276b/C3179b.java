package com.bytedance.android.live.broadcast.preview.externalframework.p276b;

import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.AbstractC9671d;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.AbstractC9672e;
import com.bytedance.android.livesdkapi.room.handler.viewinterface.ExternalViewGroupAction;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C4302530p;

/* renamed from: com.bytedance.android.live.broadcast.preview.externalframework.b.b */
/* loaded from: classes5.dex */
public final class C3179b implements Function3<AbstractC9672e, AbstractC9671d, ExternalViewGroupAction, Unit> {
    public static ChangeQuickRedirect LIZ;
    public final C3180k LIZIZ;

    static {
        Covode.recordClassIndex(17258);
    }

    public C3179b(C3180k c3180k) {
        C106862S5w.LIZ(c3180k);
        this.LIZIZ = c3180k;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(AbstractC9672e abstractC9672e, AbstractC9671d abstractC9671d, ExternalViewGroupAction externalViewGroupAction) {
        AbstractC9672e abstractC9672e2 = abstractC9672e;
        if (!PatchProxy.proxy(new Object[]{abstractC9672e2, abstractC9671d, externalViewGroupAction}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9672e2, abstractC9671d, externalViewGroupAction);
            if (externalViewGroupAction == ExternalViewGroupAction.Add && (!Intrinsics.areEqual(abstractC9671d, C4302530p.LIZIZ))) {
                PreviewStatusInfo LIZ2 = this.LIZIZ.m15893LJ().LIZ();
                LIZ2.commodityCount = 1;
                this.LIZIZ.m15893LJ().LIZ(LIZ2);
            } else if (externalViewGroupAction == ExternalViewGroupAction.Remove && abstractC9672e2.LIZ() == 0) {
                PreviewStatusInfo LIZ3 = this.LIZIZ.m15893LJ().LIZ();
                LIZ3.commodityCount = 0;
                this.LIZIZ.m15893LJ().LIZ(LIZ3);
            }
        }
        return Unit.INSTANCE;
    }
}
