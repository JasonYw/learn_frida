package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.broadcastgame.opengame.cloud.C3484a;
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

/* loaded from: classes5.dex */
public final class CloudExecutor$cloudCodeToSession$3 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3484a.AbstractC3485a $listener;

    static {
        Covode.recordClassIndex(19963);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudExecutor$cloudCodeToSession$3(C3484a.AbstractC3485a abstractC3485a) {
        super(1);
        this.$listener = abstractC3485a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        CloudResultType.ClientResultType clientResultType;
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            ALogger.m15797i("CloudExecutor_cloudCodeToSession", "onError: errMsg = " + C442083eE.LIZ(th2) + ", errNo = " + C442083eE.LIZIZ(th2));
            if (th2 instanceof TimeoutException) {
                clientResultType = CloudResultType.ClientResultType.NetworkTimeOut;
            } else {
                clientResultType = CloudResultType.ClientResultType.NetworkError;
            }
            C3484a.AbstractC3485a abstractC3485a = this.$listener;
            String format = String.format(clientResultType.errMsg, Arrays.copyOf(new Object[]{C442083eE.LIZ(th2), Integer.valueOf(C442083eE.LIZIZ(th2))}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "");
            abstractC3485a.LIZ(clientResultType, format);
        }
        return Unit.INSTANCE;
    }
}
