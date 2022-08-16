package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;

/* loaded from: classes12.dex */
public final class UrgeBubbleWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public TextView LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final String f26006LJ = "UrgeBubbleWidget";

    static {
        Covode.recordClassIndex(18852);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700866;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return this.f26006LJ;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        View findViewById = this.contentView.findViewById(2131170600);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextView) findViewById;
        View findViewById2 = this.contentView.findViewById(2131174550);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        LIZ(LJIIJJI().LIZ(new UrgeBubbleWidget$onCreate$1(this)));
    }
}
