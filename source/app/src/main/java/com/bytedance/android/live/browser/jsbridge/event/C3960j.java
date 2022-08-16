package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.umeng.analytics.pro.C33764r;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.j */
/* loaded from: classes17.dex */
public final class C3960j {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26140LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;

    static {
        Covode.recordClassIndex(22307);
    }

    public C3960j() {
        this(null, null, null, null, null, null, null, null, null, null, 1023);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26140LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3960j) {
            return C106862S5w.LIZ(((C3960j) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenCommentPanelAtUserParam:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C3960j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f26140LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJII = str7;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
    }

    public /* synthetic */ C3960j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i) {
        this(C33764r.f42396f, "", LoggerUtil.UNKNOWN, "", "", "", "", "", "", "");
    }
}
