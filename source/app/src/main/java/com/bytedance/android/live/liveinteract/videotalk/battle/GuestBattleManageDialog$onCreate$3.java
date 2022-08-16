package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.view.View;
import android.widget.Switch;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC77996Gow;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.C77540Gha;
import p003X.C78827H5p;
import p003X.C78828H5q;
import p003X.C79242HLo;
import p003X.DialogC77516GhC;
import p003X.DialogInterface$OnClickListenerC77537GhX;
import p003X.DialogInterface$OnClickListenerC77538GhY;

/* loaded from: classes3.dex */
public final class GuestBattleManageDialog$onCreate$3 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77516GhC this$0;

    static {
        Covode.recordClassIndex(29805);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleManageDialog$onCreate$3(DialogC77516GhC dialogC77516GhC) {
        super(1);
        this.this$0 = dialogC77516GhC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        boolean z;
        String str;
        boolean z2;
        String str2;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            String str3 = "";
            if (this.this$0.LIZIZ()) {
                v$a v_a = new v$a(this.this$0.getContext());
                v_a.LIZ(4);
                AbstractC77996Gow LIZIZ = v_a.LIZLLL(2131583903).LIZ(2.0f).LIZIZ(0, 2131587966, new DialogInterface$OnClickListenerC77537GhX(this)).LIZIZ(1, 2131583902, DialogInterface$OnClickListenerC77538GhY.LIZIZ);
                LIZIZ.mo15263LJ(false);
                LIZIZ.LIZJ();
            } else {
                AbstractC4909l LIZIZ2 = C4891b.LIZJ.LIZIZ();
                if (LIZIZ2 != null) {
                    int i = this.this$0.LIZLLL;
                    Switch r0 = this.this$0.LIZIZ;
                    if (r0 != null) {
                        z = r0.isChecked();
                    } else {
                        z = false;
                    }
                    String LIZ = LIZIZ2.LIZ(i, z, this.this$0.LIZJ);
                    if (LIZ != null) {
                        str3 = LIZ;
                    }
                }
                if (str3.length() > 0) {
                    C78827H5p.f6578LJ.LIZ(str3);
                    C116971W2r.LIZ(this.this$0);
                }
                ALogger.m15801d("GuestBattleWidget", "#GuestBattleDebug# [onCreate] start battle. duration: " + this.this$0.LIZLLL + ", loserNum: " + this.this$0.LIZJ);
            }
            if (this.this$0.LIZIZ()) {
                str = "stop";
            } else {
                C4891b LIZ2 = C4891b.LIZJ.LIZ();
                if (LIZ2 != null && LIZ2.LJIIJJI() == 2) {
                    str = "restart_game";
                } else {
                    str = "new_game";
                }
            }
            C77540Gha c77540Gha = C77540Gha.LIZJ;
            int i2 = this.this$0.LIZLLL;
            int i3 = this.this$0.LIZJ;
            Switch r02 = this.this$0.LIZIZ;
            if (r02 != null) {
                z2 = r02.isChecked();
            } else {
                z2 = false;
            }
            byte b = z2 ? (byte) 1 : (byte) 0;
            byte b2 = z2 ? (byte) 1 : (byte) 0;
            if (!PatchProxy.proxy(new Object[]{str, str3, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(b)}, c77540Gha, C77540Gha.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(str, str3);
                HashMap hashMap = new HashMap();
                hashMap.put("user_cnt", String.valueOf(C79242HLo.LJFF()));
                hashMap.put("game_name", "bomb");
                hashMap.put("game_time", String.valueOf(i2));
                hashMap.put("action_type", str);
                String str4 = "1";
                if (!z2) {
                    str2 = "0";
                } else {
                    str2 = str4;
                }
                hashMap.put("is_anchor_in", str2);
                if (str3.length() > 0) {
                    hashMap.put(MiPushCommandMessage.KEY_REASON, str3);
                    hashMap.put("action_type", "fail");
                }
                if (!c77540Gha.LIZ()) {
                    str4 = "0";
                }
                hashMap.put("if_enlarge", str4);
                hashMap.put("heart_break_cnt", String.valueOf(i3));
                C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
                C78828H5q.LJFF.LJIIL(hashMap);
                C4574547f.LIZ().LIZ("livesdk_connection_game_window_start", hashMap, Room.class);
            }
        }
        return Unit.INSTANCE;
    }
}
