package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.live.broadcast.view.C3252c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class BaseGameDetailTabWidget$emptyView$2 extends Lambda implements Function0<C3252c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseGameDetailTabWidget this$0;

    static {
        Covode.recordClassIndex(16282);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGameDetailTabWidget$emptyView$2(BaseGameDetailTabWidget baseGameDetailTabWidget) {
        super(0);
        this.this$0 = baseGameDetailTabWidget;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.bytedance.android.live.broadcast.view.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3252c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        C3252c c3252c = new C3252c(context, null, 0, 6);
        c3252c.setImageLayoutParams(new LinearLayout.LayoutParams(LK5.LIZ(240.0f), LK5.LIZ(160.0f)));
        c3252c.setMsgText(LK5.LIZ(2131583532));
        return c3252c;
    }
}
