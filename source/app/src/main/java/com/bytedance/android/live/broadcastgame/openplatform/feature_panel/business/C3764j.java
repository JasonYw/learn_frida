package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.api.model.C3380j;
import com.bytedance.android.live.broadcastgame.api.p286d.AbstractC3354n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import p003X.AbstractC88139Ko9;
import p003X.C106862S5w;
import p003X.C88153KoN;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.j */
/* loaded from: classes5.dex */
public final class C3764j extends AbstractC88139Ko9<AbstractC3354n, C3380j, C3765k> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(21346);
    }

    public C3764j() {
        this(null, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3764j(Function2<? super C3380j, ? super C3765k, ? extends AbstractC3354n> function2) {
        super(function2);
        C106862S5w.LIZ(function2);
    }

    public /* synthetic */ C3764j(Function2 function2, int i) {
        this(C88153KoN.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcastgame.api.d.n] */
    @Override // p003X.AbstractC88139Ko9
    public final /* synthetic */ AbstractC3354n LIZ(C3380j c3380j, C3765k c3765k, AbstractC3354n abstractC3354n) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3380j, c3765k, abstractC3354n}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3380j, abstractC3354n);
        return abstractC3354n;
    }
}
