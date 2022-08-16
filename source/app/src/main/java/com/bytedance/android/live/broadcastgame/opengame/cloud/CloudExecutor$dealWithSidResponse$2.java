package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.broadcastgame.opengame.cloud.C3484a;
import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class CloudExecutor$dealWithSidResponse$2 extends Lambda implements Function2<CloudResultType.ClientResultType, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3484a.AbstractC3485a $immediatelyCallback;
    public final /* synthetic */ C3484a this$0;

    static {
        Covode.recordClassIndex(19966);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudExecutor$dealWithSidResponse$2(C3484a c3484a, C3484a.AbstractC3485a abstractC3485a) {
        super(2);
        this.this$0 = c3484a;
        this.$immediatelyCallback = abstractC3485a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(CloudResultType.ClientResultType clientResultType, String str) {
        CloudResultType.ClientResultType clientResultType2 = clientResultType;
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{clientResultType2, str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(clientResultType2, str2);
            this.this$0.LIZ(clientResultType2, str2, this.$immediatelyCallback);
        }
        return Unit.INSTANCE;
    }
}
