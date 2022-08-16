package com.bytedance.android.live.liveinteract.p382pk.task.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.Future;
import p003X.C106862S5w;
import p003X.R07;

/* renamed from: com.bytedance.android.live.liveinteract.pk.task.api.g$a */
/* loaded from: classes3.dex */
public final class g$a implements Runnable {
    public static ChangeQuickRedirect LIZ;
    public Future<?> LIZIZ;
    public final R07<?, ?> LIZJ;
    public final Runnable LIZLLL;

    static {
        Covode.recordClassIndex(29069);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZLLL.run();
    }

    public g$a(R07<?, ?> r07, Runnable runnable) {
        C106862S5w.LIZ(r07, runnable);
        this.LIZJ = r07;
        this.LIZLLL = runnable;
    }
}
