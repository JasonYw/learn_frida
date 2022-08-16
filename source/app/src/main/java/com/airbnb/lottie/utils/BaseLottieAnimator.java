package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes19.dex */
public abstract class BaseLottieAnimator extends ValueAnimator {
    public final Set<ValueAnimator.AnimatorUpdateListener> LIZ = new CopyOnWriteArraySet();
    public final Set<Animator.AnimatorListener> LIZIZ = new CopyOnWriteArraySet();

    static {
        Covode.recordClassIndex(4146);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.LIZIZ.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.LIZ.clear();
    }

    public final void LIZ() {
        for (Animator.AnimatorListener animatorListener : this.LIZIZ) {
            animatorListener.onAnimationRepeat(this);
        }
    }

    public final void LIZIZ() {
        for (Animator.AnimatorListener animatorListener : this.LIZIZ) {
            animatorListener.onAnimationCancel(this);
        }
    }

    public final void LIZJ() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.LIZ) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.LIZIZ.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.LIZ.add(animatorUpdateListener);
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.LIZIZ.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.LIZ.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void LIZ(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.LIZIZ) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    public final void LIZIZ(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.LIZIZ) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }
}
