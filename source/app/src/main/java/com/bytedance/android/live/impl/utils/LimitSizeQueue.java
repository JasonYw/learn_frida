package com.bytedance.android.live.impl.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import p003X.QMH;

/* loaded from: classes8.dex */
public final class LimitSizeQueue<E> extends LinkedList<E> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int limitSize;

    static {
        Covode.recordClassIndex(25037);
    }

    public LimitSizeQueue() {
        this(0, 1);
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public final int size() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.size();
    }

    public LimitSizeQueue(int i) {
        this.limitSize = i;
    }

    @Override // java.util.LinkedList, java.util.Deque, java.util.Queue
    public final boolean offer(E e) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{e}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return add(e);
    }

    @Override // java.util.LinkedList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque, java.util.Queue
    public final boolean add(E e) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{e}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!super.add(e)) {
            return false;
        }
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && size() > this.limitSize) {
            poll();
        }
        return true;
    }

    @Override // java.util.LinkedList, java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (E) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4);
        if (proxy2.isSupported) {
            return (E) proxy2.result;
        }
        return (E) super.remove(i);
    }

    public /* synthetic */ LimitSizeQueue(int i, int i2) {
        this(QMH.LIZIZ());
    }
}
