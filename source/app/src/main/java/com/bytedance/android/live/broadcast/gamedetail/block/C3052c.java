package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.viewpager.AbstractC13027b;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.c */
/* loaded from: classes5.dex */
public final class C3052c implements AbstractC13027b {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    static {
        Covode.recordClassIndex(16177);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof C3052c) {
                C3052c c3052c = (C3052c) obj;
                if (!Intrinsics.areEqual(LIZ(), c3052c.LIZ()) || !Intrinsics.areEqual(LIZIZ(), c3052c.LIZIZ()) || !Intrinsics.areEqual(this.LIZIZ, c3052c.LIZIZ)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String LIZ2 = LIZ();
        int hashCode = (LIZ2 != null ? LIZ2.hashCode() : 0) * 31;
        String LIZIZ = LIZIZ();
        int hashCode2 = (hashCode + (LIZIZ != null ? LIZIZ.hashCode() : 0)) * 31;
        String str = this.LIZIZ;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C0002O.m25081C("GameTabInfo(tabId=", LIZ(), ", tabName=", LIZIZ(), ", tabType=", this.LIZIZ, ")");
    }

    @Override // com.bytedance.ies.viewpager.AbstractC13027b
    public final String LIZ() {
        return this.LIZJ;
    }

    @Override // com.bytedance.ies.viewpager.AbstractC13027b
    public final String LIZIZ() {
        return this.LIZLLL;
    }

    public C3052c(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LIZIZ = str3;
    }
}
