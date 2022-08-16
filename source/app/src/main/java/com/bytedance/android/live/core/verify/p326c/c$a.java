package com.bytedance.android.live.core.verify.p326c;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.live.core.verify.utils.a$d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.QIT;

/* renamed from: com.bytedance.android.live.core.verify.c.c$a */
/* loaded from: classes8.dex */
public final class c$a {
    public static ChangeQuickRedirect LIZ;
    public Context LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f26201LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public String LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public a$d LJIILJJIL;
    public boolean LJIILL;
    public Map<String, String> LJIJI;
    public Map<String, String> LJIJJ;
    public String LJIIJ = "0";
    public String LJIILLIIL = "";
    public int LJIIZILJ = 1;
    public Bundle LJIJ = new Bundle();

    static {
        Covode.recordClassIndex(24169);
    }

    public final QIT LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (QIT) proxy.result;
        }
        return new QIT(this, (byte) 0);
    }

    public final c$a LIZ(Context context) {
        this.LIZIZ = context;
        return this;
    }

    public final c$a LIZIZ(String str) {
        this.LIZLLL = str;
        return this;
    }

    public final c$a LIZJ(String str) {
        this.f26201LJ = str;
        return this;
    }

    public final c$a LIZLLL(String str) {
        this.LJIIIIZZ = str;
        return this;
    }

    /* renamed from: LJ */
    public final c$a m15787LJ(String str) {
        this.LJIIJJI = str;
        return this;
    }

    public final c$a LIZ(Bundle bundle) {
        this.LJIJ = bundle;
        return this;
    }

    public final c$a LIZIZ(boolean z) {
        this.LJIIIZ = z;
        return this;
    }

    public final c$a LIZJ(boolean z) {
        this.LJIILL = z;
        return this;
    }

    public final c$a LIZ(a$d a_d) {
        this.LJIILJJIL = a_d;
        return this;
    }

    public final c$a LIZ(String str) {
        this.LIZJ = str;
        return this;
    }

    public final c$a LIZ(Map<String, String> map) {
        this.LJIJI = map;
        return this;
    }

    public final c$a LIZ(boolean z) {
        this.LJII = z;
        return this;
    }
}
