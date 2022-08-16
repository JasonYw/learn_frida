package com.bytedance.android.live.liveinteract.voicechat.fight.dialog;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C77526GhM;
import p003X.C78391GvJ;
import p003X.DialogC77522GhI;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class LinkMicTeamFightManageDialog$onCreate$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77522GhI this$0;

    static {
        Covode.recordClassIndex(31360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMicTeamFightManageDialog$onCreate$4(DialogC77522GhI dialogC77522GhI) {
        super(1);
        this.this$0 = dialogC77522GhI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        int i;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C78391GvJ.LIZIZ.LIZ("rule", this.this$0.LIZLLL);
            C77526GhM c77526GhM = C77526GhM.LIZIZ;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            Room room = this.this$0.LIZJ;
            View view2 = this.this$0.LIZIZ;
            if (view2 != null) {
                i = view2.getHeight();
            } else {
                i = 600;
            }
            c77526GhM.LIZ(context, room, Integer.valueOf((int) LK5.LJFF(i)));
        }
        return Unit.INSTANCE;
    }
}
