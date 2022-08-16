package com.bytedance.android.live.broadcastgame.opengame.dialog;

import com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenGameReportDialog$miniAppPagerParams$2 extends Lambda implements Function0<OpenGameReportDialog.InnerPageParams> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OpenGameReportDialog this$0;

    static {
        Covode.recordClassIndex(20137);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenGameReportDialog$miniAppPagerParams$2(OpenGameReportDialog openGameReportDialog) {
        super(0);
        this.this$0 = openGameReportDialog;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialog$InnerPageParams, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.bytedance.android.live.broadcastgame.opengame.dialog.OpenGameReportDialog$InnerPageParams, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ OpenGameReportDialog.InnerPageParams mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ?? serializableExtra = this.this$0.getIntent().getSerializableExtra("mini_app_page_params");
        if (serializableExtra instanceof OpenGameReportDialog.InnerPageParams) {
            return serializableExtra;
        }
        return null;
    }
}
