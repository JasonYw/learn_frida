package com.bytedance.android.live.p482ui;

import android.content.Context;
import android.graphics.LinearGradient;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC471654kp;

/* renamed from: com.bytedance.android.live.ui.GradientTextView */
/* loaded from: classes22.dex */
public final class GradientTextView extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ = true;
    public int LIZJ;

    /* renamed from: LJ */
    public int f26746LJ;
    public AbstractC471654kp LJFF;

    static {
        Covode.recordClassIndex(36319);
    }

    public final AbstractC471654kp getLinearGradientCreator() {
        return this.LJFF;
    }

    public GradientTextView(Context context) {
        super(context);
    }

    public final void setLinearGradientCreator(AbstractC471654kp abstractC471654kp) {
        if (PatchProxy.proxy(new Object[]{abstractC471654kp}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJFF = abstractC471654kp;
        this.LIZIZ = true;
        invalidate();
    }

    public GradientTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GradientTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LinearGradient linearGradient;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.LIZIZ || this.LIZJ != getWidth() || this.f26746LJ != getHeight()) {
            TextPaint paint = getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "");
            AbstractC471654kp abstractC471654kp = this.LJFF;
            if (abstractC471654kp != null) {
                linearGradient = abstractC471654kp.LIZ(getWidth(), getHeight());
            } else {
                linearGradient = null;
            }
            paint.setShader(linearGradient);
            this.LIZJ = getWidth();
            this.f26746LJ = getHeight();
            this.LIZIZ = false;
        }
    }
}
