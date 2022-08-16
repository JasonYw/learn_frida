package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.lang.reflect.Constructor;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.ef */
/* loaded from: classes19.dex */
public class C1645ef {
    static {
        Covode.recordClassIndex(5193);
    }

    /* renamed from: a */
    public static boolean m17717a(AbstractC1653ei abstractC1653ei) {
        if (abstractC1653ei != null && abstractC1653ei.m17691a() && abstractC1653ei.f23478d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static AbstractC1653ei m17714b(Context context, C1599da c1599da) {
        AbstractC1653ei abstractC1653ei = null;
        if (context == null) {
            return null;
        }
        try {
            if (m17721a(context, c1599da)) {
                abstractC1653ei = C1647eg.m17710b().m17712a(context, c1599da);
                return abstractC1653ei;
            }
        } catch (Throwable th) {
            C1650eh.m17694a(th, "IFactory", "gIns1");
        }
        return abstractC1653ei;
    }

    /* renamed from: a */
    public static void m17718a(final Context context, final String str) {
        try {
            C1647eg.m17710b().m17713a().submit(new Runnable() { // from class: com.amap.api.mapcore2d.ef.1
                static {
                    Covode.recordClassIndex(5194);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1638eb.m17758a(new C1627dt(context, C1642ed.m17742c()), context, str);
                    } catch (Throwable th) {
                        C1650eh.m17694a(th, "InstanceFactory", "rollBack");
                    }
                }
            });
        } catch (Throwable th) {
            C1650eh.m17694a(th, "InstanceFactory", "rollBack");
        }
    }

    /* renamed from: a */
    public static boolean m17721a(Context context, C1599da c1599da) {
        try {
            if (!new File(C1638eb.m17767a(context)).exists()) {
                return false;
            }
            File file = new File(C1638eb.m17754b(context, c1599da.m17972a(), c1599da.m17968b()));
            if (file.exists()) {
                return true;
            }
            C1638eb.m17762a(context, file, c1599da);
            return false;
        } catch (Throwable th) {
            C1650eh.m17694a(th, "IFactory", "isdowned");
            return false;
        }
    }

    /* renamed from: a */
    public static Class m17720a(Context context, C1599da c1599da, String str) {
        AbstractC1653ei m17714b = m17714b(context, c1599da);
        try {
            if (!m17717a(m17714b)) {
                return null;
            }
            return C116971W2r.LIZ(m17714b, str);
        } catch (Throwable th) {
            C1650eh.m17694a(th, "InstanceFactory", "loadpn");
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m17715a(Class cls, Class[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            C1650eh.m17694a(th, "IFactory", "gIns2()");
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m17716a(AbstractC1653ei abstractC1653ei, String str, Class[] clsArr, Object[] objArr) {
        Class LIZ;
        try {
            if (m17717a(abstractC1653ei) && (LIZ = C116971W2r.LIZ(abstractC1653ei, str)) != null) {
                Constructor<T> declaredConstructor = LIZ.getDeclaredConstructor(clsArr);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(objArr);
            }
            return null;
        } catch (Throwable th) {
            C1650eh.m17694a(th, "IFactory", "getWrap");
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m17719a(Context context, C1599da c1599da, String str, Class cls, Class[] clsArr, Object[] objArr) {
        T t = (T) m17716a(m17714b(context, c1599da), str, clsArr, objArr);
        if (t != null) {
            return t;
        }
        T t2 = (T) m17715a(cls, clsArr, objArr);
        if (t2 != null) {
            return t2;
        }
        throw new C1572cp("获取对象错误");
    }
}
