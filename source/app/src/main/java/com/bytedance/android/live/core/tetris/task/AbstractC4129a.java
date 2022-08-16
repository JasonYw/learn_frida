package com.bytedance.android.live.core.tetris.task;

import com.bytedance.android.live.core.tetris.task.p325a.AbstractRunnableC4130a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC148100fTi;
import p003X.C106862S5w;
import p003X.C148096fTe;

/* renamed from: com.bytedance.android.live.core.tetris.task.a */
/* loaded from: classes20.dex */
public abstract class AbstractC4129a implements AbstractRunnableC4130a {
    public static ChangeQuickRedirect LIZ;
    public final C148096fTe<AbstractC4129a> LIZIZ = new C148096fTe<>();
    public final String LIZJ;

    static {
        Covode.recordClassIndex(23765);
    }

    @Override // com.bytedance.android.live.core.tetris.task.p325a.AbstractRunnableC4130a
    public final String LIZJ() {
        return this.LIZJ;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZIZ.LIZ();
    }

    @Override // com.bytedance.android.live.core.tetris.task.p325a.AbstractRunnableC4130a
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.LIZIZ();
    }

    public AbstractC4129a(String str) {
        C106862S5w.LIZ(str);
        this.LIZJ = str;
    }

    public final void LIZ(AbstractC148100fTi<AbstractC4129a> abstractC148100fTi) {
        if (PatchProxy.proxy(new Object[]{abstractC148100fTi}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC148100fTi);
        this.LIZIZ.LIZ(this, abstractC148100fTi);
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ.LIZ(z);
    }
}
