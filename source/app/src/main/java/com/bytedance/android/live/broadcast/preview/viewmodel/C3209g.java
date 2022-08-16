package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.C392771gt;

/* renamed from: com.bytedance.android.live.broadcast.preview.viewmodel.g */
/* loaded from: classes3.dex */
public final class C3209g {
    public static ChangeQuickRedirect LIZ;
    public final int LIZIZ;
    public final AbstractC3208f LIZJ;
    public final List<C3195i> LIZLLL;

    /* renamed from: LJ */
    public final Function0<Long> f25925LJ;
    public int LJFF;

    static {
        Covode.recordClassIndex(17486);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C392771gt.LIZ(this.LIZIZ);
    }

    public C3209g(int i, AbstractC3208f abstractC3208f, List<C3195i> list, Function0<Long> function0, int i2) {
        C106862S5w.LIZ(abstractC3208f, list, function0);
        this.LIZIZ = i;
        this.LIZJ = abstractC3208f;
        this.LIZLLL = list;
        this.f25925LJ = function0;
        this.LJFF = i2;
    }
}
