package com.bytedance.android.live.broadcastgame.opengame.panel;

import com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87789KiV;

/* loaded from: classes5.dex */
public final class FullScreenOpenPanel$showFloatWindow$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FullScreenOpenPanel this$0;

    static {
        Covode.recordClassIndex(20767);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenOpenPanel$showFloatWindow$$inlined$apply$lambda$1(FullScreenOpenPanel fullScreenOpenPanel) {
        super(0);
        this.this$0 = fullScreenOpenPanel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Map<String, String> LIZ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C87789KiV c87789KiV = TrackMiniGameService.f26093LJ;
            String valueOf = String.valueOf(this.this$0.LIZIZ());
            String str = this.this$0.LJIIIIZZ;
            String str2 = this.this$0.LJIIIZ;
            String str3 = this.this$0.LJIIJ;
            String str4 = this.this$0.LJIIJJI;
            String str5 = this.this$0.LJIIL;
            if (!PatchProxy.proxy(new Object[]{valueOf, str, str2, str3, str4, str5}, c87789KiV, C87789KiV.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(valueOf, str, str2, str3, str4, str5);
                C4574547f LIZ2 = C4574547f.LIZ();
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c87789KiV, str, str2, str3, str4, str5, valueOf, null, 64, null}, null, C87789KiV.LIZ, true, 7);
                if (proxy.isSupported) {
                    LIZ = (Map) proxy.result;
                } else {
                    LIZ = c87789KiV.LIZ(str, str2, str3, str4, str5, valueOf, (Boolean) null);
                }
                LIZ2.LIZ("livesdk_return_to_liveroom_click", LIZ, new Object[0]);
            }
            AbstractC3610e LJIIL = this.this$0.LJIIL();
            if (LJIIL != null) {
                LJIIL.LJIIJ();
            }
        }
        return Unit.INSTANCE;
    }
}
