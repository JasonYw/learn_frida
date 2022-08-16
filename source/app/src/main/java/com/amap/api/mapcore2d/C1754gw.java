package com.amap.api.mapcore2d;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.gw */
/* loaded from: classes17.dex */
public final class C1754gw {
    static {
        Covode.recordClassIndex(5302);
    }

    /* renamed from: a */
    public static Object m17295a(Class<?> cls, String str, Object[] objArr, Class<?>[] clsArr) {
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return com_amap_api_mapcore2d_gw_java_lang_reflect_Method_invoke(declaredMethod, null, objArr);
    }

    /* renamed from: a */
    public static Object m17294a(Object obj, Class<?> cls, String str, Object... objArr) {
        Class<?>[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
            if (clsArr[i] == Integer.class) {
                clsArr[i] = Integer.TYPE;
            }
            if (clsArr[i] == Boolean.class) {
                clsArr[i] = Boolean.TYPE;
            }
            if (clsArr[i] == Double.class) {
                clsArr[i] = Double.TYPE;
            }
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        Object obj2 = null;
        try {
            obj2 = com_amap_api_mapcore2d_gw_java_lang_reflect_Method_invoke(declaredMethod, obj, objArr);
            return obj2;
        } catch (Throwable th) {
            try {
                if (th instanceof InvocationTargetException) {
                    C1752gu.m17302a(th.getTargetException(), "Reflect", "invokeMethod ".concat(String.valueOf(str)));
                }
            } catch (Throwable unused) {
            }
            return obj2;
        }
    }

    /* renamed from: a */
    public static Object m17293a(Object obj, String str, Object... objArr) {
        try {
            return m17294a(obj, obj.getClass(), str, objArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m17292a(String str, String str2) {
        Class LIZ = C116971W2r.LIZ(str);
        Field field = LIZ.getField(str2);
        field.setAccessible(true);
        return field.get(LIZ);
    }

    /* renamed from: a */
    public static Object m17291a(String str, String str2, Object[] objArr, Class<?>[] clsArr) {
        return m17295a(C116971W2r.LIZ(str), str2, objArr, clsArr);
    }

    /* renamed from: b */
    public static int m17290b(Object obj, String str, Object... objArr) {
        return ((Integer) m17293a(obj, str, objArr)).intValue();
    }

    /* renamed from: b */
    public static int m17289b(String str, String str2) {
        return ((Integer) m17292a(str, str2)).intValue();
    }

    public static Object com_amap_api_mapcore2d_gw_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_amap_api_mapcore2d_gw_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_amap_api_mapcore2d_gw_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }
}
