package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public abstract class FloatPropertyCompat<T> {
    public final String mPropertyName;

    static {
        Covode.recordClassIndex(1233);
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final FloatProperty<T> floatProperty) {
        return new FloatPropertyCompat<T>(floatProperty.getName()) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            static {
                Covode.recordClassIndex(1234);
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public final float getValue(T t) {
                return ((Float) floatProperty.get(t)).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public final void setValue(T t, float f) {
                floatProperty.setValue(t, f);
            }
        };
    }
}
