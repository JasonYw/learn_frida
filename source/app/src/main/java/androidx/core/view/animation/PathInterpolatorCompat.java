package androidx.core.view.animation;

import android.graphics.Path;
import android.os.Build;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.bytedance.covode.number.Covode;

/* loaded from: classes22.dex */
public final class PathInterpolatorCompat {
    static {
        Covode.recordClassIndex(1138);
    }

    public static Interpolator create(Path path) {
        int i = Build.VERSION.SDK_INT;
        return new PathInterpolator(path);
    }

    public static Interpolator create(float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        return new PathInterpolator(f, f2);
    }

    public static Interpolator create(float f, float f2, float f3, float f4) {
        int i = Build.VERSION.SDK_INT;
        return new PathInterpolator(f, f2, f3, f4);
    }
}
