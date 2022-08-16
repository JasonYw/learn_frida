package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0324f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p002O.C0002O;
import p003X.C116971W2r;
import p003X.QVP;

/* loaded from: classes8.dex */
public final class Recreator implements AbstractC0324f {
    public final AbstractC0403c LIZ;

    static {
        Covode.recordClassIndex(1870);
    }

    public Recreator(AbstractC0403c abstractC0403c) {
        this.LIZ = abstractC0403c;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Class cls;
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.mo29786getLifecycle().removeObserver(this);
            Bundle LIZ = this.LIZ.getSavedStateRegistry().LIZ("androidx.savedstate.Restarter");
            if (LIZ == null) {
                return;
            }
            ArrayList<String> stringArrayList = LIZ.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    try {
                        try {
                            Constructor declaredConstructor = C116971W2r.LIZ(next, false, Recreator.class.getClassLoader()).asSubclass(QVP.class).getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                declaredConstructor.newInstance(new Object[0]);
                            } catch (Exception e) {
                                throw new RuntimeException(C0002O.m25086C("Failed to instantiate ", next), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException(C0002O.m25085C("Class", cls.getSimpleName(), " must have default constructor in order to be automatically recreated"), e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(C0002O.m25085C("Class ", next, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
