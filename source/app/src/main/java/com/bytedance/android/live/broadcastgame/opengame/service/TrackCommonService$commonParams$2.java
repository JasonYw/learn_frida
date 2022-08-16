package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
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
import p003X.C106862S5w;
import p003X.C87790KiW;
import p003X.C87791KiX;

/* loaded from: classes5.dex */
public final class TrackCommonService$commonParams$2 extends Lambda implements Function0<Map<String, String>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TrackCommonService this$0;

    static {
        Covode.recordClassIndex(21071);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackCommonService$commonParams$2(TrackCommonService trackCommonService) {
        super(0);
        this.this$0 = trackCommonService;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.Map<java.lang.String, java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, String> mo30099invoke() {
        Object LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m137to("program_id", this.this$0.LJIIJJI().LJIIIIZZ.LJII);
        Object obj = "";
        if (this.this$0.LJIIJJI().LJIIJ || this.this$0.LJIIJJI().LJIIJJI ? (LIZIZ = this.this$0.LJIIJJI().LJIIIIZZ.LIZIZ()) == null : (LIZIZ = this.this$0.LJIIJJI().LJIIIIZZ.LIZJ()) == null) {
            LIZIZ = obj;
        }
        pairArr[1] = TuplesKt.m137to("program_name", LIZIZ);
        C87790KiW c87790KiW = TrackCommonService.LIZJ;
        PluginType LJIILJJIL = this.this$0.LJIIJJI().LJIILJJIL();
        if (LJIILJJIL == null) {
            LJIILJJIL = PluginType.MINI_APP;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LJIILJJIL}, c87790KiW, C87790KiW.LIZ, false, 2);
        if (proxy2.isSupported) {
            obj = proxy2.result;
        } else {
            C106862S5w.LIZ(LJIILJJIL);
            int i = C87791KiX.LIZ[LJIILJJIL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        obj = "little_game_sonic";
                    }
                } else {
                    obj = "little_plugin";
                }
            } else {
                obj = "little_program";
            }
        }
        pairArr[2] = TuplesKt.m137to("program_type", obj);
        return MapsKt__MapsKt.mutableMapOf(pairArr);
    }
}
