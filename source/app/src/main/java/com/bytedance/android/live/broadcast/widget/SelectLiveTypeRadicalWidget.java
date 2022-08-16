package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.LiveTypeButton;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C468304fQ;
import p003X.KK7;
import p003X.KK9;

/* loaded from: classes5.dex */
public final class SelectLiveTypeRadicalWidget extends SelectLiveTypeWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(18781);
    }

    @Override // com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget, com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "SelectLiveTypeRadicalWidget";
    }

    @Override // com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a220";
    }

    @Override // com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.SelectLiveTypeWidget
    public final void LIZ(List<LiveTypeButton> list, C3180k c3180k) {
        MethodCollector.m14708i(1380);
        if (PatchProxy.proxy(new Object[]{list, c3180k}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1380);
            return;
        }
        C106862S5w.LIZ(list, c3180k);
        if (CollectionUtils.isEmpty(list)) {
            MethodCollector.m14707o(1380);
            return;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ((LinearLayout) view.findViewById(2131168426)).removeAllViews();
        for (LiveTypeButton liveTypeButton : list) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            C468304fQ c468304fQ = new C468304fQ(context, null, 0, 6);
            C3180k LJIIJJI = LJIIJJI();
            if (!PatchProxy.proxy(new Object[]{liveTypeButton, LJIIJJI}, c468304fQ, C468304fQ.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(liveTypeButton, LJIIJJI);
                TextView textView = (TextView) c468304fQ.LIZ(2131168416);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setText(c468304fQ.getContext().getString(liveTypeButton.titleId));
                c468304fQ.setOnClickListener(new KK9(LJIIJJI, liveTypeButton));
            }
            c3180k.LIZ().LIZIZ().subscribe(new KK7(c468304fQ, liveTypeButton));
            View view2 = this.contentView;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            ((LinearLayout) view2.findViewById(2131168426)).addView(c468304fQ);
            if (list.indexOf(liveTypeButton) < list.size() - 1) {
                View view3 = new View(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) UIUtils.dip2Px(getContext(), 28.0f), (int) UIUtils.dip2Px(getContext(), 1.0f));
                View view4 = this.contentView;
                Intrinsics.checkNotNullExpressionValue(view4, "");
                ((LinearLayout) view4.findViewById(2131168426)).addView(view3, layoutParams);
            }
        }
        MethodCollector.m14707o(1380);
    }
}
