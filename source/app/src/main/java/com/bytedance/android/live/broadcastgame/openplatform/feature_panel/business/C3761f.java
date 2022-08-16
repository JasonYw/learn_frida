package com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business;

import com.bytedance.android.live.broadcastgame.openplatform.feature_panel.viewmodel.AbstractC3775a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88161KoV;
import p003X.AbstractC88191Koz;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87549Ked;
import p003X.C87793KiZ;
import p003X.C88159KoT;
import p003X.C88169Kod;
import p003X.C88202KpA;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.feature_panel.business.f */
/* loaded from: classes5.dex */
public final class C3761f implements AbstractC88191Koz {
    public static ChangeQuickRedirect LIZ;
    public AbstractC3775a LIZIZ;
    public AbstractC88161KoV LIZJ;
    public final /* synthetic */ C87549Ked LIZLLL = new C87549Ked();

    static {
        Covode.recordClassIndex(21340);
    }

    /* renamed from: LJ */
    private AbstractC88161KoV m15836LJ() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC88207KpF
    public final AbstractC3775a LIZ() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC88207KpF
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C88202KpA.LIZ(this);
    }

    @Override // p003X.AbstractC88191Koz
    public final LinkedList<String> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (LinkedList) proxy.result;
        }
        return m15836LJ().LIZIZ();
    }

    @Override // p003X.AbstractC88207KpF
    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        m15836LJ().LIZ();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            this.LIZLLL.LIZ();
        }
    }

    public C3761f(AbstractC3775a abstractC3775a, AbstractC88161KoV abstractC88161KoV) {
        C106862S5w.LIZ(abstractC3775a, abstractC88161KoV);
        this.LIZIZ = abstractC3775a;
        this.LIZJ = abstractC88161KoV;
    }

    @Override // p003X.AbstractC88191Koz
    public final void LIZ(long j, Long l, String str) {
        if (PatchProxy.proxy(new Object[]{new Long(j), l, str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        C87793KiZ c87793KiZ = C87793KiZ.LIZIZ;
        boolean LIZIZ = LIZIZ();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(LIZIZ ? (byte) 1 : (byte) 0)}, c87793KiZ, C87793KiZ.LIZ, false, 21).isSupported) {
            if (LIZIZ) {
                C4574547f.LIZ().LIZ("livesdk_live_function_panel_program_search", new LinkedHashMap(), Room.class);
            } else {
                C4574547f.LIZ().LIZ("livesdk_live_takepage_function_panel_program_search");
            }
        }
        Disposable subscribe = m15836LJ().LIZ(j, l, str).subscribe(new C88159KoT(this), new C88169Kod(this));
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        if (!PatchProxy.proxy(new Object[]{subscribe}, this, LIZ, false, 13).isSupported) {
            C106862S5w.LIZ(subscribe);
            this.LIZLLL.LIZ(subscribe);
        }
        m15836LJ().LIZ(str);
    }
}
