package com.bytedance.android.live.broadcast.widget;

import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KMX;

/* loaded from: classes5.dex */
public final class PreviewCompanionPermissionWidget$progressDialog$2 extends Lambda implements Function0<Dialog> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCompanionPermissionWidget this$0;

    static {
        Covode.recordClassIndex(18471);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCompanionPermissionWidget$progressDialog$2(PreviewCompanionPermissionWidget previewCompanionPermissionWidget) {
        super(0);
        this.this$0 = previewCompanionPermissionWidget;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, android.app.Dialog] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Dialog mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Dialog LIZ = KMX.LIZ(this.this$0.getContext());
        LIZ.setCancelable(false);
        LIZ.setCanceledOnTouchOutside(false);
        return LIZ;
    }
}