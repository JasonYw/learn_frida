package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.ViewCompat;
import com.bytedance.covode.number.Covode;
import org.xmlpull.v1.XmlPullParser;
import p003X.AbstractC139140d8q;
import p003X.AbstractC139159d99;
import p003X.AbstractC139160d9A;
import p003X.AbstractC139161d9B;
import p003X.C138517cyn;
import p003X.C138552czM;
import p003X.C139156d96;
import p003X.C464894Zv;

/* loaded from: classes17.dex */
public class Slide extends AbstractC139140d8q {
    public AbstractC139161d9B mSlideCalculator = sCalculateBottom;
    public int mSlideEdge = 80;
    public static final TimeInterpolator sDecelerate = new DecelerateInterpolator();
    public static final TimeInterpolator sAccelerate = new AccelerateInterpolator();
    public static final AbstractC139161d9B sCalculateLeft = new AbstractC139159d99() { // from class: androidx.transition.Slide.1
        static {
            Covode.recordClassIndex(1931);
        }

        @Override // p003X.AbstractC139161d9B
        public final float LIZ(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    public static final AbstractC139161d9B sCalculateStart = new AbstractC139159d99() { // from class: androidx.transition.Slide.2
        static {
            Covode.recordClassIndex(1932);
        }

        @Override // p003X.AbstractC139161d9B
        public final float LIZ(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
            return view.getTranslationX() - viewGroup.getWidth();
        }
    };
    public static final AbstractC139161d9B sCalculateTop = new AbstractC139160d9A() { // from class: androidx.transition.Slide.3
        static {
            Covode.recordClassIndex(1933);
        }

        @Override // p003X.AbstractC139161d9B
        public final float LIZIZ(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    };
    public static final AbstractC139161d9B sCalculateRight = new AbstractC139159d99() { // from class: androidx.transition.Slide.4
        static {
            Covode.recordClassIndex(1934);
        }

        @Override // p003X.AbstractC139161d9B
        public final float LIZ(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    public static final AbstractC139161d9B sCalculateEnd = new AbstractC139159d99() { // from class: androidx.transition.Slide.5
        static {
            Covode.recordClassIndex(1935);
        }

        @Override // p003X.AbstractC139161d9B
        public final float LIZ(ViewGroup viewGroup, View view) {
            if (ViewCompat.getLayoutDirection(viewGroup) == 1) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
            return view.getTranslationX() + viewGroup.getWidth();
        }
    };
    public static final AbstractC139161d9B sCalculateBottom = new AbstractC139160d9A() { // from class: androidx.transition.Slide.6
        static {
            Covode.recordClassIndex(1936);
        }

        @Override // p003X.AbstractC139161d9B
        public final float LIZIZ(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    };

    public int getSlideEdge() {
        return this.mSlideEdge;
    }

    public Slide() {
        setSlideEdge(80);
    }

    static {
        Covode.recordClassIndex(1930);
    }

    @Override // p003X.AbstractC139140d8q, androidx.transition.Transition
    public void captureEndValues(C0429ae c0429ae) {
        super.captureEndValues(c0429ae);
        captureValues(c0429ae);
    }

    @Override // p003X.AbstractC139140d8q, androidx.transition.Transition
    public void captureStartValues(C0429ae c0429ae) {
        super.captureStartValues(c0429ae);
        captureValues(c0429ae);
    }

    private void captureValues(C0429ae c0429ae) {
        int[] iArr = new int[2];
        c0429ae.LIZIZ.getLocationOnScreen(iArr);
        c0429ae.LIZ.put("android:slide:screenPosition", iArr);
    }

    public Slide(int i) {
        setSlideEdge(i);
    }

    public void setSlideEdge(int i) {
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                this.mSlideCalculator = sCalculateEnd;
                            } else {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                        } else {
                            this.mSlideCalculator = sCalculateStart;
                        }
                    } else {
                        this.mSlideCalculator = sCalculateBottom;
                    }
                } else {
                    this.mSlideCalculator = sCalculateTop;
                }
            } else {
                this.mSlideCalculator = sCalculateRight;
            }
        } else {
            this.mSlideCalculator = sCalculateLeft;
        }
        this.mSlideEdge = i;
        C139156d96 c139156d96 = new C139156d96();
        c139156d96.LIZ = i;
        setPropagation(c139156d96);
    }

    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C138552czM.LJI);
        int LIZ = C138517cyn.LIZ(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        setSlideEdge(LIZ);
    }

    @Override // p003X.AbstractC139140d8q
    public Animator onAppear(ViewGroup viewGroup, View view, C0429ae c0429ae, C0429ae c0429ae2) {
        if (c0429ae2 == null) {
            return null;
        }
        int[] iArr = (int[]) c0429ae2.LIZ.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C464894Zv.LIZ(view, c0429ae2, iArr[0], iArr[1], this.mSlideCalculator.LIZ(viewGroup, view), this.mSlideCalculator.LIZIZ(viewGroup, view), translationX, translationY, sDecelerate);
    }

    @Override // p003X.AbstractC139140d8q
    public Animator onDisappear(ViewGroup viewGroup, View view, C0429ae c0429ae, C0429ae c0429ae2) {
        if (c0429ae == null) {
            return null;
        }
        int[] iArr = (int[]) c0429ae.LIZ.get("android:slide:screenPosition");
        return C464894Zv.LIZ(view, c0429ae, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.mSlideCalculator.LIZ(viewGroup, view), this.mSlideCalculator.LIZIZ(viewGroup, view), sAccelerate);
    }
}
