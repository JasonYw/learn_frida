package com.bytedance.android.live.broadcastgame.opengame.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenGameReportDialogV1$appName$2 extends Lambda implements Function0<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC3494a this$0;

    static {
        Covode.recordClassIndex(20143);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGameReportDialogV1$appName$2(DialogC3494a dialogC3494a) {
        super(0);
        this.this$0 = dialogC3494a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LJI.LIZ(this.this$0.LJII);
    }
}