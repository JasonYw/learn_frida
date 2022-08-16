package com.bytedance.android.live.broadcastgame.opengame.view;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class AutoAnimationTextView extends AppCompatTextView implements Animator.AnimatorListener {
    public static ChangeQuickRedirect LIZ;
    public ObjectAnimator LIZIZ;
    public ObjectAnimator LIZJ;

    /* renamed from: LJ */
    public Pair<? extends CharSequence, ? extends TextView.BufferType> f26095LJ;
    public Function0<Unit> LJFF;
    public int textAlpha;
    public int textWidth;

    static {
        Covode.recordClassIndex(21148);
    }

    public AutoAnimationTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoAnimationTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public final Function0<Unit> getHalfProgressListener() {
        return this.LJFF;
    }

    public final int getTextAlpha() {
        return this.textAlpha;
    }

    public final int getTextWidth() {
        return this.textWidth;
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        ObjectAnimator objectAnimator = this.LIZIZ;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        this.LIZIZ = null;
        ObjectAnimator objectAnimator2 = this.LIZJ;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        this.LIZJ = null;
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        Pair<? extends CharSequence, ? extends TextView.BufferType> pair = this.f26095LJ;
        if (pair != null) {
            super.setText(pair.getFirst(), pair.getSecond());
        }
        this.f26095LJ = null;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        ObjectAnimator objectAnimator = this.LIZIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LIZJ;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        LIZIZ();
        super.onDetachedFromWindow();
        LIZ();
    }

    public final void setHalfProgressListener(Function0<Unit> function0) {
        this.LJFF = function0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZIZ();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 4).isSupported) {
            return;
        }
        LIZIZ();
        Function0<Unit> function0 = this.LJFF;
        if (function0 != null) {
            function0.mo30099invoke();
        }
        LIZ();
    }

    public final void setTextWidth(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.textWidth = i;
        setWidth(i);
        invalidate();
    }

    public final void setTextAlpha(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.textAlpha = i;
        TextPaint paint = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "");
        int red = Color.red(paint.getColor());
        TextPaint paint2 = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint2, "");
        int green = Color.green(paint2.getColor());
        TextPaint paint3 = getPaint();
        Intrinsics.checkNotNullExpressionValue(paint3, "");
        setTextColor(Color.argb(i, red, green, Color.blue(paint3.getColor())));
    }

    @Override // android.widget.TextView
    public final synchronized void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        MethodCollector.m14708i(1478);
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1478);
            return;
        }
        C106862S5w.LIZ(charSequence, bufferType);
        if (getWidth() == 0) {
            super.setText(charSequence, bufferType);
            MethodCollector.m14707o(1478);
            return;
        }
        this.f26095LJ = new Pair<>(charSequence, bufferType);
        ObjectAnimator objectAnimator = this.LIZIZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LIZJ;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        this.LIZIZ = ObjectAnimator.ofInt(this, "textWidth", getWidth(), (int) ((getWidth() * (((getPaint().measureText(charSequence.toString()) + getPaddingLeft()) + getPaddingRight()) / getWidth())) + 0.5d));
        ObjectAnimator objectAnimator3 = this.LIZIZ;
        if (objectAnimator3 != null) {
            objectAnimator3.setDuration(200L);
        }
        ObjectAnimator objectAnimator4 = this.LIZIZ;
        if (objectAnimator4 != null) {
            objectAnimator4.addListener(this);
        }
        this.LIZJ = ObjectAnimator.ofInt(this, "textAlpha", MotionEventCompat.ACTION_MASK, 0, MotionEventCompat.ACTION_MASK);
        ObjectAnimator objectAnimator5 = this.LIZJ;
        if (objectAnimator5 != null) {
            objectAnimator5.setDuration(400L);
        }
        ObjectAnimator objectAnimator6 = this.LIZIZ;
        if (objectAnimator6 != null) {
            objectAnimator6.start();
        }
        ObjectAnimator objectAnimator7 = this.LIZJ;
        if (objectAnimator7 != null) {
            objectAnimator7.start();
            MethodCollector.m14707o(1478);
            return;
        }
        MethodCollector.m14707o(1478);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoAnimationTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ AutoAnimationTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
