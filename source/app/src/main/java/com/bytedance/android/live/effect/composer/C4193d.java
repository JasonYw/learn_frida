package com.bytedance.android.live.effect.composer;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.effect.composer.d */
/* loaded from: classes5.dex */
public final class C4193d {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26222LJ;
    public final boolean LJFF;
    public long LJI;
    public final List<Integer> LJII = new ArrayList();
    public final List<C4197i> LJIIIIZZ = new ArrayList();
    public boolean LJIIIZ;
    public boolean LJIIJ;

    static {
        Covode.recordClassIndex(24475);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LiveComposerNode(panel='" + this.LIZIZ + "', effectId='" + this.LIZJ + "', resourceId='" + this.LIZLLL + "', path='" + this.f26222LJ + "', isWithoutFace=" + this.LJFF + ", updateTime=" + this.LJI + ", coexistGroup=" + this.LJII + ", tagList=" + this.LJIIIIZZ + ", use=" + this.LJIIIZ + LoggerUtil.S_RIGHT_TAG;
    }

    public C4193d(C4193d c4193d) {
        C106862S5w.LIZ(c4193d);
        this.LIZIZ = c4193d.LIZIZ;
        this.LIZJ = c4193d.LIZJ;
        this.LIZLLL = c4193d.LIZLLL;
        this.f26222LJ = c4193d.f26222LJ;
        this.LJFF = c4193d.LJFF;
        this.LJI = c4193d.LJI;
        this.LJIIIZ = c4193d.LJIIIZ;
        this.LJII.addAll(c4193d.LJII);
        this.LJIIIIZZ.addAll(c4193d.LJIIIIZZ);
    }

    public C4193d(String str, String str2, String str3, String str4, boolean z, long j) {
        C106862S5w.LIZ(str, str2, str3, str4);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.f26222LJ = str4;
        this.LJFF = z;
        this.LJI = j;
    }
}
