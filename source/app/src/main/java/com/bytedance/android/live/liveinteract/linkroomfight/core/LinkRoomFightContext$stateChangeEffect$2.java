package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.HNT;

/* loaded from: classes3.dex */
public final class LinkRoomFightContext$stateChangeEffect$2 extends Lambda implements Function1<HNT<e$b>, Unit> {
    public static final LinkRoomFightContext$stateChangeEffect$2 INSTANCE = new LinkRoomFightContext$stateChangeEffect$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27566);
    }

    public LinkRoomFightContext$stateChangeEffect$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(HNT<e$b> hnt) {
        HNT<e$b> hnt2 = hnt;
        if (!PatchProxy.proxy(new Object[]{hnt2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(hnt2);
            hnt2.f7561LJ = null;
        }
        return Unit.INSTANCE;
    }
}
