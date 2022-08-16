package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;
import p003X.AbstractC139140d8q;
import p003X.C138517cyn;
import p003X.C138552czM;
import p003X.C139132d8i;
import p003X.C139133d8j;

/* loaded from: classes17.dex */
public class Fade extends AbstractC139140d8q {
    static {
        Covode.recordClassIndex(1922);
    }

    public Fade() {
    }

    public Fade(int i) {
        setMode(i);
    }

    @Override // p003X.AbstractC139140d8q, androidx.transition.Transition
    public void captureStartValues(C0429ae c0429ae) {
        super.captureStartValues(c0429ae);
        c0429ae.LIZ.put("android:fade:transitionAlpha", Float.valueOf(C139133d8j.LIZJ(c0429ae.LIZIZ)));
    }

    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C138552czM.f18354LJ);
        setMode(C138517cyn.LIZ(obtainStyledAttributes, (XmlPullParser) attributeSet, "fadingMode", 0, this.mMode));
        obtainStyledAttributes.recycle();
    }

    public static float getStartAlpha(C0429ae c0429ae, float f) {
        Float f2;
        if (c0429ae != null && (f2 = (Float) c0429ae.LIZ.get("android:fade:transitionAlpha")) != null) {
            return f2.floatValue();
        }
        return f;
    }

    private Animator createAnimation(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C139133d8j.LIZ(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C139133d8j.LIZIZ, f2);
        ofFloat.addListener(new C139132d8i(view));
        addListener(new TransitionListenerAdapter(this) { // from class: androidx.transition.Fade.1
            static {
                Covode.recordClassIndex(1923);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                C139133d8j.LIZ(view, 1.0f);
                C139133d8j.LIZ.LIZJ(view);
                transition.removeListener(this);
            }
        });
        return ofFloat;
    }

    @Override // p003X.AbstractC139140d8q
    public Animator onAppear(ViewGroup viewGroup, View view, C0429ae c0429ae, C0429ae c0429ae2) {
        float f = 0.0f;
        float startAlpha = getStartAlpha(c0429ae, 0.0f);
        if (startAlpha != 1.0f) {
            f = startAlpha;
        }
        return createAnimation(view, f, 1.0f);
    }

    @Override // p003X.AbstractC139140d8q
    public Animator onDisappear(ViewGroup viewGroup, View view, C0429ae c0429ae, C0429ae c0429ae2) {
        C139133d8j.LIZ.LIZIZ(view);
        return createAnimation(view, getStartAlpha(c0429ae, 1.0f), 0.0f);
    }
}
