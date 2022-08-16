package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87551Kef;
import p003X.C106862S5w;
import p003X.C87602KfU;
import p003X.C87695Kgz;

/* loaded from: classes5.dex */
public final class UserLoginMethod$callLogin$2 extends Lambda implements Function2<CloudResultType.ClientResultType, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87602KfU this$0;

    static {
        Covode.recordClassIndex(20528);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLoginMethod$callLogin$2(C87602KfU c87602KfU) {
        super(2);
        this.this$0 = c87602KfU;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(CloudResultType.ClientResultType clientResultType, String str) {
        CloudResultType.ClientResultType clientResultType2 = clientResultType;
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{clientResultType2, str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(clientResultType2, str2);
            ALogger.m15797i("UserLoginMethod_callLogin", "login fail: resultType=" + clientResultType2 + ", errMsg=" + str2);
            int i = C87695Kgz.LIZ[clientResultType2.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        AbstractC87551Kef.LIZ(this.this$0, OpenApiErrorInfo.INTERNAL_ERROR, null, 2, null);
                    } else {
                        AbstractC87551Kef.LIZ(this.this$0, clientResultType2.errNo, str2, null, null, 12, null);
                    }
                } else {
                    AbstractC87551Kef.LIZ(this.this$0, OpenApiErrorInfo.NETWORK_ERROR, null, 2, null);
                }
            } else {
                AbstractC87551Kef.LIZ(this.this$0, OpenApiErrorInfo.NET_REQUEST_TIMEOUT, null, 2, null);
            }
        }
        return Unit.INSTANCE;
    }
}
