package com.bytedance.als;

import com.bytedance.als.p196ui.Visibility;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.NY6;

/* renamed from: com.bytedance.als.e */
/* loaded from: classes9.dex */
public final class C2544e {
    public static ChangeQuickRedirect LIZ;
    public final Class<NY6<?>> LIZIZ;
    public final AttachOption LIZJ;
    public final Class<?> LIZLLL;

    /* renamed from: LJ */
    public final int f25600LJ;
    public final Visibility LJFF;

    static {
        Covode.recordClassIndex(10050);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, Integer.valueOf(this.f25600LJ), this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2544e) {
            return C106862S5w.LIZ(((C2544e) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("ComponentInfo:%s,%s,%s,%s,%s", LIZ());
    }

    public C2544e(Class<NY6<?>> cls, AttachOption attachOption, Class<?> cls2, int i, Visibility visibility) {
        C106862S5w.LIZ(cls, attachOption);
        this.LIZIZ = cls;
        this.LIZJ = attachOption;
        this.LIZLLL = cls2;
        this.f25600LJ = i;
        this.LJFF = visibility;
    }
}
