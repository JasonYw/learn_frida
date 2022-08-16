package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C442083eE;

/* loaded from: classes5.dex */
public final class OpenPlatformMonitorService$appParam$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OpenPlatformMonitorService this$0;

    static {
        Covode.recordClassIndex(20999);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformMonitorService$appParam$1(OpenPlatformMonitorService openPlatformMonitorService) {
        super(1);
        this.this$0 = openPlatformMonitorService;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        String LIZIZ;
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            jSONObject2.put(Constants.APP_ID, this.this$0.LJII().LJIIIIZZ.LJII);
            if (!this.this$0.LJII().LJIIJ && !this.this$0.LJII().LJIIJJI) {
                LIZIZ = this.this$0.LJII().LJIIIIZZ.LIZJ();
            } else {
                LIZIZ = this.this$0.LJII().LJIIIIZZ.LIZIZ();
            }
            jSONObject2.put("app_name", LIZIZ);
            jSONObject2.put("app_type", PluginType.Companion.LIZIZ(this.this$0.LJII().LJIIIIZZ.LJIILIIL));
            jSONObject2.put("schema", this.this$0.LJII().LJIIIIZZ.LJIIL);
            jSONObject2.put("schema_type", C442083eE.LIZ(this.this$0.LJII().LJIIIIZZ.LJIIL));
        }
        return Unit.INSTANCE;
    }
}
