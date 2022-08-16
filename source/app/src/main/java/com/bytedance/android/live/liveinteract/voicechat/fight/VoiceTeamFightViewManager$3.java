package com.bytedance.android.live.liveinteract.voicechat.fight;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C77526GhM;
import p003X.C78391GvJ;
import p003X.C78612Gys;
import p003X.H3L;

/* loaded from: classes3.dex */
public final class VoiceTeamFightViewManager$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H3L this$0;

    static {
        Covode.recordClassIndex(31306);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceTeamFightViewManager$3(H3L h3l) {
        super(1);
        this.this$0 = h3l;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        String str;
        String str2;
        C2WC<String> LJIIJ;
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            if ((this.this$0.LJIIIZ || this.this$0.LIZ()) && C5056a.LIZJ.LIZLLL()) {
                C78391GvJ c78391GvJ = C78391GvJ.LIZIZ;
                C5056a LIZ = C5056a.LIZJ.LIZ();
                if (LIZ == null || (LJIIJ = LIZ.LJIIJ()) == null || (str = LJIIJ.LIZ()) == null) {
                    str = "";
                }
                c78391GvJ.LIZJ(str);
                AbstractC4286c LIZIZ = C5056a.LIZJ.LIZIZ();
                C2WC<C6174n> c2wc = null;
                if (LIZIZ != null) {
                    str2 = LIZIZ.LIZ(C78612Gys.LIZ());
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    StringBuilder sb = new StringBuilder("cannot start fight ");
                    sb.append(str2);
                    sb.append(LoggerUtil.BLANK_TAG);
                    C5056a LIZ2 = C5056a.LIZJ.LIZ();
                    if (LIZ2 != null) {
                        c2wc = LIZ2.LJIIIIZZ();
                    }
                    sb.append(c2wc);
                    ALogger.m15800e("TeamFightView", sb.toString());
                }
            } else {
                C77526GhM c77526GhM = C77526GhM.LIZIZ;
                Context context = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C77526GhM.LIZ(c77526GhM, context, this.this$0.LJIIIIZZ, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
