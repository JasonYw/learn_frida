package com.bytedance.android.live.broadcastgame.opengame.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenGameReportDialog$roomId$2 extends Lambda implements Function0<Long> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OpenGameReportDialog this$0;

    static {
        Covode.recordClassIndex(20140);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGameReportDialog$roomId$2(OpenGameReportDialog openGameReportDialog) {
        super(0);
        this.this$0 = openGameReportDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        long longExtra;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            longExtra = ((Long) proxy.result).longValue();
        } else {
            longExtra = this.this$0.getIntent().getLongExtra("room_id", -1L);
        }
        return Long.valueOf(longExtra);
    }
}