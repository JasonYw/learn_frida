package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.android.live.broadcastgame.C3867r;
import com.bytedance.android.live.broadcastgame.C3868s;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.channel.C3431f;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import p003X.C102716Qcg;
import p003X.C106862S5w;
import p003X.C87533KeN;
import p003X.C87539KeT;
import p003X.C87540KeU;
import p003X.C87546Kea;
import p003X.C87549Ked;
import p003X.C87653KgJ;
import p003X.KYP;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.d */
/* loaded from: classes5.dex */
public final class C3520d implements AbstractC3512ag {
    public static ChangeQuickRedirect LIZ;
    public final C3867r LIZIZ;
    public final C87533KeN LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final AbstractC5436a f26064LJ;
    public final C102716Qcg LJFF;
    public final String LJI;
    public final long LJII;
    public final C3383p LJIIIIZZ;
    public final AbstractC3664m LJIIIZ;
    public final Lazy LJIIJ;
    public final C87539KeT LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final /* synthetic */ C87549Ked LJIILJJIL;

    static {
        Covode.recordClassIndex(20294);
    }

    private void LIZ(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIILJJIL.LIZ(disposable);
    }

    public final C3431f LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3431f) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        KYP kyp = KYP.LIZIZ;
        long j = this.LIZJ.LIZIZ;
        if (!PatchProxy.proxy(new Object[]{new Long(j)}, kyp, KYP.LIZ, false, 11).isSupported) {
            kyp.LIZ("open_conn_id", String.valueOf(j));
        }
        this.LJIIJJI.LIZ(this.LJI, this.LIZJ.LIZIZ);
    }

    public final C3510ac LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (C3510ac) proxy.result;
        }
        return new C3510ac(this.LJI, this.LJII, this.LIZJ.LIZ(), this.LIZJ.LIZIZ, 2L);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            this.LJIILJJIL.LIZ();
        }
        this.LIZIZ.LIZ();
        this.LJFF.LIZIZ();
        this.LIZLLL = true;
        LK1.LIZ(LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME, false, false, new AnchorGameMessageChannel$onDestroy$1(this), 6, null);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.message.AbstractC3512ag
    public final <T extends AbstractC3404c> Observable<T> LIZ(Class<T> cls) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cls}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Observable) proxy.result;
        }
        C106862S5w.LIZ(cls);
        return this.LIZIZ.LIZ(cls);
    }

    public final void LIZ(C3516am c3516am, Function2<? super Boolean, ? super String, Unit> function2) {
        Observable<C3868s> LIZIZ;
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[]{c3516am, function2}, this, LIZ, false, 18).isSupported && (LIZIZ = this.LIZIZ.LIZIZ(c3516am)) != null && (subscribe = LIZIZ.subscribe(new C87540KeU(this, function2), new C87546Kea(this, c3516am, function2))) != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(Function2<? super Boolean, ? super String, Unit> function2, String str) {
        if (PatchProxy.proxy(new Object[]{function2, str}, this, LIZ, false, 19).isSupported) {
            return;
        }
        LK1.LIZ(0L, false, false, new AnchorGameMessageChannel$onLaunchFail$1(function2, str), 7, null);
    }

    public static /* synthetic */ void LIZ(C3520d c3520d, Function2 function2, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3520d, function2, null, 2, null}, null, LIZ, true, 20).isSupported) {
            return;
        }
        c3520d.LIZ(function2, (String) null);
    }

    public final void LIZ(long j, String str, String str2, int i, C3514ak c3514ak, boolean z, Function2<? super Boolean, ? super String, Unit> function2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), str, str2, Integer.valueOf(i), c3514ak, Byte.valueOf(z ? (byte) 1 : (byte) 0), function2}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, function2);
        LIZ(new C3516am(j, this.LJIIL, this.LJII, this.LIZJ.LIZIZ, this.LJI, str, null, null, C87653KgJ.LIZIZ, ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class)).getCurrentGameIdentifier(), 0, false, str2, i, 0, z, false, 0, c3514ak, 0, null, null, 3886272), function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C3520d(com.bytedance.android.live.pushstream.AbstractC5436a r12, p003X.C102716Qcg r13, java.lang.String r14, java.lang.String r15, long r16, com.bytedance.android.live.broadcastgame.api.model.C3383p r18, com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3664m r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.opengame.message.C3520d.<init>(com.bytedance.android.live.pushstream.a, X.Qcg, java.lang.String, java.lang.String, long, com.bytedance.android.live.broadcastgame.api.model.p, com.bytedance.android.live.broadcastgame.opengame.runtime.m, boolean):void");
    }

    public /* synthetic */ C3520d(AbstractC5436a abstractC5436a, C102716Qcg c102716Qcg, String str, String str2, long j, C3383p c3383p, AbstractC3664m abstractC3664m, boolean z, int i) {
        this(abstractC5436a, c102716Qcg, str, str2, j, c3383p, abstractC3664m, false);
    }
}
