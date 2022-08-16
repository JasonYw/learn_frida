package com.bytedance.android.live.liveinteract.voicechat.fight.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightProgressBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.C81135HyT;
import p003X.H5W;
import p003X.H9V;
import p003X.LK5;

/* loaded from: classes3.dex */
public class TeamFightProgressBar extends View {
    public static ChangeQuickRedirect LIZ;
    public float LIZIZ;
    public RectF LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26487LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public H5W LJIIIIZZ;
    public H9V LJIIIZ;
    public boolean LJIIJ;
    public final Paint LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public RectF LJIILJJIL;
    public ValueAnimator LJIILL;
    public boolean LJIILLIIL;
    public View.OnTouchListener LJIIZILJ;

    static {
        Covode.recordClassIndex(31395);
    }

    public int getLeftValue() {
        return this.LJIIL;
    }

    public int getRightValue() {
        return this.LJIILIIL;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIIL = 0;
        this.LJIILIIL = 0;
        this.LIZIZ = 0.5f;
        this.LJIILLIIL = true;
        this.LJII = LK5.LIZ(30.0f);
        invalidate();
    }

    private Path getClipPath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Path) proxy.result;
        }
        float leftPaddingOffset = getLeftPaddingOffset();
        float topPaddingOffset = getTopPaddingOffset();
        float rightPaddingOffset = getRightPaddingOffset();
        float bottomPaddingOffset = getBottomPaddingOffset();
        Path path = new Path();
        path.moveTo(leftPaddingOffset, topPaddingOffset);
        float width = ((getWidth() - leftPaddingOffset) - rightPaddingOffset) + leftPaddingOffset;
        path.lineTo(width, topPaddingOffset);
        float height = ((getHeight() - topPaddingOffset) - bottomPaddingOffset) + topPaddingOffset;
        path.lineTo(width, height);
        path.lineTo(leftPaddingOffset, height);
        path.lineTo(leftPaddingOffset, topPaddingOffset);
        path.close();
        return path;
    }

    public void setOnProgressChangeListener(H5W h5w) {
        this.LJIIIIZZ = h5w;
    }

    public void setProgressBarClickListener(H9V h9v) {
        this.LJIIIZ = h9v;
    }

    public TeamFightProgressBar(Context context) {
        this(context, null);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LJII = i;
        invalidate();
    }

    public void setLeftValue(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJIILLIIL = false;
        this.LJIIL = i;
        int i2 = this.LJIILIIL;
        int i3 = this.LJIIL;
        if (i2 + i3 == 0) {
            this.LJIILLIIL = true;
            setProgress(0.5f);
            return;
        }
        setProgress(i3 / (i3 + i2));
    }

    public void setRightValue(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIILLIIL = false;
        this.LJIILIIL = i;
        int i2 = this.LJIILIIL;
        int i3 = this.LJIIL;
        if (i2 + i3 == 0) {
            this.LJIILLIIL = true;
            setProgress(0.5f);
            return;
        }
        setProgress(i3 / (i3 + i2));
    }

    private void setProgress(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        float f2 = this.LIZIZ;
        ValueAnimator valueAnimator = this.LJIILL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJIILL.cancel();
        }
        this.LJIILL = ValueAnimator.ofFloat(f2, f);
        this.LJIILL.setDuration(300L);
        this.LJIILL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X.H9U
            public static ChangeQuickRedirect LIZ;
            public final TeamFightProgressBar LIZIZ;

            static {
                Covode.recordClassIndex(31404);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (PatchProxy.proxy(new Object[]{valueAnimator2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                TeamFightProgressBar teamFightProgressBar = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{valueAnimator2}, teamFightProgressBar, TeamFightProgressBar.LIZ, false, 9).isSupported) {
                    return;
                }
                teamFightProgressBar.LIZIZ = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (teamFightProgressBar.LJIIIIZZ != null) {
                    teamFightProgressBar.LJIIIIZZ.LIZ(teamFightProgressBar.LIZIZ);
                }
                teamFightProgressBar.invalidate();
            }
        });
        this.LJIILL.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        MethodCollector.m14708i(2082);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(2082);
            return;
        }
        super.onDraw(canvas);
        float f = this.LIZIZ;
        int width = getWidth();
        int i = this.LJII;
        float f2 = (f * (width - (i * 2))) + i;
        RectF rectF = this.LIZJ;
        rectF.right = f2;
        rectF.bottom = getHeight();
        RectF rectF2 = this.LJIILJJIL;
        rectF2.left = f2;
        rectF2.bottom = getHeight();
        this.LJIILJJIL.right = getWidth();
        canvas.clipPath(getClipPath());
        if (!PatchProxy.proxy(new Object[]{canvas, Float.valueOf(f2)}, this, LIZ, false, 4).isSupported) {
            if (this.LJIILLIIL) {
                this.LJIIJJI.setShader(new LinearGradient(this.LIZJ.left, this.LIZJ.top, this.LIZJ.right, getHeight(), this.LIZLLL, this.f26487LJ, Shader.TileMode.MIRROR));
                canvas.drawRect(this.LIZJ, this.LJIIJJI);
                this.LJIIJJI.setShader(new LinearGradient(this.LJIILJJIL.left, this.LJIILJJIL.top, this.LJIILJJIL.right, getHeight(), this.LJFF, this.LJI, Shader.TileMode.MIRROR));
                canvas.drawRect(this.LJIILJJIL, this.LJIIJJI);
            } else {
                this.LJIIJJI.setShader(new LinearGradient(this.LJIILJJIL.left, this.LJIILJJIL.top, this.LJIILJJIL.right, getHeight(), this.LJFF, this.LJI, Shader.TileMode.MIRROR));
                canvas.drawRect(this.LJIILJJIL, this.LJIIJJI);
                this.LJIIJJI.setShader(new LinearGradient(this.LIZJ.left, this.LIZJ.top, this.LIZJ.right, getHeight(), this.LIZLLL, this.f26487LJ, Shader.TileMode.MIRROR));
                canvas.drawPath(C81135HyT.LIZIZ.LIZ(0.0f, 0.0f, f2 + LK5.LIZ(7.0f), getHeight(), 24.0f, 24.0f, false, true, true, false), this.LJIIJJI);
            }
            this.LJIIJJI.setShader(null);
        }
        MethodCollector.m14707o(2082);
    }

    public TeamFightProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public TeamFightProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2081);
        this.LJII = LK5.LIZ(30.0f);
        this.LJIILLIIL = true;
        this.LJIIJ = false;
        this.LJIILIIL = 0;
        this.LJIIL = 0;
        this.LIZIZ = 0.5f;
        this.LIZLLL = CastProtectorUtils.parseColor("#fd2d55");
        this.f26487LJ = CastProtectorUtils.parseColor("#ff3ce3");
        this.LJFF = CastProtectorUtils.parseColor("#7ddeff");
        this.LJI = CastProtectorUtils.parseColor("#606bff");
        this.LJIIJJI = new Paint();
        this.LJIIJJI.setTypeface(Typeface.DEFAULT_BOLD);
        this.LJIIJJI.setStyle(Paint.Style.FILL);
        this.LJIIJJI.setDither(true);
        this.LJIIJJI.setAntiAlias(true);
        this.LIZJ = new RectF(0.0f, 0.0f, this.LIZIZ * getWidth(), getHeight());
        this.LJIILJJIL = new RectF(this.LIZIZ * getWidth(), 0.0f, getWidth(), getHeight());
        this.LJIIZILJ = new View.OnTouchListener() { // from class: com.bytedance.android.live.liveinteract.voicechat.fight.view.TeamFightProgressBar.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31396);
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                if (TeamFightProgressBar.this.LJIIIZ == null) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1) {
                        if (TeamFightProgressBar.this.LJIIJ && TeamFightProgressBar.this.LIZJ != null) {
                            if (motionEvent.getX() >= TeamFightProgressBar.this.LIZJ.right) {
                                TeamFightProgressBar.this.LJIIIZ.LIZIZ();
                            } else {
                                TeamFightProgressBar.this.LJIIIZ.LIZ();
                            }
                        }
                        TeamFightProgressBar.this.LJIIJ = false;
                    }
                    return true;
                }
                TeamFightProgressBar.this.LJIIJ = true;
                return true;
            }
        };
        setOnTouchListener(this.LJIIZILJ);
        MethodCollector.m14707o(2081);
    }
}
