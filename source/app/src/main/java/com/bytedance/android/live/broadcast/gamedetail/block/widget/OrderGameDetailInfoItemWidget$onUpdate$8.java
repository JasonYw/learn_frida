package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class OrderGameDetailInfoItemWidget$onUpdate$8 extends Lambda implements Function1<List<? extends String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OrderGameDetailInfoItemWidget this$0;

    static {
        Covode.recordClassIndex(16424);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderGameDetailInfoItemWidget$onUpdate$8(OrderGameDetailInfoItemWidget orderGameDetailInfoItemWidget) {
        super(1);
        this.this$0 = orderGameDetailInfoItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends String> list) {
        MethodCollector.m14708i(1273);
        List<? extends String> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            OrderGameDetailInfoItemWidget orderGameDetailInfoItemWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{list2}, orderGameDetailInfoItemWidget, OrderGameDetailInfoItemWidget.LIZ, false, 6).isSupported && list2 != null) {
                FlowLayout flowLayout = orderGameDetailInfoItemWidget.LIZJ;
                if (flowLayout != null) {
                    flowLayout.removeAllViews();
                }
                for (String str : list2) {
                    TextView textView = new TextView(new ContextThemeWrapper(orderGameDetailInfoItemWidget.context, 2131494880));
                    textView.setText(str);
                    FlowLayout flowLayout2 = orderGameDetailInfoItemWidget.LIZJ;
                    if (flowLayout2 != null) {
                        flowLayout2.setSingleLine(true);
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                    marginLayoutParams.rightMargin = LK5.LIZ(5.0f);
                    FlowLayout flowLayout3 = orderGameDetailInfoItemWidget.LIZJ;
                    if (flowLayout3 != null) {
                        flowLayout3.addView(textView, marginLayoutParams);
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1273);
        return unit;
    }
}
