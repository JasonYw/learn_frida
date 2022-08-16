package androidx.dynamicanimation.animation;

import com.bytedance.covode.number.Covode;
import p003X.C146782f8S;

/* loaded from: classes19.dex */
public final class SpringForce {
    public double mDampedFreq;
    public double mDampingRatio;
    public double mFinalPosition;
    public double mGammaMinus;
    public double mGammaPlus;
    public boolean mInitialized;
    public final C146782f8S mMassState;
    public double mNaturalFreq;
    public double mValueThreshold;
    public double mVelocityThreshold;

    static {
        Covode.recordClassIndex(1236);
    }

    public final float getDampingRatio() {
        return (float) this.mDampingRatio;
    }

    public final float getFinalPosition() {
        return (float) this.mFinalPosition;
    }

    public final float getStiffness() {
        double d = this.mNaturalFreq;
        return (float) (d * d);
    }

    public SpringForce() {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new C146782f8S();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        if (this.mFinalPosition != Double.MAX_VALUE) {
            double d = this.mDampingRatio;
            if (d > 1.0d) {
                double d2 = this.mNaturalFreq;
                this.mGammaPlus = ((-d) * d2) + (d2 * Math.sqrt((d * d) - 1.0d));
                double d3 = this.mDampingRatio;
                double d4 = this.mNaturalFreq;
                this.mGammaMinus = ((-d3) * d4) - (d4 * Math.sqrt((d3 * d3) - 1.0d));
            } else if (d >= 0.0d && d < 1.0d) {
                this.mDampedFreq = this.mNaturalFreq * Math.sqrt(1.0d - (d * d));
            }
            this.mInitialized = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }

    public final SpringForce setFinalPosition(float f) {
        this.mFinalPosition = f;
        return this;
    }

    public final SpringForce setDampingRatio(float f) {
        if (f >= 0.0f) {
            this.mDampingRatio = f;
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final SpringForce setStiffness(float f) {
        if (f > 0.0f) {
            this.mNaturalFreq = Math.sqrt(f);
            this.mInitialized = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final void setValueThreshold(double d) {
        this.mValueThreshold = Math.abs(d);
        this.mVelocityThreshold = this.mValueThreshold * 62.5d;
    }

    public SpringForce(float f) {
        this.mNaturalFreq = Math.sqrt(1500.0d);
        this.mDampingRatio = 0.5d;
        this.mInitialized = false;
        this.mFinalPosition = Double.MAX_VALUE;
        this.mMassState = new C146782f8S();
        this.mFinalPosition = f;
    }

    public final float getAcceleration(float f, float f2) {
        float finalPosition = f - getFinalPosition();
        double d = this.mNaturalFreq;
        return (float) (((-(d * d)) * finalPosition) - (((d * 2.0d) * this.mDampingRatio) * f2));
    }

    public final boolean isAtEquilibrium(float f, float f2) {
        if (Math.abs(f2) < this.mVelocityThreshold && Math.abs(f - getFinalPosition()) < this.mValueThreshold) {
            return true;
        }
        return false;
    }

    public final C146782f8S updateValues(double d, double d2, long j) {
        double pow;
        double cos;
        init();
        double d3 = j / 1000.0d;
        double d4 = d - this.mFinalPosition;
        double d5 = this.mDampingRatio;
        if (d5 > 1.0d) {
            double d6 = this.mGammaMinus;
            double d7 = this.mGammaPlus;
            double d8 = d4 - (((d6 * d4) - d2) / (d6 - d7));
            double d9 = ((d4 * d6) - d2) / (d6 - d7);
            pow = (Math.pow(2.718281828459045d, d6 * d3) * d8) + (Math.pow(2.718281828459045d, this.mGammaPlus * d3) * d9);
            double d10 = this.mGammaMinus;
            double pow2 = d8 * d10 * Math.pow(2.718281828459045d, d10 * d3);
            double d11 = this.mGammaPlus;
            cos = pow2 + (d9 * d11 * Math.pow(2.718281828459045d, d11 * d3));
        } else if (d5 == 1.0d) {
            double d12 = this.mNaturalFreq;
            double d13 = d2 + (d12 * d4);
            double d14 = d4 + (d13 * d3);
            pow = Math.pow(2.718281828459045d, (-d12) * d3) * d14;
            double d15 = this.mNaturalFreq;
            cos = (d13 * Math.pow(2.718281828459045d, (-d15) * d3)) + (d14 * Math.pow(2.718281828459045d, (-this.mNaturalFreq) * d3) * (-d15));
        } else {
            double d16 = this.mNaturalFreq;
            double d17 = (1.0d / this.mDampedFreq) * ((d5 * d16 * d4) + d2);
            pow = Math.pow(2.718281828459045d, (-d5) * d16 * d3) * ((Math.cos(this.mDampedFreq * d3) * d4) + (Math.sin(this.mDampedFreq * d3) * d17));
            double d18 = this.mNaturalFreq;
            double d19 = this.mDampingRatio;
            double d20 = (-d18) * pow * d19;
            double pow3 = Math.pow(2.718281828459045d, (-d19) * d18 * d3);
            double d21 = this.mDampedFreq;
            double sin = (-d21) * d4 * Math.sin(d21 * d3);
            double d22 = this.mDampedFreq;
            cos = d20 + (pow3 * (sin + (d17 * d22 * Math.cos(d22 * d3))));
        }
        C146782f8S c146782f8S = this.mMassState;
        c146782f8S.LIZ = (float) (pow + this.mFinalPosition);
        c146782f8S.LIZIZ = (float) cos;
        return c146782f8S;
    }
}
