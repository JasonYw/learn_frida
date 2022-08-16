package com.bytedance.android.live.core.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.Collection;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class MaxSizeList<T> extends LinkedList<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int max = 10;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(23816);
        } else {
            Covode.recordClassIndex(23816);
        }
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        while (size() > this.max) {
            removeFirst();
        }
    }

    public MaxSizeList(int i) {
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public boolean add(T t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        boolean add = super.add(t);
        LIZ();
        return add;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends T> collection) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), collection}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        boolean addAll = super.addAll(i, collection);
        LIZ();
        return addAll;
    }
}
