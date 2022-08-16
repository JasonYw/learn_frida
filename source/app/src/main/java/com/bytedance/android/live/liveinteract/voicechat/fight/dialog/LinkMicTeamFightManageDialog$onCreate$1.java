package com.bytedance.android.live.liveinteract.voicechat.fight.dialog;

import android.view.View;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC77996Gow;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C77524GhK;
import p003X.C77543Ghd;
import p003X.C78391GvJ;
import p003X.C78775H3p;
import p003X.C88440Kt0;
import p003X.DialogC77522GhI;
import p003X.DialogInterface$OnClickListenerC77527GhN;
import p003X.DialogInterface$OnClickListenerC77533GhT;

/* loaded from: classes3.dex */
public final class LinkMicTeamFightManageDialog$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77522GhI this$0;

    static {
        Covode.recordClassIndex(31355);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMicTeamFightManageDialog$onCreate$1(DialogC77522GhI dialogC77522GhI) {
        super(1);
        this.this$0 = dialogC77522GhI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C77543Ghd LIZ;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.f6431LJ.LIZ(this.this$0.LIZLLL);
            if (C5056a.LIZJ.LJFF()) {
                v$a v_a = new v$a(this.this$0.getContext());
                v_a.LIZ(4);
                AbstractC77996Gow LIZIZ = v_a.LIZLLL(2131587998).LIZ(2.0f).LIZIZ(0, 2131587966, new DialogInterface$OnClickListenerC77527GhN(this)).LIZIZ(1, 2131583902, DialogInterface$OnClickListenerC77533GhT.LIZIZ);
                LIZIZ.mo15263LJ(false);
                LIZIZ.LIZJ();
                C78391GvJ.LIZIZ.LIZ("over", this.this$0.LIZLLL);
            } else {
                C78775H3p.f6558LJ.LIZ(true);
                AbstractC4286c LIZIZ2 = C5056a.LIZJ.LIZIZ();
                if (LIZIZ2 != null && (LIZ = C77524GhK.LIZ(LIZIZ2, 0, 0L, "panel", 3, null)) != null && !LIZ.LIZ()) {
                    C88440Kt0.LIZ(LIZ.LIZLLL);
                    C78391GvJ.LIZIZ.LIZIZ(LIZ.LIZJ, this.this$0.LIZLLL);
                    ALogger.m15800e("TeamFight", "panel tryCreateTeamFight failed " + LIZ);
                    C78775H3p.f6558LJ.LIZ(LIZ.LIZLLL);
                } else {
                    C116971W2r.LIZ(this.this$0);
                }
                C78391GvJ.LIZIZ.LIZ("start", this.this$0.LIZLLL);
            }
        }
        return Unit.INSTANCE;
    }
}
