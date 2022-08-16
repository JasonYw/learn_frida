package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import p003X.AbstractC123023YbR;
import p003X.AbstractC123024YbS;

/* loaded from: classes15.dex */
public final class ViewPropertyAnimatorCompat {
    public Runnable mEndAction;
    public int mOldLayerType = -1;
    public Runnable mStartAction;
    public WeakReference<View> mView;

    static {
        Covode.recordClassIndex(1094);
    }

    public final void cancel() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final long getDuration() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public final Interpolator getInterpolator() {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public final long getStartDelay() {
        View view = this.mView.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public final void start() {
        View view = this.mView.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final ViewPropertyAnimatorCompat withLayer() {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().withLayer();
        }
        return this;
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.mView = new WeakReference<>(view);
    }

    public final ViewPropertyAnimatorCompat alpha(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat alphaBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat rotation(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat rotationBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat rotationX(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat rotationXBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat rotationY(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat rotationYBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat scaleX(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat scaleXBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat scaleY(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat scaleYBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setDuration(long j) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setInterpolator(Interpolator interpolator) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setListener(AbstractC123023YbR abstractC123023YbR) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            setListenerInternal(view, abstractC123023YbR);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setStartDelay(long j) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat setUpdateListener(final AbstractC123024YbS abstractC123024YbS) {
        final View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (abstractC123024YbS != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(this) { // from class: androidx.core.view.ViewPropertyAnimatorCompat.2
                    static {
                        Covode.recordClassIndex(1096);
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        abstractC123024YbS.LIZ();
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationX(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationXBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationY(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationYBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationZ(float f) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().translationZ(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat translationZBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().translationZBy(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat withEndAction(Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat withStartAction(Runnable runnable) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    /* renamed from: x */
    public final ViewPropertyAnimatorCompat m21176x(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat xBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    /* renamed from: y */
    public final ViewPropertyAnimatorCompat m21175y(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat yBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    /* renamed from: z */
    public final ViewPropertyAnimatorCompat m21174z(float f) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().z(f);
        }
        return this;
    }

    public final ViewPropertyAnimatorCompat zBy(float f) {
        View view = this.mView.get();
        if (view != null) {
            int i = Build.VERSION.SDK_INT;
            view.animate().zBy(f);
        }
        return this;
    }

    private void setListenerInternal(final View view, final AbstractC123023YbR abstractC123023YbR) {
        if (abstractC123023YbR != null) {
            view.animate().setListener(new AnimatorListenerAdapter(this) { // from class: androidx.core.view.ViewPropertyAnimatorCompat.1
                static {
                    Covode.recordClassIndex(1095);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    abstractC123023YbR.LIZJ(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    abstractC123023YbR.LIZIZ(view);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    abstractC123023YbR.LIZ(view);
                }
            });
        } else {
            view.animate().setListener(null);
        }
    }
}
