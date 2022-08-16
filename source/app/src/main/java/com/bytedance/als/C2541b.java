package com.bytedance.als;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C7TC;

@Deprecated(message = "use ObjectContainer instead")
/* renamed from: com.bytedance.als.b */
/* loaded from: classes4.dex */
public final class C2541b {
    public static ChangeQuickRedirect LIZ;
    public static final C7TC LIZIZ = new C7TC((byte) 0);
    public final Map<Class<?>, Object> LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public C2541b f25599LJ;

    static {
        Covode.recordClassIndex(10043);
    }

    public C2541b() {
        this(null, 1);
    }

    @JvmStatic
    public static final C2541b LIZ(FragmentActivity fragmentActivity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragmentActivity}, null, LIZ, true, 8);
        return proxy.isSupported ? (C2541b) proxy.result : LIZIZ.LIZ(fragmentActivity);
    }

    public final void LIZ() {
        this.LIZLLL = true;
    }

    public C2541b(C2541b c2541b) {
        this.f25599LJ = c2541b;
        this.LIZJ = new HashMap();
    }

    public final <T extends AbstractC2543c> void LIZIZ(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(t);
        if (this.LIZLLL) {
            return;
        }
        this.LIZJ.remove(t.getClass());
    }

    public final synchronized <T extends AbstractC2543c> T LIZ(Class<T> cls) {
        Object obj;
        MethodCollector.m14708i(880);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            T t = (T) proxy.result;
            MethodCollector.m14707o(880);
            return t;
        }
        C106862S5w.LIZ(cls);
        Object obj2 = this.LIZJ.get(cls);
        if (obj2 != null) {
            T t2 = (T) obj2;
            MethodCollector.m14707o(880);
            return t2;
        }
        Iterator<T> it = this.LIZJ.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (LIZIZ((Class) obj, cls)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Class cls2 = (Class) obj;
        C2541b c2541b = this.f25599LJ;
        if (cls2 != null) {
            Object obj3 = this.LIZJ.get(cls2);
            if (obj3 != null) {
                T t3 = (T) obj3;
                MethodCollector.m14707o(880);
                return t3;
            }
            TypeCastException typeCastException = new TypeCastException("null cannot be cast to non-null type T");
            MethodCollector.m14707o(880);
            throw typeCastException;
        } else if (c2541b != null) {
            T t4 = (T) c2541b.LIZ(cls);
            MethodCollector.m14707o(880);
            return t4;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("not found " + cls);
            MethodCollector.m14707o(880);
            throw illegalStateException;
        }
    }

    public final synchronized <T extends AbstractC2543c> T LIZIZ(Class<T> cls) {
        Object obj;
        MethodCollector.m14708i(881);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            T t = (T) proxy.result;
            MethodCollector.m14707o(881);
            return t;
        }
        C106862S5w.LIZ(cls);
        Object obj2 = this.LIZJ.get(cls);
        if (obj2 != null) {
            T t2 = (T) obj2;
            MethodCollector.m14707o(881);
            return t2;
        }
        Iterator<T> it = this.LIZJ.keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (LIZIZ((Class) obj, cls)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Class cls2 = (Class) obj;
        C2541b c2541b = this.f25599LJ;
        if (cls2 != null) {
            Object obj3 = this.LIZJ.get(cls2);
            if (obj3 != null) {
                T t3 = (T) obj3;
                MethodCollector.m14707o(881);
                return t3;
            }
            TypeCastException typeCastException = new TypeCastException("null cannot be cast to non-null type T");
            MethodCollector.m14707o(881);
            throw typeCastException;
        } else if (c2541b != null) {
            T t4 = (T) c2541b.LIZIZ(cls);
            MethodCollector.m14707o(881);
            return t4;
        } else {
            MethodCollector.m14707o(881);
            return null;
        }
    }

    public final <T extends AbstractC2543c> void LIZ(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(t);
        if (this.LIZLLL) {
            return;
        }
        Class<?> cls = t.getClass();
        if (!Intrinsics.areEqual(cls, AbstractC2543c.class)) {
            for (Class<?> cls2 : this.LIZJ.keySet()) {
                if (!Intrinsics.areEqual(cls, cls2)) {
                    if (!LIZ(cls, cls2)) {
                        if (LIZIZ(cls, cls2)) {
                            throw new IllegalStateException(cls + " parent found " + cls2);
                        }
                    } else {
                        throw new IllegalStateException(cls + " child found " + cls2);
                    }
                } else {
                    throw new IllegalStateException(cls + " already register");
                }
            }
            this.LIZJ.put(cls, t);
            return;
        }
        throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
    }

    public /* synthetic */ C2541b(C2541b c2541b, int i) {
        this(null);
    }

    private final boolean LIZIZ(Class<?> cls, Class<?> cls2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, cls2}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZ(cls2, cls);
    }

    private final boolean LIZ(Class<?> cls, Class<?> cls2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, cls2}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (cls.isInterface()) {
            Class<?>[] interfaces = cls2.getInterfaces();
            Intrinsics.checkExpressionValueIsNotNull(interfaces, "");
            for (Class<?> cls3 : interfaces) {
                if (Intrinsics.areEqual(cls3, cls)) {
                    return true;
                }
                Intrinsics.checkExpressionValueIsNotNull(cls3, "");
                if (LIZ(cls, cls3)) {
                    return true;
                }
            }
            return false;
        }
        while (!Intrinsics.areEqual(cls2, Object.class)) {
            if (Intrinsics.areEqual(cls2, cls)) {
                return true;
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<*>");
            }
        }
        return false;
    }
}
