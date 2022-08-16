package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameDetailIntroItemWidget$clGameAssess$2 extends Lambda implements Function0<ConstraintLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailIntroItemWidget this$0;

    static {
        Covode.recordClassIndex(16747);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailIntroItemWidget$clGameAssess$2(GameDetailIntroItemWidget gameDetailIntroItemWidget) {
        super(0);
        this.this$0 = gameDetailIntroItemWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.constraintlayout.widget.ConstraintLayout, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConstraintLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.contentView.findViewById(2131170262);
    }
}
