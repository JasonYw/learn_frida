package com.bytedance.android.live.core.tetris.layer.core.descriptor;

import com.bytedance.android.live.core.tetris.layer.AbstractC4092b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import p003X.AbstractC411282Pq;

/* loaded from: classes12.dex */
public final class LayerDescriptorList extends ArrayList<AbstractC411282Pq<? extends AbstractC4092b>> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23657);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof AbstractC411282Pq)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.contains(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!(obj instanceof AbstractC411282Pq)) {
            return -1;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 7);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.indexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!(obj instanceof AbstractC411282Pq)) {
            return -1;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 9);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return super.lastIndexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!(obj instanceof AbstractC411282Pq)) {
            return false;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return super.remove(obj);
    }
}
