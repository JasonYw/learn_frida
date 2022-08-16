package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.app.ProgressDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingDialog$processDialog$2 extends Lambda implements Function0<ProgressDialog> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MiniAppCardSettingDialog this$0;

    static {
        Covode.recordClassIndex(21573);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingDialog$processDialog$2(MiniAppCardSettingDialog miniAppCardSettingDialog) {
        super(0);
        this.this$0 = miniAppCardSettingDialog;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.app.ProgressDialog, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ProgressDialog mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ProgressDialog progressDialog = new ProgressDialog(this.this$0);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(this.this$0.getString(2131586639));
        progressDialog.setCanceledOnTouchOutside(true);
        return progressDialog;
    }
}
