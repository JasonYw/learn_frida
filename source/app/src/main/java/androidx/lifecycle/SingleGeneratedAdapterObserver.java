package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    public final GeneratedAdapter LIZ;

    static {
        Covode.recordClassIndex(1383);
    }

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.LIZ = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        this.LIZ.callMethods(lifecycleOwner, event, false, null);
        this.LIZ.callMethods(lifecycleOwner, event, true, null);
    }
}
