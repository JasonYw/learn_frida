package com.bytedance.android.live.liveinteract.bid.p344ui;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.bid.ui.c$a */
/* loaded from: classes3.dex */
public final class c$a {
    public static ChangeQuickRedirect LIZ;
    public final ImageModel LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;

    /* renamed from: LJ */
    public final Long f26262LJ;
    public final String LJFF;

    static {
        Covode.recordClassIndex(25268);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26262LJ, this.LJFF};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c$a) {
            return C106862S5w.LIZ(((c$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BidTopUserViewBinder$BidTopUserData:%s,%s,%s,%s,%s", LIZ());
    }

    public c$a(ImageModel imageModel, String str, Long l, Long l2, String str2) {
        this.LIZIZ = imageModel;
        this.LIZJ = str;
        this.LIZLLL = l;
        this.f26262LJ = l2;
        this.LJFF = str2;
    }
}
