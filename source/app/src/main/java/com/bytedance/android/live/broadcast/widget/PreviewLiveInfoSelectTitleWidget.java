package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.widget.PreviewLiveInfoSelectTitleWidget;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.KM3;
import p003X.KM4;

/* loaded from: classes5.dex */
public final class PreviewLiveInfoSelectTitleWidget extends PreviewSelectTitleWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;

    static {
        Covode.recordClassIndex(18563);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget, com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698460;
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget, com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget, com.bytedance.android.live.broadcast.preview.base.AbsRecyclablePreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LJFF, false, 1).isSupported) {
            return;
        }
        super.onInit(objArr);
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        ((LiveEditText) view.findViewById(2131193092)).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.3eh
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18564);
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (PatchProxy.proxy(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (z) {
                    View view3 = PreviewLiveInfoSelectTitleWidget.this.contentView;
                    Intrinsics.checkNotNullExpressionValue(view3, "");
                    TextView textView = (TextView) view3.findViewById(2131194408);
                    if (textView != null) {
                        LK1.LIZ(textView);
                        return;
                    }
                    return;
                }
                ViewGroup viewGroup = PreviewLiveInfoSelectTitleWidget.this.containerView;
                Intrinsics.checkNotNullExpressionValue(viewGroup, "");
                TextView textView2 = (TextView) viewGroup.findViewById(2131194408);
                if (textView2 != null) {
                    LK1.LIZJ(textView2);
                }
            }
        });
        View view2 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        TextView textView = (TextView) view2.findViewById(2131194408);
        if (textView != null) {
            textView.setOnClickListener(new KM3(this));
        }
        this.contentView.setOnClickListener(new KM4(this));
    }
}
