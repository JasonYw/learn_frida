package com.bytedance.android.live.broadcastgame.effectgame.base;

import com.bytedance.android.livesdk.widget.CircleProgressView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC87128KUw;

/* loaded from: classes5.dex */
public final class ResourceLoadingController$LoadingDialog$progressView$2 extends Lambda implements Function0<CircleProgressView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC87128KUw this$0;

    static {
        Covode.recordClassIndex(19754);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResourceLoadingController$LoadingDialog$progressView$2(DialogC87128KUw dialogC87128KUw) {
        super(0);
        this.this$0 = dialogC87128KUw;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livesdk.widget.CircleProgressView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.widget.CircleProgressView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ CircleProgressView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.findViewById(2131192894);
    }
}
