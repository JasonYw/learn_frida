package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.dynamicanimation.animation.C0264a;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p003X.C146766f8C;
import p003X.C146767f8D;
import p003X.C146768f8E;
import p003X.C146769f8F;
import p003X.C146770f8G;
import p003X.C146771f8H;
import p003X.C146772f8I;
import p003X.C146773f8J;
import p003X.C146774f8K;
import p003X.C146775f8L;
import p003X.C146776f8M;
import p003X.C146777f8N;
import p003X.C146778f8O;
import p003X.C146781f8R;
import p003X.C146783f8T;

/* loaded from: classes19.dex */
public abstract class DynamicAnimation<T extends DynamicAnimation<T>> implements C0264a.AbstractC0265b {
    public final ArrayList<OnAnimationEndListener> mEndListeners;
    public long mLastFrameTime;
    public float mMaxValue;
    public float mMinValue;
    public float mMinVisibleChange;
    public final FloatPropertyCompat mProperty;
    public boolean mRunning;
    public boolean mStartValueIsSet;
    public final Object mTarget;
    public final ArrayList<OnAnimationUpdateListener> mUpdateListeners;
    public float mValue;
    public float mVelocity;
    public static final ViewProperty TRANSLATION_X = new ViewProperty("translationX") { // from class: androidx.dynamicanimation.animation.DynamicAnimation.1
        static {
            Covode.recordClassIndex(1212);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        public final /* synthetic */ void setValue(View view, float f) {
            view.setTranslationX(f);
        }
    };
    public static final ViewProperty TRANSLATION_Y = new C146774f8K("translationY");
    public static final ViewProperty TRANSLATION_Z = new C146778f8O("translationZ");
    public static final ViewProperty SCALE_X = new C146766f8C("scaleX");
    public static final ViewProperty SCALE_Y = new C146767f8D("scaleY");
    public static final ViewProperty ROTATION = new C146768f8E("rotation");
    public static final ViewProperty ROTATION_X = new C146769f8F("rotationX");
    public static final ViewProperty ROTATION_Y = new C146770f8G("rotationY");

    /* renamed from: X */
    public static final ViewProperty f20253X = new C146771f8H("x");

    /* renamed from: Y */
    public static final ViewProperty f20254Y = new C146775f8L("y");

    /* renamed from: Z */
    public static final ViewProperty f20255Z = new C146772f8I("z");
    public static final ViewProperty ALPHA = new C146773f8J("alpha");
    public static final ViewProperty SCROLL_X = new C146776f8M("scrollX");
    public static final ViewProperty SCROLL_Y = new C146777f8N("scrollY");

    /* loaded from: classes19.dex */
    public interface OnAnimationEndListener {
        static {
            Covode.recordClassIndex(1227);
        }

        void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2);
    }

    /* loaded from: classes19.dex */
    public interface OnAnimationUpdateListener {
        static {
            Covode.recordClassIndex(1228);
        }

