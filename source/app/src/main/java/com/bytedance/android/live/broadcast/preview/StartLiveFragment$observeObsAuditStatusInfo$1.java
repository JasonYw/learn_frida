package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.api.model.C2918r;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$observeObsAuditStatusInfo$1 extends Lambda implements Function1<C2918r, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC3178e $broadcastPreviewService;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17118);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$observeObsAuditStatusInfo$1(KJV kjv, AbstractC3178e abstractC3178e) {
        super(1);
        this.this$0 = kjv;
        this.$broadcastPreviewService = abstractC3178e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2918r c2918r) {
        C2918r c2918r2 = c2918r;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{c2918r2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2918r2);
            KJV kjv = this.this$0;
            if (kjv.LJIIIIZZ != LiveMode.THIRD_PARTY) {
                z = false;
            }
            kjv.LIZ(z, this.this$0.LJIIIIZZ, this.$broadcastPreviewService, c2918r2);
        }
        return Unit.INSTANCE;
    }
}
