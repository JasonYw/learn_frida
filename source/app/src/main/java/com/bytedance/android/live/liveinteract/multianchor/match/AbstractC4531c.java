package com.bytedance.android.live.liveinteract.multianchor.match;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C79662Hai;
import p003X.C79663Haj;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.match.c */
/* loaded from: classes3.dex */
public abstract class AbstractC4531c {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    static {
        Covode.recordClassIndex(28117);
    }

    public abstract String LIZ();

    public final boolean LIZJ() {
        return this instanceof C79663Haj;
    }

    public final boolean LIZLLL() {
        return this instanceof C79662Hai;
    }

    public final boolean LIZIZ() {
        if (this.LIZIZ && !this.LIZLLL) {
            return true;
        }
        return false;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LIZ();
    }

    public AbstractC4531c(boolean z, boolean z2, boolean z3) {
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }

    public /* synthetic */ AbstractC4531c(boolean z, boolean z2, boolean z3, byte b) {
        this(z, z2, z3);
    }
}
