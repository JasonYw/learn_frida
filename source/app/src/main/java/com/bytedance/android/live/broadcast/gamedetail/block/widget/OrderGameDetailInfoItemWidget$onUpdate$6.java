package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes25.dex */
public final class OrderGameDetailInfoItemWidget$onUpdate$6 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OrderGameDetailInfoItemWidget this$0;

    static {
        Covode.recordClassIndex(16422);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderGameDetailInfoItemWidget$onUpdate$6(OrderGameDetailInfoItemWidget orderGameDetailInfoItemWidget) {
        super(1);
        this.this$0 = orderGameDetailInfoItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            TextView textView = this.this$0.LIZIZ;
            if (textView != null) {
                new StringBuilder();
                textView.setText(C0002O.m25086C(str2, "人已预约"));
            }
        }
        return Unit.INSTANCE;
    }
}
