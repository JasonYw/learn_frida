package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.util.Property;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes18.dex */
public final class ButterKnife {
    public static final Map<Class<?>, Constructor<? extends Unbinder>> BINDINGS = new LinkedHashMap();
    public static boolean debug;

    /* loaded from: classes18.dex */
    public interface Action<T extends View> extends butterknife.Action<T> {
        static {
            Covode.recordClassIndex(2532);
        }
    }

    /* loaded from: classes18.dex */
    public interface Setter<T extends View, V> extends butterknife.Setter<T, V> {
        static {
            Covode.recordClassIndex(2533);
        }
    }

    public static <T extends View> void apply(T[] tArr, Action<? super T>... actionArr) {
        ViewCollections.run(tArr, actionArr);
    }

    public static <T extends View, V> void apply(T[] tArr, Setter<? super T, V> setter, V v) {
        ViewCollections.set(tArr, setter, v);
    }

    static {
        Covode.recordClassIndex(2531);
    }

    public ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static void setDebug(boolean z) {
        debug = z;
    }

    public static Unbinder bind(View view) {
        return bind(view, view);
    }

    public static Unbinder bind(Activity activity) {
        return bind(activity, activity.getWindow().getDecorView());
    }

    public static Unbinder bind(Dialog dialog) {
        return bind(dialog, dialog.getWindow().getDecorView());
    }

    public static Constructor<? extends Unbinder> findBindingConstructorForClass(Class<?> cls) {
        Constructor<? extends Unbinder> findBindingConstructorForClass;
        Constructor<? extends Unbinder> constructor = BINDINGS.get(cls);
        if (constructor == null && !BINDINGS.containsKey(cls)) {
            String name = cls.getName();
            if (!name.startsWith("android.") && !name.startsWith("java.") && !name.startsWith("androidx.")) {
                try {
                    ClassLoader classLoader = cls.getClassLoader();
                    new StringBuilder();
                    findBindingConstructorForClass = C116971W2r.LIZ(classLoader, C0002O.m25086C(name, "_ViewBinding")).getConstructor(cls, View.class);
                } catch (ClassNotFoundException unused) {
                    findBindingConstructorForClass = findBindingConstructorForClass(cls.getSuperclass());
                } catch (NoSuchMethodException e) {
                    throw new RuntimeException(C0002O.m25086C("Unable to find binding constructor for ", name), e);
                }
                BINDINGS.put(cls, findBindingConstructorForClass);
                return findBindingConstructorForClass;
            }
            return null;
        }
        return constructor;
    }

    public static <T extends View> void apply(T t, Action<? super T> action) {
        ViewCollections.run(t, action);
    }

    public static <T extends View> void apply(T t, Action<? super T>... actionArr) {
        ViewCollections.run(t, actionArr);
    }

    public static Unbinder bind(Object obj, Activity activity) {
        return bind(obj, activity.getWindow().getDecorView());
    }

    public static <T extends View> void apply(List<T> list, Action<? super T> action) {
        ViewCollections.run(list, action);
    }

    public static Unbinder bind(Object obj, Dialog dialog) {
        return bind(obj, dialog.getWindow().getDecorView());
    }

    public static Unbinder bind(Object obj, View view) {
        Constructor<? extends Unbinder> findBindingConstructorForClass = findBindingConstructorForClass(obj.getClass());
        if (findBindingConstructorForClass == null) {
            return Unbinder.EMPTY;
        }
        try {
            return findBindingConstructorForClass.newInstance(obj, view);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + findBindingConstructorForClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + findBindingConstructorForClass, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw cause;
                }
                throw new RuntimeException("Unable to create binding instance.", cause);
            }
            throw cause;
        }
    }

    public static <T extends View> void apply(List<T> list, Action<? super T>... actionArr) {
        ViewCollections.run(list, actionArr);
    }

    public static <T extends View> void apply(T[] tArr, Action<? super T> action) {
        ViewCollections.run(tArr, action);
    }

    public static <T extends View, V> void apply(T t, Property<? super T, V> property, V v) {
        ViewCollections.set(t, property, v);
    }

    public static <T extends View, V> void apply(T t, Setter<? super T, V> setter, V v) {
        ViewCollections.set(t, setter, v);
    }

    public static <T extends View, V> void apply(List<T> list, Property<? super T, V> property, V v) {
        ViewCollections.set(list, property, v);
    }

    public static <T extends View, V> void apply(List<T> list, Setter<? super T, V> setter, V v) {
        ViewCollections.set(list, setter, v);
    }

    public static <T extends View, V> void apply(T[] tArr, Property<? super T, V> property, V v) {
        ViewCollections.set(tArr, property, v);
    }
}
