package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.opengame.runtime.BootInfoService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class TrackMiniGameCardService$commonParams$2 extends Lambda implements Function0<Map<String, String>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TrackMiniGameCardService this$0;

    static {
        Covode.recordClassIndex(21074);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackMiniGameCardService$commonParams$2(TrackMiniGameCardService trackMiniGameCardService) {
        super(0);
        this.this$0 = trackMiniGameCardService;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, String> mo30099invoke() {
        String LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m137to("game_id", this.this$0.LIZJ().LJIIIIZZ.LJII);
        if (this.this$0.LIZJ().LJIIJ || this.this$0.LIZJ().LJIIJJI ? (LIZIZ = this.this$0.LIZJ().LJIIIIZZ.LIZIZ()) == null : (LIZIZ = this.this$0.LIZJ().LJIIIIZZ.LIZJ()) == null) {
            LIZIZ = "";
        }
        pairArr[1] = TuplesKt.m137to("game_name", LIZIZ);
        pairArr[2] = TuplesKt.m137to("game_category", ((BootInfoService) this.this$0.LIZJ().LIZ((Class<AbstractC3719c>) BootInfoService.class)).LIZLLL());
        return MapsKt__MapsKt.mutableMapOf(pairArr);
    }
}
