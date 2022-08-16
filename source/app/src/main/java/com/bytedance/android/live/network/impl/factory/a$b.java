package com.bytedance.android.live.network.impl.factory;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.reflect.Type;
import p003X.C102263QOz;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class a$b {
    public static ChangeQuickRedirect LIZ;
    public static final Class<Object> LJFF;
    public static final C102263QOz LJI;
    public final Class<?> LIZIZ;
    public final Type LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public final boolean f26523LJ;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(32664);
        LJI = new C102263QOz((byte) 0);
        LJFF = Object.class;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(32664);
        LJI = new C102263QOz((byte) 0);
        LJFF = Object.class;
    }

    public final a$b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (a$b) proxy.result;
        }
        if (this.f26523LJ) {
            return this;
        }
        throw new IllegalStateException(("failed to resolve type parameter at " + this.LIZLLL).toString());
    }

    public a$b(Class<?> cls, Type type, int i, boolean z) {
        C106862S5w.LIZ(cls, type);
        this.LIZIZ = cls;
        this.LIZJ = type;
        this.LIZLLL = i;
        this.f26523LJ = z;
    }
}
