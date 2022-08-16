package com.bytedance.android.lightreplace;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class ReplaceHolder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final Map<Method, C2771a> sReplaceMethods = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.lightreplace.ReplaceHolder$a */
    /* loaded from: classes2.dex */
    public interface AbstractC2770a {
        static {
            Covode.recordClassIndex(13782);
        }

        Object onReplaceMethodInvoke(Method method, Object obj, Object[] objArr);
    }

    public static native Object nativeInvokeOriginMethod(Method method, Class<?>[] clsArr, Class<?> cls, Object obj, Object[] objArr);

    public static native synchronized void nativeReplaceMethod(Object obj);

    static {
        Covode.recordClassIndex(13781);
        slotOfReplaceMethodError(false);
        C116971W2r.LIZIZ("lightreplace");
    }

    public static ReplaceMethodError slotOfReplaceMethodError(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (ReplaceMethodError) proxy.result;
        }
        return new ReplaceMethodError();
    }

    public static void registerHandler(Map<Method, AbstractC2770a> map) {
        MethodCollector.m14708i(1179);
        if (PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 1).isSupported) {
            MethodCollector.m14707o(1179);
            return;
        }
        for (Map.Entry<Method, AbstractC2770a> entry : map.entrySet()) {
            Method key = entry.getKey();
            AbstractC2770a value = entry.getValue();
            if (key != null) {
                C2771a c2771a = sReplaceMethods.get(key);
                if (c2771a == null) {
                    nativeReplaceMethod(key);
                    c2771a = new C2771a(key);
                    sReplaceMethods.put(key, c2771a);
                }
                if (!PatchProxy.proxy(new Object[]{value}, c2771a, C2771a.LIZ, false, 1).isSupported) {
                    c2771a.LIZLLL.add(value);
                }
            }
        }
        MethodCollector.m14707o(1179);
    }

    public static Object invokeOriginMethod(Method method, Object obj, Object[] objArr) {
        Class<?>[] parameterTypes;
        Class<?> returnType;
        MethodCollector.m14708i(1180);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{method, obj, objArr}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            Object obj2 = proxy.result;
            MethodCollector.m14707o(1180);
            return obj2;
        }
        C2771a c2771a = sReplaceMethods.get(method);
        if (c2771a != null) {
            parameterTypes = c2771a.LIZIZ;
            returnType = c2771a.LIZJ;
        } else {
            parameterTypes = method.getParameterTypes();
            returnType = method.getReturnType();
        }
        Object nativeInvokeOriginMethod = nativeInvokeOriginMethod(method, parameterTypes, returnType, obj, objArr);
        MethodCollector.m14707o(1180);
        return nativeInvokeOriginMethod;
    }

    public static Object replaceHandler(Method method, Object obj, Object[] objArr) {
        AbstractC2770a abstractC2770a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{method, obj, objArr}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2771a c2771a = sReplaceMethods.get(method);
        if (c2771a == null) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c2771a, C2771a.LIZ, false, 2);
        if (proxy2.isSupported) {
            abstractC2770a = (AbstractC2770a) proxy2.result;
        } else {
            if (!c2771a.LIZLLL.isEmpty()) {
                abstractC2770a = c2771a.LIZLLL.get(c2771a.LIZLLL.size() - 1);
            }
            return null;
        }
        if (abstractC2770a != null) {
            return abstractC2770a.onReplaceMethodInvoke(method, obj, objArr);
        }
        return null;
    }
}
