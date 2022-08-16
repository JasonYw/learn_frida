package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C499305oK;

/* loaded from: classes12.dex */
public final class CompactTailView extends HSImageView {
    public static ChangeQuickRedirect LIZIZ;
    public float LIZJ;
    public final Path LIZLLL = new Path();

    /* renamed from: LJ */
    public final RectF f26507LJ = new RectF();

    static {
        Covode.recordClassIndex(31934);
    }

    @Override // com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 5).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 6).isSupported) {
                super.onDetachedFromWindow();
            }
            C499305oK.LIZ(this);
        }
    }

    public final void setCircleRadius(float f) {
        this.LIZJ = f;
    }

    public CompactTailView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        float f = this.LIZJ;
        if (f > 0.0f) {
            float f2 = 2.0f * f;
            if (getWidth() > f2) {
                this.LIZLLL.reset();
                this.LIZLLL.moveTo(0.0f, 0.0f);
                this.LIZLLL.lineTo(0.0f, getHeight());
                this.LIZLLL.lineTo(getWidth() - f, getHeight());
                this.f26507LJ.set(getWidth() - f2, 0.0f, getWidth(), getHeight());
                this.LIZLLL.arcTo(this.f26507LJ, 90.0f, -180.0f);
                this.LIZLLL.close();
                if (canvas != null) {
                    canvas.clipPath(this.LIZLLL);
                }
            }
        }
        super.onDraw(canvas);
    }

    public CompactTailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompactTailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
