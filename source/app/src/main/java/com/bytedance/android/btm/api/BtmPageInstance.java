package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmPageInstance {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean auto;
    public final String btm;
    public final WeakReference<Object> pageRef;
    public final boolean singleton;

    static {
        Covode.recordClassIndex(11276);
    }

    public static /* synthetic */ BtmPageInstance copy$default(BtmPageInstance btmPageInstance, WeakReference weakReference, String str, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmPageInstance, weakReference, str, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (BtmPageInstance) proxy.result;
        }
        if ((i & 1) != 0) {
            weakReference = btmPageInstance.pageRef;
        }
        if ((i & 2) != 0) {
            str = btmPageInstance.btm;
        }
        if ((i & 4) != 0) {
            z = btmPageInstance.auto;
        }
        if ((i & 8) != 0) {
            z2 = btmPageInstance.singleton;
        }
        return btmPageInstance.copy(weakReference, str, z, z2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.pageRef, this.btm, Boolean.valueOf(this.auto), Boolean.valueOf(this.singleton)};
    }

    public final WeakReference<Object> component1() {
        return this.pageRef;
    }

    public final String component2() {
        return this.btm;
    }

    public final boolean component3() {
        return this.auto;
    }

    public final boolean component4() {
        return this.singleton;
    }

    public final BtmPageInstance copy(WeakReference<Object> weakReference, String str, boolean z, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{weakReference, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BtmPageInstance) proxy.result;
        }
        C106862S5w.LIZ(weakReference, str);
        return new BtmPageInstance(weakReference, str, z, z2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtmPageInstance) {
            return C106862S5w.LIZ(((BtmPageInstance) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BtmPageInstance:%s,%s,%s,%s", getObjects());
    }

    public final boolean getAuto() {
        return this.auto;
    }

    public final String getBtm() {
        return this.btm;
    }

    public final WeakReference<Object> getPageRef() {
        return this.pageRef;
    }

    public final boolean getSingleton() {
        return this.singleton;
    }

    public final PageProp getProp() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (PageProp) proxy.result;
        }
        return new PageProp(this.btm, this.auto, this.singleton);
    }

    public BtmPageInstance(WeakReference<Object> weakReference, String str, boolean z, boolean z2) {
        C106862S5w.LIZ(weakReference, str);
        this.pageRef = weakReference;
        this.btm = str;
        this.auto = z;
        this.singleton = z2;
    }

    public /* synthetic */ BtmPageInstance(WeakReference weakReference, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
    }
}
