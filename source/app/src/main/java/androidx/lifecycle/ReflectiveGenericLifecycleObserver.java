package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import p003X.C6WZ;

/* loaded from: classes23.dex */
public class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {
    public final Object LIZ;
    public final a$a LIZIZ;

    static {
        Covode.recordClassIndex(1382);
    }

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.LIZ = obj;
        this.LIZIZ = C6WZ.LIZ.LIZIZ(this.LIZ.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        a$a a_a = this.LIZIZ;
        Object obj = this.LIZ;
        a$a.LIZ(a_a.LIZ.get(event), lifecycleOwner, event, obj);
        a$a.LIZ(a_a.LIZ.get(Lifecycle.Event.ON_ANY), lifecycleOwner, event, obj);
    }
}
