package com.bytedance.android.live.core.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes12.dex */
public final class LruHashMap<K, V> extends LinkedHashMap<K, V> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int capacity;

    static {
        Covode.recordClassIndex(23385);
    }

    public LruHashMap(int i) {
        super(i, 0.75f, true);
        this.capacity = i;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{entry}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (size() > this.capacity) {
            return true;
        }
        return false;
    }
}
