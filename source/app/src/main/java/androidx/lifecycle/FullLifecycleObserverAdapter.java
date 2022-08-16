package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC65757Bx1;

/* loaded from: classes26.dex */
public class FullLifecycleObserverAdapter implements LifecycleEventObserver {
    public final AbstractC65757Bx1 LIZ;
    public final LifecycleEventObserver LIZIZ;

    static {
        Covode.recordClassIndex(1352);
    }

    public FullLifecycleObserverAdapter(AbstractC65757Bx1 abstractC65757Bx1, LifecycleEventObserver lifecycleEventObserver) {
        this.LIZ = abstractC65757Bx1;
        this.LIZIZ = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (event) {
            case ON_CREATE:
                this.LIZ.LIZ(lifecycleOwner);
                break;
            case ON_START:
                this.LIZ.LIZIZ(lifecycleOwner);
                break;
            case ON_RESUME:
                this.LIZ.LIZJ(lifecycleOwner);
                break;
            case ON_PAUSE:
                this.LIZ.LIZLLL(lifecycleOwner);
                break;
            case ON_STOP:
                this.LIZ.mo6763LJ(lifecycleOwner);
                break;
            case ON_DESTROY:
                this.LIZ.LJFF(lifecycleOwner);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.LIZIZ;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.onStateChanged(lifecycleOwner, event);
        }
    }
}
