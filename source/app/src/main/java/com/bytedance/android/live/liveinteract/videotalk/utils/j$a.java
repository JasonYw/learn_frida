package com.bytedance.android.live.liveinteract.videotalk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public final class j$a {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public int LIZJ;
    public float LIZLLL;

    /* renamed from: LJ */
    public float f26461LJ;

    static {
        Covode.recordClassIndex(30636);
    }

    public j$a() {
        this(0.0f, 0.0f, 3);
    }

    public final int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ(this.LIZIZ);
    }

    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ(this.LIZJ);
    }

    public static int LIZ(int i) {
        return i - (i % 16);
    }

    public j$a(float f, float f2) {
        this.LIZLLL = f;
        this.f26461LJ = f2;
    }

    public /* synthetic */ j$a(float f, float f2, int i) {
        this(0.0f, 0.0f);
    }
}
