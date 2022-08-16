package com.bytedance.android.live.liveinteract.voicechat.fight.dialog;

import android.view.View;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.livesdk.chatroom.event.C5984am;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C78391GvJ;
import p003X.C79046HEa;
import p003X.DialogC77863Gmn;

/* loaded from: classes3.dex */
public final class TeamFightWaitingDialog$onCreate$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77863Gmn this$0;

    static {
        Covode.recordClassIndex(31367);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightWaitingDialog$onCreate$4(DialogC77863Gmn dialogC77863Gmn) {
        super(1);
        this.this$0 = dialogC77863Gmn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C79046HEa LIZ = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.LIZLLL()) {
                Room room = this.this$0.LIZJ;
                Intrinsics.checkNotNullExpressionValue(room, "");
                if (room.isLiveTypeAudio()) {
                    this.this$0.LJFF.put("cmd_interact_state_change", new C5984am(9));
                } else {
                    AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
                    if (LIZ2 != null) {
                        LIZ2.LJII();
                    }
                }
            }
            C78391GvJ.LIZIZ.LIZLLL("cancel");
            C116971W2r.LIZ(this.this$0);
        }
        return Unit.INSTANCE;
    }
}
