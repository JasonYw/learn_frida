package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.liveinteract.linkroomfight.api.LinkRoomFightApi;
import com.bytedance.android.live.liveinteract.linkroomfight.p363a.C4444c;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.CrossRoomLinkType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C78779H3t;
import p003X.C78781H3v;
import p003X.C78782H3w;
import p003X.C88306Kqq;
import p003X.H41;

/* loaded from: classes3.dex */
public final class LinkRoomFightCancelInviteDialog$onViewCreated$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78779H3t this$0;

    static {
        Covode.recordClassIndex(27673);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightCancelInviteDialog$onViewCreated$1(C78779H3t c78779H3t) {
        super(1);
        this.this$0 = c78779H3t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        H41 h41;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C78779H3t c78779H3t = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c78779H3t, C78779H3t.LIZ, false, 5).isSupported) {
                IService service = ServiceManager.getService(IRoomService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
                if (currentRoom != null) {
                    long roomId = currentRoom.getRoomId();
                    long currentTimeMillis = System.currentTimeMillis();
                    C4444c c4444c = c78779H3t.LIZIZ;
                    if (c4444c != null && (h41 = c4444c.LIZJ) != null) {
                        long j = h41.LIZIZ;
                        c78779H3t.LIZLLL = ((LinkRoomFightApi) C88306Kqq.LIZ().LIZ(LinkRoomFightApi.class)).cancelInvite(CrossRoomLinkType.TWO_ROOM.value, roomId, j).compose(C100839PnV.LIZJ()).subscribe(new C78781H3v(j, c78779H3t, roomId, currentTimeMillis), new C78782H3w<>(j, c78779H3t, roomId, currentTimeMillis));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
