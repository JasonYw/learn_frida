package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.live.broadcastgame.AbstractC3404c;
import com.bytedance.android.live.broadcastgame.C3867r;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p003X.AbstractC413392Xt;
import p003X.AbstractC87536KeQ;
import p003X.C102716Qcg;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C87462KdE;
import p003X.C87465KdH;
import p003X.C87537KeR;
import p003X.C87538KeS;
import p003X.C87539KeT;
import p003X.C87544KeY;
import p003X.C87547Keb;
import p003X.C87549Ked;
import p003X.C87653KgJ;
import p003X.C87750Khs;
import p003X.IPB;
import p003X.IPE;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.f */
/* loaded from: classes5.dex */
public final class C3522f implements AbstractC3512ag {
    public static ChangeQuickRedirect LIZ;
    public C3867r LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    /* renamed from: LJ */
    public final Room f26065LJ;
    public final C87539KeT LJFF;
    public final C87547Keb LJI;
    public final List<AbstractC87536KeQ<?>> LJII;
    public final C102716Qcg LJIIIIZZ;
    public final boolean LJIIIZ;
    public final /* synthetic */ C87549Ked LJIIJ;

    static {
        Covode.recordClassIndex(20299);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            this.LJIIJ.LIZ();
        }
        C87653KgJ c87653KgJ = C87653KgJ.LIZLLL;
        if (!PatchProxy.proxy(new Object[]{0}, c87653KgJ, C87653KgJ.LIZ, false, 41).isSupported) {
            C87653KgJ.LIZ(c87653KgJ, "ttlive_interactive_game_communication_audience_receive_game_end_msg_all", 0, LiveTracingMonitor.EventType.MESSAGE_RECEIVED, (JSONObject) null, (JSONObject) null, (JSONObject) null, (Throwable) null, false, 248, (Object) null);
        }
        C87539KeT c87539KeT = this.LJFF;
        c87539KeT.LIZJ = null;
        c87539KeT.LIZIZ = null;
        this.LJI.LIZ();
        this.LJIIIIZZ.LIZIZ();
        this.LIZIZ.LIZ();
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

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        Iterator<T> it = this.LJII.iterator();
        while (it.hasNext()) {
            AbstractC87536KeQ abstractC87536KeQ = (AbstractC87536KeQ) it.next();
            if (!PatchProxy.proxy(new Object[]{new Long(j)}, abstractC87536KeQ, AbstractC87536KeQ.LIZIZ, false, 5).isSupported) {
                abstractC87536KeQ.LIZJ().LIZ(j);
            }
        }
    }

    public C3522f(String str, long j, C102716Qcg c102716Qcg, Room room, boolean z) {
        IMessageManager iMessageManager;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C106862S5w.LIZ(str, c102716Qcg, room);
        this.LJIIJ = new C87549Ked();
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJIIIIZZ = c102716Qcg;
        this.f26065LJ = room;
        this.LJIIIZ = z;
        this.LIZIZ = new C3867r();
        this.LJFF = new C87539KeT();
        this.LJI = new C87547Keb();
        this.LJII = new ArrayList();
        this.LIZIZ.LIZ(C3521e.class, new C87462KdE()).LIZ(C3509aa.class, new C87465KdH()).LIZ(this.LJFF).LIZ(this.LJI);
        this.LJFF.LIZ(this.LIZJ, this.LIZLLL);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, this.f26065LJ.getRoomId(), 1, null);
        if (LIZ2 != null && (LJIILLIIL = LIZ2.LJIILLIIL()) != null) {
            iMessageManager = LJIILLIIL.LIZIZ();
        } else {
            iMessageManager = null;
        }
        IMessageManager LIZ3 = this.LJIIIIZZ.LIZ(false);
        C3867r c3867r = this.LIZIZ;
        C87538KeS c87538KeS = new C87538KeS(LIZ3);
        this.LJII.add(c87538KeS);
        C3867r LIZ4 = c3867r.LIZ(C3508a.class, c87538KeS);
        C87537KeR c87537KeR = new C87537KeR(LIZ3);
        this.LJII.add(c87537KeR);
        LIZ4.LIZ(C3509aa.class, c87537KeR).LIZ(C3518at.class, new IPB(LIZ3)).LIZ(C3519ax.class, new C87750Khs(iMessageManager));
        if (!this.LJIIIZ) {
            this.LIZIZ.LIZ(C3513ah.class, new IPE(iMessageManager)).LIZ(ap$a.class, new C87544KeY(iMessageManager));
        }
    }

    public /* synthetic */ C3522f(String str, long j, C102716Qcg c102716Qcg, Room room, boolean z, int i) {
        this(str, j, c102716Qcg, room, false);
    }
}
