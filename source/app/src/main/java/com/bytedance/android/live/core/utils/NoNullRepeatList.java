package com.bytedance.android.live.core.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes12.dex */
public class NoNullRepeatList<T> extends CopyOnWriteArrayList<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23821);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean add(T t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (t == null || contains(t)) {
            return false;
        }
        return super.add(t);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{collection}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        for (T t : collection) {
            add(t);
        }
        return true;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj == null) {
            return false;
        }
        return super.remove(obj);
    }
}
