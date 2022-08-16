package com.bytedance.android.live.liveinteract.voicechat.ktv;

import android.view.View;
import com.bytedance.android.live.liveinteract.api.chatroom.p339b.C4269g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C87010KQi;

/* loaded from: classes3.dex */
public final class KtvVideoRegionController$1 extends Lambda implements Function1<View, Unit> {
    public static final KtvVideoRegionController$1 INSTANCE = new KtvVideoRegionController$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31422);
    }

    public KtvVideoRegionController$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C87010KQi.LIZ().LIZ(new C4269g(1));
        }
        return Unit.INSTANCE;
    }
}
