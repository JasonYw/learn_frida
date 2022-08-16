package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87610Kfc;

/* loaded from: classes5.dex */
public final class NetworkRequestMethod$executeRequest$1$3 extends Lambda implements Function3<Integer, JSONObject, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87610Kfc this$0;

    static {
        Covode.recordClassIndex(20516);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestMethod$executeRequest$1$3(C87610Kfc c87610Kfc) {
        super(3);
        this.this$0 = c87610Kfc;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Integer num, JSONObject jSONObject, String str) {
        int intValue = num.intValue();
        JSONObject jSONObject2 = jSONObject;
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), jSONObject2, str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2, str2);
            this.this$0.LIZIZ.LIZ(intValue, jSONObject2, str2);
        }
        return Unit.INSTANCE;
    }
}
