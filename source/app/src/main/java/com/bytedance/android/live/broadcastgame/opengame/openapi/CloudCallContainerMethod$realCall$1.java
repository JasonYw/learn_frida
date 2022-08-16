package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.AbstractC87551Kef;
import p003X.C106862S5w;
import p003X.C1PS;
import p003X.C87690Kgu;

/* loaded from: classes5.dex */
public final class CloudCallContainerMethod$realCall$1 extends Lambda implements Function4<Integer, String, JSONObject, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $startTime;
    public final /* synthetic */ C87690Kgu this$0;

    static {
        Covode.recordClassIndex(20505);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudCallContainerMethod$realCall$1(C87690Kgu c87690Kgu, long j) {
        super(4);
        this.this$0 = c87690Kgu;
        this.$startTime = j;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ Unit invoke(Integer num, String str, JSONObject jSONObject, String str2) {
        int intValue = num.intValue();
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str, jSONObject2, str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str, jSONObject2, str2);
            ALogger.m15797i("CloudCallContainerMethod_realCall", "call container success, duration = " + (System.currentTimeMillis() - this.$startTime));
            C87690Kgu c87690Kgu = this.this$0;
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), jSONObject2, str2}, c87690Kgu, C87690Kgu.LIZ, false, 3).isSupported) {
                JSONObject jSONObject3 = new JSONObject();
                String valueOf = String.valueOf(C1PS.LIZIZ.LIZ(jSONObject2, "X-Status-Code", true));
                String valueOf2 = String.valueOf(C1PS.LIZIZ.LIZ(jSONObject2, "X-Status-Message", true));
                C1PS.LIZIZ.LIZ(jSONObject2, "X-Tt-LogID", true);
                C1PS.LIZIZ.LIZ(jSONObject2, "X-Now", true);
                if (Intrinsics.areEqual(valueOf, String.valueOf(CloudResultType.OpenPlatformServerResultType.Success.errNo))) {
                    jSONObject3.put("statusCode", intValue);
                    jSONObject3.put("header", jSONObject2);
                    jSONObject3.put(C2521l.LJIIL, str2);
                    jSONObject3.put("errMsg", CloudResultType.ClientResultType.Success.errMsg);
                    c87690Kgu.LIZ(jSONObject3);
                } else {
                    CloudResultType.ClientResultType clientResultType = CloudResultType.ClientResultType.ServerError;
                    int i = clientResultType.errNo;
                    String format = String.format(clientResultType.errMsg, Arrays.copyOf(new Object[]{valueOf2, valueOf}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    AbstractC87551Kef.LIZ(c87690Kgu, i, format, null, null, 12, null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
