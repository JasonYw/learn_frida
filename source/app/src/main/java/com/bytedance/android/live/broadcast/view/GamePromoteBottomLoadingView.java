package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p518ui.DoubleColorBallAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class GamePromoteBottomLoadingView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public DoubleColorBallAnimationView LIZIZ;
    public TextView LIZJ;

    static {
        Covode.recordClassIndex(18084);
    }

    public GamePromoteBottomLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GamePromoteBottomLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        LK1.LIZJ(this.LIZIZ);
        LK1.LIZ(this.LIZJ);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        LK1.LIZ(this.LIZIZ);
        LK1.LIZ(this.LIZJ);
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        LK1.LIZJ(this.LIZJ);
        LK1.LIZ(this.LIZIZ);
    }

    public final void setMessage(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZJ.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteBottomLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1343);
        this.LIZIZ = new DoubleColorBallAnimationView(context);
        this.LIZJ = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, LK5.LIZ(60.0f));
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        LK1.LIZ(this.LIZIZ);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(LK5.LIZ(36.0f), LK5.LIZ(36.0f));
        layoutParams2.gravity = 17;
        this.LIZIZ.setLayoutParams(layoutParams2);
        LK1.LIZ(this.LIZJ);
        this.LIZJ.setTextColor(LK5.LIZIZ(2131628476));
        this.LIZJ.setText(LK5.LIZ(2131583536));
        this.LIZJ.setTextSize(14.0f);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.LIZJ.setLayoutParams(layoutParams3);
        addView(this.LIZIZ);
        addView(this.LIZJ);
        MethodCollector.m14707o(1343);
    }

    public /* synthetic */ GamePromoteBottomLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
