package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class HybridContainerClass {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Class<?> clazz;
    public final String clazzName;

    static {
        Covode.recordClassIndex(11283);
    }

    public HybridContainerClass() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ HybridContainerClass copy$default(HybridContainerClass hybridContainerClass, Class cls, String str, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{hybridContainerClass, cls, str, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (HybridContainerClass) proxy.result;
        }
        if ((i & 1) != 0) {
            cls = hybridContainerClass.clazz;
        }
        if ((i & 2) != 0) {
            str = hybridContainerClass.clazzName;
        }
        return hybridContainerClass.copy(cls, str);
    }

    private Object[] getObjects() {
        return new Object[]{this.clazz, this.clazzName};
    }

    public final Class<?> component1() {
        return this.clazz;
    }

    public final String component2() {
        return this.clazzName;
    }

    public final HybridContainerClass copy(Class<?> cls, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (HybridContainerClass) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new HybridContainerClass(cls, str);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof HybridContainerClass) {
            return C106862S5w.LIZ(((HybridContainerClass) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("HybridContainerClass:%s,%s", getObjects());
    }

    public final Class<?> getClazz() {
        return this.clazz;
    }

    public final String getClazzName() {
        return this.clazzName;
    }

    public HybridContainerClass(Class<?> cls, String str) {
        C106862S5w.LIZ(str);
        this.clazz = cls;
        this.clazzName = str;
    }

    public /* synthetic */ HybridContainerClass(Class cls, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cls, (i & 2) != 0 ? "" : str);
    }
}
