package androidx.core.view;

import android.view.VelocityTracker;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public final class VelocityTrackerCompat {
    static {
        Covode.recordClassIndex(1079);
    }

    public static float getXVelocity(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    public static float getYVelocity(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }
}
