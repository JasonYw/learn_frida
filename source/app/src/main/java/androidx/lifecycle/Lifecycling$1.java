package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public class Lifecycling$1 implements AbstractC0324f {
    public final /* synthetic */ LifecycleEventObserver LIZ;

    static {
        Covode.recordClassIndex(1366);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LIZ.onStateChanged(lifecycleOwner, event);
    }
}
