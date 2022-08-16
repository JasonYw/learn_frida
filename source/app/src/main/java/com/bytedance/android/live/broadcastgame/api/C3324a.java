package com.bytedance.android.live.broadcastgame.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C6D6;

/* renamed from: com.bytedance.android.live.broadcastgame.api.a */
/* loaded from: classes5.dex */
public final class C3324a implements C6D6 {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;

    static {
        Covode.recordClassIndex(19015);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Boolean.valueOf(this.LIZJ)};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3324a) {
            return C106862S5w.LIZ(((C3324a) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("AAMTextMessage:%s,%s", LIZIZ());
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.CHINA);
        new StringBuilder();
        return C0002O.m25085C(simpleDateFormat.format(new Date(this.LIZLLL)), ": ", this.LIZIZ);
    }

    public C3324a(String str, boolean z) {
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = System.currentTimeMillis();
    }

    public /* synthetic */ C3324a(String str, boolean z, int i) {
        this(str, false);
    }
}
