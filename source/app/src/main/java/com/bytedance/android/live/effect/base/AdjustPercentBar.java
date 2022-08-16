package com.bytedance.android.live.effect.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Field;
import p002O.C0002O;
import p003X.AbstractC139124d8a;
import p003X.LK5;
import p003X.RunnableC139121d8X;

/* loaded from: classes17.dex */
public class AdjustPercentBar extends View {
    public static ChangeQuickRedirect LIZ;
    public static Drawable LJJIL;
    public static Drawable LJJIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26213LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public float LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public Paint LJIJJ;
    public Paint LJIJJLI;
    public Paint LJIL;
    public Paint LJJ;
    public Paint LJJI;
    public Paint LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public String LJJIIJ;
    public float LJJIIJZLJL;
    public boolean LJJIIZ;
    public boolean LJJIIZI;
    public boolean LJJIJ;
    public Rect LJJIJIIJI;
    public String LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJJ;
    public ValueAnimator LJJJI;
    public boolean LJJJIL;
    public int LJJJJ;
    public String LJJJJI;
    public ValueAnimator LJJJJIZL;
    public float LJJJJJ;
    public Handler LJJJJJL;
    public Runnable LJJJJL;
    public AbstractC139124d8a LJJJJLI;
    public float LJJJJLL;
    public float LJJJJZ;
    public float LJJJJZI;
    public float LJJJLIIL;
    public float LJJJLL;
    public int LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public Runnable LJJLIIIIJ;
    public int LJJLIIIJ;

    static {
        Covode.recordClassIndex(24335);
    }

    public void setIsTwoWayMode(boolean z) {
    }

    public int getMaxPercent() {
        return this.LJJL;
    }

    public int getMinPercent() {
        return this.LJJLI;
    }

    public int getPercent() {
        return this.LJJII;
    }

    public int getRange() {
        return this.LJJJZ;
    }

    private boolean LIZIZ() {
        if (this.LJJLI == 0 && this.LJJIJIL == 0) {
            return false;
        }
        return true;
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LJIILJJIL = this.LIZIZ / 2;
        this.LJIILL = LK5.LIZ(32.0f);
        this.LJIILLIIL = (this.LIZIZ - (this.LJJJLL * 2.0f)) / this.LJJJZ;
        this.LJJIJ = true;
        invalidate();
    }

