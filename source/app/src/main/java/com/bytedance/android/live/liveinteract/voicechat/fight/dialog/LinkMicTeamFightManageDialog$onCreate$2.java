package com.bytedance.android.live.liveinteract.voicechat.fight.dialog;

import android.view.View;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C77543Ghd;
import p003X.C78391GvJ;
import p003X.C78612Gys;
import p003X.C78775H3p;
import p003X.DialogC77522GhI;

/* loaded from: classes3.dex */
public final class LinkMicTeamFightManageDialog$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77522GhI this$0;

    static {
        Covode.recordClassIndex(31358);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMicTeamFightManageDialog$onCreate$2(DialogC77522GhI dialogC77522GhI) {
        super(1);
        this.this$0 = dialogC77522GhI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C77543Ghd LIZ;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.f6431LJ.LIZ(this.this$0.LIZLLL);
            C78775H3p.f6558LJ.LIZ(false);
            AbstractC4286c LIZIZ = C5056a.LIZJ.LIZIZ();
            if (LIZIZ != null && (LIZ = LIZIZ.LIZ(1, C78612Gys.LIZ(), "restart")) != null && !LIZ.LIZ()) {
                C78775H3p.f6558LJ.LIZ(LIZ.LIZLLL);
            } else {
                C116971W2r.LIZ(this.this$0);
            }
            C78391GvJ.LIZIZ.LIZ("again", this.this$0.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
