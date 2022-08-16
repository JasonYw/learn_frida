package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.lang.reflect.Constructor;
import p003X.C116971W2r;

/* renamed from: com.amap.api.services.a.cr */
/* loaded from: classes19.dex */
public class C1930cr {
    static {
        Covode.recordClassIndex(5541);
    }

    /* renamed from: a */
    public static boolean m16604a(AbstractC1938cu abstractC1938cu) {
        if (abstractC1938cu != null && abstractC1938cu.m16578a() && abstractC1938cu.f24663d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static AbstractC1938cu m16601b(Context context, C1889bo c1889bo) {
        AbstractC1938cu abstractC1938cu = null;
        if (context == null) {
            return null;
        }
        try {
            if (m16608a(context, c1889bo)) {
                abstractC1938cu = C1932cs.m16597b().m16599a(context, c1889bo);
                return abstractC1938cu;
            }
        } catch (Throwable th) {
            C1935ct.m16581a(th, "IFactory", "gIns1");
        }
        return abstractC1938cu;
    }

    /* renamed from: a */
    public static void m16605a(final Context context, final String str) {
        try {
            C1932cs.m16597b().m16600a().submit(new Runnable() { // from class: com.amap.api.services.a.cr.1
                static {
                    Covode.recordClassIndex(5542);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C1923cn.m16645a(new C1914cf(context, C1927cp.m16629c()), context, str);
                    } catch (Throwable th) {
                        C1935ct.m16581a(th, "InstanceFactory", "rollBack");
                    }
                }
            });
        } catch (Throwable th) {
            C1935ct.m16581a(th, "InstanceFactory", "rollBack");
        }
    }

    /* renamed from: a */
    public static boolean m16608a(Context context, C1889bo c1889bo) {
        try {
            if (!new File(C1923cn.m16654a(context)).exists()) {
                return false;
            }
            File file = new File(C1923cn.m16641b(context, c1889bo.m16818a(), c1889bo.m16814b()));
            if (file.exists()) {
                return true;
            }
            C1923cn.m16649a(context, file, c1889bo);
            return false;
        } catch (Throwable th) {
            C1935ct.m16581a(th, "IFactory", "isdowned");
            return false;
        }
    }

    /* renamed from: a */
    public static Class m16607a(Context context, C1889bo c1889bo, String str) {
        AbstractC1938cu m16601b = m16601b(context, c1889bo);
        try {
            if (!m16604a(m16601b)) {
                return null;
            }
            return C116971W2r.LIZ(m16601b, str);
        } catch (Throwable th) {
            C1935ct.m16581a(th, "InstanceFactory", "loadpn");
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m16602a(Class cls, Class[] clsArr, Object[] objArr) {
        if (cls == null) {
            return null;
        }
        try {
            Constructor<T> declaredConstructor = cls.getDeclaredConstructor(clsArr);
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance(objArr);
        } catch (Throwable th) {
            C1935ct.m16581a(th, "IFactory", "gIns2()");
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m16603a(AbstractC1938cu abstractC1938cu, String str, Class[] clsArr, Object[] objArr) {
        Class LIZ;
        try {
            if (m16604a(abstractC1938cu) && (LIZ = C116971W2r.LIZ(abstractC1938cu, str)) != null) {
                Constructor<T> declaredConstructor = LIZ.getDeclaredConstructor(clsArr);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(objArr);
            }
            return null;
        } catch (Throwable th) {
            C1935ct.m16581a(th, "IFactory", "getWrap");
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m16606a(Context context, C1889bo c1889bo, String str, Class cls, Class[] clsArr, Object[] objArr) {
        T t = (T) m16603a(m16601b(context, c1889bo), str, clsArr, objArr);
        if (t != null) {
            return t;
        }
        T t2 = (T) m16602a(cls, clsArr, objArr);
        if (t2 != null) {
            return t2;
        }
        throw new C1863be("获取对象错误");
    }
}
