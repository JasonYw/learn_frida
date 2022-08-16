package com.bytedance.android.live.broadcastgame.openplatform.miniapp;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C87717KhL;
import p003X.C87739Khh;
import p003X.C87799Kif;
import p003X.IQV;

/* loaded from: classes5.dex */
public final class OpenOPAppHelper$CheckToolbarConflictNode$process$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87799Kif this$0;

    static {
        Covode.recordClassIndex(21494);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenOPAppHelper$CheckToolbarConflictNode$process$2(C87799Kif c87799Kif) {
        super(0);
        this.this$0 = c87799Kif;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C2WC<Room> LIZ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C13491f LIZ2 = IQV.LIZ(C5923dp.class);
            Room room = null;
            if (!(LIZ2 instanceof C5923dp)) {
                LIZ2 = null;
            }
            C5923dp c5923dp = (C5923dp) LIZ2;
            if (c5923dp != null && (LIZ = c5923dp.LIZ()) != null) {
                room = LIZ.LIZ();
            }
            C87739Khh.LIZIZ.LIZ(this.this$0.LIZIZ, new C87717KhL(room, "anchor", false, false, 12), 1, (Integer) 103, "Toolbar被其他业务占用");
        }
        return Unit.INSTANCE;
    }
}
