package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87602KfU;

/* loaded from: classes5.dex */
public final class UserLoginMethod$callLogin$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87602KfU this$0;

    static {
        Covode.recordClassIndex(20527);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLoginMethod$callLogin$1(C87602KfU c87602KfU) {
        super(1);
        this.this$0 = c87602KfU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            ALogger.m15797i("UserLoginMethod_callLogin", "login success: " + jSONObject2);
            this.this$0.LIZ(jSONObject2);
        }
        return Unit.INSTANCE;
    }
}
