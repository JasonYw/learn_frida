package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.HNT;

/* loaded from: classes3.dex */
public final class TeamFightContext$stateChangeEffect$2 extends Lambda implements Function1<HNT<b$b>, Unit> {
    public static final TeamFightContext$stateChangeEffect$2 INSTANCE = new TeamFightContext$stateChangeEffect$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31268);
    }

    public TeamFightContext$stateChangeEffect$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(HNT<b$b> hnt) {
        HNT<b$b> hnt2 = hnt;
        if (!PatchProxy.proxy(new Object[]{hnt2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(hnt2);
            hnt2.f7561LJ = null;
        }
        return Unit.INSTANCE;
    }
}
