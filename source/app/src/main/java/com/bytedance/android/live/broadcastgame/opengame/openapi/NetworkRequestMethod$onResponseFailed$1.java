package com.bytedance.android.live.broadcastgame.opengame.openapi;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87551Kef;
import p003X.C87607KfZ;

/* loaded from: classes5.dex */
public final class NetworkRequestMethod$onResponseFailed$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: $t */
    public final /* synthetic */ Throwable f26072$t;
    public final /* synthetic */ C87607KfZ this$0;

    static {
        Covode.recordClassIndex(20518);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestMethod$onResponseFailed$1(C87607KfZ c87607KfZ, Throwable th) {
        super(0);
        this.this$0 = c87607KfZ;
        this.f26072$t = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.f26072$t instanceof TimeoutException) {
                AbstractC87551Kef.LIZ(this.this$0, OpenApiErrorInfo.NET_REQUEST_TIMEOUT, null, 2, null);
            } else {
                this.this$0.LIZ(OpenApiErrorInfo.NETWORK_ERROR, this.f26072$t);
                ALogger.m15801d("NetworkRequestMethod", this.f26072$t.toString());
            }
        }
        return Unit.INSTANCE;
    }
}
