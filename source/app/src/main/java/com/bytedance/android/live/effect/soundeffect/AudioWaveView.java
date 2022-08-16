package com.bytedance.android.live.effect.soundeffect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.bytedance.android.live.effect.soundeffect.AudioWaveView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class AudioWaveView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public volatile short[] LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public long f26227LJ;
    public boolean LJFF;
    public final ArrayList<View> LJI;
    public final ArrayList<ValueAnimator> LJII;
    public Random LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;

    static {
        Covode.recordClassIndex(24580);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        Iterator<ValueAnimator> it = this.LJII.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        this.LJFF = true;
        this.LIZIZ = null;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LJFF = false;
        Iterator<ValueAnimator> it = this.LJII.iterator();
        while (it.hasNext()) {
            ValueAnimator next = it.next();
            int viewAnimatorHeight = getViewAnimatorHeight();
            next.setIntValues(this.LIZLLL, viewAnimatorHeight);
            next.setDuration((this.f26227LJ * viewAnimatorHeight) / this.LIZJ);
            next.start();
        }
    }

    public final int getViewAnimatorHeight() {
        short[] sArr;
        short[] sArr2;
        int i;
        int i2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.LIZIZ != null) {
            short[] sArr3 = this.LIZIZ;
            Intrinsics.checkNotNull(sArr3);
            if (sArr3.length != 0) {
                Intrinsics.checkNotNull(this.LIZIZ);
                Random random = this.LJIIIIZZ;
                Intrinsics.checkNotNull(this.LIZIZ);
                float abs = (Math.abs(sArr[random.nextInt(sArr2.length)]) * 3.0f) / 32767.0f;
                double d = abs;
                if (d > 0.6d) {
                    return this.LIZJ;
                }
                if (d < 0.1d) {
                    return this.LIZLLL;
                }
                return RangesKt___RangesKt.coerceAtMost((int) (((i - i2) * abs) + this.LIZLLL), this.LIZJ);
            }
        }
        return this.LIZLLL;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context) {
        this(context, null);
        C106862S5w.LIZ(context);
    }

    private final void LIZ(Context context) {
        int i = 1678;
        MethodCollector.m14708i(1678);
        int i2 = 0;
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1678);
            return;
        }
        int red = Color.red(this.LJIIL);
        float red2 = (Color.red(this.LJIILIIL) - red) / this.LJIILJJIL;
        int green = Color.green(this.LJIIL);
        float green2 = (Color.green(this.LJIILIIL) - green) / this.LJIILJJIL;
        int red3 = Color.red(this.LJIIL);
        int i3 = this.LJIILJJIL;
        float blue = (Color.blue(this.LJIILIIL) - red3) / i3;
        int i4 = 0;
        while (i4 < i3) {
            final View view = new View(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LJIIJ, this.LIZLLL);
            int i5 = this.LJIIIZ;
            layoutParams.setMargins(i5 >> 1, i2, i5 >> 1, i2);
            view.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(this.LJIIJJI);
            float f = i4;
            gradientDrawable.setColor(Color.rgb(((int) (red2 * f)) + red, ((int) (green2 * f)) + green, ((int) (f * blue)) + red3));
            view.setBackground(gradientDrawable);
            this.LJI.add(view);
            addView(view);
            ArrayList<ValueAnimator> arrayList = this.LJII;
            final ValueAnimator ofInt = ValueAnimator.ofInt(1, 2);
            ofInt.setRepeatCount(1);
            ofInt.setRepeatMode(2);
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view) { // from class: X.3oJ
                public static ChangeQuickRedirect LIZ;
                public final View LIZIZ;

                static {
                    Covode.recordClassIndex(24583);
                }

                {
                    C106862S5w.LIZ(view);
                    this.LIZIZ = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.proxy(new Object[]{valueAnimator}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(valueAnimator);
                    View view2 = this.LIZIZ;
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        layoutParams2.height = ((Integer) animatedValue).intValue();
                        view2.requestLayout();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this, ofInt) { // from class: X.3oI
                public static ChangeQuickRedirect LIZ;
                public final AudioWaveView LIZIZ;
                public final ValueAnimator LIZJ;

                static {
                    Covode.recordClassIndex(24582);
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    C106862S5w.LIZ(animator);
                    if (this.LIZIZ.LJFF) {
                        return;
                    }
                    ValueAnimator valueAnimator = this.LIZJ;
                    int viewAnimatorHeight = this.LIZIZ.getViewAnimatorHeight();
                    valueAnimator.setIntValues(this.LIZIZ.LIZLLL, viewAnimatorHeight);
                    valueAnimator.setDuration((this.LIZIZ.f26227LJ * viewAnimatorHeight) / this.LIZIZ.LIZJ);
                    valueAnimator.start();
                }

                {
                    C106862S5w.LIZ(this, ofInt);
                    this.LIZIZ = this;
                    this.LIZJ = ofInt;
                }
            });
            arrayList.add(ofInt);
            i4++;
            i = 1678;
            i2 = 0;
        }
        MethodCollector.m14707o(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C106862S5w.LIZ(context);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        if (PatchProxy.proxy(new Object[]{view, Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (i != 0) {
            LIZIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1679);
        this.LJI = new ArrayList<>();
        this.LJII = new ArrayList<>();
        this.LJIIIIZZ = new Random();
        this.LJFF = true;
        if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130775039, 2130775040, 2130775041, 2130775042, 2130775043, 2130775044, 2130775045, 2130775049, 2130775050})) != null) {
            this.LIZJ = (int) obtainStyledAttributes.getDimension(5, UIUtils.dip2Px(context, 24.0f));
            this.LIZLLL = (int) obtainStyledAttributes.getDimension(6, UIUtils.dip2Px(context, 4.0f));
            this.LJIIIZ = (int) obtainStyledAttributes.getDimension(4, UIUtils.dip2Px(context, 4.0f));
            this.LJIIJ = (int) obtainStyledAttributes.getDimension(8, UIUtils.dip2Px(context, 2.0f));
            this.LJIIJJI = (int) obtainStyledAttributes.getDimension(1, UIUtils.dip2Px(context, 1.0f));
            this.LJIIL = obtainStyledAttributes.getColor(7, CastProtectorUtils.parseColor("#FF6397"));
            this.LJIILIIL = obtainStyledAttributes.getColor(3, CastProtectorUtils.parseColor("#FF307A"));
            this.LJIILJJIL = obtainStyledAttributes.getInt(2, 13);
            this.f26227LJ = obtainStyledAttributes.getInt(0, 300);
            obtainStyledAttributes.recycle();
        }
        LIZ(context);
        MethodCollector.m14707o(1679);
    }
}
