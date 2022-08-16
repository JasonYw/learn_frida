package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.MapsKt__MapsKt;
import p003X.C433723Dy;

/* loaded from: classes12.dex */
public final class InteractItemGroupProperty extends HashMap<String, C3373ae> {
    public static final C433723Dy Companion = new C433723Dy((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19149);
    }

    @Override // java.util.HashMap, java.util.AbstractMap
    /* renamed from: LIZ */
    public final InteractItemGroupProperty clone() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (InteractItemGroupProperty) proxy.result;
        }
        Map map = MapsKt__MapsKt.toMap(this);
        InteractItemGroupProperty interactItemGroupProperty = new InteractItemGroupProperty();
        for (Map.Entry entry : map.entrySet()) {
            interactItemGroupProperty.put(entry.getKey(), entry.getValue());
        }
        return interactItemGroupProperty;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, C3373ae>> entrySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<C3373ae> values() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (Collection) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20);
        if (proxy2.isSupported) {
            return (Collection) proxy2.result;
        }
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof String)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 8);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof C3373ae)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 10);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsValue(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 12);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.remove(obj);
    }

    public final String LIZ(long j) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C3373ae c3373ae = (C3373ae) get(String.valueOf(j));
        if (c3373ae == null || (str = c3373ae.LIZ) == null) {
            return "";
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof String)) {
            return obj2;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 14);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof String) || !(obj2 instanceof C3373ae)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 6);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.remove(obj, obj2);
    }
}
