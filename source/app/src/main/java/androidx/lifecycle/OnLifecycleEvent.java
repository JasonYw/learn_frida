package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;

/* loaded from: classes.dex */
public @interface OnLifecycleEvent {
    static {
        Covode.recordClassIndex(1375);
    }

    Lifecycle.Event value();
}
