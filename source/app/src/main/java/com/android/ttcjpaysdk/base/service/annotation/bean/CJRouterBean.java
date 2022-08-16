package com.android.ttcjpaysdk.base.service.annotation.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJRouterBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Class targetClz;
    public Type type;

    static {
        Covode.recordClassIndex(6539);
    }

    public CJRouterBean() {
    }

    /* loaded from: classes17.dex */
    public enum Type {
        ACTIVITY,
        FRAGMENT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Type[]) proxy.result;
            }
            return (Type[]) values().clone();
        }

        static {
            Covode.recordClassIndex(6540);
        }

        public static Type valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Type) proxy.result;
            }
            return (Type) Enum.valueOf(Type.class, str);
        }
    }

    public CJRouterBean(Type type, Class<?> cls) {
        this.type = type;
        this.targetClz = cls;
    }

    public static CJRouterBean create(Type type, Class<?> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{type, cls}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (CJRouterBean) proxy.result;
        }
        return new CJRouterBean(type, cls);
    }
}
