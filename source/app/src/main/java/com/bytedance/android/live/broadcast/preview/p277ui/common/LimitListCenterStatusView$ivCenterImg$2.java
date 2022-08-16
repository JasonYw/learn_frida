package com.bytedance.android.live.broadcast.preview.p277ui.common;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77295Gdd;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.common.LimitListCenterStatusView$ivCenterImg$2 */
/* loaded from: classes3.dex */
public final class LimitListCenterStatusView$ivCenterImg$2 extends Lambda implements Function0<ImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77295Gdd this$0;

    static {
        Covode.recordClassIndex(17426);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitListCenterStatusView$ivCenterImg$2(C77295Gdd c77295Gdd) {
        super(0);
        this.this$0 = c77295Gdd;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.findViewById(2131178674);
    }
}
