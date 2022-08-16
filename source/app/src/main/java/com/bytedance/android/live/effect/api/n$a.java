package com.bytedance.android.live.effect.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.KAT;
import p003X.KCT;

/* loaded from: classes5.dex */
public class n$a {
    public static ChangeQuickRedirect LIZ;
    public List<C4167a> LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;

    /* renamed from: LJ */
    public KCT f26211LJ;
    public boolean LJFF;

    static {
        Covode.recordClassIndex(24322);
    }

    public final KAT LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (KAT) proxy.result;
        }
        return new KAT(this);
    }

    public final n$a LIZ(KCT kct) {
        this.f26211LJ = kct;
        return this;
    }

    public final n$a LIZIZ(List<String> list) {
        this.LIZLLL = list;
        return this;
    }

    public final n$a LIZ(List<String> list) {
        this.LIZJ = list;
        return this;
    }
}
