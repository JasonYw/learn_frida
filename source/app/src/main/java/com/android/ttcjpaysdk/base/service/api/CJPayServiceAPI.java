package com.android.ttcjpaysdk.base.service.api;

import android.text.TextUtils;
import android.util.Pair;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayPerformanceService;
import com.android.ttcjpaysdk.base.service.ICJPayService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;
import p002O.C0002O;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class CJPayServiceAPI {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6543);
    }

    /* loaded from: classes26.dex */
    public static class ProxyService implements ICJPayService, InvocationHandler {
        public static ChangeQuickRedirect changeQuickRedirect;
        public Object service;

        static {
            Covode.recordClassIndex(6544);
        }

        /* renamed from: com_android_ttcjpaysdk_base_service_api_CJPayServiceAPI$ProxyService_java_lang_reflect_Method_invoke */
        public static Object m16063x79a602cb(Method method, Object obj, Object[] objArr) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{method, obj, objArr}, null, changeQuickRedirect, true, 3);
            if (proxy.isSupported) {
                return proxy.result;
            }
            ActionInvokeEntrance.setEventUuid(110000);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_android_ttcjpaysdk_base_service_api_CJPayServiceAPI$ProxyService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            if (((Boolean) actionIntercept.first).booleanValue()) {
                return actionIntercept.second;
            }
            Object invoke = method.invoke(obj, objArr);
            ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_android_ttcjpaysdk_base_service_api_CJPayServiceAPI$ProxyService_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
            return invoke;
        }

        @Override // com.android.ttcjpaysdk.base.service.ICJPayService
        public String getPackageName() {
            return null;
        }

        public ProxyService(Object obj) {
            this.service = obj;
        }

        private boolean isNeedReportMethod(Object obj, Method method) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, method}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (obj != null && method != null) {
                try {
                    Method declaredMethod = obj.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
                    declaredMethod.setAccessible(true);
                    if (((CJPayModuleEntryReport) declaredMethod.getAnnotation(CJPayModuleEntryReport.class)) != null) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, method, objArr}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            ICJPayPerformanceService iCJPayPerformanceService = (ICJPayPerformanceService) CJPayServiceManager.getInstance().getIService(ICJPayPerformanceService.class);
            if (iCJPayPerformanceService != null && (obj2 = this.service) != null && (obj2 instanceof ICJPayService)) {
                String packageName = ((ICJPayService) obj2).getPackageName();
                if (!TextUtils.isEmpty(packageName) && isNeedReportMethod(this.service, method)) {
                    iCJPayPerformanceService.initModule(packageName);
                }
            }
            return m16063x79a602cb(method, this.service, objArr);
        }
    }

    public static void init(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        try {
            Class LIZ = C116971W2r.LIZ("com.android.ttcjpaysdk.base.service.CJPayService$$Index");
            LIZ.getDeclaredMethod("initService", Map.class).invoke(LIZ, obj);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static Object getCJPayService(Map map, Class cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map, cls}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object obj = map.get(cls);
        if (obj != null) {
            return obj;
        }
        try {
            Class LIZ = C116971W2r.LIZ(C0002O.m25085C("com.android.ttcjpaysdk.base.service.", cls.getSimpleName(), "$$CJPayService$$Index"));
            LIZ.getDeclaredMethod("initService", Map.class).invoke(LIZ, map);
            Object obj2 = map.get(cls);
            if (obj2 == null) {
                return null;
            }
            if (CJPayServiceManager.getInstance().getIService(ICJPayPerformanceService.class) != null && !(obj2 instanceof ICJPayPerformanceService)) {
                Object LIZ2 = C116971W2r.LIZ(obj2.getClass().getClassLoader(), obj2.getClass().getInterfaces(), new ProxyService(obj2));
                map.put(cls, LIZ2);
                return LIZ2;
            }
            return obj2;
        } catch (Exception unused) {
            return null;
        }
    }
}
