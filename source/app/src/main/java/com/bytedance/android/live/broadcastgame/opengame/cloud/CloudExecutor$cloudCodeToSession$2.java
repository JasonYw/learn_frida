package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.broadcastgame.opengame.cloud.C3484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class CloudExecutor$cloudCodeToSession$2 extends Lambda implements Function4<Integer, String, JSONObject, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3484a.AbstractC3485a $listener;
    public final /* synthetic */ C3484a this$0;

    static {
        Covode.recordClassIndex(19962);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudExecutor$cloudCodeToSession$2(C3484a c3484a, C3484a.AbstractC3485a abstractC3485a) {
        super(4);
        this.this$0 = c3484a;
        this.$listener = abstractC3485a;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ Unit invoke(Integer num, String str, JSONObject jSONObject, String str2) {
        int intValue = num.intValue();
        String str3 = str;
        String str4 = str2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str3, jSONObject, str4}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str3, jSONObject, str4);
            this.this$0.LIZ(intValue, str3, str4, this.$listener, false);
        }
        return Unit.INSTANCE;
    }
}
