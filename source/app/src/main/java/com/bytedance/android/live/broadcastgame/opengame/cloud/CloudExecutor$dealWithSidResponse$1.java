package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.broadcastgame.opengame.cloud.C3484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class CloudExecutor$dealWithSidResponse$1 extends Lambda implements Function1<JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3484a.AbstractC3485a $immediatelyCallback;
    public final /* synthetic */ C3484a this$0;

    static {
        Covode.recordClassIndex(19965);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudExecutor$dealWithSidResponse$1(C3484a c3484a, C3484a.AbstractC3485a abstractC3485a) {
        super(1);
        this.this$0 = c3484a;
        this.$immediatelyCallback = abstractC3485a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject);
            this.this$0.LIZIZ(this.$immediatelyCallback);
        }
        return Unit.INSTANCE;
    }
}
