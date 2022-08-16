package com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.p353ui.KtvSeatAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC471284kE;
import p003X.C106862S5w;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.ui.KtvSeatAnimationView */
/* loaded from: classes22.dex */
public final class KtvSeatAnimationView extends View implements AbstractC471284kE {
    public static ChangeQuickRedirect LIZ;
    public float LIZIZ;
    public float LIZJ;
    public final float LIZLLL;

    /* renamed from: LJ */
    public final float f26292LJ;
    public final Paint LJFF;
    public SweepGradient LJI;
    public final int[] LJII;
    public final PorterDuffXfermode LJIIIIZZ;
    public final RectF LJIIIZ;
    public final long LJIIJ;
    public ValueAnimator LJIIJJI;
    public ValueAnimator LJIIL;
    public ValueAnimator LJIILIIL;
    public AnimatorSet LJIILJJIL;
    public Matrix LJIILL;

    static {
        Covode.recordClassIndex(26406);
    }

    public KtvSeatAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public KtvSeatAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LIZ();
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.LJIIJJI;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.LJIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.LJIILIIL;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator4 = this.LJIIJJI;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.LJIIL;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.LJIILIIL;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        AnimatorSet animatorSet = this.LJIILJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        MethodCollector.m14708i(1769);
        int i = 0;
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 6).isSupported) {
            MethodCollector.m14707o(1769);
            return;
        }
        super.onDraw(canvas);
        Integer num = null;
        this.LJFF.setXfermode(null);
        RectF rectF = this.LJIIIZ;
        rectF.right = 0.0f;
        rectF.left = getMeasuredWidth();
        RectF rectF2 = this.LJIIIZ;
        rectF2.top = 0.0f;
        rectF2.bottom = getMeasuredHeight();
        this.LJIILL.setRotate(this.LIZJ, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        SweepGradient sweepGradient = this.LJI;
        if (sweepGradient != null) {
            sweepGradient.setLocalMatrix(this.LJIILL);
        }
        if (canvas != null) {
            canvas.drawRect(this.LJIIIZ, this.LJFF);
            num = Integer.valueOf(canvas.getSaveCount());
        }
        this.LJFF.setXfermode(this.LJIIIIZZ);
        RectF rectF3 = this.LJIIIZ;
        rectF3.right = this.LIZIZ;
        float measuredWidth = getMeasuredWidth();
        float f = this.LIZIZ;
        rectF3.left = measuredWidth - f;
        RectF rectF4 = this.LJIIIZ;
        rectF4.top = f;
        rectF4.bottom = getMeasuredHeight() - this.LIZIZ;
        if (canvas != null) {
            canvas.drawRect(this.LJIIIZ, this.LJFF);
            if (num != null) {
                i = num.intValue();
            }
            canvas.restoreToCount(i);
            MethodCollector.m14707o(1769);
            return;
        }
        MethodCollector.m14707o(1769);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.setVisibility(i);
        if (i == 0) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                LIZ();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LIZLLL, this.f26292LJ);
                if (ofFloat != null) {
                    ofFloat.setDuration(this.LJIIJ);
                    ofFloat.setRepeatMode(2);
                    ofFloat.setRepeatCount(-1);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4kB
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(26407);
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            if (!(animatedValue instanceof Float)) {
                                animatedValue = null;
                            }
                            Float f = (Float) animatedValue;
                            if (f != null) {
                                float floatValue = f.floatValue();
                                KtvSeatAnimationView ktvSeatAnimationView = KtvSeatAnimationView.this;
                                ktvSeatAnimationView.LIZIZ = floatValue;
                                ktvSeatAnimationView.invalidate();
                            }
                        }
                    });
                } else {
                    ofFloat = null;
                }
                this.LJIIJJI = ofFloat;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 360.0f);
                if (ofFloat2 != null) {
                    ofFloat2.setDuration(this.LJIIJ);
                    ofFloat2.setRepeatMode(1);
                    ofFloat2.setRepeatCount(-1);
                    ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4kC
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(26408);
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            if (!(animatedValue instanceof Float)) {
                                animatedValue = null;
                            }
                            Float f = (Float) animatedValue;
                            if (f != null) {
                                float floatValue = f.floatValue();
                                KtvSeatAnimationView ktvSeatAnimationView = KtvSeatAnimationView.this;
                                ktvSeatAnimationView.LIZJ = floatValue;
                                ktvSeatAnimationView.invalidate();
                            }
                        }
                    });
                } else {
                    ofFloat2 = null;
                }
                this.LJIIL = ofFloat2;
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                if (ofFloat3 != null) {
                    ofFloat3.setDuration(this.LJIIJ);
                    ofFloat3.setRepeatMode(2);
                    ofFloat3.setRepeatCount(-1);
                    ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.4kD
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(26409);
                        }

                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                                return;
                            }
                            Intrinsics.checkNotNullExpressionValue(valueAnimator, "");
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            if (!(animatedValue instanceof Float)) {
                                animatedValue = null;
                            }
                            Float f = (Float) animatedValue;
                            if (f != null) {
                                KtvSeatAnimationView.this.setAlpha(f.floatValue());
                            }
                        }
                    });
                } else {
                    ofFloat3 = null;
                }
                this.LJIILIIL = ofFloat3;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(this.LJIIJJI, this.LJIIL, this.LJIILIIL);
                animatorSet.setDuration(this.LJIIJ);
                this.LJIILJJIL = animatorSet;
                AnimatorSet animatorSet2 = this.LJIILJJIL;
                if (animatorSet2 != null) {
                    animatorSet2.start();
                    return;
                }
                return;
            }
            return;
        }
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        MethodCollector.m14708i(1768);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1768);
            return;
        }
        super.onMeasure(i, i2);
        if (this.LJI == null) {
            this.LJI = new SweepGradient(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.LJII, (float[]) null);
            this.LJFF.setShader(this.LJI);
        }
        MethodCollector.m14707o(1768);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvSeatAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1770);
        this.LIZLLL = LK1.LIZJ(1);
        this.f26292LJ = LK1.LIZJ(3);
        this.LIZIZ = this.LIZLLL;
        this.LJFF = new Paint();
        this.LJII = new int[]{CastProtectorUtils.parseColor("#63E5FF"), CastProtectorUtils.parseColor("#A2BDFF"), CastProtectorUtils.parseColor("#FF72C8"), CastProtectorUtils.parseColor("#A2BDFF"), CastProtectorUtils.parseColor("#63E5FF")};
        this.LJIIIIZZ = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
        this.LJIIIZ = new RectF();
        this.LJIIJ = 1000L;
        this.LJIILL = new Matrix();
        this.LJFF.setStyle(Paint.Style.FILL);
        setLayerType(1, null);
        MethodCollector.m14707o(1770);
    }

    public /* synthetic */ KtvSeatAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
