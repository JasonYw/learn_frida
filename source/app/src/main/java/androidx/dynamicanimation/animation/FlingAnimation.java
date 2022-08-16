package androidx.dynamicanimation.animation;

import com.bytedance.covode.number.Covode;
import p003X.C146762f88;
import p003X.C146782f8S;
import p003X.C146783f8T;

/* loaded from: classes19.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {
    public final C146762f88 mFlingForce = new C146762f88();

    static {
        Covode.recordClassIndex(1231);
    }

    public final float getFriction() {
        return this.mFlingForce.LIZ / (-4.2f);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: setMaxValue  reason: avoid collision after fix types in other method */
    public final FlingAnimation setMaxValue2(float f) {
        super.setMaxValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: setMinValue  reason: avoid collision after fix types in other method */
    public final FlingAnimation setMinValue2(float f) {
        super.setMinValue(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    /* renamed from: setStartVelocity  reason: avoid collision after fix types in other method */
    public final FlingAnimation setStartVelocity2(float f) {
        super.setStartVelocity(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final /* bridge */ /* synthetic */ FlingAnimation setMaxValue(float f) {
        setMaxValue2(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final /* bridge */ /* synthetic */ FlingAnimation setMinValue(float f) {
        setMinValue2(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final /* bridge */ /* synthetic */ FlingAnimation setStartVelocity(float f) {
        setStartVelocity2(f);
        return this;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final void setValueThreshold(float f) {
        this.mFlingForce.LIZIZ(f);
    }

    public FlingAnimation(C146783f8T c146783f8T) {
        super(c146783f8T);
        this.mFlingForce.LIZIZ(getValueThreshold());
    }

    public final FlingAnimation setFriction(float f) {
        if (f > 0.0f) {
            this.mFlingForce.LIZ = f * (-4.2f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean updateValueAndVelocity(long j) {
        C146762f88 c146762f88 = this.mFlingForce;
        float f = this.mValue;
        float f2 = this.mVelocity;
        float f3 = (float) j;
        c146762f88.LIZIZ.LIZIZ = (float) (f2 * Math.exp((f3 / 1000.0f) * c146762f88.LIZ));
        c146762f88.LIZIZ.LIZ = (float) ((f - (f2 / c146762f88.LIZ)) + ((f2 / c146762f88.LIZ) * Math.exp((c146762f88.LIZ * f3) / 1000.0f)));
        if (c146762f88.LIZ(c146762f88.LIZIZ.LIZIZ)) {
            c146762f88.LIZIZ.LIZIZ = 0.0f;
        }
        C146782f8S c146782f8S = c146762f88.LIZIZ;
        this.mValue = c146782f8S.LIZ;
        this.mVelocity = c146782f8S.LIZIZ;
        if (this.mValue < this.mMinValue) {
            this.mValue = this.mMinValue;
            return true;
        } else if (this.mValue > this.mMaxValue) {
            this.mValue = this.mMaxValue;
            return true;
        } else if (isAtEquilibrium(this.mValue, this.mVelocity)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final float getAcceleration(float f, float f2) {
        return f2 * this.mFlingForce.LIZ;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public final boolean isAtEquilibrium(float f, float f2) {
        if (f < this.mMaxValue && f > this.mMinValue && !this.mFlingForce.LIZ(f2)) {
            return false;
        }
        return true;
    }

    public <K> FlingAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat) {
        super(k, floatPropertyCompat);
        this.mFlingForce.LIZIZ(getValueThreshold());
    }
}
