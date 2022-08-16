package com.bytedance.android.live.broadcast.preview.p277ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.chatroom.p518ui.DoubleColorBallAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.common.LimitListLoadingView */
/* loaded from: classes12.dex */
public final class LimitListLoadingView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public final DoubleColorBallAnimationView LIZIZ;

    static {
        Covode.recordClassIndex(17430);
    }

    public LimitListLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LimitListLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        try {
            super.onVisibilityChanged(view, i);
            if (i == 0) {
                this.LIZIZ.LIZ();
            } else {
                this.LIZIZ.LIZIZ();
            }
        } catch (Exception e) {
            ALogger.m15800e("LimitListLoadingView", e.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LimitListLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1307);
        this.LIZIZ = new DoubleColorBallAnimationView(context);
        View view = this.LIZIZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(LK1.LIZLLL(36), LK1.LIZLLL(36));
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        MethodCollector.m14707o(1307);
    }

    public /* synthetic */ LimitListLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
