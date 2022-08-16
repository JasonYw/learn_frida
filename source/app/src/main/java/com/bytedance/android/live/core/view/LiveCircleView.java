package com.bytedance.android.live.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;

/* loaded from: classes12.dex */
public class LiveCircleView extends View {
    public static ChangeQuickRedirect LIZ;
    public Paint LIZIZ;
    public float LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26205LJ;
    public float LJFF;
    public float LJI;
    public int LJII;
    public Paint LJIIIIZZ;

    static {
        Covode.recordClassIndex(24212);
    }

    public void setStrokeWidth(int i) {
        this.LIZJ = i;
    }

    public LiveCircleView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        MethodCollector.m14708i(1635);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1635);
            return;
        }
        super.onDraw(canvas);
        canvas.drawCircle(this.LIZLLL, this.f26205LJ, this.LJFF, this.LIZIZ);
        canvas.drawCircle(this.LIZLLL, this.f26205LJ, this.LJI, this.LJIIIIZZ);
        MethodCollector.m14707o(1635);
    }

    public void setFraction(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJI = this.LJFF + (this.LJII * f);
        this.LJIIIIZZ.setStrokeWidth(this.LIZJ * (1.0f - f));
        postInvalidate();
    }

    public LiveCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1634);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(1634);
            return;
        }
        super.onMeasure(i, i2);
        this.LIZLLL = getMeasuredWidth() / 2;
        this.f26205LJ = getMeasuredHeight() / 2;
        this.LJFF = (getMeasuredHeight() / 2) - getPaddingBottom();
        this.LJI = this.LJFF;
        this.LJII = getPaddingBottom();
        MethodCollector.m14707o(1634);
    }

    public LiveCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1633);
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported) {
            this.LIZJ = (int) UIUtils.dip2Px(context, 1.0f);
            this.LIZIZ = new Paint();
            this.LIZIZ.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, CastProtectorUtils.parseColor("#FF1764"), CastProtectorUtils.parseColor("#ED3495"), Shader.TileMode.MIRROR));
            this.LIZIZ.setAntiAlias(true);
            this.LIZIZ.setDither(true);
            this.LIZIZ.setStyle(Paint.Style.STROKE);
            this.LIZIZ.setStrokeWidth(UIUtils.dip2Px(context, 1.0f));
            this.LJIIIIZZ = new Paint(this.LIZIZ);
        }
        MethodCollector.m14707o(1633);
    }
}
