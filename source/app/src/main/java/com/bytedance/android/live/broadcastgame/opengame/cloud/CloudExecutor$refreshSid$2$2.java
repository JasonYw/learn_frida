package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C442083eE;
import p003X.C87696Kh0;

/* loaded from: classes5.dex */
public final class CloudExecutor$refreshSid$2$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87696Kh0 this$0;

    static {
        Covode.recordClassIndex(19968);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudExecutor$refreshSid$2$2(C87696Kh0 c87696Kh0) {
        super(1);
        this.this$0 = c87696Kh0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        CloudResultType.ClientResultType clientResultType;
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            ALogger.m15801d("CloudExecutor", th2.getMessage());
            if (th2 instanceof TimeoutException) {
                clientResultType = CloudResultType.ClientResultType.NetworkTimeOut;
            } else {
                clientResultType = CloudResultType.ClientResultType.NetworkError;
            }
            C3484a c3484a = this.this$0.LIZIZ;
            String format = String.format(clientResultType.errMsg, Arrays.copyOf(new Object[]{C442083eE.LIZ(th2), Integer.valueOf(C442083eE.LIZIZ(th2))}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "");
            C3484a.LIZ(c3484a, clientResultType, format, null, 4, null);
        }
        return Unit.INSTANCE;
    }
}
