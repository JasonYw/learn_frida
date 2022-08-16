package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C87597KfP;

/* loaded from: classes5.dex */
public final class HideLoadingMethod$call$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87597KfP this$0;

    static {
        Covode.recordClassIndex(20508);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HideLoadingMethod$call$1(C87597KfP c87597KfP) {
        super(1);
        this.this$0 = c87597KfP;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(jSONObject2);
        }
        return Unit.INSTANCE;
    }
}
