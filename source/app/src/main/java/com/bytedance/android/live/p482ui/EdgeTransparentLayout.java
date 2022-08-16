package com.bytedance.android.live.p482ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.ui.EdgeTransparentLayout */
/* loaded from: classes12.dex */
public final class EdgeTransparentLayout extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public int LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public int f26745LJ;
    public int LJFF;
    public Paint LIZIZ = new Paint(1);
    public final int[] LJI = {-1, 0};
    public final float[] LJII = {0.0f, 1.0f};

    static {
        Covode.recordClassIndex(36318);
    }

    public final void setTransparentPosition(int i) {
        this.LIZJ = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeTransparentLayout(Context context) {
        super(context, null);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2318);
        MethodCollector.m14707o(2318);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2317);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(2317);
            return;
        }
        super.onDraw(canvas);
        MethodCollector.m14707o(2317);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeTransparentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C106862S5w.LIZ(context, attributeSet);
        MethodCollector.m14708i(2319);
        LIZ(context, attributeSet);
        MethodCollector.m14707o(2319);
    }

    private final void LIZ(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ.setStyle(Paint.Style.FILL);
        this.LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130773052});
        this.LIZLLL = obtainStyledAttributes.getDimension(0, LK5.LIZJ(20.0f));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeTransparentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context, attributeSet);
        MethodCollector.m14708i(2320);
        LIZ(context, attributeSet);
        MethodCollector.m14707o(2320);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{canvas2, view, new Long(j)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(canvas2);
        int saveLayer = canvas2.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        boolean drawChild = super.drawChild(canvas2, view, j);
        int i = this.LIZJ;
        if (i == -1) {
            return drawChild;
        }
        if (i == 0 || (i & 1) != 0) {
            canvas2.drawRect(0.0f, 0.0f, this.f26745LJ, this.LIZLLL, this.LIZIZ);
        }
        int i2 = this.LIZJ;
        if (i2 == 0 || (i2 & 2) != 0) {
            int save = canvas2.save();
            canvas2.rotate(180.0f, this.f26745LJ / 2.0f, this.LJFF / 2.0f);
            canvas2.drawRect(0.0f, 0.0f, this.f26745LJ, this.LIZLLL, this.LIZIZ);
            canvas2.restoreToCount(save);
        }
        float f = (this.LJFF - this.f26745LJ) / 2.0f;
        int i3 = this.LIZJ;
        if (i3 == 0 || (i3 & 4) != 0) {
            int save2 = canvas2.save();
            canvas2.rotate(270.0f, this.f26745LJ / 2.0f, this.LJFF / 2.0f);
            canvas2.translate(0.0f, f);
            canvas2.drawRect(0.0f - f, 0.0f, this.f26745LJ + f, this.LIZLLL, this.LIZIZ);
            canvas2.restoreToCount(save2);
        }
        int i4 = this.LIZJ;
        if (i4 == 0 || (i4 & 8) != 0) {
            int save3 = canvas2.save();
            canvas2.rotate(90.0f, this.f26745LJ / 2.0f, this.LJFF / 2.0f);
            canvas2.translate(0.0f, f);
            canvas2 = canvas2;
            canvas2.drawRect(0.0f - f, 0.0f, this.f26745LJ + f, this.LIZLLL, this.LIZIZ);
            canvas2.restoreToCount(save3);
        }
        canvas2.restoreToCount(saveLayer);
        return drawChild;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            this.LIZIZ.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, this.LIZLLL, this.LJI, this.LJII, Shader.TileMode.CLAMP));
        }
        this.f26745LJ = getWidth();
        this.LJFF = getHeight();
    }
}
