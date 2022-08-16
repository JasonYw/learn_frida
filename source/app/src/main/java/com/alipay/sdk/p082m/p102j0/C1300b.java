package com.alipay.sdk.p082m.p102j0;

import android.content.Context;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.lang.reflect.Method;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.j0.b */
/* loaded from: classes2.dex */
public class C1300b {

    /* renamed from: b */
    public static Object f22181b;

    /* renamed from: c */
    public static Class<?> f22182c;

    /* renamed from: d */
    public static Method f22183d;

    /* renamed from: e */
    public static Method f22184e;

    /* renamed from: f */
    public static Method f22185f;

    /* renamed from: g */
    public static Method f22186g;

    public static Object com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    /* renamed from: a */
    public static boolean m19225a() {
        if (f22182c != null && f22181b != null) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(4800);
        try {
            Class<?> LIZ = C116971W2r.LIZ("com.android.id.impl.IdProviderImpl");
            f22182c = LIZ;
            f22181b = LIZ.newInstance();
            f22183d = f22182c.getMethod("getUDID", Context.class);
            f22184e = f22182c.getMethod("getOAID", Context.class);
            f22185f = f22182c.getMethod("getVAID", Context.class);
            f22186g = f22182c.getMethod("getAAID", Context.class);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static String m19224a(Context context) {
        return m19223a(context, f22186g);
    }

    /* renamed from: b */
    public static String m19222b(Context context) {
        return m19223a(context, f22184e);
    }

    /* renamed from: c */
    public static String m19221c(Context context) {
        return m19223a(context, f22183d);
    }

    /* renamed from: d */
    public static String m19220d(Context context) {
        return m19223a(context, f22185f);
    }

    /* renamed from: a */
    public static String m19223a(Context context, Method method) {
        Object obj = f22181b;
        if (obj != null && method != null) {
            try {
                Object com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke = com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke(method, obj, new Object[]{context});
                if (com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke != null) {
                    return (String) com_alipay_sdk_m_j0_b_java_lang_reflect_Method_invoke;
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }
}
