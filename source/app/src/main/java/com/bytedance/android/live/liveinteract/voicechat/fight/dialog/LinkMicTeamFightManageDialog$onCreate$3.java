package com.bytedance.android.live.liveinteract.voicechat.fight.dialog;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC77493Ggp;
import p003X.DialogC77522GhI;

/* loaded from: classes3.dex */
public final class LinkMicTeamFightManageDialog$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77522GhI this$0;

    static {
        Covode.recordClassIndex(31359);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkMicTeamFightManageDialog$onCreate$3(DialogC77522GhI dialogC77522GhI) {
        super(1);
        this.this$0 = dialogC77522GhI;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (!C5056a.LIZJ.LIZJ()) {
                Context context = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C116971W2r.LIZJ(new DialogC77493Ggp(context, this.this$0));
            }
        }
        return Unit.INSTANCE;
    }
}
