package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmPageClass {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean auto;
    public final String btm;
    public final Class<?> clazz;
    public final String clazzName;
    public final boolean singleton;

    static {
        Covode.recordClassIndex(11275);
    }

    public static /* synthetic */ BtmPageClass copy$default(BtmPageClass btmPageClass, Class cls, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmPageClass, cls, str, str2, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (BtmPageClass) proxy.result;
        }
        if ((i & 1) != 0) {
            cls = btmPageClass.clazz;
        }
        if ((i & 2) != 0) {
            str = btmPageClass.clazzName;
        }
        if ((i & 4) != 0) {
            str2 = btmPageClass.btm;
        }
        if ((i & 8) != 0) {
            z = btmPageClass.auto;
        }
        if ((i & 16) != 0) {
            z2 = btmPageClass.singleton;
        }
        return btmPageClass.copy(cls, str, str2, z, z2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.clazz, this.clazzName, this.btm, Boolean.valueOf(this.auto), Boolean.valueOf(this.singleton)};
    }

    public final Class<?> component1() {
        return this.clazz;
    }

    public final String component2() {
        return this.clazzName;
    }

    public final String component3() {
        return this.btm;
    }

    public final boolean component4() {
        return this.auto;
    }

    public final boolean component5() {
        return this.singleton;
    }

    public final BtmPageClass copy(Class<?> cls, String str, String str2, boolean z, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls, str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (BtmPageClass) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new BtmPageClass(cls, str, str2, z, z2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof BtmPageClass) {
            return C106862S5w.LIZ(((BtmPageClass) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BtmPageClass:%s,%s,%s,%s,%s", getObjects());
    }

    public final boolean getAuto() {
        return this.auto;
    }

    public final String getBtm() {
        return this.btm;
    }

    public final Class<?> getClazz() {
        return this.clazz;
    }

    public final String getClazzName() {
        return this.clazzName;
    }

    public final boolean getSingleton() {
        return this.singleton;
    }

    public BtmPageClass(Class<?> cls, String str, String str2, boolean z, boolean z2) {
        C106862S5w.LIZ(str, str2);
        this.clazz = cls;
        this.clazzName = str;
        this.btm = str2;
        this.auto = z;
        this.singleton = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ BtmPageClass(java.lang.Class r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r5 = r11
            r2 = r8
            r4 = r10
            r0 = r12 & 2
            java.lang.String r3 = ""
            if (r0 == 0) goto La
            r2 = r3
        La:
            r0 = r12 & 4
            if (r0 != 0) goto Lf
            r3 = r9
        Lf:
            r0 = r12 & 8
            if (r0 == 0) goto L15
            r0 = 1
            r4 = 1
        L15:
            r0 = r12 & 16
            if (r0 == 0) goto L1b
            r0 = 0
            r5 = 0
        L1b:
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.btm.api.BtmPageClass.<init>(java.lang.Class, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
