package com.bytedance.android.live.liveinteract.videotalk.fight;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.liveinteract.voicechat.fight.C5056a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
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
import p003X.C78636GzG;
import p003X.H3Q;

/* loaded from: classes3.dex */
public final class VideoTeamFightViewManager$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H3Q this$0;

    static {
        Covode.recordClassIndex(30246);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTeamFightViewManager$3(H3Q h3q) {
        super(1);
        this.this$0 = h3q;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        String str;
        String str2;
        C2WC<String> LJIIJ;
        C5923dp LIZ;
        C2WC<Integer> LLFFF;
        Integer LIZ2;
        int intValue;
        View view2 = view;
        if (!PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view2);
            boolean LIZLLL = C78636GzG.LIZIZ.LIZLLL();
            C2WC<C6174n> c2wc = null;
            if ((this.this$0.LJIIIIZZ || LIZLLL) && C5056a.LIZJ.LIZLLL()) {
                C78391GvJ c78391GvJ = C78391GvJ.LIZIZ;
                C5056a LIZ3 = C5056a.LIZJ.LIZ();
                if (LIZ3 == null || (LJIIJ = LIZ3.LJIIJ()) == null || (str = LJIIJ.LIZ()) == null) {
                    str = "";
                }
                c78391GvJ.LIZJ(str);
                AbstractC4286c LIZIZ = C5056a.LIZJ.LIZIZ();
                if (LIZIZ != null) {
                    str2 = LIZIZ.LIZ(C78612Gys.LIZ());
                } else {
                    str2 = null;
                }
                if (str2 != null && str2.length() != 0) {
                    StringBuilder sb = new StringBuilder("cannot start fight ");
                    sb.append(str2);
                    sb.append(LoggerUtil.BLANK_TAG);
                    C5056a LIZ4 = C5056a.LIZJ.LIZ();
                    if (LIZ4 != null) {
                        c2wc = LIZ4.LJIIIIZZ();
                    }
                    sb.append(c2wc);
                    ALogger.m15800e("TeamFightView", sb.toString());
                }
            } else {
                AbstractC4767ah LIZ5 = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ5 != null && !LIZ5.LJIIIZ()) {
                    SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_LINK_GUEST_CLEAN_SCREEN_OPTIMIZE;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Boolean value = settingKey.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    if (value.booleanValue() && (LIZ = C5923dp.LJIIJ.LIZ(null, 0L)) != null && (LLFFF = LIZ.LLFFF()) != null && (LIZ2 = LLFFF.LIZ()) != null && ((intValue = LIZ2.intValue()) == 2 || intValue == 3)) {
                        ALogger.m15795w("TeamFightView", "rejected guest rank click for new clean mode");
                    }
                }
                C77526GhM c77526GhM = C77526GhM.LIZIZ;
                Context context = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C77526GhM.LIZ(c77526GhM, context, this.this$0.LJII, null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }
}
