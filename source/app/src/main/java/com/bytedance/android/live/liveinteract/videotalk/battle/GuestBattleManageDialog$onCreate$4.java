package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.C77540Gha;
import p003X.C78828H5q;
import p003X.C79242HLo;
import p003X.C88440Kt0;
import p003X.DialogC77488Ggk;
import p003X.DialogC77516GhC;

/* loaded from: classes3.dex */
public final class GuestBattleManageDialog$onCreate$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77516GhC this$0;

    static {
        Covode.recordClassIndex(29808);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleManageDialog$onCreate$4(DialogC77516GhC dialogC77516GhC) {
        super(1);
        this.this$0 = dialogC77516GhC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        String str;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LIZIZ()) {
                C88440Kt0.LIZ(2131583896);
            } else {
                if (!PatchProxy.proxy(new Object[0], C77540Gha.LIZJ, C77540Gha.LIZ, false, 3).isSupported) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("user_cnt", String.valueOf(C79242HLo.LJFF()));
                    hashMap.put("game_name", "bomb");
                    if (C4891b.LIZJ.LIZLLL()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("is_pause", str);
                    C78828H5q.LIZIZ(hashMap, (Integer) null, (Integer) null, 6, (Object) null);
                    C78828H5q.LJFF.LJIIL(hashMap);
                    C4574547f.LIZ().LIZ("livesdk_game_time_click", hashMap, Room.class);
                }
                Context context = this.this$0.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                C116971W2r.LIZJ(new DialogC77488Ggk(context, this.this$0));
            }
        }
        return Unit.INSTANCE;
    }
}
