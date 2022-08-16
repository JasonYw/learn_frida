package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C409882Kg;

/* loaded from: classes5.dex */
public final class ReportService$roomContext$2 extends Lambda implements Function0<C5923dp> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ReportService this$0;

    static {
        Covode.recordClassIndex(21034);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportService$roomContext$2(ReportService reportService) {
        super(0);
        this.this$0 = reportService;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.livesdk.chatroom.dp] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5923dp mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C409882Kg.LIZ(C5923dp.LJIIJ, null, this.this$0.LJIIIIZZ().LJIIIIZZ.LIZIZ, 1, null);
    }
}
