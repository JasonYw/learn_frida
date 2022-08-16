package com.bytedance.android.live.liveinteract.bid.p344ui;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.bid.ui.a$a */
/* loaded from: classes3.dex */
public final class a$a {
    public static ChangeQuickRedirect LIZ;
    public final ImageModel LIZIZ;
    public final String LIZJ;
    public final Long LIZLLL;

    /* renamed from: LJ */
    public final Long f26260LJ;
    public final String LJFF;
    public final boolean LJI;

    static {
        Covode.recordClassIndex(25261);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26260LJ, this.LJFF, Boolean.valueOf(this.LJI)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a$a) {
            return C106862S5w.LIZ(((a$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("BidHistoryUserViewBinder$BidHistoryUserData:%s,%s,%s,%s,%s,%s", LIZ());
    }

    public a$a(ImageModel imageModel, String str, Long l, Long l2, String str2, boolean z) {
        this.LIZIZ = imageModel;
        this.LIZJ = str;
        this.LIZLLL = l;
        this.f26260LJ = l2;
        this.LJFF = str2;
        this.LJI = z;
    }
}
