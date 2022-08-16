package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C2VQ;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorService$launchParam$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OpenPlatformMonitorService this$0;

    static {
        Covode.recordClassIndex(21005);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorService$launchParam$1(OpenPlatformMonitorService openPlatformMonitorService) {
        super(1);
        this.this$0 = openPlatformMonitorService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        LiveMode liveMode;
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            jSONObject2.put("is_retry", this.this$0.LJII().LIZIZ("is_retry"));
            jSONObject2.put("first_launch", this.this$0.LJII().LIZIZ("first_launch"));
            Room LJIILIIL = this.this$0.LJII().LJIILIIL();
            Long l = null;
            if (LJIILIIL != null) {
                liveMode = LJIILIIL.getStreamType();
            } else {
                liveMode = null;
            }
            jSONObject2.put("live_type", C2VQ.LIZ(liveMode));
            Room LJIILIIL2 = this.this$0.LJII().LJIILIIL();
            if (LJIILIIL2 != null) {
                l = Long.valueOf(LJIILIIL2.getRoomId());
            }
            jSONObject2.put("room_id", l);
            if (this.this$0.LJII().LJIIIIZZ.LJIILIIL == PluginType.MINI_APP) {
                jSONObject2.put("auto_launch", this.this$0.LJII().LIZIZ("auto_launch"));
            }
        }
        return Unit.INSTANCE;
    }
}
