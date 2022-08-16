package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameDetailIntroItemWidget$flowLayout$2 extends Lambda implements Function0<FlowLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailIntroItemWidget this$0;

    static {
        Covode.recordClassIndex(16748);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailIntroItemWidget$flowLayout$2(GameDetailIntroItemWidget gameDetailIntroItemWidget) {
        super(0);
        this.this$0 = gameDetailIntroItemWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livesdk.widget.FlowLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.livesdk.widget.FlowLayout, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ FlowLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.contentView.findViewById(2131175199);
    }
}
