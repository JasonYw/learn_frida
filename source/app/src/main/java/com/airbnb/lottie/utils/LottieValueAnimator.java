package com.airbnb.lottie.utils;

import android.view.Choreographer;
import com.airbnb.lottie.LottieComposition;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p002O.C0002O;
import p003X.AbstractC109239Szh;
import p003X.C143337eEl;
import p003X.C145192eii;
import p003X.C145323ekp;
import p003X.C145327ekt;
import p003X.C145328eku;
import p003X.C145338el4;
import p003X.C145480enO;

/* loaded from: classes19.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    public static AbstractC109239Szh LJII;
    public static final AbstractC109239Szh LJIIJJI;
    public long LIZIZ;
    public float LIZJ;
    public LottieComposition LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public C145338el4 LJIIJ;
    public float LIZ = 1.0f;
    public float LIZLLL = -2.14748365E9f;

    /* renamed from: LJ */
    public float f21092LJ = 2.14748365E9f;

    public final void LJII() {
        LJIILJJIL();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.LJI;
    }

    private void LJIILJJIL() {
        LIZJ(true);
    }

    /* renamed from: LJ */
    public final void m20540LJ() {
        this.LIZ = -this.LIZ;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        LIZIZ();
        LJIILJJIL();
    }

    private boolean LJIIL() {
        if (this.LIZ < 0.0f) {
            return true;
        }
        return false;
    }

    private void LJIILIIL() {
        if (isRunning()) {
            LIZJ(false);
            LJII.LIZ(this);
        }
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(4147);
        C08521 c08521 = new C08521();
        LJIIJJI = c08521;
        LJII = c08521;
    }

    public final void LJI() {
        LJIILJJIL();
        LIZIZ(LJIIL());
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(LIZLLL());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.LJFF;
        if (lottieComposition == null) {
            return 0L;
        }
        return lottieComposition.getDuration();
    }

    static {
        if (ReDexClinitStringAb.abTest >= 4) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(4147);
        C08521 c08521 = new C08521();
        LJIIJJI = c08521;
        LJII = c08521;
    }

    private float LJIIJJI() {
        LottieComposition lottieComposition = this.LJFF;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.LIZ);
    }

    public final float LIZLLL() {
        LottieComposition lottieComposition = this.LJFF;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.LIZJ - lottieComposition.getStartFrame()) / (this.LJFF.getEndFrame() - this.LJFF.getStartFrame());
    }

    public final float LJIIIZ() {
        LottieComposition lottieComposition = this.LJFF;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.LIZLLL;
        if (f == -2.14748365E9f) {
            return lottieComposition.getStartFrame();
        }
        return f;
    }

    public final float LJIIJ() {
        LottieComposition lottieComposition = this.LJFF;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f21092LJ;
        if (f == 2.14748365E9f) {
            return lottieComposition.getEndFrame();
        }
        return f;
    }

    public final void LJFF() {
        float LJIIIZ;
        this.LJI = true;
        LIZ(LJIIL());
        if (LJIIL()) {
            LJIIIZ = LJIIJ();
        } else {
            LJIIIZ = LJIIIZ();
        }
        LIZ((int) LJIIIZ);
        if (C145328eku.LIZ) {
            this.LIZIZ = 0L;
        } else {
            this.LIZIZ = System.nanoTime();
        }
        this.LJIIIZ = 0;
        LJIILIIL();
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float LJIIIZ;
        float LJIIJ;
        float LJIIIZ2;
        if (this.LJFF == null) {
            return 0.0f;
        }
        if (LJIIL()) {
            LJIIIZ = LJIIJ() - this.LIZJ;
            LJIIJ = LJIIJ();
            LJIIIZ2 = LJIIIZ();
        } else {
            LJIIIZ = this.LIZJ - LJIIIZ();
            LJIIJ = LJIIJ();
            LJIIIZ2 = LJIIIZ();
        }
        return LJIIIZ / (LJIIJ - LJIIIZ2);
    }

    private void LJIILL() {
        if (this.LJFF == null) {
            return;
        }
        float f = this.LIZJ;
        if (f < this.LIZLLL || f > this.f21092LJ) {
            C145327ekt.LIZ().LIZ(new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.LIZLLL), Float.valueOf(this.f21092LJ), Float.valueOf(this.LIZJ))), C0002O.m25086C("resId=", this.LJFF.errorReportResId));
        }
    }

    public final void LJIIIIZZ() {
        this.LJI = true;
        LJIILIIL();
        if (C145328eku.LIZ) {
            this.LIZIZ = 0L;
        } else {
            this.LIZIZ = System.nanoTime();
        }
        if (LJIIL() && this.LIZJ == LJIIIZ()) {
            this.LIZJ = LJIIJ();
        } else if (!LJIIL() && this.LIZJ == LJIIJ()) {
            this.LIZJ = LJIIIZ();
        }
    }

    /* renamed from: com.airbnb.lottie.utils.LottieValueAnimator$1 */
    /* loaded from: classes10.dex */
    public static class C08521 implements AbstractC109239Szh {
        static {
            Covode.recordClassIndex(4148);
        }

        @Override // p003X.AbstractC109239Szh
        public final void LIZ(Choreographer.FrameCallback frameCallback) {
            Choreographer.getInstance().postFrameCallback(frameCallback);
        }

        @Override // p003X.AbstractC109239Szh
        public final void LIZIZ(Choreographer.FrameCallback frameCallback) {
            Choreographer.getInstance().removeFrameCallback(frameCallback);
        }
    }

    private void LIZJ(boolean z) {
        LJII.LIZIZ(this);
        if (z) {
            this.LJI = false;
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        if (C143337eEl.LIZ.booleanValue() && !C145480enO.LJFF) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
            return;
        }
        LIZ(j);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.LJIIIIZZ) {
            this.LJIIIIZZ = false;
            m20540LJ();
        }
    }

    public final void LIZ(int i) {
        float f = i;
        if (this.LIZJ == f) {
            return;
        }
        this.LIZJ = C145192eii.LIZIZ(f, LJIIIZ(), LJIIJ());
        if (C145328eku.LIZ) {
            this.LIZIZ = 0L;
        } else {
            this.LIZIZ = System.nanoTime();
        }
        LIZJ();
    }

    private void LIZ(long j) {
        long nanoTime;
        long j2;
        float LJIIIZ;
        float LJIIJ;
        LJIILIIL();
        if (this.LJFF != null && isRunning()) {
            if (C145328eku.LIZ) {
                long j3 = this.LIZIZ;
                j2 = 0;
                if (j3 != 0) {
                    j2 = j - j3;
                }
                if (C145328eku.LIZJ) {
                    if (this.LJIIJ == null) {
                        this.LJIIJ = new C145338el4();
                    }
                    C145338el4 c145338el4 = this.LJIIJ;
                    if (c145338el4 != null && c145338el4.LIZ(this.LJFF.getFrameRate(), j)) {
                        return;
                    }
                }
                nanoTime = j;
            } else {
                nanoTime = System.nanoTime();
                j2 = nanoTime - this.LIZIZ;
            }
            float LJIIJJI2 = ((float) j2) / LJIIJJI();
            float f = this.LIZJ;
            if (LJIIL()) {
                LJIIJJI2 = -LJIIJJI2;
            }
            this.LIZJ = f + LJIIJJI2;
            boolean z = !C145192eii.LIZJ(this.LIZJ, LJIIIZ(), LJIIJ());
            this.LIZJ = C145192eii.LIZIZ(this.LIZJ, LJIIIZ(), LJIIJ());
            this.LIZIZ = nanoTime;
            C145323ekp.LIZ(j);
            C145323ekp.LIZIZ(null);
            LIZJ();
            if (z) {
                if (getRepeatCount() != -1 && this.LJIIIZ >= getRepeatCount()) {
                    if (C145328eku.LIZ) {
                        if (this.LIZ < 0.0f) {
                            LJIIJ = LJIIIZ();
                        } else {
                            LJIIJ = LJIIJ();
                        }
                        this.LIZJ = LJIIJ;
                    } else {
                        this.LIZJ = LJIIJ();
                    }
                    LJIILJJIL();
                    LIZIZ(LJIIL());
                } else {
                    LIZ();
                    this.LJIIIZ++;
                    if (getRepeatMode() == 2) {
                        this.LJIIIIZZ = !this.LJIIIIZZ;
                        m20540LJ();
                    } else {
                        if (LJIIL()) {
                            LJIIIZ = LJIIJ();
                        } else {
                            LJIIIZ = LJIIIZ();
                        }
                        this.LIZJ = LJIIIZ;
                    }
                    this.LIZIZ = nanoTime;
                }
            }
            LJIILL();
        }
    }

    public final void LIZ(int i, int i2) {
        float startFrame;
        float endFrame;
        LottieComposition lottieComposition = this.LJFF;
        if (lottieComposition == null) {
            startFrame = -3.4028235E38f;
        } else {
            startFrame = lottieComposition.getStartFrame();
        }
        LottieComposition lottieComposition2 = this.LJFF;
        if (lottieComposition2 == null) {
            endFrame = Float.MAX_VALUE;
        } else {
            endFrame = lottieComposition2.getEndFrame();
        }
        float f = i;
        this.LIZLLL = C145192eii.LIZIZ(f, startFrame, endFrame);
        float f2 = i2;
        this.f21092LJ = C145192eii.LIZIZ(f2, startFrame, endFrame);
        LIZ((int) C145192eii.LIZIZ(this.LIZJ, f, f2));
    }
}
