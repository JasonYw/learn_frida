package com.alibaba.wireless.security.framework.utils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* renamed from: com.alibaba.wireless.security.framework.utils.d */
/* loaded from: classes2.dex */
public class C1130d {

    /* renamed from: a */
    public final Object f21814a;

    /* renamed from: b */
    public final boolean f21815b;

    /* renamed from: com.alibaba.wireless.security.framework.utils.d$a */
    /* loaded from: classes2.dex */
    public static class C1131a {
        static {
            Covode.recordClassIndex(4555);
        }
    }

    static {
        Covode.recordClassIndex(4554);
    }

    public C1130d(Object obj) {
        this.f21814a = obj;
    }

    /* renamed from: a */
    public static C1130d m19704a(Object obj) {
        return new C1130d(obj);
    }

    /* renamed from: a */
    public static C1130d m19700a(Method method, Object obj, Object... objArr) {
        try {
            m19701a(method);
            if (method.getReturnType() != Void.TYPE) {
                return m19704a(m19694x3cf843d7(method, obj, objArr));
            }
            m19694x3cf843d7(method, obj, objArr);
            return m19704a(obj);
        } catch (Exception e) {
            throw new C1132e(e);
        }
    }

    /* renamed from: a */
    public static Class<?> m19705a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        return cls.isPrimitive() ? Boolean.TYPE == cls ? Boolean.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : Byte.TYPE == cls ? Byte.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Character.TYPE == cls ? Character.class : Void.TYPE == cls ? Void.class : cls : cls;
    }

    /* renamed from: a */
    public static <T extends AccessibleObject> T m19701a(T t) {
        if (t == null) {
            return null;
        }
        if (t instanceof Member) {
            Member member = (Member) t;
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(member.getDeclaringClass().getModifiers())) {
                return t;
            }
        }
        if (!t.isAccessible()) {
            t.setAccessible(true);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.reflect.Method] */
    /* renamed from: a */
    private Method m19703a(String str, Class<?>[] clsArr) {
        Class m19696b = m19696b();
        try {
            m19696b = m19696b.getMethod(str, clsArr);
            return m19696b;
        } catch (NoSuchMethodException unused) {
            do {
                try {
                    m19696b = m19696b.getDeclaredMethod(str, clsArr);
                    return m19696b;
                } catch (NoSuchMethodException unused2) {
                    m19696b = m19696b.getSuperclass();
                    if (m19696b == 0) {
                        throw new NoSuchMethodException();
                    }
                }
            } while (m19696b == 0);
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    private boolean m19699a(Method method, String str, Class<?>[] clsArr) {
        return method.getName().equals(str) && m19698a(method.getParameterTypes(), clsArr);
    }

    /* renamed from: a */
    private boolean m19698a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length == clsArr2.length) {
            for (int i = 0; i < clsArr2.length; i++) {
                if (clsArr2[i] != C1131a.class && !m19705a(clsArr[i]).isAssignableFrom(m19705a(clsArr2[i]))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Class<?>[] m19697a(Object... objArr) {
        if (objArr == null) {
            return new Class[0];
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            clsArr[i] = obj == null ? C1131a.class : obj.getClass();
        }
        return clsArr;
    }

    /* renamed from: b */
    private Method m19695b(String str, Class<?>[] clsArr) {
        Method[] methods;
        Method[] declaredMethods;
        Class<?> m19696b = m19696b();
        for (Method method : m19696b.getMethods()) {
            if (m19699a(method, str, clsArr)) {
                return method;
            }
        }
        do {
            for (Method method2 : m19696b.getDeclaredMethods()) {
                if (m19699a(method2, str, clsArr)) {
                    return method2;
                }
            }
            m19696b = m19696b.getSuperclass();
        } while (m19696b != null);
        throw new NoSuchMethodException("No similar method " + str + " with params " + Arrays.toString(clsArr) + " could be found on type " + m19696b() + ".");
    }

    /* renamed from: com_alibaba_wireless_security_framework_utils_d_java_lang_reflect_Method_invoke */
    public static Object m19694x3cf843d7(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alibaba_wireless_security_framework_utils_d_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alibaba_wireless_security_framework_utils_d_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    /* renamed from: a */
    public C1130d m19702a(String str, Object... objArr) {
        Class<?>[] m19697a = m19697a(objArr);
        try {
            try {
                return m19700a(m19703a(str, m19697a), this.f21814a, objArr);
            } catch (NoSuchMethodException e) {
                throw new C1132e(e);
            }
        } catch (NoSuchMethodException unused) {
            return m19700a(m19695b(str, m19697a), this.f21814a, objArr);
        }
    }

    /* renamed from: a */
    public <T> T m19706a() {
        return (T) this.f21814a;
    }

    /* renamed from: b */
    public Class<?> m19696b() {
        return this.f21815b ? (Class) this.f21814a : this.f21814a.getClass();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C1130d) {
            return this.f21814a.equals(((C1130d) obj).m19706a());
        }
        return false;
    }

    public int hashCode() {
        return this.f21814a.hashCode();
    }

    public String toString() {
        return this.f21814a.toString();
    }
}
