package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C106862S5w;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.TeamFightPartBackground */
/* loaded from: classes12.dex */
public final class TeamFightPartBackground extends View {
    public static ChangeQuickRedirect LIZ;
    public Paint LIZIZ = new Paint();
    public float LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26457LJ;
    public float LJFF;
    public boolean LJI;
    public Shader LJII;
    public RectF LJIIIIZZ;
    public Path LJIIIZ;

    static {
        Covode.recordClassIndex(30450);
    }

    private final Shader getShader() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (Shader) proxy.result;
        }
        if (this.LJII == null) {
            this.LJII = new LinearGradient(0.0f, 0.0f, 1.0f * getWidth(), 0.0f, this.LIZLLL, this.f26457LJ, Shader.TileMode.CLAMP);
        }
        Shader shader = this.LJII;
        if (shader != null) {
            return shader;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Shader");
    }

    private final RectF getRoundRect() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (RectF) proxy.result;
        }
        if (this.LJIIIIZZ == null) {
            float f = this.LJFF;
            float f2 = (this.LIZJ * 2.0f) + f;
            if (this.LJI) {
                this.LJIIIIZZ = new RectF(f2 * (-1.0f), 0.0f, (getWidth() * 1.0f) - (this.LJFF / 2.0f), (getHeight() * 1.0f) - this.LJFF);
            } else {
                this.LJIIIIZZ = new RectF(f / 2.0f, 0.0f, (getWidth() * 1.0f) + f2, (getHeight() * 1.0f) - this.LJFF);
            }
        }
        RectF rectF = this.LJIIIIZZ;
        if (rectF != null) {
            return rectF;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.RectF");
    }

    private final Path getRoundRectPath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Path) proxy.result;
        }
        float LIZJ = LK5.LIZJ(this.LIZJ);
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new Path();
            if (this.LJI) {
                float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, LIZJ, LIZJ, 0.0f, 0.0f};
                Path path = this.LJIIIZ;
                if (path != null) {
                    path.addRoundRect(getRoundRect(), fArr, Path.Direction.CW);
                }
            } else {
                float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, LIZJ, LIZJ};
                Path path2 = this.LJIIIZ;
                if (path2 != null) {
                    path2.addRoundRect(getRoundRect(), fArr2, Path.Direction.CW);
                }
            }
        }
        Path path3 = this.LJIIIZ;
        if (path3 != null) {
            return path3;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.Path");
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2029);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(2029);
            return;
        }
        Paint paint = this.LIZIZ;
        if (paint != null && canvas != null) {
            canvas.drawPath(getRoundRectPath(), paint);
        }
        super.onDraw(canvas);
        MethodCollector.m14707o(2029);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(2028);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(2028);
            return;
        }
        setMeasuredDimension(i, i2);
        super.onMeasure(i, i2);
        MethodCollector.m14707o(2028);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightPartBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context, attributeSet);
        MethodCollector.m14708i(2031);
        this.LJI = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772358, 2130773069, 2130773572, 2130774558, 2130774584});
        this.LIZLLL = obtainStyledAttributes.getColor(3, CastProtectorUtils.parseColor("#000000"));
        this.f26457LJ = obtainStyledAttributes.getColor(1, CastProtectorUtils.parseColor("#000000"));
        this.LIZJ = obtainStyledAttributes.getDimension(0, 0.0f);
        this.LJI = obtainStyledAttributes.getBoolean(2, true);
        this.LJFF = obtainStyledAttributes.getDimension(4, 0.0f);
        if (this.LJI) {
            Paint paint = this.LIZIZ;
            if (paint != null) {
                paint.setColor(this.f26457LJ);
            }
        } else {
            Paint paint2 = this.LIZIZ;
            if (paint2 != null) {
                paint2.setColor(this.LIZLLL);
            }
        }
        Paint paint3 = this.LIZIZ;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.LJFF);
        }
        Paint paint4 = this.LIZIZ;
        if (paint4 != null) {
            paint4.setAntiAlias(true);
        }
        Paint paint5 = this.LIZIZ;
        if (paint5 != null) {
            paint5.setStyle(Paint.Style.STROKE);
            MethodCollector.m14707o(2031);
            return;
        }
        MethodCollector.m14707o(2031);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Paint paint;
        MethodCollector.m14708i(2030);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(2030);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (z && (paint = this.LIZIZ) != null) {
            paint.setShader(getShader());
            MethodCollector.m14707o(2030);
            return;
        }
        MethodCollector.m14707o(2030);
    }
}
