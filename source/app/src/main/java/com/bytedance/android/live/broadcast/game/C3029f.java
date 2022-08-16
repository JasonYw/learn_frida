package com.bytedance.android.live.broadcast.game;

import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.broadcast.AbstractC3004e;
import com.bytedance.android.live.broadcast.api.C2925s;
import com.bytedance.android.live.broadcast.api.LiveGameDiscoverApi;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.C100296Pek;
import p003X.C100643PkL;
import p003X.C100644PkM;
import p003X.C100645PkN;
import p003X.C100646PkO;
import p003X.C100647PkP;
import p003X.C100648PkQ;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C88306Kqq;
import p003X.KCE;

/* renamed from: com.bytedance.android.live.broadcast.game.f */
/* loaded from: classes8.dex */
public final class C3029f extends AbstractC3004e {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public static final /* synthetic */ KProperty[] f25839LJ;
    public boolean LJFF;
    public final C81289I2h LJI = C81909IQd.LIZ(this, new C2925s(null, null, 3), null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    static {
        Covode.recordClassIndex(15996);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3029f.class, "liveGameRoomList", "getLiveGameRoomList()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C3029f.class, "isInNetWorkRequest", "isInNetWorkRequest()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        f25839LJ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    public final C2WC<C2925s> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, f25839LJ[0]));
    }

    public final C2WC<Boolean> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, f25839LJ[1]));
    }

    public final void LIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZLLL, false, 6).isSupported) {
            return;
        }
        this.LJFF = false;
        if (th instanceof ApiServerException) {
            KCE.LIZ(((ApiServerException) th).mPrompt);
        }
        ALogger.stacktrace(6, "LiveGameDiscoverViewModel", th.getStackTrace());
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZLLL, false, 3).isSupported) {
            return;
        }
        LIZIZ().LIZ(Boolean.valueOf(z));
    }

    public final void LIZ(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{20L, new Long(j2)}, this, LIZLLL, false, 4).isSupported) {
            return;
        }
        LIZ(true);
        this.LJFF = false;
        Disposable subscribe = C100296Pek.LIZ((LiveGameDiscoverApi) C88306Kqq.LIZ().LIZ(LiveGameDiscoverApi.class), 20L, Long.valueOf(j2), "discover_page-live_game_all", 0, 8, null).compose(C100839PnV.LIZJ()).doFinally(new C100647PkP(this)).subscribe(new C100643PkL(this), new C100645PkN(this));
        if (subscribe != null) {
            LIZ(subscribe);
        }
    }

    public final void LIZ(String str, String str2, long j, long j2) {
        if (PatchProxy.proxy(new Object[]{str, str2, 20L, new Long(j2)}, this, LIZLLL, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        LIZ(true);
        this.LJFF = false;
        Disposable subscribe = C100296Pek.LIZ((LiveGameDiscoverApi) C88306Kqq.LIZ().LIZ(LiveGameDiscoverApi.class), str, str2, 0L, 20L, Long.valueOf(j2), "discover_page-live_game_game", 0, 64, null).compose(C100839PnV.LIZJ()).doFinally(new C100648PkQ(this)).subscribe(new C100644PkM(this), new C100646PkO(this));
        if (subscribe != null) {
            LIZ(subscribe);
        }
    }
}