        void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2);
    }

    public abstract float getAcceleration(float f, float f2);

    public abstract boolean isAtEquilibrium(float f, float f2);

    public abstract void setValueThreshold(float f);

    public abstract boolean updateValueAndVelocity(long j);

    public float getMinimumVisibleChange() {
        return this.mMinVisibleChange;
    }

    public boolean isRunning() {
        return this.mRunning;
    }

    public float getValueThreshold() {
        return this.mMinVisibleChange * 0.75f;
    }

    private float getPropertyValue() {
        return this.mProperty.getValue(this.mTarget);
    }

    public void cancel() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.mRunning) {
                endAnimationInternal(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    public void start() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.mRunning) {
                startAnimationInternal();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    private void startAnimationInternal() {
        if (!this.mRunning) {
            this.mRunning = true;
            if (!this.mStartValueIsSet) {
                this.mValue = getPropertyValue();
            }
            float f = this.mValue;
            if (f <= this.mMaxValue && f >= this.mMinValue) {
                C0264a LIZ = C0264a.LIZ();
                if (LIZ.LIZJ.size() == 0) {
                    LIZ.LIZIZ().LIZ();
                }
                if (!LIZ.LIZJ.contains(this)) {
                    LIZ.LIZJ.add(this);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    static {
        Covode.recordClassIndex(1211);
    }

    /* loaded from: classes19.dex */
    public static abstract class ViewProperty extends FloatPropertyCompat<View> {
        static {
            Covode.recordClassIndex(1229);
        }

        public ViewProperty(String str) {
            super(str);
        }
    }

    public T setMaxValue(float f) {
        this.mMaxValue = f;
        return this;
    }

    public T setMinValue(float f) {
        this.mMinValue = f;
        return this;
    }

    public T setStartVelocity(float f) {
        this.mVelocity = f;
        return this;
    }

    public void removeEndListener(OnAnimationEndListener onAnimationEndListener) {
        removeEntry(this.mEndListeners, onAnimationEndListener);
    }

    public void removeUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        removeEntry(this.mUpdateListeners, onAnimationUpdateListener);
    }

    public T setStartValue(float f) {
        this.mValue = f;
        this.mStartValueIsSet = true;
        return this;
    }

    public T addEndListener(OnAnimationEndListener onAnimationEndListener) {
        if (!this.mEndListeners.contains(onAnimationEndListener)) {
            this.mEndListeners.add(onAnimationEndListener);
        }
        return this;
    }

    public static <T> void removeNullEntries(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public T addUpdateListener(OnAnimationUpdateListener onAnimationUpdateListener) {
        if (!isRunning()) {
            if (!this.mUpdateListeners.contains(onAnimationUpdateListener)) {
                this.mUpdateListeners.add(onAnimationUpdateListener);
            }
            return this;
        }
        throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
    }

    public T setMinimumVisibleChange(float f) {
        if (f > 0.0f) {
            this.mMinVisibleChange = f;
            setValueThreshold(f * 0.75f);
            return this;
        }
        throw new IllegalArgumentException("Minimum visible change must be positive.");
    }

    public DynamicAnimation(C146783f8T c146783f8T) {
        this.mValue = Float.MAX_VALUE;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -this.mMaxValue;
        this.mEndListeners = new ArrayList<>();
        this.mUpdateListeners = new ArrayList<>();
        this.mTarget = null;
        this.mProperty = new C146781f8R(this, "FloatValueHolder", c146783f8T);
        this.mMinVisibleChange = 1.0f;
    }

    @Override // androidx.dynamicanimation.animation.C0264a.AbstractC0265b
    public boolean doAnimationFrame(long j) {
        long j2 = this.mLastFrameTime;
        if (j2 == 0) {
            this.mLastFrameTime = j;
            setPropertyValue(this.mValue);
            return false;
        }
        this.mLastFrameTime = j;
        boolean updateValueAndVelocity = updateValueAndVelocity(j - j2);
        this.mValue = Math.min(this.mValue, this.mMaxValue);
        this.mValue = Math.max(this.mValue, this.mMinValue);
        setPropertyValue(this.mValue);
        if (updateValueAndVelocity) {
            endAnimationInternal(false);
        }
        return updateValueAndVelocity;
    }

    public void setPropertyValue(float f) {
        this.mProperty.setValue(this.mTarget, f);
        for (int i = 0; i < this.mUpdateListeners.size(); i++) {
            if (this.mUpdateListeners.get(i) != null) {
                this.mUpdateListeners.get(i).onAnimationUpdate(this, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mUpdateListeners);
    }

    private void endAnimationInternal(boolean z) {
        this.mRunning = false;
        C0264a LIZ = C0264a.LIZ();
        LIZ.LIZIZ.remove(this);
        int indexOf = LIZ.LIZJ.indexOf(this);
        if (indexOf >= 0) {
            LIZ.LIZJ.set(indexOf, null);
            LIZ.LJFF = true;
        }
        this.mLastFrameTime = 0L;
        this.mStartValueIsSet = false;
        for (int i = 0; i < this.mEndListeners.size(); i++) {
            if (this.mEndListeners.get(i) != null) {
                this.mEndListeners.get(i).onAnimationEnd(this, z, this.mValue, this.mVelocity);
            }
        }
        removeNullEntries(this.mEndListeners);
    }

    public static <T> void removeEntry(ArrayList<T> arrayList, T t) {
        int indexOf = arrayList.indexOf(t);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
    }

    public <K> DynamicAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        this.mValue = Float.MAX_VALUE;
        this.mMaxValue = Float.MAX_VALUE;
        this.mMinValue = -this.mMaxValue;
        this.mEndListeners = new ArrayList<>();
        this.mUpdateListeners = new ArrayList<>();
        this.mTarget = k;
        this.mProperty = floatPropertyCompat;
        FloatPropertyCompat floatPropertyCompat2 = this.mProperty;
        if (floatPropertyCompat2 != ROTATION && floatPropertyCompat2 != ROTATION_X && floatPropertyCompat2 != ROTATION_Y) {
            if (floatPropertyCompat2 == ALPHA) {
                this.mMinVisibleChange = 0.00390625f;
                return;
            } else if (floatPropertyCompat2 != SCALE_X && floatPropertyCompat2 != SCALE_Y) {
                this.mMinVisibleChange = 1.0f;
                return;
            } else {
                this.mMinVisibleChange = 0.00390625f;
                return;
            }
        }
        this.mMinVisibleChange = 0.1f;
    }
}
