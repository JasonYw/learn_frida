package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C87596KfO;

/* loaded from: classes5.dex */
public final class ShowLoadingMethod$call$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87596KfO this$0;

    static {
        Covode.recordClassIndex(20525);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowLoadingMethod$call$1(C87596KfO c87596KfO) {
        super(1);
        this.this$0 = c87596KfO;
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
