package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC144349eV5;
import p003X.C144348eV4;

/* loaded from: classes19.dex */
public final class GestureDetectorCompat {
    public final AbstractC144349eV5 mImpl;

    static {
        Covode.recordClassIndex(1066);
    }

    public final boolean isLongpressEnabled() {
        return this.mImpl.LIZ();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.mImpl.LIZ(motionEvent);
    }

    public final void setIsLongpressEnabled(boolean z) {
        this.mImpl.LIZ(z);
    }

    public final void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.mImpl.LIZ(onDoubleTapListener);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        int i = Build.VERSION.SDK_INT;
        this.mImpl = new C144348eV4(context, onGestureListener, handler);
    }
}
