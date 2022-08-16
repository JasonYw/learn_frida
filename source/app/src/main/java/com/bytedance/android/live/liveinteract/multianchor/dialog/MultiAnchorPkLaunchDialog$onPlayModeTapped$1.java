package com.bytedance.android.live.liveinteract.multianchor.dialog;

import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode;
import com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.MultiAnchorPkApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C79644HaQ;
import p003X.C79668Hao;
import p003X.C88306Kqq;
import p003X.HZH;
import p003X.HZI;
import p003X.HZJ;

/* loaded from: classes3.dex */
public final class MultiAnchorPkLaunchDialog$onPlayModeTapped$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PlayMode $target;
    public final /* synthetic */ C79644HaQ this$0;

    static {
        Covode.recordClassIndex(27953);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorPkLaunchDialog$onPlayModeTapped$1(C79644HaQ c79644HaQ, PlayMode playMode) {
        super(0);
        this.this$0 = c79644HaQ;
        this.$target = playMode;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        long j;
        int i;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C4527a LIZIZ = this.this$0.LIZIZ();
            PlayMode playMode = this.$target;
            if (!PatchProxy.proxy(new Object[]{playMode}, LIZIZ, C4527a.LIZ, false, 16).isSupported) {
                C106862S5w.LIZ(playMode);
                if (playMode != LIZIZ.LIZLLL.getValue()) {
                    C79668Hao c79668Hao = LIZIZ.LJIILJJIL;
                    if (!PatchProxy.proxy(new Object[]{playMode}, c79668Hao, C79668Hao.LIZ, false, 5).isSupported) {
                        C106862S5w.LIZ(playMode);
                        PlayMode playMode2 = c79668Hao.LJIIL;
                        if (playMode2 != null && playMode != playMode2) {
                            HZJ hzj = c79668Hao.LIZLLL;
                            if (!PatchProxy.proxy(new Object[]{playMode}, hzj, HZJ.LIZ, false, 3).isSupported) {
                                C106862S5w.LIZ(playMode);
                                Disposable disposable = hzj.f6855LJ;
                                if (disposable != null) {
                                    disposable.dispose();
                                }
                                hzj.f6855LJ = null;
                                long currentTimeMillis = System.currentTimeMillis();
                                MultiAnchorPkApi multiAnchorPkApi = (MultiAnchorPkApi) C88306Kqq.LIZ().LIZ(MultiAnchorPkApi.class);
                                long j2 = LinkCrossRoomDataHolder.LJII().LIZLLL;
                                Room room = hzj.LJFF;
                                if (room != null) {
                                    j = room.getRoomId();
                                } else {
                                    j = 0;
                                }
                                if (playMode == PlayMode.TEAM_PK) {
                                    i = 2;
                                } else {
                                    i = 1;
                                }
                                hzj.f6855LJ = multiAnchorPkApi.changeMultiPkModeTab(j2, j, i).compose(C100839PnV.LIZJ()).subscribe(new HZI(hzj, currentTimeMillis, playMode), new HZH<>(playMode, currentTimeMillis));
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
