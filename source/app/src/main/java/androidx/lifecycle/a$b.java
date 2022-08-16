package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes23.dex */
public final class a$b {
    public final int LIZ;
    public final Method LIZIZ;

    static {
        Covode.recordClassIndex(1400);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a$b)) {
            return false;
        }
        a$b a_b = (a$b) obj;
        if (this.LIZ == a_b.LIZ && this.LIZIZ.getName().equals(a_b.LIZIZ.getName())) {
            return true;
        }
        return false;
    }

    public a$b(int i, Method method) {
        this.LIZ = i;
        this.LIZIZ = method;
        this.LIZIZ.setAccessible(true);
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, Lifecycle.Event event, Object obj) {
        try {
            int i = this.LIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        this.LIZIZ.invoke(obj, lifecycleOwner, event);
                        return;
                    }
                    return;
                }
                this.LIZIZ.invoke(obj, lifecycleOwner);
                return;
            }
            this.LIZIZ.invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException("Failed to call observer method", e2.getCause());
        }
    }
}
