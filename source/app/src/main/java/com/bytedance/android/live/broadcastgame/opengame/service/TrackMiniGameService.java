package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3399e;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87789KiV;
import p003X.C87890Kk8;

/* loaded from: classes5.dex */
public final class TrackMiniGameService extends TrackCommonService implements AbstractC3717a, AbstractC3719c {
    public static ChangeQuickRedirect LIZLLL;

    /* renamed from: LJ */
    public static final C87789KiV f26093LJ = new C87789KiV((byte) 0);
    public C3682x LJFF;
    public final /* synthetic */ C87549Ked LJI = new C87549Ked();

    static {
        Covode.recordClassIndex(21075);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService
    public final C3682x LJIIJJI() {
        return this.LJFF;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = System.currentTimeMillis();
        LJIIJ();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 2).isSupported) {
            return;
        }
        LJIIIIZZ();
        LJIIIZ();
        if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 6).isSupported) {
            this.LJI.LIZ();
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 4).isSupported) {
            return;
        }
        C4574547f LIZ = C4574547f.LIZ();
        Map<String, String> LJII = LJII();
        LJII.put("source", str);
        LIZ.LIZ("livesdk_small_program_audience_icon_click", LJII, Room.class, C8668v.class);
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.TrackMiniGameService$1 */
    /* loaded from: classes5.dex */
    public static final class C37151 extends Lambda implements Function1<C3399e, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(21076);
        }

        public C37151() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(C3399e c3399e) {
            C3399e c3399e2 = c3399e;
            if (!PatchProxy.proxy(new Object[]{c3399e2}, this, changeQuickRedirect, false, 1).isSupported) {
                String str = c3399e2.LIZIZ;
                int hashCode = str.hashCode();
                if (hashCode != -1271529498) {
                    if (hashCode == 214339523 && str.equals("from_temp_area")) {
                        TrackMiniGameService.this.LIZIZ("more");
                    }
                } else if (str.equals("from_toolbar")) {
                    TrackMiniGameService.this.LIZIZ("bottom_toolbar");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackMiniGameService(C3682x c3682x) {
        super(c3682x);
        C106862S5w.LIZ(c3682x);
        this.LJFF = c3682x;
        Observable LIZ = C87010KQi.LIZ().LIZ(C3399e.class);
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        Disposable LIZ2 = C87890Kk8.LIZ(LIZ, new C37151());
        if (!PatchProxy.proxy(new Object[]{LIZ2}, this, LIZLLL, false, 8).isSupported) {
            C106862S5w.LIZ(LIZ2);
            this.LJI.LIZ(LIZ2);
        }
    }
}