    @Override // android.view.View
    public void buildDrawingCache() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 || getWidth() * getHeight() * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    private void LIZJ() {
        float f;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        removeCallbacks(this.LJJLIIIIJ);
        if (!this.LJJJIL && !TextUtils.isEmpty(this.LJJIIJ)) {
            ValueAnimator valueAnimator = this.LJJJI;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.LJJJI.cancel();
            }
            Paint paint = this.LJJIFFI;
            if (this.LJJJ) {
                f = 0.0f;
            } else {
                f = 3.0f;
            }
            paint.setShadowLayer(LK5.LIZ(f), 0.0f, 0.0f, this.LJIIL);
            setTextAlpha(MotionEventCompat.ACTION_MASK);
            this.LJJJIL = true;
            invalidate();
        }
    }

    public void setDefaultCircleRadius(int i) {
        this.LJIJI = i;
    }

    public void setLevelAdjustBarTitle(String str) {
        this.LJJIJIIJIL = str;
    }

    public void setTextInCenter(boolean z) {
        this.LJJIJLIJ = z;
    }

    public AdjustPercentBar(Context context) {
        this(context, null);
    }

    private int LIZIZ(int i) {
        int i2;
        int i3 = this.LJJJLZIJ;
        if (i % i3 >= i3 / 2.0f) {
            i2 = (i / i3) + 1;
        } else {
            i2 = i / i3;
        }
        return i2 * i3;
    }

    public void setOnLevelChangeListener(final AbstractC139124d8a abstractC139124d8a) {
        if (PatchProxy.proxy(new Object[]{abstractC139124d8a}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJJJJLI = new AbstractC139124d8a() { // from class: com.bytedance.android.live.effect.base.AdjustPercentBar.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(24339);
            }

            @Override // p003X.AbstractC139124d8a
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
                    return;
                }
                abstractC139124d8a.LIZ();
            }

            @Override // p003X.AbstractC139124d8a
            public final void LIZIZ(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                abstractC139124d8a.LIZIZ(i);
            }

            @Override // p003X.AbstractC139124d8a
            public final void LIZ(int i) {
                if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                AdjustPercentBar.this.LJJJJJL.removeCallbacks(AdjustPercentBar.this.LJJJJL);
                if (AdjustPercentBar.this.LJJJJI != null && i == AdjustPercentBar.this.LJJIJIL) {
                    AdjustPercentBar.this.LJJJJJL.postDelayed(AdjustPercentBar.this.LJJJJL, 100L);
                } else if (AdjustPercentBar.this.LJJJJIZL != null) {
                    AdjustPercentBar.this.LJJJJIZL.cancel();
                    AdjustPercentBar.this.LJJJJIZL = null;
                }
                abstractC139124d8a.LIZ(i);
            }
        };
    }

    public void setPercent(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJJII = i;
        invalidate();
    }

    @Override // android.view.View
    public void setContentDescription(CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 27).isSupported) {
            return;
        }
        try {
            Field declaredField = View.class.getDeclaredField("mContentDescription");
            declaredField.setAccessible(true);
            declaredField.set(this, charSequence);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            super.setContentDescription(charSequence);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            super.setContentDescription(charSequence);
        }
    }

    public void setDefaultCircleConfig(int i) {
        Paint paint;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported && (paint = this.LJJ) != null) {
            paint.setColor(LK5.LIZIZ(i));
        }
    }

    public void setTextAlpha(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        this.LJJLIIIJ = i;
        this.LJJIFFI.setAlpha(i);
        this.LJJI.setAlpha(i);
    }

    private int LIZ(int i) {
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LJJJLZIJ > 1) {
            i = LIZIZ(i);
        }
        if (i > this.LJJJZ) {
            i2 = this.LJJL;
        } else if (i <= 0) {
            i2 = this.LJJLI;
        } else {
            i2 = i + this.LJJLI;
        }
        if (LIZIZ()) {
            int i3 = this.LJJIJIL;
            if (i2 >= i3 - 2 && i2 <= i3 + 2) {
                return i3;
            }
        }
        return i2;
    }

    private void setCurrentProgress(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 28).isSupported) {
            return;
        }
        if (this.LJJJJLI != null && this.LJJII != i) {
            this.LJJII = Math.min(this.LJJL, Math.max(i, this.LJJLI));
            this.LJJJJLI.LIZ(this.LJJII);
        }
        invalidate();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 29).isSupported) {
            sendAccessibilityEvent(4);
        }
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23 || getWidth() * getHeight() * 4 < 838860800) {
            super.buildDrawingCache(z);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (PatchProxy.proxy(new Object[]{accessibilityNodeInfo}, this, LIZ, false, 24).isSupported) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        }
        int i = Build.VERSION.SDK_INT;
        if (isEnabled()) {
            if (this.LJJII > this.LJJLI) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (this.LJJII < this.LJJL) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(0, this.LJJLI, this.LJJL, this.LJJII));
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String str;
        String str2;
        if (PatchProxy.proxy(new Object[]{accessibilityEvent}, this, LIZ, false, 26).isSupported) {
            return;
        }
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(this.LJJL - this.LJJLI);
        accessibilityEvent.setCurrentItemIndex(this.LJJII);
        if (getTag() != null) {
            str = getTag().toString();
        } else {
            str = "";
        }
        if (this.LJJII < 0) {
            str2 = "负";
        } else {
            str2 = " ";
        }
        if (this.LJJLI < 0) {
            setContentDescription(C0002O.m25083C("实际效果，", str2, Integer.valueOf(Math.abs(this.LJJII)), "，", str));
        } else {
            setContentDescription(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i;
        Drawable drawable;
        float f;
        MethodCollector.m14708i(1644);
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 8).isSupported) {
            MethodCollector.m14707o(1644);
            return;
        }
        super.onDraw(canvas);
        if (!this.LJJIJ) {
            MethodCollector.m14707o(1644);
            return;
        }
        int i2 = this.LJJII;
        int i3 = this.LJJLI;
        float f2 = this.LJJJLL;
        float f3 = this.LJIILLIIL;
        float f4 = ((i2 - i3) * f3) + f2;
        float f5 = ((this.LJJIJIL - i3) * f3) + f2;
        int i4 = this.LJIILL;
        canvas.drawLine(f2, i4, this.LIZIZ - f2, i4, this.LJIJJLI);
        if (this.LJJIJL) {
            float f6 = this.LJJJLL;
            int i5 = this.LJIILL;
            canvas.drawLine(f6, i5, f4, i5, this.LJIJJ);
        } else {
            int i6 = this.LJIILL;
            canvas.drawLine(f4, i6, f5, i6, this.LJIJJ);
        }
        Paint paint2 = this.LJIL;
        int i7 = MotionEventCompat.ACTION_MASK;
        paint2.setAlpha(MotionEventCompat.ACTION_MASK);
        this.LJJ.setAlpha(MotionEventCompat.ACTION_MASK);
        this.LJJIFFI.setAlpha(MotionEventCompat.ACTION_MASK);
        this.LJJI.setAlpha(MotionEventCompat.ACTION_MASK);
        canvas.drawCircle(f4, this.LJIILL, this.LJJJJZI, this.LJIL);
        int i8 = this.LJJIJIL;
        if (i8 >= this.LJJLI && i8 <= this.LJJL && LIZIZ()) {
            canvas.drawCircle(f5, this.LJIILL, this.LJIJI, this.LJJ);
        }
        int i9 = this.LJJJJ;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.LJJII;
        }
        if (this.LJJJJJ == 0.0f) {
            str = String.valueOf(i9);
        } else {
            str = this.LJJJJI;
            if (str == null) {
                str = "";
            }
        }
        if (!TextUtils.isEmpty(this.LJJIJIIJIL) && !TextUtils.isEmpty(str)) {
            new StringBuilder();
            this.LJJIIJ = C0002O.m25085C(this.LJJIJIIJIL, " ", str);
        } else {
            this.LJJIIJ = str;
        }
        if (TextUtils.isEmpty(this.LJJIIJ)) {
            MethodCollector.m14707o(1644);
            return;
        }
        if (this.LJJIJLIJ) {
            paint = this.LJJIFFI;
        } else {
            paint = this.LJJI;
        }
        Paint paint3 = this.LJJI;
        String str2 = this.LJJIIJ;
        paint3.getTextBounds(str2, 0, str2.length(), this.LJJIJIIJI);
        int width = this.LJJIJIIJI.width();
        int LIZ2 = LK5.LIZ(14.0f);
        if (this.LJJIJLIJ) {
            i = this.LJIILJJIL;
        } else {
            i = (int) f4;
        }
        int LIZ3 = (i - (width / 2)) - LK5.LIZ(1.0f);
        int i10 = (int) ((this.LJIILL - LIZ2) - this.LJJJJLL);
        if (this.LJJJ) {
            drawable = LJJIZ;
        } else {
            drawable = LJJIL;
        }
        if (!this.LJJIJLIJ && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int max = Math.max(width, intrinsicWidth);
            float f7 = this.LJJJJJ;
            if (f7 == 1.0f) {
                i7 = this.LJJLIIIJ;
                max += intrinsicWidth;
            } else if (f7 > 0.0f) {
                max = (int) (((int) (((max - intrinsicWidth) * f7) + f)) + (intrinsicWidth * f7));
            } else {
                i7 = this.LJJLIIIJ;
            }
            drawable.setAlpha(i7);
            drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
            canvas.save();
            canvas.translate(i - (max / 2.0f), this.LJIILL - LK5.LIZ(57.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        float f8 = this.LJJJJJ;
        if (f8 > 0.0f && f8 < 1.0f) {
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (this.LJJJJJ * 255.0f));
            canvas.drawText(this.LJJIIJ, LIZ3, i10, paint);
            paint.setAlpha(alpha);
            MethodCollector.m14707o(1644);
            return;
        }
        canvas.drawText(this.LJJIIJ, LIZ3, i10, paint);
        MethodCollector.m14707o(1644);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        AbstractC139124d8a abstractC139124d8a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJJIIZI) {
            return true;
        }
        if (motionEvent.getAction() == 0 && (motionEvent.getX() < this.LJJJLL - this.LJI || motionEvent.getX() > LK5.LIZJ() - (this.LJJJLL - this.LJI))) {
            return false;
        }
        if (motionEvent.getAction() == 0 && Math.abs(motionEvent.getY() - this.LJIILL) > this.LIZJ - this.LJIILL) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3 && (abstractC139124d8a = this.LJJJJLI) != null) {
                        abstractC139124d8a.LIZIZ(this.LJJII);
                    }
                } else {
                    LIZJ();
                    setCurrentProgress(LIZ((this.LJJIII - this.LJJLI) + ((int) ((motionEvent.getX() - this.LJJIIJZLJL) / this.LJIILLIIL))));
                }
            } else {
                float x = motionEvent.getX();
                if (this.LJJIIZ && Math.abs(x - this.LJJIIJZLJL) <= LK5.LIZ(3.0f)) {
                    final int LIZ2 = LIZ((int) ((x - this.LJJJLL) / this.LJIILLIIL));
                    AbstractC139124d8a abstractC139124d8a2 = this.LJJJJLI;
                    if (abstractC139124d8a2 != null) {
                        this.LJJII = LIZ2;
                        abstractC139124d8a2.LIZ(LIZ2);
                        this.LJJJJLI.LIZIZ(LIZ2);
                    }
                    final int i = this.LJJII;
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(LIZ2)}, this, LIZ, false, 11).isSupported) {
                        this.LJJIIZI = false;
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setTarget(this);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.live.effect.base.AdjustPercentBar.2
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(24337);
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                AdjustPercentBar adjustPercentBar = AdjustPercentBar.this;
                                int i2 = i;
                                adjustPercentBar.LJJII = (int) (i2 + ((LIZ2 - i2) * floatValue));
                                adjustPercentBar.invalidate();
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.android.live.effect.base.AdjustPercentBar.3
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(24338);
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                AdjustPercentBar.this.LJJIIZI = true;
                                super.onAnimationEnd(animator);
                            }
                        });
                        ofFloat.setDuration(50L);
                        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                        ofFloat.start();
                    }
                } else {
                    AbstractC139124d8a abstractC139124d8a3 = this.LJJJJLI;
                    if (abstractC139124d8a3 != null) {
                        abstractC139124d8a3.LIZIZ(this.LJJII);
                    }
                }
            }
        } else {
            LIZJ();
            this.LJJIII = this.LJJII;
            float x2 = motionEvent.getX();
            float y = motionEvent.getY();
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Float.valueOf(x2), Float.valueOf(y)}, this, LIZ, false, 14);
            if (proxy2.isSupported) {
                z = ((Boolean) proxy2.result).booleanValue();
            } else if (Math.abs(x2 - (this.LJJJLL + ((this.LJJII - this.LJJLI) * this.LJIILLIIL))) <= this.f26213LJ * 2.5d && Math.abs(y - this.LJIILL) <= this.f26213LJ * 2.5d) {
                z = true;
            } else {
                z = false;
            }
            this.LJJIIZ = !z;
            this.LJJIIJZLJL = motionEvent.getX();
            int LIZ3 = LIZ((int) ((this.LJJIIJZLJL - this.LJJJLL) / this.LJIILLIIL));
            if (this.LJJII != LIZ3) {
                this.LJJII = LIZ3;
                this.LJJIII = LIZ3;
                AbstractC139124d8a abstractC139124d8a4 = this.LJJJJLI;
                if (abstractC139124d8a4 != null) {
                    abstractC139124d8a4.LIZ(this.LJJII);
                }
                invalidate();
            }
        }
        AbstractC139124d8a abstractC139124d8a5 = this.LJJJJLI;
        if (abstractC139124d8a5 != null) {
            abstractC139124d8a5.LIZ();
        }
        return true;
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), bundle}, this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!isEnabled()) {
            return false;
        }
        if (i != 4096 && i != 8192) {
            if (i != 16908349) {
                return super.performAccessibilityAction(i, bundle);
            }
            if (Build.VERSION.SDK_INT < 24 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            setCurrentProgress((int) bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }
        int max = Math.max(1, Math.round((this.LJJL - this.LJJLI) / 20.0f));
        if (i == 8192) {
            max = -max;
        }
        setCurrentProgress(this.LJJII + max);
        return true;
    }

    private void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{(byte) 0, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIJJ.setColor(this.LJIIIIZZ);
        if (z2) {
            this.LJIJJ.setShadowLayer(LK5.LIZ(1.0f), 0.0f, 0.0f, this.LJIIL);
        }
        this.LJIJJLI.setColor(this.LJIIIZ);
        if (z2) {
            this.LJIJJLI.setShadowLayer(LK5.LIZ(1.0f), 0.0f, 0.0f, this.LJIIL);
        }
        this.LJIL.setColor(this.LJIIZILJ);
        if (z2) {
            this.LJIL.setShadowLayer(LK5.LIZ(3.0f), 0.0f, 0.0f, this.LJIIL);
        }
        this.LJJ.setColor(this.LJIIIIZZ);
        this.LJJI.setColor(this.LJIJ);
        this.LJJIFFI.setColor(this.LJIIIIZZ);
        setTextAlpha(this.LJJLIIIJ);
        this.LJJJ = false;
        if (this.LJJJ && LJJIZ == null) {
            LJJIZ = getResources().getDrawable(2130855713);
        }
        if (!this.LJJJ && LJJIL == null) {
            LJJIL = getResources().getDrawable(2130855713);
        }
        invalidate();
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1643);
        this.LIZLLL = LK5.LIZ(4.0f);
        this.f26213LJ = LK5.LIZ(9.0f);
        this.LJFF = LK5.LIZ(2.0f);
        this.LJI = LK5.LIZ(10.0f);
        this.LJII = 1;
        this.LJIJI = this.LJFF;
        this.LJJIIZI = true;
        this.LJJIJ = false;
        this.LJJIJIIJI = new Rect();
        this.LJJIJIIJIL = null;
        this.LJJJJLL = 0.0f;
        this.LJJJJZ = 0.0f;
        this.LJJJJZI = 0.0f;
        this.LJJJLIIL = 0.0f;
        this.LJJJLL = LK5.LIZ(40.0f);
        this.LJJIJL = true;
        this.LJJIJLIJ = false;
        this.LJJJIL = true;
        this.LJJJJ = Integer.MIN_VALUE;
        this.LJJLIIIIJ = new RunnableC139121d8X(this, (byte) 0);
        this.LJJLIIIJ = 0;
        this.LJJJJJ = 0.1f;
        this.LJJJJJL = new Handler(Looper.getMainLooper());
        this.LJJJJL = new Runnable(this) { // from class: com.bytedance.android.live.effect.base.AdjustPercentBar.1
            static {
                Covode.recordClassIndex(24336);
            }

            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported && attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130774880, 2130774881, 2130774882, 2130774887, 2130774888, 2130774905, 2130774906, 2130774907, 2130774908});
            String string = obtainStyledAttributes.getString(5);
            this.LJJIJIIJIL = string == null ? "" : string;
            obtainStyledAttributes.getColor(6, ViewCompat.MEASURED_STATE_MASK);
            this.LJJJJZ = obtainStyledAttributes.getDimension(8, LK5.LIZ(14.0f));
            this.LJJJJLL = obtainStyledAttributes.getDimension(7, 0.0f);
            this.LJJJLL = obtainStyledAttributes.getDimension(0, LK5.LIZ(40.0f));
            this.LJJJJZI = obtainStyledAttributes.getDimension(3, this.f26213LJ);
            this.LJJJLIIL = obtainStyledAttributes.getDimension(2, this.LIZLLL);
            this.LJJJLZIJ = obtainStyledAttributes.getInt(4, this.LJII);
            this.LJIJ = obtainStyledAttributes.getColor(1, -1);
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.LJIIIIZZ = -1;
            this.LJIIIZ = 1040187391;
            this.LJIIJ = ViewCompat.MEASURED_STATE_MASK;
            this.LJIIJJI = -1291902464;
            this.LJIIL = 1073741824;
            this.LJIILIIL = LK5.LIZIZ(2131623937);
            this.LJIIZILJ = LK5.LIZ("#ff4e33", -1);
            this.LJIJJ = new Paint();
            this.LJIJJ.setStyle(Paint.Style.FILL);
            this.LJIJJ.setStrokeWidth(this.LJJJLIIL);
            this.LJIJJ.setStrokeCap(Paint.Cap.ROUND);
            this.LJIJJ.setAntiAlias(true);
            this.LJIJJLI = new Paint();
            this.LJIJJLI.setStyle(Paint.Style.FILL);
            this.LJIJJLI.setStrokeWidth(this.LJJJLIIL);
            this.LJIJJLI.setStrokeCap(Paint.Cap.ROUND);
            this.LJIJJLI.setAntiAlias(true);
            this.LJIL = new Paint();
            this.LJIL.setStyle(Paint.Style.FILL);
            this.LJIL.setAntiAlias(true);
            this.LJJ = new Paint();
            this.LJJ.setStyle(Paint.Style.FILL);
            this.LJJ.setAntiAlias(true);
            this.LJJI = new Paint();
            this.LJJI.setTextSize(this.LJJJJZ);
            this.LJJI.setAntiAlias(true);
            this.LJJIFFI = new Paint();
            this.LJJIFFI.setTextSize(this.LJJJJZ);
            this.LJJIFFI.setAntiAlias(true);
            LIZ(false, true);
            setImportantForAccessibility(1);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setClickable(true);
            if (Build.VERSION.SDK_INT >= 26) {
                setFocusedByDefault(true);
            }
        }
        MethodCollector.m14707o(1643);
    }

    public final void LIZ(int i, int i2, int i3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIIIIZZ = i;
        this.LJIIIZ = i2;
        this.LJIIZILJ = i3;
        LIZ(false, false);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LIZJ != getMeasuredHeight() || this.LIZIZ != getMeasuredWidth()) {
            this.LIZIZ = getMeasuredWidth();
            this.LIZJ = getMeasuredHeight();
            LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i, int i2, int i3, boolean z) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported && !PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), null, Byte.valueOf((byte) z)}, this, LIZ, false, 5).isSupported) {
            this.LJJL = i;
            this.LJJLI = i2;
            if (i3 <= this.LJJL && i3 >= this.LJJLI) {
                this.LJJIJIL = i3;
            } else {
                this.LJJIJIL = this.LJJL;
            }
            this.LJJJZ = this.LJJL - this.LJJLI;
            this.LJJIJL = z;
            if (this.LIZIZ > 0 && this.LIZJ > 0) {
                LIZ();
            }
            invalidate();
            this.LJJJJI = null;
            ValueAnimator valueAnimator = this.LJJJJIZL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.LJJJJIZL = null;
            }
            this.LJJJJJ = 0.0f;
        }
    }
}
