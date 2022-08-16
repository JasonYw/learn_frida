package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C439993ar;
import p003X.DialogC448093nv;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$initSettingRegion$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30406);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$initSettingRegion$2(DialogC448093nv dialogC448093nv) {
        super(1);
        this.this$0 = dialogC448093nv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        Room room;
        C2WC<Room> LIZ;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            DialogC448093nv dialogC448093nv = this.this$0;
            if (!PatchProxy.proxy(new Object[0], dialogC448093nv, DialogC448093nv.LIZ, false, 12).isSupported) {
                IBroadcastService iBroadcastService = (IBroadcastService) ServiceManager.getService(IBroadcastService.class);
                FragmentActivity LIZIZ = C439993ar.LIZIZ(dialogC448093nv.getContext());
                C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
                    room = LIZ.LIZ();
                } else {
                    room = null;
                }
                iBroadcastService.openRoomIntroDialog(LIZIZ, room, LiveMode.VIDEO, null);
            }
        }
        return Unit.INSTANCE;
    }
}
