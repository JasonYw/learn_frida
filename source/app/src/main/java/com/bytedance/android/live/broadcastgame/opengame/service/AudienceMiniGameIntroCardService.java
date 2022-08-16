package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3397a;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3799p;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC88224KpW;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C88098KnU;
import p003X.View$OnClickListenerC87648KgE;
import p003X.View$OnClickListenerC87808Kio;

/* loaded from: classes5.dex */
public final class AudienceMiniGameIntroCardService implements AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public C88098KnU<C3397a> LIZIZ;
    public long LIZLLL;

    /* renamed from: LJ */
    public C3397a f26083LJ;
    public C3682x LJI;
    public final C3799p LJFF = new C3799p();
    public CompositeDisposable LIZJ = new CompositeDisposable();

    static {
        Covode.recordClassIndex(20967);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported;
    }

    public final C3682x LIZ() {
        return this.LJI;
    }

    private final boolean LIZJ() {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        DataCenter dataCenter = LIZ().f26082LJ;
        if (dataCenter != null) {
            obj = dataCenter.get("cmd_commerce_ad_show", (String) Boolean.FALSE);
        } else {
            obj = null;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE);
    }

    public AudienceMiniGameIntroCardService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LJI = c3682x;
    }

    private final C88098KnU<C3397a> LIZIZ(C3397a c3397a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3397a}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (C88098KnU) proxy.result;
        }
        C88098KnU<C3397a> c88098KnU = new C88098KnU<>(LIZ().LIZLLL, LIZ().LJIIIIZZ());
        c88098KnU.LIZ(99, (int) c3397a);
        c88098KnU.LIZ(new View$OnClickListenerC87648KgE(this, c3397a));
        c88098KnU.LIZIZ(new View$OnClickListenerC87808Kio(this, c3397a));
        return c88098KnU;
    }

    public final void LIZ(C3397a c3397a) {
        long j;
        long j2;
        AbstractC413392Xt<AbstractC88224KpW<C6532d>> LJJIIJ;
        if (PatchProxy.proxy(new Object[]{c3397a}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3397a);
        if (c3397a.LJIIJJI > 1 || LIZJ()) {
            return;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, LIZ().f26082LJ, 0L, 2, null);
        if (LIZ2 != null && (LJJIIJ = LIZ2.LJJIIJ()) != null) {
            LJJIIJ.LIZ(new AudienceMiniGameIntroCardService$showCard$1(this));
        }
        this.LIZIZ = LIZIZ(c3397a);
        Long l = c3397a.LJIIJ;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 10;
        }
        C88098KnU<C3397a> c88098KnU = this.LIZIZ;
        if (c88098KnU == null) {
            return;
        }
        if (c3397a.LJIIL) {
            j2 = JsBridgeDelegate.GET_URL_OUT_TIME;
        } else {
            j2 = 0;
        }
        C3799p.LIZ(this.LJFF, 0L, 1, null);
        this.LJFF.LIZ("load", new AudienceMiniGameIntroCardService$showCard$2(this, c88098KnU, j2, c3397a, j));
    }

    private void LIZ(boolean z, boolean z2) {
        C88098KnU<C3397a> c88098KnU;
        AbstractC413392Xt<AbstractC88224KpW<C6532d>> LJJIIJ;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported || (c88098KnU = this.LIZIZ) == null) {
            return;
        }
        this.LIZJ.clear();
        if (c88098KnU.LIZJ) {
            this.LJFF.LIZ("隐藏卡片动画", new AudienceMiniGameIntroCardService$hideCard$1(c88098KnU, z2)).LIZ("dismiss widget", new AudienceMiniGameIntroCardService$hideCard$2(this, c88098KnU, z));
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, LIZ().f26082LJ, 0L, 2, null);
            if (LIZ2 != null && (LJJIIJ = LIZ2.LJJIIJ()) != null) {
                LJJIIJ.LIZ(new AudienceMiniGameIntroCardService$hideCard$3(this));
            }
        }
        this.LJFF.LIZ("unload widget", new AudienceMiniGameIntroCardService$hideCard$4(c88098KnU));
    }

    public static /* synthetic */ void LIZ(AudienceMiniGameIntroCardService audienceMiniGameIntroCardService, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{audienceMiniGameIntroCardService, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), null}, null, LIZ, true, 3).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        audienceMiniGameIntroCardService.LIZ(z, z2);
    }
}
