package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.x */
/* loaded from: classes5.dex */
public final class C3388x {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    /* renamed from: LJ */
    public final boolean f26028LJ;

    static {
        Covode.recordClassIndex(19214);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof C3388x) {
                C3388x c3388x = (C3388x) obj;
                if (!Intrinsics.areEqual(this.LIZIZ, c3388x.LIZIZ) || this.LIZJ != c3388x.LIZJ || this.LIZLLL != c3388x.LIZLLL || this.f26028LJ != c3388x.f26028LJ) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String str = this.LIZIZ;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = i * 31;
        boolean z = this.LIZJ;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i2 + i3) * 31;
        boolean z2 = this.LIZLLL;
        if (z2) {
            z2 = true;
        }
        int i6 = z2 ? 1 : 0;
        int i7 = z2 ? 1 : 0;
        int i8 = (i5 + i6) * 31;
        boolean z3 = this.f26028LJ;
        if (z3) {
            z3 = true;
        }
        int i9 = z3 ? 1 : 0;
        int i10 = z3 ? 1 : 0;
        return i8 + i9;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "id:" + this.LIZIZ + LoggerUtil.BLANK_TAG + "reload:" + this.LIZJ + LoggerUtil.BLANK_TAG + "addRecentUsed:" + this.LIZLLL + LoggerUtil.BLANK_TAG + "runningState:" + this.f26028LJ;
    }

    public C3388x(String str, boolean z, boolean z2, boolean z3) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.f26028LJ = z3;
    }

    public /* synthetic */ C3388x(String str, boolean z, boolean z2, boolean z3, int i) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
