package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public interface LifecycleEventObserver extends LifecycleObserver {
    static {
        Covode.recordClassIndex(1360);
    }

    void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event);
}
