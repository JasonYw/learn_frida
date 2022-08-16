package com.bytedance.android.live.broadcast.gallery.transfer;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Camera;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C144920eeI;

/* loaded from: classes19.dex */
public final class BounceBackViewPager extends ViewPager {
    public static ChangeQuickRedirect LIZ;
    public ViewPager.OnPageChangeListener LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public float LJIIIIZZ;
    public int LJIIIZ;
    public final int LJIIJ;
    public final OverscrollEffect LJI = new OverscrollEffect(this, null);
    public final Camera LJII = new Camera();
    public int LJFF = 0;
    public float LJIIJJI = 400.0f;

    /* renamed from: LJ */
    public int f25833LJ = SDKMonitor.SDK_VERSION;

    /* renamed from: com.bytedance.android.live.broadcast.gallery.transfer.BounceBackViewPager$1 */
    /* loaded from: classes19.dex */
    public static /* synthetic */ class C30211 {
        static {
            Covode.recordClassIndex(15920);
        }
    }

    public final int getOverscrollAnimationDuration() {
        return this.f25833LJ;
    }

    public final float getOverscrollTranslation() {
        return this.LJIIJJI;
    }

    static {
        Covode.recordClassIndex(15919);
        ViewPager.class.getSimpleName();
    }

    /* loaded from: classes19.dex */
    public class OverscrollEffect {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Animator mAnimator;
        public float mOverscroll;

        static {
            Covode.recordClassIndex(15921);
        }

        public boolean isOverscrolling() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (BounceBackViewPager.this.LIZJ == 0 && this.mOverscroll < 0.0f) {
                return true;
            }
            if (BounceBackViewPager.this.getAdapter().getCount() - 1 != BounceBackViewPager.this.LIZJ || this.mOverscroll <= 0.0f) {
                return false;
            }
            return true;
        }

        public void onRelease() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            Animator animator = this.mAnimator;
            if (animator != null && animator.isRunning()) {
                this.mAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.android.live.broadcast.gallery.transfer.BounceBackViewPager.OverscrollEffect.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(15922);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator2) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator2) {
                        if (PatchProxy.proxy(new Object[]{animator2}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        OverscrollEffect.this.startAnimation(0.0f);
                    }
                });
                this.mAnimator.cancel();
                return;
            }
            startAnimation(0.0f);
        }

        public OverscrollEffect() {
        }

        public void setPull(float f) {
            if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            this.mOverscroll = f;
            BounceBackViewPager bounceBackViewPager = BounceBackViewPager.this;
            bounceBackViewPager.LIZ(bounceBackViewPager.LJFF);
        }

        public void startAnimation(float f) {
            if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 3).isSupported) {
                return;
            }
            this.mAnimator = ObjectAnimator.ofFloat(this, "pull", this.mOverscroll, f);
            this.mAnimator.setInterpolator(new DecelerateInterpolator());
            this.mAnimator.setDuration(BounceBackViewPager.this.f25833LJ * Math.abs(f - this.mOverscroll));
            this.mAnimator.start();
        }

        public /* synthetic */ OverscrollEffect(BounceBackViewPager bounceBackViewPager, C30211 c30211) {
            this();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.LIZIZ = onPageChangeListener;
    }

    public final void setOverscrollAnimationDuration(int i) {
        this.f25833LJ = i;
    }

    public final void setOverscrollTranslation(int i) {
        this.LJIIJJI = i;
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            int action = motionEvent.getAction() & MotionEventCompat.ACTION_MASK;
            if (action != 0) {
                if (action == 5) {
                    int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                    this.LJIIIIZZ = MotionEventCompat.getX(motionEvent, actionIndex);
                    this.LJIIIZ = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                }
            } else {
                this.LJIIIIZZ = motionEvent.getX();
                this.LJIIIZ = MotionEventCompat.getPointerId(motionEvent, 0);
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                                if (MotionEventCompat.getPointerId(motionEvent, action2) == this.LJIIIZ) {
                                    if (action2 == 0) {
                                        i = 1;
                                    }
                                    this.LJIIIIZZ = motionEvent.getX(i);
                                    this.LJIIIZ = MotionEventCompat.getPointerId(motionEvent, i);
                                }
                            }
                        } else {
                            int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                            this.LJIIIIZZ = MotionEventCompat.getX(motionEvent, actionIndex);
                            this.LJIIIZ = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                        }
                    }
                } else {
                    int i2 = this.LJIIIZ;
                    if (i2 != -1) {
                        float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, i2));
                        float f = this.LJIIIIZZ - x;
                        getScrollX();
                        int width = getWidth();
                        int pageMargin = getPageMargin() + width;
                        int count = getAdapter().getCount() - 1;
                        int currentItem = getCurrentItem();
                        float max = Math.max(0, (currentItem - 1) * pageMargin);
                        float min = Math.min(currentItem + 1, count) * pageMargin;
                        if (this.LIZLLL == 0.0f) {
                            if (currentItem == 0) {
                                if (max == 0.0f) {
                                    this.LJI.setPull((f + this.LJIIJ) / width);
                                }
                            } else if (count == currentItem && min == count * pageMargin) {
                                this.LJI.setPull((f - this.LJIIJ) / width);
                            }
                        } else {
                            this.LJIIIIZZ = x;
                        }
                    } else {
                        this.LJI.onRelease();
                    }
                }
                if (!this.LJI.isOverscrolling() && i == 0) {
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }
            this.LJIIIZ = -1;
            this.LJI.onRelease();
        } else {
            this.LJIIIIZZ = motionEvent.getX();
            this.LJIIIZ = MotionEventCompat.getPointerId(motionEvent, 0);
        }
        i = 1;
        if (!this.LJI.isOverscrolling()) {
        }
        return super.onTouchEvent(motionEvent);
    }

    public BounceBackViewPager(Context context, AttributeSet attributeSet) {
        super(context, null);
        setStaticTransformationsEnabled(true);
        this.LJIIJ = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
        super.setOnPageChangeListener(new C144920eeI(this, (byte) 0));
    }

    @Override // android.view.ViewGroup
    public final boolean getChildStaticTransformation(View view, Transformation transformation) {
        boolean z;
        float max;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, transformation}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (view.getWidth() == 0) {
            return false;
        }
        int i = this.LIZJ;
        if (i != 0 && i != getAdapter().getCount() - 1) {
            z = false;
        } else {
            z = true;
        }
        if (!this.LJI.isOverscrolling() || !z) {
            return false;
        }
        float width = getWidth() / 2;
        int height = getHeight() / 2;
        transformation.getMatrix().reset();
        float f = this.LJIIJJI;
        if (this.LJI.mOverscroll > 0.0f) {
            max = Math.min(this.LJI.mOverscroll, 1.0f);
        } else {
            max = Math.max(this.LJI.mOverscroll, -1.0f);
        }
        this.LJII.save();
        this.LJII.translate(-(f * max), 0.0f, 0.0f);
        this.LJII.getMatrix(transformation.getMatrix());
        this.LJII.restore();
        transformation.getMatrix().preTranslate(-width, -height);
        transformation.getMatrix().postTranslate(width, height);
        if (getChildCount() == 1) {
            invalidate();
            return true;
        }
        view.invalidate();
        return true;
    }
}
