package com.bytedance.android.live.core.tetris.layer.view;

import com.bytedance.android.live.core.tetris.layer.core.descriptor.C4100c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.core.tetris.layer.view.b */
/* loaded from: classes12.dex */
public final class C4119b {
    public static ChangeQuickRedirect LIZ;
    public final List<C4100c> LIZIZ = new ArrayList();
    public final List<C4100c> LIZJ = new ArrayList();
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26196LJ;

    static {
        Covode.recordClassIndex(23743);
    }

    public final C4119b LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C4119b) proxy.result;
        }
        this.LIZLLL = true;
        if (!(true ^ this.LIZJ.isEmpty())) {
            return this;
        }
        throw new IllegalStateException("因为是 first，所以不能有 aboveList");
    }

    public final C4119b LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C4119b) proxy.result;
        }
        this.f26196LJ = true;
        if (!(true ^ this.LIZIZ.isEmpty())) {
            return this;
        }
        throw new IllegalStateException("因为是 last，所以不能有 belowList");
    }

    public final C4119b LIZ(C4100c c4100c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4100c}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C4119b) proxy.result;
        }
        C106862S5w.LIZ(c4100c);
        this.LIZJ.add(c4100c);
        if (!this.LIZLLL) {
            return this;
        }
        throw new IllegalStateException("因为是 first，所以不能有 aboveList");
    }
}
