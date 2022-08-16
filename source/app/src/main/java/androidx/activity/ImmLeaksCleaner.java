package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* loaded from: classes28.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static int LIZ;
    public static Field LIZIZ;
    public static Field LIZJ;
    public static Field LIZLLL;

    /* renamed from: LJ */
    public Activity f20217LJ;

    static {
        Covode.recordClassIndex(411);
    }

    public ImmLeaksCleaner(Activity activity) {
        this.f20217LJ = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (LIZ == 0) {
            try {
                LIZ = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                LIZJ = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                LIZLLL = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                LIZIZ = declaredField3;
                declaredField3.setAccessible(true);
                LIZ = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (LIZ == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f20217LJ.getSystemService("input_method");
            try {
                Object obj = LIZIZ.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) LIZJ.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                LIZLLL.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (ClassCastException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
