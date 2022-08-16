package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes23.dex */
public final class KotlinExtKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3430);
    }

    public static final String getOrDefault(String str) {
        return str == null ? "" : str;
    }

    public static final <T> List<T> getOrDefault(List<? extends T> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        if (list == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        return list;
    }

    public static final double getOrDefault(Double d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{d}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return ((Double) proxy.result).doubleValue();
        }
        if (d != null) {
            return d.doubleValue();
        }
        return 0.0d;
    }

    public static final double toDoubleOrDefault(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Double) proxy.result).doubleValue();
        }
        if (l != null) {
            return l.longValue();
        }
        return 0.0d;
    }

    public static final float toFloatOrDefault(Double d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{d}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (d != null) {
            return (float) d.doubleValue();
        }
        return 0.0f;
    }

    public static final int toIntOrDefault(Double d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{d}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (d == null) {
            return 0;
        }
        return (int) d.doubleValue();
    }

    public static final float getOrDefault(Float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{f}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        if (f != null) {
            return f.floatValue();
        }
        return 0.0f;
    }

    public static final int toIntOrDefault(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (l == null) {
            return 0;
        }
        return (int) l.longValue();
    }

    public static final int getOrDefault(Integer num) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static final long getOrDefault(Long l) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{l}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static final boolean getOrDefault(Boolean bool) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bool}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
