package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C442083eE;

/* loaded from: classes5.dex */
public final class CloudLoginService$login$2 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function2 $onFail;

    static {
        Covode.recordClassIndex(19970);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudLoginService$login$2(Function2 function2) {
        super(1);
        this.$onFail = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        CloudResultType.ClientResultType clientResultType;
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            if (th2 instanceof TimeoutException) {
                clientResultType = CloudResultType.ClientResultType.NetworkTimeOut;
            } else {
                clientResultType = CloudResultType.ClientResultType.NetworkError;
            }
            Function2 function2 = this.$onFail;
            String format = String.format(clientResultType.errMsg, Arrays.copyOf(new Object[]{C442083eE.LIZ(th2), Integer.valueOf(C442083eE.LIZIZ(th2))}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "");
            function2.invoke(clientResultType, format);
        }
        return Unit.INSTANCE;
    }
}
