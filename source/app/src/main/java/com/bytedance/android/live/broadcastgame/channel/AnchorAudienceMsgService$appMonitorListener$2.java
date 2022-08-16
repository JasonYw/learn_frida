package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.android.livehostapi.foundation.depend.AbstractC5826c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class AnchorAudienceMsgService$appMonitorListener$2 extends Lambda implements Function0<AbstractC5826c.C5827a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AnchorAudienceMsgService this$0;

    static {
        Covode.recordClassIndex(19341);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorAudienceMsgService$appMonitorListener$2(AnchorAudienceMsgService anchorAudienceMsgService) {
        super(0);
        this.this$0 = anchorAudienceMsgService;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.livehostapi.foundation.depend.c$a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC5826c.C5827a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.initAppMonitorListener();
    }
}
