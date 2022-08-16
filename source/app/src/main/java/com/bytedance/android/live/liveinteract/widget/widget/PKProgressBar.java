package com.bytedance.android.live.liveinteract.widget.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.widget.widget.PKProgressBar;
import com.bytedance.android.livesdk.config.C6936ds;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.AbstractC81136HyU;
import p003X.C47A;
import p003X.C81135HyT;
import p003X.HTD;
import p003X.LK5;

/* loaded from: classes3.dex */
public class PKProgressBar extends View {
    public static ChangeQuickRedirect LIZ;
    public float LIZIZ;
    public AbstractC81136HyU LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final Paint f26508LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public RectF LJIIIZ;
    public RectF LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public ValueAnimator LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;

    static {
        Covode.recordClassIndex(31941);
    }

    public int getLeftValue() {
        return this.LJII;
    }

    public int getRightValue() {
        return this.LJIIIIZZ;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJII = 0;
        this.LJIIIIZZ = 0;
        this.LIZIZ = 0.5f;
        this.LJIJ = true;
        invalidate();
    }

    private boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!C47A.LIZIZ() || this.LJIIZILJ || this.LJIILLIIL) {
            return false;
        }
        return true;
    }

    private Path getClipPath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
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

    public void setIsAnchor(boolean z) {
        this.LJIILLIIL = z;
    }

    public void setIsPortrait(boolean z) {
        this.LJIIZILJ = z;
    }

    public void setOnProgressChangeListner(AbstractC81136HyU abstractC81136HyU) {
        this.LIZJ = abstractC81136HyU;
    }

    public PKProgressBar(Context context) {
        this(context, null);
    }

    public void setLeftValue(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIJ = false;
        this.LJII = i;
        int i2 = this.LJIIIIZZ;
        int i3 = this.LJII;
        if (i2 + i3 == 0) {
            this.LJIJ = true;
            setProgress(0.5f);
            return;
        }
        setProgress(i3 / (i3 + i2));
    }

    public void setRightValue(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIJ = false;
        this.LJIIIIZZ = i;
        int i2 = this.LJIIIIZZ;
        int i3 = this.LJII;
        if (i2 + i3 == 0) {
            this.LJIJ = true;
            setProgress(0.5f);
            return;
        }
        setProgress(i3 / (i3 + i2));
    }

    private void setProgress(final float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LIZJ.LIZIZ(f);
        float f2 = this.LIZIZ;
        ValueAnimator valueAnimator = this.LJIILL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJIILL.removeAllListeners();
            this.LJIILL.cancel();
        }
        this.LJIILL = ValueAnimator.ofFloat(f2, f);
        this.LJIILL.setDuration(300L);
        this.LJIILL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: X.HyS
            public static ChangeQuickRedirect LIZ;
            public final PKProgressBar LIZIZ;

            static {
                Covode.recordClassIndex(32054);
            }

            {
                this.LIZIZ = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                if (PatchProxy.proxy(new Object[]{valueAnimator2}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PKProgressBar pKProgressBar = this.LIZIZ;
                if (PatchProxy.proxy(new Object[]{valueAnimator2}, pKProgressBar, PKProgressBar.LIZ, false, 11).isSupported) {
                    return;
                }
                pKProgressBar.LIZIZ = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                if (pKProgressBar.LIZJ != null) {
                    pKProgressBar.LIZJ.LIZ(pKProgressBar.LIZIZ);
                }
                pKProgressBar.invalidate();
            }
        });
        this.LJIILL.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.android.live.liveinteract.widget.widget.PKProgressBar.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31942);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PKProgressBar pKProgressBar = PKProgressBar.this;
                pKProgressBar.LIZIZ = f;
                if (pKProgressBar.LIZJ != null) {
                    PKProgressBar.this.LIZJ.LIZ(PKProgressBar.this.LIZIZ);
                }
                PKProgressBar.this.invalidate();
            }
        });
        this.LJIILL.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        C6936ds c6936ds;
        MethodCollector.m14708i(2108);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(2108);
            return;
        }
        super.onDraw(canvas);
        float width = (this.LIZIZ * (getWidth() - LK5.LIZ(60.0f))) + LK5.LIZ(30.0f);
        RectF rectF = this.LJIIIZ;
        rectF.right = width;
        rectF.bottom = getHeight();
        RectF rectF2 = this.LJIIJ;
        rectF2.left = width;
        rectF2.bottom = getHeight();
        this.LJIIJ.right = getWidth();
        long LIZLLL = HTD.LIZIZ.LIZLLL();
        if (LIZLLL != 0 && LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE.getValue() != null && LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE.getValue().containsKey(Long.valueOf(LIZLLL)) && (c6936ds = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE.getValue().get(Long.valueOf(LIZLLL))) != null) {
            if (c6936ds.LJIIIIZZ != null && !TextUtils.isEmpty(c6936ds.LJIIIIZZ)) {
                try {
                    this.LJIIJJI = Color.parseColor(c6936ds.LJIIIIZZ);
                } catch (Exception unused) {
                }
            }
            if (c6936ds.LJIIIZ != null && !TextUtils.isEmpty(c6936ds.LJIIIZ)) {
                try {
                    this.LJIIL = Color.parseColor(c6936ds.LJIIIZ);
                } catch (Exception unused2) {
                }
            }
            if (c6936ds.LJIIL != null && !TextUtils.isEmpty(c6936ds.LJIIL)) {
                try {
                    this.LJFF = Color.parseColor(c6936ds.LJIIL);
                } catch (Exception unused3) {
                }
            }
            if (c6936ds.LJIIJ != null && !TextUtils.isEmpty(c6936ds.LJIIJ)) {
                try {
                    this.LJIILIIL = Color.parseColor(c6936ds.LJIIJ);
                } catch (Exception unused4) {
                }
            }
            if (c6936ds.LJIIJJI != null && !TextUtils.isEmpty(c6936ds.LJIIJJI)) {
                try {
                    this.LJIILJJIL = Color.parseColor(c6936ds.LJIIJJI);
                } catch (Exception unused5) {
                }
            }
            if (c6936ds.LJIILIIL != null && !TextUtils.isEmpty(c6936ds.LJIILIIL)) {
                try {
                    this.LJI = Color.parseColor(c6936ds.LJIILIIL);
                } catch (Exception unused6) {
                }
            }
        }
        canvas.clipPath(getClipPath());
        float f3 = (float) LIZLLL;
        if (!PatchProxy.proxy(new Object[]{canvas, Float.valueOf(width), Float.valueOf(f3)}, this, LIZ, false, 6).isSupported && !PatchProxy.proxy(new Object[]{canvas, Float.valueOf(width), Float.valueOf(f3)}, this, LIZ, false, 4).isSupported) {
            if (this.LJIJ) {
                this.f26508LJ.setShader(new LinearGradient(this.LJIIIZ.left, this.LJIIIZ.top, this.LJIIIZ.right, getHeight(), this.LJIIJJI, this.LJIIL, Shader.TileMode.MIRROR));
                if (LIZIZ()) {
                    canvas.drawPath(C81135HyT.LIZIZ.LIZ(this.LJIIIZ.left, this.LJIIIZ.top, this.LJIIIZ.right, getHeight(), 16.0f, 16.0f, true, false, false, true), this.f26508LJ);
                } else {
                    canvas.drawRect(this.LJIIIZ, this.f26508LJ);
                }
                this.f26508LJ.setShader(new LinearGradient(this.LJIIJ.left, this.LJIIJ.top, this.LJIIJ.right, getHeight(), this.LJIILIIL, this.LJIILJJIL, Shader.TileMode.MIRROR));
                if (LIZIZ()) {
                    canvas.drawPath(C81135HyT.LIZIZ.LIZ(this.LJIIJ.left, this.LJIIJ.top, this.LJIIJ.right, getHeight(), 16.0f, 16.0f, false, true, true, false), this.f26508LJ);
                } else {
                    canvas.drawRect(this.LJIIJ, this.f26508LJ);
                }
                this.f26508LJ.setShader(null);
            } else {
                if (this.LIZLLL) {
                    this.f26508LJ.setShader(new LinearGradient(this.LJIIJ.left, this.LJIIJ.top, this.LJIIJ.right, getHeight(), this.LJIILIIL, this.LJIILJJIL, Shader.TileMode.MIRROR));
                    if (LIZIZ()) {
                        canvas.drawPath(C81135HyT.LIZIZ.LIZ(this.LJIIJ.left, this.LJIIJ.top, this.LJIIJ.right, getHeight(), 16.0f, 16.0f, false, true, true, false), this.f26508LJ);
                    } else {
                        canvas.drawRect(this.LJIIJ, this.f26508LJ);
                    }
                    this.f26508LJ.setShader(new LinearGradient(this.LJIIIZ.left, this.LJIIIZ.top, this.LJIIIZ.right, getHeight(), this.LJIIJJI, this.LJIIL, Shader.TileMode.MIRROR));
                    if (LIZIZ()) {
                        f2 = 16.0f;
                    } else {
                        f2 = 24.0f;
                    }
                    canvas.drawPath(C81135HyT.LIZIZ.LIZ(0.0f, 0.0f, width + LK5.LIZ(7.0f), getHeight(), f2, f2, LIZIZ(), true, true, LIZIZ()), this.f26508LJ);
                } else {
                    this.f26508LJ.setShader(new LinearGradient(this.LJIIIZ.left, this.LJIIIZ.top, this.LJIIIZ.right, getHeight(), this.LJIIJJI, this.LJIIL, Shader.TileMode.MIRROR));
                    if (LIZIZ()) {
                        canvas.drawPath(C81135HyT.LIZIZ.LIZ(this.LJIIIZ.left, this.LJIIIZ.top, this.LJIIIZ.right, getHeight(), 16.0f, 16.0f, true, false, false, true), this.f26508LJ);
                    } else {
                        canvas.drawRect(this.LJIIIZ, this.f26508LJ);
                    }
                    this.f26508LJ.setShader(new LinearGradient(this.LJIIJ.left, this.LJIIJ.top, this.LJIIJ.right, getHeight(), this.LJIILIIL, this.LJIILJJIL, Shader.TileMode.MIRROR));
                    if (LIZIZ()) {
                        f = 16.0f;
                    } else {
                        f = 15.0f;
                    }
                    canvas.drawPath(C81135HyT.LIZIZ.LIZ(width - LK5.LIZ(7.0f), 0.0f, getWidth(), getHeight(), f, f, true, LIZIZ(), LIZIZ(), true), this.f26508LJ);
                }
                this.f26508LJ.setShader(null);
            }
        }
        this.LIZJ.LIZIZ(this.LJFF, this.LJI);
        MethodCollector.m14707o(2108);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842875);
    }

    public PKProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(2107);
        this.LJIIZILJ = true;
        this.LJIJ = true;
        this.LJFF = CastProtectorUtils.parseColor("#7D0044");
        this.LJI = CastProtectorUtils.parseColor("#0A1276");
        this.LJIIIIZZ = 0;
        this.LJII = 0;
        this.LIZIZ = 0.5f;
        this.LJIIJJI = CastProtectorUtils.parseColor("#fd2d55");
        this.LJIIL = CastProtectorUtils.parseColor("#ff3ce3");
        this.LJIILIIL = CastProtectorUtils.parseColor("#7ddeff");
        this.LJIILJJIL = CastProtectorUtils.parseColor("#606bff");
        this.f26508LJ = new Paint();
        this.f26508LJ.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26508LJ.setStyle(Paint.Style.FILL);
        this.f26508LJ.setDither(true);
        this.f26508LJ.setAntiAlias(true);
        this.LJIIIZ = new RectF(0.0f, 0.0f, this.LIZIZ * getWidth(), getHeight());
        this.LJIIJ = new RectF(this.LIZIZ * getWidth(), 0.0f, getWidth(), getHeight());
        LinkCrossRoomDataHolder.LJII();
        MethodCollector.m14707o(2107);
    }

    public final void LIZ(int i, int i2, int i3, int i4) {
        this.LJIIJJI = i;
        this.LJIIL = i2;
        this.LJIILIIL = i3;
        this.LJIILJJIL = i4;
    }
}
