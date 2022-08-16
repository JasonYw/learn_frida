package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.live.ILiveRoomService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class LinkRoomFightWidget$selfRoomId$2 extends Lambda implements Function0<Long> {
    public static final LinkRoomFightWidget$selfRoomId$2 INSTANCE = new LinkRoomFightWidget$selfRoomId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(27624);
    }

    public LinkRoomFightWidget$selfRoomId$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        long roomId;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            roomId = ((Long) proxy.result).longValue();
        } else {
            IService service = ServiceManager.getService(IRoomService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            Room currentRoom = ((ILiveRoomService) service).getCurrentRoom();
            Intrinsics.checkNotNull(currentRoom);
            Intrinsics.checkNotNullExpressionValue(currentRoom, "");
            roomId = currentRoom.getRoomId();
        }
        return Long.valueOf(roomId);
    }
}
