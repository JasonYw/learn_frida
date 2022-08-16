package com.bytedance.android.live.core.tetris.layer.core.element;

import com.bytedance.android.live.core.tetris.layer.core.descriptor.AbstractC4099b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p003X.C2R8;

/* loaded from: classes12.dex */
public final class ElementBuilderMap extends HashMap<Class<? extends AbstractC4099b>, C2R8<? extends AbstractC4099b>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23673);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<Class<? extends AbstractC4099b>, C2R8<? extends AbstractC4099b>>> entrySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.entrySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Class<? extends AbstractC4099b>> keySet() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (Set) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy2.isSupported) {
            return (Set) proxy2.result;
        }
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.size();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<C2R8<? extends AbstractC4099b>> values() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (Collection) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy2.isSupported) {
            return (Collection) proxy2.result;
        }
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof Class)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsKey(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof C2R8)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 7);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.containsValue(obj);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2R8<? extends com.bytedance.android.live.core.tetris.layer.core.descriptor.b>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2R8<? extends com.bytedance.android.live.core.tetris.layer.core.descriptor.b>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2R8<? extends com.bytedance.android.live.core.tetris.layer.core.descriptor.b>, java.lang.Object] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final C2R8<? extends AbstractC4099b> get(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof Class)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 9);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.get(obj);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.2R8<? extends com.bytedance.android.live.core.tetris.layer.core.descriptor.b>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.2R8<? extends com.bytedance.android.live.core.tetris.layer.core.descriptor.b>, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2R8<? extends com.bytedance.android.live.core.tetris.layer.core.descriptor.b>, java.lang.Object] */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final C2R8<? extends AbstractC4099b> remove(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof Class)) {
            return null;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(obj instanceof Class)) {
            return obj2;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 11);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        return super.getOrDefault(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof Class) || !(obj2 instanceof C2R8)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj, obj2}, this, changeQuickRedirect, false, 3);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.remove(obj, obj2);
    }
}
