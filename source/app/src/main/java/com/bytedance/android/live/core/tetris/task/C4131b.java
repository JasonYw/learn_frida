package com.bytedance.android.live.core.tetris.task;

import com.bytedance.android.live.core.tetris.task.c$d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC148095fTd;
import p003X.AbstractC148100fTi;
import p003X.C106862S5w;
import p003X.C148094fTc;
import p003X.C148096fTe;

/* renamed from: com.bytedance.android.live.core.tetris.task.b */
/* loaded from: classes20.dex */
public final class C4131b implements AbstractC148095fTd<AbstractC4129a> {
    public static ChangeQuickRedirect LIZ;

    /* renamed from: LJ */
    public final String f26199LJ;
    public final AbstractC148100fTi<C4131b> LJFF;
    public final C148096fTe<C4131b> LIZJ = new C148096fTe<>();
    public final HashMap<String, AbstractC4129a> LIZIZ = new HashMap<>();
    public final AbstractC148100fTi<AbstractC4129a> LIZLLL = new C148094fTc(this);

    static {
        Covode.recordClassIndex(23769);
    }

    @Override // com.bytedance.android.live.core.tetris.task.p325a.AbstractRunnableC4130a
    public final String LIZJ() {
        return this.f26199LJ;
    }

    @Override // com.bytedance.android.live.core.tetris.task.p325a.AbstractRunnableC4130a
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZJ.LIZIZ();
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C148096fTe<C4131b> c148096fTe = this.LIZJ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c148096fTe, C148096fTe.LIZ, false, 4);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        return Intrinsics.areEqual(c148096fTe.f19807LJ.LIZ(), c$d.C4136b.LIZ);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        HashMap<String, AbstractC4129a> hashMap = this.LIZIZ;
        if (!hashMap.isEmpty()) {
            for (Map.Entry<String, AbstractC4129a> entry : hashMap.entrySet()) {
                if (!entry.getValue().LIZ()) {
                    return;
                }
            }
        }
        LIZ(true);
    }

    /* renamed from: LJ */
    public final void m15788LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LIZJ.LIZ();
        if (this.LIZIZ.isEmpty()) {
            LIZ(true);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        for (Map.Entry<String, AbstractC4129a> entry : this.LIZIZ.entrySet()) {
            entry.getValue().LIZ(this.LIZLLL);
            entry.getValue().LIZIZ();
        }
    }

    private final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LIZJ.LIZ(true);
    }

    public C4131b(String str, AbstractC148100fTi<C4131b> abstractC148100fTi) {
        C106862S5w.LIZ(str, abstractC148100fTi);
        this.f26199LJ = str;
        this.LJFF = abstractC148100fTi;
        this.LIZJ.LIZ(this, this.LJFF);
    }
}
